package org.osate.ge.fx.palette;

import java.util.ArrayList;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * Represents a single group in the palette.
 *
 */
class PaletteGroup<G, I> extends Region {
	private BooleanProperty expanded = new SimpleBooleanProperty(false);

	public final ArrayList<Button> buttonList = new ArrayList<Button>();

	public PaletteGroup(final PaletteModel<G, I> model, final G groupModel) {
		// TODO: Populate contents based in a manner similar to what is currently in Palette

		VBox buttonBox = new VBox();

		Button groupButton = new Button(model.getGroupLabel(groupModel));
		buttonList.add(groupButton);
		groupButton.setGraphic(new ImageView(model.getGroupIcon(groupModel)));
		groupButton.setOnAction(e -> {

			if (getExpanded() == true) {
				setExpanded(false);
			} else {
				setExpanded(true);
			}

			/*
			 * This loop should close all other groups when a new group is opened.
			 * for (G group : model.getGroups()) {
			 * 
			 * }
			 */

		});

		buttonBox.getChildren().add(groupButton);

		ScrollPane scrollPane = new ScrollPane();

		VBox itemBox = new VBox();

		for (I itemModel : model.getItems(groupModel)) {

			PaletteItem<I> paletteItem = new PaletteItem<>(model, itemModel);
			itemBox.getChildren().add(paletteItem);

			}
			scrollPane.setContent(itemBox);
			buttonBox.getChildren().add(scrollPane);
			scrollPane.setManaged(false);
			scrollPane.setVisible(false);
			scrollPane.managedProperty().bind(expandedProperty());
			scrollPane.visibleProperty().bind(expandedProperty());
			this.getChildren().add(buttonBox);

		}

	// The palette group has a property which indicates whether it is be expanded.
	public boolean getExpanded() {
		return expanded.get();
	}

	public void setExpanded(final boolean value) {
		expanded.set(value);
	}

	public BooleanProperty expandedProperty() {
		return expanded;
	}
}
