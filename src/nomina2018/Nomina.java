package nomina2018;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

/**
 * * @author Bryan Reyes
 */
public class Nomina extends javax.swing.JFrame {

    public double calculo;
    public double calcAFP;
    public double calcARS;
    public double salNeto;
    final float AFP = 0.0287f;
    final float ARS = 0.0304f;
    public double resultadoISR = 0;

    String Idnomina;
    String IdEmpleado;
    String fecha;
    String porcentaje;
    String balance_acu;
    String sueldoneto=String.valueOf(salNeto);
    String valorAFP=String.valueOf(calcAFP);
    String valorARS=String.valueOf(calcARS);
//    String valorcoop=txt_valorcoop.getText();
     String valorIsr=String.valueOf(resultadoISR);  
   String  status;
    String salario_emp;   

    public Nomina() {
        initComponents();
        this.setResizable(false); // modifcar tamaño del form
        this.setLocationRelativeTo(null); // Aparecer en el centro

    }
    

    public String fecha() {

        int monthe = jDateChooser1.getDate().getMonth();
        int year = jDateChooser1.getDate().getYear();
        year += 1900;
        System.out.println(year);
        System.out.println(monthe + 1);
        int day;
        monthe += 1;
        if (monthe == 2) {
            day = 28;
            System.out.println(day);
        } else {
            day = 30;
            System.out.println(day);
        }

        return fecha = (day + "/" + monthe + "/" + year);
        //System.out.println(fecha);

    }

