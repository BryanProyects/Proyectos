package nomina2018;

/**
 * * @author Bryan Reyes
 */
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
import javax.swing.JOptionPane;

public class Departamento extends javax.swing.JFrame {

    public void escribir(FileWriter fDepartamento) throws IOException {
        fDepartamento.write("|" + txt_IdDepto.getText() + "|" + txt_DescrDepto.getText() + "\r\n");
    }

    public Departamento() {
        initComponents();
        this.setResizable(false); // modifcar tamaño del form
        this.setLocationRelativeTo(null); // Aparecer en el centro
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Id = new javax.swing.JLabel();
        txt_IdDepto = new javax.swing.JTextField();
        lbl_Id1 = new javax.swing.JLabel();
        txt_DescrDepto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Departamento");

        lbl_Id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_Id.setText("Id_Depto");

        txt_IdDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdDeptoActionPerformed(evt);
            }
        });
        txt_IdDepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_IdDeptoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IdDeptoKeyTyped(evt);
            }
        });

        lbl_Id1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_Id1.setText("Descripción");

        txt_DescrDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DescrDeptoActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Id1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Id)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_IdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DescrDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Id1)
                    .addComponent(txt_DescrDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txt_DescrDepto.getText().length() == 0 || txt_IdDepto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "No puede dejar campos  vacios", "ERROR", getDefaultCloseOperation());
        } else {
            try {
                FileWriter fdepartament = new FileWriter("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Archivos\\Departamento.txt", true);
                escribir(fdepartament);
                fdepartament.flush();
                JOptionPane.showMessageDialog(null, "Se han guardado los datos.");
                txt_DescrDepto.setText("");
                txt_IdDepto.setText("");

            } catch (Throwable e) {
                System.out.println("Error" + e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_IdDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdDeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdDeptoActionPerformed

    private void txt_IdDeptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdDeptoKeyTyped


    }//GEN-LAST:event_txt_IdDeptoKeyTyped

    private void txt_DescrDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DescrDeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DescrDeptoActionPerformed

    private void txt_IdDeptoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdDeptoKeyReleased
        File archivo;
        FileReader fr;
        BufferedReader br;
        int aux = 0;
        try {
            archivo = new File("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Archivos\\Departamento.txt");
            if (archivo.exists() == true) {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                String str = "";

                while ((linea = br.readLine()) != null && aux == 0) {
                    StringTokenizer st = new StringTokenizer(linea, "|");
                    String Idepartament = st.nextToken().trim();
                    String descri = st.nextToken().trim();

                    try {

                        if (txt_IdDepto.getText().equals(Idepartament)) {

                            txt_DescrDepto.setText(descri);
                            JOptionPane.showMessageDialog(null, "MODIFICANDO.");

                        } else {
                            JOptionPane.showMessageDialog(null, "CREANDO.");
                            txt_DescrDepto.setText("");
                        }

                    } catch (Exception e) {

                    }

                }
                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }

    }//GEN-LAST:event_txt_IdDeptoKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Departamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Id1;
    private javax.swing.JTextField txt_DescrDepto;
    private javax.swing.JTextField txt_IdDepto;
    // End of variables declaration//GEN-END:variables

}
