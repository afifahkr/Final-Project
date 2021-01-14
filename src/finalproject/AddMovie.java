/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import static finalproject.Result1.txtGenre;
import static finalproject.Result1.txtMovie;
import static finalproject.Result1.txtRating;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author FX8800
 */
public class AddMovie extends javax.swing.JFrame {
        ArrayList<String> movie = new ArrayList<String>();
        ArrayList<String> rating = new ArrayList<String>();
        ArrayList<String> genre = new ArrayList<String>();
        
        ArrayList<ArrayList<String>> deskripsi = new ArrayList<ArrayList<String>>();
        ArrayList<String> deskripsi1 = new ArrayList<String>();
        ArrayList<String> deskripsi2 = new ArrayList<String>();
        ArrayList<String> deskripsi3 = new ArrayList<String>();
        ArrayList<String> deskripsi4 = new ArrayList<String>();
        ArrayList<String> deskripsi5 = new ArrayList<String>();
        ArrayList<String> deskripsi6 = new ArrayList<String>();
        ArrayList<String> deskripsi7 = new ArrayList<String>();
        ArrayList<String> deskripsi8 = new ArrayList<String>();
        ArrayList<String> deskripsi9 = new ArrayList<String>();
        ArrayList<String> deskripsi10 = new ArrayList<String>();
        ArrayList<String> deskripsi11 = new ArrayList<String>();
        ArrayList<String> deskripsi12 = new ArrayList<String>();
        ArrayList<String> deskripsi13 = new ArrayList<String>();
        ArrayList<String> deskripsi14 = new ArrayList<String>();
        ArrayList<String> deskripsi15 = new ArrayList<String>();
        ArrayList<String> deskripsi16 = new ArrayList<String>();
        ArrayList<String> deskripsi17 = new ArrayList<String>();
        ArrayList<String> deskripsi18 = new ArrayList<String>();
        ArrayList<String> deskripsi19 = new ArrayList<String>();
        ArrayList<String> deskripsi20 = new ArrayList<String>();
        ArrayList<String> deskripsi21 = new ArrayList<String>();
        ArrayList<String> deskripsi22 = new ArrayList<String>();
        ArrayList<String> deskripsi23 = new ArrayList<String>();
        ArrayList<String> deskripsi24 = new ArrayList<String>();
        ArrayList<String> deskripsi25 = new ArrayList<String>();
        ArrayList<ArrayList<String>> horror = new ArrayList<ArrayList<String>>();
        //horror
        ArrayList<String> horror1 = new ArrayList<String>();
        
        ArrayList<String> horror2 = new ArrayList<String>();
        ArrayList<String> horror3 = new ArrayList<String>();
        ArrayList<String> horror4 = new ArrayList<String>();
        ArrayList<String> horror5 = new ArrayList<String>();
        //action
        ArrayList<String> action1 = new ArrayList<String>();
        ArrayList<String> action2 = new ArrayList<String>();
        ArrayList<String> action3 = new ArrayList<String>();
        ArrayList<String> action4 = new ArrayList<String>();
        ArrayList<String> action5 = new ArrayList<String>();
        //fantasy
        ArrayList<String> fantasy1 = new ArrayList<String>();
        ArrayList<String> fantasy2 = new ArrayList<String>();
        ArrayList<String> fantasy3 = new ArrayList<String>();
        ArrayList<String> fantasy4 = new ArrayList<String>();
        ArrayList<String> fantasy5 = new ArrayList<String>();
        //drama
        ArrayList<String> drama1 = new ArrayList<String>();
        ArrayList<String> drama2 = new ArrayList<String>();
        ArrayList<String> drama3 = new ArrayList<String>();
        ArrayList<String> drama4 = new ArrayList<String>();
        ArrayList<String> drama5 = new ArrayList<String>();
        //romance
        ArrayList<String> romance1 = new ArrayList<String>();
        ArrayList<String> romance2 = new ArrayList<String>();
        ArrayList<String> romance3 = new ArrayList<String>();
        ArrayList<String> romance4 = new ArrayList<String>();
        ArrayList<String> romance5 = new ArrayList<String>();
       
        
        
        
        ArrayList<ArrayList<String>> drama = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> romance = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> fantasy = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> action = new ArrayList<ArrayList<String>>();

    /**
     * Creates new form AddMovie
     */
    public AddMovie() {
        initComponents();
        
    }
    

