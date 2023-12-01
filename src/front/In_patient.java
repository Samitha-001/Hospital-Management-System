package front;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Types;
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
 * @author Asus VivoBook
 */
public class In_patient extends javax.swing.JFrame {

   Connection con = null;
    Statement st = null;
    Resultset rs = null;
    PreparedStatement pst = null;
    
    Connection con1 = null;
    Statement st1 = null;
    Resultset rs1 = null;
    PreparedStatement pst1 = null;
    
    Connection con2 = null;
    Statement st2 = null;
    Resultset rs2 = null;
    PreparedStatement pst2 = null;
    
    public In_patient() {
        initComponents();
        con = DBConnect.getconnection();
        con1 = DBConnect.getconnection();
        tableload();
        INS();
        INSBR();
        System.out.println(formatTime.format(dte));
        panel2.setVisible(true);
    }

    private void reset(){
        
        id.setText("");
        bDate.setText("");
        aDate.setText("");
        aTime.setText("");
        dDate.setText("");
        dTime.setText("");
        ins.setSelectedItem("");
        ins_br.setSelectedItem("");
        wNo.setText("");
        bNo.setText("");
        }
    
    public void tableload()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM in_patient";
            ResultSet rs =  st.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(java.sql.SQLSyntaxErrorException e){
            
            try {
                st = con.createStatement();
            String query = "SELECT `Patient_ID`, `Birth_Date`, `Admit_Date`, `Admit_Time`, `Discharge_Date`, `Discharge_Time`, `WardNo`, `BedNo` FROM in_patient";
            ResultSet rs =  st.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception ex) {
            }
            
            
        } catch (Exception e) {
        }
    } 
    
    SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss"); 
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
            Date dte = new Date();  
    
     public void tabledata1(){
        
        int r  = table.getSelectedRow();
        
        String Id = table.getValueAt(r, 0).toString();
        String  BDate= table.getValueAt(r, 1).toString();
        String ADate = table.getValueAt(r, 2).toString();
        String ATime = table.getValueAt(r, 3).toString();
//        String DDate = table.getValueAt(r, 4).toString();
//        String DTime = table.getValueAt(r, 5).toString();
//        String INS = table.getValueAt(r, 6).toString();
//        String BR = table.getValueAt(r, 7).toString();
        String WNo = table.getValueAt(r, 8).toString();
        String BNo = table.getValueAt(r, 9).toString();
        
        
        id.setText(Id);
        bDate.setText(BDate);
        aDate.setText(ADate);
        aTime.setText(ATime);
        
        
        if(table.getValueAt(r, 4) == null){
             dDate.setText("");

        }else{
             dDate.setText(table.getValueAt(r, 4).toString()); 

        }
        if(table.getValueAt(r, 5) == null){
             dTime.setText("");

        }else{
             dTime.setText(table.getValueAt(r, 5).toString()); 

        }  
       if(table.getValueAt(r, 6) == null){
             ins.setSelectedItem("");
             System.out.println("Yes INS");
        }else{
             ins.setSelectedItem(table.getValueAt(r, 6).toString());
             System.out.println("No Ins");
        }
        if( table.getValueAt(r, 7) == null){
             ins_br.setSelectedItem("");
             System.out.println("Yes BR");
        }else{
             ins_br.setSelectedItem(table.getValueAt(r, 7).toString()); 
             System.out.println("No BR");
        }
        wNo.setText(WNo);
        bNo.setText(BNo);
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
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        bDate = new javax.swing.JTextField();
        dDate = new javax.swing.JTextField();
        dTime = new javax.swing.JTextField();
        wNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bNo = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        aTime = new javax.swing.JLabel();
        aDate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        ins = new javax.swing.JComboBox<>();
        ins_br = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        branch = new javax.swing.JButton();
        ins_sub = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("INPATIENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Patient ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Birth Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Admit Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Discharge Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Discharge Time");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Ward Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 180, -1));

        id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 160, 30));

        bDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bDate.setText("yyyy/mm/dd");
        bDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bDateFocusLost(evt);
            }
        });
        bDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDateActionPerformed(evt);
            }
        });
        jPanel1.add(bDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 150, 30));

        dDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dDate.setText("yyyy/mm/dd");
        dDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dDateFocusLost(evt);
            }
        });
        jPanel1.add(dDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 170, 30));

        dTime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dTime.setText("HH:mm:ss");
        dTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dTimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dTimeFocusLost(evt);
            }
        });
        jPanel1.add(dTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 150, 30));

        wNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wNoActionPerformed(evt);
            }
        });
        jPanel1.add(wNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 150, 30));

        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Bed Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 174, -1));

        bNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNoActionPerformed(evt);
            }
        });
        jPanel1.add(bNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 120, 30));

        reset.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 102, 0));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 90, -1));

        submit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        submit.setForeground(new java.awt.Color(102, 255, 0));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 90, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 432, 790, 300));

        delete.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 90, -1));

        Update.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Update.setForeground(new java.awt.Color(204, 0, 204));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 90, -1));

        jLabel11.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Admit Time");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        aTime.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        aTime.setForeground(new java.awt.Color(0, 153, 153));
        aTime.setText("Current Time");
        jPanel1.add(aTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 110, 20));

        aDate.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        aDate.setForeground(new java.awt.Color(0, 153, 153));
        aDate.setText("Current Date");
        jPanel1.add(aDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 110, 20));

        jButton1.setText("Add Insurance Company");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insActionPerformed(evt);
            }
        });
        panel2.add(ins, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 107, -1));

        ins_br.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        ins_br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ins_brActionPerformed(evt);
            }
        });
        panel2.add(ins_br, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 107, -1));

        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Insurance Company");
        panel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Company Branch");
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        branch.setText("Add a branch");
        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });
        panel2.add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        ins_sub.setText("Subscriber");
        ins_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ins_subActionPerformed(evt);
            }
        });
        panel2.add(ins_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 510, 100));

        jPanel2.setOpaque(false);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 25, 25));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/home.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 46, 46));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void wNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wNoActionPerformed

    private void bDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bDateActionPerformed

    private void insActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insActionPerformed
        
       
       
    }//GEN-LAST:event_insActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       if(id.getText().isEmpty() || bDate.getText().isEmpty()  || wNo.getText().isEmpty() || bNo.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {     
            st = con.createStatement();
            
            int Id = Integer.parseInt(id.getText());
            long Birthday = Date.parse(bDate.getText());
            java.sql.Date iBirthdate = new java.sql.Date(Birthday);
            String Ddate = dDate.getText();
            String Dtime = dTime.getText();
            
            
