/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.Fabrica;
import controllers.IUsuarioController;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author dylan
 */


public class VentanaPrincipal extends javax.swing.JFrame {
    private IUsuarioController ICU;
    
    
    //logo del frame
    ImageIcon logo = new ImageIcon("src/main/java/includes/logo.png");
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        //Configuraciones manuales
        this.getContentPane().setBackground(Color.black);
        //
        initComponents();
        this.setLocationRelativeTo(null);
        
        //inicio Controlador Usuario
        Fabrica fabrica = Fabrica.getInstance();
        ICU = fabrica.getIUsuarioController();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        contenido = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        registrosBtn = new javax.swing.JMenu();
        altaUsuarioBtn = new javax.swing.JMenuItem();
        AltaGenero = new javax.swing.JMenuItem();
        altaListaBtn = new javax.swing.JMenuItem();
        altaTemaListabtn = new javax.swing.JMenuItem();
        bajaTemaListabtn = new javax.swing.JMenuItem();
        altaAlbumBtn = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        consultarClientesBtn = new javax.swing.JMenuItem();
        consultarPlaylistBtn = new javax.swing.JMenuItem();
        Consultarartista = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(logo.getImage());

        contenido.setBackground(new java.awt.Color(60, 121, 40));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        registrosBtn.setText("Registros");
        registrosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrosBtnActionPerformed(evt);
            }
        });

        altaUsuarioBtn.setLabel("Alta Usuario");
        altaUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaUsuarioBtnActionPerformed(evt);
            }
        });
        registrosBtn.add(altaUsuarioBtn);

        AltaGenero.setText("Alta Genero");
        AltaGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AltaGeneroMouseClicked(evt);
            }
        });
        AltaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaGeneroActionPerformed(evt);
            }
        });
        registrosBtn.add(AltaGenero);

        altaListaBtn.setText("Alta Lista");
        altaListaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaListaBtnActionPerformed(evt);
            }
        });
        registrosBtn.add(altaListaBtn);

        altaTemaListabtn.setText("Alta Tema/Lista");
        altaTemaListabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaTemaListabtnActionPerformed(evt);
            }
        });
        registrosBtn.add(altaTemaListabtn);

        bajaTemaListabtn.setText("Baja Tema/Lista");
        bajaTemaListabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaTemaListabtnActionPerformed(evt);
            }
        });
        registrosBtn.add(bajaTemaListabtn);

        altaAlbumBtn.setText("Alta Album");
        altaAlbumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaAlbumBtnActionPerformed(evt);
            }
        });
        registrosBtn.add(altaAlbumBtn);

        jMenuItem2.setText("Guardar Tema/Lista/Album");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        registrosBtn.add(jMenuItem2);

        jMenuBar2.add(registrosBtn);

        jMenu5.setText("Consultas");

        consultarClientesBtn.setText("Consultar Clientes");
        consultarClientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarClientesBtnActionPerformed(evt);
            }
        });
        jMenu5.add(consultarClientesBtn);

        consultarPlaylistBtn.setText("Consultar Playlist");
        consultarPlaylistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPlaylistBtnActionPerformed(evt);
            }
        });
        jMenu5.add(consultarPlaylistBtn);

        Consultarartista.setText("Consultar Artista");
        Consultarartista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarartistaActionPerformed(evt);
            }
        });
        jMenu5.add(Consultarartista);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaUsuarioBtnActionPerformed
        // TODO add your handling code here:
        AltaUsuario altaUsuario = new AltaUsuario(ICU);
        contenido.add(altaUsuario);
        altaUsuario.setVisible(true);
    }//GEN-LAST:event_altaUsuarioBtnActionPerformed

    private void consultarClientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarClientesBtnActionPerformed
        // TODO add your handling code here:
        ConsultaClientes consultaClientes = new ConsultaClientes();
        contenido.add(consultaClientes);
        consultaClientes.setVisible(true);
    }//GEN-LAST:event_consultarClientesBtnActionPerformed

    private void AltaGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AltaGeneroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AltaGeneroMouseClicked

    private void AltaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaGeneroActionPerformed
        // TODO add your handling code here:
        AltaGenero altaGenero = new AltaGenero();
        contenido.add(altaGenero);
        altaGenero.setVisible(true);
    }//GEN-LAST:event_AltaGeneroActionPerformed

    private void altaListaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaListaBtnActionPerformed
        // TODO add your handling code here:
        AltaLista altaLista = new AltaLista();
        contenido.add(altaLista);
        altaLista.setVisible(true);
    }//GEN-LAST:event_altaListaBtnActionPerformed

    private void registrosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrosBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrosBtnActionPerformed

    private void altaTemaListabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaTemaListabtnActionPerformed
        AltaTemaLista altaTemaLista = new AltaTemaLista();
        contenido.add(altaTemaLista);
        altaTemaLista.setVisible(true);
    }//GEN-LAST:event_altaTemaListabtnActionPerformed

    private void bajaTemaListabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaTemaListabtnActionPerformed
        // TODO add your handling code here:
        BajaTemaLista bajaTemaLista = new BajaTemaLista();
        contenido.add(bajaTemaLista);
        bajaTemaLista.setVisible(true);
    }//GEN-LAST:event_bajaTemaListabtnActionPerformed

    private void altaAlbumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaAlbumBtnActionPerformed
        // TODO add your handling code here:
        
        AltaAlbum altaAlbum = new AltaAlbum();
        contenido.add(altaAlbum);
        altaAlbum.setVisible(true);
        
    }//GEN-LAST:event_altaAlbumBtnActionPerformed

    private void consultarPlaylistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPlaylistBtnActionPerformed
        // TODO add your handling code here:
        ConsultarPlaylist consultarPlaylist = new ConsultarPlaylist();
        contenido.add(consultarPlaylist);
        consultarPlaylist.setVisible(true);
    }//GEN-LAST:event_consultarPlaylistBtnActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        GuardarTemaListaAlbum guardarTemaListaAlbum = new GuardarTemaListaAlbum();
        contenido.add(guardarTemaListaAlbum);
        guardarTemaListaAlbum.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ConsultarartistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarartistaActionPerformed
        // TODO add your handling code here:
        ConsultarArtista ConsultarArtista = new ConsultarArtista();
        contenido.add(ConsultarArtista);
        ConsultarArtista.setVisible(true);
    }//GEN-LAST:event_ConsultarartistaActionPerformed
    
        
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AltaGenero;
    private javax.swing.JMenuItem Consultarartista;
    private javax.swing.JMenuItem altaAlbumBtn;
    private javax.swing.JMenuItem altaListaBtn;
    private javax.swing.JMenuItem altaTemaListabtn;
    protected javax.swing.JMenuItem altaUsuarioBtn;
    private javax.swing.JMenuItem bajaTemaListabtn;
    private javax.swing.JMenuItem consultarClientesBtn;
    private javax.swing.JMenuItem consultarPlaylistBtn;
    private javax.swing.JPanel contenido;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu registrosBtn;
    // End of variables declaration//GEN-END:variables
}
