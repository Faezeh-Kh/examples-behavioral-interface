/**
 */
package org.tetrabox.examples.petrinet.model.petrinet.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tetrabox.examples.petrinet.model.petrinet.PetriNet;
import org.tetrabox.examples.petrinet.model.petrinet.PetrinetFactory;
import org.tetrabox.examples.petrinet.model.petrinet.PetrinetPackage;

/**
 * This is the item provider adapter for a {@link org.tetrabox.examples.petrinet.model.petrinet.PetriNet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PetrinetPackage.Literals.PETRI_NET__PLACES);
			childrenFeatures.add(PetrinetPackage.Literals.PETRI_NET__TRANSITIONS);
			childrenFeatures.add(PetrinetPackage.Literals.PETRI_NET__EDGES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PetriNet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PetriNet"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PetriNet) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_PetriNet_type")
				: getString("_UI_PetriNet_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PetriNet.class)) {
		case PetrinetPackage.PETRI_NET__PLACES:
		case PetrinetPackage.PETRI_NET__TRANSITIONS:
		case PetrinetPackage.PETRI_NET__EDGES:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(PetrinetPackage.Literals.PETRI_NET__PLACES,
				PetrinetFactory.eINSTANCE.createPlace()));

		newChildDescriptors.add(createChildParameter(PetrinetPackage.Literals.PETRI_NET__TRANSITIONS,
				PetrinetFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add(createChildParameter(PetrinetPackage.Literals.PETRI_NET__EDGES,
				PetrinetFactory.eINSTANCE.createInputEdge()));

		newChildDescriptors.add(createChildParameter(PetrinetPackage.Literals.PETRI_NET__EDGES,
				PetrinetFactory.eINSTANCE.createOutputEdge()));

		newChildDescriptors.add(createChildParameter(PetrinetPackage.Literals.PETRI_NET__EDGES,
				PetrinetFactory.eINSTANCE.createInhibitorEdge()));

		newChildDescriptors.add(createChildParameter(PetrinetPackage.Literals.PETRI_NET__EDGES,
				PetrinetFactory.eINSTANCE.createReadEdge()));
	}

}
