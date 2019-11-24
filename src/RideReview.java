
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rushi
 */
public class RideReview extends javax.swing.JFrame {
    
    int flag = 1;
    double rating;
    String driver_name, user_id;

    /**
     * Creates new form RideReview
     */
    Image img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rohan\\Documents\\NetBeansProjects\\OOP_Project\\bg1.jpg");
    
    public RideReview(String user_id, String start, String drop, String dri_name, int duration, int fare) {
        this.user_id = user_id;
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
        start_in.setText(start);
        drop_in.setText(drop);
        name_in.setText(dri_name);
        driver_name = dri_name;
        duration_in.setText(""+duration);
        fare_in.setText(""+fare);
        user_msg.setText("You are logged in as " + user_id);
        int new_bal = 0, balance = 0, new_pos = 0;
        
        //get new_pos of driver
        if(drop == "Eriador"){
            new_pos = 1;
        }
        else if(drop == "Gondor"){
            new_pos = 2;
        }
        else if(drop == "Isengard"){
            new_pos = 3;
        }
        else if(drop == "Rohan"){
            new_pos = 4;
        }
        else if(drop == "Helms Deep"){
            new_pos = 5;
        }
        else if(drop == "The Shire"){
            new_pos = 6;
        }
        else if(drop == "Mordor"){
            new_pos = 7;
        }
        else if(drop == "Moria"){
            new_pos = 8;
        }
        
        
        //updating balance - access user database
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?characterEncoding=latin1","root","root");
            
            System.out.println("\n" + user_id + "\n");
            //get the previous balance
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from userdata where id = '" + user_id + "'");
            System.out.println(user_id + " " + balance + " " + new_bal);
            while(myRs.next()){
                balance = myRs.getInt("balance");
            }
            
            //calculate the new balance
            new_bal = balance - fare;
            System.out.println(user_id + " " + balance + " " + new_bal);
            //update new balance in database
            Statement myStmt1 = myConn.createStatement();
            myStmt1.executeUpdate("update userdata set balance = " + new_bal + " where id = '" + user_id + "'");
        
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Error while accessing user database updating balance");
        }
        rating_confirm.setEnabled(false);
        
        
        
        //updating cur_status
        try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/drivers?characterEncoding=latin1","root","root");
                
            
//                Statement myStmt1 = myConn.createStatement();
//                myStmt1.executeUpdate("update driver set rating = " + rating + "where driver_name = '" + driver_name + "'");
            
                Statement myStmt2 = myConn.createStatement();
                myStmt2.executeUpdate("update driver set cur_status = 0 where driver_name = '" + driver_name + "'");
                
