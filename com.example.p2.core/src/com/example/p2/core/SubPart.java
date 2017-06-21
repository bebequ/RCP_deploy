package com.example.p2.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.List;

public class SubPart {
	private Table table;

	public SubPart() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(4, false));
		
		Button btnRadioButton = new Button(parent, SWT.RADIO);
		btnRadioButton.setText("Radio Button");
		
		Button btnCheckButton = new Button(parent, SWT.CHECK);
		btnCheckButton.setText("Check Button");
		
		Spinner spinner = new Spinner(parent, SWT.BORDER);
		
		DateTime dateTime = new DateTime(parent, SWT.BORDER);
		
		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("New Column");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("New Column");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText("New TableItem");
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText("New TableItem");
		
		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText("New TableItem");
		
		Tree tree = new Tree(parent, SWT.BORDER);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TreeColumn trclmnNewColumn = new TreeColumn(tree, SWT.NONE);
		trclmnNewColumn.setWidth(100);
		trclmnNewColumn.setText("New Column");
		
		TreeColumn trclmnNewColumn_1 = new TreeColumn(tree, SWT.NONE);
		trclmnNewColumn_1.setWidth(100);
		trclmnNewColumn_1.setText("New Column");
		
		List list = new List(parent, SWT.BORDER);
		new Label(parent, SWT.NONE);
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO	Set the focus to control
	}

}
