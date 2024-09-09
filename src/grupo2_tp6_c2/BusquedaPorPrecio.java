
package grupo2_tp6_c2;

import javax.swing.table.DefaultTableModel;

public class BusquedaPorPrecio extends javax.swing.JInternalFrame {

    
    public BusquedaPorPrecio() {
        initComponents();
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlListado = new javax.swing.JLabel();
        jlEntre = new javax.swing.JLabel();
        jbBusqueda = new javax.swing.JButton();
        jtfDesde = new javax.swing.JTextField();
        jlY = new javax.swing.JLabel();
        jtfHasta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProducto = new javax.swing.JTable();

        jlListado.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jlListado.setText("Listado por Precio");

        jlEntre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jlEntre.setText("Entre");

        jbBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo2_tp6_c2/search_locate_find_icon-icons.com_67287.png"))); // NOI18N
        jbBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBusquedaActionPerformed(evt);
            }
        });

        jlY.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jlY.setText("y");

        tProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tProducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlEntre)
                        .addGap(18, 18, 18)
                        .addComponent(jtfDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlY)
                        .addGap(18, 18, 18)
                        .addComponent(jtfHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlListado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBusqueda)
                        .addGap(33, 33, 33))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlListado)
                    .addComponent(jbBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEntre)
                    .addComponent(jtfDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlY)
                    .addComponent(jtfHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    
    private void armarCabecera(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Stock");
        tProducto.setModel(modelo);
    }
        
    
    private void jbBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBusquedaActionPerformed
        Iterable<Producto> productos = null;
       for (Producto producto : productos){
           if(Long.parseLong(jtfDesde.getText()) < producto.getPrecio()&& producto.getPrecio()> Long.parseLong(jtfHasta.getText())){
               modelo.addRow(new Object[]{
                   producto.getCodigo(),
                   producto.getDescricpion(),
                   producto.getPrecio(),
                   producto.getCategoria(),
                   producto.getStock()
               });
                       
               
           }
        }      
    }//GEN-LAST:event_jbBusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBusqueda;
    private javax.swing.JLabel jlEntre;
    private javax.swing.JLabel jlListado;
    private javax.swing.JLabel jlY;
    private javax.swing.JTextField jtfDesde;
    private javax.swing.JTextField jtfHasta;
    private javax.swing.JTable tProducto;
    // End of variables declaration//GEN-END:variables
}
