/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class Panel_Control extends javax.swing.JFrame {
    DefaultTableModel model=new DefaultTableModel();
    
    /**
     * Creates new form Panel_Control
     */
    public Panel_Control() {
        initComponents();
        this.setLocationRelativeTo(null);
        model.addColumn("Nombre");
        model.addColumn("DNI");
        model.addColumn("Pasteles");
        model.addColumn("Costo");
        this.jtabla.setModel(model);
    }

    @Override
    public Image getIconImage(){
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/625169.png"));
        return retvalue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        jnombre = new javax.swing.JLabel();
        japellidos = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jpasteles = new javax.swing.JLabel();
        jcosto = new javax.swing.JLabel();
        jagregar = new javax.swing.JButton();
        jeditar = new javax.swing.JButton();
        jeliminar = new javax.swing.JButton();
        cbpastel = new javax.swing.JComboBox<>();
        cbcosto = new javax.swing.JComboBox<>();
        jnuevo = new javax.swing.JButton();
        jwallpaper2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jarchivo = new javax.swing.JMenu();
        jcerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtabla.setBackground(new java.awt.Color(0, 0, 0));
        jtabla.setForeground(new java.awt.Color(255, 255, 255));
        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DNI", "Pasteles", "Costo"
            }
        ));
        jScrollPane1.setViewportView(jtabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 880, 240));

        jnombre.setText("Nombre :");
        getContentPane().add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 60, 20));

        japellidos.setText("         DNI :");
        getContentPane().add(japellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 60, -1));

        txtdni.setBackground(new java.awt.Color(0, 0, 0));
        txtdni.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        txtdni.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, 20));

        txtnombre.setBackground(new java.awt.Color(0, 0, 0));
        txtnombre.setFont(new java.awt.Font("Dubai", 1, 10)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, 20));

        jpasteles.setText("Pasteles:");
        getContentPane().add(jpasteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jcosto.setText("     Costo :");
        getContentPane().add(jcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jagregar.setBackground(new java.awt.Color(51, 51, 51));
        jagregar.setForeground(new java.awt.Color(204, 204, 204));
        jagregar.setText("Agregar");
        jagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jagregarActionPerformed(evt);
            }
        });
        getContentPane().add(jagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 90, 20));

        jeditar.setBackground(new java.awt.Color(51, 51, 51));
        jeditar.setForeground(new java.awt.Color(204, 204, 204));
        jeditar.setText("Editar");
        jeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeditarActionPerformed(evt);
            }
        });
        getContentPane().add(jeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 90, 20));

        jeliminar.setBackground(new java.awt.Color(51, 51, 51));
        jeliminar.setForeground(new java.awt.Color(204, 204, 204));
        jeliminar.setText("Eliminar");
        jeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 90, 20));

        cbpastel.setBackground(new java.awt.Color(255, 255, 255));
        cbpastel.setForeground(new java.awt.Color(0, 0, 0));
        cbpastel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t>Seleccione<", "\tPastel de Chocolate", "\tPastel de Vainilla", "\tPastel Tres Leches" }));
        cbpastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpastelActionPerformed(evt);
            }
        });
        getContentPane().add(cbpastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 160, 20));

        cbcosto.setBackground(new java.awt.Color(255, 255, 255));
        cbcosto.setForeground(new java.awt.Color(0, 0, 0));
        cbcosto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t> Seleccione < ", "\tS/. 20.00", "\tS/. 15.00", "\tS/. 18.00" }));
        getContentPane().add(cbcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 160, 20));

        jnuevo.setBackground(new java.awt.Color(51, 51, 51));
        jnuevo.setForeground(new java.awt.Color(204, 204, 204));
        jnuevo.setText("Nuevo");
        jnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 90, 20));

        jwallpaper2.setForeground(new java.awt.Color(0, 0, 0));
        jwallpaper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sunrise-illustration-digital-art-uhdpaper.com-4K-4.1963-wp.thumbnail.jpg"))); // NOI18N
        getContentPane().add(jwallpaper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        jarchivo.setText("Archivo");

        jcerrar.setText("Cerrar Sesion");
        jcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcerrarActionPerformed(evt);
            }
        });
        jarchivo.add(jcerrar);

        jMenuBar1.add(jarchivo);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jcerrarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jagregarActionPerformed
        String []agregar=new String [4];
        agregar[0]=txtnombre.getText();
        agregar[1]=txtdni.getText();
        agregar[2]=(String)cbpastel.getSelectedItem();
        agregar[3]=(String)cbcosto.getSelectedItem();
        model.addRow(agregar);
        
    }//GEN-LAST:event_jagregarActionPerformed

    private void jnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnuevoActionPerformed
        txtnombre.setText("");
        txtdni.setText("");
        
    }//GEN-LAST:event_jnuevoActionPerformed

    private void jeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeliminarActionPerformed
        int eli=jtabla.getSelectedRowCount();
        if (eli>=0) {
            model.removeRow(eli);           
        }else{
            JOptionPane.showMessageDialog(null, "No hay datos que eliminar");
        }
    }//GEN-LAST:event_jeliminarActionPerformed

    private void cbpastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpastelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpastelActionPerformed

    private void jeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditarActionPerformed
        
    }//GEN-LAST:event_jeditarActionPerformed

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
            java.util.logging.Logger.getLogger(Panel_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Control().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbcosto;
    private javax.swing.JComboBox<String> cbpastel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jagregar;
    private javax.swing.JLabel japellidos;
    private javax.swing.JMenu jarchivo;
    private javax.swing.JMenuItem jcerrar;
    private javax.swing.JLabel jcosto;
    private javax.swing.JButton jeditar;
    private javax.swing.JButton jeliminar;
    private javax.swing.JLabel jnombre;
    private javax.swing.JButton jnuevo;
    private javax.swing.JLabel jpasteles;
    private javax.swing.JTable jtabla;
    private javax.swing.JLabel jwallpaper2;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
