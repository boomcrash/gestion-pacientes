
package proyecto;

import javax.swing.JOptionPane;
import static proyecto.Crud.pacientes;

public class P_pagar extends javax.swing.JPanel {

   
    public P_pagar() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        i = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        k = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        h = new javax.swing.JLabel();

        ingreso.setBackground(new java.awt.Color(255, 255, 255));
        ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("CEDULA :");
        ingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDOS:");
        ingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("EDAD:");
        ingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("REALIZAR PAGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ingreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 303, 46));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("FACTURACION");
        ingreso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 303, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MEDICACIONES");
        ingreso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 129, -1));

        j.setEditable(false);
        j.setColumns(20);
        j.setRows(5);
        j.setEnabled(false);
        jScrollPane1.setViewportView(j);

        ingreso.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 160, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DIAGNOSTICO");
        ingreso.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 129, -1));

        i.setEditable(false);
        i.setColumns(20);
        i.setRows(5);
        i.setEnabled(false);
        jScrollPane2.setViewportView(i);

        ingreso.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 160, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("NOMBRES:");
        ingreso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        b.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        b.setText("******************");
        ingreso.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        c.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        c.setText("******************");
        ingreso.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 130, 30));

        d.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        d.setText("******************");
        ingreso.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 130, 30));

        jButton2.setText("B");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ingreso.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        k.setBackground(new java.awt.Color(0, 0, 0));
        k.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        k.setForeground(new java.awt.Color(255, 255, 255));
        k.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEDICINA GENERAL", "ESPECIALIZACION" }));
        ingreso.add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("TIPO DE CONSULTA :");
        ingreso.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });
        ingreso.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 88, 110, 28));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("DOCTOR:");
        ingreso.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        h.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        h.setText("******************");
        ingreso.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
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
for(int iterador=0;iterador<pacientes.size();iterador++){
           if(pacientes.get(iterador).getCedula().equalsIgnoreCase(a.getText())){
              b.setText(pacientes.get(iterador).getNombres());c.setText(pacientes.get(iterador).getApellido());d.setText(String.valueOf(pacientes.get(iterador).getEdad()));
              h.setText(pacientes.get(iterador).getDoctor());
              i.setText(pacientes.get(iterador).getDiagnostico());
              j.setText(pacientes.get(iterador).getMedicacion());
           }
       }                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(a.getText().length()==10){
        int med=50,espe=70;
        if(a.getText()!=null){   
        for(int iterador=0;iterador<pacientes.size();iterador++){
           if(pacientes.get(iterador).getCedula().equalsIgnoreCase(a.getText())){
               if(pacientes.get(iterador).getPagoTotal()==0){
              if(k.getSelectedItem().equals("MEDICINA GENERAL")){
                  pacientes.get(iterador).setTipoConsulta(String.valueOf(k.getSelectedItem()));
                  if(pacientes.get(iterador).getEdad()<18){
                  pacientes.get(iterador).setPagoTotal(med-(med*0.3));
                  }else if(pacientes.get(iterador).getEdad()>65){
                       pacientes.get(iterador).setPagoTotal(med-(med*0.5));
                  }else  pacientes.get(iterador).setPagoTotal(med);
                  
              }else if(k.getSelectedItem().equals("ESPECIALIZACION")){
                  pacientes.get(iterador).setTipoConsulta(String.valueOf(k.getSelectedItem()));
                    if(pacientes.get(iterador).getEdad()<18){
                  pacientes.get(iterador).setPagoTotal(espe-(espe*0.3));
                  }else if(pacientes.get(iterador).getEdad()>65){
                       pacientes.get(iterador).setPagoTotal(espe-(espe*0.5));
                  }else  pacientes.get(iterador).setPagoTotal(espe);
              }
               }else JOptionPane.showMessageDialog(null, "ESTE PACIENTE YA TIENE UN PAGO DE CONSULTA!\n SI DESEA ACTUALIZAR LO PUEDE HACER\n EN LA SECCION DE ACTUALIZACION");
           }
       }   
     }}else JOptionPane.showMessageDialog(null, "ASEGURESE QUE LA CEDULA SEAN 10 DIGITOS!");// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped
char a=evt.getKeyChar();
    if(!Character.isDigit(a)){ //valida que solo sean numeros
        evt.consume();
        JOptionPane.showMessageDialog(this, "SOLO NUMEROS");
    }           // TODO add your handling code here:
    }//GEN-LAST:event_aKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JLabel h;
    private javax.swing.JTextArea i;
    private javax.swing.JPanel ingreso;
    private javax.swing.JTextArea j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> k;
    // End of variables declaration//GEN-END:variables
}
