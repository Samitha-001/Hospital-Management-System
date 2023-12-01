package front;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RamithRodrigo
 */
public class test extends javax.swing.JFrame {

      Connection con = null;
    Statement st = null;
    Resultset rs = null;
    PreparedStatement pst = null;
    
    public test() {
        initComponents();
        con = DBConnect.getconnection();
          
          tableload();
    }

    private void reset(){
        
        t_code.setText("");
        
        t_name.setText("");
        t_cost.setText("");
        t_id.setText("");
        }
    
     public void tabledata(){
        
        int r  = table.getSelectedRow();
        
        String Code = table.getValueAt(r, 0).toString();
        String Cname = table.getValueAt(r, 1).toString();
        String Ccost = table.getValueAt(r, 2).toString();
        String Tid = table.getValueAt(r, 3).toString();
        
        
        t_code.setText(Code);
        t_name.setText(Cname);
        t_cost.setText(Ccost);
        t_id.setText(Tid);

    }
     
     public void tableload()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM test";
            ResultSet rs =  st.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_name = new javax.swing.JTextField();
        t_cost = new javax.swing.JTextField();
        t_id = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        t_code = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Test Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, -1));

        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Cost");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 90, -1));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Test Code");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, -1));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Treatment ID");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, -1));

        t_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel3.add(t_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 210, 40));

        t_cost.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_costActionPerformed(evt);
            }
        });
        jPanel3.add(t_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 210, 40));

        t_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel3.add(t_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 210, 40));

        enter.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        enter.setForeground(new java.awt.Color(51, 255, 0));
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        jPanel3.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 110, 40));

        Delete.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 0, 0));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel3.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 110, 40));

        Update.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Update.setForeground(new java.awt.Color(204, 0, 204));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel3.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 110, 40));

        reset.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 102, 0));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel3.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 110, 40));

        t_code.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel3.add(t_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 210, 40));

        jTabbedPane3.addTab("Information", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(table);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 340));

        jTabbedPane3.addTab("Table View", jPanel4);

        getContentPane().add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 700, 400));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 25, 25));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/home.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 46, 46));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Test");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_costActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
       if( t_name.getText().isEmpty() || t_cost.getText().isEmpty() || t_id.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {     
            st = con.createStatement();
            

            int nCode = Integer.parseInt(t_code.getText());
            String Tname = t_name.getText();
            int Tcost = Integer.parseInt(t_cost.getText());
            int TID = Integer.parseInt(t_id.getText());
            
            
            String query = "INSERT INTO `test`(`TestCode`, `TestName`, `Cost`, `Treatment_ID`) VALUES (?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setInt(1, nCode);
            pst.setString(2, Tname);
             pst.setInt(3, Tcost);
            pst.setInt(4, TID);
          
            pst.execute();
            tableload();
 
            JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULLY");
            
        } catch (SQLIntegrityConstraintViolationException e) {
            
            JOptionPane.showMessageDialog(null, e);  
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }
       catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }    
       
       
       tableload();
    }//GEN-LAST:event_enterActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        tabledata();
    }//GEN-LAST:event_tableMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st = con.createStatement();
            
            int tCode = Integer.parseInt(t_code.getText());
            
            String query = "DELETE FROM test WHERE TestCode = '"+tCode+"'";
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not Selected");
        } 
        }
        reset();
        tableload();
    }//GEN-LAST:event_DeleteActionPerformed

    private int xMouse, yMouse;
    
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       reset();
    }//GEN-LAST:event_resetActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       try {
            st = con.createStatement();
            
            int Tcode = Integer.parseInt(t_code.getText());
            String Tname = t_name.getText();
            int Tcost= Integer.parseInt(t_cost.getText());
            int Tr_ID= Integer.parseInt(t_id.getText());
            
            String query = "UPDATE `test` SET  `TestName`=?,`Cost`=?,`Treatment_ID`=? WHERE `TestCode`=?";
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, Tname);
            pst.setInt(2, Tcost);
            pst.setInt(3, Tr_ID);
            pst.setInt(4, Tcode);
            
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
    }//GEN-LAST:event_UpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JButton enter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton reset;
    private javax.swing.JTextField t_code;
    private javax.swing.JTextField t_cost;
    private javax.swing.JTextField t_id;
    private javax.swing.JTextField t_name;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
