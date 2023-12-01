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
public class Ward extends javax.swing.JFrame {

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
    
    public Ward() {
        initComponents();
        con = DBConnect.getconnection();
        con1 = DBConnect.getconnection();
        con2 = DBConnect.getconnection();
        tableload1();
        tableload2();
        tableload3();
    }

     private void reset1(){
        
        pc_no.setText("");
        pc_type.setSelectedIndex(0);
        e_no.setText("");
        }
     
     private void reset2(){
        
        w_no.setText("");
        w_name.setText("");
        pcw_no.setText("");
        
        }
     
     private void reset3(){
        
        dg_no.setText("");
        dg_name.setText("");
        pcd_no.setText("");
        }
     
     public void tabledata1(){
        
        int r  = table1.getSelectedRow();
        
        String PcNo = table1.getValueAt(r, 0).toString();
        String PcType = table1.getValueAt(r, 1).toString();
        String ENo = table1.getValueAt(r, 2).toString();
        
        
        pc_no.setText(PcNo);
        pc_type.setSelectedItem(PcType);
        e_no.setText(ENo);

    }
     
     public void tabledata2(){
        
        int r  = table2.getSelectedRow();
        
        String no = table2.getValueAt(r, 0).toString();
        String name = table2.getValueAt(r, 1).toString();
        String Pcunit = table2.getValueAt(r, 2).toString();
       
        
        
        w_no.setText(no);
        w_name.setText(name);
        pcw_no.setText(Pcunit);

        
    }
     
     public void tabledata3(){
        
        int r  = table3.getSelectedRow();
        
        String Dg_No = table3.getValueAt(r, 0).toString();
        String Dg_name = table3.getValueAt(r, 1).toString();
        String Pcunitd = table2.getValueAt(r, 2).toString();
        
        
        dg_no.setText(Dg_No);
        dg_name.setText(Dg_name);
        pcd_no.setText(Pcunitd);

    }
     
     public void tableload1()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM patient_care_unit";
            ResultSet rs =  st.executeQuery(query);
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch(java.sql.SQLSyntaxErrorException e){
            try {
                st = con.createStatement();
            String query = "SELECT `PatientCareUnit_No`, `PCType` FROM patient_care_unit";
            ResultSet rs =  st.executeQuery(query);
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception ex) {
            }
//            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    }
     
      public void tableload2()
    {
        try {
         
            st1 = con1.createStatement();
            String query = "SELECT * FROM ward";
            ResultSet rs1 =  st1.executeQuery(query);
            table2.setModel(DbUtils.resultSetToTableModel(rs1));
            
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    }
      
       public void tableload3()
    {
        try {
         
            st2 = con2.createStatement();
            String query = "SELECT * FROM diagnostic_unit";
            ResultSet rs2 =  st2.executeQuery(query);
            table3.setModel(DbUtils.resultSetToTableModel(rs2));
            
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pc_no = new javax.swing.JTextField();
        e_no = new javax.swing.JTextField();
        reset1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        submit1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        pc_type = new javax.swing.JComboBox<>();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        w_no = new javax.swing.JTextField();
        w_name = new javax.swing.JTextField();
        pcw_no = new javax.swing.JTextField();
        delete2 = new javax.swing.JButton();
        update2 = new javax.swing.JButton();
        reset2 = new javax.swing.JButton();
        submit2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dg_name = new javax.swing.JTextField();
        dg_no = new javax.swing.JTextField();
        delete3 = new javax.swing.JButton();
        update3 = new javax.swing.JButton();
        submit3 = new javax.swing.JButton();
        reset3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        pcd_no = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(table1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 600, 380));

        jTabbedPane2.addTab("Table View", jPanel2);

        jTabbedPane8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Patient Care Unit No:");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Incharge Employee No:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Patient Care Unit Name:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        pc_no.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel6.add(pc_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 180, 40));

        e_no.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel6.add(e_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 180, 40));

        reset1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset1.setForeground(new java.awt.Color(255, 102, 0));
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        jPanel6.add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 90, -1));

