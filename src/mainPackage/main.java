/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer;
import edu.uci.ics.jung.algorithms.layout.SpringLayout;
import edu.uci.ics.jung.algorithms.layout.StaticLayout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.apache.commons.collections15.Transformer;
import org.apache.commons.collections15.functors.ConstantTransformer;

/**
 *
 * @author Albertyson
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        btnLeer = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        txtFileName = new javax.swing.JTextField();
        btnTiendas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRutas = new javax.swing.JTextArea();
        txtCamion = new javax.swing.JTextField();
        btnMostrarRuta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLeer.setText("Leer entrada");
        btnLeer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLeerMouseClicked(evt);
            }
        });
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular Rutas");
        btnCalcular.setEnabled(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtFileName.setEnabled(false);

        btnTiendas.setText("Ver tiendas");
        btnTiendas.setEnabled(false);
        btnTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiendasActionPerformed(evt);
            }
        });

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        txtEntrada.setEnabled(false);
        jScrollPane1.setViewportView(txtEntrada);

        txtRutas.setColumns(20);
        txtRutas.setRows(5);
        txtRutas.setEnabled(false);
        jScrollPane2.setViewportView(txtRutas);

        txtCamion.setEnabled(false);

        btnMostrarRuta.setText("Mostrar Ruta");
        btnMostrarRuta.setEnabled(false);
        btnMostrarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFileName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTiendas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrarRuta)
                                .addGap(0, 156, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeer)
                    .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnTiendas)
                    .addComponent(txtCamion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarRuta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnLeerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeerMouseClicked
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser();
            fc.setCurrentDirectory(new File("./src/mainPackage/"));
            int returnVal = fc.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                coordenadas = new ArrayList();
                currentFile = fc.getSelectedFile();
                txtFileName.setText(currentFile.getPath());
                btnCalcular.setEnabled(true);
                FileReader fr = new FileReader(currentFile);
                BufferedReader br = new BufferedReader(fr);
                txtEntrada.setText("");
                String linea= "";
                int lineNumber = 1;
                txtEntrada.setTabSize(4);
                while ((linea = br.readLine())!=null) {
                    int tienda=lineNumber-2;
                    if(lineNumber==1){//cantidad de camiones
                        camiones = Integer.parseInt(linea);
                    }else if(lineNumber==2){//origen
                        String [] split = linea.split(",");
                        int x = Integer.parseInt(split[0]);
                        int y = Integer.parseInt(split[1]);
                        Coordenada coordenadaOrigen = new Coordenada(x,y);
                        origen = new Tienda("0",coordenadaOrigen);
                        coordenadas.add(coordenadaOrigen);
                    }else{
                        String [] split = linea.split(",");
                        int x = Integer.parseInt(split[0]);
                        int y = Integer.parseInt(split[1]);
                        coordenadas.add(new Coordenada(x,y));
                    }
                    if(tienda>0){
                        txtEntrada.append(tienda + "\t");
                    }else{
                        txtEntrada.append(" \t");
                    }
                    
                    txtEntrada.append(linea);
                    txtEntrada.append("\n");
                    lineNumber++;
                }
                tiendas = new ArrayList();
                for (int i = 0; i < coordenadas.size(); i++) {
                    Coordenada actual = coordenadas.get(i);
                    Tienda t = new Tienda(i+"",actual);
                    tiendas.add(t);           
                }
                txtCamion.setEnabled(false);
                btnMostrarRuta.setEnabled(false);
                btnTiendas.setEnabled(false);
            } else {
                txtFileName.setText("");
                btnCalcular.setEnabled(true);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnLeerMouseClicked

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        calcularRutas();
        txtCamion.setEnabled(true);
        btnMostrarRuta.setEnabled(true);
        btnTiendas.setEnabled(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendasActionPerformed
        // TODO add your handling code here:
        showGraph(camiones);
//        frmTiendas f = new frmTiendas(coordenadas);
//        f.setExtendedState(f.MAXIMIZED_BOTH);
//        f.setVisible(true);        
    }//GEN-LAST:event_btnTiendasActionPerformed

    private void btnMostrarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRutaActionPerformed
        // TODO add your handling code here:
        try{
            int numeroRuta = Integer.parseInt(txtCamion.getText());
            if(numeroRuta>=0 && numeroRuta<camiones){
                showGraph(numeroRuta);
            }else{
                JOptionPane.showMessageDialog(this, "Ingrese una ruta correcta", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ingrese una ruta correcta", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnMostrarRutaActionPerformed

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
    public void showGraph(int numeroRuta){
        if(numeroRuta==camiones){
            fillGraph();
        }else{
            fillGraph(numeroRuta);
        }        
        Layout<Tienda, String> layout = new StaticLayout<Tienda, String>(g);
        Collection<Tienda> vertices = g.getVertices();
        Iterator<Tienda> iterador = vertices.iterator();
        int maxWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - 10;
        int maxHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - 10;
        while(iterador.hasNext()){
            Tienda temp = iterador.next();
            int separatorX = (maxWidth/100);
            int separatorY = (maxHeight/100);
            Coordenada coordenadaTemporal = new Coordenada((temp.posicion.x*separatorX)+25 ,(temp.posicion.y*separatorY)+25);
            layout.setLocation(temp, coordenadaTemporal);
        }
        layout.setSize( new Dimension(maxWidth, maxHeight));
        VisualizationImageServer<Tienda, String> vv = new VisualizationImageServer<Tienda, String>(layout,new Dimension(maxWidth, maxHeight));
        Transformer<Tienda, Paint> vertexPaint = new Transformer<Tienda, Paint>() {
            public Paint transform(Tienda i) {
                return i.nombre.equals("0") ? Color.red : Color.white;
            }
        };
        vv.getRenderContext().setEdgeDrawPaintTransformer(new ConstantTransformer(Color.white));
        vv.getRenderContext().setEdgeStrokeTransformer(new ConstantTransformer(new BasicStroke(2.5f)));
        vv.getRenderContext().setVertexFillPaintTransformer((Transformer<Tienda, java.awt.Paint>) vertexPaint);
        vv.setBackground(Color.LIGHT_GRAY);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Tienda>());
        vv.getRenderer().getVertexLabelRenderer().setPosition(Renderer.VertexLabel.Position.CNTR);
        vv.setPreferredSize(new Dimension(maxWidth, maxHeight)); //Sets the viewing area size
        JFrame frame = new JFrame("Tiendas");
        JPanel jp = new JPanel();
        jp.add(vv);
        JScrollPane jsp = new JScrollPane(jp);
        frame.getContentPane().add(jsp);
        frame.pack();
        frame.setVisible(true);
    }
    public void fillGraph(){
        g = new DirectedSparseGraph();
        g.addVertex(origen);
        for (int i = 0; i < rutas.size(); i++) {
            ArrayList<Tienda> ruta = rutas.get(i);
            Tienda tiendaAnterior=origen;
            for (int j = 0; j < ruta.size(); j++) {
                Tienda tiendaActual = ruta.get(j);
                g.addVertex(tiendaActual);
                if(j==0){
                    g.addEdge(i+","+j,origen,tiendaActual);
                    tiendaAnterior = tiendaActual;
                }else{
                    g.addEdge(i+","+j,tiendaAnterior,tiendaActual);
                    tiendaAnterior = tiendaActual;
                }
            }
        }
    }
    public void fillGraph(int numeroRuta){
        g = new DirectedSparseGraph();
//        g.addVertex(origen);
        for (int i = 0; i < tiendas.size(); i++) {
            g.addVertex(tiendas.get(i));
        }
        ArrayList<Tienda> ruta = rutas.get(numeroRuta);
        Tienda tiendaAnterior=origen;
        for (int j = 0; j < ruta.size(); j++) {
            Tienda tiendaActual = ruta.get(j);
//            g.addVertex(tiendaActual);
            if(j==0){
                g.addEdge(numeroRuta+","+j,origen,tiendaActual);
                tiendaAnterior = tiendaActual;
            }else{
                g.addEdge(numeroRuta+","+j,tiendaAnterior,tiendaActual);
                tiendaAnterior = tiendaActual;
            }
        }
    }
    public Double getDistancia(Coordenada c1,Coordenada c2){
        return Math.sqrt(Math.pow(c1.x-c2.x,2)+Math.pow(c1.y-c2.y,2));
    }
    public void calcularRutas(){
        ArrayList<String> calculadas = new ArrayList();
        //ordenar las tiendas por distancia con respecto al origen
        ArrayList<Tienda> distancias = new ArrayList();
        for (int i = 1; i < tiendas.size(); i++) {
            Tienda tiendaActual = tiendas.get(i);
            Double distancia = getDistancia(tiendaActual.posicion,origen.posicion);
            tiendaActual.distancia = Math.round(distancia) + 0.0;
            distancias.add(tiendaActual);
        }
        for (int i = distancias.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (distancias.get(j + 1).distancia < distancias.get(j).distancia) {
                    Tienda temp = distancias.get(j + 1);
                    distancias.set(j + 1, distancias.get(j));
                    distancias.set(j,temp);
                }
            }
        }
        rutas = new ArrayList();
        txtRutas.setText("");
        for (int i = 0; i < camiones; i++) {
            ArrayList<Tienda> ruta = new ArrayList();
            double total = 0;
            txtRutas.append("Ruta " + i + ": ");
            for (int j = 0; j < distancias.size(); j++) {
                if(j%camiones==0 && j+i<distancias.size()){
                    Tienda tiendaActual = distancias.get(i+j);
                    tiendaActual.distanciaLocal = tiendaActual.distancia;
                    if(ruta.size()>0){
                        tiendaActual.distanciaLocal = getDistancia(tiendaActual.posicion,ruta.get(ruta.size()-1).posicion);//tiendaActual.distancia - ruta.get(ruta.size()-1).distancia;
                    }
                    ruta.add(tiendaActual);
                    txtRutas.append("\n\ttienda(indice):" + tiendaActual.nombre +
                            ",\tdistancia con el origen: \t" + tiendaActual.distancia + 
                            ",\tdistancia con el anterior: \t" + tiendaActual.distanciaLocal + ". ");
                    total+=tiendaActual.distanciaLocal;
                }
            }
            if(ruta.size()>0){
                //volver al origen            
                txtRutas.append("\n\ttienda(indice):" + origen.nombre +
                        ",\tdistancia con el origen: \t" + 0 + 
                        ",\tdistancia con el anterior: \t" + ruta.get(ruta.size()-1).distancia + ". ");
                total+=ruta.get(ruta.size()-1).distancia;
                ruta.add(origen);
            }            
            txtRutas.append("\ndistancia total: "+total+"\n");
            rutas.add(ruta);
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnMostrarRuta;
    private javax.swing.JButton btnTiendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCamion;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextArea txtRutas;
    // End of variables declaration//GEN-END:variables
    File currentFile;
    int camiones;
    Tienda origen;
    ArrayList<Coordenada> coordenadas;
    ArrayList<Tienda> tiendas;
    DirectedSparseGraph<Tienda, String> g;
    ArrayList<ArrayList<Tienda>> rutas;
}
