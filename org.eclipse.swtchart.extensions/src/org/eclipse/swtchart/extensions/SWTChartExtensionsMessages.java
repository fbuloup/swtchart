/*******************************************************************************
Copyright (c) 2020 SWTChart project.

This program and the accompanying materials are made
available under the terms of the Eclipse Public License 2.0
which is available at https://www.eclipse.org/legal/epl-2.0/

SPDX-License-Identifier: EPL-2.0

Contributors:
Frank Buloup - initial API and implementation
*******************************************************************************/

package org.eclipse.swtchart.extensions;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class handle messages internationalization in SWT Chart Extensions
 */
public final class SWTChartExtensionsMessages {
	
	// Bundle canonical path to properties files
	private static final String BUNDLE_NAME = "org.eclipse.swtchart.extensions.SWTChartExtensionsMessages"; //$NON-NLS-1$
	// Bundle resource instance pointing to proper properties file
	private static final ResourceBundle messages;
	
	// A list of available message keys
	public static String RESET_CHART_LABEL_KEY = "RESET_CHART_LABEL"; //$NON-NLS-1$
	public static String EXPORT_CHART_SELECTION_KEY = "EXPORT_CHART_SELECTION"; //$NON-NLS-1$
	
	public static String TOGGLE_VISIBILITY_KEY = "TOGGLE_VISIBILITY"; //$NON-NLS-1$
	public static String RANGE_SELECTION_KEY = "RANGE_SELECTION"; //$NON-NLS-1$
	public static String REDO_SELECTION_KEY = "REDO_SELECTION"; //$NON-NLS-1$
	public static String UNDO_SELECTION_KEY = "UNDO_SELECTION"; //$NON-NLS-1$
	public static String RESET_SELECTED_SERIES_KEY = "RESET_SELECTED_SERIES"; //$NON-NLS-1$
	public static String AXIS_ZERO_MARKER_KEY = "AXIS_ZERO_MARKER"; //$NON-NLS-1$
	public static String SHOW_TOOLTIPS_KEY = "SHOW_TOOLTIPS"; //$NON-NLS-1$
	public static String LEGEND_MARKER_KEY = "LEGEND_MARKER"; //$NON-NLS-1$
	public static String PLOT_CENTER_MARKER_KEY = "PLOT_CENTER_MARKER"; //$NON-NLS-1$
	public static String POSITION_MARKER_KEY = "POSITION_MARKER"; //$NON-NLS-1$
	public static String RANGE_SELECTOR_KEY = "RANGE_SELECTOR"; //$NON-NLS-1$
	public static String SERIES_LABEL_MARKER_KEY = "SERIES_LABEL_MARKER"; //$NON-NLS-1$
	public static String SERIES_LEGEND_KEY = "SERIES_LEGEND"; //$NON-NLS-1$
	public static String THE_SCAN_DELAY_MUST_BE_GE_0_KEY = "THE_SCAN_DELAY_MUST_BE_GE_0"; //$NON-NLS-1$
	public static String THE_SCAN_DELAY_MUST_BE_G_0_KEY = "THE_SCAN_DELAY_MUST_BE_G_0"; //$NON-NLS-1$
	
	public static String SET_CURRENT_SELECTION_KEY = "SET_CURRENT_SELECTION"; //$NON-NLS-1$
	public static String RESET_KEY = "RESET"; //$NON-NLS-1$
	public static String RESET_RANGE_KEY = "RESET_RANGE"; //$NON-NLS-1$
	public static String HIDE_KEY = "HIDE"; //$NON-NLS-1$
	public static String HIDE_RANGE_SELECTOR_KEY = "HIDE_RANGE_SELECTOR"; //$NON-NLS-1$
	public static String SET_KEY = "SET"; //$NON-NLS-1$
	
	public static String X_AXIS_KEY = "X_AXIS"; //$NON-NLS-1$
	public static String Y_AXIS_KEY = "Y_AXIS"; //$NON-NLS-1$
	public static String NONE_KEY = "NONE"; //$NON-NLS-1$
	public static String NOT_SET_KEY = "NOT_SET"; //$NON-NLS-1$
	public static String LENGTH_OF_X_AND_Y_SERIES_DIFFERS_KEY = "LENGTH_OF_X_AND_Y_SERIES_DIFFERS"; //$NON-NLS-1$
	public static String DOUBLE_CLICK_TO_SHOW_RANGE_INFO_KEY = "DOUBLE_CLICK_TO_SHOW_RANGE_INFO"; //$NON-NLS-1$
	public static String LABEL_NOT_SET_KEY = "LABEL_NOT_SET"; //$NON-NLS-1$
	public static String CHART_TITLE_KEY = "CHART_TITLE"; //$NON-NLS-1$
	
	static {
		// Default locale is the OS currently used locale 
		// If ResourceBundle does not find any properties file with default locale
		// it will returns default property file, which corresponds to English language
		messages = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault());
	}
	
	// Just to prevent instantiation
	private SWTChartExtensionsMessages() {

	}
	
	/**
	 * 
	 * Use this method to get a locale version of a message
	 * 
	 * @param messageKey a message key among the available list
	 * @return String message related to the key, null if not a valid key 
	 */
	public static String get(String messageKey) {
		return messages.getString(messageKey);
	}
	
	
}
