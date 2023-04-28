import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class SummaryJDialog extends javax.swing.JDialog {


  String date;
  String clock;
  int x=0;
    public SummaryJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        SummaryScrenTitle_jLabel = new javax.swing.JLabel();
        delivery_jPanel = new javax.swing.JPanel();
        deliveryAd_jLabel = new javax.swing.JLabel();
        deliveryAd_jScrollPane = new javax.swing.JScrollPane();
        deliveryAd_jTextArea = new javax.swing.JTextArea();
        deliveryTime_jLabel = new javax.swing.JLabel();
        date_jLabel = new javax.swing.JLabel();
        date_jXDatePicker = new org.jdesktop.swingx.JXDatePicker();
        clock_jLabel = new javax.swing.JLabel();
        clock_jComboBox = new javax.swing.JComboBox();
        AdConfirm_jButton = new javax.swing.JButton();
        changAd_jButton = new javax.swing.JButton();
        yourOrder_jPanel = new javax.swing.JPanel();
        yourOrder_jLabel = new javax.swing.JLabel();
        OrderEdit_jButton = new javax.swing.JButton();
        total_jLabel = new javax.swing.JLabel();
        total_jTextField = new javax.swing.JTextField();
        yourOrder_jScrollPane = new javax.swing.JScrollPane();
        yourOrder_jTable = new javax.swing.JTable();
        orderConfirm_jButton1 = new javax.swing.JButton();
        leaveMessage_jPanel = new javax.swing.JPanel();
        leaveMessage_jLabel = new javax.swing.JLabel();
        leaveMessage_jScrollPane = new javax.swing.JScrollPane();
        leaveMessage_jTextArea = new javax.swing.JTextArea();
        PayBill_jButton = new javax.swing.JButton();
        deleteBill_jButton = new javax.swing.JButton();
        summaryBack_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Summary Screen");

        SummaryScrenTitle_jLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        SummaryScrenTitle_jLabel.setForeground(new java.awt.Color(255, 0, 0));
        SummaryScrenTitle_jLabel.setText("Summary Screen");

        delivery_jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deliveryAd_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deliveryAd_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        deliveryAd_jLabel.setText("Delivery Address:");
        if(MainWindow.orderTypeChoose.equals("pickup")){
            deliveryAd_jLabel.setText("Pickup Address:");
        }

        if(MainWindow.orderTypeChoose.equals("delivery")){
            deliveryAd_jTextArea.setText(CurrentCustomer.Address+"\n"+
                CurrentCustomer.City+"\n"+"Zip Code: "+CurrentCustomer.Zipcode+"\n"
                +"Tel: "+CurrentCustomer.Telephone+"  "+CurrentCustomer.UserName);}
        else if(MainWindow.orderTypeChoose.equals("pickup")){
            deliveryAd_jTextArea.setText("Restaurant Location:\n"+"Sri Krishna Cafe"
                +"\n"+"Dwaraka Nagar"+"     Banashankari 3rd Stage, Bangalore-560085\n"
                +"Tel: 9889988998"+"\n\n\n");}
        deliveryAd_jTextArea.setEditable(false);
        deliveryAd_jTextArea.setBackground(new java.awt.Color(0, 153, 153));
        deliveryAd_jTextArea.setColumns(20);
        deliveryAd_jTextArea.setForeground(new java.awt.Color(255, 255, 255));
        deliveryAd_jTextArea.setRows(5);
        deliveryAd_jScrollPane.setViewportView(deliveryAd_jTextArea);

        deliveryTime_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        deliveryTime_jLabel.setText("Delivery Time:");
        if(MainWindow.orderTypeChoose.equals("pickup")){
            deliveryTime_jLabel.setText("Pickup Time:");
        }

        date_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        date_jLabel.setText("Date:");

        Date date = new Date();
        date_jXDatePicker.setDate(date);
        date_jXDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_jXDatePickerActionPerformed(evt);
            }
        });

        clock_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        clock_jLabel.setText("Clock:");

        clock_jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " 9 am", "10 am", "11 am", "12 am", " 1 pm", " 2 pm", " 3 pm", " 4 pm", " 5 pm", " 6 pm", " 7 pm", " 8 pm", " 9 pm", "10 pm" }));

        AdConfirm_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        AdConfirm_jButton.setForeground(new java.awt.Color(255, 0, 0));
        AdConfirm_jButton.setText("Confirm");
        AdConfirm_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdConfirm_jButtonActionPerformed(evt);
            }
        });

        changAd_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        changAd_jButton.setForeground(new java.awt.Color(255, 0, 0));
        changAd_jButton.setText("Change Address");
        changAd_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changAd_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delivery_jPanelLayout = new javax.swing.GroupLayout(delivery_jPanel);
        delivery_jPanel.setLayout(delivery_jPanelLayout);
        delivery_jPanelLayout.setHorizontalGroup(
            delivery_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delivery_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(delivery_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deliveryAd_jScrollPane)
                    .addGroup(delivery_jPanelLayout.createSequentialGroup()
                        .addGroup(delivery_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deliveryAd_jLabel)
                            .addComponent(deliveryTime_jLabel)
                            .addGroup(delivery_jPanelLayout.createSequentialGroup()
                                .addComponent(date_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_jXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clock_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clock_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delivery_jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(changAd_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdConfirm_jButton)))
                .addContainerGap())
        );
        delivery_jPanelLayout.setVerticalGroup(
            delivery_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delivery_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deliveryAd_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deliveryAd_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deliveryTime_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(delivery_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_jLabel)
                    .addComponent(date_jXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clock_jLabel)
                    .addComponent(clock_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(delivery_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdConfirm_jButton)
                    .addComponent(changAd_jButton))
                .addContainerGap())
        );

        yourOrder_jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        yourOrder_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        yourOrder_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        yourOrder_jLabel.setText("Your Order:");

        OrderEdit_jButton.setFont(new java.awt.Font("Tahoma", 1, 11));  
        OrderEdit_jButton.setForeground(new java.awt.Color(255, 0, 0));
        OrderEdit_jButton.setText("Edit Order");
        OrderEdit_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderEdit_jButtonActionPerformed(evt);
            }
        });

        total_jLabel.setForeground(new java.awt.Color(0, 51, 255));
        total_jLabel.setText("Total :");

        total_jTextField.setEditable(false);
        total_jTextField.setText("   ₹"+CurrentCustomer.calculateTotal(CurrentCustomer.orderList));
        total_jTextField.setBackground(new java.awt.Color(0, 135, 135));
        total_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        total_jTextField.setForeground(new java.awt.Color(255, 255, 255));
        total_jTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        total_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_jTextFieldActionPerformed(evt);
            }
        });

        yourOrder_jTable.setBackground(new java.awt.Color(0, 135, 135));
        yourOrder_jTable.setForeground(new java.awt.Color(255, 255, 255));
        yourOrder_jTable.setModel(new model1(
            CurrentCustomer.readOrder(CurrentCustomer.orderList),
            new String [] {
                "Course","Unit Price","Quantity","Price"
            }
        ));
        yourOrder_jTable.getColumnModel().getColumn(0).setPreferredWidth(190);
        yourOrder_jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        yourOrder_jTable.setEnabled(false);
        yourOrder_jTable.setGridColor(new java.awt.Color(0, 0, 0));
        yourOrder_jTable.setPreferredSize(new java.awt.Dimension(390, 104));
        yourOrder_jTable.setPreferredScrollableViewportSize(yourOrder_jTable.getPreferredSize());
        yourOrder_jScrollPane.setViewportView(yourOrder_jTable);

        orderConfirm_jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        orderConfirm_jButton1.setForeground(new java.awt.Color(255, 0, 0));
        orderConfirm_jButton1.setText("Confirm");
        orderConfirm_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderConfirm_jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout yourOrder_jPanelLayout = new javax.swing.GroupLayout(yourOrder_jPanel);
        yourOrder_jPanel.setLayout(yourOrder_jPanelLayout);
        yourOrder_jPanelLayout.setHorizontalGroup(
            yourOrder_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yourOrder_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(yourOrder_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yourOrder_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(yourOrder_jPanelLayout.createSequentialGroup()
                        .addGap(0, 136, Short.MAX_VALUE)
                        .addComponent(OrderEdit_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderConfirm_jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(yourOrder_jPanelLayout.createSequentialGroup()
                        .addComponent(yourOrder_jLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        yourOrder_jPanelLayout.setVerticalGroup(
            yourOrder_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yourOrder_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yourOrder_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yourOrder_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(yourOrder_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderEdit_jButton)
                    .addComponent(total_jLabel)
                    .addComponent(total_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderConfirm_jButton1))
                .addContainerGap())
        );

        leaveMessage_jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        leaveMessage_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        leaveMessage_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        leaveMessage_jLabel.setText("Leave a Message:");

        leaveMessage_jTextArea.setBackground(new java.awt.Color(0, 153, 153));
        leaveMessage_jTextArea.setColumns(20);
        leaveMessage_jTextArea.setForeground(new java.awt.Color(255, 255, 255));
        leaveMessage_jTextArea.setRows(5);
        leaveMessage_jTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        leaveMessage_jScrollPane.setViewportView(leaveMessage_jTextArea);

        javax.swing.GroupLayout leaveMessage_jPanelLayout = new javax.swing.GroupLayout(leaveMessage_jPanel);
        leaveMessage_jPanel.setLayout(leaveMessage_jPanelLayout);
        leaveMessage_jPanelLayout.setHorizontalGroup(
            leaveMessage_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaveMessage_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leaveMessage_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leaveMessage_jPanelLayout.createSequentialGroup()
                        .addComponent(leaveMessage_jLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(leaveMessage_jScrollPane))
                .addContainerGap())
        );
        leaveMessage_jPanelLayout.setVerticalGroup(
            leaveMessage_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaveMessage_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(leaveMessage_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leaveMessage_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PayBill_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        PayBill_jButton.setForeground(new java.awt.Color(255, 0, 0));
        PayBill_jButton.setText("Pay Bill");
        PayBill_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayBill_jButtonActionPerformed(evt);
            }
        });

        deleteBill_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        deleteBill_jButton.setForeground(new java.awt.Color(255, 0, 0));
        deleteBill_jButton.setText("Delete  Bill");
        deleteBill_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBill_jButtonActionPerformed(evt);
            }
        });

        summaryBack_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        summaryBack_jButton.setForeground(new java.awt.Color(255, 0, 0));
        summaryBack_jButton.setText("Back");
        summaryBack_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryBack_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leaveMessage_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(summaryBack_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBill_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PayBill_jButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(delivery_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yourOrder_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(SummaryScrenTitle_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SummaryScrenTitle_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delivery_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yourOrder_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(leaveMessage_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PayBill_jButton)
                    .addComponent(deleteBill_jButton)
                    .addComponent(summaryBack_jButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delivery_jPanel, yourOrder_jPanel});

        pack();
    }

    private void date_jXDatePickerActionPerformed(java.awt.event.ActionEvent evt) {
      date =  date_jXDatePicker.getDate().toString();
      date = date.substring(0, 11)+date.substring(24);
    }

    private void total_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void changAd_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        deliveryAd_jTextArea.setEditable(true);
        deliveryAd_jTextArea.selectAll();
        deliveryAd_jTextArea.requestFocusInWindow();
    }

    private void AdConfirm_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        clock =  clock_jComboBox.getSelectedItem().toString();
        if(date==null){
          Date date1 = new Date();
          date= date1.toString();
          date=date.substring(0, 11)+date.substring(24);
      }
          String temp =  "\n\nTime: "+date+" "+clock;
          System.out.println(date.length());
        if(x==0)
        {deliveryAd_jTextArea.append(temp);}
        else
        {
        int loc=deliveryAd_jTextArea.getText().lastIndexOf("\n\nTime: ");
       deliveryAd_jTextArea.replaceRange(temp, loc, temp.length()+loc);
        }
        x=1;
        deliveryAd_jTextArea.setEditable(false);
    }

    private void summaryBack_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
          setVisible(false);
    }

    private void deleteBill_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CurrentCustomer.orderList.clear();
       setUpTableData();
       total_jTextField.setText("   ₹"+CurrentCustomer.calculateTotal(CurrentCustomer.orderList));
    }

    private void OrderEdit_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
   yourOrder_jTable.setEnabled(true);
     yourOrder_jTable.setRowSelectionAllowed(true);
     yourOrder_jTable.selectAll();
    yourOrder_jTable.requestFocusInWindow();
