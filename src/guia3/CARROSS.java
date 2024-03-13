/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guia3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author crist
 */
public class CARROSS extends javax.swing.JFrame {

    /**
     * Creates new form CARROSS
     */
    List<TCarro> tiempos = new ArrayList<>();
    
    int x1, x2, x3, x4, x5, x6, x7, x8, x9, x10;
    String carroG= null;
    String carroA = "";
    boolean cT1 = false;
    boolean cT2 = false;
    boolean cT3 = false;
    boolean cT4 = false;
    boolean cT5 = false;
    boolean cT6 = false;
    boolean cT7 = false;
    boolean cT8 = false;
    boolean cT9 = false;
    boolean cT10 = false;
    ImageIcon im[]= new ImageIcon[10];
    Timer t1 = new Timer(1000, new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        
        if(!cT1) {    
        int a=(int)(Math.random()*50)+1;
        x1=x1+a; 
        carro1.setLocation(x1,6);   
        stop();
         
          }
        carro1.setIcon(im[0]);
            }});
    Timer t2 = new Timer(1000, new ActionListener(){
               
        public void actionPerformed(ActionEvent e) {
        if(!cT2) { 
        int b=(int)(Math.random()*50)+1;
        x2=x2+b; 
        carro2.setIcon(im[1]);
        carro2.setLocation(x2,40);  
        
        stop();
        
        }
                
        } });
    Timer t3 = new Timer(1000, new ActionListener(){
                
        public void actionPerformed(ActionEvent e) {
        carro3.setIcon(im[2]);
        if(!cT3) { 
        int c=(int)(Math.random()*50)+1;
        x3=x3+c; 
        carro3.setLocation(x3,74); 
        stop();

   
    }
        } });
    Timer t4 = new Timer(1000, new ActionListener(){
               
        public void actionPerformed(ActionEvent e) {
        if(!cT4) { 
        int d=(int)(Math.random()*50)+1;
        x4=x4+d; 
        carro4.setLocation(x4,108);
        carro4.setIcon(im[3]);
        stop();

        }           
        }   });
    
    Timer t5 = new Timer(1000, new ActionListener(){
               
        public void actionPerformed(ActionEvent e) {
        if(!cT5) { 
        int f =(int)(Math.random()*50)+1;
        x5=x5+f; 
        carro5.setLocation(x5,142); 
        carro5.setIcon(im[4]);
        stop();

        }      
        }   });
    
    Timer t6 = new Timer(1000, new ActionListener(){
               
        public void actionPerformed(ActionEvent e) {
        if(!cT6) { 
        int g =(int)(Math.random()*50)+1;
        x6=x6+g; 
        carro6.setLocation(x6,176); 
        carro6.setIcon(im[5]);
        stop();

        }        
        }   });
    
    Timer t7 = new Timer(1000, new ActionListener(){
               
        public void actionPerformed(ActionEvent e) {
        if(!cT7) { 
        int h =(int)(Math.random()*50)+1;
        x7=x7+h; 
        carro7.setLocation(x7,210); 
        carro7.setIcon(im[6]);
        stop();

        }       
        }  });
   
    Timer t8 = new Timer(1000, new ActionListener(){
               
        public void actionPerformed(ActionEvent e) {
        if(!cT8) { 
        int i =(int)(Math.random()*50)+1;
        x8=x8+i; 
        carro8.setLocation(x8,244);
        carro8.setIcon(im[7]);
        stop();
        }       
        }   });
    
    Timer t9 = new Timer(1000, new ActionListener(){
               
        public void actionPerformed(ActionEvent e) {
        if(!cT9) { 
        int j=(int)(Math.random()*50)+1;
        x9=x9+j; 
        carro9.setLocation(x9,278);
        carro9.setIcon(im[8]);
        stop();

        }        
        }   });
    
    Timer t10 = new Timer(1000, new ActionListener(){
               
        public void actionPerformed(ActionEvent e) {
        if(!cT10) {
        int k=(int)(Math.random()*50)+1;
        x10=x10+k; 
        carro10.setLocation(x10,312);
        
        stop();
         carro10.setIcon(im[9]);
        }
       
        }   });
    
    public CARROSS() {
        initComponents();
        metodo();
    }
       public void metodo(){
        for(int i=1;i<=10;i++){
            ImageIcon imagen= new ImageIcon("im"+i+".jpeg");
            im[i-1]=imagen;
        }
    }
    long tI;
    void iniciarCarrera() {
    tI = System.currentTimeMillis(); 
    
    }
    void stop(){
    long tA = System.currentTimeMillis();
     if (!cT1 && x1 >= jButton13.getX() + jButton13.getWidth()) {
       tiempos.add(new TCarro("carro1", tA));
       cT1 = true;
        if (carroG == null) {
            carroG = "carro1";
         }
        t1.stop();
    }
    if (!cT2 && x2 >= jButton13.getX() + jButton13.getWidth()) {
        tiempos.add(new TCarro("carro2", tA));
        cT2 = true;
        if (carroG == null) {
            carroG = "carro2";
         }
        t2.stop();
    }
  if (!cT3 && x3 >= jButton13.getX() + jButton13.getWidth()) {
        tiempos.add(new TCarro("carro3", tA));
        cT3= true;       
        if (carroG == null) {
            carroG = "carro3";
         }
        t3.stop();
    }
   if (!cT4 && x4 >= jButton13.getX() + jButton13.getWidth()) {
        tiempos.add(new TCarro("carro4", tA));
       cT4 = true;
        if (carroG == null) {
            carroG= "carro4";
         }
        t4.stop();
    }
    if (!cT5 && x5 >= jButton13.getX() + jButton13.getWidth()) {
        tiempos.add(new TCarro("carro5", tA));
        cT5 = true;
        if (carroG == null) {
            carroG = "carro5";
         }
        t5.stop();
    }
     if (!cT6 && x6 >= jButton13.getX() + jButton13.getWidth()) {
        tiempos.add(new TCarro("carro6", tA));
         cT6 = true;
            if (carroG == null) {
            carroG = "carro6";
         }
        t6.stop();
    }
      if (!cT7 && x7 >= jButton13.getX() + jButton13.getWidth()) {
        tiempos.add(new TCarro("carro7", tA));
          cT7 = true;
            if (carroG == null) {
            carroG = "carro7";
         }
        t7.stop();
    
    }
      if (!cT8 && x8 >= jButton13.getX() + jButton13.getWidth()) {
          tiempos.add(new TCarro("carro8", tA));
          cT8 = true;
       
             if (carroG == null) {
            carroG= "carro8";
         }
        t8.stop();
    }
       if (!cT9 && x9 >= jButton13.getX() + jButton13.getWidth()) {
        tiempos.add(new TCarro("carro9", tA));
           cT9 = true;
            if (carroG == null) {
            carroG= "carro9";
         }
        t9.stop();
    }
        if (!cT10 && x10 >= jButton13.getX() + jButton13.getWidth()) {
        tiempos.add(new TCarro("carro10", tA));
            cT10 = true;
      
             if (carroG == null) {
            carroG = "carro10";
         }
        t10.stop();
    }
}
    
    public class TCarro implements Comparable<TCarro> {
    private String nCarro;
    private long tLlegada;

    public TCarro(String nCarro, long tLlegada) {
        this.nCarro = nCarro;
        this.tLlegada = tLlegada;
    }

    public String getNCarro() {
        return nCarro;
    }

    public long getTLlegada() {
        return tLlegada;
    }
     @Override
    public int compareTo(TCarro CarroX) {
        return Long.compare(this.tLlegada, CarroX.tLlegada);
    }
}
    void mostrarT() {
    Collections.sort(tiempos); 

    jTextArea1.setText("TIEMPOS DE CADA CARRO:\n");

    for (TCarro tCarro : tiempos) {
        long tiempoT = tCarro.getTLlegada() - tI; 
        jTextArea1.append(tCarro.getNCarro() + ": " + tiempoT+ " milisegundos\n");
    }
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
        carro1 = new javax.swing.JButton();
        carro2 = new javax.swing.JButton();
        carro3 = new javax.swing.JButton();
        carro4 = new javax.swing.JButton();
        carro5 = new javax.swing.JButton();
        carro6 = new javax.swing.JButton();
        carro7 = new javax.swing.JButton();
        carro8 = new javax.swing.JButton();
        carro9 = new javax.swing.JButton();
        carro10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        Slider = new javax.swing.JSlider();
        INICIAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Tiempo = new javax.swing.JButton();
        item = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        RES = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        carro1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/im1.jpeg"))); // NOI18N

        carro2.setText(".");

        carro3.setText(".");

        carro4.setText(".");

        carro5.setText(".");

        carro6.setText(".");

        carro7.setText(".");

        carro8.setText(".");

        carro9.setText(".");

        carro10.setText(".");

        Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Slider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(carro9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carro8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carro7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carro6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carro5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carro4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carro3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carro2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carro10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(85, 85, 85)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(carro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        INICIAR.setText("INICIAR");
        INICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIARActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Tiempo.setText("MOSTAR TIEMPO");
        Tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoActionPerformed(evt);
            }
        });

        item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro1", "Carro2", "Carro3", "Carro4", "Carro5", "Carro6", "Carro7", "Carro8", "Carro9", "Carro10" }));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        RES.setText("RESULTADO");
        RES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESActionPerformed(evt);
            }
        });

        jLabel1.setText("INGRESA EL CARRO QUE VA A GANAR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Tiempo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(RES, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(INICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(INICIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIARActionPerformed
        iniciarCarrera();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }//GEN-LAST:event_INICIARActionPerformed

    private void TiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoActionPerformed
      mostrarT(); 
    }//GEN-LAST:event_TiempoActionPerformed

    private void RESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESActionPerformed
      if(carroG.equals(carroA)){
  
    String mensajeTemporal = "GANASTE LA APUESTA";
        jTextArea2.setText(mensajeTemporal);

       
        }else
        {

        String mensajeTemporal = "ERROR. PERDISTE";
        jTextArea2.setText(mensajeTemporal);
    } 
    }//GEN-LAST:event_RESActionPerformed

    private void SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderStateChanged
        int v=Slider.getValue();
  
        t1.setDelay(1000 / v);
        t2.setDelay(1000 / v);
        t3.setDelay(1000 / v);
        t4.setDelay(1000 / v);
        t5.setDelay(1000 / v);
        t6.setDelay(1000 / v);
        t7.setDelay(1000 / v);
        t8.setDelay(1000 / v);
        t9.setDelay(1000 / v);
        t10.setDelay(1000 / v);
    }//GEN-LAST:event_SliderStateChanged

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
            java.util.logging.Logger.getLogger(CARROSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CARROSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CARROSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CARROSS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CARROSS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INICIAR;
    private javax.swing.JButton RES;
    private javax.swing.JSlider Slider;
    private javax.swing.JButton Tiempo;
    private javax.swing.JButton carro1;
    private javax.swing.JButton carro10;
    private javax.swing.JButton carro2;
    private javax.swing.JButton carro3;
    private javax.swing.JButton carro4;
    private javax.swing.JButton carro5;
    private javax.swing.JButton carro6;
    private javax.swing.JButton carro7;
    private javax.swing.JButton carro8;
    private javax.swing.JButton carro9;
    private javax.swing.JComboBox<String> item;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
