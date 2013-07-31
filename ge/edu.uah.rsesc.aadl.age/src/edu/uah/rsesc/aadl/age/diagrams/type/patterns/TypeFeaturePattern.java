package edu.uah.rsesc.aadl.age.diagrams.type.patterns;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.osate.aadl2.Feature;
import edu.uah.rsesc.aadl.age.diagrams.common.AadlElementWrapper;
import edu.uah.rsesc.aadl.age.diagrams.common.patterns.AgePattern;
import edu.uah.rsesc.aadl.age.diagrams.common.util.AnchorUtil;
import edu.uah.rsesc.aadl.age.diagrams.common.util.GraphicsAlgorithmCreator;
import edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyUtil;

/**
 * Pattern for controlling Feature shapes
 * Note: Child shapes are recreated during updates so they should not be referenced.
 * @author philip.alldredge
 */
public class TypeFeaturePattern extends AgePattern {
	private static final String featureShapeName = "feature";	
	public static final String connectorAnchorName = "connector";
	public static final String sourceAnchorName = "source";
	public static final String sinkAnchorName = "sink";
	
	@Override
	public boolean isMainBusinessObjectApplicable(final Object mainBusinessObject) {
		return AadlElementWrapper.unwrap(mainBusinessObject) instanceof Feature;
	}
	
	@Override
	public boolean canAdd(final IAddContext context) {
		if(isMainBusinessObjectApplicable(context.getNewObject())) {
			if(context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean canResizeShape(final IResizeShapeContext ctx) {
		return false;
	}

	@Override
	protected void createGaAndInnerShapes(final ContainerShape container, final Object bo, int x, int y) {
		final Feature feature = (Feature)bo;
		final IGaService gaService = Graphiti.getGaService();
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		
		// Determine the label text
        final String labelTxt = getLabelText(feature);
        
		// Create label
        final Shape labelShape = peCreateService.createShape(container, false);
        final Text label = GraphicsAlgorithmCreator.createLabelGraphicsAlgorithm(labelShape, getDiagram(), labelTxt);
        
        // Set the size        
        final IDimension labelSize = GraphitiUi.getUiLayoutService().calculateTextSize(labelTxt, label.getStyle().getFont());
		gaService.setLocationAndSize(label, 0, 0, labelSize.getWidth(), labelSize.getHeight());
		
		// Create symbol
        final Shape featureShape = peCreateService.createShape(container, false);
        PropertyUtil.setName(featureShape, featureShapeName);
        final GraphicsAlgorithm featureGa = GraphicsAlgorithmCreator.createGraphicsAlgorithm(featureShape, getDiagram(), feature);
        gaService.setLocation(featureGa, 0, labelSize.getHeight());
                
		// Set the graphics algorithm for the container to an invisible rectangle to set the bounds				
        final GraphicsAlgorithm ga = gaService.createPlainRectangle(container);
        ga.setTransparency(1.0);

        // Set size as appropriate
        gaService.setLocationAndSize(ga, x, y, Math.max(getWidth(label), getWidth(featureShape.getGraphicsAlgorithm())), 
        		Math.max(getHeight(label), getHeight(featureShape.getGraphicsAlgorithm())));
	}
	
	@Override
	protected void updateAnchors(final ContainerShape container) {
		super.updateAnchors(container);

		final GraphicsAlgorithm featureGa = getFeatureShape(container).getGraphicsAlgorithm();
		final int connectorX = featureGa.getX() + (featureGa.getWidth() / 2);
		final int connectorY = featureGa.getY() + (featureGa.getHeight() / 2);
		
		// Create anchors
		// Connector
		// TODO: Determine position of anchors based on position of feature in the diagram/parent
		AnchorUtil.createOrUpdateFixPointAnchor(container, connectorAnchorName, connectorX, connectorY); 
		AnchorUtil.createOrUpdateFixPointAnchor(container, sourceAnchorName, connectorX - 50, connectorY);
		AnchorUtil.createOrUpdateFixPointAnchor(container, sinkAnchorName, connectorX + 50, connectorY);
	}

	public Shape getFeatureShape(final ContainerShape container) {
		return getChildShapeByName(container, featureShapeName);
	}
	
	private Shape getChildShapeByName(final ContainerShape container, final String name) {
		for(final Shape shape : container.getChildren()) {
			if(name.equals(PropertyUtil.getName(shape))) {
				return shape;
			}
		}
		
		return null;
	}
	
	private int getWidth(final GraphicsAlgorithm ga) {
		return ga.getX() + ga.getWidth();
	}
	
	private int getHeight(final GraphicsAlgorithm ga) {
		return ga.getY() + ga.getHeight();
	}
	
	public final String getLabelText(final Feature feature) {
		return feature.getName();
	}
		
	@Override
	public IReason updateNeeded(final IUpdateContext context) {
		return Reason.createFalseReason();
	}
}
