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
 * @author Asus VivoBook
 */
public class Drug extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    Resultset rs = null;
    PreparedStatement pst = null;
    
    public Drug() {
        initComponents();
        con = DBConnect.getconnection();
        tableload();
    }

    private void reset(){
        
        d_code.setText("");
        d_name.setText("");
        d_type.setText("");
        d_cost.setText("");
        t_Id.setText("");
        }
    
    public void tableload()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM drug";
            ResultSet rs =  st.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
    } 
    
     public void tabledata1(){
        
        int r  = table.getSelectedRow();
        
        String id = table.getValueAt(r, 0).toString();
        String name = table.getValueAt(r, 1).toString();
        String type = table.getValueAt(r, 2).toString();
        String unit = table.getValueAt(r, 3).toString();
        String tid = table.getValueAt(r, 4).toString();
        
        
        d_code.setText(id);
        d_name.setText(name);
        d_type.setText(type);
        d_cost.setText(unit);
        t_Id.setText(tid);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        d_code = new javax.swing.JTextField();
        d_name = new javax.swing.JTextField();
        d_type = new javax.swing.JTextField();
        d_cost = new javax.swing.JTextField();
        t_Id = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        moving = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("DRUG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Drug Code");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Drug Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Drug Type");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Unit Cost");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("TreatmentID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));
        jPanel1.add(d_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 95, 130, 30));

        d_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_nameActionPerformed(evt);
            }
        });
        jPanel1.add(d_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 89, 140, 30));

        d_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_typeActionPerformed(evt);
            }
        });
        jPanel1.add(d_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 170, 130, 30));
        jPanel1.add(d_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 150, 140, 30));
        jPanel1.add(t_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 130, 30));

        reset.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 102, 0));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 90, 30));

        submit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        submit.setForeground(new java.awt.Color(102, 204, 0));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 90, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 520, 250));

        delete.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 90, 30));

        update.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update.setForeground(new java.awt.Color(153, 0, 153));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 90, 30));

        moving.setOpaque(false);
        moving.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingMouseDragged(evt);
            }
        });
        moving.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingMousePressed(evt);
            }
        });
        moving.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        moving.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 25, 25));

        jPanel1.add(moving, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void d_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_typeActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(d_code.getText().isEmpty() || d_name.getText().isEmpty() || d_type.getText().isEmpty() || d_cost.getText().isEmpty() || t_Id.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {     
            st = con.createStatement();
            
            int code = Integer.parseInt(d_code.getText());
            String name = d_name.getText();
            String type = d_type.getText();
            int unit = Integer.parseInt(d_cost.getText());
            int tId = Integer.parseInt(t_Id.getText());
            
            
            String query = "INSERT INTO `drug`(`DrugCode`, `Drug_Name`, `DrugType`, `Unit_Cost`, `Treatment_ID`) VALUES (?,?,?,?,?)";
            pst = con.prepareStatement(query);
            
            pst.setInt(1, code);
            pst.setString(2, name);
            pst.setString(3, type);
            pst.setInt(4, unit);
            pst.setInt(5, tId);
            

            
            pst.execute();
            tableload();
            JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULLY");
            
        } catch (SQLIntegrityConstraintViolationException e) {
            
            JOptionPane.showMessageDialog(null, e);  
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } 
       catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }     
    }//GEN-LAST:event_submitActionPerformed

    private void d_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_nameActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       tabledata1();
    }//GEN-LAST:event_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st = con.createStatement();
            int Id = Integer.parseInt(d_code.getText());
            
            String query = "DELETE FROM drug WHERE DrugCode = '"+Id+"'";
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            System.err.println(e);
        } 
        }
        reset();
        tableload();
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            st = con.createStatement();
            
            int Id = Integer.parseInt(d_code.getText());
            String Name = d_name.getText();
            String  Type = d_type.getText();
            int u_cost = Integer.parseInt(d_cost.getText());
            int tId = Integer.parseInt(t_Id.getText());
            
            
            String query = "UPDATE `drug` SET `Drug_Name`=?,`DrugType`=?,`Unit_Cost`=?,`Treatment_ID`=? WHERE `DrugCode`=?";
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, Name);
            pst.setString(2, Type);
            pst.setInt(3, u_cost);
            pst.setInt(4, tId);
            pst.setInt(5, Id);
            
            pst.executeUpdate();
            tableload();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private int xMouse, yMouse;
    
    private void movingMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_movingMouseDragged

    private void movingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_movingMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Drug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Drug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Drug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Drug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drug().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField d_code;
    private javax.swing.JTextField d_cost;
    private javax.swing.JTextField d_name;
    private javax.swing.JTextField d_type;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel moving;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTextField t_Id;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
