
package proyecto;

import java.util.Collections;
import javax.swing.table.DefaultTableModel;
import static proyecto.Crud.pacientes;


public class P_mostrar extends javax.swing.JPanel {
     
    DefaultTableModel x;
    public P_mostrar() {
        initComponents();
        x=(DefaultTableModel)tabla.getModel();
    }
    void limpiartabla(){

int a =x.getRowCount()-1;
for(int i=a; i>=0; i--){
x.removeRow(i );
}
}
  
public void llenar(){
    limpiartabla();
    Object[]fila=new Object[13];
    for(int i=0;i<pacientes.size();i++){
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
         fila[11]=pacientes.get(i).getTipoConsulta();
         fila[12]=pacientes.get(i).getFecha();
         x.addRow(fila);
    }
   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingreso = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        ingreso.setBackground(new java.awt.Color(255, 255, 255));
        ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("MOSTRAR DATOS DE PACIENTES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ingreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 470, 46));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRES", "APELLIDOS", "EDAD", "DIRECCION", "CORREO", "TELEFONO", "DIAGNOSTICO", "MEDICACIONES", "PAGO", "DOCTOR", "TIPO CONSULTA", "FECHA"
            }
        ));
        jScrollPane3.setViewportView(tabla);

        ingreso.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 490, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
llenar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