   public ArrayList<ArrayList<String>> horrorList(){
       return horror;
   }
   public ArrayList<ArrayList<String>> dramaList(){
       return drama;
   }
   public ArrayList<ArrayList<String>> romanceList(){
       return romance;
   }
   public ArrayList<ArrayList<String>> fantasyList(){
       return fantasy;
   }
   public ArrayList<ArrayList<String>> actionList(){
       return action;
   }
   public ArrayList<ArrayList<String>> descList(){
       return deskripsi;
   }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtInsMovie = new javax.swing.JTextField();
        txtInsYear = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        cbGenre = new javax.swing.JComboBox<>();
        cbRat = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAdd)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BtnAdd)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Movie Name");

        jLabel2.setText("Genre");

        jLabel3.setText("Rating");

        jLabel4.setText("Year");

        txtInsMovie.setName("1"); // NOI18N
        txtInsMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsMovieActionPerformed(evt);
            }
        });

        txtInsYear.setText("Insert...");
        txtInsYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsYearActionPerformed(evt);
            }
        });

        txtDesc.setText("Insert Description");

        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horror", "Action", "Fantasy", "Romance", "Drama" }));
        cbGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenreActionPerformed(evt);
            }
        });

        cbRat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "**", "***", "****", "*****" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbRat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInsYear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInsMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtInsMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbRat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtInsYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        String tahun = txtInsYear.getText();
        String movname = txtInsMovie.getText();
        String a = cbGenre.getSelectedItem().toString();
        String b = cbRat.getSelectedItem().toString();
        int c = cbGenre.getSelectedIndex();
        int d = cbRat.getSelectedIndex();
        if(c == 0 && d == 0 ){
            rating.add(b);
            genre.add(a);
            horror.set(0, horror1);
            horror1.add(movname + tahun);   
            deskripsi.set(0, deskripsi1);
            deskripsi1.add(txtDesc.toString());
            
        } else if (c == 0 && d == 1){
            rating.add(b);
            genre.add(a);
            horror.set(1, horror2);
            horror2.add(movname+ tahun);
            deskripsi.set(0, deskripsi2);
            deskripsi2.add(txtDesc.toString());
            
        } else if (c == 0 && d == 2){
            rating.add(b);
            genre.add(a);
            horror.set(2, horror3);
            horror3.add(movname + tahun);
            deskripsi.set(0, deskripsi3);
            deskripsi3.add(txtDesc.toString());
        } else if (c == 0 && d == 3){
            rating.add(b);
            genre.add(a);
            horror.set(3, horror4);
            horror4.add(movname + tahun);
            deskripsi.set(0, deskripsi4);
            deskripsi4.add(txtDesc.toString());
            
        } else if (c == 0 && d == 4){
 
            rating.add(b);
            genre.add(a);
            horror.set(4, horror5);
            horror5.add(movname + tahun);
            deskripsi.set(0, deskripsi5);
            deskripsi5.add(txtDesc.toString());
        } else if (c == 1 && d == 0){

            rating.add(b);
            genre.add(a);
            action.set(0, action1);
            action1.add(movname + tahun);
            deskripsi.set(0, deskripsi6);
            deskripsi6.add(txtDesc.toString());
        } else if (c == 1 && d == 1){

            rating.add(b);
            genre.add(a);
             action.set(1, action2);
            action2.add(movname + tahun);
            deskripsi.set(0, deskripsi7);
            deskripsi7.add(txtDesc.toString());
        } else if (c == 1 && d == 2){

            rating.add(b);
            genre.add(a);
             action.set(2, action3);
            action3.add(movname + tahun);
            deskripsi.set(0, deskripsi8);
            deskripsi8.add(txtDesc.toString());
        } else if (c == 1 && d == 3){

           rating.add(b);
            genre.add(a);
             action.set(3, action4);
            action4.add(movname + tahun);
            deskripsi.set(0, deskripsi9);
            deskripsi9.add(txtDesc.toString());
        } else if (c == 1 && d == 4){

            rating.add(b);
            genre.add(a);
             action.set(4, action5);
            action5.add(movname + tahun);
            deskripsi.set(0, deskripsi10);
            deskripsi10.add(txtDesc.toString());
        } else if (c == 2 && d == 0){

            rating.add(b);
            genre.add(a);
            fantasy.set(0, fantasy1);
            fantasy1.add(movname + tahun);
            deskripsi.set(0, deskripsi11);
            deskripsi11.add(txtDesc.toString());
        } else if (c == 2 && d == 1){

            rating.add(b);
            genre.add(a);
             fantasy.set(1, fantasy2);
            fantasy2.add(movname + tahun);
            deskripsi.set(0, deskripsi12);
            deskripsi12.add(txtDesc.toString());
        } else if (c == 2 && d == 2){

           rating.add(b);
            genre.add(a);
             fantasy.set(2, fantasy3);
            fantasy3.add(movname + tahun);
            deskripsi.set(0, deskripsi13);
            deskripsi13.add(txtDesc.toString());
        } else if (c == 2 && d == 3){

            rating.add(b);
            genre.add(a);
             fantasy.set(3, fantasy4);
            fantasy4.add(movname + tahun);
            deskripsi.set(0, deskripsi14);
            deskripsi14.add(txtDesc.toString());
        } else if (c == 2 && d == 4){

            rating.add(b);
            genre.add(a);
             fantasy.set(4, fantasy5);
            fantasy5.add(movname + tahun);
            deskripsi.set(0, deskripsi15);
            deskripsi15.add(txtDesc.toString());
        } else if (c == 3 && d == 0){

            rating.add(b);
            genre.add(a);
            romance.set(0, romance1);
            romance1.add(movname + tahun);
            deskripsi.set(0, deskripsi16);
            deskripsi16.add(txtDesc.toString());
        } else if (c == 3 && d == 1){

           rating.add(b);
            genre.add(a);
            romance.set(1, romance2);
            romance2.add(movname + tahun);
            deskripsi.set(0, deskripsi17);
            deskripsi17.add(txtDesc.toString());
        } else if (c == 3 && d == 2){

            rating.add(b);
            genre.add(a);
            romance.set(2, romance3);
            romance3.add(movname + tahun);
            deskripsi.set(0, deskripsi18);
            deskripsi18.add(txtDesc.toString());
        } else if (c == 3 && d == 3){

            rating.add(b);
            genre.add(a);
            romance.set(3, romance4);
            romance4.add(movname + tahun);
            deskripsi.set(0, deskripsi19);
            deskripsi19.add(txtDesc.toString());
        } else if (c == 3 && d == 4){

            rating.add(b);
            genre.add(a);
            romance.set(4, romance5);
            romance5.add(movname + tahun);
            deskripsi.set(0, deskripsi20);
            deskripsi20.add(txtDesc.toString());
        } else if (c == 4 && d == 0){

          rating.add(b);
            genre.add(a);
            drama.set(0, drama1);
            drama1.add(movname + tahun);
            deskripsi.set(0, deskripsi21);
            deskripsi21.add(txtDesc.toString());
        } else if (c == 4 && d == 1){

            rating.add(b);
            genre.add(a);
            drama.set(1, drama2);
            drama2.add(movname + tahun);
            deskripsi.set(0, deskripsi22);
            deskripsi22.add(txtDesc.toString());
        } else if (c == 4 && d == 2){

            rating.add(b);
            genre.add(a);
            drama.set(2, drama3);
            drama3.add(movname + tahun);
            deskripsi.set(0, deskripsi23);
            deskripsi23.add(txtDesc.toString());
        } else if (c == 4 && d == 3){

            rating.add(b);
            genre.add(a);
            drama.set(3, drama4);
            drama4.add(movname + tahun);
            deskripsi.set(0, deskripsi24);
            deskripsi24.add(txtDesc.toString());
        } else if (c == 4 && d == 4){

            rating.add(b);
            genre.add(a);
            drama.set(4, drama5);
            drama5.add(movname + tahun);
            deskripsi.set(0, deskripsi25);
            deskripsi25.add(txtDesc.toString());
        }
       
    }//GEN-LAST:event_BtnAddActionPerformed

    private void cbGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenreActionPerformed
        // TODO add your handling code here
        
    }//GEN-LAST:event_cbGenreActionPerformed

    private void txtInsMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsMovieActionPerformed
        // TODO add your handling code here:
        txtInsMovie.setText(" ");
        
    }//GEN-LAST:event_txtInsMovieActionPerformed

    private void txtInsYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsYearActionPerformed
        // TODO add your handling code here:
        txtInsYear.setText(" ");
    }//GEN-LAST:event_txtInsYearActionPerformed

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
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
 
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMovie().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JComboBox<String> cbGenre;
    private javax.swing.JComboBox<String> cbRat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField txtDesc;
    public static javax.swing.JTextField txtInsMovie;
    public static javax.swing.JTextField txtInsYear;
    // End of variables declaration//GEN-END:variables
}

