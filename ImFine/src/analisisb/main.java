/*
Nama Kelompok : LinuxTech
Anggota :   - Mikha Christian Satria Girsang (1810520086)
            - Lalu Advan Lavida (1810520094)
            - Muhammad Pandu Suryapranata (1810520091)
            - Vingkyn Fadillah (1810520084)
            - Fedi Fandawa (1810520060)
 */
package analisisb;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
/**
 *
 * @author MikhaGirsang
 */
public class main extends javax.swing.JFrame {

    perhitungan hitung = new perhitungan();
    private DecimalFormat df2 = new DecimalFormat("#.##");
    public main() {
        initComponents();
        reset();
    }
    
    public double[] getvalue1(){
        double[] nilai = new double[9];
        if (btnya1.isSelected()){
            nilai[0] = 1;
        } else if (btntidak1.isSelected()){
            nilai [0] = 0;
        }
        
        if (btnya2.isSelected()){
            nilai[1] = 1;
        } else if (btntidak2.isSelected()){
            nilai [1] = 0;
        }
        
        if (btnya3.isSelected()){
            nilai[2] = 1;
        } else if (btntidak3.isSelected()){
            nilai [2] = 0;
        }
        
        if (btnya4.isSelected()){
            nilai[3] = 1;
        } else if (btntidak4.isSelected()){
            nilai [3] = 0;
        }
        
        if (btnya5.isSelected()){
            nilai[4] = 1;
        } else if (btntidak5.isSelected()){
            nilai [4] = 0;
        }
        
        if (btnya6.isSelected()){
            nilai[5] = 1;
        } else if (btntidak6.isSelected()){
            nilai [5] = 0;
        }
        
        if (btnya7.isSelected()){
            nilai[6] = 1;
        } else if (btntidak7.isSelected()){
            nilai [6] = 0;
        }
        
        if (btnya8.isSelected()){
            nilai[7] = 1;
        } else if (btntidak8.isSelected()){
            nilai [7] = 0;
        }
        
        if (btnya9.isSelected()){
            nilai[8] = 1;
        } else if (btntidak9.isSelected()){
            nilai [8] = 0;
        }
        return nilai;
    }
    
