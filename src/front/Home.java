/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    Connection con1 = null;
    PreparedStatement pst1 = null;
    ResultSet rs1 = null;

    Connection con2 = null;
    PreparedStatement pst2 = null;
    ResultSet rs2 = null;

    Connection con3 = null;
    PreparedStatement pst3 = null;
    ResultSet rs3 = null;

    CardLayout cardlayout;

    
    
    public Home() {
        initComponents();
        con = DBConnect.getconnection();
        con1 = DBConnect.getconnection();
        con2 = DBConnect.getconnection();
        con3 = DBConnect.getconnection();

        cardlayout = (CardLayout) cardLayout.getLayout();
    }

    public Home(String uname){
    
        initComponents();
        lable.setText(uname);
    }
    
    private void check(int id) {
        String ch = "Enter your Employee ID";

        String c = JOptionPane.showInputDialog(ch);
        if (c == null || (c != null && ("".equals(c)))) {
            JOptionPane.showMessageDialog(this, "Cannot proceed");
        } else {
            id = Integer.parseInt(c);

        }
    }
//        String q1 = "SELECT `EMP_NO` FROM `doctor` WHERE EMP_NO = '"+id+"'";
//        String q2 = "SELECT `EMP_NO` FROM `nurse` WHERE EMP_NO = '"+id+"'";
//        String q3 = "SELECT `EMP_NO` FROM `attendant` WHERE EMP_NO = '"+id+"'";
//        String q4 = "SELECT `EMP_NO` FROM `cleaner` WHERE EMP_NO = '"+id+"'";
//      
//    
//                try {
//                    
//                    pst = con.prepareStatement(q1);
//                    rs = pst.executeQuery();
//                    
//                    pst1 = con1.prepareStatement(q2);
//                    rs1 = pst1.executeQuery();
//                    
//                    pst2 = con2.prepareStatement(q3);
//                    rs2 = pst2.executeQuery();
//                    
//                    pst3 = con3.prepareStatement(q4);
//                    rs3 = pst3.executeQuery();
//                    
//                } catch (Exception e) {
//                }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        tab2 = new javax.swing.JButton();
        tab3 = new javax.swing.JButton();
        tab5 = new javax.swing.JButton();
        tab6 = new javax.swing.JButton();
        tab1 = new javax.swing.JButton();
        tab4 = new javax.swing.JButton();
        lable = new javax.swing.JLabel();
        cardLayout = new javax.swing.JPanel();
        card1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        card2 = new javax.swing.JPanel();
        reg = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dr = new javax.swing.JRadioButton();
        nr = new javax.swing.JRadioButton();
        mediclV = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        at = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        card3 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        card4 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        card5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        card6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jSplitPane1.setDividerSize(1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab2.setBackground(new java.awt.Color(102, 255, 0));
        tab2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        tab2.setText("Employee");
        tab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab2ActionPerformed(evt);
            }
        });
        jPanel2.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 40));

        tab3.setBackground(new java.awt.Color(102, 255, 0));
        tab3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        tab3.setText("Receptionist");
        tab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab3ActionPerformed(evt);
            }
        });
        jPanel2.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 40));

        tab5.setBackground(new java.awt.Color(102, 255, 0));
        tab5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        tab5.setText("Treat Info");
        tab5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab5ActionPerformed(evt);
            }
        });
        jPanel2.add(tab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 180, 40));

        tab6.setBackground(new java.awt.Color(102, 255, 0));
        tab6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        tab6.setText("Views");
        tab6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab6ActionPerformed(evt);
            }
        });
        jPanel2.add(tab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 180, 40));

        tab1.setBackground(new java.awt.Color(102, 255, 0));
        tab1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        tab1.setText("Home");
        tab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab1ActionPerformed(evt);
            }
        });
        jPanel2.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 40));

        tab4.setBackground(new java.awt.Color(102, 255, 0));
        tab4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        tab4.setText("Patient");
        tab4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab4ActionPerformed(evt);
            }
        });
        jPanel2.add(tab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 180, 40));

        lable.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/borderleft.jpg"))); // NOI18N
        jPanel2.add(lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 530));

        jSplitPane1.setLeftComponent(jPanel2);

        cardLayout.setBackground(new java.awt.Color(153, 255, 0));
        cardLayout.setLayout(new java.awt.CardLayout());

        card1.setBackground(new java.awt.Color(0, 102, 255));
        card1.setForeground(new java.awt.Color(255, 255, 255));
        card1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("SUWA ");
        card1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 190, 100));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Private");
        card1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 210, 100));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Hospital");
        card1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 250, 100));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("SAHANA");
        card1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 250, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/Suwashana.jpg"))); // NOI18N
        card1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 490));

        cardLayout.add(card1, "card1");

        card2.setBackground(new java.awt.Color(255, 204, 0));
        card2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reg.setBackground(new java.awt.Color(255, 153, 0));
        reg.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        reg.setText("Registration");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        card2.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 320, 90));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        jLabel2.setText("Medical");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        dr.setBackground(new java.awt.Color(51, 204, 0));
        dr.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        dr.setForeground(new java.awt.Color(255, 255, 255));
        dr.setText("Doctor");
        dr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drActionPerformed(evt);
            }
        });
        jPanel3.add(dr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 160, 40));

        nr.setBackground(new java.awt.Color(51, 204, 0));
        nr.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        nr.setForeground(new java.awt.Color(255, 255, 255));
        nr.setText("Nurse");
        nr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrActionPerformed(evt);
            }
        });
        jPanel3.add(nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, 40));

        mediclV.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        mediclV.setForeground(new java.awt.Color(255, 255, 255));
        mediclV.setText("View");
        mediclV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediclVActionPerformed(evt);
            }
        });
        jPanel3.add(mediclV, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, -1));

        card2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 420, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/reg.png"))); // NOI18N
        card2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        at.setBackground(new java.awt.Color(0, 153, 153));
        at.setFont(new java.awt.Font("Eras Bold ITC", 1, 25)); // NOI18N
        at.setText("Non Medical");
        at.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atActionPerformed(evt);
            }
        });
        jPanel4.add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 200, 50));

        card2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 420, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/background.jpg"))); // NOI18N
        card2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 540, 540));

        cardLayout.add(card2, "card2");

        card3.setBackground(new java.awt.Color(153, 255, 0));
        card3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jButton13.setText("PatientCare Unit Details");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        card3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 370, 60));

        jButton14.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jButton14.setText("Emergency Details");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        card3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 370, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/background.jpg"))); // NOI18N
        card3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 520));

        cardLayout.add(card3, "card3");

        card4.setBackground(new java.awt.Color(153, 255, 0));
        card4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jButton17.setText("Out Patient Details");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        card4.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 370, 60));

        jButton12.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jButton12.setText("In Patient Details");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        card4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 370, 60));

        sub.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        sub.setText("Insurance Subscriber");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        card4.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 380, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/background.jpg"))); // NOI18N
        card4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 540, 540));

        cardLayout.add(card4, "card4");

        card5.setBackground(new java.awt.Color(0, 255, 153));
        card5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("Vendor Supply");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        card5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 240, 70));

        jButton10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton10.setText("Drug Registration");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        card5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 240, 70));

        jButton11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton11.setText("Vendor Details");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        card5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 240, 70));

        jButton15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton15.setText("Treatment Info");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        card5.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 240, 60));

        jButton16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton16.setText("Test Info");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        card5.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 240, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/background.jpg"))); // NOI18N
        card5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 540, 540));

        cardLayout.add(card5, "card5");

        card6.setBackground(new java.awt.Color(255, 51, 255));
        card6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jButton3.setText("Nurse Information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        card6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 500, 50));

        jButton4.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jButton4.setText("In Patient Information");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        card6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 500, 50));

        jButton5.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jButton5.setText("Out Patient Information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        card6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 500, 50));

        jButton6.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jButton6.setText("Patient Record");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        card6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 500, 50));

        jButton7.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jButton7.setText("Patientcare");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        card6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 500, 50));

        jButton8.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jButton8.setText("Vendor Supply");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        card6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 500, 50));

        jButton9.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jButton9.setText("Doctor Information");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        card6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 500, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/background.jpg"))); // NOI18N
        card6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 530));

        cardLayout.add(card6, "card6");

        jSplitPane1.setRightComponent(cardLayout);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
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

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/small_close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 25, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab1ActionPerformed
        cardlayout.show(cardLayout, "card1");
    }//GEN-LAST:event_tab1ActionPerformed

    private void tab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab2ActionPerformed
        cardlayout.show(cardLayout, "card2");
    }//GEN-LAST:event_tab2ActionPerformed

    private void tab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab3ActionPerformed
        cardlayout.show(cardLayout, "card3");
    }//GEN-LAST:event_tab3ActionPerformed

    private void tab6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab6ActionPerformed
        cardlayout.show(cardLayout, "card6");
    }//GEN-LAST:event_tab6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed

        Employee emp = new Employee();
        emp.setVisible(true);

    }//GEN-LAST:event_regActionPerformed

    private void drActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drActionPerformed

        if (dr.isSelected()) {
            nr.setSelected(false);
            at.setSelected(false);
            mediclV.setSelected(false);
        }
