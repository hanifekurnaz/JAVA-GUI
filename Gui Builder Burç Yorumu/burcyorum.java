/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import javax.swing.ImageIcon;
/**
 *
 * @author hanife
 */
public class burcyorum extends javax.swing.JFrame {

    /**
     * Creates new form burcyorum
     */
    public burcyorum() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(387, 450));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(438, 445));

        jLabel1.setText("Doğduğunuz Ay :");

        jLabel2.setText("Doğduğunuz Gün :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel3.setText("Burcunuz :");

        jButton1.setText("Yorumla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56))
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(72, 72, 72)
                .addComponent(jLabel6)
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String burc;
        ImageIcon resim;
        if((jComboBox1.getSelectedItem()=="Ocak" && jComboBox2.getSelectedIndex()>=22) || (jComboBox1.getSelectedItem()=="Şubat" && jComboBox2.getSelectedIndex()<=19))
        {
            burc="Kova";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/kova_burcu.gif"));
            jLabel6.setIcon(resim);            
            jTextPane1.setText("İntikamınızı alabileceksiniz. Hayal gücünüz çok kuvvetli olacak ve yeni tanıştığınız "
                    + "kişilerden üstün olacaksınız. Sevgilinizin son zamanlardaki davranışlarının ardındaki motive "
                    + "edici etkenleri analiz edebilecek ve onun size karşı samimiyetini ve sadakatini ölçmeye çalışacaksınız.");

        }
        else if((jComboBox1.getSelectedItem()=="Şubat" && jComboBox2.getSelectedIndex()>=20) || (jComboBox1.getSelectedItem()=="Mart"&& jComboBox2.getSelectedIndex()<=20))
        {
            burc="Balık";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/balik_burcu.gif"));
            jLabel6.setIcon(resim);            
            jTextPane1.setText("Bu ara özellikle çok aktif olacaksınız ve kariyerinizin açısından çok önemli "
                    + "olacak arkadaşlıklarınızı güçlendireceksiniz. Eğer düzgün bir ilişkiniz varsa, birlikte "
                    + "geçireceğiniz gelecek konusunda önemli tarihler belirlemek için şahane fırsatlar "
                    + "yakalayacaksınız.");

        }
        else if((jComboBox1.getSelectedItem()=="Mart" && jComboBox2.getSelectedIndex()>=21) || (jComboBox1.getSelectedItem()=="Nisan"&& jComboBox2.getSelectedIndex()<=20))
        {
            burc="Koç";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/koc_burcu.gif"));
            jLabel6.setIcon(resim);            
            jTextPane1.setText("Sizinle işbirliği yapan birine karşı soğuk davranacaksınız. Kaba "
                    + "olmamaya ve görevlerinizi özenli bir şekilde yerine getirin. Aynı "
                    + "şeyleri tekrar ederek sevgilinizin sinirini bozmayın; ona karşı "
                    + "daha uyumlu ve hoşgörülü olmaya çalışın.");

        }
        else if((jComboBox1.getSelectedItem()=="Nisan" && jComboBox2.getSelectedIndex()>=21) || (jComboBox1.getSelectedItem()=="Mayıs"&& jComboBox2.getSelectedIndex()<=21))
        {
            burc="Boğa";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/boga_burcu.gif"));
            jLabel6.setIcon(resim);            
            jTextPane1.setText("İş konusunda çok mutlu olmayacaksınız, alıngan ve huysuz davranacaksınız. Yıldızlar daha anlayışlı "
                    + "olmanızı tavsiye ediyor. Partnerinizin taleplerine karşı çok duyarlı ve düşünceli davranacaksınız, "
                    + "bu da herhangi bir problemle karşılaştığınızda tam bir esneklik sergilemenizi sağlayacak.");

        }
        else if((jComboBox1.getSelectedItem()=="Mayıs" && jComboBox2.getSelectedIndex()>=22) || (jComboBox1.getSelectedItem()=="Haziran"&& jComboBox2.getSelectedIndex()<=22))
        {
            burc="İkizler";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/ikizler_burcu.gif"));
            jLabel6.setIcon(resim);            
            jTextPane1.setText("Patronunuz açık sözlüğünüzden dolayı sizi takdir edecek ve diğer iş arkadaşlarınızın size "
                    + "imrenmesine sebep olacak kararlar alacak. Melankolik olmayın ve partnerinize karşı biraz "
                    + "küstah davranın. Bunu ona biraz daha soğuk davranarak yapabilirsiniz; bu onun ilgisini çekebilir.");

        }
        else if((jComboBox1.getSelectedItem()=="Haziran" && jComboBox2.getSelectedIndex()>=23) || (jComboBox1.getSelectedItem()=="Temmuz"&& jComboBox2.getSelectedIndex()<=22))
        {
            burc="Yengeç";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/yengec_burcu.gif"));
            jLabel6.setIcon(resim);            
            jTextPane1.setText("Yakın arkadaşlarınızın anlayışına güvenebileceksiniz ve yenilenen bağlılığınızı ve çok "
                    + "istekli olmanızı zekice göstereceksiniz. Her şey sorunsuz ilerleyecek, isteklerinizi yerine "
                    + "getirebileceksiniz ve şefkat dolu romantik bir gece geçireceksiniz.");

        }
        else if((jComboBox1.getSelectedItem()=="Temmuz" && jComboBox2.getSelectedIndex()>=23) || (jComboBox1.getSelectedItem()=="Ağustos"&& jComboBox2.getSelectedIndex()<=22))
        {
            burc="Aslan";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/aslan_burcu.gif"));
            jLabel6.setIcon(resim);            
            jTextPane1.setText("Maaşınızı, gelirinizi ve kariyerinizi etkileyecek önemli bir anlaşmayı karara bağlayacaksınız. "
                    + "Melankolik olacaksınız ve bu da kendinizi izole edip, sevgilinizden kaçmanıza sebep olacak; her "
                    + "halükarda partneriniz bu davranışınız karşılığında sizden bir açıklama bekleyecek.");

        }
        else if((jComboBox1.getSelectedItem()=="Ağustos" && jComboBox2.getSelectedIndex()>=23) || (jComboBox1.getSelectedItem()=="Eylül"&& jComboBox2.getSelectedIndex()<=22))
        {
            burc="Başak";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/basak_burcu.gif"));
            jLabel6.setIcon(resim);            
            jTextPane1.setText("Gidişatınızı dikkatlice analiz edecekseniz ve önceki hatalarınızı "
                    + "düzeltmeye çalışacaksınız. Bu, beklentilerinize uymayan, "
                    + "ilerleme göstermeyen bir durumu düzeltmenizi sağlayacak. Partnerinizin "
                    + "taleplerine karşı çok duyarlı ve düşünceli davranacaksınız, bu da herhangi bir "
                    + "problemle karşılaştığınızda tam bir esneklik sergilemenizi sağlayacak.");

        }
        else if((jComboBox1.getSelectedItem()=="Eylül" && jComboBox2.getSelectedIndex()>=23) || (jComboBox1.getSelectedItem()=="Ekim"&& jComboBox2.getSelectedIndex()<=22))
        {
            burc="Terazi";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/terazi_burcu.gif"));
            jLabel6.setIcon(resim);            
            jTextPane1.setText("Yorgun hissetmeyeceksiniz ve bu harika şeylere yol açacak. Sabır ve kararlık "
                    + "sayesinde beklenmedik, karlı sonuçlar elde edeceksiniz. Biri ilişkinize "
                    + "bir rahatsızlık verecek; çok eleştirel olmayın ve acımasız davranmayın.");

        }
        else if((jComboBox1.getSelectedItem()=="Ekim" && jComboBox2.getSelectedIndex()>=23) || (jComboBox1.getSelectedItem()=="Kasım"&& jComboBox2.getSelectedIndex()<=21))
        {
            burc="Akrep";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/akrep_burcu.gif"));
            jLabel6.setIcon(resim);
            jTextPane1.setText("Görevinizi kolayca yapacaksınız ve size verilen her görevle efektif ve işbirlikçi bir "
                    + "şekilde uğraşacaksınız. Eğer hala doğru insanla karşılaşmadıysanız, bu yeni imkanlar için "
                    + "mükemmel bir zaman. Uzun süreli bir ilişkiye başlayacaksınız.");

        }
        else if((jComboBox1.getSelectedItem()=="Kasım" && jComboBox2.getSelectedIndex()>=22) || (jComboBox1.getSelectedItem()=="Aralık"&& jComboBox2.getSelectedIndex()<=21))
        {
            burc="Yay";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/yay_burcu.gif"));
            jLabel6.setIcon(resim);
            jTextPane1.setText("Bu geçiş dönemiyle ilgili çok endişelenmeyin. Hayatın inişlerini ve çıkışlarını kabul "
                    + "etmeyi öğrenerek, tedbirli davranın. Bir arkadaşınızın partneri, onu küçük düşürmeye çalışacak "
                    + "ve siz de bu sorunu çözme ihtiyacı duyacaksınız.");
        }
        else
        {
            burc="Oğlak";
            jLabel4.setText(burc);
            resim=new ImageIcon(getClass().getResource("/ikonlar/oglak_burcu.gif"));
            jLabel6.setIcon(resim);
            jTextPane1.setText("Nasıl çalıştığınızı inceleyen ve gördüklerinden memnun kalan bir "
                    + "üstünüz gayretinize hayran kalacak ve bundan bahsedecek. Muhtemelen sizi "
                    + "rahatsız ve huzursuz eden bir şeyler var. Ne olursa olsun, siz sık sık "
                    + "sevgilinizi düşünmeye çalışın. Bu sayede ona bir sürpriz yapmak isteyeceksiniz.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(burcyorum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(burcyorum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(burcyorum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(burcyorum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new burcyorum().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
