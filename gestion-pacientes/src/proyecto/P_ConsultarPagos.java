
package proyecto;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static proyecto.Crud.pacientes;


public class P_ConsultarPagos extends javax.swing.JPanel {

   DefaultTableModel x;
    public P_ConsultarPagos() {
        initComponents();
        x=(DefaultTableModel)tabla.getModel();
    }

      void limpiartabla(){

int a =x.getRowCount()-1;
for(int i=a; i>=0; i--){
x.removeRow(i );
}
}
  
     
public void llenarPrecioAlto(){
    limpiartabla();
    double pago=0;
        if(!pacientes.isEmpty()){
    for(int i=0;i<pacientes.size();i++){
       if(pacientes.get(i).getPagoTotal()>pago) {
           pago=pacientes.get(i).getPagoTotal();
       }
    }
    Object[]fila=new Object[11];
     for(int i=0;i<pacientes.size();i++){
       if(pacientes.get(i).getPagoTotal()==pago) {
         fila[0]=pacientes.get(i).getCedula();
         fila[1]=pacientes.get(i).getNombres();
         fila[2]=pacientes.get(i).getApellido();
         fila[3]=pacientes.get(i).getEdad();
         fila[4]=pacientes.get(i).getDireccion();
         fila[5]=pacientes.get(i).getCorreo();
         fila[6]=pacientes.get(i).getTelefono();
         fila[7]=pacientes.get(i).getDiagnostico();
         fila[8]=pacientes.get(i).getMedicacion();
         fila[9]=pacientes.get(i).getPagoTotal();
         fila[10]=pacientes.get(i).getDoctor();
         x.addRow(fila);
       }
    }
    }else JOptionPane.showMessageDialog(null, "NO HAY PACIENTES EN BASE DE DATOS");
}
public void llenarPrecioBajo(){
    limpiartabla();
    double pago=0;
        if(!pacientes.isEmpty()){
    pago=pacientes.get(0).getPagoTotal();
    for(int i=0;i<pacientes.size();i++){
        
       if(pacientes.get(i).getPagoTotal()<pago) {
           pago=pacientes.get(i).getPagoTotal();
       }
    }
    Object[]fila=new Object[11];
     for(int i=0;i<pacientes.size();i++){
       if(pacientes.get(i).getPagoTotal()==pago) {
         fila[0]=pacientes.get(i).getCedula();
         fila[1]=pacientes.get(i).getNombres();
         fila[2]=pacientes.get(i).getApellido();
         fila[3]=pacientes.get(i).getEdad();
         fila[4]=pacientes.get(i).getDireccion();
         fila[5]=pacientes.get(i).getCorreo();
         fila[6]=pacientes.get(i).getTelefono();
         fila[7]=pacientes.get(i).getDiagnostico();
         fila[8]=pacientes.get(i).getMedicacion();
         fila[9]=pacientes.get(i).getPagoTotal();
         fila[10]=pacientes.get(i).getDoctor();
         x.addRow(fila);
       }
    }
    }else JOptionPane.showMessageDialog(null, "NO HAY PACIENTES EN BASE DE DATOS");
}
public void llenarEdadAlto(){
    limpiartabla();
    int pago=0;
    if(!pacientes.isEmpty()){
    for(int i=0;i<pacientes.size();i++){
       if(pacientes.get(i).getEdad()>pago) {
           pago=pacientes.get(i).getEdad();
       }
    }
    Object[]fila=new Object[11];
     for(int i=0;i<pacientes.size();i++){
       if(pacientes.get(i).getEdad()==pago) {
         fila[0]=pacientes.get(i).getCedula();
         fila[1]=pacientes.get(i).getNombres();
         fila[2]=pacientes.get(i).getApellido();
         fila[3]=pacientes.get(i).getEdad();
         fila[4]=pacientes.get(i).getDireccion();
         fila[5]=pacientes.get(i).getCorreo();
         fila[6]=pacientes.get(i).getTelefono();
         fila[7]=pacientes.get(i).getDiagnostico();
         fila[8]=pacientes.get(i).getMedicacion();
         fila[9]=pacientes.get(i).getPagoTotal();
         fila[10]=pacientes.get(i).getDoctor();
         x.addRow(fila);
       }
    }
    }else JOptionPane.showMessageDialog(null, "NO HAY PACIENTES EN BASE DE DATOS");
}
public void llenarEdadBajo(){
 limpiartabla();
    int pago=0;
    if(!pacientes.isEmpty()){
    pago=pacientes.get(0).getEdad();
    for(int i=0;i<pacientes.size();i++){
       if(pacientes.get(i).getEdad()<pago) {
           pago=pacientes.get(i).getEdad();
       }
    }
    Object[]fila=new Object[11];
     for(int i=0;i<pacientes.size();i++){
       if(pacientes.get(i).getEdad()==pago) {
         fila[0]=pacientes.get(i).getCedula();
         fila[1]=pacientes.get(i).getNombres();
         fila[2]=pacientes.get(i).getApellido();
         fila[3]=pacientes.get(i).getEdad();
         fila[4]=pacientes.get(i).getDireccion();
         fila[5]=pacientes.get(i).getCorreo();
         fila[6]=pacientes.get(i).getTelefono();
         fila[7]=pacientes.get(i).getDiagnostico();
         fila[8]=pacientes.get(i).getMedicacion();
         fila[9]=pacientes.get(i).getPagoTotal();
         fila[10]=pacientes.get(i).getDoctor();
         x.addRow(fila);
       }
    }
   }else JOptionPane.showMessageDialog(null, "NO HAY PACIENTES EN BASE DE DATOS");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingreso = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        ingreso.setBackground(new java.awt.Color(255, 255, 255));
        ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("BAJA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ingreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 180, 46));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("CONSULTAS ESPECIFICAS");
        ingreso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 400, 50));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("POR PAGOS:");
        ingreso.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("ALTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ingreso.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 180, 46));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("BAJA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ingreso.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 180, 46));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("ALTA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ingreso.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 180, 46));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("POR EDAD :");
        ingreso.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRES", "APELLIDOS", "EDAD", "DIRECCION", "CORREO", "TELEFONO", "DIAGNOSTICO", "MEDICACIONES", "PAGO", "DOCTOR"
            }
        ));
        jScrollPane3.setViewportView(tabla);

        ingreso.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 490, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    llenarPrecioAlto();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarPrecioBajo();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    llenarEdadAlto();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
llenarEdadBajo();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
