
package proyecto;

import javax.swing.JOptionPane;
import static proyecto.Crud.pacientes;

public class P_eliminar extends javax.swing.JPanel {

 
    public P_eliminar() {
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
        jj = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        j = new javax.swing.JTextArea();
        ii = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        i = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        ingreso.setBackground(new java.awt.Color(255, 255, 255));
        ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("CEDULA :");
        ingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDOS:");
        ingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("EDAD:");
        ingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ingreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 350, 46));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("ELIMINAR PACIENTE");
        ingreso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 303, 50));

        jj.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jj.setText("MEDICACIONES");
        ingreso.add(jj, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 129, -1));

        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });
        ingreso.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 88, 110, 28));

        j.setEditable(false);
        j.setColumns(20);
        j.setRows(5);
        j.setEnabled(false);
        jScrollPane1.setViewportView(j);

        ingreso.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 160, -1));

        ii.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ii.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ii.setText("DIAGNOSTICO");
        ingreso.add(ii, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 129, -1));

        i.setEditable(false);
        i.setColumns(20);
        i.setRows(5);
        i.setEnabled(false);
        jScrollPane2.setViewportView(i);

        ingreso.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 160, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("NOMBRES:");
        ingreso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, -1, -1));

        b.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        b.setText("******************");
        ingreso.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, 30));

        c.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        c.setText("******************");
        ingreso.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 30));

        d.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        d.setText("******************");
        ingreso.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, 30));

        jButton2.setText("B");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ingreso.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

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
    if(a.getText()!=null){    
    for(int iterador=0;iterador<pacientes.size();iterador++){
           if(pacientes.get(iterador).getCedula().equalsIgnoreCase(a.getText())){
             pacientes.remove(iterador);
             JOptionPane.showMessageDialog(null,"ELIMINADO CON EXITO!");
       }else JOptionPane.showMessageDialog(null,"EL PACIENTE NO EXISTE!");}      
}else JOptionPane.showMessageDialog(null,"LLENE LA CEDULA DEL PACIENTE");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(a.getText().length()==10){    
    for(int iterador=0;iterador<pacientes.size();iterador++){
           if(pacientes.get(iterador).getCedula().equalsIgnoreCase(a.getText())){
              b.setText(pacientes.get(iterador).getNombres());c.setText(pacientes.get(iterador).getApellido());d.setText(String.valueOf(pacientes.get(iterador).getEdad()));
              ii.setText(pacientes.get(iterador).getDiagnostico());
              jj.setText(pacientes.get(iterador).getMedicacion());
       }}      
}else JOptionPane.showMessageDialog(null,"LLENE LA CEDULA DEL PACIENTE");            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped
char a=evt.getKeyChar();
    if(!Character.isDigit(a)){ //valida que solo sean numeros
        evt.consume();
        JOptionPane.showMessageDialog(this, "SOLO NUMEROS");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_aKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JTextArea i;
    private javax.swing.JLabel ii;
    private javax.swing.JPanel ingreso;
    private javax.swing.JTextArea j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jj;
    // End of variables declaration//GEN-END:variables
}