//        String s = "Pass";
//         String c = JOptionPane.showInputDialog("Enter the doctor pass");
//         
//            if(c==s){
//                JOptionPane.showMessageDialog(this, "Got it");
//            }else if(c == null || (c != null && ("".equals(c))))   
//{
//        System.err.println(c);
//}
        Doctor D = new Doctor();
        D.setVisible(true);
        
        
    }//GEN-LAST:event_drActionPerformed

    private void nrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrActionPerformed
        if (nr.isSelected()) {
            dr.setSelected(false);
            at.setSelected(false);
            mediclV.setSelected(false);

            }
         nurseDashboard nd = new nurseDashboard();
            nd.setVisible(true);
            
    }//GEN-LAST:event_nrActionPerformed

    private void atActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atActionPerformed
        if (at.isSelected()) {
            nr.setSelected(false);
            dr.setSelected(false);
            mediclV.setSelected(false);
        }
         NonMedical nm = new NonMedical();
            nm.setVisible(true);
            
    }//GEN-LAST:event_atActionPerformed

    private int xMouse, yMouse;
    
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void tab5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab5ActionPerformed
        cardlayout.show(cardLayout, "card5");
    }//GEN-LAST:event_tab5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       DocInfo di = new DocInfo();
       di.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        NurseInfo ni = new NurseInfo();
        ni.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       inpatientInfo ipi = new inpatientInfo();
       ipi.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        OutpatientInfo op = new OutpatientInfo();
        op.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       PatientRecordView prv = new PatientRecordView();
       prv.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        PatientCareInfoView pcv = new PatientCareInfoView();
        pcv.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        VendorSupplyViewInfo vsiv = new VendorSupplyViewInfo();
        vsiv.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Drug dg = new Drug();
        dg.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        vendor vn = new vendor();
        vn.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Supply sp = new Supply();
        sp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Ward wr = new Ward();
        wr.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
         Emergency emg = new Emergency();
        emg.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        treatment tr = new treatment();
        tr.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        out_patient op = new out_patient();
       op.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void tab4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab4ActionPerformed
       cardlayout.show(cardLayout, "card4");
    }//GEN-LAST:event_tab4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        In_patient ip = new In_patient();
        ip.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void mediclVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediclVActionPerformed
        if (mediclV.isSelected()) {
            nr.setSelected(false);
            at.setSelected(false);
            dr.setSelected(false);
            
            medicalStaff ms = new  medicalStaff();
            ms.setVisible(true);
        }
    }//GEN-LAST:event_mediclVActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        ins_subscriber insb = new ins_subscriber();
        insb.setVisible(true);
    }//GEN-LAST:event_subActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        test t = new test();
        t.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton at;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JPanel card3;
    private javax.swing.JPanel card4;
    private javax.swing.JPanel card5;
    private javax.swing.JPanel card6;
    private javax.swing.JPanel cardLayout;
    private javax.swing.JRadioButton dr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lable;
    private javax.swing.JRadioButton mediclV;
    private javax.swing.JRadioButton nr;
    private javax.swing.JButton reg;
    private javax.swing.JButton sub;
    private javax.swing.JButton tab1;
    private javax.swing.JButton tab2;
    private javax.swing.JButton tab3;
    private javax.swing.JButton tab4;
    private javax.swing.JButton tab5;
    private javax.swing.JButton tab6;
    // End of variables declaration//GEN-END:variables
}
