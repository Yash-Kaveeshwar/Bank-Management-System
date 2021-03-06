
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Compaq
 */
public class Bank_management_system extends javax.swing.JFrame {

    /**
     * Creates new form Bank_management_system1
     */
    public Bank_management_system() {
        initComponents();
        
        URL resource = Login.class.getResource("Images/institution_icon.png");                
        ImageIcon icon = new ImageIcon(resource);               
        this.setIconImage(icon.getImage());
        this.setSize(760, 500);
        this.setLocation(260,120);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBTN = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        ModifyBTN = new javax.swing.JButton();
        ShowAllBTN = new javax.swing.JButton();
        ExitBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Management System");
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        AddBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBTN.setText("Add Account");
        AddBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });
        AddBTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AddBTNKeyPressed(evt);
            }
        });
        getContentPane().add(AddBTN);
        AddBTN.setBounds(50, 280, 121, 25);

        DeleteBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteBTN.setText("Delete Account");
        DeleteBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });
        DeleteBTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DeleteBTNKeyPressed(evt);
            }
        });
        getContentPane().add(DeleteBTN);
        DeleteBTN.setBounds(210, 280, 139, 25);

        ModifyBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ModifyBTN.setText("Modify Account");
        ModifyBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModifyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyBTNActionPerformed(evt);
            }
        });
        ModifyBTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ModifyBTNKeyPressed(evt);
            }
        });
        getContentPane().add(ModifyBTN);
        ModifyBTN.setBounds(390, 280, 141, 25);

        ShowAllBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShowAllBTN.setText("Show all Account");
        ShowAllBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowAllBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAllBTNActionPerformed(evt);
            }
        });
        ShowAllBTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ShowAllBTNKeyPressed(evt);
            }
        });
        getContentPane().add(ShowAllBTN);
        ShowAllBTN.setBounds(570, 280, 153, 25);

        ExitBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitBTN.setText("Exit");
        ExitBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBTN);
        ExitBTN.setBounds(330, 395, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wlcm.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-120, 30, 860, 148);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bank1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTNActionPerformed

        
        new Add_Account().setVisible(true); // commands for displaying frame        
        this.setVisible(false);
     
    }//GEN-LAST:event_AddBTNActionPerformed

    private void AddBTNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddBTNKeyPressed

        if ("Enter".equals(KeyEvent.getKeyText(evt.getKeyCode()))) {

            new Add_Account().setVisible(true);  // commands for displaying frame
            this.setVisible(false);
        }

    }//GEN-LAST:event_AddBTNKeyPressed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed

        new Delete_Acccount().setVisible(true);  // commands for displaying frame
        this.setVisible(false);

    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void DeleteBTNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteBTNKeyPressed

        if ("Enter".equals(KeyEvent.getKeyText(evt.getKeyCode()))) {

            new Delete_Acccount().setVisible(true);  // commands for displaying frame
            this.setVisible(false);
        }
       
    }//GEN-LAST:event_DeleteBTNKeyPressed

    private void ModifyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyBTNActionPerformed

        new Modify_Account().setVisible(true);  // commands for displaying frame
        this.setVisible(false);
        
    }//GEN-LAST:event_ModifyBTNActionPerformed

    private void ModifyBTNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ModifyBTNKeyPressed

        if ("Enter".equals(KeyEvent.getKeyText(evt.getKeyCode()))) {

            new Modify_Account().setVisible(true);  // commands for displaying frame
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_ModifyBTNKeyPressed

    private void ShowAllBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllBTNActionPerformed
           
            new Show_all_Account().setVisible(true);  // commands for displaying frame
            this.setVisible(false);
       
    }//GEN-LAST:event_ShowAllBTNActionPerformed
 
    private void ShowAllBTNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ShowAllBTNKeyPressed
        if ("Enter".equals(KeyEvent.getKeyText(evt.getKeyCode()))) {

            new Show_all_Account().setVisible(true);  // commands for displaying frame
            this.setVisible(false);
        }

    }//GEN-LAST:event_ShowAllBTNKeyPressed

    private void ExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTNActionPerformed

        System.exit(0);   // exit the application
        
    }//GEN-LAST:event_ExitBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Bank_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bank_management_system().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton ExitBTN;
    private javax.swing.JButton ModifyBTN;
    private javax.swing.JButton ShowAllBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
