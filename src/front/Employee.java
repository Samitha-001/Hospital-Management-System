/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author asus
 */
public class Employee extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    Connection con1 = null;
    Statement st1 = null;
    PreparedStatement pst1 = null;
    ResultSet rs1 = null;
    
    Connection con2 = null;
    Statement st2 = null;
    PreparedStatement pst2 = null;
    ResultSet rs2 = null;
    
    Connection con3 = null;
    Statement st3 = null;
    PreparedStatement pst3 = null;
    ResultSet rs3 = null;
    
    DBConnect tl = new DBConnect();
    
    int FullCnt;
    int PartCnt;
    int NonmCnt;
    
    public Employee() {
        initComponents();
        
       
        con = DBConnect.getconnection();
        con1 = DBConnect.getconnection();
        con2 = DBConnect.getconnection();
        con3 = DBConnect.getconnection();
               
        
          FullCnt = countFull();
          PartCnt = countPart();
          NonmCnt = Nonmcnt();
          System.out.println(FullCnt + "\n" + PartCnt + "\n" + NonmCnt);
         tableload();  
         tableload1(); 
         
        panel1.setVisible(false);
                
    }
  
    
    
    
//    public void staus(){
//        int fCount=0;
//        int pCount=0;
//       
//        try {
//            st1 = con1.createStatement();
//            
//            String q1 = "SELECT COUNT(*) FROM employee GROUP BY Status";
//            rs1 = st1.executeQuery(q1);
//         
//         while(rs1.next()){
//             
//            pCount = Integer.parseInt(rs.getString("Status"));
//            
//        }
//            System.out.println(pCount);
//            
//            
//        } catch (Exception e) {
//        }
//    
//    
//    }
    
    
    public void tabledata1(){
        
        int r  = table.getSelectedRow();
        
        String emp = table.getValueAt(r, 0).toString();
        String e_name = table.getValueAt(r, 1).toString();
        String e_add = table.getValueAt(r, 2).toString();
//        String e_contact = table.getValueAt(r, 3).toString();
        String e_status = table.getValueAt(r, 4).toString();
        String e_type = table.getValueAt(r, 5).toString();

        
        id.setText(emp);
        name.setText(e_name);
        if(e_add.equalsIgnoreCase("null")){
            address.setText("");   
        }else{
            address.setText(e_add);
        }
        
        if(table.getValueAt(r, 3).toString().equals("null")){
            try {
                pst.setNull(r, Types.INTEGER);
            } catch (SQLException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        {
         contact.setText(table.getValueAt(r, 3).toString());   
        }
        status.setSelectedItem(e_status);
        type.setSelectedItem(e_type);

    }

    public void tabledata2(){
        
        int r  = table1.getSelectedRow();
        
        String emp = table1.getValueAt(r, 0).toString();
        String no = table1.getValueAt(r, 1).toString();
        String HRs = table1.getValueAt(r, 2).toString();
        
        id.setText(emp);
        pc_unit.setText(no);
        hrs.setText(HRs);   
    }
    
     public void tableload()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM employee";
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
         
            st2 = con2.createStatement();
            String query = "SELECT * FROM employee_assign_patientcare";
            ResultSet rs2 =  st2.executeQuery(query);
            table1.setModel(DbUtils.resultSetToTableModel(rs2));
            
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    }
    
private void reset(){
        
        id.setText("");
        name.setText("");
        address.setText("");
        contact.setText("");
        status.setSelectedIndex(0);
        type.setSelectedIndex(0);
        pc_unit.setText("");
        hrs.setText("");
        }

       

        private int countFull(){
            int cnt = 0;
            try {
              st = con.createStatement();
               String q1 = "select count(*) from employee where Status='Full'"; 
                rs = st.executeQuery(q1);
                
                rs.next();
                 cnt = rs.getInt(1);
                
                
                
            } catch (Exception e) {
            }
        return cnt;
        }
        
        private int countPart(){
            int cnt = 0;
            try {
              st = con.createStatement();
               String q1 = "select count(*) from employee where Status='Part'"; 
                rs = st.executeQuery(q1);
                
                rs.next();
                 cnt = rs.getInt(1);
                
                
                
            } catch (Exception e) {
            }
        return cnt;
        }
        
        private int Nonmcnt(){
            int cnt = 0;
            try {
              st = con.createStatement();
               String q1 = "select count(*) from non_medical_staff"; 
                rs = st.executeQuery(q1);
                
                rs.next();
                 cnt = rs.getInt(1);
                
                
                
            } catch (Exception e) {
            }
        return cnt;
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
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pc_unit = new javax.swing.JTextField();
        hrs = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        assign = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        moving = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Employee ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 40));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 40));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, 40));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Contact Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, 40));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 120, 40));

        id.setBackground(new java.awt.Color(0, 0, 51));
        id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 240, 30));

        name.setBackground(new java.awt.Color(0, 0, 51));
        name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 240, 30));

        address.setBackground(new java.awt.Color(0, 0, 51));
        address.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 240, 30));

        contact.setBackground(new java.awt.Color(0, 0, 51));
        contact.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 240, 30));

        status.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Full", "Part" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 140, 30));

        type.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Medical", "Nonmedical" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 140, 30));

        search.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        search.setForeground(new java.awt.Color(255, 102, 0));
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 100, 30));

        submit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        submit.setForeground(new java.awt.Color(102, 255, 0));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 100, 30));

        delete.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 100, 30));

        update.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update.setForeground(new java.awt.Color(204, 0, 204));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 100, 30));

        reset.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 204, 204));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 100, 30));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("EMPLOYEE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 170, 30));

        jLabel11.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Type");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 120, 40));

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Primary Care Unit No");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 40));
        panel1.add(pc_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 110, 40));
        panel1.add(hrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 110, 40));

        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Hrs per week");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 40));

        assign.setBackground(new java.awt.Color(102, 255, 0));
        assign.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        assign.setForeground(new java.awt.Color(0, 0, 0));
        assign.setText("Assign");
        assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignActionPerformed(evt);
            }
        });
        panel1.add(assign, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 80, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 80, -1));

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 80, -1));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 450, 110));

        moving.setBackground(new java.awt.Color(153, 153, 153));
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

        javax.swing.GroupLayout movingLayout = new javax.swing.GroupLayout(moving);
        moving.setLayout(movingLayout);
        movingLayout.setHorizontalGroup(
            movingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        movingLayout.setVerticalGroup(
            movingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(moving, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 930, 80));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 25, 25));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 25, 25));

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

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

        jTabbedPane1.addTab("Employee", jScrollPane1);

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

        jTabbedPane1.addTab("Assigning PatientCare", jScrollPane2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 990, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            
            st = con.createStatement();
            
            
            int Id = Integer.parseInt(id.getText());
            String query = "SELECT * FROM employee";
            
            
            rs = st.executeQuery(query);
            while(rs.next()){
                
                if(Id == rs.getInt("EMP_NO")){
                    name.setText(rs.getString("Name"));
                    address.setText(String.format( rs.getString("Address")));
                    contact.setText(String.format(0 + "%s", rs.getString("Contact_No")));
                    status.setSelectedItem(rs.getString("Status"));
                    type.setSelectedItem(rs.getString("EmpType"));
                    
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
         
        if(id.getText().isEmpty() || name.getText().isEmpty() || status.getSelectedItem().equals("") || type.getSelectedItem().equals("")){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else if(FullCnt>250 || PartCnt>150){
            JOptionPane.showMessageDialog(null, "Registration Not Available");
        }
        else{
//            JOptionPane.showMessageDialog(null, "Count->'"+FullCnt+"'");
            int Id = Integer.parseInt(id.getText());
            
            String Name = name.getText();
            String  Address = address.getText();
//            int Contact = Integer.parseInt(contact.getText());
            String Status = (String) status.getSelectedItem();
            String Type = (String) type.getSelectedItem();
            
            
                try {
                    st = con.createStatement();
                    
         
            String query = "INSERT INTO `employee`(`EMP_NO`, `Name`, `Address`, `Contact_No`, `Status`, `EmpType`) VALUES (?,?,?,?,?,?)";
                     
            
           pst = con.prepareStatement(query);
           

            pst.setInt(1, Id);
            pst.setString(2, Name);
            pst.setString(3, Address);
            if(contact.getText().equals(""))
                pst.setNull(4, Types.INTEGER);
            else{
                pst.setInt(4, Integer.parseInt(contact.getText()));
            }
            pst.setString(5, Status);
            pst.setString(6, Type);
            
            
           
            pst.execute();
            
            
            
            JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULLY");
            tableload();
            
                    panel1.setVisible(true);
            
                }catch (SQLIntegrityConstraintViolationException e) {
            
            JOptionPane.showMessageDialog(null, e);  
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }
                catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                }
               
            }
           
        
         
         
         
    }//GEN-LAST:event_submitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      if(id.getText().isEmpty() || name.getText().isEmpty() || status.getSelectedItem().equals("") || type.getSelectedItem().equals("")){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        
        try {
            st = con.createStatement();
            
            int Id = Integer.parseInt(id.getText());
            String Name = name.getText();
            String  Address = address.getText();
            int Contact = Integer.parseInt(contact.getText());
            String Status  = (String) status.getSelectedItem();
            String Type = (String) type.getSelectedItem();
            
            
            String query = "UPDATE `employee` SET `Name`=?,`Address`=?,`Contact_No`=?,`Status`=?,`EmpType`=? WHERE `EMP_NO`=?";
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, Name);
            pst.setString(2, Address);
            pst.setInt(3, Contact);
            pst.setString(4, Status);
            pst.setString(5, Type);
            pst.setInt(6, Id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            tableload();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
        }
      }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
                try {
            st = con.createStatement();
            int Id = Integer.parseInt(id.getText());
            
            String query = "DELETE FROM employee WHERE employee.EMP_NO = '"+Id+"'";
            st.executeUpdate(query);
            reset();
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            tableload();
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } 
        }    
        
       
    }//GEN-LAST:event_deleteActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignActionPerformed
        
        int Id = Integer.parseInt(id.getText());
        String Type = (String) type.getSelectedItem(); 
           
            int PCUNIT = Integer.parseInt(pc_unit.getText());
            int HRS = Integer.parseInt(hrs.getText());
             
            
                try {
                    st2 = con2.createStatement();
                    
         
            String query = "INSERT INTO `employee_assign_patientcare`(`EMP_NO`, `PCUnit_No`, `Hours_Per_Week`) VALUES (?,?,?)";
                     
            
           pst2 = con2.prepareStatement(query);
           

            pst2.setInt(1, Id);
            pst2.setInt(2, PCUNIT);
            pst2.setInt(3, HRS);
            
     
            pst2.execute();

            JOptionPane.showMessageDialog(null, "assigned");
            tableload1();
           
             if(type.getSelectedItem().equals("Medical")){
                       
                       medicalStaff m = new medicalStaff();
                       m.setVisible(true);
            }else if(type.getSelectedItem().equals("Nonmedical"))
            {
                
                      
                       NonMedical nm = new NonMedical();
                       nm.setVisible(true);
            }
            
                }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                }
         
                
            
    }//GEN-LAST:event_assignActionPerformed

