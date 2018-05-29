package Formularios;

import Entidades.Jugador;
import Entidades.Juego;
import Entidades.Jugadas;
import Enumerados.TipoDeJuego;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormJugador extends javax.swing.JFrame {


    public FormJugador() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        initComponents();
        ComboTipoJuego=new JComboBox();
        comboJuego.removeAllItems();
        combojugador.removeAllItems();
        
        ArrayList <String> lista= new ArrayList<String>();
        lista=Jugador.retornarJugador();
        for (int i = 0; i < lista.size(); i++) {
        combojugador.addItem(lista.get(i));
        }
        
        ArrayList <String> lista1= new ArrayList<String>();
        lista1=Juego.retornarJuego();
        for (int i = 0; i < lista1.size(); i++) {
        comboJuego.addItem(lista1.get(i));
        

        for (TipoDeJuego tjuego  : TipoDeJuego.values()) {
            
            ComboTipoJuego.addItem(tjuego.toString());
            
        }
        
        }
        
        
        
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJuegos = new javax.swing.JTable();
        btngano = new javax.swing.JRadioButton();
        btnempato = new javax.swing.JRadioButton();
        btnperdio = new javax.swing.JRadioButton();
        btnfps = new javax.swing.JRadioButton();
        btnrpg = new javax.swing.JRadioButton();
        btnarc = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NombreJugador = new javax.swing.JLabel();
        lblJuego = new javax.swing.JLabel();
        TPjuego = new javax.swing.JLabel();
        combojugador = new javax.swing.JComboBox<>();
        comboJuego = new javax.swing.JComboBox<>();
        ComboTipoJuego = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setVisible(true);

        btnmodificar.setVisible(true);
        btnmodificar.setText("Nuevo");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setVisible(true);
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnaceptar.setText("Grabar");
        btnaceptar.setVisible(true);
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        tablaJuegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaJuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaJuegosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaJuegos);

        buttonGroup1.add(btngano);
        btngano.setText("GANÓ");
        btngano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnganoActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnempato);
        btnempato.setText("EMPATÓ");

        buttonGroup1.add(btnperdio);
        btnperdio.setText("PERDIÓ");

        buttonGroup1.add(btnfps);
        btnfps.setText("FPS");

        buttonGroup1.add(btnrpg);
        btnrpg.setText("RPG");

        buttonGroup1.add(btnarc);
        btnarc.setText("ARCADE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("SALA DE JUEGOS");

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("RESULTADO");

        jLabel7.setText("TIPO DE JUEGO");

        NombreJugador.setText("Nombre Jugador");

        lblJuego.setText("Juego");

        TPjuego.setText("Tipo de Juego");

        combojugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));
        combojugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combojugadorActionPerformed(evt);
            }
        });

        comboJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Aniquilador", "La muerte", "El jefe", "La Master", " " }));
        comboJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJuegoActionPerformed(evt);
            }
        });

        ComboTipoJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", "4", " " }));
        ComboTipoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(53, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TPjuego)
                            .addComponent(lblJuego)
                            .addComponent(NombreJugador))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboJuego, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combojugador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboTipoJuego, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnaceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(btngano))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(btnfps, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnempato)
                            .addComponent(btnperdio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnrpg)
                            .addComponent(btnarc))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btngano)
                            .addComponent(btnfps))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnempato)
                            .addComponent(btnrpg))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnperdio)
                            .addComponent(btnarc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(NombreJugador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnaceptar)
                            .addComponent(combojugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblJuego))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmodificar)))
                        .addGap(29, 29, 29)
                        .addComponent(TPjuego)
                        .addGap(16, 16, 16)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalir)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comboJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(ComboTipoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    DefaultTableModel modelo = new DefaultTableModel();
    
    
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

    this.combojugador.setSelectedIndex(0);
    this.ComboTipoJuego.setSelectedIndex(0);
    this.comboJuego.setSelectedIndex(0);
    ComboTipoJuego.grabFocus();
    
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

//        
//        int fila_seleccionada = tablaJuegos.getSelectedRow();
//
//        if (fila_seleccionada>=0){
//        
//            modelo.removeRow(fila_seleccionada);
//        
//      } else {
//        
//        JOptionPane.showMessageDialog(null, "Seleccione una fila");
//         }
//    
//    
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
    
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
//
//    modelo.addRow(new Object[] {this.combojugador.getSelectedItem(), this.comboalias.getSelectedItem(),
//    this.comboid.getSelectedItem(), this.combojuego.getSelectedItem(),this.btngano.getSelectedIcon()});
//          
//    this.combojugador.setSelectedIndex(0);
//    this.comboalias.setSelectedIndex(0);
//    this.comboid.setSelectedIndex(0);
//    this.combojuego.setSelectedIndex(0);
//    
//    comboid.grabFocus();
//        
//        
    }//GEN-LAST:event_btnaceptarActionPerformed

    int filas;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
//    String datos[]= new String[4];
//       
//    datos[0]= this.combojugador.getSelectedItem().toString();
//    datos[1]= this.comboalias.getSelectedItem().toString();
//    datos[2]= this.comboid.getSelectedItem().toString();
//    datos[3]= this.combojuego.getSelectedItem().toString();
//    
//        for (int i = 0; i < tablaJuegos.getColumnCount(); i++) {
//            
//            modelo.setValueAt(datos[i], filas, i);
//            
//        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaJuegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaJuegosMouseClicked
    
        int fila_seleccionada = tablaJuegos.getSelectedRow();
        
        
        combojugador.setSelectedItem(tablaJuegos.getValueAt(fila_seleccionada, 0).toString());
        comboJuego.setSelectedItem(tablaJuegos.getValueAt(fila_seleccionada, 1).toString());
        ComboTipoJuego.setSelectedItem(tablaJuegos.getValueAt(fila_seleccionada, 2).toString());
        

        filas=fila_seleccionada;
        
        
        
    }//GEN-LAST:event_tablaJuegosMouseClicked

    private void btnganoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnganoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnganoActionPerformed

    private void comboJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJuegoActionPerformed

    private void ComboTipoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoJuegoActionPerformed

    private void combojugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combojugadorActionPerformed

        
    }//GEN-LAST:event_combojugadorActionPerformed

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
            java.util.logging.Logger.getLogger(FormJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTipoJuego;
    private javax.swing.JLabel NombreJugador;
    private javax.swing.JLabel TPjuego;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JRadioButton btnarc;
    private javax.swing.JButton btneliminar;
    private javax.swing.JRadioButton btnempato;
    private javax.swing.JRadioButton btnfps;
    private javax.swing.JRadioButton btngano;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JRadioButton btnperdio;
    private javax.swing.JRadioButton btnrpg;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboJuego;
    private javax.swing.JComboBox<String> combojugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJuego;
    private javax.swing.JTable tablaJuegos;
    // End of variables declaration//GEN-END:variables
}