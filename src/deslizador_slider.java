
import java.awt.Color;



/**
 *
 * @author Daniel Ricardo Parra
 */
public class deslizador_slider extends javax.swing.JFrame {
    
    int rojo=128,verde=128,azul=128;

 
    public deslizador_slider() {
        initComponents();
        this.setTitle("deslizador-colores");
        this.setSize(800,450);     // modificamos el tamaño de pantalla  //ancho-alto
        
        this.setLocationRelativeTo(null);
        //funcion de generar color
        generarColor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcolor = new javax.swing.JLabel();
        lblazul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblrojo = new javax.swing.JLabel();
        lblverde = new javax.swing.JLabel();
        sldazul = new javax.swing.JSlider();
        sldrojo = new javax.swing.JSlider();
        sldverde = new javax.swing.JSlider();
        lblrgb = new javax.swing.JLabel();
        lblhexa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 260, 140));
        lblcolor.getAccessibleContext().setAccessibleDescription("");

        lblazul.setText("128");
        getContentPane().add(lblazul, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel2.setText("ROJO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setText("VERDE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setText("AZUL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblrojo.setText("128");
        getContentPane().add(lblrojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        lblverde.setText("128");
        getContentPane().add(lblverde, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        sldazul.setMajorTickSpacing(1);
        sldazul.setMaximum(255);
        sldazul.setValue(128);
        sldazul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldazulStateChanged(evt);
            }
        });
        getContentPane().add(sldazul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 430, -1));

        sldrojo.setMajorTickSpacing(1);
        sldrojo.setMaximum(255);
        sldrojo.setValue(128);
        sldrojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrojoStateChanged(evt);
            }
        });
        getContentPane().add(sldrojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 430, -1));

        sldverde.setMajorTickSpacing(1);
        sldverde.setMaximum(255);
        sldverde.setValue(128);
        sldverde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldverdeStateChanged(evt);
            }
        });
        getContentPane().add(sldverde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 430, -1));

        lblrgb.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblrgb.setText("RGB");
        getContentPane().add(lblrgb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 480, 50));

        lblhexa.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblhexa.setText("hex");
        getContentPane().add(lblhexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 480, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldrojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrojoStateChanged
       rojo= sldrojo.getValue();
       lblrojo.setText(""+rojo);
        generarColor();
    }//GEN-LAST:event_sldrojoStateChanged

    private void sldverdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldverdeStateChanged
       
        verde= sldverde.getValue();
        lblverde.setText(""+verde);
         generarColor();
    }//GEN-LAST:event_sldverdeStateChanged

    private void sldazulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldazulStateChanged
       azul=sldazul.getValue();
       lblazul.setText(""+azul);
        generarColor();
    }//GEN-LAST:event_sldazulStateChanged

    
    //funcion para generar el color
    public void generarColor(){
        Color color= new Color(rojo,verde,azul);
        lblcolor.setOpaque(true);
        lblcolor.setBackground(color);
        
        //para que aparezcan los valores
        
        String colorHEX=Integer.toHexString(rojo)+Integer.toHexString(verde)+Integer.toHexString(azul);
        lblhexa.setText("HEX "+colorHEX.toUpperCase());
        lblrgb.setText("RGB ("+rojo+","+verde+","+azul+")");
    }
    
    
    
    
    
 
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
            java.util.logging.Logger.getLogger(deslizador_slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deslizador_slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deslizador_slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deslizador_slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deslizador_slider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblazul;
    private javax.swing.JLabel lblcolor;
    private javax.swing.JLabel lblhexa;
    private javax.swing.JLabel lblrgb;
    private javax.swing.JLabel lblrojo;
    private javax.swing.JLabel lblverde;
    private javax.swing.JSlider sldazul;
    private javax.swing.JSlider sldrojo;
    private javax.swing.JSlider sldverde;
    // End of variables declaration//GEN-END:variables
}
