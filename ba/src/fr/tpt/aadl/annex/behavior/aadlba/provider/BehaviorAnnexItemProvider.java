/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the Eclipse Public License as published by Eclipse, either
 * version 1.0 of the License, or (at your option) any later version. This
 * program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse Public License for
 * more details. You should have received a copy of the Eclipse Public License
 * along with this program. If not, see
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
package fr.tpt.aadl.annex.behavior.aadlba.provider;


import fr.tpt.aadl.annex.behavior.aadlba.AadlBaFactory;
import fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage;
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorAnnex;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.osate.aadl2.provider.AnnexSubclauseItemProvider;

/**
 * This is the item provider adapter for a {@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorAnnex} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorAnnexItemProvider
  extends AnnexSubclauseItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorAnnexItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

    }
    return itemPropertyDescriptors;
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(AadlBaPackage.Literals.BEHAVIOR_ANNEX__VARIABLES);
      childrenFeatures.add(AadlBaPackage.Literals.BEHAVIOR_ANNEX__STATES);
      childrenFeatures.add(AadlBaPackage.Literals.BEHAVIOR_ANNEX__TRANSITIONS);
      childrenFeatures.add(AadlBaPackage.Literals.BEHAVIOR_ANNEX__ACTIONS);
      childrenFeatures.add(AadlBaPackage.Literals.BEHAVIOR_ANNEX__CONDITIONS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns BehaviorAnnex.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/BehaviorAnnex"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((BehaviorAnnex)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_BehaviorAnnex_type") :
      getString("_UI_BehaviorAnnex_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(BehaviorAnnex.class))
    {
      case AadlBaPackage.BEHAVIOR_ANNEX__VARIABLES:
      case AadlBaPackage.BEHAVIOR_ANNEX__STATES:
      case AadlBaPackage.BEHAVIOR_ANNEX__TRANSITIONS:
      case AadlBaPackage.BEHAVIOR_ANNEX__ACTIONS:
      case AadlBaPackage.BEHAVIOR_ANNEX__CONDITIONS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.BEHAVIOR_ANNEX__VARIABLES,
         AadlBaFactory.eINSTANCE.createBehaviorVariable()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.BEHAVIOR_ANNEX__STATES,
         AadlBaFactory.eINSTANCE.createBehaviorState()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.BEHAVIOR_ANNEX__TRANSITIONS,
         AadlBaFactory.eINSTANCE.createBehaviorTransition()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.BEHAVIOR_ANNEX__ACTIONS,
         AadlBaFactory.eINSTANCE.createBehaviorActionBlock()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.BEHAVIOR_ANNEX__CONDITIONS,
         AadlBaFactory.eINSTANCE.createValueExpression()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.BEHAVIOR_ANNEX__CONDITIONS,
         AadlBaFactory.eINSTANCE.createAny()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.BEHAVIOR_ANNEX__CONDITIONS,
         AadlBaFactory.eINSTANCE.createDispatchCondition()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.BEHAVIOR_ANNEX__CONDITIONS,
         AadlBaFactory.eINSTANCE.createExecutionTimeoutCatch()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.BEHAVIOR_ANNEX__CONDITIONS,
         AadlBaFactory.eINSTANCE.createOtherwise()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return AadlbaEditPlugin.INSTANCE;
  }

}
