
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
public class AddMoney extends javax.swing.JFrame {

    /**
     * Creates new form AddMoney
     */
   
    String user_idd;
    int cur_baa;
  //  public AddMoney() {
//        
//        this.setContentPane(new JPanel()
//                {
//                    @Override
//                    public void paintComponent(Graphics g)
//                {
//                    super.paintComponent(g);
//                    g.drawImage(img, 0, 0, 700, 560, this);
//                }
//                });
//        setResizable(false);
//        initComponents();
//         
//    }
    public AddMoney(String user_id,int bal) {
        //System.out.println("HI"+bal);
        Image img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rohan\\Documents\\NetBeansProjects\\OOP_Project\\bg1.jpg");
        setResizable(false);this.setContentPane(new JPanel()
                {
                    @Override
                    public void paintComponent(Graphics g)
                {
                    super.paintComponent(g);
                    g.drawImage(img, 0, 0, 700, 560, this);
                }
                });
        setResizable(false);
        this.setContentPane(new JPanel()
                {
                    @Override
                    public void paintComponent(Graphics g)
                {
                    super.paintComponent(g);
                    g.drawImage(img, 0, 0, 700, 560, this);
                }
               });
        setResizable(false);
        initComponents();
        cur_baa=bal;
        user_idd=user_id;
        bal_cur.setText(""+bal);
        bal_cur.setEditable(false);
        user_msg.setText("You are logged in as " + user_id);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        add_money = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bal_cur = new javax.swing.JTextField();
        doe = new javax.swing.JTextField();
        cvv = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        doe1 = new javax.swing.JTextField();
        max_bal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        card_num1 = new javax.swing.JTextField();
        user_msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter Amount");

        add_money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_moneyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Card Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CVV");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date of Expiry (MM/YY)");

        bal_cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bal_curActionPerformed(evt);
            }
        });

        doe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doeActionPerformed(evt);
            }
        });

        jButton1.setText("Add Money");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        doe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doe1ActionPerformed(evt);
            }
        });

        max_bal.setText("Maximum wallet balance is 5000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("/");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Current Balance: ");

        user_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(max_bal)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_money, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doe1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bal_cur, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(user_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(301, 301, 301))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(483, Short.MAX_VALUE)
                    .addComponent(card_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(146, 146, 146)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bal_cur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(max_bal)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(57, 57, 57)
                        .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(user_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(227, 227, 227)
                    .addComponent(card_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(297, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (add_money.getText().equals("") || bal_cur.getText().equals("") || doe.getText().equals("") || doe1.getText().equals("") || cvv.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill all the entries");
        }
        else
        {
            int p=0;
            String amt = add_money.getText();
            String cno = card_num1.getText();
            String mon= doe.getText();
            String yr= doe1.getText();
            String cv = cvv.getText();
            for(int i=0;i<amt.length();i++)
            {
                if(amt.charAt(i)<'0' || amt.charAt(i)>'9')
                {
                    p=1;
                    break;
                }
            }
            if(p==1)
            {
               JOptionPane.showMessageDialog(null,"Please enter a valid amount"); 
            }
            else
            {
                for(int i=0;i<cno.length();i++)
                {
                    if(cno.charAt(i)<'0' || cno.charAt(i)>'9')
                    {
                        p=1;
                        break;
                    }
                }
                if(p==1)
                {
                   JOptionPane.showMessageDialog(null,"Please enter a valid card number"); 
                }
                else
                {
                    for(int i=0;i<mon.length();i++)
                    {
                        if(mon.charAt(i)<'0' || mon.charAt(i)>'9')
                        {
                            p=1;
                            break;
                        }
                    }
                    int monn=Integer.parseInt(mon);
                    if(monn>12 || monn<1)
                    {
                        p=1;
                    }
                    if(p==1)
                    {
                       JOptionPane.showMessageDialog(null,"Please enter a valid month"); 
                    }
                    else
                    {
                        for(int i=0;i<yr.length();i++)
                        {
                            if(yr.charAt(i)<'0' || yr.charAt(i)>'9')
                            {
                                p=1;
                                break;
                            }
                        }
                        int yer=Integer.parseInt(yr);
                        if(yer<19)
                        {
                            p=2;
                        }
                        else if(yer>99)
                        {
                            p=1;
                        }
                        else if(yer==19 && monn<11)
                        {
                            p=2;
                        }
                        if(p==1)
                        {
                           JOptionPane.showMessageDialog(null,"Please enter a valid year"); 
                        }
                        else if(p==2)
                        {
                             JOptionPane.showMessageDialog(null,"Your card has expired");
                             p=1;
                        }
                        else
                        {
                            for(int i=0;i<cv.length();i++)
                            {
                                if(cv.charAt(i)<'0' || cv.charAt(i)>'9')
                                {
                                    p=1;
                                    break;
                                }
                            }
                            if(p==1)
                            {
                               JOptionPane.showMessageDialog(null,"Please enter a valid cvv"); 
                            }
                            else
                            {
                                int add_ba=Integer.parseInt(amt);
                                if(add_ba+cur_baa>5000)
                                {
                                    JOptionPane.showMessageDialog(null,"Wallet balance can't be more than 5000");
                                    p=1;
                                }
                            }
                        }
                    }
                }
            }
            if(p==0)
            {
                try
                {
                    int add_ba=Integer.parseInt(amt);
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?characterEncoding=latin1","root","root");
                    Statement myStt = myConn.createStatement();
                    myStt.executeUpdate("update userdata set balance = "+ (add_ba+cur_baa) +" where id= '"+user_idd+"'");
                    dispose();
                    MainFrame mf = new MainFrame(user_idd,add_ba+cur_baa);
                    mf.setVisible(true);
                    
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void add_moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_moneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_moneyActionPerformed

    private void doeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doeActionPerformed

    private void doe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doe1ActionPerformed

    private void bal_curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bal_curActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bal_curActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddMoney().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_money;
    private javax.swing.JTextField bal_cur;
    private javax.swing.JTextField card_num1;
    private javax.swing.JPasswordField cvv;
    private javax.swing.JTextField doe;
    private javax.swing.JTextField doe1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel max_bal;
    private javax.swing.JLabel user_msg;
    // End of variables declaration//GEN-END:variables
}
