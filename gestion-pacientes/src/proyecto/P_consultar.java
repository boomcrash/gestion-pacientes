
package proyecto;

import javax.swing.JOptionPane;
import static proyecto.Crud.pacientes;

public class P_consultar extends javax.swing.JPanel {

 
    public P_consultar() {
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

        ingreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        j = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        i = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("DIRECCION:");
        ingreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 277, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("CORREO:");
        ingreso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 323, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("CONSULTAR PACIENTE");
        ingreso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 303, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MEDICACIONES");
        ingreso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 129, -1));

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
        ingreso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, -1, -1));

        k.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        k.setText("******************");
        ingreso.add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 130, 30));

        b.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        b.setText("******************");
        ingreso.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, 30));

        c.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        c.setText("******************");
        ingreso.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 30));

        d.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        d.setText("******************");
        ingreso.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, 30));

        e.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        e.setText("******************");
        ingreso.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 30));

        f.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        f.setText("******************");
        ingreso.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, 30));

        jButton2.setText("B");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ingreso.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("TELEFONO:");
        ingreso.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 369, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("PAGO:");
        ingreso.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        g.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        g.setText("******************");
        ingreso.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 130, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("DOCTOR:");
        ingreso.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        h.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        h.setText("******************");
        ingreso.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 130, 30));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("TIPO CONSULTA:");
        ingreso.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        t.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t.setText("******************");
        ingreso.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 130, 30));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("FECHA COSNULTA:");
        ingreso.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        fecha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fecha.setText("******************");
        ingreso.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 130, 30));

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
if(a.getText().length()==10){    
    for(int iterador=0;iterador<pacientes.size();iterador++){
           if(pacientes.get(iterador).getCedula().equalsIgnoreCase(a.getText())){
              b.setText(pacientes.get(iterador).getNombres());c.setText(pacientes.get(iterador).getApellido());d.setText(String.valueOf(pacientes.get(iterador).getEdad()));e.setText(pacientes.get(iterador).getDireccion());f.setText(pacientes.get(iterador).getCorreo());
              g.setText(String.valueOf(pacientes.get(iterador).getTelefono()));
              h.setText(pacientes.get(iterador).getDoctor());
              i.setText(pacientes.get(iterador).getDiagnostico());
              j.setText(pacientes.get(iterador).getMedicacion());
              t.setText(pacientes.get(iterador).getTipoConsulta());
              fecha.setText(pacientes.get(iterador).getFecha());
              if(pacientes.get(iterador).getPagoTotal()!=0){
                  k.setText(String.valueOf(pacientes.get(iterador).getPagoTotal()));
              }else k.setText("Sin Pagar");
           }
       }      
}else JOptionPane.showMessageDialog(null,"LLENE LA CEDULA DEL PACIENTE");// TODO add your handling code here:
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
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel g;
    private javax.swing.JLabel h;
    private javax.swing.JTextArea i;
    private javax.swing.JPanel ingreso;
    private javax.swing.JTextArea j;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel k;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