                Statement myStmt3 = myConn.createStatement();
                myStmt3.executeUpdate("update driver set cur_pos = "+ new_pos +" where driver_name = '" + driver_name + "'");
            }
            catch(Exception e)
            {
                System.out.println("Error while accessing driver database updating status of driver");
            }
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/history","root","root");
            Statement myStmt = myConn.createStatement();
            myStmt.executeUpdate("insert into " + user_id + " values('" + start + "', '" + drop + "', " + fare + ")");
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        driver_rating = new javax.swing.ButtonGroup();
        ride_review = new javax.swing.JLabel();
        starting_point = new javax.swing.JLabel();
        dropping_point = new javax.swing.JLabel();
        label123 = new javax.swing.JLabel();
        driver_pre_rating = new javax.swing.JLabel();
        trip_duration = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        one_star = new javax.swing.JRadioButton();
        two_star = new javax.swing.JRadioButton();
        three_star = new javax.swing.JRadioButton();
        four_star = new javax.swing.JRadioButton();
        five_star = new javax.swing.JRadioButton();
        exit = new javax.swing.JButton();
        back_to_main = new javax.swing.JButton();
        start_in = new javax.swing.JLabel();
        drop_in = new javax.swing.JLabel();
        name_in = new javax.swing.JLabel();
        fare_in = new javax.swing.JLabel();
        duration_in = new javax.swing.JLabel();
        rating_confirm = new javax.swing.JButton();
        user_msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        ride_review.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ride_review.setText("Ride Review");

        starting_point.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        starting_point.setText("Starting Point:");

        dropping_point.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        dropping_point.setText("Dropping Point:");

        label123.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label123.setText("Driver Name:");

        driver_pre_rating.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        driver_pre_rating.setText("Fare:");

        trip_duration.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        trip_duration.setText("Trip Duration:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("Rating:");

        driver_rating.add(one_star);
        one_star.setText("1");
        one_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_starActionPerformed(evt);
            }
        });

        driver_rating.add(two_star);
        two_star.setText("2");
        two_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_starActionPerformed(evt);
            }
        });

        driver_rating.add(three_star);
        three_star.setText("3");
        three_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_starActionPerformed(evt);
            }
        });

        driver_rating.add(four_star);
        four_star.setText("4");
        four_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_starActionPerformed(evt);
            }
        });

        driver_rating.add(five_star);
        five_star.setText("5");
        five_star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_starActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        back_to_main.setText("Back to Main Menu");
        back_to_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_mainActionPerformed(evt);
            }
        });

        start_in.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        drop_in.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        name_in.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        fare_in.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        duration_in.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        rating_confirm.setText("Confrm");
        rating_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rating_confirmActionPerformed(evt);
            }
        });

        user_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(back_to_main)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ride_review)
                .addGap(265, 265, 265))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(starting_point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dropping_point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(trip_duration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(driver_pre_rating, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label123, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name_in, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(start_in, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fare_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(duration_in, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(drop_in, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one_star)
                        .addGap(18, 18, 18)
                        .addComponent(two_star)
                        .addGap(18, 18, 18)
                        .addComponent(three_star)
                        .addGap(18, 18, 18)
                        .addComponent(four_star)
                        .addGap(18, 18, 18)
                        .addComponent(five_star)
                        .addGap(58, 58, 58)
                        .addComponent(rating_confirm)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(user_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ride_review)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start_in, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starting_point))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drop_in, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropping_point))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label123)
                    .addComponent(name_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driver_pre_rating)
                    .addComponent(fare_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trip_duration)
                    .addComponent(duration_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(one_star)
                    .addComponent(two_star)
                    .addComponent(three_star)
                    .addComponent(four_star)
                    .addComponent(five_star)
                    .addComponent(rating_confirm))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_to_main)
                    .addComponent(exit))
                .addGap(39, 39, 39)
                .addComponent(user_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void one_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_starActionPerformed
        // TODO add your handling code here:
        if(one_star.isSelected())
        {
            rating = 1;
            rating_confirm.setEnabled(true);
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_one_starActionPerformed

    private void two_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_starActionPerformed
        // TODO add your handling code here:
        if(two_star.isSelected())
        {
            rating = 2;
            rating_confirm.setEnabled(true);
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_two_starActionPerformed

    private void back_to_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_mainActionPerformed
        int balance = 0;
        try{    
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?characterEncoding=latin1","root","root");
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from userdata");
            
            while(myRs.next())
                {
                    if(myRs.getString("id").equals(user_id))
                    {
                            
                                    balance = myRs.getInt("balance");
                            }
                            
                    }
                }
        
        catch(Exception e){
            
        }
        // TODO add your handling code here:
        dispose();
        MainFrame mf = new MainFrame(user_id, balance);
        mf.setVisible(true);
        
    }//GEN-LAST:event_back_to_mainActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?characterEncoding=latin1","root","root");
            Statement myStmt = myConn.createStatement();
            myStmt.executeUpdate("update userdata set logged_in = 0 where id = '" + user_id + "'");
        }
        catch(Exception e)
        {
           System.out.println(e);
        }        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void three_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_starActionPerformed
        // TODO add your handling code here:
        if(three_star.isSelected())
        {
            rating = 3;
            rating_confirm.setEnabled(true);
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_three_starActionPerformed

    private void four_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_starActionPerformed
        // TODO add your handling code here:
        if(four_star.isSelected())
        {
            rating = 4;
            rating_confirm.setEnabled(true);
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_four_starActionPerformed

    private void five_starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_starActionPerformed
        // TODO add your handling code here:
        if(five_star.isSelected())
        {
            rating = 5;
            rating_confirm.setEnabled(true);
            //JOptionPane.showMessageDialog (null,rating);
        }
    }//GEN-LAST:event_five_starActionPerformed

    private void rating_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rating_confirmActionPerformed
        // TODO add your handling code here:
        
        
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/drivers?characterEncoding=latin1","root","root");
                Statement myStmt = myConn.createStatement();
                ResultSet myRs = myStmt.executeQuery("select * from driver" );
                while(myRs.next())
                {
                    if(myRs.getString("driver_name").equals(driver_name))
                    {
                        double a = myRs.getDouble("rating");//previous rating
                        int b = myRs.getInt("num_trips");//completed trips
                        double c = (a * b + rating)/(b + 1);
                        rating = c;
                        break;
                    }
                }
            
                Statement myStmt1 = myConn.createStatement();
                myStmt1.executeUpdate("update driver set rating = " + rating + "where driver_name = '" + driver_name + "'");
            
                Statement myStmt2 = myConn.createStatement();
                myStmt2.executeUpdate("update driver set cur_status = 0 where driver_name = '" + driver_name + "'");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            rating_confirm.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Thank you for your feedback");
    }//GEN-LAST:event_rating_confirmActionPerformed

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
//            java.util.logging.Logger.getLogger(RideReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RideReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RideReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RideReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RideReview().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_main;
    private javax.swing.JLabel driver_pre_rating;
    private javax.swing.ButtonGroup driver_rating;
    private javax.swing.JLabel drop_in;
    private javax.swing.JLabel dropping_point;
    private javax.swing.JLabel duration_in;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fare_in;
    private javax.swing.JRadioButton five_star;
    private javax.swing.JRadioButton four_star;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label123;
    private javax.swing.JLabel name_in;
    private javax.swing.JRadioButton one_star;
    private javax.swing.JButton rating_confirm;
    private javax.swing.JLabel ride_review;
    private javax.swing.JLabel start_in;
    private javax.swing.JLabel starting_point;
    private javax.swing.JRadioButton three_star;
    private javax.swing.JLabel trip_duration;
    private javax.swing.JRadioButton two_star;
    private javax.swing.JLabel user_msg;
    // End of variables declaration//GEN-END:variables
}
