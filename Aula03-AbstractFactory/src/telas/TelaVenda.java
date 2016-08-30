/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dados.Cliente;
import dados.Funcionario;
import dados.ItensVenda;
import dados.Produto;
import dados.Venda;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modulos.emissor.comunicador.abstractfactory_factorymethod.IComunicadorFactory;
import modulos.emissor.comunicador.abstractfactory_factorymethod.IEmissor;
import modulos.emissor.comunicador.abstractfactory_factorymethod.IReceptor;
import modulos.emissor.comunicador.abstractfactory_factorymethod.MastercardComunicadorFactory;
import modulos.emissor.comunicador.abstractfactory_factorymethod.VisaComunicadorFactory;
import repositorios.ListaItensVenda;
import repositorios.RepositorioPessoa;
import repositorios.RepositorioProduto;
import repositorios.RepositorioVenda;
import tabelas.ItensVendaTable;

/**
 *
 * @author fabio
 */
public class TelaVenda extends javax.swing.JFrame {

    //Modelo da tabela
    ItensVendaTable tabela;

    Venda venda;
    Produto produto;
    Cliente cliente;
    Funcionario funcionario;
    ItensVenda itemVenda;

    //Repositorios
    RepositorioPessoa repositorio;
    RepositorioProduto repositorioProduto;

