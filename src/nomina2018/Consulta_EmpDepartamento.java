package nomina2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Bryan Reyes
 */
public class Consulta_EmpDepartamento extends javax.swing.JFrame {

    public String ide;
    public String idem;

    public Consulta_EmpDepartamento() {
        initComponents();
         this.setResizable(false); // modifcar tamaño del form
        this.setLocationRelativeTo(null); // Aparecer en el centro
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTAR EMPLEADOS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Digite el departamento a buscar: ");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Direccion", "Telefono", "Sexo", "Id_Depto", "Fecha_Ingreso", "Id_Puesto", "Salario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Departamento");
        jRadioButton1.setEnabled(false);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\back.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(266, 266, 266))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int filas = modelo.getRowCount();
        for (int i = 1; i <= filas; i++) {
            modelo.removeRow(0);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    public void consuDep() {
        Departamento a = new Departamento();

        File archivo;
        FileReader fr;
        BufferedReader br;
        try {
            archivo = new File("..\\Nomina2018\\Archivos\\Departamento.txt");
            if (archivo.exists() == true) {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                String str = "";
                while ((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, "|");
                    a.idDepartamento = st.nextToken().trim();
                    a.dDepartamento = st.nextToken().trim();

                    if (jTextField1.getText().equals(a.dDepartamento)) {
                        ide = a.idDepartamento;
                        break;
                    }

                }

                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }

    }

    public void consuEmpl() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int filas = modelo.getRowCount();
        for (int i = 1; i <= filas; i++) {
            modelo.removeRow(0);
        }

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
                    idem = a.id_departamento;
                    a.fecha_ingreso = st.nextToken().trim();
                    a.id_puesto = st.nextToken().trim();
                    a.coop_emp = st.nextToken().trim();
                    a.salario_emp = st.nextToken().trim();

                    /* if (jTextField1.getText().equals(a.IdEmpleado)) {
                                modelo.addRow(new Object[]{a.IdEmpleado, a.nom_emp, a.ape_Paemp, a.direccion_emp, a.telef_emp,  a.sexo_emp,  a.id_departamento,  a.fecha_ingreso,  a.id_puesto,  a.salario_emp  });
                            }*/
                    if (idem.equals(ide)) {
                        modelo.addRow(new Object[]{a.IdEmpleado, a.nom_emp, a.ape_Paemp, a.direccion_emp, a.telef_emp, a.sexo_emp, a.id_departamento, a.fecha_ingreso, a.id_puesto, a.salario_emp});
                    }
                }

                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        consuDep();
        consuEmpl();

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_EmpDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
