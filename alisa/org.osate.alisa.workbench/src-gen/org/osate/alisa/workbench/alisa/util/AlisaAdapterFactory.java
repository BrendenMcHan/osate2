/**
 */
package org.osate.alisa.workbench.alisa.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.alisa.workbench.alisa.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.alisa.workbench.alisa.AlisaPackage
 * @generated
 */
public class AlisaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlisaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlisaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AlisaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlisaSwitch<Adapter> modelSwitch =
    new AlisaSwitch<Adapter>()
    {
      @Override
      public Adapter caseAlisaWorkArea(AlisaWorkArea object)
      {
        return createAlisaWorkAreaAdapter();
      }
      @Override
      public Adapter caseAssurancePlan(AssurancePlan object)
      {
        return createAssurancePlanAdapter();
      }
      @Override
      public Adapter caseAssuranceTask(AssuranceTask object)
      {
        return createAssuranceTaskAdapter();
      }
      @Override
      public Adapter caseSelectionConditionExpr(SelectionConditionExpr object)
      {
        return createSelectionConditionExprAdapter();
      }
      @Override
      public Adapter caseSelectionCategoryReference(SelectionCategoryReference object)
      {
        return createSelectionCategoryReferenceAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseDescriptionElement(DescriptionElement object)
      {
        return createDescriptionElementAdapter();
      }
      @Override
      public Adapter caseAndSelectionConditionExpr(AndSelectionConditionExpr object)
      {
        return createAndSelectionConditionExprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.osate.alisa.workbench.alisa.AlisaWorkArea <em>Work Area</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.alisa.workbench.alisa.AlisaWorkArea
   * @generated
   */
  public Adapter createAlisaWorkAreaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.alisa.workbench.alisa.AssurancePlan <em>Assurance Plan</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan
   * @generated
   */
  public Adapter createAssurancePlanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.alisa.workbench.alisa.AssuranceTask <em>Assurance Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.alisa.workbench.alisa.AssuranceTask
   * @generated
   */
  public Adapter createAssuranceTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.alisa.workbench.alisa.SelectionConditionExpr <em>Selection Condition Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.alisa.workbench.alisa.SelectionConditionExpr
   * @generated
   */
  public Adapter createSelectionConditionExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.alisa.workbench.alisa.SelectionCategoryReference <em>Selection Category Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.alisa.workbench.alisa.SelectionCategoryReference
   * @generated
   */
  public Adapter createSelectionCategoryReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.alisa.workbench.alisa.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.alisa.workbench.alisa.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.alisa.workbench.alisa.DescriptionElement <em>Description Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.alisa.workbench.alisa.DescriptionElement
   * @generated
   */
  public Adapter createDescriptionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.alisa.workbench.alisa.AndSelectionConditionExpr <em>And Selection Condition Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.alisa.workbench.alisa.AndSelectionConditionExpr
   * @generated
   */
  public Adapter createAndSelectionConditionExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AlisaAdapterFactory
