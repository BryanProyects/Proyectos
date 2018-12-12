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


/*** @author Bryan Reyes*/
public class Cooperativa extends javax.swing.JFrame {
    
    public void escribir (FileWriter fDepartamento) throws IOException {
			fDepartamento.write( "|" + txt_Idempleado.getText() + "|" + txt_Porcentaje_Desc.getText() + "|" + txt_Balance_Acum.getText() +"\r\n");
		}
    public Cooperativa() {
        initComponents();
        this.setResizable(false); // modifcar tamaño del form
        this.setLocationRelativeTo(null); // Aparecer en el centro
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

        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_Id2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_Id2.setText("Balance_Acum");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Id2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Balance_Acum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Id)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_Idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_Id1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Porcentaje_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        if (txt_Porcentaje_Desc.getText().length()==0 || txt_Porcentaje_Desc.getText().length()==0|| txt_Balance_Acum.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "No puede dejar campos  vacios","ERROR", getDefaultCloseOperation());
        }

        else {
            try {
                FileWriter fcooperativa= new FileWriter ("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Archivos\\Cooperativa.txt", true);
                escribir(fcooperativa);
                fcooperativa.flush();
                JOptionPane.showMessageDialog(null, "Se han guardado los datos.");
                txt_Idempleado.setText("");
                txt_Porcentaje_Desc.setText("");
                txt_Balance_Acum.setText("");
                

            }catch(Throwable e) {
                System.out.println("Error" + e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) 
    {
       
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new Cooperativa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Id1;
    private javax.swing.JLabel lbl_Id2;
    private javax.swing.JTextField txt_Balance_Acum;
    private javax.swing.JTextField txt_Idempleado;
    private javax.swing.JTextField txt_Porcentaje_Desc;
    // End of variables declaration//GEN-END:variables
}
