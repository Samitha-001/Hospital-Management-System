package front;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class dialy_record extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    Resultset rs = null;
    PreparedStatement pst = null;
    
    Connection con1 = null;
    Statement st1 = null;
    Resultset rs1 = null;
    PreparedStatement pst1 = null;
    
    public dialy_record() {
        initComponents();
        con = DBConnect.getconnection();
        con1 = DBConnect.getconnection();
        tableload();
        tableload1();
        
    }
 private void reset(){
        
        p_id.setText("");
        rec_Id.setText("");
        n_No.setText("");
        p_pulse.setText("");
        p_temp.setText("");
        p_weigh.setText("");
        p_bp.setText("");
        p_date.setText("");
        p_time.setText("");
        symp.setText("");
        }
 
        SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss"); 
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
            Date dte = new Date(); 
    
    public void tableload()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM daily_record";
            ResultSet rs =  st.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    } 
    
    public void tableload1()
    {
        try {
         
            st1 = con1.createStatement();
            String query = "SELECT * FROM daily_symptom";
            ResultSet rs1 =  st1.executeQuery(query);
            table1.setModel(DbUtils.resultSetToTableModel(rs1));
            
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
    } 
    
     public void tabledata(){
        
        int r  = table.getSelectedRow();
        
        String RecID = table.getValueAt(r, 0).toString();
        String PID = table.getValueAt(r, 1).toString();
        String DATE = table.getValueAt(r, 2).toString();
        String TIME = table.getValueAt(r, 3).toString();
        String Pulse = table.getValueAt(r, 4).toString();
        String BP = table.getValueAt(r, 5).toString();
        String TEMP = table.getValueAt(r, 6).toString();
        String WEIGH = table.getValueAt(r, 7).toString();
        String N_No = table.getValueAt(r, 8).toString();
        
        rec_Id.setText(RecID);
        p_id.setText(PID);
        p_date.setText(DATE);
        p_time.setText(TIME);
        p_pulse.setText(Pulse);
        p_bp.setText(BP);
        p_temp.setText(TEMP);
        p_weigh.setText(WEIGH);
        n_No.setText(N_No);
    }
     String temp;
     
      public void tabledata1(){
        
        int r  = table1.getSelectedRow();
        
        String RecID = table1.getValueAt(r, 0).toString();
        String Symp = table1.getValueAt(r, 1).toString();
      
        temp = Symp;
        rec_Id.setText(RecID);
        symp.setText(Symp);
      
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        n_No = new javax.swing.JTextField();
        p_pulse = new javax.swing.JTextField();
        p_temp = new javax.swing.JTextField();
        p_weigh = new javax.swing.JTextField();
        p_bp = new javax.swing.JTextField();
        rec_Id = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        p_id = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        symp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        p_time = new javax.swing.JLabel();
        p_date = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panel00 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Nurse No:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 110, 50));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Temperature:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 140, 50));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Pulse:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 60, 50));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("Patient ID:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 110, 40));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("Blood Pressure:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 50));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("Weight:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 90, 50));

        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("Date:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 60, 50));
        jPanel2.add(n_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, 30));
        jPanel2.add(p_pulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 140, 30));
        jPanel2.add(p_temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 140, 30));
        jPanel2.add(p_weigh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, 30));
        jPanel2.add(p_bp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 140, 30));
        jPanel2.add(rec_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 140, 30));

        submit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        submit.setForeground(new java.awt.Color(153, 204, 0));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 90, 30));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 0));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 90, 30));

        delete.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 90, 30));
        jPanel2.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 30));

        update.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update.setForeground(new java.awt.Color(204, 0, 204));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 90, 30));

        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("Time:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 60, 50));

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("Symptom");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 50));
        panel1.add(symp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 280, 140));

        p_time.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        p_time.setText("Current Time");
        jPanel2.add(p_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 100, 30));

        p_date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        p_date.setText("Current Date");
        jPanel2.add(p_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 100, 30));

        jLabel11.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 102));
        jLabel11.setText("Record ID:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, 50));

        jTabbedPane1.addTab("Information", jPanel2);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 22, 790, 430));

        jTabbedPane1.addTab("Table View", jPanel1);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane2.setViewportView(table1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 22, 640, 400));

        jTabbedPane1.addTab("Symptoms", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 820, 490));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Daily Record");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 210, -1));

        panel00.setBackground(new java.awt.Color(153, 153, 153));
        panel00.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel00MouseDragged(evt);
            }
        });
        panel00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel00MousePressed(evt);
            }
        });
        panel00.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel00.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 25, 25));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/home.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel00.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 46, 46));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/back.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel00.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 25, 25));

        getContentPane().add(panel00, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(rec_Id.getText().isEmpty() || p_id.getText().isEmpty() || p_pulse.getText().isEmpty() || p_bp.getText().isEmpty() || p_temp.getText().isEmpty() || p_weigh.getText().isEmpty() || n_No.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {     
            st = con.createStatement();
            
            int RecID = Integer.parseInt(rec_Id.getText());
            int pid = Integer.parseInt(p_id.getText());
            int pulse = Integer.parseInt(p_pulse.getText());
            float BP = Float.parseFloat(p_bp.getText());
            float Weight = Float.parseFloat(p_weigh.getText());
            float Temp = Float.parseFloat(p_temp.getText());
            int NNO = Integer.parseInt(n_No.getText());
            
            
            String query = "INSERT INTO `daily_record`(`Record_ID`, `InPatient_ID`, `Date`, `Time`, `Pulse`, `Blood_Pressure`, `Weight`, `Temperature`, `NurseNo`) VALUES (?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            
            pst.setInt(1, RecID);
            pst.setInt(2, pid);
            pst.setString(3, formatDate.format(dte));
            pst.setString(4, formatTime.format(dte));
            pst.setInt(5, pulse);
            pst.setFloat(6, BP);
            pst.setFloat(7, Weight);
            pst.setFloat(8, Temp);
            pst.setInt(9, NNO); 
            

            
            pst.execute();
            tableload();
            panel1.setVisible(true);
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

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st = con.createStatement();
            int Id = Integer.parseInt(rec_Id.getText());
            
            String query = "DELETE FROM daily_record WHERE Record_ID = '"+Id+"'";
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
        } 
        }
        reset();
        tableload();
        tableload1();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            st = con.createStatement();
            
            int RecID = Integer.parseInt(rec_Id.getText());
            int pid = Integer.parseInt(p_id.getText());
            int pulse = Integer.parseInt(p_pulse.getText());
            float BP = Float.parseFloat(p_bp.getText());
            float Weight = Float.parseFloat(p_weigh.getText());
            float Temp = Float.parseFloat(p_temp.getText());
            int nno = Integer.parseInt(n_No.getText());
            
            String query = "UPDATE `daily_record` SET `InPatient_ID`=?,`Date`=?,`Time`=?,`Pulse`=?,`Blood_Pressure`=?,`Weight`=?,`Temperature`=?,`NurseNo`=? WHERE `Record_ID`=?";
            pst = con.prepareStatement(query);
            
            
            pst.setInt(1, pid);
            pst.setString(2, formatDate.format(dte));
            pst.setString(3, formatTime.format(dte));
            pst.setInt(4, pulse);
            pst.setFloat(5, BP);
            pst.setFloat(6, Weight);
            pst.setFloat(7, Temp);
            pst.setInt(8, nno);
            pst.setInt(9, RecID);
            
            pst.executeUpdate();
            tableload();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
          JOptionPane.showMessageDialog(null, "Only permission to update patient detials");
            
            try {
                
              st = con.createStatement();
            int RecID = Integer.parseInt(rec_Id.getText());
            int pulse = Integer.parseInt(p_pulse.getText());
            float BP = Float.parseFloat(p_bp.getText());
            float Weight = Float.parseFloat(p_weigh.getText());
            float Temp = Float.parseFloat(p_temp.getText());

            String query = "UPDATE `daily_record` SET `Pulse`=?,`Blood_Pressure`=?,`Weight`=?,`Temperature`=? WHERE `Record_ID`=?";
            pst = con.prepareStatement(query);
            
           
            pst.setInt(1, pulse);
            pst.setFloat(2, BP);
            pst.setFloat(3, Weight);
            pst.setFloat(4, Temp);
            pst.setInt(5, RecID);

            
            pst.executeUpdate();
            tableload();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");        
                
            } catch (Exception ex) {
            }
            
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            st1 = con1.createStatement();
            
            int recID = Integer.parseInt(rec_Id.getText());
            String SYMP = symp.getText();
            
            String q1 = "INSERT INTO `daily_symptom`(`Record_ID`, `Symptom`) VALUES (?,?)";
            pst1 = con1.prepareStatement(q1);
            
            pst1.setInt(1, recID);
            pst1.setString(2, SYMP);
            
            pst1.execute();
            JOptionPane.showMessageDialog(null, "Added");
            tableload1();
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        tabledata();
    }//GEN-LAST:event_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        reset();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       tabledata1();
    }//GEN-LAST:event_table1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            st1 = con1.createStatement();
            
            int RecID = Integer.parseInt(rec_Id.getText());
            String Symp = symp.getText();
            
            String query = "UPDATE `daily_symptom` SET `Symptom`=? WHERE `Record_ID`=? AND `Symptom`=? ";
            pst1 = con1.prepareStatement(query);
            
            
            pst1.setString(1, Symp);
            pst1.setInt(2, RecID);
            pst1.setString(3, temp);
            
            pst1.executeUpdate();
            tableload1();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private int xMouse, yMouse;
    
    private void panel00MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel00MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_panel00MouseDragged

    private void panel00MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel00MousePressed
       xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panel00MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       Home hm = new Home();
       hm.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       nurseDashboard nd = new nurseDashboard();
       nd.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(dialy_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialy_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialy_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialy_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dialy_record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField n_No;
    private javax.swing.JTextField p_bp;
    private javax.swing.JLabel p_date;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_pulse;
    private javax.swing.JTextField p_temp;
    private javax.swing.JLabel p_time;
    private javax.swing.JTextField p_weigh;
    private javax.swing.JPanel panel00;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField rec_Id;
    private javax.swing.JButton submit;
    private javax.swing.JTextField symp;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
