/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package home;


import java.awt.Toolkit;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

/**
 *
 * @author hi
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("login-lock.png")));
         loadTable();
    }

    //method for loading all data into table
    public void loadAllDataIntoTable(List<HomeBean> list){
    
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for(HomeBean bean:list){
        //vector is agrowable array like array it contains object;
        Vector v = new Vector();
        v.add(bean.getId());
        v.add(bean.getFirstName());
         v.add(bean.getLastName());
          v.add(bean.getGender());
           v.add(bean.getCity());
            v.add(bean.getAge());
             v.add(bean.getAddress());
             
             dtm.addRow(v);
                
        }
    }
    
    public void loadTable(){// call this method into constructor...
    //accessing thoese method that contains all data
    HomeBal HomeBalObj = new HomeBal();
    List list = HomeBalObj.loadData();
        loadAllDataIntoTable(list);
    
    }
    
    public void clearTextFieldsData(){
    
        jFname1.setText("");
        jLname.setText("");
        jAge.setText("");
        jAddress.setText("");
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jFname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jAge = new javax.swing.JTextField();
        jCity = new javax.swing.JComboBox<>();
        jGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAddress = new javax.swing.JTextArea();
        jDelete = new javax.swing.JButton();
        jUbdate = new javax.swing.JButton();
        jCleare = new javax.swing.JButton();
        jInsert = new javax.swing.JButton();
        jLname = new javax.swing.JTextField();
        jFname1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1270, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1270, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 1270, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 1290, 90));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 90, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 240, 0));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CRUD APPLICATION");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 300, 20));

        jFname.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jFname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jFname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFnameActionPerformed(evt);
            }
        });
        jFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFnameKeyReleased(evt);
            }
        });
        jPanel3.add(jFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 300, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/pngegg-4.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 140, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 120));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true), "Crud App", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Stencil", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("address");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("First Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Last Name ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("gender");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("city");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Age");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        jAge.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgeActionPerformed(evt);
            }
        });
        jPanel4.add(jAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 360, 30));

        jCity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCity.setForeground(new java.awt.Color(0, 153, 153));
        jCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Herat", "Kabul", "Mazar", "Ghandahar", "Ghazni", "Balkh" }));
        jCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel4.add(jCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 360, 30));

        jGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jGender.setForeground(new java.awt.Color(0, 153, 153));
        jGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        jGender.setToolTipText("");
        jGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel4.add(jGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 360, 30));

        jAddress.setColumns(20);
        jAddress.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jAddress.setRows(5);
        jAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jScrollPane1.setViewportView(jAddress);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 360, 90));

        jDelete.setBackground(new java.awt.Color(0, 153, 153));
        jDelete.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jDelete.setForeground(new java.awt.Color(255, 255, 255));
        jDelete.setText("delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 160, 40));

        jUbdate.setBackground(new java.awt.Color(0, 153, 153));
        jUbdate.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jUbdate.setForeground(new java.awt.Color(255, 255, 255));
        jUbdate.setText("Ubdate");
        jUbdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUbdateActionPerformed(evt);
            }
        });
        jPanel4.add(jUbdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 160, 40));

        jCleare.setBackground(new java.awt.Color(0, 153, 153));
        jCleare.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jCleare.setForeground(new java.awt.Color(255, 255, 255));
        jCleare.setText("clear");
        jCleare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleareActionPerformed(evt);
            }
        });
        jPanel4.add(jCleare, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 160, 40));

        jInsert.setBackground(new java.awt.Color(0, 153, 153));
        jInsert.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jInsert.setForeground(new java.awt.Color(255, 255, 255));
        jInsert.setText("insert");
        jInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertActionPerformed(evt);
            }
        });
        jPanel4.add(jInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 160, 40));

        jLname.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLnameActionPerformed(evt);
            }
        });
        jPanel4.add(jLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 360, 30));

        jFname1.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jFname1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jFname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFname1ActionPerformed(evt);
            }
        });
        jPanel4.add(jFname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 360, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 510, 450));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "First Name", "Last Name", "Gender", "City", "Age", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 750, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgeActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        //call delete function
        HomeBal HomeBalObj = new HomeBal();
        HomeBalObj.deleteItem(id);
        loadTable();
        clearTextFieldsData();
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jUbdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUbdateActionPerformed
        String firstname = jFname1.getText();
        String lastname = jLname.getText();
        String gender = (String) jGender.getSelectedItem();
        String city = (String) jCity.getSelectedItem();
        String age = jAge.getText();
        String address = jAddress.getText();
        HomeBean HomeBeanObj = new HomeBean(id, firstname, lastname, gender, city, age, address);
        HomeBal HomeBalObj = new HomeBal();
        HomeBalObj.ubdate(HomeBeanObj);
        loadTable();
        
        clearTextFieldsData();
    }//GEN-LAST:event_jUbdateActionPerformed

    private void jCleareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleareActionPerformed
        // call the clear method
        
        clearTextFieldsData();
    }//GEN-LAST:event_jCleareActionPerformed

    private void jInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertActionPerformed
        // getting the inputs values
        
        String firstname = jFname1.getText();
        String lastname = jLname.getText();
        String gender = (String) jGender.getSelectedItem();
        String city = (String) jCity.getSelectedItem();
        String age = jAge.getText();
        String address = jAddress.getText();
        
        // object of HomeBean
        if(firstname.equals("") || lastname.equals("") || age.equals("") || address.equals("")){
        
             JOptionPane.showMessageDialog(null, "the inputs should not be empty");
        }else{
        HomeBean HomeBeanObj = new HomeBean(0,firstname, lastname, gender, city, age, address);
    
        //create HomeBal Obj
        
        HomeBal HomeBalObj = new HomeBal();
        HomeBalObj.insert(HomeBeanObj);
        
        loadTable();
        
        clearTextFieldsData();
        }
    }//GEN-LAST:event_jInsertActionPerformed

    private void jLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLnameActionPerformed

    int id = 0;// gloable id;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "please select any record from table for ubdate or delete");
        }else{
        id = (int) jTable1.getValueAt(row, 0);// we are getting id from table;
        HomeBal HomeBalObj = new HomeBal();
        HomeBean HomeBeanObj = HomeBalObj.returnDatTOTextField(id);// this method has return type
        jFname.setText(HomeBeanObj.getFirstName());
        jLname.setText(HomeBeanObj.getLastName());
        jGender.setSelectedItem(HomeBeanObj.getGender());
        jCity.setSelectedItem(HomeBeanObj.getCity());
        jAge.setText(HomeBeanObj.getAge());
        jAddress.setText(HomeBeanObj.getAddress());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jFname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFname1ActionPerformed

    private void jFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFnameActionPerformed

    private void jFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFnameKeyPressed
       
    }//GEN-LAST:event_jFnameKeyPressed

    private void jFnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFnameKeyReleased
         // Search
        DefaultTableModel obj = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        jTable1.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jFname.getText()));
    }//GEN-LAST:event_jFnameKeyReleased

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAddress;
    private javax.swing.JTextField jAge;
    private javax.swing.JComboBox<String> jCity;
    private javax.swing.JButton jCleare;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jFname;
    private javax.swing.JTextField jFname1;
    private javax.swing.JComboBox<String> jGender;
    private javax.swing.JButton jInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUbdate;
    // End of variables declaration//GEN-END:variables
}
