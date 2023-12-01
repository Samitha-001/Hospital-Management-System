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
import java.sql.Types;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author asus
 */
public class medicalStaff extends javax.swing.JFrame {
    
    
    
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
    
    
    
    Doctor DOC = new Doctor();
    
    int NurseCntP;
    int NurseCntF;
    
    public medicalStaff() {
        initComponents();
        d_panel.setVisible(false);
        con = DBConnect.getconnection();
        con1 = DBConnect.getconnection();
        con2 = DBConnect.getconnection();
         
         
         NurseCntP = countNurseP();
         NurseCntF = countNurseF();
         System.out.println(NurseCntP);
         tableload1();
         tableload2();
         tableload3();
         
    }

    private int countNurseP(){
            int cnt = 0;
            try {
              st = con.createStatement();
               String q1 = "select count(n.EMP_NO) from nurse n , employee e where n.EMP_NO =  e.EMP_NO and e.Status='FULL'"; 
                rs = st.executeQuery(q1);
                
                rs.next();
                 cnt = rs.getInt(1);
  
            } catch (Exception e) {
            }
        return cnt;
        }
    
    private int countNurseF(){
            int cnt = 0;
            try {
              st = con.createStatement();
               String q1 = "select count(n.EMP_NO) from nurse n , employee e where n.EMP_NO =  e.EMP_NO and e.Status='Part'"; 
                rs = st.executeQuery(q1);
                
                rs.next();
                 cnt = rs.getInt(1);
                
                
                
            } catch (Exception e) {
            }
        return cnt;
        }

    private void reset(){
        
        emp_no.setText("");
        reg.setText("");
        type.setSelectedIndex(0);
        resign.setText("");
        join.setText("");
        dea.setText("");
        special.setText("");
        }
    
    public void tabledata1(){
        
        int r  = table.getSelectedRow();
        
        String EmpNo = table.getValueAt(r, 0).toString();
        String Reg = table.getValueAt(r, 1).toString();
        String Join = table.getValueAt(r, 2).toString();
//        String Resign = table.getValueAt(r, 3).toString();
        String Type = table.getValueAt(r, 4).toString();
        
        
        emp_no.setText(EmpNo);
        reg.setText(Reg);
        join.setText(Join);
        type.setSelectedItem(Type);
        if( table.getValueAt(r, 3) == null){
          resign.setText("");  
        }else{
        resign.setText( table.getValueAt(r, 3).toString());
        }
        

    }
    
    public void tabledata2(){
        
        int r  = dTable.getSelectedRow();
        
        String EmpNo = dTable.getValueAt(r, 0).toString();
        String DEA = dTable.getValueAt(r, 1).toString();
//        String Special = dTable.getValueAt(r, 2).toString();

        emp_no.setText(EmpNo);
        dea.setText(DEA);
        if(dTable.getValueAt(r, 2) == null){
        special.setText("");
        }else
        special.setText(dTable.getValueAt(r, 2).toString()); 
    }

    public void tabledata3(){
        
        int r  = nTable.getSelectedRow();
        
        String EmpNo = nTable.getValueAt(r, 0).toString();

        emp_no.setText(EmpNo);
        
    }
    
