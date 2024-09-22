/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import controllers.AlbumController;
import controllers.CancionController;
import controllers.GeneroController;
import controllers.UsuarioController;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Album;


/**
 *
 * @author lilia
 */
public class ConsultarAlbum extends javax.swing.JInternalFrame {
GeneroController genController= new GeneroController();
UsuarioController UController= new UsuarioController();
AlbumController AController=new AlbumController();
CancionController CController= new CancionController();


    /**
     * Creates new form ConsultarAlbum
     */

    public ConsultarAlbum() {
        initComponents();
        ComboBoxArtista.setVisible(false);
        ComboBoxGenero.setVisible(false);
        TablaAlbum.setVisible(false);
        ArtistaL.setVisible(false);
        GeneroL.setVisible(false);
        
       
        
        List<String> nombresGenero = genController.obtenerNombresGeneros();
        for (String nombreG : nombresGenero) {
            ComboBoxGenero.addItem(nombreG);
        }
         List<String> nombresArtistas = UController.obtenerNombresArtistas();
        for (String nombreA : nombresArtistas) {
            ComboBoxArtista.addItem(nombreA);
        }
        
          
    }
class NonEditableTableModel extends DefaultTableModel {

        public NonEditableTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
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

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        DatosAlbum = new javax.swing.JTable();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        DatosCancion = new javax.swing.JTable();
        ComboBoxFiltro = new javax.swing.JComboBox<>();
        ComboBoxGenero = new javax.swing.JComboBox<>();
        ComboBoxArtista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlbum = new javax.swing.JTable();
        GeneroL = new javax.swing.JLabel();
        ArtistaL = new javax.swing.JLabel();

        jFrame1.setMinimumSize(new java.awt.Dimension(800, 400));
        jFrame1.setPreferredSize(new java.awt.Dimension(800, 400));
        jFrame1.setLocationRelativeTo(null);

        DatosAlbum.setModel(new javax.swing.table.DefaultTableModel(
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
        DatosAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatosAlbumMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DatosAlbum);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
        );

        jFrame2.setMinimumSize(new java.awt.Dimension(800, 400));
        jFrame2.setPreferredSize(new java.awt.Dimension(800, 400));
        jFrame1.setLocationRelativeTo(null);

        DatosCancion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(DatosCancion);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
            .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
        );

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        ComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtro", "Artista", "Genero" }));
        ComboBoxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFiltroActionPerformed(evt);
            }
        });

        ComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        ComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxGeneroActionPerformed(evt);
            }
        });

        ComboBoxArtista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        ComboBoxArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxArtistaActionPerformed(evt);
            }
        });

        TablaAlbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Albums"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAlbumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaAlbum);

        GeneroL.setText("Genero:");

        ArtistaL.setText("Artista:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ArtistaL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GeneroL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(ComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(ComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GeneroL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArtistaL))
                .addContainerGap(302, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFiltroActionPerformed
        // TODO add your handling code here:
        if ("Artista".equals(ComboBoxFiltro.getSelectedItem())){
           ComboBoxArtista.setVisible(true);
            ArtistaL.setVisible(true);
             GeneroL.setVisible(false);
           ComboBoxGenero.setVisible(false);
        }else if("Genero".equals(ComboBoxFiltro.getSelectedItem())){
            ComboBoxGenero.setVisible(true);
             GeneroL.setVisible(true);
              ArtistaL.setVisible(false);
            ComboBoxArtista.setVisible(false);
            
        }
    }//GEN-LAST:event_ComboBoxFiltroActionPerformed

    private void ComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxGeneroActionPerformed
        // TODO add your handling code here:
       String generoSeleccionado = ComboBoxGenero.getSelectedItem().toString();
    
   
    List<Album> albumes = AController.obtenerAlbumesPorGenero(generoSeleccionado);
    
   
    String[] columnNames = {"Álbum"};
    Object[][] data = new Object[albumes.size()][1];
    for (int i = 0; i < albumes.size(); i++) {
        data[i][0] = albumes.get(i).getNombre();  
    }
    

    NonEditableTableModel modelo= new NonEditableTableModel(data,columnNames);
    TablaAlbum.setModel(modelo);
        
    
    TablaAlbum.setVisible(true);  
        
    }//GEN-LAST:event_ComboBoxGeneroActionPerformed

    private void ComboBoxArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxArtistaActionPerformed
        // TODO add your handling code here:
         String artistaSeleccionado = ComboBoxArtista.getSelectedItem().toString();
    
   
    List<Album> albumes = AController.obtenerAlbumArtista(artistaSeleccionado);
    
  
    String[] columnNames = {"Álbum"};
    Object[][] data = new Object[albumes.size()][1];
    for (int i = 0; i < albumes.size(); i++) {
        data[i][0] = albumes.get(i).getNombre();  
    }
    
    
     NonEditableTableModel modelo= new NonEditableTableModel(data,columnNames);
    TablaAlbum.setModel(modelo);
    TablaAlbum.setVisible(true);  // Mostrar la tabla
    }//GEN-LAST:event_ComboBoxArtistaActionPerformed

    private void TablaAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAlbumMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) { // Detectar clic simple
            int row = TablaAlbum.rowAtPoint(evt.getPoint());
            if (row >= 0) {
                
               
                String id = (String) TablaAlbum.getValueAt(row, 0); 
                jFrame1.setVisible(true);
                
                Object[][] datos = AController.obtenerDatosAlbum(id);
                String[] columnNames = {"ID" , "NOMBRE", "AÑO", "ARTISTA", "GENEROS", "CANCIONES"};
                NonEditableTableModel tableModel = new NonEditableTableModel(datos, columnNames);
                DatosAlbum.setModel(tableModel);
                
            }
        }
    }//GEN-LAST:event_TablaAlbumMouseClicked

    private void DatosAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatosAlbumMouseClicked
        // TODO add your handling code here:
        
        if (evt.getClickCount() == 2) { // Detectar clic simple
            int row = DatosAlbum.rowAtPoint(evt.getPoint());
            if (row >= 0) {
                
                
                int id = (int) DatosAlbum.getValueAt(row, 0); // Cambia 1 al índice de la columna deseada
                jFrame2.setVisible(true);
                
                Object[][] datos = CController.obtenerDatosCancion(id);
                String[] columnNames = {"ID ", "NOMBRE", "DURACION", "ARCHIVO DE AUDIO", "IMAGEN"};
                NonEditableTableModel tableModel = new NonEditableTableModel(datos, columnNames);
                DatosCancion.setModel(tableModel);
                DatosAlbum.getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer());
            }
        }
    }//GEN-LAST:event_DatosAlbumMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArtistaL;
    private javax.swing.JComboBox<String> ComboBoxArtista;
    private javax.swing.JComboBox<String> ComboBoxFiltro;
    private javax.swing.JComboBox<String> ComboBoxGenero;
    private javax.swing.JTable DatosAlbum;
    private javax.swing.JTable DatosCancion;
    private javax.swing.JLabel GeneroL;
    private javax.swing.JTable TablaAlbum;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
