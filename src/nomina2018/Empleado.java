package nomina2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 * * @author Bryan Reyes
 */
public class Empleado extends javax.swing.JFrame {

    String IdEmpleado;
    String nom_emp;
    String ape_Paemp;
    String ape_Maemp;
    String direccion_emp;
    String telef_emp;
    String sexo_emp;
    String id_departamento;
    String fecha_ingreso;
    String id_puesto;
    String coop_emp;
    String salario_emp;

    String porcentaje;
    String balance_acu;

    public Empleado() {

        initComponents();
        this.setResizable(false); // modifcar tamaño del form
        this.setLocationRelativeTo(null); // Aparecer en el centro
    }

    java.util.Date Fecha = new Date();
    Date fecha = Fecha;

    @SuppressWarnings("unchecked")
    public void escribir(FileWriter fDepartamento) throws IOException {

        Format formato = new SimpleDateFormat("dd-MM-yyyy");
        formato.format(fecha);

        String sexo = "";
        String coop = "";
        if (jRadioButton1.isSelected()) {
            sexo = "F";
        } else if (jRadioButton2.isSelected()) {
            sexo = "M";
        }

        if (jRadioButton3.isSelected()) {
            coop = "True";
        } else if (jRadioButton4.isSelected()) {
            coop = "False";
        }

        fDepartamento.write("|" + txt_idEmpleado.getText() + "|" + txt_Nom_Emp.getText() + "|" + txt_Apellido_Pat_Emp.getText() + "|" + txt_Apellido_Mat_Emp.getText() + "|" + txt_direccion_emp.getText() + "|" + txt_telEmpleado.getText() + "|" + sexo + "|" + txt_IdDepartamento.getText() + "|" + formato.format(fecha) + "|" + txt_IdPuestos.getText() + "|" + coop + "|" + txt_SalarioEmp.getText() + "\r\n");

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_idEmpleado = new javax.swing.JTextField();
        txt_Nom_Emp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Apellido_Pat_Emp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_Apellido_Mat_Emp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_direccion_emp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_apellidoPa = new javax.swing.JTextField();
        txt_IdDepartamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txt_IdPuestos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_SalarioEmp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_telEmpleado = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");

        jLabel1.setText("Id_Empleado");

        jLabel2.setText("Nombre_Emp");

        txt_idEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idEmpleadoKeyTyped(evt);
            }
        });

        txt_Nom_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nom_EmpActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido_Pat_Emp");

        txt_Apellido_Pat_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Apellido_Pat_EmpActionPerformed(evt);
            }
        });

        jLabel12.setText("Apellido_Mat_Emp");

        jLabel4.setText("Dirección_Emp");

        txt_direccion_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_empActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono_Emp");

        txt_apellidoPa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoPaActionPerformed(evt);
            }
        });

        txt_IdDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdDepartamentoActionPerformed(evt);
            }
        });
        txt_IdDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_IdDepartamentoKeyReleased(evt);
            }
        });

        jLabel8.setText("Id_Depto_Emp");

        jLabel6.setText("Sexo_Emp");

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("F");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("M");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Id_Puesto_Emp");

        txt_IdPuestos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_IdPuestosKeyReleased(evt);
            }
        });

        jLabel11.setText("Coop");

        jLabel7.setText("Salario-Emp");

        jButton2.setText("Volver");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("True");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("False");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Nom_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Apellido_Pat_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_direccion_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Apellido_Mat_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellidoPa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_IdPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_SalarioEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_IdDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(22, 22, 22)
                                .addComponent(jRadioButton2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_Nom_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6)))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_IdDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_apellidoPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_IdPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_Apellido_Mat_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_Apellido_Pat_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txt_SalarioEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Departamento mod = new Departamento();
        Format formato = new SimpleDateFormat("dd-MM-yyyy");
        formato.format(fecha);

        String datos = "|" + txt_idEmpleado.getText() + "|" + txt_Nom_Emp.getText() + "|" + txt_Nom_Emp.getText() + "|" + txt_Apellido_Pat_Emp.getText() + "|" + txt_Apellido_Mat_Emp.getText() + "|" + txt_direccion_emp.getText() + "|" + txt_telEmpleado.getText() + "|" + sexo_emp + "|" + txt_IdDepartamento.getText() + "|" + formato.format(fecha) + "|" + txt_IdPuestos.getText() + "|" + coop_emp + "|" + txt_SalarioEmp.getText();
        mod.modificar("..\\Nomina2018\\Archivos\\Empleado.txt", datos, txt_idEmpleado.getText());
        jLabel9.setText("MODIFICADO!");
    }//GEN-LAST:event_jButton3ActionPerformed

    public boolean status;
    Float Salario;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected()) {
            status = true;
        } else {
            status = false;
        }
        if (txt_idEmpleado.getText().length() == 0 || txt_Nom_Emp.getText().length() == 0 || txt_Apellido_Pat_Emp.getText().length() == 0
                || txt_Apellido_Mat_Emp.getText().length() == 0 || txt_direccion_emp.getText().length() == 0 || txt_telEmpleado.getText().length() == 0
                || txt_IdPuestos.getText().length() == 0 || txt_SalarioEmp.getText().length() == 0 || status == false) {
            JOptionPane.showMessageDialog(null, "No puede dejar campos  vacios", "ERROR", getDefaultCloseOperation());

        } else {
            try {
                FileWriter fempleado = new FileWriter("..\\Nomina2018\\Archivos\\Empleado.txt", true);
                escribir(fempleado);
                fempleado.flush();
                JOptionPane.showMessageDialog(null, "Se han guardado los datos.");
                txt_idEmpleado.setText("");
                txt_Nom_Emp.setText("");
                txt_Apellido_Pat_Emp.setText("");
                txt_Apellido_Mat_Emp.setText("");
                txt_direccion_emp.setText("");
                txt_telEmpleado.setText("");
                txt_IdPuestos.setText("");
                txt_SalarioEmp.setText("");
                txt_IdDepartamento.setText("");
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
                jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(false);

            } catch (Throwable e) {
                System.out.println("Error" + e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_IdDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdDepartamentoActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txt_idEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idEmpleadoKeyReleased
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
                    IdEmpleado = st.nextToken().trim();
                    nom_emp = st.nextToken().trim();
                    ape_Paemp = st.nextToken().trim();
                    ape_Maemp = st.nextToken().trim();
                    direccion_emp = st.nextToken().trim();
                    telef_emp = st.nextToken().trim();
                    sexo_emp = st.nextToken().trim();
                    id_departamento = st.nextToken().trim();
                    fecha_ingreso = st.nextToken().trim();
                    id_puesto = st.nextToken().trim();
                    coop_emp = st.nextToken().trim();
                    salario_emp = st.nextToken().trim();

                    try {

                        if (txt_idEmpleado.getText().equals(IdEmpleado)) {
                            txt_IdDepartamento.setText(id_departamento);
                            txt_IdPuestos.setText(id_puesto);
                            txt_Nom_Emp.setText(nom_emp);
                            txt_apellidoPa.setText(ape_Paemp);
                            txt_Apellido_Mat_Emp.setText(ape_Maemp);
                            txt_direccion_emp.setText(direccion_emp);
                            txt_telEmpleado.setText(telef_emp);
                            txt_SalarioEmp.setText(salario_emp);

                            jLabel9.setText("MODIFICANDO!");
                            break;

                        } else {
                            jLabel9.setText("CREANDO!");
                            txt_Nom_Emp.setText("");
                            txt_apellidoPa.setText("");
                            txt_Apellido_Mat_Emp.setText("");
                            txt_direccion_emp.setText("");
                            txt_telEmpleado.setText("");
                            txt_IdDepartamento.setText("");
                            txt_IdPuestos.setText("");
                            txt_SalarioEmp.setText("");
                            buttonGroup2.clearSelection();
                            buttonGroup1.clearSelection();

                        }

                    } catch (Exception e) {

                    }

                }
                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }

    }//GEN-LAST:event_txt_idEmpleadoKeyReleased

    private void txt_Nom_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nom_EmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nom_EmpActionPerformed

    private void txt_apellidoPaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoPaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoPaActionPerformed

    private void txt_direccion_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion_empActionPerformed

    private void txt_IdDepartamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdDepartamentoKeyReleased
        File archivo;
        FileReader fr;
        BufferedReader br;
        int aux = 0;
        try {
            archivo = new File("..\\Nomina2018\\Archivos\\Departamento.txt");
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

                        if (txt_IdDepartamento.getText().equals(Idepartament)) {
                            jLabel9.setText(" EL DEPARTAMENTO EXISTE!!!");
                            break;

                        } else {
                            jLabel9.setText(" EL DEPARTAMENTO NO EXISTE!!!");

                        }

                    } catch (Exception e) {

                    }

                }
                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }
    }//GEN-LAST:event_txt_IdDepartamentoKeyReleased

    private void txt_IdPuestosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdPuestosKeyReleased
        File archivo;
        FileReader fr;
        BufferedReader br;
        int aux = 0;
        try {
            archivo = new File("..\\Nomina2018\\Archivos\\Puestos.txt");
            if (archivo.exists() == true) {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                String str = "";

                while ((linea = br.readLine()) != null && aux == 0) {
                    StringTokenizer st = new StringTokenizer(linea, "|");
                    String idPuestos = st.nextToken().trim();
                    String nPuestos = st.nextToken().trim();

                    try {

                        if (txt_IdPuestos.getText().equals(idPuestos)) {
                            jLabel9.setText(" EL PUESTO EXISTE!!!");
                            break;

                        } else {
                            jLabel9.setText("EL PUESTO NO EXISTE!!!");

                        }

                    } catch (Exception e) {

                    }

                }
                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }
    }//GEN-LAST:event_txt_IdPuestosKeyReleased

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        Cooperativa abrir = new Cooperativa();
        abrir.setVisible(true);
        Cooperativa.txt_Idempleado.setText(txt_idEmpleado.getText());


    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        Cooperativa var = new Cooperativa();
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
                    IdEmpleado = st.nextToken().trim();
                    porcentaje = st.nextToken().trim();
                    balance_acu = st.nextToken().trim();

                    System.out.println(balance_acu);
                    try {

                        double a = Double.valueOf(balance_acu);

                        if (a > 0 || txt_idEmpleado.getText().equals(IdEmpleado)) {

                            JOptionPane.showMessageDialog(null, "Aun posee balance acumulado");
                            buttonGroup1.clearSelection();

                            break;

                        } else {
                            jRadioButton3.isSelected();
                        }

                    } catch (Exception e) {

                    }

                }
                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void txt_idEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idEmpleadoKeyTyped
        char a = evt.getKeyChar();
        if (!Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_idEmpleadoKeyTyped

    private void txt_Apellido_Pat_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Apellido_Pat_EmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Apellido_Pat_EmpActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField txt_Apellido_Mat_Emp;
    private javax.swing.JTextField txt_Apellido_Pat_Emp;
    private javax.swing.JTextField txt_IdDepartamento;
    private javax.swing.JTextField txt_IdPuestos;
    private javax.swing.JTextField txt_Nom_Emp;
    private javax.swing.JTextField txt_SalarioEmp;
    private javax.swing.JTextField txt_apellidoPa;
    private javax.swing.JTextField txt_direccion_emp;
    private javax.swing.JTextField txt_idEmpleado;
    private javax.swing.JTextField txt_telEmpleado;
    // End of variables declaration//GEN-END:variables
}
