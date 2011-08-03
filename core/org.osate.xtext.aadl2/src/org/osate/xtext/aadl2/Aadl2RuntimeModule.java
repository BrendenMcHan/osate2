/*
 * generated by Xtext
 */
package org.osate.xtext.aadl2;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.osate.xtext.aadl2.valueconversion.Aadl2ValueConverter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class Aadl2RuntimeModule extends org.osate.xtext.aadl2.AbstractAadl2RuntimeModule {
	@Override
	public Class<? extends org.eclipse.xtext.linking.ILinkingService> bindILinkingService() {
		return org.osate.xtext.aadl2.linking.Aadl2LinkingService.class;
	}
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
	  return Aadl2ValueConverter.class;
	}
	@Override
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.osate.xtext.aadl2.naming.Aadl2QualifiedNameProvider.class;
	}


	
	//	@Override
//	public Class<? extends org.eclipse.xtext.resource.IFragmentProvider> bindIFragmentProvider() {
//		return org.osate.xtext.aadl2.util.Aadl2QualifiedNameFragmentProvider.class;
//	}

}
