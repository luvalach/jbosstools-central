/*************************************************************************************
 * Copyright (c) 2008-2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.jboss.tools.maven.project.examples;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.jboss.tools.maven.project.examples.messages"; //$NON-NLS-1$
	public static String ArchetypeExamplesWizardFirstPage_Existing_Project;
	public static String ArchetypeExamplesWizardFirstPage_No_TargetRuntime;
	public static String ArchetypeExamplesWizardFirstPage_Package_Label;
	public static String ArchetypeExamplesWizardFirstPage_ProjectName_Cant_Be_Empty;
	public static String ArchetypeExamplesWizardFirstPage_ProjectName_Label;
	public static String ArchetypeExamplesWizardFirstPage_Target_Runtime_Label;
	public static String ArchetypeExamplesWizardFirstPage_Title;
	public static String ArchetypeExamplesWizardFirstPage_Unresolved_Enterprise_Repo;
	public static String ArchetypeExamplesWizardFirstPage_Unresolved_WFK_Repo;
	public static String ArchetypeExamplesWizardFirstPage_Unresolved_Essential_Dependency;
	public static String ArchetypeExamplesWizardFirstPage_Error_Package;
	public static String MavenProjectExamplesActivator_Downloading_Examples_Wizards_Metadata;
	public static String MavenProjectExamplesActivator_Error_Retrieving_Stacks_MetaData;
	public static String NewProjectExamplesStacksRequirementsPage_Check_Maven_Repo_Job;
	public static String NewProjectExamplesStacksRequirementsPage_Checking_Enterprise_Maven_Repo_Availability;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
