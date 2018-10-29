package br.edu.utfpr.pb.vicenzo_trabfinal.view;

import br.edu.utfpr.pb.vicenzo_trabfinal.controller.CategoriaController;
import br.edu.utfpr.pb.vicenzo_trabfinal.db.DatabaseConnection;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Categoria;
import br.edu.utfpr.pb.vicenzo_trabfinal.model.Usuario;
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

public class FrmPrincipal extends javax.swing.JFrame {

    private final Timer timer;
    private final CategoriaController categoriaController;
    private final Usuario userOn;

    public FrmPrincipal(Usuario user) {
        initComponents();
        userOn = user;
        lblUser.setText(lblUser.getText() + user.getNome());
        
        timer = new Timer(1000, (ActionEvent e) -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            lblData.setText("Data: " + sdf.format(new Date()));
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

        jFrame1 = new javax.swing.JFrame();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnuEstado1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuRelCategoria2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuRelCategoria3 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuEstado = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuRelCategoria = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuRelCategoria1 = new javax.swing.JMenuItem();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Loja do Seu João Das Neve");
        jFrame1.setAutoRequestFocus(false);
        jFrame1.setResizable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jDesktopPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(0, 508, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu2.setText("Cadastro");

        mnuEstado1.setText("Estado");
        mnuEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEstado1ActionPerformed(evt);
            }
        });
        jMenu2.add(mnuEstado1);

        jMenuItem4.setText("Cidade");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar2.add(jMenu2);

        jMenu4.setText("Relatórios");

        mnuRelCategoria2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        mnuRelCategoria2.setText("Relatório Cliente por Cidade");
        mnuRelCategoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelCategoria2ActionPerformed(evt);
            }
        });
        jMenu4.add(mnuRelCategoria2);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Relatório de Produtos por Categoria");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        mnuRelCategoria3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        mnuRelCategoria3.setText("Relatório Detalhes Venda");
        mnuRelCategoria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelCategoria3ActionPerformed(evt);
            }
        });
        jMenu4.add(mnuRelCategoria3);

        jMenuBar2.add(jMenu4);

        jFrame1.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja do Seu João Das Neve");
        setAutoRequestFocus(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));

        lblData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblData.setText("Data:");

        lblUser.setBackground(new java.awt.Color(0, 204, 255));
        lblUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUser.setText("Usuário: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(247, 247, 247));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
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

    private void mnuEstado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEstado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuEstado1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnuRelCategoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelCategoria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuRelCategoria2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mnuRelCategoria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelCategoria3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuRelCategoria3ActionPerformed

    private int[] getLocation(Dimension formSize) {
        Dimension size = jDesktopPane1.getSize();

        int[] r = new int[2];
        r[0] = ((size.width - formSize.width) / 2);
        r[1] = ((size.height - formSize.height) / 2);
        return r;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuItem mnuEstado;
    private javax.swing.JMenuItem mnuEstado1;
    private javax.swing.JMenuItem mnuRelCategoria;
    private javax.swing.JMenuItem mnuRelCategoria1;
    private javax.swing.JMenuItem mnuRelCategoria2;
    private javax.swing.JMenuItem mnuRelCategoria3;
    // End of variables declaration//GEN-END:variables
}
