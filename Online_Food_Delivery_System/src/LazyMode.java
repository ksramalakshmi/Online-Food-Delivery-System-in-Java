import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LazyMode extends javax.swing.JDialog implements ActionListener {

     
    public LazyMode(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
       ReadXMLDataBase data = new ReadXMLDataBase();
       for(int i=0;i<myImage.length;i++){
       data.readDataByID(randomGenerator()[i]);
       myImage[i] = new ImageIcon("src"+data.Iamge1Url).getImage(); 
       foodName[i]= data.FoodName;
       price[i]= " ₹"+data.FoodPrice;
    }
       timer.start();
    } 
Image[] myImage= new Image[3];
String[] foodName = new String[3];
String[] price = new String[3];

Timer timer = new Timer(20, this); 
  private float alpha1 = 0.0f;
 private float alpha2 = 0.0f;
  private float alpha3 = 0.0f;
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Confirm_jButton = new javax.swing.JButton();
        lazyBack_jButton = new javax.swing.JButton();
        lazyMode_jPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha1));
                g2d.drawImage(myImage[0], 20, 10, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha2));
                g2d.drawImage(myImage[1], 190, 10, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha3));
                g2d.drawImage(myImage[2], 360, 10, null);
            }
        };
        foodName_jPanel = new javax.swing.JPanel();
        foodItem1_jLabel = new javax.swing.JLabel();
        foodItem2_jLabel = new javax.swing.JLabel();
        foodItem3_jLabel = new javax.swing.JLabel();
        price_jPanel = new javax.swing.JPanel();
        price2_jLabel = new javax.swing.JLabel();
        price1_jLabel = new javax.swing.JLabel();
        price3_jLabel = new javax.swing.JLabel();
        hungry_jLabel = new javax.swing.JLabel();
        tryAgain_jButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lazy Mode");

        Confirm_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        Confirm_jButton.setForeground(new java.awt.Color(255, 0, 0));
        Confirm_jButton.setText("Confirm");
        Confirm_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_jButtonActionPerformed(evt);
            }
        });

        lazyBack_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        lazyBack_jButton.setForeground(new java.awt.Color(255, 0, 0));
        lazyBack_jButton.setText("Back");
        lazyBack_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lazyBack_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lazyMode_jPanelLayout = new javax.swing.GroupLayout(lazyMode_jPanel);
        lazyMode_jPanel.setLayout(lazyMode_jPanelLayout);
        lazyMode_jPanelLayout.setHorizontalGroup(
            lazyMode_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lazyMode_jPanelLayout.setVerticalGroup(
            lazyMode_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        foodItem1_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        foodItem1_jLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        foodItem2_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        foodItem2_jLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        foodItem2_jLabel.setOpaque(true);

        foodItem3_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        foodItem3_jLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        foodItem3_jLabel.setOpaque(true);

        javax.swing.GroupLayout foodName_jPanelLayout = new javax.swing.GroupLayout(foodName_jPanel);
        foodName_jPanel.setLayout(foodName_jPanelLayout);
        foodName_jPanelLayout.setHorizontalGroup(
            foodName_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodName_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foodItem1_jLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(foodItem2_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foodItem3_jLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        foodName_jPanelLayout.setVerticalGroup(
            foodName_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodName_jPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(foodName_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodItem1_jLabel)
                    .addGroup(foodName_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(foodItem2_jLabel)
                        .addComponent(foodItem3_jLabel))))
        );

        price_jPanel.setLayout(null);

        price2_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        price2_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        price2_jLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        price2_jLabel.setOpaque(true);
        price_jPanel.add(price2_jLabel);
        price2_jLabel.setBounds(260, 5, 40, 15);

        price1_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        price1_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        price1_jLabel.setText(" ");
        price1_jLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        price1_jLabel.setOpaque(true);
        price_jPanel.add(price1_jLabel);
        price1_jLabel.setBounds(90, 5, 40, 15);

        price3_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        price3_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        price3_jLabel.setText(" ");
        price3_jLabel.setOpaque(true);
        price_jPanel.add(price3_jLabel);
        price3_jLabel.setBounds(430, 5, 40, 15);

        hungry_jLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); 
        hungry_jLabel.setForeground(new java.awt.Color(204, 0, 204));
        hungry_jLabel.setText("I am feeling hungry !");
        hungry_jLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tryAgain_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        tryAgain_jButton.setForeground(new java.awt.Color(204, 0, 204));
        tryAgain_jButton.setText("Try Again");
        tryAgain_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgain_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lazyBack_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tryAgain_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Confirm_jButton))
                    .addComponent(foodName_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(price_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lazyMode_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(hungry_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hungry_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodName_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lazyMode_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirm_jButton)
                    .addComponent(lazyBack_jButton)
                    .addComponent(tryAgain_jButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void lazyBack_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void Confirm_jButtonActionPerformed(java.awt.event.ActionEvent evt) {

        CurrentCustomer.creatOrder(foodName[0], "1", price[0]);
        CurrentCustomer.creatOrder(foodName[1], "1", price[1]);
        CurrentCustomer.creatOrder(foodName[2], "1", price[2]);
        new SummaryJDialog(new javax.swing.JFrame(), true).createSummaryJDialog();
      setVisible(false);
    }

    private void tryAgain_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
         setVisible(false);
          LazyMode dialog = new LazyMode(new javax.swing.JFrame(), true);
       dialog.createLazyModeDialog();
    }

private String[] randomGenerator(){
    String[] id= new String[3];
    
    int[] unit = new int[3];
    for(int i=0;i<unit.length;i++){
        unit[i]= 1 + (int)(Math.random() * ((6 - 1) + 1));
    }
    
    int decade = 1+ (int)(Math.random() * ((3 - 1) + 1));
     if (new Random().nextBoolean()== true){id[0]="a";}
     else{id[0]="e";}
     if(decade==1){ id[1]="b" ; }
     else if(decade==2){ id[1]="d" ; }
     else if(decade==3){ id[1]="f" ; }
     if (new Random().nextBoolean()== true){id[2]="g";}
     else{id[2]="c"; }
     
     id[0]+=Integer.toString(unit[0]);
     id[1]+=Integer.toString(unit[1]);
     id[2]+=Integer.toString(unit[2]);
     return id;
}
    @Override
  public void actionPerformed(ActionEvent e) {
    alpha1 += 0.01f;
    if (alpha1 >= 1) {
      alpha1 = 1;
     
      price1_jLabel.setText(price[0]);
      alpha2 +=0.01f;
      if(alpha2 >=1){
        alpha2 = 1;
        
      price2_jLabel.setText(price[1]);
      alpha3 +=0.01f;
       if(alpha3 >=1){
           alpha3 = 1;
            foodItem1_jLabel.setText(foodName[0]); 
            foodItem2_jLabel.setText(foodName[1]);
           foodItem3_jLabel.setText(foodName[2]);
      price3_jLabel.setText(price[2]);
           timer.stop();
       }
    }
    }
    lazyMode_jPanel.repaint();
  }
    /**
     * @param args the command line arguments
     */
    public void createLazyModeDialog() {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LazyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LazyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LazyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LazyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                setVisible(true);
            }
        });
    }

    private javax.swing.JButton Confirm_jButton;
    private javax.swing.JLabel foodItem1_jLabel;
    private javax.swing.JLabel foodItem2_jLabel;
    private javax.swing.JLabel foodItem3_jLabel;
    private javax.swing.JPanel foodName_jPanel;
    private javax.swing.JLabel hungry_jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lazyBack_jButton;
    private javax.swing.JPanel lazyMode_jPanel;
    private javax.swing.JLabel price1_jLabel;
    private javax.swing.JLabel price2_jLabel;
    private javax.swing.JLabel price3_jLabel;
    private javax.swing.JPanel price_jPanel;
    private javax.swing.JButton tryAgain_jButton;
}
