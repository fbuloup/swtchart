/*******************************************************************************
 * Copyright (c) 2017, 2019 Lablicate GmbH.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Dr. Philip Wenig - initial API and implementation
 * Frank Buloup - Internationalization
 *******************************************************************************/
package org.eclipse.swtchart.extensions.menu;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtchart.extensions.SWTChartExtensionsMessages;
import org.eclipse.swtchart.extensions.core.ScrollableChart;

public class UndoSelectionHandler extends AbstractChartMenuEntry implements IChartMenuEntry {

	@Override
	public String getCategory() {

		return IChartMenuCategories.RANGE_SELECTION;
	}

	@Override
	public String getName() {

		return SWTChartExtensionsMessages.get(SWTChartExtensionsMessages.UNDO_SELECTION_KEY);
	}

	@Override
	public void execute(Shell shell, ScrollableChart scrollableChart) {

		scrollableChart.getBaseChart().undoSelection();
		scrollableChart.redraw();
	}
}
