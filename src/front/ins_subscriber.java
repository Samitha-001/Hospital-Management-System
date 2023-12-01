/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author asus
 */
public class ins_subscriber extends javax.swing.JFrame {
   
    Connection con = null;
    Statement st = null;
    Resultset rs = null;
    PreparedStatement pst = null;
    
    public ins_subscriber() {
        initComponents();
        con = DBConnect.getconnection();
        tableload();
    }

     private void reset(){
        
        id.setText("");
        fName.setText("");
        lName.setText("");
        address.setText("");
        contact.setText("");
        rel.setText("");
        }
     
     public void tabledata(){
        
        int r  = table.getSelectedRow();
        
        String Id = table.getValueAt(r, 0).toString();
        String Fname = table.getValueAt(r, 1).toString();
        String Lname = table.getValueAt(r, 2).toString();
//        String Adr = table.getValueAt(r, 3).toString();
        String Con_NO = table.getValueAt(r, 4).toString();
//        String rels = table.getValueAt(r, 5).toString();
        
        
        id.setText(Id);
        fName.setText(Fname);
        lName.setText(Lname);
        if(table.getValueAt(r, 3) == null){
        address.setText("");
        }else{
        address.setText(table.getValueAt(r, 3).toString());
        }
        
        contact.setText(Con_NO);
        if(table.getValueAt(r, 5) == null){
        rel.setText("");
        }else{
        rel.setText(table.getValueAt(r, 5).toString());
        }
       
        
    }
    
     public void tableload()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM insurance_subscriber";
            ResultSet rs =  st.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
    } 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        rel = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        update = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("First Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, 30));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Last Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, 30));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Address");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 30));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Contact Number");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 180, 30));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Relationship");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 140, 30));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("In Patient ID ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, 30));

        fName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 220, 30));

        lName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 220, 30));

        address.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 220, 30));

        contact.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 220, 30));

        rel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(rel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 220, 30));

        id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 220, 30));

        reset.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 153, 0));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 100, 30));

        update.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update.setForeground(new java.awt.Color(204, 0, 204));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 100, 30));

        submit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        submit.setForeground(new java.awt.Color(102, 255, 0));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 100, 30));

        delete.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 90, 30));

        jTabbedPane1.addTab("Details", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setSelectionBackground(new java.awt.Color(0, 255, 0));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 630, 410));

        jTabbedPane1.addTab("Table View", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 650, 470));

        jPanel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 25, 25));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Insurance Subscriber");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 290, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/home.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 46, 46));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       if(id.getText().isEmpty() || fName.getText().isEmpty() || lName.getText().isEmpty()  || contact.getText().isEmpty()){

            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
            try {
                st = con.createStatement();

                int Id = Integer.parseInt(id.getText());
                String Fname = fName.getText();
                String Lname = lName.getText();
                String Adr = address.getText();
                int Cont = Integer.parseInt(contact.getText());
                String Rel = rel.getText();

                String query = "INSERT INTO `insurance_subscriber`(`InPatientID`, `FName`, `LName`, `Address`, `ContactNo`, `Relationship`) VALUES (?,?,?,?,?,?)";
                pst = con.prepareStatement(query);

                pst.setInt(1, Id);
                pst.setString(2, Fname);
                pst.setString(3, Lname);
                pst.setString(4, Adr);
                pst.setInt(5, Cont);
                pst.setString(6, Rel);

                pst.execute();
                tableload();
                JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULLY");

            } catch (SQLIntegrityConstraintViolationException e) {

                JOptionPane.showMessageDialog(null, e);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, e);
            }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }                                      
    tableload();
    }//GEN-LAST:event_submitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            st = con.createStatement();
            
            int Id = Integer.parseInt(id.getText());
            String FName = fName.getText();
            String LName = lName.getText();
            String Add = address.getText();
            int Con_no = Integer.parseInt(contact.getText());
            String Rel = rel.getText();
            
            
            String query = "UPDATE `insurance_subscriber` SET `FName`=?,`LName`=?,`Address`=?,`ContactNo`=?,`Relationship`=? WHERE `InPatientID`=?";
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, FName);
            pst.setString(2, LName);
            pst.setString(3, Add);
            pst.setInt(4, Con_no);
            pst.setString(5, Rel);
            pst.setInt(6, Id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        tableload();
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st = con.createStatement();
            int Id = Integer.parseInt(id.getText());
            
            String query = "DELETE FROM insurance_subscriber WHERE InPatientID = '"+Id+"'";
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
        reset();
        tableload();
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        tabledata();
    }//GEN-LAST:event_tableMouseClicked

    private int xMouse, yMouse;
    
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ins_subscriber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ins_subscriber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ins_subscriber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ins_subscriber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ins_subscriber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField rel;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
