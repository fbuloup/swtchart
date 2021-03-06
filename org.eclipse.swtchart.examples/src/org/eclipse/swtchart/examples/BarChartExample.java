/*******************************************************************************
 * Copyright (c) 2008, 2019 SWTChart project.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * yoshitaka - initial API and implementation
 *******************************************************************************/
package org.eclipse.swtchart.examples;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtchart.Chart;
import org.eclipse.swtchart.IBarSeries;
import org.eclipse.swtchart.ISeries.SeriesType;

/**
 * An example for bar chart.
 */
public class BarChartExample {

	private static final double[] ySeries = {0.2, 1.1, 1.9, 2.3, 1.8, 1.5, 1.8, 2.6, 2.9, 3.2};

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Bar Chart");
		shell.setSize(500, 400);
		shell.setLayout(new FillLayout());
		createChart(shell);
		shell.open();
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	/**
	 * create the chart.
	 * 
	 * @param parent
	 *            The parent composite
	 * @return The created chart
	 */
	static public Chart createChart(Composite parent) {

		// create a chart
		Chart chart = new Chart(parent, SWT.NONE);
		// set titles
		chart.getTitle().setText("Bar Chart");
		chart.getAxisSet().getXAxis(0).getTitle().setText("Data Points");
		chart.getAxisSet().getYAxis(0).getTitle().setText("Amplitude");
		// create bar series
		IBarSeries barSeries = (IBarSeries)chart.getSeriesSet().createSeries(SeriesType.BAR, "bar series");
		barSeries.setYSeries(ySeries);
		// adjust the axis range
		chart.getAxisSet().adjustRange();
		return chart;
	}
}