/*
 * generated by Xtext
 */
package org.osate.xtext.aadl2.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.osate.xtext.aadl2.ui.outline.Aadl2OutlinePage;

/**
 * Use this class to register components to be used within the IDE.
 */
public class Aadl2UiModule extends org.osate.xtext.aadl2.ui.AbstractAadl2UiModule {
	public Aadl2UiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	@Override
	public Class<? extends IContentOutlinePage> bindIContentOutlinePage() {
	return Aadl2OutlinePage.class;
	}
}
