package Vacuum;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Design extends javax.swing.JFrame {

    ImageIcon tiles_im = new javax.swing.ImageIcon(getClass().getResource("tiles.jpg"));
    ImageIcon dirt_im = new javax.swing.ImageIcon(getClass().getResource("dirt.jpg"));
    ImageIcon cleaner_im = new javax.swing.ImageIcon(getClass().getResource("cleaner.jpg"));

    private Timer timer;
    private final static String newline = "\n";
    int tiles[][];
    int num, num1, num2, i, j, k, num3, m, n;

    int startb = 0;

    public Design() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        tiles = new int[6][6];
        tiles[5][5] = 10;
        tiles[1][2] = 5;
        int l, m;
        for (l = 1; l <= 5; l++) {
            for (m = 1; m <= 5; m++) {
                tiles[l][m] = 0;
            }

        }

    }

    public void Run() {
        Timer myTimer = new Timer(1000, null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        grid1 = new javax.swing.JLabel();
        grid2 = new javax.swing.JLabel();
        grid3 = new javax.swing.JLabel();
        grid4 = new javax.swing.JLabel();
        grid5 = new javax.swing.JLabel();
        grid6 = new javax.swing.JLabel();
        grid7 = new javax.swing.JLabel();
        grid8 = new javax.swing.JLabel();
        grid9 = new javax.swing.JLabel();
        grid10 = new javax.swing.JLabel();
        grid11 = new javax.swing.JLabel();
        grid12 = new javax.swing.JLabel();
        grid13 = new javax.swing.JLabel();
        grid14 = new javax.swing.JLabel();
        grid15 = new javax.swing.JLabel();
        grid16 = new javax.swing.JLabel();
        grid17 = new javax.swing.JLabel();
        grid18 = new javax.swing.JLabel();
        grid19 = new javax.swing.JLabel();
        grid20 = new javax.swing.JLabel();
        grid21 = new javax.swing.JLabel();
        grid22 = new javax.swing.JLabel();
        grid23 = new javax.swing.JLabel();
        grid24 = new javax.swing.JLabel();
        grid25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_x = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_y = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dirt_text = new javax.swing.JTextField();
        start_cleaner = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        restart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vacuum Cleaner (AI)");

        grid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        grid25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vacuum/tiles.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(grid21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grid3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grid4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grid5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(grid5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grid6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grid11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grid16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grid21, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(grid22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grid25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("        INITIALIZE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" X  AXIS :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(" Y  AXIS :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(" DIRT     :");

        start_cleaner.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        start_cleaner.setForeground(new java.awt.Color(102, 204, 0));
        start_cleaner.setText("START Game");
        start_cleaner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_cleanerActionPerformed(evt);
            }
        });

        text_area.setColumns(20);
        text_area.setRows(5);
        jScrollPane1.setViewportView(text_area);

        restart.setText("Restart Game");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dirt_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(text_y, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(text_x, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(restart, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(start_cleaner, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_x, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(text_y))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start_cleaner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restart))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void start_cleanerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_cleanerActionPerformed

        restart.setEnabled(true);
        start_cleaner.setEnabled(false);

        String a = text_x.getText();
        String b = text_y.getText();
        String c = dirt_text.getText();

        num = Integer.parseInt(a);
        m = num;
        num1 = Integer.parseInt(b);
        n = num1;
        num2 = Integer.parseInt(c);

        tiles[num][num1] = 1;
        if (num == 1 && num1 == 1) {
            grid1.setIcon(cleaner_im);
        } else if (num == 1 && num1 == 2) {
            grid2.setIcon(cleaner_im);
        } else if (num == 1 && num1 == 3) {
            grid3.setIcon(cleaner_im);
        } else if (num == 1 && num1 == 4) {
            grid4.setIcon(cleaner_im);
        } else if (num == 1 && num1 == 5) {
            grid5.setIcon(cleaner_im);
        } else if (num == 2 && num1 == 1) {
            grid6.setIcon(cleaner_im);
        } else if (num == 2 && num1 == 2) {
            grid7.setIcon(cleaner_im);
        } else if (num == 2 && num1 == 3) {
            grid8.setIcon(cleaner_im);
        } else if (num == 2 && num1 == 4) {
            grid9.setIcon(cleaner_im);
        } else if (num == 2 && num1 == 5) {
            grid10.setIcon(cleaner_im);
        } else if (num == 3 && num1 == 1) {
            grid11.setIcon(cleaner_im);
        } else if (num == 3 && num1 == 2) {
            grid12.setIcon(cleaner_im);
        } else if (num == 3 && num1 == 3) {
            grid13.setIcon(cleaner_im);
        } else if (num == 3 && num1 == 4) {
            grid14.setIcon(cleaner_im);
        } else if (num == 3 && num1 == 5) {
            grid15.setIcon(cleaner_im);
        } else if (num == 4 && num1 == 1) {
            grid16.setIcon(cleaner_im);
        } else if (num == 4 && num1 == 2) {
            grid17.setIcon(cleaner_im);
        } else if (num == 4 && num1 == 3) {
            grid18.setIcon(cleaner_im);
        } else if (num == 4 && num1 == 4) {
            grid19.setIcon(cleaner_im);
        } else if (num == 4 && num1 == 5) {
            grid20.setIcon(cleaner_im);
        } else if (num == 5 && num1 == 1) {
            grid21.setIcon(cleaner_im);
        } else if (num == 5 && num1 == 2) {
            grid22.setIcon(cleaner_im);
        } else if (num == 5 && num1 == 3) {
            grid23.setIcon(cleaner_im);
        } else if (num == 5 && num1 == 4) {
            grid24.setIcon(cleaner_im);
        } else if (num == 5 && num1 == 5) {
            grid25.setIcon(cleaner_im);
        }

        for (k = 0; k < num2; k++) {
            int random = (int) (Math.random() * 6);
            int random1 = (int) (Math.random() * 6);
            if ((random == 0 || random1 == 0)) {
                num2 = num2 + 1;
            } else if ((tiles[random][random1] == 1) || (tiles[random][random1] == 2)) {
                num2 = num2 + 1;
            } else if (tiles[random][random1] == 0) {
                tiles[random][random1] = 2;
                System.out.println("ran  " + random + "ran1 " + random1);
            }
        }

        for (int p = 1; p <= 5; p++) {
            for (int q = 1; q <= 5; q++) {
                System.out.println(" " + tiles[p][q]);
            }
            System.out.println("\n");
        }
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (tiles[i][j] == 2) {
                    if (i == 1 && j == 1) {
                        grid1.setIcon(dirt_im);
                    } else if (i == 1 && j == 2) {
                        grid2.setIcon(dirt_im);
                    } else if (i == 1 && j == 3) {
                        grid3.setIcon(dirt_im);
                    } else if (i == 1 && j == 4) {
                        grid4.setIcon(dirt_im);
                    } else if (i == 1 && j == 5) {
                        grid5.setIcon(dirt_im);
                    } else if (i == 2 && j == 1) {
                        grid6.setIcon(dirt_im);
                    } else if (i == 2 && j == 2) {
                        grid7.setIcon(dirt_im);
                    } else if (i == 2 && j == 3) {
                        grid8.setIcon(dirt_im);
                    } else if (i == 2 && j == 4) {
                        grid9.setIcon(dirt_im);
                    } else if (i == 2 && j == 5) {
                        grid10.setIcon(dirt_im);
                    } else if (i == 3 && j == 1) {
                        grid11.setIcon(dirt_im);
                    } else if (i == 3 && j == 2) {
                        grid12.setIcon(dirt_im);
                    } else if (i == 3 && j == 3) {
                        grid13.setIcon(dirt_im);
                    } else if (i == 3 && j == 4) {
                        grid14.setIcon(dirt_im);
                    } else if (i == 3 && j == 5) {
                        grid15.setIcon(dirt_im);
                    } else if (i == 4 && j == 1) {
                        grid16.setIcon(dirt_im);
                    } else if (i == 4 && j == 2) {
                        grid17.setIcon(dirt_im);
                    } else if (i == 4 && j == 3) {
                        grid18.setIcon(dirt_im);
                    } else if (i == 4 && j == 4) {
                        grid19.setIcon(dirt_im);
                    } else if (i == 4 && j == 5) {
                        grid20.setIcon(dirt_im);
                    } else if (i == 5 && j == 1) {
                        grid21.setIcon(dirt_im);
                    } else if (i == 5 && j == 2) {
                        grid22.setIcon(dirt_im);
                    } else if (i == 5 && j == 3) {
                        grid23.setIcon(dirt_im);
                    } else if (i == 5 && j == 4) {
                        grid24.setIcon(dirt_im);
                    } else if (i == 5 && j == 5) {
                        grid25.setIcon(dirt_im);
                    }
                }
            }
            //System.out.println("\n");

        }
        //start_cleaner.setEnabled(false);

        function();


    }//GEN-LAST:event_start_cleanerActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        // TODO add your handling code here:

        timer.stop();

        restart.setEnabled(false);
        start_cleaner.setEnabled(true);
        
        text_area.setText(null);

        num = 0;
        num1 = 0;
        num2 = 0;
        i = 0;
        j = 0;
        k = 0;
        num3 = 0;
        m = 0;
        n = 0;
        w = 5;
        tag = 0;
        text = "Left";
        text2 = "Right";
        text3 = "Up";
        text4 = "Down";
        text5 = "Clean";

        text_x.setText(null);
        text_y.setText(null);
        dirt_text.setText(null);

        grid1.setIcon(tiles_im);

        grid2.setIcon(tiles_im);

        grid3.setIcon(tiles_im);

        grid4.setIcon(tiles_im);

        grid5.setIcon(tiles_im);

        grid6.setIcon(tiles_im);

        grid7.setIcon(tiles_im);

        grid8.setIcon(tiles_im);

        grid9.setIcon(tiles_im);

        grid10.setIcon(tiles_im);

        grid11.setIcon(tiles_im);

        grid12.setIcon(tiles_im);

        grid13.setIcon(tiles_im);

        grid14.setIcon(tiles_im);

        grid15.setIcon(tiles_im);

        grid16.setIcon(tiles_im);

        grid17.setIcon(tiles_im);

        grid18.setIcon(tiles_im);

        grid19.setIcon(tiles_im);

        grid20.setIcon(tiles_im);

        grid21.setIcon(tiles_im);

        grid22.setIcon(tiles_im);

        grid23.setIcon(tiles_im);

        grid24.setIcon(tiles_im);

        grid25.setIcon(tiles_im);

        tiles[num][num1] = 0;
        
         for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                tiles[i][j] =0;
    
            }
         }

    }//GEN-LAST:event_restartActionPerformed

    int w = 5, tag = 0;
    String text = "Left";
    String text2 = "Right";
    String text3 = "Up";
    String text4 = "Down";
    String text5 = "Clean";

    private void function() {

        //start_btn.setEnabled(false);
        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (tag == 0) {
                    if (m == 1 && n == 1) {
                        grid2.setIcon(tiles_im);
                        grid1.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        tag = 2;
                        //System.out.println("m="+m+"n="+n);
                        //timer.stop();
                        // grid1.setIcon(null);
                    } else if (m == 1 && n == 2) {

                        if (tiles[m][n] == 1) {
                            grid2.setIcon(cleaner_im);
                        } else {
                            grid3.setIcon(tiles_im);
                            grid2.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //grid2.setIcon(null);
                    } else if (m == 1 && n == 3) {

                        if (tiles[m][n] == 1) {
                            grid3.setIcon(cleaner_im);
                        } else {
                            grid4.setIcon(tiles_im);
                            grid3.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //grid3.setIcon(null);
                    } else if (m == 1 && n == 4) {

                        if (tiles[m][n] == 1) {
                            grid4.setIcon(cleaner_im);

                        } else {
                            grid5.setIcon(tiles_im);
                            grid4.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //grid4.setIcon(null);
                    } else if (m == 1 && n == 5) {

                        if (tiles[m][n] == 1) {
                            grid5.setIcon(cleaner_im);
                        } else {
                            grid6.setIcon(tiles_im);
                            grid5.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid5.setIcon(null);
                    } else if (m == 2 && n == 1) {

                        if (tiles[m][n] == 1) {
                            grid6.setIcon(cleaner_im);
                        } else {
                            grid7.setIcon(tiles_im);
                            grid6.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        tag = 1;
                        n--;
                        m--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid6.setIcon(null);
                    } else if (m == 2 && n == 2) {

                        if (tiles[m][n] == 1) {
                            grid7.setIcon(cleaner_im);
                        } else {
                            grid8.setIcon(tiles_im);
                            grid7.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid7.setIcon(null);
                    } else if (m == 2 && n == 3) {

                        if (tiles[m][n] == 1) {
                            grid8.setIcon(cleaner_im);
                        } else {
                            grid9.setIcon(tiles_im);
                            grid8.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid8.setIcon(null);
                    } else if (m == 2 && n == 4) {

                        if (tiles[m][n] == 1) {
                            grid9.setIcon(cleaner_im);
                        } else {
                            grid10.setIcon(tiles_im);
                            grid9.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid9.setIcon(null);
                    } else if (m == 2 && n == 5) {

                        if (tiles[m][n] == 1) {
                            grid10.setIcon(cleaner_im);
                        } else {
                            grid11.setIcon(tiles_im);
                            grid10.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }

                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid10.setIcon(null);
                    } else if (m == 3 && n == 1) {

                        if (tiles[m][n] == 1) {
                            grid11.setIcon(cleaner_im);
                        } else {
                            grid12.setIcon(tiles_im);
                            grid11.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        tag = 1;
                        n--;
                        m--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid11.setIcon(null);
                    } else if (m == 3 && n == 2) {

                        if (tiles[m][n] == 1) {
                            grid12.setIcon(cleaner_im);
                        } else {
                            grid13.setIcon(tiles_im);
                            grid12.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid12.setIcon(null);
                    } else if (m == 3 && n == 3) {

                        if (tiles[m][n] == 1) {
                            grid13.setIcon(cleaner_im);
                        } else {
                            grid14.setIcon(tiles_im);
                            grid13.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());

                        // grid13.setIcon(null);
                    } else if (m == 3 && n == 4) {

                        if (tiles[m][n] == 1) {
                            grid14.setIcon(cleaner_im);
                        } else {
                            grid15.setIcon(tiles_im);
                            grid14.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid14.setIcon(null);
                    } else if (m == 3 && n == 5) {

                        if (tiles[m][n] == 1) {
                            grid15.setIcon(cleaner_im);
                        } else {
                            grid16.setIcon(tiles_im);
                            grid15.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //   grid15.setIcon(null);
                    } else if (m == 4 && n == 1) {

                        if (tiles[m][n] == 1) {
                            grid16.setIcon(cleaner_im);
                        } else {
                            grid17.setIcon(tiles_im);
                            grid16.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        tag = 1;
                        n--;
                        m--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid16.setIcon(null);
                    } else if (m == 4 && n == 2) {

                        if (tiles[m][n] == 1) {
                            grid17.setIcon(cleaner_im);
                        } else {
                            grid18.setIcon(tiles_im);
                            grid17.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //   grid17.setIcon(null);
                    } else if (m == 4 && n == 3) {

                        if (tiles[m][n] == 1) {
                            grid18.setIcon(cleaner_im);
                        } else {
                            grid19.setIcon(tiles_im);
                            grid18.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid18.setIcon(null);
                    } else if (m == 4 && n == 4) {

                        if (tiles[m][n] == 1) {
                            grid19.setIcon(cleaner_im);
                        } else {
                            grid20.setIcon(tiles_im);
                            grid19.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid19.setIcon(null);
                    } else if (m == 4 && n == 5) {

                        if (tiles[m][n] == 1) {
                            grid20.setIcon(cleaner_im);
                        } else {
                            grid21.setIcon(tiles_im);
                            grid20.setIcon(cleaner_im);
                        }

                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid20.setIcon(null);
                    } else if (m == 5 && n == 1) {

                        if (tiles[m][n] == 1) {
                            grid21.setIcon(cleaner_im);
                        } else {
                            grid22.setIcon(tiles_im);
                            grid21.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        tag = 1;
                        n--;
                        m--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid21.setIcon(null);
                    } else if (m == 5 && n == 2) {

                        if (tiles[m][n] == 1) {
                            grid22.setIcon(cleaner_im);
                        } else {
                            grid23.setIcon(tiles_im);
                            grid22.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid22.setIcon(null);
                    } else if (m == 5 && n == 3) {

                        if (tiles[m][n] == 1) {
                            grid23.setIcon(cleaner_im);
                        } else {
                            grid24.setIcon(tiles_im);
                            grid23.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid23.setIcon(null);
                    } else if (m == 5 && n == 4) {

                        if (tiles[m][n] == 1) {
                            grid24.setIcon(cleaner_im);
                        } else {
                            grid25.setIcon(tiles_im);
                            grid24.setIcon(cleaner_im);
                        }
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid24.setIcon(null);
                    } else if (m == 5 && n == 5) {
                        grid25.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid25.setIcon(null);
                    }
                } else if (tag == 1) {
                    if (m == 1) {
                        grid6.setIcon(tiles_im);
                        grid1.setIcon(cleaner_im);

                        n = 1;
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        System.out.println("Up");
                        tag = 2;
                        text_area.append(text3 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //System.out.println("m= "+m+"n= "+n);
                        //timer.stop();
                        //   grid1.setIcon(null);
                    } else if (m == 2) {
                        grid11.setIcon(tiles_im);
                        grid6.setIcon(cleaner_im);
                        n = 1;
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        System.out.println("Up");
                        m--;
                        text_area.append(text3 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid6.setIcon(null);
                    } else if (m == 3) {
                        n = 1;
                        grid16.setIcon(tiles_im);
                        grid11.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        System.out.println("Up");
                        m--;
                        text_area.append(text3 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid11.setIcon(null);
                    } else if (m == 4) {
                        n = 1;
                        grid21.setIcon(tiles_im);
                        grid16.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        System.out.println("Up");
                        m--;
                        text_area.append(text3 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid16.setIcon(null);
                    } else if (m == 5) {
                        n = 1;
                        grid21.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        System.out.println("Up");
                        m--;
                        text_area.append(text3 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //  grid21.setIcon(null);
                    }

                } else if (tag == 2) {

                    if (m == 1 && n == 1) {

                        grid1.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        System.out.println("Right");
                        n++;
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid1.setIcon(null);
                    } else if (m == 1 && n == 2) {

                        grid1.setIcon(tiles_im);
                        grid2.setIcon(cleaner_im);

                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //grid2.setIcon(null);
                    } else if (m == 1 && n == 3) {

                        grid2.setIcon(tiles_im);
                        grid3.setIcon(cleaner_im);

                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //grid3.setIcon(null);
                    } else if (m == 1 && n == 4) {

                        grid3.setIcon(tiles_im);
                        grid4.setIcon(cleaner_im);

                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //grid4.setIcon(null);
                    } else if (m == 1 && n == 5) {
                        grid4.setIcon(tiles_im);
                        grid5.setIcon(cleaner_im);

                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        m++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid5.setIcon(null);
                    } else if (m == 2 && n == 1) {
                        grid7.setIcon(tiles_im);
                        grid6.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        m++;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid6.setIcon(null);
                    } else if (m == 2 && n == 2) {
                        grid8.setIcon(tiles_im);
                        grid7.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid7.setIcon(null);
                    } else if (m == 2 && n == 3) {
                        grid9.setIcon(tiles_im);
                        grid8.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid8.setIcon(null);
                    } else if (m == 2 && n == 4) {
                        grid10.setIcon(tiles_im);
                        grid9.setIcon(cleaner_im);

                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid9.setIcon(null);
                    } else if (m == 2 && n == 5) {
                        grid5.setIcon(tiles_im);
                        grid10.setIcon(cleaner_im);

                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }

                        n--;
                        System.out.println("Down");
                        text_area.append(text4 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid10.setIcon(null);
                    } else if (m == 3 && n == 1) {
                        grid6.setIcon(tiles_im);
                        grid11.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;

                        System.out.println("Down");
                        text_area.append(text4 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 3 && n == 2) {
                        grid11.setIcon(tiles_im);
                        grid12.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        // grid12.setIcon(null);
                    } else if (m == 3 && n == 3) {
                        grid12.setIcon(tiles_im);
                        grid13.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());

                        // grid13.setIcon(null);
                    } else if (m == 3 && n == 4) {
                        grid13.setIcon(tiles_im);
                        grid14.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 3 && n == 5) {
                        grid14.setIcon(tiles_im);
                        grid15.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        m++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        //   grid15.setIcon(null);
                    } else if (m == 4 && n == 1) {
                        grid17.setIcon(tiles_im);
                        grid16.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }

                        m++;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 4 && n == 2) {
                        grid18.setIcon(tiles_im);
                        grid17.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");
                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 4 && n == 3) {
                        grid19.setIcon(tiles_im);
                        grid18.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");

                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 4 && n == 4) {
                        grid20.setIcon(tiles_im);
                        grid19.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Left");

                        text_area.append(text + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 4 && n == 5) {
                        grid15.setIcon(tiles_im);
                        grid20.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n--;
                        System.out.println("Down");
                        text_area.append(text4 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 5 && n == 1) {
                        grid16.setIcon(tiles_im);
                        grid21.setIcon(cleaner_im);

                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }

                        n++;

                        System.out.println("Down");
                        text_area.append(text4 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 5 && n == 2) {
                        grid21.setIcon(tiles_im);
                        grid22.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 5 && n == 3) {
                        grid22.setIcon(tiles_im);
                        grid23.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());

                    } else if (m == 5 && n == 4) {
                        grid23.setIcon(tiles_im);
                        grid24.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }
                        n++;
                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                    } else if (m == 5 && n == 5) {
                        grid24.setIcon(tiles_im);
                        grid25.setIcon(cleaner_im);
                        if (tiles[m][n] == 2) {
                            text_area.append(text5 + newline);
                            text_area.setCaretPosition(text_area.getDocument().getLength());
                            System.out.println("Clean");
                            tiles[m][n] = 0;
                        }

                        System.out.println("Right");
                        text_area.append(text2 + newline);
                        text_area.setCaretPosition(text_area.getDocument().getLength());
                        timer.stop();

                    }
                }
            }

        });
        timer.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Design().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dirt_text;
    private javax.swing.JLabel grid1;
    private javax.swing.JLabel grid10;
    private javax.swing.JLabel grid11;
    private javax.swing.JLabel grid12;
    private javax.swing.JLabel grid13;
    private javax.swing.JLabel grid14;
    private javax.swing.JLabel grid15;
    private javax.swing.JLabel grid16;
    private javax.swing.JLabel grid17;
    private javax.swing.JLabel grid18;
    private javax.swing.JLabel grid19;
    private javax.swing.JLabel grid2;
    private javax.swing.JLabel grid20;
    private javax.swing.JLabel grid21;
    private javax.swing.JLabel grid22;
    private javax.swing.JLabel grid23;
    private javax.swing.JLabel grid24;
    private javax.swing.JLabel grid25;
    private javax.swing.JLabel grid3;
    private javax.swing.JLabel grid4;
    private javax.swing.JLabel grid5;
    private javax.swing.JLabel grid6;
    private javax.swing.JLabel grid7;
    private javax.swing.JLabel grid8;
    private javax.swing.JLabel grid9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton restart;
    private javax.swing.JButton start_cleaner;
    private javax.swing.JTextArea text_area;
    private javax.swing.JTextField text_x;
    private javax.swing.JTextField text_y;
    // End of variables declaration//GEN-END:variables
}