    public double maxnilai(double[]a){
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
    public void isihasil(){
        double[][] gejala = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0, 1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 0, 1, 1},
            {1, 1, 0, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 0, 1, 1, 1, 1, 1},
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0}
        };
        double[] hasil = hitung.jaccard(gejala, getvalue1());
        int angkaBelakangKoma = 2;
        double temp = Math.pow(10, angkaBelakangKoma);
        
        pasien1.setText(Double.toString(Math.round(hasil[0]*temp)/temp));
        pasien2.setText(Double.toString(Math.round(hasil[1]*temp)/temp));
        pasien3.setText(Double.toString(Math.round(hasil[2]*temp)/temp));
        pasien4.setText(Double.toString(Math.round(hasil[3]*temp)/temp));
        pasien5.setText(Double.toString(Math.round(hasil[4]*temp)/temp));
        pasien6.setText(Double.toString(Math.round(hasil[5]*temp)/temp));
        pasien7.setText(Double.toString(Math.round(hasil[6]*temp)/temp));
        pasien8.setText(Double.toString(Math.round(hasil[7]*temp)/temp));
        pasien9.setText(Double.toString(Math.round(hasil[8]*temp)/temp));
        pasien10.setText(Double.toString(Math.round(hasil[9]*temp)/temp));
        pasien11.setText(Double.toString(Math.round(hasil[10]*temp)/temp));
        pasien12.setText(Double.toString(Math.round(hasil[11]*temp)/temp));
        pasien13.setText(Double.toString(Math.round(hasil[12]*temp)/temp));
        pasien14.setText(Double.toString(Math.round(hasil[13]*temp)/temp));
        pasien15.setText(Double.toString(Math.round(hasil[14]*temp)/temp));
        pasien16.setText(Double.toString(Math.round(hasil[15]*temp)/temp));
        pasien17.setText(Double.toString(Math.round(hasil[16]*temp)/temp));
        pasien18.setText(Double.toString(Math.round(hasil[17]*temp)/temp));
        pasien19.setText(Double.toString(Math.round(hasil[18]*temp)/temp));
        pasien20.setText(Double.toString(Math.round(hasil[19]*temp)/temp));
        pasien21.setText(Double.toString(Math.round(hasil[20]*temp)/temp));
        pasien22.setText(Double.toString(Math.round(hasil[21]*temp)/temp));
        pasien23.setText(Double.toString(Math.round(hasil[22]*temp)/temp));
        pasien24.setText(Double.toString(Math.round(hasil[23]*temp)/temp));
        pasien25.setText(Double.toString(Math.round(hasil[24]*temp)/temp));
        pasien26.setText(Double.toString(Math.round(hasil[25]*temp)/temp));
        pasien27.setText(Double.toString(Math.round(hasil[26]*temp)/temp));
    }
    
    public void reset(){
        jTextField1.setText("");
        buttonGroup1.setSelected(btntidak1.getModel(), true);
        buttonGroup2.setSelected(btntidak2.getModel(), true);
        buttonGroup3.setSelected(btntidak3.getModel(), true);
        buttonGroup4.setSelected(btntidak4.getModel(), true);
        buttonGroup5.setSelected(btntidak5.getModel(), true);
        buttonGroup6.setSelected(btntidak6.getModel(), true);
        buttonGroup7.setSelected(btntidak7.getModel(), true);
        buttonGroup8.setSelected(btntidak8.getModel(), true);
        buttonGroup9.setSelected(btntidak9.getModel(), true);
        
        DefaultTableModel model = (DefaultTableModel) tabeldiagpasien.getModel();
        model.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel) tabeldiaganda.getModel();
        model2.setRowCount(0);
        
        jLabel13.setText("");
        jLabel15.setText("");
        jLabel18.setText("");
        jLabel20.setText("");
        
        pasien1.setText("");
        pasien2.setText("");
        pasien3.setText("");
        pasien4.setText("");
        pasien5.setText("");
        pasien6.setText("");
        pasien7.setText("");
        pasien8.setText("");
        pasien9.setText("");
        pasien10.setText("");
        pasien11.setText("");
        pasien12.setText("");
        pasien13.setText("");
        pasien14.setText("");
        pasien15.setText("");
        pasien16.setText("");
        pasien17.setText("");
        pasien18.setText("");
        pasien19.setText("");
        pasien20.setText("");
        pasien21.setText("");
        pasien22.setText("");
        pasien23.setText("");
        pasien24.setText("");
        pasien25.setText("");
        pasien26.setText("");
        pasien27.setText("");
    }
    
    public void menghitung(){
        double[][] gejala = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0, 1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 0, 1, 1},
            {1, 1, 0, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 0, 1, 1, 1, 1, 1},
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0}
        };
        double[] a = getvalue1();
        double[] hasil = hitung.jaccard(gejala, getvalue1());
        int max = hitung.indeks(hasil);        
        
        double[] arr = new double[9];
        for(int f=0;f<9;f++){
            arr[f]=gejala[max][f];
        }
        String[] hasil1 = convert(arr);
        
        Object[] row = new Object[10];
        for(int c=0;c<9;c++){
            row[c] = hasil1[c];
        }
        row[9] = result(gejala[max][9]);
        DefaultTableModel model = (DefaultTableModel) tabeldiagpasien.getModel();
        model.addRow(row);
        
        String[] ambil = convert(a);
        
        Object[] row2 = new Object[10];
        for(int c=0;c<9;c++){
            row2[c] = ambil[c];
        }
        row2[9] = result(gejala[max][9]);
        DefaultTableModel model2 = (DefaultTableModel) tabeldiaganda.getModel();
        model2.addRow(row2);
        
        jLabel13.setText(Integer.toString(max+1));
        jLabel15.setText(result(gejala[max][9]));
        jLabel18.setText(Double.toString(maxnilai(hasil)));
        jLabel20.setText(jTextField1.getText());   
    }
    
    public String[] convert(double[] a) {
        String[] jawabanpascon = new String[9];
        for (int i = 0; i < 9; i++) {
            if (a[i] == 1) {
                jawabanpascon[i] = "Ya";
            } else {
                jawabanpascon[i] = "Tidak";
            }
        }
        return jawabanpascon;
    }
    
    public static String result(double a) {
            String hasil = "";
            if (a == 1) {
                hasil = "Positif";
            } else if (a == 0) {
                hasil = "Negatif";
            }
        return hasil;
    }
    
    public int cek(double[]a){
        int min = 0;
        for (int f = 0; f < 9; f++) {
            if (a[f] == 0) {
                min = min + 1;
            }
        }
        return min;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnya1 = new javax.swing.JRadioButton();
        btntidak1 = new javax.swing.JRadioButton();
        btnya2 = new javax.swing.JRadioButton();
        btntidak2 = new javax.swing.JRadioButton();
        btnya3 = new javax.swing.JRadioButton();
        btntidak3 = new javax.swing.JRadioButton();
        btnya4 = new javax.swing.JRadioButton();
        btntidak4 = new javax.swing.JRadioButton();
        btntidak5 = new javax.swing.JRadioButton();
        btnya5 = new javax.swing.JRadioButton();
        btnya6 = new javax.swing.JRadioButton();
        btntidak6 = new javax.swing.JRadioButton();
        btntidak7 = new javax.swing.JRadioButton();
        btnya7 = new javax.swing.JRadioButton();
        btnya8 = new javax.swing.JRadioButton();
        btntidak8 = new javax.swing.JRadioButton();
        btntidak9 = new javax.swing.JRadioButton();
        btnya9 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldiagpasien = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeldiaganda = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        pasien1 = new javax.swing.JLabel();
        pasien2 = new javax.swing.JLabel();
        pasien3 = new javax.swing.JLabel();
        pasien4 = new javax.swing.JLabel();
        pasien5 = new javax.swing.JLabel();
        pasien6 = new javax.swing.JLabel();
        pasien7 = new javax.swing.JLabel();
        pasien8 = new javax.swing.JLabel();
        pasien9 = new javax.swing.JLabel();
        pasien10 = new javax.swing.JLabel();
        pasien11 = new javax.swing.JLabel();
        pasien12 = new javax.swing.JLabel();
        pasien13 = new javax.swing.JLabel();
        pasien14 = new javax.swing.JLabel();
        pasien15 = new javax.swing.JLabel();
        pasien16 = new javax.swing.JLabel();
        pasien17 = new javax.swing.JLabel();
        pasien18 = new javax.swing.JLabel();
        pasien19 = new javax.swing.JLabel();
        pasien20 = new javax.swing.JLabel();
        pasien21 = new javax.swing.JLabel();
        pasien22 = new javax.swing.JLabel();
        pasien23 = new javax.swing.JLabel();
        pasien24 = new javax.swing.JLabel();
        pasien25 = new javax.swing.JLabel();
        pasien26 = new javax.swing.JLabel();
        pasien27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Diagnosis Penyakit Paru-Paru");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Gejala Pasien"));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Nama :");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Apakah anda Batuk Berdahak?");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("Apakah anda Batuk Berdarah?");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("Apakah anda Sesak Nafas?");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Apakah dada anda terasa Nyeri?");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("apakah anda tidak nafsu makan?");

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("apakah berat badan anda menurun?");

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel9.setText("apakah anda demam menggigil?");

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel10.setText("apakah anda berkeringat berlebihan pada malam hari?");

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel11.setText("apakah anda sering kelelahan?");

        buttonGroup1.add(btnya1);
        btnya1.setText("Ya");

        buttonGroup1.add(btntidak1);
        btntidak1.setText("Tidak");

        buttonGroup2.add(btnya2);
        btnya2.setText("Ya");

        buttonGroup2.add(btntidak2);
        btntidak2.setText("Tidak");

        buttonGroup3.add(btnya3);
        btnya3.setText("Ya");

        buttonGroup3.add(btntidak3);
        btntidak3.setText("Tidak");

        buttonGroup4.add(btnya4);
        btnya4.setText("Ya");

        buttonGroup4.add(btntidak4);
        btntidak4.setText("Tidak");

        buttonGroup5.add(btntidak5);
        btntidak5.setText("Tidak");

        buttonGroup5.add(btnya5);
        btnya5.setText("Ya");

        buttonGroup6.add(btnya6);
        btnya6.setText("Ya");

        buttonGroup6.add(btntidak6);
        btntidak6.setText("Tidak");

        buttonGroup7.add(btntidak7);
        btntidak7.setText("Tidak");

        buttonGroup7.add(btnya7);
        btnya7.setText("Ya");

        buttonGroup8.add(btnya8);
        btnya8.setText("Ya");

        buttonGroup8.add(btntidak8);
        btntidak8.setText("Tidak");

        buttonGroup9.add(btntidak9);
        btntidak9.setText("Tidak");

        buttonGroup9.add(btnya9);
        btnya9.setText("Ya");

        jButton1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton1.setText("Mulai Diagnosis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnya1)
                                .addGap(18, 18, 18)
                                .addComponent(btntidak1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnya2)
                                .addGap(18, 18, 18)
                                .addComponent(btntidak2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnya3)
                                .addGap(18, 18, 18)
                                .addComponent(btntidak3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnya4)
                                .addGap(18, 18, 18)
                                .addComponent(btntidak4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnya5)
                                .addGap(18, 18, 18)
                                .addComponent(btntidak5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnya6)
                                .addGap(18, 18, 18)
                                .addComponent(btntidak6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnya7)
                                .addGap(18, 18, 18)
                                .addComponent(btntidak7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnya8)
                                .addGap(18, 18, 18)
                                .addComponent(btntidak8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnya9)
                                .addGap(18, 18, 18)
                                .addComponent(btntidak9))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnya1)
                    .addComponent(btntidak1))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnya2)
                    .addComponent(btntidak2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnya3)
                    .addComponent(btntidak3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnya4)
                    .addComponent(btntidak4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnya5)
                    .addComponent(btntidak5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnya6)
                    .addComponent(btntidak6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnya7)
                    .addComponent(btntidak7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnya8)
                    .addComponent(btntidak8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(btnya9)
                    .addComponent(btntidak9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("hasil Diagnosis"));

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel12.setText("Hasil Diagnosis anda menunjukan bahwa kondisi anda cocok dengan pasien -");

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnosis Pasien"));
        jPanel4.setAutoscrolls(true);

        tabeldiagpasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "Hasil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabeldiagpasien);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnosis Anda"));

        tabeldiaganda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "Hasil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabeldiaganda);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel14.setText("Berdasarkan Hasil Diagnosa ini, anda dinyatakan");

        jLabel15.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel16.setText("Memiliki Penyakit Paru");

        jLabel17.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel17.setText("Nama : ");

        jLabel18.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel19.setText("Kemiripan Hasil Diagnosa anda dengan Pasien adalah : ");

        jLabel20.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Hasil Diagnosis Dengan Pasien 1 :");

        jLabel22.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Hasil Diagnosis Dengan Pasien 2 :");

        jLabel23.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Hasil Diagnosis Dengan Pasien 3 :");

        jLabel24.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Hasil Diagnosis Dengan Pasien 4 :");

        jLabel25.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Hasil Diagnosis Dengan Pasien 5 :");

        jLabel26.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Hasil Diagnosis Dengan Pasien 6 :");

        jLabel27.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Hasil Diagnosis Dengan Pasien 7 :");

        jLabel28.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Hasil Diagnosis Dengan Pasien 8 :");

        jLabel29.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Hasil Diagnosis Dengan Pasien 9 :");

        jLabel30.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Hasil Diagnosis Dengan Pasien 10 :");

        jLabel31.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Hasil Diagnosis Dengan Pasien 11 :");

        jLabel32.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Hasil Diagnosis Dengan Pasien 12 :");

        jLabel33.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Hasil Diagnosis Dengan Pasien 13 :");

        jLabel34.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Hasil Diagnosis Dengan Pasien 14 :");

        jLabel35.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Hasil Diagnosis Dengan Pasien 15 :");

        jLabel36.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Hasil Diagnosis Dengan Pasien 16 :");

        jLabel37.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Hasil Diagnosis Dengan Pasien 17 :");

        jLabel38.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Hasil Diagnosis Dengan Pasien 18 :");

        jLabel39.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Hasil Diagnosis Dengan Pasien 19 :");

        jLabel40.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Hasil Diagnosis Dengan Pasien 20 :");

        jLabel41.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Hasil Diagnosis Dengan Pasien 21 :");

        jLabel42.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Hasil Diagnosis Dengan Pasien 22 :");

        jLabel43.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Hasil Diagnosis Dengan Pasien 23 :");

        jLabel44.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Hasil Diagnosis Dengan Pasien 24 :");

        jLabel45.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Hasil Diagnosis Dengan Pasien 25 :");

        jLabel46.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Hasil Diagnosis Dengan Pasien 26 :");

        jLabel47.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Hasil Diagnosis Dengan Pasien 27 :");

        pasien1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien10.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien11.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien12.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien13.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien14.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien15.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien16.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien17.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien18.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien19.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien20.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien21.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien22.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien23.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien24.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien25.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien26.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pasien27.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pasien27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasien9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasien2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pasien20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(pasien19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasien27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasien22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasien23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel85Layout.createSequentialGroup()
                            .addComponent(pasien1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasien2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasien3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasien4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasien5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasien6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasien7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasien8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasien9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasien10))
                        .addGroup(jPanel85Layout.createSequentialGroup()
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pasien11)
                                .addGroup(jPanel85Layout.createSequentialGroup()
                                    .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel41)
                                        .addComponent(pasien21))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel42)
                                        .addComponent(pasien22))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel43)
                                        .addComponent(pasien23))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel44)
                                        .addComponent(pasien24))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel45)
                                        .addComponent(pasien25))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel46)
                                        .addComponent(pasien26))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel47)
                                        .addComponent(pasien27))))
                            .addGap(72, 72, 72))
                        .addGroup(jPanel85Layout.createSequentialGroup()
                            .addComponent(jLabel31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel32)
                                .addComponent(pasien12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(pasien13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(pasien14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(pasien15))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(pasien16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel37)
                                .addComponent(pasien17))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38)
                                .addComponent(pasien18))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel39)
                                .addComponent(pasien19))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40)
                                .addComponent(pasien20))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel85Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //recap cap = new recap();
        //cap.setVisible(true);
        //for(int a = 0;a<9;a++){
        //    System.out.println(menghitung()[a]);
        //}
        int min = cek(getvalue1());
        if (min == 9){
            JOptionPane.showMessageDialog(null, "Data yang anda berikan menunjukan bahwa anda tidak memiliki gejala apapun, maka dari itu hasil diagnosis anda adalah Negatif");
        } else {
        DefaultTableModel model = (DefaultTableModel) tabeldiagpasien.getModel();
        model.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel) tabeldiaganda.getModel();
        model2.setRowCount(0);
        menghitung();
        isihasil();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reset();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btntidak1;
    private javax.swing.JRadioButton btntidak2;
    private javax.swing.JRadioButton btntidak3;
    private javax.swing.JRadioButton btntidak4;
    private javax.swing.JRadioButton btntidak5;
    private javax.swing.JRadioButton btntidak6;
    private javax.swing.JRadioButton btntidak7;
    private javax.swing.JRadioButton btntidak8;
    private javax.swing.JRadioButton btntidak9;
    private javax.swing.JRadioButton btnya1;
    private javax.swing.JRadioButton btnya2;
    private javax.swing.JRadioButton btnya3;
    private javax.swing.JRadioButton btnya4;
    private javax.swing.JRadioButton btnya5;
    private javax.swing.JRadioButton btnya6;
    private javax.swing.JRadioButton btnya7;
    private javax.swing.JRadioButton btnya8;
    private javax.swing.JRadioButton btnya9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel pasien1;
    private javax.swing.JLabel pasien10;
    private javax.swing.JLabel pasien11;
    private javax.swing.JLabel pasien12;
    private javax.swing.JLabel pasien13;
    private javax.swing.JLabel pasien14;
    private javax.swing.JLabel pasien15;
    private javax.swing.JLabel pasien16;
    private javax.swing.JLabel pasien17;
    private javax.swing.JLabel pasien18;
    private javax.swing.JLabel pasien19;
    private javax.swing.JLabel pasien2;
    private javax.swing.JLabel pasien20;
    private javax.swing.JLabel pasien21;
    private javax.swing.JLabel pasien22;
    private javax.swing.JLabel pasien23;
    private javax.swing.JLabel pasien24;
    private javax.swing.JLabel pasien25;
    private javax.swing.JLabel pasien26;
    private javax.swing.JLabel pasien27;
    private javax.swing.JLabel pasien3;
    private javax.swing.JLabel pasien4;
    private javax.swing.JLabel pasien5;
    private javax.swing.JLabel pasien6;
    private javax.swing.JLabel pasien7;
    private javax.swing.JLabel pasien8;
    private javax.swing.JLabel pasien9;
    private javax.swing.JTable tabeldiaganda;
    private javax.swing.JTable tabeldiagpasien;
    // End of variables declaration//GEN-END:variables
}
