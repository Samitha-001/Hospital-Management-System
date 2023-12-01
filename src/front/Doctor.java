/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author asus
 */
public class Doctor extends javax.swing.JFrame {

//    Connection con0 = null;
//    Statement st0 = null;
//    PreparedStatement pst0 = null;
//    ResultSet rs0 = null;
    
    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    Connection con1 = null;
    Statement st1 = null;
    PreparedStatement pst1 = null;
    ResultSet rs1 = null;
    
    public Doctor() {
        initComponents();
//        con0 = DBConnect.getconnection();
        con = DBConnect.getconnection();
        con1 = DBConnect.getconnection();
        
        tableload();
        tableload1();
    }
 private void reset(){
        
        t_id.setText("");
        d_id.setText("");
        p_id.setText("");

        }
 
  private void reset1(){
        
        DgCode.setText("");
        DgName.setText("");
        desc.setText("");
        DrNO.setText("");
        pId.setText("");

        }
 
  public void tabledata(){
        
        int r  = table.getSelectedRow();
        
        String dId = table.getValueAt(r, 0).toString();
        String pID = table.getValueAt(r, 1).toString();
        String tID = table.getValueAt(r, 2).toString();
        
        
        
        d_id.setText(dId);
        p_id.setText(pID);
        t_id.setText(tID);
   

    }
  
  public void tabledata1(){
        
        int r  = table1.getSelectedRow();
        
        String DCode = table1.getValueAt(r, 0).toString();
        String DName = table1.getValueAt(r, 1).toString();
        String DESC = table1.getValueAt(r, 2).toString();
        String tDate = table1.getValueAt(r, 3).toString();
        String tTime = table1.getValueAt(r, 4).toString();
        String drno = table1.getValueAt(r, 5).toString();
        String PID = table1.getValueAt(r, 6).toString();
        
        
        DgCode.setText(DCode);
        DgName.setText(DName);
        if(DESC.equals("")){
             desc.setText("");
            }else{
        desc.setText(DESC);
        }
        d_date.setText(tDate);
        d_time.setText(tTime);
        DrNO.setText(drno);
        pId.setText(PID);

    }
  
  SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss"); 
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
            Date dte = new Date(); 
  
   
  
