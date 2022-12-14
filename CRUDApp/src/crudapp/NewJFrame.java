/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author BIGUY
 */
public class NewJFrame extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        con = connection.conn();
         showPsron();
         ID.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtContact = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCkear = new javax.swing.JButton();
        txtFirsname = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbSort = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD APP");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Personal Details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel2.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, 40));

        txtLastname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 150, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Phone Number:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Gender:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        cmbGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female", "Other" }));
        jPanel2.add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 150, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 30));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 30));

        btnCkear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCkear.setText("CANCEL");
        btnCkear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCkearActionPerformed(evt);
            }
        });
        jPanel3.add(btnCkear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 80, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 310, 120));

        txtFirsname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtFirsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, 40));

        ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ID.setText("ID:");
        jPanel2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("First Name:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 410, 470));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 410));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        cmbSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Male", "Female", "Other" }));
        cmbSort.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSortItemStateChanged(evt);
            }
        });
        cmbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSortActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 920, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String fname = txtFirsname.getText().trim().toLowerCase();
        String Lname = txtLastname.getText().trim().toLowerCase();
        String contact = txtContact.getText().trim().toLowerCase();
        String Gender = cmbGender.getSelectedItem().toString();
 int confirm = JOptionPane.showConfirmDialog(null, "Confim to sava Data", "Record save", JOptionPane.YES_NO_OPTION);
 if(confirm==0){
        try{
            if(fname.equals("")  || Lname.equals("") || contact.equals("") || Gender.equals(" ")){
              JOptionPane.showMessageDialog(null, "Please Complete the form");
            }else{
               // JOptionPane.showMessageDialog(null, "Complete the form");
                     String sql = "INSERT INTO person(firstname,lastname,gender,phonenumber)"
                        + "VALUES(?,?,?,?)";
                
                ps = con.prepareStatement(sql);
                ps.setString(1, fname);
                ps.setString(2, Lname);
                ps.setString(3, Gender);
                ps.setString(4, contact);
                ps.execute();
                showPsron();
                  Cancel();
                
             JOptionPane.showMessageDialog(null, "Data Save");
            }
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
 }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        TableModel model = jTable1.getModel();
        
        int rowSelected = jTable1.getSelectedRow();
        int index = Integer.parseInt(model.getValueAt(rowSelected, 0).toString());
        
        try {
            String sql = "SELECT * FROM person where id='"+index+"'";
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            if (rs.next()) {
                 String id = rs.getString("id");
                ID.setText(id);
                
                String fname = rs.getString("firstname");
                txtFirsname.setText(fname);
                
                 String lname = rs.getString("lastname");
                txtLastname.setText(lname);
                
                 String gender = rs.getString("gender");
                cmbGender.setSelectedItem(gender);
                
                 String contact = rs.getString("phonenumber");
                txtContact.setText(contact);
                
                ID.setVisible(true);
                 btnUpdate.setEnabled(true);
                 btnDelete.setEnabled(true);
                
                btnSave.setEnabled(false);
                
             
            }
        } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String fname = txtFirsname.getText().trim().toLowerCase();
        String Lname = txtLastname.getText().trim().toLowerCase();
        String Gender = cmbGender.getSelectedItem().toString();
        String contact = txtContact.getText().trim().toLowerCase();
  int confirm = JOptionPane.showConfirmDialog(null, "Confim to Update Data", "Record Update", JOptionPane.YES_NO_OPTION);
  if(confirm==0){
        try {
            String sql ="UPDATE person set firstname=?,lastname=?,gender=?,phonenumber=? WHERE ID='"+ID.getText()+"'";
            ps = con.prepareStatement(sql);
            ps.setString(1, fname);
            ps.setString(2, Lname);
            ps.setString(3, Gender);
            ps.setString(4, contact);
            ps.executeUpdate();
            showPsron();
            
                btnUpdate.setEnabled(false);
                 btnDelete.setEnabled(false);
                
                btnSave.setEnabled(true);
                  Cancel();
            
            JOptionPane.showMessageDialog(null, "Record Update");
        } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());

        }
  }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCkearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCkearActionPerformed
        // TODO add your handling code here:
        Cancel();
    }//GEN-LAST:event_btnCkearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
  int confirm = JOptionPane.showConfirmDialog(null, "Confim to Delete Data", "Record Delete", JOptionPane.YES_NO_OPTION);
  if(confirm==0){        
        try {
            String sql="DELETE FROM person WHERE id="+ID.getText()+"";
            ps = con.prepareStatement(sql);
            ps.execute();
             JOptionPane.showMessageDialog(null, "Record Deleted");
              Cancel();
              showPsron();
        } catch (Exception e) {
        }
  }
         
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String txt = txtSearch.getText();
        String sql = "Select * from person where firstname like '"+txt+"%' OR lastname like '"+txt+"%' OR phonenumber like '"+txt+"%'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void cmbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSortActionPerformed

    private void cmbSortItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSortItemStateChanged
        // TODO add your handling code here:
        String sort = cmbSort.getSelectedItem().toString();
        if(sort.equals("Choose")){
            showPsron();
        }
        else{
        String sql ="SELECT * From person where gender like '"+sort+"%'";
        try {
                ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    }//GEN-LAST:event_cmbSortItemStateChanged

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton btnCkear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtFirsname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
void showPsron(){
    String sql ="SELECT * FROM Person ";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}

void Cancel(){
    
        ID.setVisible(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnSave.setEnabled(true);
        
        txtFirsname.setText("");
        txtLastname.setText("");
        txtContact.setText("");
        cmbGender.setSelectedIndex(0);
         cmbSort.setSelectedIndex(0);
        
        showPsron();
    
    

}


 boolean checkInput(){
     
     if(txtFirsname.getText()==null || txtLastname.getText()==null || txtContact.getText()==null
           ){
          JOptionPane.showMessageDialog(null, "Complete the form");
        return false;
     }else{
         return true;
     }
 }


}