    public void valorcoop() {
        Cooperativa obj = new Cooperativa();

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

                    txt_valorcoop.setText(String.valueOf(obj.banacu));

                }
                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }

    }

    public void escribir(FileWriter fnomina) throws IOException {

        valorcoop();

        fnomina.write("|" + txt_idNomina.getText() + "|" + txt_Idempleado.getText() + "|" + fecha() + "|" + txt_salariobruto.getText() + "|" + txt_sueldoneto.getText() + "|" + txt_afp.getText() + "|" + txt_ars.getText() + "|" + txt_valorcoop.getText() + "|" + txt_valorIsr.getText() + "|" + txt_statusnom.getText() + "\r\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txt_idNomina = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_Idempleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_salariobruto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_afp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_ars = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_valorcoop = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_valorIsr = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_sueldoneto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_statusnom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NOMINA");

        jLabel10.setText("Id_Nomina");

        txt_idNomina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idNominaKeyReleased(evt);
            }
        });

        jLabel11.setText("Id_Empleado");

        txt_Idempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_IdempleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IdempleadoKeyTyped(evt);
            }
        });

        jLabel12.setText("Fecha_Nomina");

        jLabel13.setText("Salario_Bruto");

        txt_salariobruto.setEnabled(false);
        txt_salariobruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salariobrutoActionPerformed(evt);
            }
        });

        jLabel14.setText("Valor_AFP");

        txt_afp.setEnabled(false);
        txt_afp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_afpActionPerformed(evt);
            }
        });

        jLabel15.setText("Valor_ARS");

        txt_ars.setEnabled(false);
        txt_ars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_arsActionPerformed(evt);
            }
        });

        jLabel16.setText("Valor_Coop");

        txt_valorcoop.setEnabled(false);

        jLabel17.setText("Valor_ISR");

        txt_valorIsr.setEnabled(false);

        jLabel18.setText("Sueldo_Neto");

        txt_sueldoneto.setEnabled(false);

        jLabel19.setText("Status_Nomina");

        txt_statusnom.setEnabled(false);

        jButton1.setText("Generar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\back.png")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("dd-MM-yy");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_idNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txt_salariobruto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_sueldoneto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_valorcoop, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_valorIsr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ars, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_afp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_statusnom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_idNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_Idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_salariobruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_sueldoneto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_afp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txt_ars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel16))
                            .addComponent(txt_valorcoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_valorIsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_statusnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txt_idNomina.getText().length() == 0 || txt_Idempleado.getText().length() == 0 || jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(null, "No puede dejar campos  vacios", "ERROR", getDefaultCloseOperation());
        } else {
            try {
                FileWriter fnomina = new FileWriter("..\\Nomina2018\\Archivos\\Nomina.txt", true);
                escribir(fnomina);
                fnomina.flush();
                txt_statusnom.setText("True");
                JOptionPane.showMessageDialog(null, "Se han guardado los datos.");
                txt_idNomina.setText("");
                txt_Idempleado.setText("");
                jDateChooser1.cleanup();
                txt_salariobruto.setText("");
                txt_sueldoneto.setText("");
                txt_statusnom.setText("");

            } catch (Throwable e) {
                System.out.println("Error" + e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_arsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_arsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_arsActionPerformed

    private void txt_salariobrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salariobrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salariobrutoActionPerformed

    private void txt_afpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_afpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_afpActionPerformed

    private void txt_idNominaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idNominaKeyReleased
        File archivo;
        FileReader fr;
        BufferedReader br;
        int aux = 0;
        try {
            archivo = new File("..\\Nomina2018\\Archivos\\Nomina.txt");
            if (archivo.exists() == true) {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                String str = "";

                while ((linea = br.readLine()) != null && aux == 0) {

                    StringTokenizer st = new StringTokenizer(linea, "|");
                    Idnomina = st.nextToken().trim();

                    try {

                        if (txt_idNomina.getText().equals(Idnomina)) {

                            txt_statusnom.setText("True");
                            status=txt_statusnom.getText();
                            jLabel1.setText("YA EXISTE!");
                            break;

                        } else {
                            txt_statusnom.setText("False");
                            jLabel1.setText("");
                        }

                    } catch (Exception e) {

                    }

                }
                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }

    }//GEN-LAST:event_txt_idNominaKeyReleased

    private void txt_IdempleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdempleadoKeyReleased
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
                    IdEmpleado = st.nextToken().trim();
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
                    salario_emp = st.nextToken().trim();

                    try {
                        if (txt_Idempleado.getText().equals(IdEmpleado)) {
                            String empleado = this.Consultar_ID("..\\Nomina2018\\Archivos\\Empleado.txt", txt_Idempleado.getText());
                            txt_salariobruto.setText(salario_emp);
                            calculo = Float.parseFloat(txt_salariobruto.getText());
                            calcAFP = calculo * AFP; //Calculo AFP: Sueldo Bruto por valor_afp
                            String.valueOf(calcAFP);
                            txt_afp.setText(String.format("%.2f", calcAFP));// envio de afp al textfield
                            calcARS = calculo * ARS;// Calculo ARS : Sueldo Bruto por ars      
                            String.valueOf(calcARS);
                            txt_ars.setText(String.format("%.2f", calcARS));//envio del ars al texfield                    

                            double aux = (calculo - calcAFP - calcARS) * 12;
                            if (aux > 34685.00 && aux <= 524027.42) {
                                resultadoISR = (aux * 0.15) / 12;
                            } else if (aux > 524027.42 && aux <= 72260.25) {

                                resultadoISR = ((aux * 0.20) / 12) + 2601.33;
                            } else if (aux > 72260.25) {
                                resultadoISR = ((aux * 0.25) / 12) + 6648.00;
                            } else {
                                resultadoISR = 0;
                            }

                            salNeto = calculo - calcAFP - calcARS - resultadoISR; // salario neto: sueldo_bruto menos afp y ars-irs.
                            String.valueOf(salNeto);
                            txt_sueldoneto.setText(String.format("%.2f", salNeto));
                            String.valueOf(resultadoISR);
                            txt_valorIsr.setText(String.format("%.2f", resultadoISR));
                              valorcoop();
                         

                        }

                    } catch (Exception e) {
                    }

                }

                br.close();
            }
        } catch (Exception el) {
            el.printStackTrace();
        }
    }//GEN-LAST:event_txt_IdempleadoKeyReleased

    private void txt_IdempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdempleadoKeyTyped
        char a = evt.getKeyChar();
        if (!Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_IdempleadoKeyTyped
    public String Consultar_ID(String ruta, String id) {

        try {
            FileReader leer = new FileReader(ruta);
            BufferedReader br = new BufferedReader(leer);

            String datos = br.readLine();
            while (datos != null) {
                if (id.equals(datos.split("|")[1])) {
                    return datos;
                }
                datos = br.readLine();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return "NO";
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Nomina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JTextField txt_Idempleado;
    private javax.swing.JTextField txt_afp;
    private javax.swing.JTextField txt_ars;
    private javax.swing.JTextField txt_idNomina;
    private javax.swing.JTextField txt_salariobruto;
    private javax.swing.JTextField txt_statusnom;
    private javax.swing.JTextField txt_sueldoneto;
    private javax.swing.JTextField txt_valorIsr;
    public static javax.swing.JTextField txt_valorcoop;
    // End of variables declaration//GEN-END:variables
}