     public void tableload1()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM medical_staff";
            ResultSet rs =  st.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
    }
   
     public void tableload2()
    {
        try {
         
            st1 = con1.createStatement();
            String query = "SELECT * FROM doctor";
            ResultSet rs =  st1.executeQuery(query);
            dTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
    }
     
     public void tableload3()
    {
        try {
         
            st1 = con1.createStatement();
            String query = "SELECT * FROM nurse";
            ResultSet rs =  st1.executeQuery(query);
            nTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
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
        emp_no = new javax.swing.JTextField();
        join = new javax.swing.JTextField();
        resign = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        reset = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        next = new javax.swing.JButton();
        d_panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dea = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        special = new javax.swing.JTextField();
        lable = new javax.swing.JLabel();
        reg = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        dTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        nTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        emp_no1 = new javax.swing.JTextField();
        join1 = new javax.swing.JTextField();
        resign1 = new javax.swing.JTextField();
        type1 = new javax.swing.JComboBox<>();
        reset1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        search1 = new javax.swing.JButton();
        next1 = new javax.swing.JButton();
        d_panel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        dea1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        special1 = new javax.swing.JTextField();
        lable1 = new javax.swing.JLabel();
        reg1 = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        dTable1 = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Medical Staff");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 220, 50));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Employee No:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, 40));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("MC Registration No: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 240, 40));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Joined Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, 40));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Resign Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, 40));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Medical Type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 170, 40));

        emp_no.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        emp_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_noActionPerformed(evt);
            }
        });
        jPanel1.add(emp_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 260, 30));

        join.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        join.setText("yyyy/mm/dd");
        join.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                joinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                joinFocusLost(evt);
            }
        });
        jPanel1.add(join, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 260, 30));

        resign.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        resign.setText("yyyy/mm/dd");
        resign.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                resignFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resignFocusLost(evt);
            }
        });
        jPanel1.add(resign, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 260, 30));

        type.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Doctor", "Nurse", "Other" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 130, 40));

        reset.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 204, 204));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, 30));

        update.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update.setForeground(new java.awt.Color(204, 0, 204));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 100, 30));

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 100, 30));

        search.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        search.setForeground(new java.awt.Color(255, 102, 0));
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 100, 30));

        next.setBackground(new java.awt.Color(51, 51, 51));
        next.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        next.setForeground(new java.awt.Color(102, 204, 0));
        next.setText("Register");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 100, 30));

        d_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setText("DEA No:");
        d_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        dea.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        d_panel.add(dea, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setText("Speciality Area");
        d_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        special.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        d_panel.add(special, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 270, 30));

        jPanel1.add(d_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 790, 50));
        jPanel1.add(lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 40));

        reg.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jPanel1.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 260, 30));

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

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

        jTabbedPane1.addTab("Medical Staff", jScrollPane1);

        dTable.setModel(new javax.swing.table.DefaultTableModel(
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
        dTable.setSelectionBackground(new java.awt.Color(0, 255, 0));
        dTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dTable);

        jTabbedPane1.addTab("Doctor Table", jScrollPane2);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nTable.setModel(new javax.swing.table.DefaultTableModel(
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
        nTable.setSelectionBackground(new java.awt.Color(0, 255, 0));
        nTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(nTable);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 0, 520, 230));

        jTabbedPane1.addTab("Nurse", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 850, 270));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
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

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Medical Staff");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 220, 50));

        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Employee No:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, 40));

        jLabel11.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("MC Registration No: ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 240, 40));

        jLabel12.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Joined Date");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, 40));

        jLabel13.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Resign Date");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, 40));

        jLabel14.setFont(new java.awt.Font("Eras Bold ITC", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 51));
        jLabel14.setText("Medical Type");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 170, 40));

        emp_no1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        emp_no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_no1ActionPerformed(evt);
            }
        });
        jPanel2.add(emp_no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 260, 30));

        join1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(join1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 260, 30));

        resign1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(resign1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 260, 30));

        type1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Doctor", "Nurse" }));
        type1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type1ActionPerformed(evt);
            }
        });
        jPanel2.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 130, 40));

        reset1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset1.setForeground(new java.awt.Color(0, 204, 204));
        reset1.setText("RESET");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        jPanel2.add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, 30));

        update1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update1.setForeground(new java.awt.Color(204, 0, 204));
        update1.setText("UPDATE");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel2.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 100, 30));

        delete1.setBackground(new java.awt.Color(51, 51, 51));
        delete1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete1.setForeground(new java.awt.Color(0, 0, 0));
        delete1.setText("DELETE");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel2.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 100, 30));

        search1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        search1.setForeground(new java.awt.Color(255, 102, 0));
        search1.setText("SEARCH");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        jPanel2.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 100, 30));

        next1.setBackground(new java.awt.Color(51, 51, 51));
        next1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        next1.setForeground(new java.awt.Color(102, 204, 0));
        next1.setText("NEXT");
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });
        jPanel2.add(next1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 100, 30));

        d_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel15.setText("DEA No:");
        d_panel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        dea1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        d_panel1.add(dea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, 30));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel16.setText("Speciality Area");
        d_panel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        special1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        d_panel1.add(special1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 270, 30));

        jPanel2.add(d_panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 790, 50));
        jPanel2.add(lable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 40));

        reg1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(reg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 260, 30));

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
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table1);

        jTabbedPane2.addTab("Medical Staff", jScrollPane3);

        dTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        dTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(dTable1);

        jTabbedPane2.addTab("Doctor Table", jScrollPane4);

        jPanel2.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 850, 270));

        backbtn.setBackground(new java.awt.Color(255, 255, 255));
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/back.png"))); // NOI18N
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel2.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 25, 25));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/home.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 25, 25));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 640));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 770, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
      
        if(emp_no.getText().isEmpty() || reg.getText().isEmpty() || join.getText().isEmpty() || type.getSelectedItem().equals("") || (dea.getText().isEmpty() && type.getSelectedItem().equals("Doctor"))){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else if(NurseCntF>50 || NurseCntP>70){
        JOptionPane.showMessageDialog(null, "Limit Exceeded");
        
        }
        else{
        try {
                
            st = con.createStatement();
            st1 = con1.createStatement();
            st2 = con2.createStatement();
            
            int ID = Integer.parseInt(emp_no.getText());
            int R_No = Integer.parseInt(reg.getText());
            long j_date = Date.parse(join.getText());
            java.sql.Date m_date = new java.sql.Date(j_date);
            String r_date = resign.getText();
            
            String m_type = (String) type.getSelectedItem();

            
 
            
            String query = "INSERT INTO `medical_staff`(`EMP_NO`, `MC_Reg_no`, `joined_date`, `resigned_date`, `Medical_Type`) VALUES (?,?,?,?,?)";
           
            
            
                pst = con.prepareStatement(query);
   
            
            pst.setInt(1, ID);
            pst.setInt(2, R_No);
            pst.setDate(3, m_date);
            if(r_date.equals("")){
             pst.setNull(4, java.sql.Types.DATE);
            }else{
                long Datetemp = Date.parse(r_date);
                java.sql.Date DDATE = new java.sql.Date(Datetemp);
                pst.setDate(4,  DDATE);
            }
            pst.setString(5, m_type);
            
            
            pst.execute();
          
            
            if(type.getSelectedItem().equals("Doctor")){
            int DEA = Integer.parseInt(dea.getText());
            String sp = special.getText();
            
             String q1 = "INSERT INTO `doctor`(`EMP_NO`, `DEA_No`, `Area_of_Specialty`) VALUES (?,?,?)";
             
             pst1 = con1.prepareStatement(q1);
             
             pst1.setInt(1, ID);
            pst1.setInt(2, DEA);
            pst1.setString(3, sp);
            
             pst1.execute();
            }else if(type.getSelectedItem().equals("Nurse")){
                
                String q2 = "INSERT INTO `nurse`(`EMP_NO`) VALUES (?)";
                pst2 = con2.prepareStatement(q2);
                pst2.setInt(1, ID);
                pst2.execute();
                
            }
               
            tableload1();
            tableload2();
            tableload3();
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            
        } catch (SQLIntegrityConstraintViolationException e) {
            
            JOptionPane.showMessageDialog(null, "Employee ID is already registered");  
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
            
        } catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "Wrong format!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }
       catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_nextActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            
            st = con.createStatement();
            st1 = con.createStatement();
            st2 = con.createStatement();
            int Id = Integer.parseInt(emp_no.getText());
            if(type.getSelectedItem().equals("Doctor")){
            String query1 = "DELETE FROM doctor WHERE EMP_NO = '"+Id+"'";
            st1.executeUpdate(query1);
            }else if(type.getSelectedItem().equals("Nurse")){
                String query2 = "DELETE FROM nurse WHERE EMP_NO = '"+Id+"'";
            st2.executeUpdate(query2);
            }
            String query3 = "DELETE FROM medical_staff WHERE EMP_NO = '"+Id+"'";
            
            st.executeUpdate(query3);
            reset();
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            tableload1();
            tableload2();
            tableload3();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter Patient ID");
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            
            st = con.createStatement();
            
            int Id = Integer.parseInt(emp_no.getText());
            String query = "SELECT * FROM medical_staff";
            
            rs = st.executeQuery(query);
            while(rs.next()){
                
                if(Id == rs.getInt("EMP_NO")){
                    reg.setText(rs.getString("MC_Reg_No"));
                    join.setText(String.format("%tD", rs.getDate("joined_date")));
                    resign.setText(String.format("%tD", rs.getDate("resigned_date"))); 
                    type.setSelectedItem(rs.getString("Medical_Type"));
                }
            
            }
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(emp_no.getText().isEmpty() || emp_no.getText().isEmpty() || join.getText().isEmpty() || type.getSelectedItem().equals("")){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {
            st = con.createStatement();
             
            int Id = Integer.parseInt(emp_no.getText());
            int MC_no = Integer.parseInt(reg.getText());
            long j_date = Date.parse(join.getText());
            java.sql.Date join_d = new java.sql.Date(j_date);
            long r_date = Date.parse(resign.getText());
            java.sql.Date join_r = new java.sql.Date(r_date);
            String m_type = (String) type.getSelectedItem();
            
            String query = "UPDATE `medical_staff` SET `MC_Reg_no`=?,`joined_date`=?,`resigned_date`=?,`Medical_Type`=? WHERE `EMP_NO`=?";
            pst = con.prepareStatement(query);
            
           
            pst.setInt(1, MC_no);
            pst.setDate(2, join_d);
            pst.setDate(3, join_r);
            pst.setString(4, m_type); 
            pst.setInt(5, Id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            tableload1();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter ID and Search for details");
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
                
        }  
        }
    }//GEN-LAST:event_updateActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if(type.getSelectedItem().equals("Doctor")){
            d_panel.setVisible(true);
        }else 
            d_panel.setVisible(false);

    }//GEN-LAST:event_typeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Home h = new Home();
       this.setVisible(false);
       h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emp_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_noActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        tabledata1();
    }//GEN-LAST:event_tableMouseClicked

    private void dTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dTableMouseClicked
       tabledata2();
       d_panel.setVisible(true);
    }//GEN-LAST:event_dTableMouseClicked

    private void emp_no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_no1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_no1ActionPerformed

    private void type1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type1ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reset1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete1ActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_next1ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table1MouseClicked

    private void dTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dTable1MouseClicked

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        Employee emp = new Employee();
        emp.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

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
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nTableMouseClicked
        tabledata3();
    }//GEN-LAST:event_nTableMouseClicked

    private void joinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joinFocusGained
        if(join.getText().equals("yyyy/mm/dd")){
            join.setText("");
        }
    }//GEN-LAST:event_joinFocusGained

    private void joinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_joinFocusLost
        if(join.getText().equals("")){
            join.setText("yyyy/mm/dd");
        }
    }//GEN-LAST:event_joinFocusLost

    private void resignFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resignFocusGained

    }//GEN-LAST:event_resignFocusGained

    private void resignFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resignFocusLost

    }//GEN-LAST:event_resignFocusLost

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
            java.util.logging.Logger.getLogger(medicalStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicalStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicalStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicalStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicalStaff().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTable dTable;
    private javax.swing.JTable dTable1;
    private javax.swing.JPanel d_panel;
    private javax.swing.JPanel d_panel1;
    private javax.swing.JTextField dea;
    private javax.swing.JTextField dea1;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JTextField emp_no;
    private javax.swing.JTextField emp_no1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField join;
    private javax.swing.JTextField join1;
    private javax.swing.JLabel lable;
    private javax.swing.JLabel lable1;
    private javax.swing.JTable nTable;
    private javax.swing.JButton next;
    private javax.swing.JButton next1;
    private javax.swing.JTextField reg;
    private javax.swing.JTextField reg1;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JTextField resign;
    private javax.swing.JTextField resign1;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JTextField special;
    private javax.swing.JTextField special1;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JComboBox<String> type1;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
}