//            String INS = ins.getSelectedItem().toString();
//            String BR = ins_br.getSelectedItem().toString();
            int WNO = Integer.parseInt(wNo.getText());
            int BNO = Integer.parseInt(bNo.getText());
            
            
            String query = "INSERT INTO `in_patient`(`Patient_ID`, `Birth_Date`, `Admit_Date`, `Admit_Time`, `Discharge_Date`, `Discharge_Time`, `Insurance_Company`, `I_BranchName`, `WardNo`, `BedNo`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            
            pst.setInt(1, Id);
            pst.setDate(2, iBirthdate);
            pst.setString(3, formatDate.format(dte));
            pst.setString(4, formatTime.format(dte));
            
            if(Ddate.equals("") && Dtime.equals("") ){
             pst.setNull(5, java.sql.Types.DATE);
             pst.setNull(6, java.sql.Types.TIME);
            }else{
//                long Datetemp = Date.parse(Ddate);
//                java.sql.Date DDATE = new java.sql.Date(Datetemp);
            pst.setString(5,  Ddate);
//            long Timetemp = Time.parse(Dtime);
//                java.sql.Time DTIME = new java.sql.Time(Timetemp);
            pst.setString(6,  Dtime);
            }
            
            if(clicked_ins_button!=1){
                pst.setNull(7, Types.VARCHAR);
                pst.setNull(8, Types.VARCHAR);
                System.out.println("error1");
            }else{
                pst.setString(7, ins.getSelectedItem().toString());
                pst.setString(8, ins_br.getSelectedItem().toString());
            }
                
            pst.setInt(9, WNO);
            pst.setInt(10, BNO);
            

            System.out.println("ins "+ins.getSelectedItem());
            System.out.println("branch "+ins_br.getSelectedItem());
            pst.execute();
            tableload();
            
            JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULLY");
            
            Emergency ib = new Emergency();
            ib.setVisible(true);
            
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
    }//GEN-LAST:event_submitActionPerformed
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st = con.createStatement();
            int Id = Integer.parseInt(id.getText());
            
            String query = "DELETE FROM in_patient WHERE Patient_ID = '"+Id+"'";
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
    }//GEN-LAST:event_deleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            st = con.createStatement();
            
            int Id = Integer.parseInt(id.getText());
