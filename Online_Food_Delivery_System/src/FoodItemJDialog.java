import javax.swing.JOptionPane;

public class FoodItemJDialog extends javax.swing.JDialog {
   
    public FoodItemJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")

    private void initComponents() {

        foodDescrip_jScrollPane = new javax.swing.JScrollPane();
        food_jTextArea = new javax.swing.JTextArea();
        control2_jPane = new javax.swing.JPanel();
        addToOrder_jCheckBox = new javax.swing.JCheckBox();
        addToFavorites_CheckBox = new javax.swing.JCheckBox();
        price_jTextField = new javax.swing.JTextField();
        price_jLabel = new javax.swing.JLabel();
        quantity_jLabel = new javax.swing.JLabel();
        quantity_jTextField = new javax.swing.JTextField();
        confrim_jButton = new javax.swing.JButton();
        foodPic_jLabel = new javax.swing.JLabel();
        course_jTextField = new javax.swing.JTextField();
        Back_jButton = new javax.swing.JButton();
        total_jLabel = new javax.swing.JLabel();
        viewOrder_jButton1 = new javax.swing.JButton();
        total_jTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Food Discription");

        food_jTextArea.setEditable(false);
        food_jTextArea.setBackground(new java.awt.Color(0, 153, 153));
        food_jTextArea.setColumns(20);
        food_jTextArea.setFont(new java.awt.Font("Tahoma", 3, 14)); 
        food_jTextArea.setForeground(new java.awt.Color(255, 255, 255));
        food_jTextArea.setRows(5);
        food_jTextArea.setText("xyz");
        food_jTextArea.setLineWrap(true);
        food_jTextArea.setWrapStyleWord(true);
        foodDescrip_jScrollPane.setViewportView(food_jTextArea);

        addToOrder_jCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        addToOrder_jCheckBox.setForeground(new java.awt.Color(255, 0, 0));
        addToOrder_jCheckBox.setText("Add To My Order");

        addToFavorites_CheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        addToFavorites_CheckBox.setForeground(new java.awt.Color(255, 0, 0));
        addToFavorites_CheckBox.setText("Add To My Favorites");

        price_jTextField.setEditable(false);
        price_jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price_jTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        price_jLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        price_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        price_jLabel.setText("Price :");

        quantity_jLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        quantity_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        quantity_jLabel.setText("Quantity :");

        quantity_jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantity_jTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantity_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_jTextFieldActionPerformed(evt);
            }
        });

        confrim_jButton.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        confrim_jButton.setForeground(new java.awt.Color(255, 0, 0));
        confrim_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green2-plus-sign-th.png"))); 
        confrim_jButton.setText("Confirm");
        confrim_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confrim_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_jButtonActionPerformed(evt);
            }
        });

        foodPic_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TodaySpecial/chhat2.jpg"))); 

        course_jTextField.setEditable(false);
        course_jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        course_jTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout control2_jPaneLayout = new javax.swing.GroupLayout(control2_jPane);
        control2_jPane.setLayout(control2_jPaneLayout);
        control2_jPaneLayout.setHorizontalGroup(
            control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control2_jPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(control2_jPaneLayout.createSequentialGroup()
                        .addGroup(control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price_jLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantity_jLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantity_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(course_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(foodPic_jLabel))
            .addGroup(control2_jPaneLayout.createSequentialGroup()
                .addGroup(control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(control2_jPaneLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(confrim_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(control2_jPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addToOrder_jCheckBox)
                            .addComponent(addToFavorites_CheckBox))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        control2_jPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addToFavorites_CheckBox, addToOrder_jCheckBox});

        control2_jPaneLayout.setVerticalGroup(
            control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, control2_jPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(foodPic_jLabel)
                    .addGroup(control2_jPaneLayout.createSequentialGroup()
                        .addComponent(course_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price_jLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(control2_jPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantity_jLabel)
                            .addComponent(quantity_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addToOrder_jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addToFavorites_CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confrim_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        control2_jPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addToFavorites_CheckBox, addToOrder_jCheckBox});

        control2_jPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {price_jTextField, quantity_jTextField});

        Back_jButton.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        Back_jButton.setForeground(new java.awt.Color(0, 0, 255));
        Back_jButton.setText("Back");
        Back_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_jButtonActionPerformed(evt);
            }
        });

        total_jLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        total_jLabel.setForeground(new java.awt.Color(0, 51, 255));
        total_jLabel.setText("Total :");

        viewOrder_jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        viewOrder_jButton1.setForeground(new java.awt.Color(0, 0, 255));
        viewOrder_jButton1.setText("View My order");
        viewOrder_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrder_jButton1ActionPerformed(evt);
            }
        });

        total_jTextField.setText(CurrentCustomer.calculateTotal(CurrentCustomer.orderList));
        total_jTextField.setEditable(false);
        total_jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_jTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Back_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewOrder_jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(control2_jPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(foodDescrip_jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(control2_jPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodDescrip_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewOrder_jButton1)
                    .addComponent(Back_jButton)
                    .addComponent(total_jLabel)
                    .addComponent(total_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void Back_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void viewOrder_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
      new SummaryJDialog(new javax.swing.JFrame(), true).createSummaryJDialog();
      setVisible(false);
    }

    private void confrim_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if((!addToOrder_jCheckBox.isSelected()&&!addToFavorites_CheckBox.isSelected())
                ||(addToOrder_jCheckBox.isSelected()&&quantity_jTextField.getText().isEmpty()))
        {  JOptionPane.showMessageDialog(rootPane,
                      "Invalid input or selection.", "Error Message", JOptionPane.WARNING_MESSAGE);
        }
        else{
        if(addToOrder_jCheckBox.isSelected()&&!quantity_jTextField.getText().isEmpty()){
           String course= course_jTextField.getText();
           String num = quantity_jTextField.getText();
           String price =price_jTextField.getText();
            CurrentCustomer.creatOrder(course, num, price);
            total_jTextField.setText(" ₹"+CurrentCustomer.calculateTotal(CurrentCustomer.orderList));
        }
        if(addToFavorites_CheckBox.isSelected()){
          if(!CurrentCustomer.favoritesList.contains(course_jTextField.getText())){
          CurrentCustomer.creatFavorites(course_jTextField.getText());
          UserAccount.tempName=CurrentCustomer.UserName;
            new ReadXMLDataBase().writeCustomerData("change"); 
          }
        } 
        JOptionPane.showMessageDialog(rootPane,  "Successfully confirmed", "Message",  
                     JOptionPane.INFORMATION_MESSAGE, SignInJDialog.icon);}
    }

    private void quantity_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
       quantity_jTextField.selectAll();
    }

    /**
     * @param args the command line arguments
     */
    public void createFoodItemDialog() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoodItemJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodItemJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodItemJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodItemJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    private javax.swing.JButton Back_jButton;
    private javax.swing.JCheckBox addToFavorites_CheckBox;
    private javax.swing.JCheckBox addToOrder_jCheckBox;
    private javax.swing.JButton confrim_jButton;
    private javax.swing.JPanel control2_jPane;
    public javax.swing.JTextField course_jTextField;
    private javax.swing.JScrollPane foodDescrip_jScrollPane;
    public javax.swing.JLabel foodPic_jLabel;
    public javax.swing.JTextArea food_jTextArea;
    private javax.swing.JLabel price_jLabel;
    public javax.swing.JTextField price_jTextField;
    private javax.swing.JLabel quantity_jLabel;
    public javax.swing.JTextField quantity_jTextField;
    private javax.swing.JLabel total_jLabel;
    public static javax.swing.JTextField total_jTextField;
    private javax.swing.JButton viewOrder_jButton1;
}
