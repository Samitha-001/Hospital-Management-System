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
import java.sql.Time;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author asus
 */
public class nurseRecord extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    Connection con1 = null;
    Statement st1 = null;
    PreparedStatement pst1 = null;
    ResultSet rs1 = null;
    
    public nurseRecord() {
        initComponents();
         con = DBConnect.getconnection();
         con1 = DBConnect.getconnection();
         tableload();
         tableload1();
    }

    SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss"); 
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
            Date dte = new Date();  
    
    public void tabledata(){
        
        int r  = table.getSelectedRow();
        
        String p_id = table.getValueAt(r, 0).toString();
        String p_name = table.getValueAt(r, 1).toString();
        String p_type= table.getValueAt(r, 2).toString();
        String r_date = table.getValueAt(r, 3).toString();
        String r_time = table.getValueAt(r, 4).toString();
        String p_w = table.getValueAt(r, 5).toString();
        String p_bp = table.getValueAt(r, 6).toString();
        String p_tem = table.getValueAt(r, 7).toString();
        String p_pulse = table.getValueAt(r, 8).toString();
        String nu_no = table.getValueAt(r, 9).toString();
//        String dr_no = table.getValueAt(r, 10).toString();
        
        
        id.setText(p_id);
        name.setText(p_name);
        type.setSelectedItem(p_type);
        date.setText(r_date);
        time.setText(r_time);
        weight.setText(p_w);
        bp.setText(p_bp);
        temp.setText(p_tem);
        pulse.setText(p_pulse);
        n_no.setText(nu_no);
         if(table.getValueAt(r, 10).toString().equals("null")){
             d_no.setText("null");
            }else
        d_no.setText(table.getValueAt(r, 10).toString());
        

    }

    String SymPupdate;
    
    public void tabledata1(){
        
        int r  = table1.getSelectedRow();
        
        String PID = table1.getValueAt(r, 0).toString(); 
        String SymP = table1.getValueAt(r, 1).toString(); 
        
        SymPupdate = SymP;
        
        id.setText(PID);
        symp.setText(SymP);
       
        

    }
    
     public void tableload()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM patient ";
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
            String query = "SELECT * FROM patient_first_symptom ";
            ResultSet rs1 =  st1.executeQuery(query);
            table1.setModel(DbUtils.resultSetToTableModel(rs1));
            
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    }
            
    private void reset(){
        
        id.setText("");
        name.setText("");
        type.setSelectedIndex(0);
        weight.setText("");
        bp.setText("");
        temp.setText("");
        pulse.setText("");
        n_no.setText("");
        d_no.setText("");
        symp.setText("");
        
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        n_no = new javax.swing.JTextField();
        panel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        d_no = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        bp = new javax.swing.JTextField();
        temp = new javax.swing.JTextField();
        pulse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        symp = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Patient Record");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 230, 40));

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Date");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 110, 40));

        jLabel11.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Time");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, 40));

        date.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        date.setForeground(new java.awt.Color(0, 204, 204));
        date.setText("Current Date");
        jPanel7.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 120, 40));

        time.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        time.setForeground(new java.awt.Color(0, 204, 204));
        time.setText("Current Time");
        jPanel7.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 120, 40));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 420, 220));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n_no.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jPanel2.add(n_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 220, 30));

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Primarycare Doctor No:");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 40));

        d_no.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        panel1.add(d_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 210, 30));

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 370, 80));

        jLabel14.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 51));
        jLabel14.setText("Nurse No:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 40));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 420, 160));

        reset.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 204, 204));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel3.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 100, 40));

        update.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update.setForeground(new java.awt.Color(204, 0, 204));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 100, 40));

        delete.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 110, 40));

        search.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        search.setForeground(new java.awt.Color(255, 153, 0));
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 100, 40));

        submit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        submit.setForeground(new java.awt.Color(102, 255, 0));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel3.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 110, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Blood Pressure");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 40));

        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Temperature");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 40));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Symptom");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 40));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Weight");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 90, 40));

        weight.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel6.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 30));

        bp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel6.add(bp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 160, 30));

        temp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel6.add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 160, 30));

        pulse.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel6.add(pulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 160, 30));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Pulse");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 90, 40));

        symp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel6.add(symp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 170, 60));

        addBtn.setBackground(new java.awt.Color(51, 255, 0));
        addBtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel6.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 80, -1));

        jButton4.setBackground(new java.awt.Color(204, 0, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 80, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 420, 250));

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Patient ID");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 40));

        jLabel13.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Patient Type");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 40));

        id.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 230, 30));

        type.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "In_Patient", "Out_Patient" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel4.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 140, 30));

        name.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jPanel4.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 230, 30));

        jLabel16.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("Patient Name");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, 170));

        jTabbedPane1.addTab("Details", jPanel3);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 860, 540));

        jTabbedPane1.addTab("Table View", jPanel5);

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 870, 550));

        jTabbedPane1.addTab("Symptom Table", jPanel9);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 890, 590));

        jPanel8.setOpaque(false);
        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel8MouseDragged(evt);
            }
        });
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 25, 25));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/home.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 46, 46));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 25, 25));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            
            st = con.createStatement();
            
            int Id = Integer.parseInt(id.getText());
            String query = "SELECT * FROM patient";
            
            rs = st.executeQuery(query);
            while(rs.next()){
                
                if(Id == rs.getInt("Patient_ID")){
                    name.setText(rs.getString("Name"));
                    type.setSelectedItem(rs.getString("PatientType"));
                    date.setText(String.format("%tD", rs.getDate("FRecordDate")));
                    time.setText(String.format("%tD", rs.getDate("FRecordTime")));
                    weight.setText(String.valueOf(rs.getFloat("Weight")));
                    bp.setText(String.valueOf(rs.getFloat("Blood_Pressure")));
                    temp.setText(String.valueOf(rs.getFloat("Temperature")));
                    pulse.setText(rs.getString("Pulse"));
                    n_no.setText(String.format("%s", rs.getString("NurseNo")));
                    d_no.setText(String.format("%s", rs.getString("PrimaryDoctor_No")));
                }
            
            }
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    }//GEN-LAST:event_searchActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       
        
        try {
                
            st = con.createStatement();
            
            
            int ID = Integer.parseInt(id.getText());
            String Name = name.getText();
            String Type = (String) type.getSelectedItem();
            float Weight = Float.parseFloat(weight.getText());
            float BP = Float.parseFloat(bp.getText());
            float Temp = Float.parseFloat(temp.getText());
            int Pulse = Integer.parseInt(pulse.getText());
            int NNo = Integer.parseInt(n_no.getText());
            
            
            String query = "INSERT INTO `patient`(`Patient_ID`, `Name`, `PatientType`, `FRecordDate`, `FRecordTime`, `Weight`, `Blood_Pressure`, `Temperature`, `Pulse`, `NurseNo`, `PrimaryDoctor_No`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            
            pst = con.prepareStatement(query);
            
            
            pst.setInt(1, ID);
            pst.setString(2, Name);
            pst.setString(3, Type);
            pst.setString(4, formatDate.format(dte));
            pst.setString(5, formatTime.format(dte));
            pst.setFloat(6, Weight);
            pst.setFloat(7, BP);
            pst.setFloat(8, Temp);
            pst.setInt(9, Pulse);
            pst.setInt(10, NNo);
            if(d_no.getText().equals("")){
             pst.setNull(11, Types.INTEGER);
            }else
             pst.setInt(11, Integer.parseInt(d_no.getText()));

            pst.execute();
           
            
            JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULLY");
            tableload();
            if(type.getSelectedItem().equals("In_Patient")){
                In_patient ip = new In_patient();
                ip.setVisible(true);
            }else{
                out_patient op = new out_patient();
                op.setVisible(true);
            }
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
    }//GEN-LAST:event_submitActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            
            st = con.createStatement();
            st1 = con1.createStatement();
            int Id = Integer.parseInt(id.getText());
            String Symp = symp.getText();
            
            String query = "DELETE FROM patient WHERE Patient_ID = '"+Id+"'";
            String query1 = "DELETE FROM patient_first_symptom WHERE Patient_ID = '"+Id+"' AND symptom = '"+Symp+"'";
            
            st.executeUpdate(query);
            st1.executeUpdate(query1);
            reset();
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter Patient ID");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
        }
        tableload();
        tableload1();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         try {
            st = con.createStatement();
             
             
            int Id = Integer.parseInt(id.getText());
            String Name = name.getText();
            String Type = (String) type.getSelectedItem();
//            long pDate = Integer.parseInt(formatDate.format(dte));
//            long pTime = Integer.parseInt(formatTime.format(dte));
            float pWeight = Float.parseFloat(weight.getText());
            float pBP = Float.parseFloat(bp.getText());
            float pTemp = Float.parseFloat(temp.getText());
            int pPulse = Integer.parseInt(pulse.getText());
            int NNO = Integer.parseInt(n_no.getText());
//            int DNO = Integer.parseInt(d_no.getText());
            
            String query = "UPDATE `patient` SET `Name`=?,`PatientType`=?,`Weight`=?,`Blood_Pressure`=?,`Temperature`=?,`Pulse`=?,`NurseNo`=?,`PrimaryDoctor_No`=? WHERE `Patient_ID`=?";
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, Name);
            pst.setString(2, Type);
            pst.setFloat(3, pWeight);
            pst.setFloat(4, pBP);
            pst.setFloat(5, pTemp);
            pst.setInt(6, pPulse);
            pst.setInt(7, NNO);
            
           if(d_no.getText().equals("")|| Type.equals("Out_Patient")){
             pst.setNull(8, Types.INTEGER);
            }else
             pst.setInt(8, Integer.parseInt(d_no.getText()));
           
            pst.setInt(9, Id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            tableload();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter ID and Search for details");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
                
            
        }
    }//GEN-LAST:event_updateActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if(type.getSelectedItem().equals("In_Patient")){
            panel1.setVisible(true);
        }else
             panel1.setVisible(false);
    }//GEN-LAST:event_typeActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
       
        try {
            
         st1 = con1.createStatement();
         
         int ID = Integer.parseInt(id.getText());
         String SY = symp.getText();
        
        String query1 = "INSERT INTO `patient_first_symptom`(`Patient_ID`, `Symptom`) VALUES (?,?)";
          
        pst1 = con1.prepareStatement(query1);
        
        pst1.setInt(1, ID);
        pst1.setString(2, SY);
                
         pst1.execute();
         JOptionPane.showMessageDialog(null, "Added");
         tableload1();
         
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        tabledata();
    }//GEN-LAST:event_tableMouseClicked

    private int xMouse, yMouse;
    
    private void jPanel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel8MouseDragged

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel8MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       tabledata1();
    }//GEN-LAST:event_table1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nurseDashboard nd = new nurseDashboard();
       nd.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try {
            st = con.createStatement();
             
             
            int Id = Integer.parseInt(id.getText());
            String SymP = symp.getText();
            
            String query = "UPDATE `patient_first_symptom` SET `Symptom`=? WHERE `Patient_ID`=? AND `Symptom`=? ";
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, SymP);
            pst.setInt(2, Id);
            pst.setString(3, SymPupdate);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            tableload();
            tableload1();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter ID and Search for details");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
                
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(nurseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nurseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nurseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nurseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nurseRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField bp;
    private javax.swing.JTextField d_no;
    private javax.swing.JLabel date;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField n_no;
    private javax.swing.JTextField name;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField pulse;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JButton submit;
    private javax.swing.JTextField symp;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JTextField temp;
    private javax.swing.JLabel time;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