     public void tableload()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM doctor_performtreatment_patient";
            ResultSet rs =  st.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
    }
     
     
      
     public void tableload1()
    {
        try {
         
            st1 = con1.createStatement();
            String query = "SELECT * FROM diagnose";
            ResultSet rs1 =  st1.executeQuery(query);
            table1.setModel(DbUtils.resultSetToTableModel(rs1));
            
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        t_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        d_id = new javax.swing.JTextField();
        p_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dg_time = new javax.swing.JLabel();
        dg_date = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DrNO = new javax.swing.JTextField();
        DgCode = new javax.swing.JTextField();
        pId = new javax.swing.JTextField();
        DgName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        d_date = new javax.swing.JLabel();
        d_time = new javax.swing.JLabel();
        enter1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        update2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        moving = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(51, 102, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        t_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idActionPerformed(evt);
            }
        });
        jPanel2.add(t_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 130, 40));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Patient ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Doctor ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        enter.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        enter.setForeground(new java.awt.Color(51, 255, 0));
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        jPanel2.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 110, 40));

        reset.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 153, 0));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 110, 40));

        delete.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 110, 40));

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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 620, 280));

        d_id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        d_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_idActionPerformed(evt);
            }
        });
        jPanel2.add(d_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 40));

        p_id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        p_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_idActionPerformed(evt);
            }
        });
        jPanel2.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 130, 40));

        jLabel11.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Date");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Time");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Treatment ID");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        dg_time.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        dg_time.setText("Current Time");
        jPanel2.add(dg_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 110, 40));

        dg_date.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        dg_date.setText("Current Date");
        jPanel2.add(dg_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 100, 40));

        jTabbedPane1.addTab("Treatment", jPanel2);

        jTabbedPane2.setForeground(new java.awt.Color(51, 0, 51));
        jTabbedPane2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Diagnose Code");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Diagnose Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Description");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Date");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Doctor No:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Patient ID");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Time");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        DrNO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel4.add(DrNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, 30));

        DgCode.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel4.add(DgCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 150, 30));

        pId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel4.add(pId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, 30));

        DgName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel4.add(DgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 150, 30));

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane3.setViewportView(desc);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        d_date.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        d_date.setForeground(new java.awt.Color(51, 51, 51));
        d_date.setText("Current Date");
        jPanel4.add(d_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 90, 20));

        d_time.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        d_time.setForeground(new java.awt.Color(51, 51, 51));
        d_time.setText("Current Time");
        jPanel4.add(d_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 90, 20));

        enter1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        enter1.setForeground(new java.awt.Color(51, 255, 0));
        enter1.setText("Enter");
        enter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter1ActionPerformed(evt);
            }
        });
        jPanel4.add(enter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 40));

        delete1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delete1.setForeground(new java.awt.Color(0, 0, 0));
        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel4.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 120, 40));

        reset1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reset1.setForeground(new java.awt.Color(255, 153, 0));
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        jPanel4.add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 120, 40));

        update2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        update2.setForeground(new java.awt.Color(204, 0, 204));
        update2.setText("Update");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });
        jPanel4.add(update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 120, 40));

        jTabbedPane2.addTab("Inserting Data", jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.setSelectionBackground(new java.awt.Color(0, 255, 0));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table1);

        jPanel5.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab("Table", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Diagnose Details", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 780, 450));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("DOCTOR PERFOMANCE");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 290, 40));

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

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/home.jpg"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        moving.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 46, 46));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        moving.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 25, 25));

        jPanel6.add(moving, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
       try {
                
            st = con.createStatement();
            
            int D_ID = Integer.parseInt(d_id.getText());
            int P_ID = Integer.parseInt(p_id.getText());
            int T_ID = Integer.parseInt(t_id.getText());
             
 
            String query = "INSERT INTO `doctor_performtreatment_patient`(`DoctorID`, `PatientID`, `TreatmentID`, `Treatment_Date`, `Treatment_Time`) VALUES (?,?,?,?,?)";
            pst = con.prepareStatement(query);
            
            pst.setInt(1, D_ID);
            pst.setInt(2, P_ID);
            pst.setInt(3, T_ID);
            pst.setString(4, formatDate.format(dte));
            pst.setString(5, formatTime.format(dte));

            
            pst.execute();
            
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
       tableload();
    }//GEN-LAST:event_enterActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            
            st = con.createStatement();
            int d_Id = Integer.parseInt(d_id.getText());
            int p_Id = Integer.parseInt(p_id.getText());
            int t_Id = Integer.parseInt(t_id.getText());
            
            String query = "DELETE FROM doctor_performtreatment_patient WHERE DoctorID = '"+d_Id+"' AND PatientID = '"+p_Id+"' AND TreatmentID = '"+t_Id+"'";
            st.executeUpdate(query);
            reset();
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter Treatment ID");
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            System.err.println(e);
        }
        tableload();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void t_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        tabledata();
    }//GEN-LAST:event_tableMouseClicked

    private void enter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter1ActionPerformed
         try {
                
            st1 = con1.createStatement();
            
            int DGCODE = Integer.parseInt(DgCode.getText());
            String DGNAME = DgName.getText();
            String DESC = desc.getText();
            int Dno = Integer.parseInt(DrNO.getText());
            int PaId = Integer.parseInt(pId.getText());

            
            String query = "INSERT INTO `diagnose`(`Diagnose_Code`, `Diagnose_Name`, `Description`, `Diagnosis_Date`, `Diagnosis_Time`, `DoctorNo`, `PatientID`) VALUES (?,?,?,?,?,?,?)";
            pst1 = con1.prepareStatement(query);
            
            pst1.setInt(1, DGCODE);
            pst1.setString(2, DGNAME);
            pst1.setString(3, DESC);
            pst1.setString(4, formatDate.format(dte));
            pst1.setString(5, formatTime.format(dte));
            pst1.setInt(6, Dno);
            pst1.setInt(7, PaId);
            

            pst1.execute();
            
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
       tableload1();
    }//GEN-LAST:event_enter1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
         int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st1 = con1.createStatement();
            int Id = Integer.parseInt(DgCode.getText());
            
            String query = "DELETE FROM diagnose WHERE Diagnose_Code = '"+Id+"'";
            st1.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
        } 
        }
        reset1();
        tableload1();
    }//GEN-LAST:event_delete1ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        reset1();
    }//GEN-LAST:event_reset1ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       tabledata1();
    }//GEN-LAST:event_table1MouseClicked

    private void d_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_idActionPerformed

    private void p_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_idActionPerformed

    
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

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
         try {
            st1 = con1.createStatement();
            
            int Dgc = Integer.parseInt(DgCode.getText());
            String DgNm  = DgName.getText();
            String Des  = desc.getText();
            int DNO= Integer.parseInt(DrNO.getText());
            int PID= Integer.parseInt(pId.getText());
            
            String query = "UPDATE `diagnose` SET `Diagnose_Name`=?,`Description`=?,`DoctorNo`=?,`PatientID`=? WHERE `Diagnose_Code`=?";
            pst1 = con1.prepareStatement(query);
            
            
            pst1.setString(1, DgNm);
            pst1.setString(2, Des);
            pst1.setInt(3, DNO);
            pst1.setInt(4, PID);
            pst1.setInt(5, Dgc);
            
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        tableload1();
    }//GEN-LAST:event_update2ActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DgCode;
    private javax.swing.JTextField DgName;
    private javax.swing.JTextField DrNO;
    private javax.swing.JLabel d_date;
    private javax.swing.JTextField d_id;
    private javax.swing.JLabel d_time;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JTextArea desc;
    private javax.swing.JLabel dg_date;
    private javax.swing.JLabel dg_time;
    private javax.swing.JButton enter;
    private javax.swing.JButton enter1;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel moving;
    private javax.swing.JTextField pId;
    private javax.swing.JTextField p_id;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JTextField t_id;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JButton update2;
    // End of variables declaration//GEN-END:variables
}