    /**
     * Creates new form TelaVenda
     */
    public TelaVenda() {
        initComponents();
        tabela = new ItensVendaTable();
        this.jTable2.setModel(tabela);
        this.setLocationRelativeTo(null);
        this.jTNomeFunc.setEditable(false);
        this.jTNomeCliente.setEditable(false);
        this.JTNomePro.setEditable(false);
        this.jTPreco.setEditable(false);
        this.jTValorTotal.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTCodCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBBuscaClinte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTCodProduto = new javax.swing.JTextField();
        jBBuscaPro = new javax.swing.JButton();
        jBAdicionaPro = new javax.swing.JButton();
        JTNomePro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTQuant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JComboBandeira = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTNumCartao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTNumSegurança = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTValorTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jBLimparPed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTCodFunc = new javax.swing.JTextField();
        jBBuscaFunc = new javax.swing.JButton();
        jTNomeFunc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jBRemoveItem = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Código :");

        jBBuscaClinte.setText("Buscar");
        jBBuscaClinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaClinteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Cliente:");

        jLabel3.setText("Código Produto: ");

        jBBuscaPro.setText("Buscar");
        jBBuscaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaProActionPerformed(evt);
            }
        });

        jBAdicionaPro.setText("Adicionar");
        jBAdicionaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionaProActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço:");

        jLabel5.setText("Quantidade:");

        jLabel6.setText("Selecionar Bandeira :");

        JComboBandeira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "Master", "Boleto" }));
        JComboBandeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBandeiraActionPerformed(evt);
            }
        });

        jLabel7.setText("Número Do Cartão: ");

        jLabel8.setText("Número Segurança :");

        jLabel9.setText("Valor Total :");

        jLabel10.setText("Limpar Pedidos: ");

        jBLimparPed.setText("Limpar");
        jBLimparPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparPedActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Código Funcionário:");

        jBBuscaFunc.setText("Buscar");
        jBBuscaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaFuncActionPerformed(evt);
            }
        });

        jTNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeFuncActionPerformed(evt);
            }
        });

        jLabel12.setText("Nome Funcionário:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jBRemoveItem.setText("Remover");
        jBRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoveItemActionPerformed(evt);
            }
        });

        jLabel13.setText("Remover Item :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscaClinte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTNomeCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscaPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBLimparPed, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBAdicionaPro)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTNumCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTNumSegurança))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(JComboBandeira, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNomeFunc)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscaFunc)
                    .addComponent(jTNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBBuscaClinte)
                    .addComponent(jLabel2)
                    .addComponent(jTNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscaPro)
                    .addComponent(JTNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdicionaPro))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JComboBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTNumCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTNumSegurança, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jBLimparPed)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jBRemoveItem)
                        .addComponent(jButton1)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Sair da tela
        int opcao = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que quer cancelar a venda ?", "Cancelar", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();
            this.jTCodFunc.setEditable(true);
            this.jTCodCliente.setEditable(true);
            this.jBBuscaClinte.setEnabled(true);
            this.jBBuscaFunc.setEnabled(true);
            this.limpaTodosOsCampos();
            ListaItensVenda.limpaLista();
            tabela.atualizarTabela();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTNomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeFuncActionPerformed

    private void jBBuscaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaFuncActionPerformed
        //Busca Funcionário
        try {
            // Busca Funcionário
            repositorio = RepositorioPessoa.getInstancia();
        } catch (ParseException ex) {
            Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (repositorio.getFuncionarios().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Não Tem Funcionários Cadastrados ");
        } else {

            String valor = this.jTCodFunc.getText();

            if (valor == null) {
                JOptionPane.showMessageDialog(rootPane, "Digite o código");
            } else {
                int codigo = Integer.parseInt(valor);

                ArrayList<Funcionario> funcionarios = repositorio.getFuncionarios();
                boolean funcionarioValido = false;

                for (Funcionario funcionario : funcionarios) {

                    if (funcionario.getCodigo() == codigo) {

                        this.funcionario = funcionario;
                        funcionarioValido = true;

                        break;
                    }

                }

                if (funcionarioValido) {
                    this.jTCodFunc.setText("");
                    this.jTNomeFunc.setText(funcionario.getNome());
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Não tem funcionário com esse código");
                }

            }

        }

    }//GEN-LAST:event_jBBuscaFuncActionPerformed

    private void jBBuscaClinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaClinteActionPerformed
        // Busca Cliente
        try {
            // Busca Funcionário
            repositorio = RepositorioPessoa.getInstancia();
        } catch (ParseException ex) {
            Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (repositorio.getClientes().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Não Tem Clientes Cadastrados ");
        } else {

            String valor = this.jTCodCliente.getText();

            if (valor == null) {
                JOptionPane.showMessageDialog(rootPane, "Digite o código");
            } else {
                int codigo = Integer.parseInt(valor);

                ArrayList<Cliente> clientes = repositorio.getClientes();
                boolean clienteValido = false;

                for (Cliente cliente : clientes) {

                    if (cliente.getCodigo() == codigo) {

                        this.cliente = cliente;
                        clienteValido = true;

                        break;
                    }

                }

                if (clienteValido) {
                    this.jTCodCliente.setText("");
                    this.jTNomeCliente.setText(cliente.getNome());
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Não tem Cliente com esse código");
                }

            }

        }
    }//GEN-LAST:event_jBBuscaClinteActionPerformed

    private void jBBuscaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaProActionPerformed
        // Busca Produto

        repositorioProduto = RepositorioProduto.getInstancia();

        if (repositorioProduto.getProdutos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Não Tem Produtos Cadastrados ");
        } else {

            String valor = this.jTCodProduto.getText();

            if (valor == null) {
                JOptionPane.showMessageDialog(rootPane, "Digite o código");
            } else {
                int codigo = Integer.parseInt(valor);

                ArrayList<Produto> produtos = repositorioProduto.getProdutos();
                boolean produtoValido = false;

                for (Produto produto : produtos) {

                    if (produto.getCodigo() == codigo) {

                        this.produto = produto;
                        produtoValido = true;

                        break;
                    }

                }

                if (produtoValido) {
                    this.jTCodProduto.setText("");
                    this.JTNomePro.setText(this.produto.getNome());
                    this.jTPreco.setText(String.valueOf(this.produto.getPrecoVenda()));
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Não tem Produto com esse código");
                }

            }

        }

    }//GEN-LAST:event_jBBuscaProActionPerformed

    private void jBLimparPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparPedActionPerformed
        // LimpaPedidos
        if (this.jTable2.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Não tem Itens Para Remover");
        } else {
            
            int opcao = JOptionPane.showConfirmDialog(rootPane, "Tem Certeza que quer cancelar todos os itens ?", "Limpar", JOptionPane.YES_NO_OPTION);
            
            ListaItensVenda.limpaLista();
            tabela.atualizarTabela();
            this.jTCodFunc.setEditable(true);
            this.jTCodCliente.setEditable(true);
            this.jBBuscaClinte.setEnabled(true);
            this.jBBuscaFunc.setEnabled(true);
            this.setValorTotal();
            this.jTValorTotal.setText("");

        }

    }//GEN-LAST:event_jBLimparPedActionPerformed

    private void jBRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoveItemActionPerformed
        // Remove Item Da Lista

        if (ListaItensVenda.listaItensVenda.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Não tem Itens Para Remover");
        } else if (jTable2.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um item para remover");
        } else {

            ItensVenda itemRemover = tabela.getItemVenda(jTable2.getSelectedRow());
            ListaItensVenda.removeItem(itemRemover);
            tabela.atualizarTabela();
            this.setValorTotal();

            if (jTable2.getRowCount() == 0) {
                this.jTCodFunc.setEditable(true);
                this.jTCodCliente.setEditable(true);
                this.jBBuscaClinte.setEnabled(true);
                this.jBBuscaFunc.setEnabled(true);
            }
            
            

        }

    }//GEN-LAST:event_jBRemoveItemActionPerformed

    private void jBAdicionaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionaProActionPerformed
        // Adiciona Produto

        if (!"".equals(jTNomeFunc.getText()) && !"".equals(jTNomeCliente.getText()) && !"".equals(JTNomePro.getText())) {

            if (!"".equals(this.jTQuant.getText())) {
                
                itemVenda = new ItensVenda(Integer.parseInt(this.jTQuant.getText()), this.produto);
                ListaItensVenda.adicionaItem(itemVenda);
                tabela.atualizarTabela();
                this.setValorTotal();
                this.jTCodFunc.setEditable(false);
                this.jTCodCliente.setEditable(false);
                this.jBBuscaClinte.setEnabled(false);
                this.jBBuscaFunc.setEnabled(false);

                this.limpaCampoProduto();
            } else {
                JOptionPane.showMessageDialog(rootPane, "preencha o campo de quantidade");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos antes de continuar");
        }

    }//GEN-LAST:event_jBAdicionaProActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Botão salvar venda
        
        if ("".equals(jTNomeFunc.getText())){
                JOptionPane.showMessageDialog(rootPane, "Preencha O funcionário de Da Venda");
        } else {
            
            if ("".equals(jTNomeCliente.getText())){
                   JOptionPane.showMessageDialog(rootPane, "Preencha O Cliente de Da Venda");
            }else {
                
                if (ListaItensVenda.listaItensVenda.isEmpty()){
                 JOptionPane.showMessageDialog(rootPane, "Adicione Produtos Para Venda");
                 
             } else {
                 
                 if (this.JComboBandeira.getSelectedItem() == "Boleto"){
                     int opcao = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que quer finalizar a venda ? ", "Finalizar", JOptionPane.YES_NO_OPTION);
                     
                     if (opcao == JOptionPane.YES_OPTION){
                        //Inicia A Venda
                        this.preencheAVenda(Venda.BOLETO);
                        JOptionPane.showMessageDialog(rootPane, "Pagamento Feito \n"+"Venda Realizada com SUCESSO");
                        this.dispose();
                     
                     }
                     
                     
                     
                 } else if ((this.JComboBandeira.getSelectedItem() == "Visa" || this.JComboBandeira.getSelectedItem() == "Master") && jTNumCartao.getText().equals("")){
                     JOptionPane.showMessageDialog(rootPane, "Preencha o Campo De Número de cartão");
                     
                     
                     
                 } else {
                     
                     if ("".equals(this.jTNumSegurança.getText())){
                         JOptionPane.showMessageDialog(rootPane, "Preencha o Campo de Número de segurança");
                     } else {
                         //Inicia A Venda A Partir do cartão
                         if (this.JComboBandeira.getSelectedItem() == "Visa"){
                             //Venda Com Cartão 
                             
                             IComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
                             String transacao = "Valor= "+this.jTValorTotal.getText()+";Número Cartão= "+this.jTNumCartao.getText()
                                     +";Número segurança= "+this.jTNumSegurança;
                             
                             IEmissor emissor = comunicadorFactory.createEmissor(); 
                             emissor.envia(transacao);
                             
                             IReceptor receptor = comunicadorFactory.createReceptor();
                             String mensagem = receptor.recebe();
                             this.preencheAVenda(Venda.VISA);
                             JOptionPane.showMessageDialog(rootPane, mensagem+"\n"+"Venda Realizada com SUCESSO");
                             this.dispose();
                             
                            
                         } else if (this.JComboBandeira.getSelectedItem() == "Master"){
                             //Venda Com Cartão Master
                             
                             
                             IComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();
                             String transacao = "Valor= "+this.jTValorTotal.getText()+";Número Cartão= "+this.jTNumCartao.getText()
                                     +";Número segurança= "+this.jTNumSegurança;
                             
                             IEmissor emissor = comunicadorFactory.createEmissor(); 
                             emissor.envia(transacao);
                             
                             IReceptor receptor = comunicadorFactory.createReceptor();
                             String mensagem = receptor.recebe();
                             this.preencheAVenda(Venda.MASTER);
                             JOptionPane.showMessageDialog(rootPane, mensagem+"\n"+"Venda Realizada com SUCESSO");
                             this.dispose();
                             
                         }
                         
                     }
                     
                     
                     
                     
                     
                 }
                 
             }
                
            }
             
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JComboBandeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBandeiraActionPerformed
        // Testando ComboBox
        if (this.JComboBandeira.getSelectedItem() == "Boleto"){
            this.jTNumCartao.setEditable(false);
            this.jTNumSegurança.setEditable(false);
        } else {
           this.jTNumCartao.setEditable(true);
            this.jTNumSegurança.setEditable(true);
        }
       
    }//GEN-LAST:event_JComboBandeiraActionPerformed

    private void setValorTotal() {
        double valorTotal = ListaItensVenda.valorTotal();

        this.jTValorTotal.setText(String.valueOf(valorTotal));

    }

    private void limpaCampoProduto() {
        this.JTNomePro.setText("");
        this.jTPreco.setText("");
        this.jTQuant.setText("");

    }

    private void limpaTodosOsCampos() {
        this.JTNomePro.setText("");
        this.jTPreco.setText("");
        this.jTQuant.setText("");
        this.jTNomeCliente.setText("");
        this.jTNomeFunc.setText("");
        this.jTNumCartao.setText("");
        this.jTNumSegurança.setText("");
        this.jTValorTotal.setText("");

    }
    
    private void preencheAVenda(String tipoCartao){
        venda = new Venda(funcionario, cliente);
                        venda.setTipoCartao(tipoCartao);
                        ArrayList<ItensVenda> itens = ListaItensVenda.listaItensVenda;
                        for (ItensVenda iten : itens) {
                             venda.adicionarItemVenda(iten.getProduto(), iten.getQuantidade());
                        }
                        venda.setValorTotal(Double.parseDouble(jTValorTotal.getText()));
                     
                        RepositorioVenda repositorioVenda = RepositorioVenda.getInstancia();
                        repositorioVenda.adicionarVenda(venda);
                        repositorio.editarFuncionario(this.funcionario);
                        
    }

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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboBandeira;
    private javax.swing.JTextField JTNomePro;
    private javax.swing.JButton jBAdicionaPro;
    private javax.swing.JButton jBBuscaClinte;
    private javax.swing.JButton jBBuscaFunc;
    private javax.swing.JButton jBBuscaPro;
    private javax.swing.JButton jBLimparPed;
    private javax.swing.JButton jBRemoveItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCodCliente;
    private javax.swing.JTextField jTCodFunc;
    private javax.swing.JTextField jTCodProduto;
    private javax.swing.JTextField jTNomeCliente;
    private javax.swing.JTextField jTNomeFunc;
    private javax.swing.JTextField jTNumCartao;
    private javax.swing.JTextField jTNumSegurança;
    private javax.swing.JTextField jTPreco;
    private javax.swing.JTextField jTQuant;
    private javax.swing.JTextField jTValorTotal;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
