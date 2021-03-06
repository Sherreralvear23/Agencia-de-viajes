
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herrera
 */
public class Principal14 extends javax.swing.JFrame {

    /**
     * Creates new form Principal14
     */
    public Principal14() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPersonas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCancelar = new javax.swing.JTextField();
        cmbCalcular = new javax.swing.JButton();
        cmbBorrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSinI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jLabel1.setText("AGENCIA DE VIAJES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel2.setText("Número de personas que deseen viajar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        getContentPane().add(txtPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, -1));

        jLabel3.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel3.setText("Total a pagar con IVA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        txtCancelar.setEditable(false);
        getContentPane().add(txtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 110, -1));

        cmbCalcular.setText("CALCULAR");
        cmbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, -1));

        cmbBorrar.setText("BORRAR");
        getContentPane().add(cmbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 110, -1));

        jLabel4.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel4.setText("Valor sin IVA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtSinI.setEditable(false);
        getContentPane().add(txtSinI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalcularActionPerformed
        // TODO add your handling code here:
        String  per,res,iva,total;
        double n1 = 0,co, iv,tota;
        
        
        
        if (txtPersonas.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite el numero de personas que desean viajar", "Error",JOptionPane.ERROR_MESSAGE);
        txtPersonas.requestFocusInWindow();
        } else {
        n1= Double.parseDouble(txtPersonas.getText());
        
        }
        
        co = n1*25000;
        res= String.valueOf(co);
        txtSinI.setText(res);
        
        iv = co*12/100;
        iva= String.valueOf(iv);
         txtCancelar.setText(iva);
        
         tota = co+iv;
         total= String.valueOf(tota);
         txtCancelar.setText(total);
        
    }//GEN-LAST:event_cmbCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Principal14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbBorrar;
    private javax.swing.JButton cmbCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCancelar;
    private javax.swing.JTextField txtPersonas;
    private javax.swing.JTextField txtSinI;
    // End of variables declaration//GEN-END:variables
}