//    public void close(){
// 
//        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
//        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
// 
//    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        tabledata1();
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private int xMouse, yMouse;
    
    private void movingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_movingMousePressed

    private void movingMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_movingMouseDragged

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            st2 = con2.createStatement();
            
            int Id = Integer.parseInt(id.getText());
            int No = Integer.parseInt(pc_unit.getText());
            int Hrs = Integer.parseInt(hrs.getText());
            
            
            String query = "UPDATE `employee_assign_patientcare` SET `PCUnit_No`=?,`Hours_Per_Week`=? WHERE `EMP_NO`=?";
            pst2 = con2.prepareStatement(query);
            
            
            
            pst2.setInt(1, No);
            pst2.setInt(2, Hrs);
            pst2.setInt(3, Id);
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            tableload1();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            System.err.println(e);
        }
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
                try {
            st2 = con2.createStatement();
            int Id = Integer.parseInt(id.getText());
            
            String query = "DELETE FROM employee_assign_patientcare WHERE EMP_NO = '"+Id+"'";
            st2.executeUpdate(query);
            reset();
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            tableload1();
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, e);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } 
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        panel1.setVisible(true);
        tabledata2();
    }//GEN-LAST:event_table1MouseClicked

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton assign;
    private javax.swing.JButton back;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JTextField hrs;
    private javax.swing.JTextField id;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel moving;
    private javax.swing.JTextField name;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField pc_unit;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
