package br.edu.utfpr.pb.vicenzo_trabfinal.view;

import br.edu.utfpr.pb.vicenzo_trabfinal.controller.CategoriaController;
import br.edu.utfpr.pb.vicenzo_trabfinal.db.DatabaseConnection;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Categoria;
import br.edu.utfpr.pb.vicenzo_trabfinal.report.GerarRelatorio;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Dimension;
import java.awt.Image;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author vicen
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private Timer timer;
    private String titulo = "JavaSwing_1 - ";
    private CategoriaController categoriaController;

    public FrmPrincipal() {
        initComponents();

        timer = new Timer(1000, (ActionEvent e) -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            this.setTitle(titulo + sdf.format(new Date()));
        });

        timer.start();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon icone = new ImageIcon(
                this.getClass().getResource(
                        "/br/edu/utfpr/pb/vicenzo_trabfinal/image/sistema.png")
        );
        this.setIconImage(icone.getImage());

        this.categoriaController = new CategoriaController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuEstado = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuRelCategoria = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuRelCategoria1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        mnuEstado.setText("Estado");
        mnuEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEstadoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEstado);

        jMenuItem2.setText("Cidade");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Relatórios");

        mnuRelCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        mnuRelCategoria.setText("Relatório Cliente por Cidade");
        mnuRelCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelCategoriaActionPerformed(evt);
            }
        });
        jMenu3.add(mnuRelCategoria);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Relatório de Produtos por Categoria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        mnuRelCategoria1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        mnuRelCategoria1.setText("Relatório Detalhes Venda");
        mnuRelCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelCategoria1ActionPerformed(evt);
            }
        });
        jMenu3.add(mnuRelCategoria1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEstadoActionPerformed
        try {
            FrmEstadosLista frm = new FrmEstadosLista();
            int[] s = getLocation(frm.getSize());

            frm.setLocation(s[0], s[1]);

            jDesktopPane1.add(frm);
            frm.setVisible(true);
            frm.moveToFront();
            frm.setSelected(true);

        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_mnuEstadoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            FrmCidadesLista frm = new FrmCidadesLista();
            int[] s = getLocation(frm.getSize());

            frm.setLocation(s[0], s[1]);

            jDesktopPane1.add(frm);
            frm.setVisible(true);
            frm.moveToFront();
            frm.setSelected(true);

        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuRelCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelCategoriaActionPerformed
        GerarRelatorio gr = new GerarRelatorio();
        InputStream arquivo = this.getClass().getResourceAsStream("/report/cliente_cidade_estado_.jasper");

        Map<String, Object> params = new HashMap<>();
        params.put("TITULO", "Relatório de Clientes por Cidade");
        params.put("SIGLA_FILTRO", "PR");

        DatabaseConnection conn = DatabaseConnection.getInstance();
        JasperViewer viewer;
        try {
            viewer = gr.gerarRelatorio(conn.getConnection(), params, arquivo);
            viewer.setVisible(true);
        } catch (JRException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao exiir o relatório", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mnuRelCategoriaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            FrmClientes frm = new FrmClientes();
            int[] s = getLocation(frm.getSize());

            frm.setLocation(s[0], s[1]);

            jDesktopPane1.add(frm);
            frm.setVisible(true);
            frm.moveToFront();
            frm.setSelected(true);

        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        GerarRelatorio gr = new GerarRelatorio();
        InputStream arquivo = this.getClass().getResourceAsStream("/report/2_produtoByCategoria.jasper");

        Map<String, Object> params = new HashMap<>();

        Image imagem = new ImageIcon(
                this.getClass().getResource("/br/edu/utfpr/pb/vicenzo_trabfinal/image/logo_utfpr1.jpg")
        ).getImage();

        Categoria c = categoriaController.buscar(1L);

        params.put("TITULO", "Relatório de Produtos por Categoria");

        params.put("LOGO_CLIENTE", imagem);
        params.put("IDCATEGORIA", c.getId());
        params.put("NOME_CATEGORIA", c.getDescricao());

        DatabaseConnection conn = DatabaseConnection.getInstance();
        JasperViewer viewer;
        try {
            viewer = gr.gerarRelatorio(conn.getConnection(), params, arquivo);
            viewer.setVisible(true);
        } catch (JRException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao exiir o relatório", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuRelCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelCategoria1ActionPerformed
        GerarRelatorio gr = new GerarRelatorio();
        InputStream arquivo = this.getClass().getResourceAsStream("/report/1_venda.jasper");

        Map<String, Object> params = new HashMap<>();

        Image imagem = new ImageIcon(
                this.getClass().getResource("/br/edu/utfpr/pb/vicenzo_trabfinal/image/logo_utfpr1.jpg")
        ).getImage();
        
        params.put("TITULO", "Relatório de Detalhes sobre Venda");
        params.put("SUBREPORT_DIR", this.getClass().getResource("/report/1_venda_sub.jasper").getPath().replace("%20", " "));
        params.put("LOGO", imagem);
        
        //PARAMETROS FILTRO CONSULTA
        params.put("ID_CLIENTE", 1L);
        params.put("DATA_INI", new GregorianCalendar(2018, Calendar.JANUARY, 1).getTime());
        params.put("DATA_FIM", new GregorianCalendar(2018, Calendar.DECEMBER, 31).getTime());
        
        

        DatabaseConnection conn = DatabaseConnection.getInstance();
        JasperViewer viewer;
        try {
            viewer = gr.gerarRelatorio(conn.getConnection(), params, arquivo);
            viewer.setVisible(true);
        } catch (JRException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao exiir o relatório", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mnuRelCategoria1ActionPerformed

    private int[] getLocation(Dimension formSize) {
        Dimension size = jDesktopPane1.getSize();

        int[] r = new int[2];
        r[0] = ((size.width - formSize.width) / 2);
        r[1] = ((size.height - formSize.height) / 2);
        return r;
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mnuEstado;
    private javax.swing.JMenuItem mnuRelCategoria;
    private javax.swing.JMenuItem mnuRelCategoria1;
    // End of variables declaration//GEN-END:variables
}