        update1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update1.setForeground(new java.awt.Color(204, 0, 204));
        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel6.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        submit1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        submit1.setForeground(new java.awt.Color(102, 204, 0));
        submit1.setText("Submit");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });
        jPanel6.add(submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        delete1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete1.setForeground(new java.awt.Color(0, 0, 0));
        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel6.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        pc_type.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pc_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Ward", "Diagnostic" }));
        jPanel6.add(pc_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 130, 40));

        jTabbedPane8.addTab("Information", jPanel6);

        jTabbedPane11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Ward No:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Ward Name:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("PC Unit No:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        w_no.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel4.add(w_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 100, 40));

        w_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel4.add(w_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 190, 40));

        pcw_no.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel4.add(pcw_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 180, 40));

        delete2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete2.setForeground(new java.awt.Color(0, 0, 0));
        delete2.setText("Delete");
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });
        jPanel4.add(delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 90, 30));

        update2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update2.setForeground(new java.awt.Color(204, 0, 204));
        update2.setText("Update");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });
        jPanel4.add(update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 90, 30));

        reset2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset2.setForeground(new java.awt.Color(255, 102, 0));
        reset2.setText("Reset");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });
        jPanel4.add(reset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 90, 30));

        submit2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        submit2.setForeground(new java.awt.Color(102, 204, 0));
        submit2.setText("Submit");
        submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit2ActionPerformed(evt);
            }
        });
        jPanel4.add(submit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 90, 30));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 204));
        jButton3.setText("Bed");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 100, 50));

        jTabbedPane11.addTab("Information", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        table2.setSelectionBackground(new java.awt.Color(0, 255, 0));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 550, 360));

        jTabbedPane11.addTab("Table View", jPanel5);

        jTabbedPane8.addTab("Ward", jTabbedPane11);

        jTabbedPane10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("PC Unit No:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 30));

        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Diagnostic Unit Name:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 240, 30));

        dg_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(dg_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 230, 40));

        dg_no.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(dg_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 150, 40));

        delete3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete3.setForeground(new java.awt.Color(0, 0, 0));
        delete3.setText("Delete");
        delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete3ActionPerformed(evt);
            }
        });
        jPanel1.add(delete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 265, 90, 30));

        update3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update3.setForeground(new java.awt.Color(204, 0, 204));
        update3.setText("Update");
        update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update3ActionPerformed(evt);
            }
        });
        jPanel1.add(update3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 265, 100, 30));

        submit3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        submit3.setForeground(new java.awt.Color(102, 204, 0));
        submit3.setText("Submit");
        submit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit3ActionPerformed(evt);
            }
        });
        jPanel1.add(submit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 265, 90, 30));

        reset3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset3.setForeground(new java.awt.Color(255, 102, 0));
        reset3.setText("Reset");
        reset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset3ActionPerformed(evt);
            }
        });
        jPanel1.add(reset3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 265, 90, 30));

        jLabel11.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Diagnostic Unit No:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, 30));

        pcd_no.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pcd_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcd_noActionPerformed(evt);
            }
        });
        jPanel1.add(pcd_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 40));

        jTabbedPane10.addTab("Information", jPanel1);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table3.setModel(new javax.swing.table.DefaultTableModel(
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
        table3.setSelectionBackground(new java.awt.Color(0, 255, 0));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 530, 380));

        jTabbedPane10.addTab("Table View", jPanel3);

        jTabbedPane8.addTab("Diagnostic Unit", jTabbedPane10);

        jTabbedPane2.addTab("Patient Care Unit", jTabbedPane8);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 93, 710, 490));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel7MouseDragged(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Patient Care Unit");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 25, 25));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/home.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 46, 46));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -5, 710, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        if(pc_no.getText().isEmpty() || pc_type.getSelectedItem().equals("")|| e_no.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {     
            st = con.createStatement();
            
            int Pc_No = Integer.parseInt(pc_no.getText());
            String Pc_Name = pc_type.getSelectedItem().toString();
            int E_No = Integer.parseInt(e_no.getText());
            
            
            String query = "INSERT INTO `patient_care_unit`(`PatientCareUnit_No`, `PCType`, `Incharge_EmpNo`) VALUES (?,?,?)";
            pst = con.prepareStatement(query);
            
            pst.setInt(1, Pc_No);
            pst.setString(2, Pc_Name);
            pst.setInt(3, E_No);
            

            
            pst.execute();
 
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
       tableload1();
    }//GEN-LAST:event_submit1ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        reset1();
    }//GEN-LAST:event_reset1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
       try {
            st = con.createStatement();
            
            int PcNo = Integer.parseInt(pc_no.getText());
            String Pcname = pc_type.getSelectedItem().toString();
            int eno= Integer.parseInt(e_no.getText());
            
            
            String query = "UPDATE `patient_care_unit` SET `PcType`=?,`Incharge_EmpNo`=? WHERE `PatientCareUnit_No`=?";
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, Pcname);
            pst.setInt(2, eno);
            pst.setInt(3, PcNo);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        tableload1();
    }//GEN-LAST:event_update1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st = con.createStatement();
            int PcNo = Integer.parseInt(pc_no.getText());
            
            String query = "DELETE FROM patient_care_unit WHERE PatientCareUnit_No = '"+PcNo+"'";
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
        reset1();
        tableload1();
    }//GEN-LAST:event_delete1ActionPerformed

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
       reset2();
    }//GEN-LAST:event_reset2ActionPerformed

    private void submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit2ActionPerformed
        if(w_no.getText().isEmpty() || w_name.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {     
            st1 = con1.createStatement();
            
            int W_No = Integer.parseInt(w_no.getText());
            String W_Name = w_name.getText();
            int PCwNo = Integer.parseInt(pcw_no.getText());

            
            String query = "INSERT INTO `ward`(`Ward_No`, `Name`, `PCUnit_No`) VALUES (?,?,?)";
            pst1 = con1.prepareStatement(query);
            
            pst1.setInt(1, W_No);
            pst1.setString(2, W_Name);
            pst1.setInt(3, PCwNo);
       
  
            pst1.execute();
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
       tableload2();
    }//GEN-LAST:event_submit2ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
         try {
            st1 = con1.createStatement();
            
            int WNo = Integer.parseInt(w_no.getText());
            String Wname = w_name.getText();
            int PcW = Integer.parseInt(pcw_no.getText());
            
            
            String query = "UPDATE `ward` SET `Name`=?, `PCUnit_No`=? WHERE `Ward_No`=?";
            pst1 = con1.prepareStatement(query);
            
            pst1.setString(1, Wname);
            pst1.setInt(2, PcW);
            pst1.setInt(3, WNo);
            
            
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        tableload2();
    }//GEN-LAST:event_update2ActionPerformed

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st1 = con1.createStatement();
            int Wno = Integer.parseInt(w_no.getText());
            
            String query = "DELETE FROM ward WHERE Ward_No = '"+Wno+"'";
            st1.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
        reset2();
        tableload2();
    }//GEN-LAST:event_delete2ActionPerformed

    private void submit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit3ActionPerformed
        if(dg_no.getText().isEmpty() || dg_name.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {     
            st2 = con2.createStatement();
            
            int D_No = Integer.parseInt(dg_no.getText());
            String D_Name = dg_name.getText();
            int PcD = Integer.parseInt(pcd_no.getText());
            
            String query = "INSERT INTO `diagnostic_unit`(`Diag_No`, `Name`, `PCUnit_No`) VALUES (?,?,?)";
            pst2 = con2.prepareStatement(query);
            
            pst2.setInt(1, D_No);
            pst2.setString(2, D_Name);
            pst2.setInt(3, PcD);
       
  
            pst2.execute();
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
       tableload3();
    }//GEN-LAST:event_submit3ActionPerformed

    private void reset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset3ActionPerformed
        reset3();
    }//GEN-LAST:event_reset3ActionPerformed

    private void update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update3ActionPerformed
       try {
            st2 = con2.createStatement();
            
            int DgNo = Integer.parseInt(dg_no.getText());
            String DgName = dg_name.getText();
            int PcDN = Integer.parseInt(pcd_no.getText()); 

            
            
            String query = "UPDATE `diagnostic_unit` SET `Name`=?, `PCUnit_No`=? WHERE `Diag_No`=?";
            pst2 = con2.prepareStatement(query);
            
            pst2.setString(1, DgName);
            pst2.setInt(2, PcDN);
            pst2.setInt(3, DgNo);
            
            
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        tableload3();
    }//GEN-LAST:event_update3ActionPerformed

    private void delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete3ActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st2 = con2.createStatement();
            int DGno = Integer.parseInt(dg_no.getText());
            
            String query = "DELETE FROM diagnostic_unit WHERE Diag_No = '"+DGno+"'";
            st2.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
        reset3();
        tableload3();
    }//GEN-LAST:event_delete3ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
       tabledata2();
    }//GEN-LAST:event_table2MouseClicked

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
       tabledata3();
    }//GEN-LAST:event_table3MouseClicked

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       tabledata1();
    }//GEN-LAST:event_table1MouseClicked

    private int xMouse, yMouse;
    
    private void jPanel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel7MouseDragged

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
      xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel7MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pcd_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcd_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcd_noActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Bed b = new Bed();
        b.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ward().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JButton delete3;
    private javax.swing.JTextField dg_name;
    private javax.swing.JTextField dg_no;
    private javax.swing.JTextField e_no;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTextField pc_no;
    private javax.swing.JComboBox<String> pc_type;
    private javax.swing.JTextField pcd_no;
    private javax.swing.JTextField pcw_no;
    private javax.swing.JButton reset1;
    private javax.swing.JButton reset2;
    private javax.swing.JButton reset3;
    private javax.swing.JButton submit1;
    private javax.swing.JButton submit2;
    private javax.swing.JButton submit3;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JButton update1;
    private javax.swing.JButton update2;
    private javax.swing.JButton update3;
    private javax.swing.JTextField w_name;
    private javax.swing.JTextField w_no;
    // End of variables declaration//GEN-END:variables
}
