package nomina2018;

/*** @author Bryan Reyes*/
public class MenuPrincipal extends javax.swing.JFrame {
    public MenuPrincipal() {
        initComponents();
        this.setResizable(false); // modifcar tamaño del form
        this.setLocationRelativeTo(null); // Aparecer en el centro
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu13 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu23 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu27 = new javax.swing.JMenu();

        jMenu13.setText("jMenu13");

        jMenu16.setText("jMenu16");

        jMenu21.setText("jMenu21");

        jMenu23.setText("File");
        jMenuBar2.add(jMenu23);

        jMenu24.setText("Edit");
        jMenuBar2.add(jMenu24);

        jMenu25.setText("File");
        jMenuBar3.add(jMenu25);

        jMenu26.setText("Edit");
        jMenuBar3.add(jMenu26);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\page-nomina.png")); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\folder.png")); // NOI18N
        jMenu1.setText("Opciones");
        jMenu1.setToolTipText("Nuevo, Editar, Abrir ");

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\iconuser.png")); // NOI18N
        jMenuItem3.setText("Cambiar Usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\back.png")); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\construction.png")); // NOI18N
        jMenu2.setText("Mantenimientos");

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\user.png")); // NOI18N
        jMenu5.setText("Usuarios");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\enterprise.png")); // NOI18N
        jMenu6.setText("Departamento");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\hired.png")); // NOI18N
        jMenu7.setText("Puestos");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\engineer.png")); // NOI18N
        jMenu8.setText("Empleado");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu8);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\debt.png")); // NOI18N
        jMenu3.setText("Procesos");

        jMenu9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\accountant.png")); // NOI18N
        jMenu9.setText("Generar Nomina");
        jMenu3.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\back.png")); // NOI18N
        jMenu10.setText("Reversar Nomina");
        jMenu3.add(jMenu10);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\business.png")); // NOI18N
        jMenu4.setText("Consultas");

        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\visitor.png")); // NOI18N
        jMenuItem4.setText("De Departamento");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\teamwork.png")); // NOI18N
        jMenuItem5.setText("De Puestos");
        jMenu4.add(jMenuItem5);

        jMenu14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\business.png")); // NOI18N
        jMenu14.setText("De Empleados");

        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\enterprise.png")); // NOI18N
        jMenuItem8.setText("Por Departamento");
        jMenu14.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\business.png")); // NOI18N
        jMenuItem9.setText("Por Puestos");
        jMenu14.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\calendar.png")); // NOI18N
        jMenuItem10.setText("Por Fecha de Ingreso");
        jMenu14.add(jMenuItem10);

        jMenu4.add(jMenu14);

        jMenu15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\hand.png")); // NOI18N
        jMenu15.setText("Nomina");

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\calendar.png")); // NOI18N
        jMenuItem6.setText("Por Fecha");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\engineer.png")); // NOI18N
        jMenuItem7.setText("Por Id_Empleado");
        jMenu15.add(jMenuItem7);

        jMenu4.add(jMenu15);

        jMenuBar1.add(jMenu4);

        jMenu27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bryan Reyes\\Desktop\\Bryan R\\UTESA\\ProyectoUtesaLab\\Nomina2018\\Imagenes\\mini\\info.png")); // NOI18N
        jMenu27.setText("Ayuda");
        jMenu27.setToolTipText("Obtenga la ayuda que necesita.");
        jMenuBar1.add(jMenu27);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
  
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
         Usuarios abrir=new Usuarios();
        abrir.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
      Departamento abrir=new Departamento();
        abrir.setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        Puestos abrir=new Puestos();
        abrir.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
     Empleado abrir=new Empleado();
        abrir.setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      Login log = new Login();
      log.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
             
          
              
            }
            
        });
    }
    
    public void inabilitar()
    {
      jMenu5.setVisible(false);
      jMenu3.setEnabled(false);
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
