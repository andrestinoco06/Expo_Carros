/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parteGrafica;

import expo_carros.Vehiculo_Propietario;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Camilo Tinoco
 */

public class VentanaPrincipal extends javax.swing.JFrame {
    Vehiculo_Propietario a,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,mayor,menor;
    List<Vehiculo_Propietario> ve_pro= new ArrayList<Vehiculo_Propietario>();
    Integer x1;

    public VentanaPrincipal() {
        
        initComponents();
        this.agregaPre();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jEdad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMarca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jModelo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jColor = new javax.swing.JComboBox<>();
        jAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jCedula = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPuntos = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Brefresh = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jOrdenar = new javax.swing.JComboBox<>();
        Bordenar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Bpodio = new javax.swing.JButton();
        Bwin = new javax.swing.JButton();
        Blose = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Bantiguedad = new javax.swing.JButton();
        Bviejo = new javax.swing.JButton();
        Bnuevo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        Bcosto = new javax.swing.JButton();
        Bcostoso = new javax.swing.JButton();
        Barato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Datos del Due�o");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Apellido: ");

        jLabel4.setText("Edad:");

        jEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", " " }));

        jLabel5.setText("Datos del Vehiculo");

        jLabel6.setText("Marca:");

        jMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renault", "Chevrolet", "Mazda", "BMW", "Mercedez-Benz", "Volvo", "Spark GT", "Kia", "Volskwagen" }));

        jLabel7.setText("Modelo:");

        jModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", " " }));

        jLabel8.setText("Valor: ");