total_jTextField.setForeground(new java.awt.Color(255, 255, 255));
    }

    private void orderConfirm_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
      CurrentCustomer.orderList.clear();
        for(int count = 0; count < yourOrder_jTable.getRowCount(); count++){
            if(yourOrder_jTable.getValueAt(count, 0).toString().equals("")
                    ||yourOrder_jTable.getValueAt(count, 2).toString().equals("")||yourOrder_jTable.getValueAt(count, 2).toString().equals("0"))
            {continue;}
            else{
              
                CurrentCustomer.creatOrder(yourOrder_jTable.getValueAt(count, 0).toString(),  
                yourOrder_jTable.getValueAt(count, 2).toString(), 
                yourOrder_jTable.getValueAt(count, 1).toString());
                    }
        }
        total_jTextField.setText("   ₹"+CurrentCustomer.calculateTotal(CurrentCustomer.orderList));
        total_jTextField.setForeground(new java.awt.Color(255, 255, 0));
       setUpTableData();
    }

    private void PayBill_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CurrentCustomer.changeToLastOrder( CurrentCustomer.orderList);
        new ReadXMLDataBase().changeLastOrder();
        Object[] options = {"Back","Leave"}; 
         int choice = JOptionPane.showOptionDialog(rootPane,
                               "Your Delivery Personnel is assigned, \n Further Details and Tracking provided in SMS, \nAfter clicking the 'Pay Bill' button,\n the last order list in the user account is updated.\n\n"
                 + "Thank you for visiting!", 
                              "End of the System" , 
                               JOptionPane.YES_NO_OPTION, 
                               JOptionPane.INFORMATION_MESSAGE, 
                               null, 
                               options, 
                               options[1]); 
