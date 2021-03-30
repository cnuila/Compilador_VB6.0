/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrincipal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author cnuila
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtext_log = new javax.swing.JTextPane();
        jb_cargarArchivo = new javax.swing.JButton();
        jb_analizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jtext_log);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 490, 220));

        jb_cargarArchivo.setText("Cargar Archivo");
        jb_cargarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cargarArchivoMouseClicked(evt);
            }
        });
        jPanel1.add(jb_cargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, -1));

        jb_analizar.setText("Analizar");
        jb_analizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_analizarMouseClicked(evt);
            }
        });
        jPanel1.add(jb_analizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cargarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cargarArchivoMouseClicked
        // TODO add your handling code here:
        archivoActual = null;
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Visual Basic", "vb");
            jfc.addChoosableFileFilter(filtro);
            jfc.setAcceptAllFileFilterUsed(false);
            int seleccion = jfc.showOpenDialog(this);            
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                archivoActual = new File(jfc.getSelectedFile().getPath());
                JOptionPane.showMessageDialog(this, "El archivo se cargo exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
            FileReader fr = null;
            BufferedReader br = null;
            fr = new FileReader(archivoActual);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jb_cargarArchivoMouseClicked

    private void jb_analizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_analizarMouseClicked
        try {
            Lexer scanner = new Lexer(new FileReader(archivoActual));            
            parser miParser = new parser(scanner);
            miParser.parse();
            String log = "Inicia el analisis\n";
            jtext_log.setText(log);
            if (miParser.errores.isEmpty()) {
                String formato = "edge [color=blue];" + hacerDFS(miParser.raiz);
                miParser.raiz.exportarArbol(formato, "AST");
                log += "Se genero el arbol AST\n";
                jtext_log.setText("");
                jtext_log.setText(log);
            } else {
                for (int i = 0; i < miParser.errores.size(); i++) {
                    log += miParser.errores.get(i) + "\n";
                }
                jtext_log.setText("");
                jtext_log.setText(log);
            }
            log += "Finalizo el analisas\n";
            jtext_log.setText("");
            jtext_log.setText(log);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jb_analizarMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public String hacerDFS(Nodo node) {
        ArrayList<String> recorrido = new ArrayList<>();
        DFS(node, recorrido);
        DFSAristas(node, node.getIdNodo(), recorrido);
        String formato = "";
        for (int i = 0; i < recorrido.size(); i++) {
            formato += recorrido.get(i);
        }
        return formato;
    }

    public void DFS(Nodo node, ArrayList<String> recorrido) {
        if (!node.getEtiqueta().equals("VACIO")) {
            recorrido.add(node.toString());
        }
        for (int i = 0; i < node.getHijos().size(); i++) {
            DFS(node.getHijos().get(i), recorrido);
        }
    }

    public void DFSAristas(Nodo node, int padre, ArrayList<String> recorrido) {
        if (node.getIdNodo() != padre) {
            if (!node.getEtiqueta().equals("VACIO")) {
                recorrido.add(padre + "->" + node.getIdNodo() + ";");
            }
        }
        for (int i = 0; i < node.getHijos().size(); i++) {
            DFSAristas(node.getHijos().get(i), node.getIdNodo(), recorrido);
        }
    }

    File archivoActual = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_analizar;
    private javax.swing.JButton jb_cargarArchivo;
    private javax.swing.JTextPane jtext_log;
    // End of variables declaration//GEN-END:variables
}
