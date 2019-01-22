package nomina2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * * @author Bryan Reyes
 */
public class Consulta_empleados extends javax.swing.JFrame {

    public Consulta_empleados() {
        initComponents();
        this.setResizable(false); // modifcar tamaño del form
        this.setLocationRelativeTo(null); // Aparecer en el centro
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rb_idEmp = new javax.swing.JRadioButton();
        rb_nomEmp = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTAR EMPLEADOS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Digite el indicio a buscar: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Direccion", "Telefono", "Sexo", "Id_Depto", "Fecha_Ingreso", "Id_Puesto", "Salario"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        buttonGroup1.add(rb_idEmp);
        rb_idEmp.setText("ID");
        rb_idEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_idEmpMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_nomEmp);
        rb_nomEmp.setText("Nombre");
        rb_nomEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_nomEmpMouseClicked(evt);
            }
        });
        rb_nomEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_nomEmpActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\back.png")); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rb_idEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 267, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_nomEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(25, 25, 25)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rb_idEmp)
                                    .addComponent(rb_nomEmp)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_nomEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_nomEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_nomEmpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int filas = modelo.getRowCount();
        for (int i = 1; i <= filas; i++) {
            modelo.removeRow(0);
        }

        if (rb_idEmp.isSelected()) {
            String b = jTextField1.getText();
            //System.out.println(a);
            if (Integer.parseInt(b) < 0) {
                JOptionPane.showMessageDialog(null, "Digite el numero nuevamente!", "Error", JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
                return;
            } else {

                Empleado a = new Empleado();
                File archivo;
                FileReader fr;
                BufferedReader br;
                try {
                    archivo = new File("..\\Nomina2018\\Archivos\\Empleado.txt");
                    if (archivo.exists() == true) {
                        fr = new FileReader(archivo);
                        br = new BufferedReader(fr);
                        String linea;
                        String str = "";
                        while ((linea = br.readLine()) != null) {
                            StringTokenizer st = new StringTokenizer(linea, "|");
                            a.IdEmpleado = st.nextToken().trim();
                            a.nom_emp = st.nextToken().trim();
                            a.ape_Paemp = st.nextToken().trim();
                            a.ape_Maemp = st.nextToken().trim();
                            a.direccion_emp = st.nextToken().trim();
                            a.telef_emp = st.nextToken().trim();
                            a.sexo_emp = st.nextToken().trim();
                            a.id_departamento = st.nextToken().trim();
                            a.fecha_ingreso = st.nextToken().trim();
                            a.id_puesto = st.nextToken().trim();
                            a.coop_emp = st.nextToken().trim();
                            a.salario_emp = st.nextToken().trim();

                            if (jTextField1.getText().equals(a.IdEmpleado)) {
                                modelo.addRow(new Object[]{a.IdEmpleado, a.nom_emp, a.ape_Paemp, a.direccion_emp, a.telef_emp,  a.sexo_emp,  a.id_departamento,  a.fecha_ingreso,  a.id_puesto,  a.salario_emp  });
                            }
                        }

                        br.close();
                    }
                } catch (Exception el) {
                    el.printStackTrace();
                }

            }

        }

        if (rb_nomEmp.isSelected()) {

            Empleado a = new Empleado();
            File archivo;
            FileReader fr;
            BufferedReader br;
            try {
                archivo = new File("..\\Nomina2018\\Archivos\\Empleado.txt");
                if (archivo.exists() == true) {
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    String linea;
                    String str = "";
                    while ((linea = br.readLine()) != null) {
                        StringTokenizer st = new StringTokenizer(linea, "|");
                        a.IdEmpleado = st.nextToken().trim();
                            a.nom_emp = st.nextToken().trim();
                            a.ape_Paemp = st.nextToken().trim();
                            a.ape_Maemp = st.nextToken().trim();
                            a.direccion_emp = st.nextToken().trim();
                            a.telef_emp = st.nextToken().trim();
                            a.sexo_emp = st.nextToken().trim();
                            a.id_departamento = st.nextToken().trim();
                            a.fecha_ingreso = st.nextToken().trim();
                            a.id_puesto = st.nextToken().trim();
                            a.coop_emp = st.nextToken().trim();
                            a.salario_emp = st.nextToken().trim();

                        if (jTextField1.getText().equals(a.nom_emp)) {
                            modelo.addRow(new Object[]{a.IdEmpleado, a.nom_emp, a.ape_Paemp,  a.direccion_emp, a.telef_emp,  a.sexo_emp,  a.id_departamento,  a.fecha_ingreso,  a.id_puesto,  a.salario_emp  });
                        }
                    }

                    br.close();
                }
            } catch (Exception el) {
                el.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rb_idEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_idEmpMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int filas = modelo.getRowCount();
        for (int i = 1; i <= filas; i++) {
            modelo.removeRow(0);
        }
    }//GEN-LAST:event_rb_idEmpMouseClicked

    private void rb_nomEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_nomEmpMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int filas = modelo.getRowCount();
        for (int i = 1; i <= filas; i++) {
            modelo.removeRow(0);
        }
    }//GEN-LAST:event_rb_nomEmpMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rb_idEmp;
    private javax.swing.JRadioButton rb_nomEmp;
    // End of variables declaration//GEN-END:variables
}
