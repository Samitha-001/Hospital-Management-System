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
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author asus
 */
public class NonMedical extends javax.swing.JFrame {

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
    
    public NonMedical() {
        initComponents();
        con = DBConnect.getconnection();
        con1 = DBConnect.getconnection();
        con2 = DBConnect.getconnection();
        tableload();
        tableload1();
        tableload2();
    }

    private void reset0(){
        
        id0.setText("");
        type0.setSelectedIndex(0);

        }
    
    private void reset1(){
        
        id.setText("");
        rate_box.setText("");

        }
    
    private void reset2(){
        
        id_l2.setText("");
        contract.setText("");
        s_date.setText("");
        e_date.setText("");
        }
    
    public void tableload()
    {
        try {
         
            st = con.createStatement();
            String query = "SELECT * FROM non_medical_staff";
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
            String query = "SELECT * FROM attendant";
            ResultSet rs1 =  st1.executeQuery(query);
            table1.setModel(DbUtils.resultSetToTableModel(rs1));
            
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    } 
    
    public void tableload2()
    {
        try {
         
            st2 = con2.createStatement();
            String query = "SELECT * FROM cleaner";
            ResultSet rs2 =  st2.executeQuery(query);
            table2.setModel(DbUtils.resultSetToTableModel(rs2));
            
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
        }
    } 
    
    public void tabledata(){
        
        int r  = table.getSelectedRow();
        
        String Id = table.getValueAt(r, 0).toString();
        String Type0 = table.getValueAt(r, 1).toString();
        
        id0.setText(Id);
        type0.setSelectedItem(Type0);
        
    }
    
    public void tabledata1(){
        
        int r  = table1.getSelectedRow();
        
        String Id = table1.getValueAt(r, 0).toString();
        String rate = table1.getValueAt(r, 1).toString();
        
        id.setText(Id);
        rate_box.setText(rate);
        
    }
    
    public void tabledata2(){
        
        int r  = table2.getSelectedRow();
        
        String Id = table2.getValueAt(r, 0).toString();
        String contr = table2.getValueAt(r, 1).toString();
        String str = table2.getValueAt(r, 2).toString();
        String end = table2.getValueAt(r, 3).toString();
        
        id_l2.setText(Id);
        contract.setText(contr);
        s_date.setText(str);
        e_date.setText(end);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        n_type = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        id0 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        type0 = new javax.swing.JComboBox<>();
        update0 = new javax.swing.JButton();
        Reset0 = new javax.swing.JButton();
        enter0 = new javax.swing.JButton();
        delete0 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rate_box = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        enter1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        reset1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        e_date = new javax.swing.JTextField();
        s_date = new javax.swing.JTextField();
        contract = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        ubtn2 = new javax.swing.JButton();
        dbtn2 = new javax.swing.JButton();
        enter2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        id_l2 = new javax.swing.JTextField();
        reset2 = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Non Medical Staff");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 280, 40));

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        n_type.setBackground(new java.awt.Color(153, 153, 153));
        n_type.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        table.setSelectionBackground(new java.awt.Color(51, 204, 0));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        n_type.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 720, 280));

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("ID");
        n_type.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 70, 30));

        id0.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        n_type.add(id0, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 30));

        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Type");
        n_type.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 70, 30));

        type0.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        type0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Attendant", "Cleaner" }));
        n_type.add(type0, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 120, 30));

        update0.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update0.setForeground(new java.awt.Color(153, 0, 153));
        update0.setText("Update");
        update0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update0ActionPerformed(evt);
            }
        });
        n_type.add(update0, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, 30));

        Reset0.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Reset0.setForeground(new java.awt.Color(255, 102, 0));
        Reset0.setText("Reset");
        Reset0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset0ActionPerformed(evt);
            }
        });
        n_type.add(Reset0, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 90, 30));

        enter0.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        enter0.setForeground(new java.awt.Color(102, 255, 0));
        enter0.setText("Enter");
        enter0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter0ActionPerformed(evt);
            }
        });
        n_type.add(enter0, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 90, 30));

        delete0.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete0.setForeground(new java.awt.Color(0, 0, 0));
        delete0.setText("Delete");
        delete0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete0ActionPerformed(evt);
            }
        });
        n_type.add(delete0, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 90, 30));

        jTabbedPane1.addTab("View Table", n_type);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Hourly Rate");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 170, 30));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 30));

        rate_box.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel3.add(rate_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 130, 40));

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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 600, 330));

        enter1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        enter1.setForeground(new java.awt.Color(102, 255, 0));
        enter1.setText("Enter");
        enter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter1ActionPerformed(evt);
            }
        });
        jPanel3.add(enter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 100, 40));

        update1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        update1.setForeground(new java.awt.Color(153, 0, 153));
        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel3.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 100, 40));

        delete1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        delete1.setForeground(new java.awt.Color(0, 0, 0));
        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel3.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 100, 40));

        id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, 40));

        reset1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset1.setForeground(new java.awt.Color(255, 102, 0));
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        jPanel3.add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 100, 40));

        jTabbedPane1.addTab("Attendant", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("End Date");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Start Date");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("ID");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        e_date.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jPanel4.add(e_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 140, 40));

        s_date.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jPanel4.add(s_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 140, 40));

        contract.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jPanel4.add(contract, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, 40));

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
        jScrollPane3.setViewportView(table2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 600, 310));

        ubtn2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ubtn2.setForeground(new java.awt.Color(153, 0, 153));
        ubtn2.setText("Update");
        ubtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubtn2ActionPerformed(evt);
            }
        });
        jPanel4.add(ubtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 100, 40));

        dbtn2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        dbtn2.setForeground(new java.awt.Color(0, 0, 0));
        dbtn2.setText("Delete");
        dbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbtn2ActionPerformed(evt);
            }
        });
        jPanel4.add(dbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 100, 40));

        enter2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        enter2.setForeground(new java.awt.Color(102, 204, 0));
        enter2.setText("Enter");
        enter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter2ActionPerformed(evt);
            }
        });
        jPanel4.add(enter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 100, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Contract No");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        id_l2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jPanel4.add(id_l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 40));

        reset2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        reset2.setForeground(new java.awt.Color(255, 153, 0));
        reset2.setText("Reset");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });
        jPanel4.add(reset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 355, 100, 40));

        jTabbedPane1.addTab("Cleaner", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 740, 540));

        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/home.jpg"))); // NOI18N
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        jPanel1.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 46, 46));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 25, 25));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 25, 25));

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
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 630, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter2ActionPerformed
        if(id_l2.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {
                
            st2 = con2.createStatement();
            
            int ID = Integer.parseInt(id_l2.getText());
            int Cont = Integer.parseInt(contract.getText());
            long day = Date.parse(s_date.getText());
            java.sql.Date sDate = new java.sql.Date(day);
            long day_e = Date.parse(e_date.getText());
            java.sql.Date eDate = new java.sql.Date(day_e);
            
            String query = "INSERT INTO `cleaner`(`EMP_NO`, `Contract_No`, `Start_date`, `End_date`) VALUES (?,?,?,?)";
            pst2 = con2.prepareStatement(query);
            
            pst2.setInt(1, ID);
            pst2.setInt(2, Cont);
            pst2.setDate(3, sDate);
            pst2.setDate(4, eDate);
            
            pst2.execute();
            tableload2();
            JOptionPane.showMessageDialog(null, "ADDED SUCCESSFULLY");
            
        } catch (SQLIntegrityConstraintViolationException e) {
            
            JOptionPane.showMessageDialog(null, e);  
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }
       catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_enter2ActionPerformed
    tableload2();
    }
    private void enter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter1ActionPerformed
       if(id.getText().isEmpty() || rate_box.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {     
            st1 = con1.createStatement();
            
            int ID = Integer.parseInt(id.getText());
            int Rate = Integer.parseInt(rate_box.getText());
            
            
            String query = "INSERT INTO `attendant`(`EMP_NO`, `Hourly_rate`) VALUES (?,?)";
            pst1 = con1.prepareStatement(query);
            
            pst1.setInt(1, ID);
            pst1.setInt(2, Rate);

            
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
    }//GEN-LAST:event_enter1ActionPerformed
    tableload1();
    }
    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       tabledata1();
    }//GEN-LAST:event_table1MouseClicked

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        try {
            st1 = con1.createStatement();
            
            int Id = Integer.parseInt(id.getText());
            int Hr_rate = Integer.parseInt(rate_box.getText());
            
            
            String query = "UPDATE `attendant` SET `Hourly_rate`=? WHERE `EMP_NO`=?";
            pst1 = con1.prepareStatement(query);
            
            
            pst1.setInt(1, Hr_rate);
            pst1.setInt(2, Id);
            
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
    }//GEN-LAST:event_update1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
       int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st1 = con1.createStatement();
            int Id = Integer.parseInt(id.getText());
            
            String query = "DELETE FROM attendant WHERE Emp_NO = '"+Id+"'";
            st1.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
        reset1();
        tableload1();
    }//GEN-LAST:event_delete1ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
       reset1();
    }//GEN-LAST:event_reset1ActionPerformed

    private void ubtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubtn2ActionPerformed
        try {
            st2 = con2.createStatement();
            
            int Id = Integer.parseInt(id_l2.getText());
            int Con_no = Integer.parseInt(contract.getText());
            long sDate = Date.parse(s_date.getText());
            java.sql.Date DateS = new java.sql.Date(sDate);
            long eDate = Date.parse(e_date.getText());
            java.sql.Date DateE = new java.sql.Date(eDate);
 
            
            
            String query = "UPDATE `cleaner` SET `Contract_No`=?,`Start_date`=?,`End_date`=? WHERE `EMP_NO`=?";
            pst2 = con2.prepareStatement(query);
            
            
            pst2.setInt(1, Con_no);
            pst2.setDate(2, DateS);
            pst2.setDate(3, DateE);
            pst2.setInt(4, Id);
     
            
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        tableload2();
    }//GEN-LAST:event_ubtn2ActionPerformed

    private void dbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbtn2ActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st2 = con2.createStatement();
            int Id = Integer.parseInt(id_l2.getText());
            
            String query = "DELETE FROM cleaner WHERE EMP_NO = '"+Id+"'";
            st2.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        } catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
        reset2();
        tableload2();
    }//GEN-LAST:event_dbtn2ActionPerformed

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        reset2();
    }//GEN-LAST:event_reset2ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        tabledata2();
    }//GEN-LAST:event_table2MouseClicked

    private void enter0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter0ActionPerformed
       if(id0.getText().isEmpty() || type0.getSelectedItem().equals("")){
        
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
        try {     
            st = con.createStatement();
            
            int ID0 = Integer.parseInt(id0.getText());
            String Type0 = type0.getSelectedItem().toString();
            
            
            String query = "INSERT INTO `non_medical_staff`(`EMP_NO`, `NonMedical_Type`) VALUES (?,?)";
            pst = con.prepareStatement(query);
            
            pst.setInt(1, ID0);
            pst.setString(2, Type0);

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
    tableload2();
    }//GEN-LAST:event_enter0ActionPerformed

    private void delete0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete0ActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(check==0){
        try {
            st = con.createStatement();
            int Id = Integer.parseInt(id0.getText());
            
            String query = "DELETE FROM non_medical_staff WHERE EMP_NO = '"+Id+"'";
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
            
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
        reset0();
        tableload();
    }//GEN-LAST:event_delete0ActionPerformed

    private void Reset0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset0ActionPerformed
        reset0();
    }//GEN-LAST:event_Reset0ActionPerformed

    private void update0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update0ActionPerformed
       try {
            st = con.createStatement();
            
            int Id = Integer.parseInt(id0.getText());
            String Type0 = type0.getSelectedItem().toString();
            
            
            String query = "UPDATE `non_medical_staff` SET `NonMedical_Type`=? WHERE `EMP_NO`=?";
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, Type0);
            pst.setInt(2, Id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Some fields are empty!?");
        }catch(java.sql.SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Insufficient Permission");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        tableload();
    }//GEN-LAST:event_update0ActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
        
    }//GEN-LAST:event_homebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Employee em = new Employee();
       em.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      tabledata();
    }//GEN-LAST:event_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
        private int xMouse, yMouse;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
       xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged
    
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
            java.util.logging.Logger.getLogger(NonMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NonMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NonMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NonMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NonMedical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset0;
    private javax.swing.JTextField contract;
    private javax.swing.JButton dbtn2;
    private javax.swing.JButton delete0;
    private javax.swing.JButton delete1;
    private javax.swing.JTextField e_date;
    private javax.swing.JButton enter0;
    private javax.swing.JButton enter1;
    private javax.swing.JButton enter2;
    private javax.swing.JButton homebtn;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id0;
    private javax.swing.JTextField id_l2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel n_type;
    private javax.swing.JTextField rate_box;
    private javax.swing.JButton reset1;
    private javax.swing.JButton reset2;
    private javax.swing.JTextField s_date;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JComboBox<String> type0;
    private javax.swing.JButton ubtn2;
    private javax.swing.JButton update0;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
}
