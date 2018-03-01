/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jschool.gui;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import jschool.infraestrutura.ConexaoFactory;
import jschool.infraestrutura.Mensagem;
import jschool.modelo.entidade.Curso;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author andre
 */
public class JDRelatorioTurmasCurso extends javax.swing.JDialog {

    private Curso curso;
    
    /**
     * Creates new form JDRelatorioTurmasCurso
     */
    public JDRelatorioTurmasCurso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private void gerarRelatorio() throws JRException{
        // Compila o relatorio
        JasperReport relatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/jschool/relatorios/rel_turmas_curso.jrxml"));

        // Mapeia campos de parametros para o relatorio, mesmo que nao existam
        Map parametros = new HashMap();

        // adiciona parametros
        parametros.put("id_curso", this.curso.getId());
        parametros.put("nome_curso", this.curso.getNome());

        // Executa relatoio
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, ConexaoFactory.getConnection());

        // Exibe resultado em video
        JasperViewer.viewReport(impressao, false);
        
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtConfirmar2 = new javax.swing.JButton();
        jtfCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfCurso = new javax.swing.JTextField();
        jlPesquisarCurso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de turmas por curso");
        setResizable(false);

        jbtConfirmar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jschool/icons/add24.png"))); // NOI18N
        jbtConfirmar2.setText("Confirmar");
        jbtConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfirmar2ActionPerformed(evt);
            }
        });

        jtfCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jschool/icons/delete24.png"))); // NOI18N
        jtfCancelar.setText("Cancelar");
        jtfCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Curso");

        jtfCurso.setText("Procurar curso...");
        jtfCurso.setEnabled(false);

        jlPesquisarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jschool/icons/search16.png"))); // NOI18N
        jlPesquisarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlPesquisarCursoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Selecione um curso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jlPesquisarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtConfirmar2, jtfCancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPesquisarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtConfirmar2)
                    .addComponent(jtfCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtConfirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmar2ActionPerformed
        try {
            
            if(this.curso == null){
                Mensagem.aviso("Selecione um curso");
                return;
            }
            
            gerarRelatorio();
        } catch (JRException ex) {
            Mensagem.erro("Problema ao salvar professor: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbtConfirmar2ActionPerformed

    private void jtfCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jtfCancelarActionPerformed

    private void jlPesquisarCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPesquisarCursoMouseClicked

        try {

            JDLookUpCursos lookUpCursos = new JDLookUpCursos(null, true);
            lookUpCursos.setVisible(true);

            if(lookUpCursos.getSelecaoConfirmada()){
                this.curso = lookUpCursos.getCursoSelecionado();
                jtfCurso.setText(this.curso.getNome());
            }

        } catch (Exception e) {
            Mensagem.erro("Erro ao selecionar curso.");
        }

    }//GEN-LAST:event_jlPesquisarCursoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtConfirmar;
    private javax.swing.JButton jbtConfirmar1;
    private javax.swing.JButton jbtConfirmar2;
    private javax.swing.JLabel jlPesquisarCurso;
    private javax.swing.JButton jtfCancelar;
    private javax.swing.JTextField jtfCurso;
    // End of variables declaration//GEN-END:variables
}