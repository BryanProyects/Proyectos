package nomina2018;

import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * * @author Bryan Reyes
 */
public class Cooperativa extends javax.swing.JFrame {

    public double porcen;
    public double txt;
    public double banacu;
    
    String porcentaje;
    String balance_acu;

    public void escribir(FileWriter fDepartamento) throws IOException {

        fDepartamento.write("|" + txt_Idempleado.getText() + "|" + txt_Porcentaje_Desc.getText() + "|" + banacu + "\r\n");
    }

    public Cooperativa() {
        initComponents();
        this.setResizable(false); // modifcar tamaño del form
        this.setLocationRelativeTo(null); // Aparecer en el centro

        Empleado obj = new Empleado();

        File archivo;
        FileReader fr;
        BufferedReader br;
        int aux = 0;
        try {
            archivo = new File("..\\Nomina2018\\Archivos\\Empleado.txt");
            if (archivo.exists() == true) {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                String str = "";

                while ((linea = br.readLine()) != null && aux == 0) {
                    StringTokenizer st = new StringTokenizer(linea, "|");
                    obj.IdEmpleado = st.nextToken().trim();
                    obj.nom_emp = st.nextToken().trim();
                    obj.ape_Paemp = st.nextToken().trim();
                    obj.ape_Maemp = st.nextToken().trim();
                    obj.direccion_emp = st.nextToken().trim();
                    obj.telef_emp = st.nextToken().trim();
                    obj.sexo_emp = st.nextToken().trim();
                    obj.id_departamento = st.nextToken().trim();
                    obj.fecha_ingreso = st.nextToken().trim();
                    obj.id_puesto = st.nextToken().trim();
                    obj.coop_emp = st.nextToken().trim();
                    obj.salario_emp = st.nextToken().trim();

                }
                double salado = Float.parseFloat(obj.salario_emp);
                porcen = (salado * 0.05);

                System.out.println(salado + porcen + txt);      //IMPRESION ACTUAL

                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Id1 = new javax.swing.JLabel();
        lbl_Id = new javax.swing.JLabel();
        txt_Idempleado = new javax.swing.JTextField();
        txt_Porcentaje_Desc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbl_Id2 = new javax.swing.JLabel();
        txt_Balance_Acum = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cooperativa");

        lbl_Id1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_Id1.setText("Porcentaje_Desc");

        lbl_Id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_Id.setText("Id_Empleado");

        txt_Idempleado.setEnabled(false);

        txt_Porcentaje_Desc.setToolTipText("");
        txt_Porcentaje_Desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Porcentaje_DescKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Porcentaje_DescKeyTyped(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_Id2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_Id2.setText("Balance_Acum");

        txt_Balance_Acum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Balance_AcumKeyTyped(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Id)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_Idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_Id1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Porcentaje_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Id2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Balance_Acum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Id)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Id1)
                    .addComponent(txt_Porcentaje_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Id2)
                    .addComponent(txt_Balance_Acum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt = Double.parseDouble(txt_Porcentaje_Desc.getText());

        if (txt > porcen) {
            JOptionPane.showMessageDialog(null, "El porcentaje debe ser menor al 5%");
        } else {
          /*  banacu = banacu + Double.parseDouble(txt_Porcentaje_Desc.getText());
            txt_Balance_Acum.setText(Double.toString(banacu));*/
            if (txt_Porcentaje_Desc.getText().length() == 0 || txt_Porcentaje_Desc.getText().length() == 0 || txt_Balance_Acum.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "No puede dejar campos  vacios", "ERROR", getDefaultCloseOperation());
            } else {
                try {
                    FileWriter fcooperativa = new FileWriter("..\\Nomina2018\\Archivos\\Cooperativa.txt", true);
                    escribir(fcooperativa);
                    fcooperativa.flush();
                    JOptionPane.showMessageDialog(null, "Se han guardado los datos.");
                    txt_Idempleado.setText("");
                    txt_Porcentaje_Desc.setText("");
                    txt_Balance_Acum.setText("");

                } catch (Throwable e) {
                    System.out.println("Error" + e);
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_Porcentaje_DescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Porcentaje_DescKeyReleased
        Empleado obj = new Empleado();

        File archivo;
        FileReader fr;
        BufferedReader br;
        int aux = 0;
        try {
            archivo = new File("..\\Nomina2018\\Archivos\\Cooperativa.txt");
            if (archivo.exists() == true) {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                String str = "";

                while ((linea = br.readLine()) != null && aux == 0) {
                    StringTokenizer st = new StringTokenizer(linea, "|");
                   obj.IdEmpleado = st.nextToken().trim();
                    porcentaje = st.nextToken().trim();
                    balance_acu = st.nextToken().trim();

                    try {

                     banacu = Double.parseDouble(txt_Porcentaje_Desc.getText()) + Double.parseDouble( balance_acu) ;
                    txt_Balance_Acum.setText(String.valueOf(banacu));
                        }

                     catch (Exception e) {

                    }

                }
                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }
    }//GEN-LAST:event_txt_Porcentaje_DescKeyReleased

    private void txt_Porcentaje_DescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Porcentaje_DescKeyTyped
    char a = evt.getKeyChar (); if (!Character.isDigit (a)) {evt.consume (); }
    }//GEN-LAST:event_txt_Porcentaje_DescKeyTyped

    private void txt_Balance_AcumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Balance_AcumKeyTyped
    char a = evt.getKeyChar (); if (!Character.isDigit (a)) {evt.consume (); }
    }//GEN-LAST:event_txt_Balance_AcumKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cooperativa().setVisible(true);

            }
        });
    }
    private static javax.swing.JTextField txt_Idempleado2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Id1;
    private javax.swing.JLabel lbl_Id2;
    public static javax.swing.JTextField txt_Balance_Acum;
    public static javax.swing.JTextField txt_Idempleado;
    public static javax.swing.JTextField txt_Porcentaje_Desc;
    // End of variables declaration//GEN-END:variables
}
