
package proyecto;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static proyecto.Crud.pacientes;


public class P_ingreso extends javax.swing.JPanel {

    Calendar x;
    public P_ingreso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingreso = new javax.swing.JPanel();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        j = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        i = new javax.swing.JTextArea();
        h = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        ingreso.setBackground(new java.awt.Color(255, 255, 255));
        ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bKeyTyped(evt);
            }
        });
        ingreso.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 134, 138, 28));

        c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cKeyTyped(evt);
            }
        });
        ingreso.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 180, 138, 28));

        d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dKeyTyped(evt);
            }
        });
        ingreso.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 226, 138, 28));

        e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eKeyTyped(evt);
            }
        });
        ingreso.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 272, 138, 28));

        f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fKeyTyped(evt);
            }
        });
        ingreso.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 318, 138, 28));

        g.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gKeyTyped(evt);
            }
        });
        ingreso.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 364, 138, 28));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("CEDULA :");
        ingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRES:");
        ingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDOS:");
        ingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("EDAD:");
        ingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("DIRECCION:");
        ingreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 277, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("TELEFONO:");
        ingreso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 369, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("CORREO:");
        ingreso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 323, -1, -1));

        jButton1.setText("INGRESAR PACIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ingreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 303, 46));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("INGRESO DE PACIENTE");
        ingreso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 11, 303, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MEDICACIONES");
        ingreso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 129, -1));

        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });
        ingreso.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 88, 138, 28));

        j.setColumns(20);
        j.setRows(5);
        j.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(j);

        ingreso.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 160, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DIAGNOSTICO");
        ingreso.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 129, -1));

        i.setColumns(20);
        i.setRows(5);
        i.setText("\n");
        i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(i);

        ingreso.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 160, -1));

        h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hMouseEntered(evt);
            }
        });
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        h.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hKeyTyped(evt);
            }
        });
        ingreso.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 140, 28));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("DOCTOR:");
        ingreso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

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

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(!a.getText().isEmpty()&&!b.getText().isEmpty()&&!c.getText().isEmpty()&&!d.getText().isEmpty()&&!e.getText().isEmpty()&&!f.getText().isEmpty()&&!g.getText().isEmpty()&&!h.getText().isEmpty()&&!i.getText().isEmpty()&&!j.getText().isEmpty()) {
            if(a.getText().length()==10&&d.getText().length()<=3&&(g.getText().length()==7||g.getText().length()==10)){
        int existe=0;
       for(int i=0;i<pacientes.size();i++){
           if(pacientes.get(i).getCedula().equalsIgnoreCase(a.getText())){
              existe=1; 
           }
       }
       if(existe!=1){
           x=GregorianCalendar.getInstance();
           String fecha=String.valueOf(x.get(Calendar.DATE))+"-"+String.valueOf(x.get(Calendar.MONTH))+"-"+String.valueOf(x.get(Calendar.YEAR));
           System.out.println("fecha");
         pacientes.add(new Paciente(a.getText(), b.getText(), c.getText(),Integer.parseInt(d.getText()) ,e.getText(),f.getText(),g.getText(),h.getText(),i.getText(),j.getText(),0,"S/C",fecha));
       }else JOptionPane.showConfirmDialog(null,"ESTE PACIENTE Y EXISTE , SI DESEA MODIFICAR \n VAYA A LA SECCION DE MODIFICAR FICHA");
        
    }else JOptionPane.showMessageDialog(null,"ASEGURESE DE HABER INGRESADO BIEN \n LOS CAMPOS NUMERICOS");}else JOptionPane.showMessageDialog(null,"LLENE TODOS LOS CAMPOS!");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped
char a=evt.getKeyChar();
    if(!Character.isDigit(a)){ //valida que solo sean numeros
        evt.consume();
        JOptionPane.showMessageDialog(this, "SOLO NUMEROS");
    }           // TODO add your handling code here:
    }//GEN-LAST:event_aKeyTyped

    private void dKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyTyped
char a=evt.getKeyChar();
    if(!Character.isDigit(a)){ //valida que solo sean numeros
        evt.consume();
        JOptionPane.showMessageDialog(this, "SOLO NUMEROS");
    }           // TODO add your handling code here:
    }//GEN-LAST:event_dKeyTyped

    private void gKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gKeyTyped
char a=evt.getKeyChar();
    if(!Character.isDigit(a)){ //valida que solo sean numeros
        evt.consume();
        JOptionPane.showMessageDialog(this, "SOLO NUMEROS");
    }           // TODO add your handling code here:
    }//GEN-LAST:event_gKeyTyped

    private void bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyTyped
 char a=evt.getKeyChar();
    if(Character.isDigit(a)){ //valida que solo sean numeros
        evt.consume();
        JOptionPane.showMessageDialog(this, "SOLO LETRAS");
    }       // TODO add your handling code here:
    }//GEN-LAST:event_bKeyTyped

    private void cKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cKeyTyped
 char a=evt.getKeyChar();
    if(Character.isDigit(a)){ //valida que solo sean numeros
        evt.consume();
        JOptionPane.showMessageDialog(this, "SOLO LETRAS");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_cKeyTyped

    private void eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eKeyTyped
   // TODO add your handling code here:
    }//GEN-LAST:event_eKeyTyped

    private void fKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fKeyTyped
     // TODO add your handling code here:
    }//GEN-LAST:event_fKeyTyped

    private void hMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_hMouseEntered

    private void hKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_hKeyReleased

    private void hKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hKeyTyped
 char a=evt.getKeyChar();
    if(Character.isDigit(a)){ //valida que solo sean numeros
        evt.consume();
        JOptionPane.showMessageDialog(this, "SOLO LETRAS");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_hKeyTyped

    private void iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iKeyTyped
  // TODO add your handling code here:
    }//GEN-LAST:event_iKeyTyped

    private void jKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jKeyTyped
       // TODO add your handling code here:
    }//GEN-LAST:event_jKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JTextField g;
    private javax.swing.JTextField h;
    private javax.swing.JTextArea i;
    private javax.swing.JPanel ingreso;
    private javax.swing.JTextArea j;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