        jLabel9.setText("Color:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Blanco", "Gris", "Negro", "Verde", "Beige", "Azul", "Amarillo", "Naranja", " " }));

        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Telefono:");

        jLabel12.setText("Cedula:");

        jLabel14.setText("Puntos:");

        jPuntos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(168, 168, 168))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jApellido)
                                    .addComponent(jTelefono)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jCedula)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(0, 77, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jNombre)))
                        .addGap(56, 56, 56)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jAgregar)
                                        .addGap(35, 35, 35))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jValor)
                                                .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAgregar)
                    .addComponent(jButton1))
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Registro de Carros", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Telefono", "Cedula", "Marca", "Modelo", "Valor", "Color", "Puntos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Brefresh.setText("Actualizar");
        Brefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrefreshActionPerformed(evt);
            }
        });

        jLabel13.setText("Ordenar por : ");

        jOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo", "Marca", "Puntos" }));

        Bordenar.setText("Ordenar");
        Bordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BordenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel13)
                .addGap(39, 39, 39)
                .addComponent(jOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bordenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Brefresh)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Brefresh)
                    .addComponent(Bordenar)
                    .addComponent(jOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver Datos", jPanel2);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Valor", "Color", "Puntos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        Bpodio.setText("Actualizar");
        Bpodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpodioActionPerformed(evt);
            }
        });

        Bwin.setText("Ganador");
        Bwin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BwinActionPerformed(evt);
            }
        });

        Blose.setText("Perdedor");
        Blose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bwin)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Blose)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bpodio))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(Bwin)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bpodio))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Blose)))
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Podio", jPanel3);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Valor", "Color", "Puntos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        Bantiguedad.setText("Actualizar");
        Bantiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BantiguedadActionPerformed(evt);
            }
        });

        Bviejo.setText("Mas antigüo");
        Bviejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BviejoActionPerformed(evt);
            }
        });

        Bnuevo.setText("Mas nuevo");
        Bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bnuevo)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(Bviejo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bantiguedad))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bviejo)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Bantiguedad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Bnuevo)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Antiguedad", jPanel4);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Valor", "Color", "Puntos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        Bcosto.setText("Actualizar");
        Bcosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcostoActionPerformed(evt);
            }
        });

        Bcostoso.setText("Mas Costoso");
        Bcostoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcostosoActionPerformed(evt);
            }
        });

        Barato.setText("Mas Barato");
        Barato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bcostoso)
                    .addComponent(Barato))
                .addGap(263, 263, 263)
                .addComponent(Bcosto)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bcosto)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Bcostoso)
                        .addGap(18, 18, 18)
                        .addComponent(Barato)
                        .addContainerGap(35, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Costo", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1)
                .addGap(21, 21, 21))
        );

        pack();
    }
    private void agregaPre(){
        a1 = new Vehiculo_Propietario("Carlos","Contreras",28,"3143184354",779854312,"Renault",2004,30000000,"Azul",5);
        a2 = new Vehiculo_Propietario("Pedro","Perez",47,"314243677",754654654,"Kia",2008,42000000,"Negro",7);
        a3 = new Vehiculo_Propietario("Mateo","Rodriguez",31,"3212432546",734565768,"Mazda",2007,43000000,"Blanco",6);
        a4 = new Vehiculo_Propietario("Pablo","Manrique",54,"3234354789",789894312,"Renault",2008,49000000,"Negro",9);
        a5 = new Vehiculo_Propietario("Sergio","Benitez",45,"3214767675",712344321,"Chevrolet",2011,54000000,"Amarillo",9);
        a6 = new Vehiculo_Propietario("Javier","Ordoñez",54,"3114567654",765787970,"Chevrolet",2015,56000000,"Gris",8);
        a7 = new Vehiculo_Propietario("Alberto","Perdomo",41,"3134321789",786543432,"Renault",2016,57000000,"Negro",8);
        a8 = new Vehiculo_Propietario("Giovanny","Torres",36,"3124567869",765432121,"Volvo",2011,59000000,"Naranja",2);
        a9 = new Vehiculo_Propietario("Andres","Alvarado",45,"3143184343",756454321,"Spark GT",2013,61000000,"Negro",10);
        a10 = new Vehiculo_Propietario("Juan","Mojica",29,"3114564748",778970908,"Volvo",2017,67000000,"Blanco",2);
        ve_pro.add(a1);
        ve_pro.add(a2);
        ve_pro.add(a3);
        ve_pro.add(a4);
        ve_pro.add(a5);
        ve_pro.add(a6);
        ve_pro.add(a7);
        ve_pro.add(a8);
        ve_pro.add(a9);
        ve_pro.add(a10);
        
    }
    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre, apellido, edad_s, telefono, cedula_s, marca, modelo_s, color, valor_s, imagen, puntos_s;
        Integer edad,iedad, cedula, modelo, valor, imarca, imodelo, icolor, puntos, ipuntos;
        
        nombre = jNombre.getText();
        apellido = jApellido.getText();
        iedad = jEdad.getSelectedIndex();
        edad_s = jEdad.getItemAt(iedad);
        edad = Integer.parseInt(edad_s);
        telefono = jTelefono.getText();
        cedula_s = jCedula.getText();
        cedula = Integer.parseInt(cedula_s);
        imarca = jMarca.getSelectedIndex();
        marca = jMarca.getItemAt(imarca);
        imodelo = jModelo.getSelectedIndex();
        modelo_s= jModelo.getItemAt(imodelo);
        modelo = Integer.parseInt(modelo_s);
        icolor = jColor.getSelectedIndex();
        color = jColor.getItemAt(icolor);
        valor_s = jValor.getText();
        valor = Integer.parseInt(valor_s);
        ipuntos = jPuntos.getSelectedIndex();
        puntos_s = jPuntos.getItemAt(ipuntos);
        puntos = Integer.parseInt(puntos_s);
        
         a = new Vehiculo_Propietario(nombre,apellido,edad,telefono,cedula,marca,modelo,valor,color,puntos);
        ve_pro.add(a);
        System.out.println("Esto se guarda: "+a);
        System.out.println("Esto se guarda: "+a+a.getNombre()+a.getMarca()+a.getColor());
        
    }
    
    public void limpiarTabla(int se){
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel tb2 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel tb3 = (DefaultTableModel) jTable3.getModel();
        DefaultTableModel tb4 = (DefaultTableModel) jTable4.getModel();
        int g = jTable2.getRowCount()-1;
        int f = jTable1.getRowCount()-1;
        int ff = jTable3.getRowCount()-1;
        int hh = jTable4.getRowCount()-1;
        switch (se) {
            case 1:
                for (int i = f; i >= 0; i--) {
                    tb.removeRow(tb.getRowCount()-1);
                }       break;
            case 2:
                for(int h = g; h >=0; h--){
                    tb2.removeRow(tb2.getRowCount()-1);
                }       break;
            case 3:
                for(int h1 = ff;h1>=0;h1--){
                    tb3.removeRow(tb3.getRowCount()-1);
                }
                break;
            case 4:
                for(int h2 = hh;h2>=0;h2--){
                    tb4.removeRow(tb4.getRowCount()-1);
                }
                break;
            default:
                break;
        }
        
    }
    public void llenarTabla(){
        
        int i;
        jTable1.getColumnModel();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(i = 0; i<ve_pro.size();i++){
        model.addRow(new Object[]{
           ve_pro.get(i).getNombre(),ve_pro.get(i).getApellido(),ve_pro.get(i).getEdad(),ve_pro.get(i).getTelefono(),ve_pro.get(i).getCedula(),ve_pro.get(i).getMarca(),ve_pro.get(i).getModelo(),ve_pro.get(i).getValor(),ve_pro.get(i).getColor(),ve_pro.get(i).getPuntos()});
    }
    
    }
    private void BrefreshActionPerformed(java.awt.event.ActionEvent evt) {
        this.limpiarTabla(1);
        this.llenarTabla();
    }

    private void ordena(int aas){
        System.out.println("aas"+aas);
        if(ve_pro.isEmpty()){
            JOptionPane.showMessageDialog(this,"La lista esta vaica","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            switch(aas){
                
                    
                case 0:
                    ordenaModelo();
                    break;
                case 1:
                    Collections.sort(ve_pro, new Comparator<Vehiculo_Propietario>(){

			@Override
			public int compare(Vehiculo_Propietario o1, Vehiculo_Propietario o2) {
				return o1.getMarca().compareTo(o2.getMarca());
			}
		});
	            break;
                case 2:
                    ordenaPuntos();
                    break;
            }
        }
    }
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String n = "";
        jNombre.setText(n);
        jApellido.setText(n);
        jEdad.setSelectedIndex(0);
        jTelefono.setText(n);
        jCedula.setText(n);
        jModelo.setSelectedIndex(0);
        jMarca.setSelectedIndex(0);
        jValor.setText(n);
        jColor.setSelectedIndex(0);
        jPuntos.setSelectedIndex(0);
    }

    private void BordenarActionPerformed(java.awt.event.ActionEvent evt) {
        x1 = jOrdenar.getSelectedIndex();
        ordena(x1);   
    }
    private void ordenaPuntos(){
        Collections.sort(ve_pro, new Comparator<Vehiculo_Propietario>(){

			@Override
			public int compare(Vehiculo_Propietario o1, Vehiculo_Propietario o2) {
				return o1.getPuntos().compareTo(o2.getPuntos());
        }});
    }
    
    private void ordenaModelo(){
        Collections.sort(ve_pro, new Comparator<Vehiculo_Propietario>(){

			@Override
			public int compare(Vehiculo_Propietario o1, Vehiculo_Propietario o2) {
				return o1.getModelo().compareTo(o2.getModelo());
			}
                 });
    }
    
    private void ordenaValor(){
        Collections.sort(ve_pro, new Comparator<Vehiculo_Propietario>(){

			@Override
			public int compare(Vehiculo_Propietario o1, Vehiculo_Propietario o2) {
				return o1.getValor().compareTo(o2.getValor());
			}
                 });
    }
    
    private void BpodioActionPerformed(java.awt.event.ActionEvent evt) {
        limpiarTabla(2);
        ordenaPuntos();
        int ca = ve_pro.size();
        jTable2.getColumnModel();
        DefaultTableModel model2 = (DefaultTableModel)jTable2.getModel();
        
        for(int j=ca-1; j>ve_pro.size()-5;j--){
        System.out.println("j = "+j+ca);
        model2.addRow(new Object[]{
           ve_pro.get(j).getMarca(),ve_pro.get(j).getModelo(),ve_pro.get(j).getValor(),ve_pro.get(j).getColor(),ve_pro.get(j).getPuntos()});
    
        }
        
    }

    private void BwinActionPerformed(java.awt.event.ActionEvent evt) {
        ordenaPuntos();
        JOptionPane.showMessageDialog(this,"El ganador es: "+ve_pro.get(ve_pro.size()-1).getNombre()+"\n Vehiculo: "+ve_pro.get(ve_pro.size()-1).getMarca()+"\n Puntuación: "+ve_pro.get(ve_pro.size()-1).getPuntos(),"¡GANADOR!",JOptionPane.INFORMATION_MESSAGE);
    }

    private void BloseActionPerformed(java.awt.event.ActionEvent evt) {
        ordenaPuntos();
        JOptionPane.showMessageDialog(this,"El perdedor es: "+ve_pro.get(0).getNombre()+"\n Vehiculo: "+ve_pro.get(0).getMarca()+"\n Puntuación: "+ve_pro.get(0).getPuntos(),"¡PERDEDOR!",JOptionPane.INFORMATION_MESSAGE);
    }

    private void BcostoActionPerformed(java.awt.event.ActionEvent evt) {
        limpiarTabla(4);
        ordenaValor();
        int ca = ve_pro.size();
        jTable4.getColumnModel();
        DefaultTableModel model2 = (DefaultTableModel)jTable4.getModel();
        
        for(int j=0; j<ve_pro.size();j++){
        System.out.println("j = "+j+ca);
        model2.addRow(new Object[]{
           ve_pro.get(j).getMarca(),ve_pro.get(j).getModelo(),ve_pro.get(j).getValor(),ve_pro.get(j).getColor(),ve_pro.get(j).getPuntos()});
    
        }
    }

    private void BcostosoActionPerformed(java.awt.event.ActionEvent evt) {
        ordenaValor();
        JOptionPane.showMessageDialog(this,"El mas costoso es: "+ve_pro.get(ve_pro.size()-1).getMarca()+"\n Propietario: "+ve_pro.get(ve_pro.size()-1).getNombre()+"\n Valor: "+ve_pro.get(ve_pro.size()-1).getValor(),"Mas costoso",JOptionPane.INFORMATION_MESSAGE);
    }

    private void BaratoActionPerformed(java.awt.event.ActionEvent evt) {
        ordenaValor();
        JOptionPane.showMessageDialog(this,"El de menor costo es: "+ve_pro.get(0).getValor()+"\n Propietario: "+ve_pro.get(0).getNombre()+"\n Valor: "+ve_pro.get(0).getValor(),"Menos costoso",JOptionPane.INFORMATION_MESSAGE);
    }

    private void BantiguedadActionPerformed(java.awt.event.ActionEvent evt) {
        limpiarTabla(3);
        ordenaModelo();
        int ca = ve_pro.size();
        jTable3.getColumnModel();
        DefaultTableModel model2 = (DefaultTableModel)jTable3.getModel();
        
        for(int j=0; j<ve_pro.size();j++){
        System.out.println("j = "+j+ca);
        model2.addRow(new Object[]{
           ve_pro.get(j).getMarca(),ve_pro.get(j).getModelo(),ve_pro.get(j).getValor(),ve_pro.get(j).getColor(),ve_pro.get(j).getPuntos()});
    
        }
    }

    private void BviejoActionPerformed(java.awt.event.ActionEvent evt) {
        ordenaModelo();
        JOptionPane.showMessageDialog(this,"El mas viejo es: "+ve_pro.get(0).getModelo()+"\n Propietario: "+ve_pro.get(0).getNombre()+"\n Marca: "+ve_pro.get(0).getMarca(),"Mas antiguo",JOptionPane.INFORMATION_MESSAGE);
        
    }

    private void BnuevoActionPerformed(java.awt.event.ActionEvent evt) {
        ordenaModelo();
        JOptionPane.showMessageDialog(this,"El mas nuevo es: "+ve_pro.get(ve_pro.size()-1).getModelo()+"\n Propietario: "+ve_pro.get(ve_pro.size()-1).getNombre()+"\n Marca: "+ve_pro.get(ve_pro.size()-1).getMarca(),"Mas nuevo",JOptionPane.INFORMATION_MESSAGE);
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Bantiguedad;
    private javax.swing.JButton Barato;
    private javax.swing.JButton Bcosto;
    private javax.swing.JButton Bcostoso;
    private javax.swing.JButton Blose;
    private javax.swing.JButton Bnuevo;
    private javax.swing.JButton Bordenar;
    private javax.swing.JButton Bpodio;
    private javax.swing.JButton Brefresh;
    private javax.swing.JButton Bviejo;
    private javax.swing.JButton Bwin;
    private javax.swing.JButton jAgregar;
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCedula;
    private javax.swing.JComboBox<String> jColor;
    private javax.swing.JComboBox<String> jEdad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jMarca;
    private javax.swing.JComboBox<String> jModelo;
    private javax.swing.JTextField jNombre;
    private javax.swing.JComboBox<String> jOrdenar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> jPuntos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTelefono;
    private javax.swing.JTextField jValor;

}