//            long Birthday = Date.parse(bDate.getText());
//            java.sql.Date sBirthdate = new java.sql.Date(Birthday);
//            long Adate = Integer.parseInt(formatDate.format(dte));
//            long ATime = Integer.parseInt(formatTime.format(dte));
//            long DisDate = Date.parse(dDate.getText());
//            java.sql.Date DDate = new java.sql.Date(DisDate);
//            long DisTime = Date.parse(dTime.getText());
//            java.sql.Time DTime = new java.sql.Time(DisTime);
            String  INS = ins.getSelectedItem().toString();
            String  BR = ins_br.getSelectedItem().toString();
            int WNO = Integer.parseInt(wNo.getText());
            int BNO = Integer.parseInt(bNo.getText());
            
            
            String query = "UPDATE `in_patient` SET `Birth_Date`=?, `Discharge_Date`=?,`Discharge_Time`=?,`Insurance_Company`=?,`I_BranchName`=?,`WardNo`=?,`BedNo`=? WHERE `Patient_ID`=?";
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, bDate.getText());
//            pst.setLong(2, Adate);
//            pst.setLong(3, ATime);
//            pst.setString(2, dDate.getText());
//            pst.setString(3, dTime.getText());
            if(dDate.getText() == null && dTime.getText() == null){
             pst.setNull(2, java.sql.Types.DATE);
             pst.setNull(3, java.sql.Types.TIME);
            }else{
//                long Datetemp = Date.parse(Ddate);
//                java.sql.Date DDATE = new java.sql.Date(Datetemp);
            pst.setString(2,  dDate.getText());
//            long Timetemp = Time.parse(Dtime);
//                java.sql.Time DTIME = new java.sql.Time(Timetemp);
            pst.setString(3,  dTime.getText());
            }
            pst.setString(4, INS);
            pst.setString(5, BR);
            pst.setInt(6, WNO);
            pst.setInt(7, BNO);
            pst.setInt(8, Id);
            
            pst.executeUpdate();
            tableload();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
        
    }//GEN-LAST:event_resetActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        tabledata1();
    }//GEN-LAST:event_tableMouseClicked

    private void INS(){
    
    try {
            st1 = con.createStatement();
           
  
            String query = "SELECT Company_Name FROM insurance_company";
            
            
            ResultSet rs1 =  st1.executeQuery(query);
          
                ins.addItem("");
            while(rs1.next()){
                String cName = rs1.getString("Company_Name");
                ins.addItem(cName); 
            
                
            }
   
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (SQLException e) {
        }
    
    }    
    
    private void INSBR(){
    
    try {
            st2 = con.createStatement();
             String selected = ins.getSelectedItem().toString();
            String query1 = "SELECT DISTINCT Branch_Name  FROM insurance_branch WHERE Company_Name = '"+selected+"' ";
             ResultSet rs2 =  st2.executeQuery(query1);
             
             
             
            while(rs2.next()){
                
                String bName = rs2.getString("Branch_Name");
                ins_br.addItem(bName);
            }
        } catch (Exception e) {
        }
        
    }
    int clicked_ins_button;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        panel2.setVisible(true);
        INS();
        clicked_ins_button = 1;
//        try {
//            st1 = con.createStatement();
//           
//  
//            String query = "SELECT Company_Name FROM insurance_company";
//            
//            
//            ResultSet rs1 =  st1.executeQuery(query);
//          
//                ins.addItem("");
//            while(rs1.next()){
//                String cName = rs1.getString("Company_Name");
//                ins.addItem(cName); 
//            
//                
//            }
//   
//        }catch(java.sql.SQLSyntaxErrorException e){
//            JOptionPane.showMessageDialog(this, "Insufficient Permission");
//        } catch (SQLException e) {
//        }
    }//GEN-LAST:event_jButton1ActionPerformed
        private int xMouse, yMouse;
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bNoActionPerformed

    private void ins_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ins_brActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ins_brActionPerformed

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        
        INSBR();
//        try {
//            st2 = con.createStatement();
//             String selected = ins.getSelectedItem().toString();
//            String query1 = "SELECT DISTINCT Branch_Name  FROM insurance_branch WHERE Company_Name = '"+selected+"' ";
//             ResultSet rs2 =  st2.executeQuery(query1);
//             
//             
//             
//            while(rs2.next()){
//                
//                String bName = rs2.getString("Branch_Name");
//                ins_br.addItem(bName);
//            }
//        } catch (Exception e) {
//        }

    }//GEN-LAST:event_branchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bDateFocusGained
       if(bDate.getText().equals("yyyy/mm/dd")){
            bDate.setText("");
       }
    }//GEN-LAST:event_bDateFocusGained

    private void bDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bDateFocusLost
        if(bDate.getText().equals("")){
            bDate.setText("yyyy/mm/dd");
       }
    }//GEN-LAST:event_bDateFocusLost

    private void dDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dDateFocusGained
//        if(dDate.getText().equals("yyyy/mm/dd")){
//            dDate.setText("");
//        }
    }//GEN-LAST:event_dDateFocusGained

    private void dDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dDateFocusLost
//        if(dDate.getText().equals("")){
//            dDate.setText("yyyy/mm/dd");
//        }
    }//GEN-LAST:event_dDateFocusLost

    private void dTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dTimeFocusGained
//        if(dTime.getText().equals("HH:mm:ss")){
//            dTime.setText("");
//        }
    }//GEN-LAST:event_dTimeFocusGained

    private void dTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dTimeFocusLost
//       if(dTime.getText().equals("")){
//            dTime.setText("HH:mm:ss");
//        }
    }//GEN-LAST:event_dTimeFocusLost

    private void ins_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ins_subActionPerformed
        ins_subscriber insub = new ins_subscriber();
        insub.setVisible(true);
    }//GEN-LAST:event_ins_subActionPerformed

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
            java.util.logging.Logger.getLogger(In_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(In_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(In_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(In_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new In_patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JLabel aDate;
    private javax.swing.JLabel aTime;
    private javax.swing.JTextField bDate;
    private javax.swing.JTextField bNo;
    private javax.swing.JButton branch;
    private javax.swing.JTextField dDate;
    private javax.swing.JTextField dTime;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> ins;
    private javax.swing.JComboBox<String> ins_br;
    private javax.swing.JButton ins_sub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    private javax.swing.JTextField wNo;
    // End of variables declaration//GEN-END:variables
}
