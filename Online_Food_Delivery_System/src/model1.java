import javax.swing.table.DefaultTableModel;
 
class model1 extends DefaultTableModel  {
        public model1(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }
       @Override
       public boolean isCellEditable(int rowIndex, int columnIndex){
       return columnIndex == 0||columnIndex==2; //Or whatever column index you want to be editable
      }
    };