if(choice == 0 ){

    JOptionPane.getRootFrame().dispose();
}else{

    System.exit(0);
}
    }
    
    public void setUpTableData() {
     yourOrder_jTable.setModel(new model1(
            CurrentCustomer.readOrder(CurrentCustomer.orderList),
            new String [] {
                "Course","Unit Price","Quantity","Price"
            }
        ));
     yourOrder_jTable.getColumnModel().getColumn(0).setPreferredWidth(190);
yourOrder_jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
         DefaultTableModel tableModel = (DefaultTableModel)  yourOrder_jTable.getModel();
        tableModel.fireTableDataChanged();
}
   
    /**
     * @param args the command line arguments
     */
    public void createSummaryJDialog(){

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SummaryJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummaryJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummaryJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummaryJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
             @Override
            public void run() {
                addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                      dispose();
                    }
                });
                pack();
               setVisible(true);
            }
        });
    }
    private javax.swing.JButton AdConfirm_jButton;
    private javax.swing.JButton OrderEdit_jButton;
    private javax.swing.JButton PayBill_jButton;
    private javax.swing.JLabel SummaryScrenTitle_jLabel;
    private javax.swing.JButton changAd_jButton;
    private javax.swing.JComboBox clock_jComboBox;
    private javax.swing.JLabel clock_jLabel;
    private javax.swing.JLabel date_jLabel;
    private org.jdesktop.swingx.JXDatePicker date_jXDatePicker;
    private javax.swing.JButton deleteBill_jButton;
    private javax.swing.JLabel deliveryAd_jLabel;
    private javax.swing.JScrollPane deliveryAd_jScrollPane;
    private javax.swing.JTextArea deliveryAd_jTextArea;
    private javax.swing.JLabel deliveryTime_jLabel;
    private javax.swing.JPanel delivery_jPanel;
    private javax.swing.JLabel leaveMessage_jLabel;
    private javax.swing.JPanel leaveMessage_jPanel;
    private javax.swing.JScrollPane leaveMessage_jScrollPane;
    private javax.swing.JTextArea leaveMessage_jTextArea;
    private javax.swing.JButton orderConfirm_jButton1;
    private javax.swing.JButton summaryBack_jButton;
    private javax.swing.JLabel total_jLabel;
    private javax.swing.JTextField total_jTextField;
    private javax.swing.JLabel yourOrder_jLabel;
    private javax.swing.JPanel yourOrder_jPanel;
    private javax.swing.JScrollPane yourOrder_jScrollPane;
    private javax.swing.JTable yourOrder_jTable;
}
