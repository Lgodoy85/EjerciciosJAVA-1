/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author alumno
 */
public class JFvista extends javax.swing.JFrame {

    /**
     * Creates new form JFvista
     */
    
    JPanel panel;
         
    public JFvista() {
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

        jpCine = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jlCantidadDeSalas = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfCantidadDeSalas = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        jpEntrada = new javax.swing.JPanel();
        jlCantidad = new javax.swing.JLabel();
        jbVender = new javax.swing.JButton();
        jtfCantidad = new javax.swing.JTextField();
        jpCineModificar = new javax.swing.JPanel();
        jcbListaDeCines = new javax.swing.JComboBox<>();
        jlCines = new javax.swing.JLabel();
        jbEditar = new javax.swing.JButton();
        jlNombreEditado = new javax.swing.JLabel();
        jlSalasEditado = new javax.swing.JLabel();
        jtfNombreEditado = new javax.swing.JTextField();
        jtfSalasEditado = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCine = new javax.swing.JMenu();
        jmiCargar = new javax.swing.JMenuItem();
        jmiModificar = new javax.swing.JMenuItem();
        jmEntrada = new javax.swing.JMenu();
        jmiVender = new javax.swing.JMenuItem();
        jmiLugaresLibres = new javax.swing.JMenuItem();
        jmSala = new javax.swing.JMenu();
        jmiCantidadDeButacas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpCine.setVisible(false);

        jlNombre.setText("Nombre:");

        jlCantidadDeSalas.setText("Cantidad de salas:");

        jbAceptar.setText("Aceptar");

        javax.swing.GroupLayout jpCineLayout = new javax.swing.GroupLayout(jpCine);
        jpCine.setLayout(jpCineLayout);
        jpCineLayout.setHorizontalGroup(
            jpCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpCineLayout.createSequentialGroup()
                        .addComponent(jlNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCineLayout.createSequentialGroup()
                        .addComponent(jlCantidadDeSalas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAceptar)
                            .addComponent(jtfCantidadDeSalas))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jpCineLayout.setVerticalGroup(
            jpCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCantidadDeSalas)
                    .addComponent(jtfCantidadDeSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jbAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpEntrada.setVisible(false);

        jlCantidad.setText("Cantidad:");

        jbVender.setText("Vender");

        javax.swing.GroupLayout jpEntradaLayout = new javax.swing.GroupLayout(jpEntrada);
        jpEntrada.setLayout(jpEntradaLayout);
        jpEntradaLayout.setHorizontalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaLayout.createSequentialGroup()
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEntradaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jlCantidad)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEntradaLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jbVender)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jpEntradaLayout.setVerticalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCantidad)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVender)
                .addGap(28, 28, 28))
        );

        jpCineModificar.setVisible(false);

        jcbListaDeCines.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlCines.setText("Cines:");

        jbEditar.setText("Editar");

        jlNombreEditado.setText("Nombre:");

        jlSalasEditado.setText("Salas:");

        javax.swing.GroupLayout jpCineModificarLayout = new javax.swing.GroupLayout(jpCineModificar);
        jpCineModificar.setLayout(jpCineModificarLayout);
        jpCineModificarLayout.setHorizontalGroup(
            jpCineModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCineModificarLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jpCineModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCineModificarLayout.createSequentialGroup()
                        .addComponent(jlCines)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbListaDeCines, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jpCineModificarLayout.createSequentialGroup()
                        .addGroup(jpCineModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCineModificarLayout.createSequentialGroup()
                                .addComponent(jlNombreEditado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCineModificarLayout.createSequentialGroup()
                                .addComponent(jlSalasEditado)
                                .addGap(22, 22, 22)))
                        .addGroup(jpCineModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSalasEditado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombreEditado, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpCineModificarLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jbEditar)))
                        .addGap(27, 27, 27))))
        );
        jpCineModificarLayout.setVerticalGroup(
            jpCineModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCineModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCineModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbListaDeCines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCines, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jpCineModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreEditado)
                    .addComponent(jtfNombreEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCineModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalasEditado)
                    .addComponent(jtfSalasEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbEditar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jmCine.setText("Cine");
        jmCine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCineMouseClicked(evt);
            }
        });

        jmiCargar.setText("Cargar");
        jmiCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmiCargarMousePressed(evt);
            }
        });
        jmiCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCargarActionPerformed(evt);
            }
        });
        jmCine.add(jmiCargar);

        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jmCine.add(jmiModificar);

        jMenuBar1.add(jmCine);
        jmCine.getAccessibleContext().setAccessibleParent(jmiCargar);

        jmEntrada.setText("Entrada");

        jmiVender.setText("Vender");
        jmiVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVenderActionPerformed(evt);
            }
        });
        jmEntrada.add(jmiVender);

        jmiLugaresLibres.setText("Lugares libres");
        jmEntrada.add(jmiLugaresLibres);

        jMenuBar1.add(jmEntrada);

        jmSala.setText("Sala");

        jmiCantidadDeButacas.setText("Cantidad de butacas");
        jmSala.add(jmiCantidadDeButacas);

        jMenuBar1.add(jmSala);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jpCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpCineModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpCineModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jpCine.getAccessibleContext().setAccessibleParent(jmiCargar);
        jpEntrada.getAccessibleContext().setAccessibleParent(jmiVender);
        jpCineModificar.getAccessibleContext().setAccessibleParent(jmiModificar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCargarActionPerformed
        
        if(panel!=null)
        {
            panel.setVisible(false);
        }
        
        panel=JFvista.jpCine;
        
        panel.setVisible(true);
         

           
    }//GEN-LAST:event_jmiCargarActionPerformed

    private void jmiCargarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiCargarMousePressed
       
    }//GEN-LAST:event_jmiCargarMousePressed

    private void jmCineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCineMouseClicked
        
    }//GEN-LAST:event_jmCineMouseClicked

    private void jmiVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVenderActionPerformed
       if(panel!=null)
        {
            panel.setVisible(false);
        }
        
        panel=JFvista.jpEntrada;
        
        panel.setVisible(true);
        
        
        
    }//GEN-LAST:event_jmiVenderActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
       if(panel!=null)
        {
            panel.setVisible(false);
        }
        
        panel=JFvista.jpCineModificar;
        
        panel.setVisible(true);
        
    }//GEN-LAST:event_jmiModificarActionPerformed

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
            java.util.logging.Logger.getLogger(JFvista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFvista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFvista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFvista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        ArrayList listaPaneles;
        listaPaneles= new ArrayList<JPanel>();
        
        listaPaneles.add(jpCine);
        listaPaneles.add(jpEntrada);
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFvista().setVisible(true);
            }
        });
    }
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbVender;
    private javax.swing.JComboBox<String> jcbListaDeCines;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlCantidadDeSalas;
    private javax.swing.JLabel jlCines;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreEditado;
    private javax.swing.JLabel jlSalasEditado;
    private javax.swing.JMenu jmCine;
    private javax.swing.JMenu jmEntrada;
    private javax.swing.JMenu jmSala;
    private javax.swing.JMenuItem jmiCantidadDeButacas;
    private javax.swing.JMenuItem jmiCargar;
    private javax.swing.JMenuItem jmiLugaresLibres;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JMenuItem jmiVender;
    public static javax.swing.JPanel jpCine;
    public static javax.swing.JPanel jpCineModificar;
    public static javax.swing.JPanel jpEntrada;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfCantidadDeSalas;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombreEditado;
    private javax.swing.JTextField jtfSalasEditado;
    // End of variables declaration//GEN-END:variables
}
