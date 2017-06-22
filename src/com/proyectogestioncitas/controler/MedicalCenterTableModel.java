package com.proyectogestioncitas.controler;

import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

import com.proyectogestioncitas.model.dao.MedicalCenterDAO;
import com.proyectogestioncitas.model.pojo.MedicalCenter;

@SuppressWarnings("serial")
public class MedicalCenterTableModel extends AbstractTableModel implements TableModelListener, ListSelectionListener{

	//new MedicalCenter(centerId, location, centerName, postalCode, phoneNumber)
	private static String columnNames[] = {
			"Center ID",
			"Location",
			"Center name",
			"Postal code",
			"Phone number"
	};
	
	@SuppressWarnings("static-access")
	private static Object[][] tableData = new MedicalCenterTableModel().addCentersToTableData(new MedicalCenterDAO());

	public MedicalCenterTableModel() {
		addTableModelListener(this);
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return tableData.length;
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}



	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		tableData[rowIndex][columnIndex] = aValue;
		fireTableCellUpdated(rowIndex, columnIndex);
	}



	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return tableData[rowIndex][columnIndex];
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	
	public static Object[][] addCentersToTableData(MedicalCenterDAO centerDAO){
			
		List<MedicalCenter> centerList = centerDAO.getAllMedicalCenters();
		
		int rows = centerList.size();
		int columns = columnNames.length;
		
		Object dataTable[][] = new Object[rows][columns];
		
		for(int i = 0; i < rows ; i++){
			MedicalCenter center = centerList.get(i);
			dataTable[i] = new Object[]{center.getCenterId(), center.getLocation(), center.getCenterName(),
					center.getPostalCode(), center.getPhoneNumber()};
		}
		
		return dataTable; 
	}		

}
