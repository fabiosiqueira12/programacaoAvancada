/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Douglas
 */

@XStreamAlias("venda")
public class Venda implements Serializable{
    
    public static final String CODIGO = "codigo_";
    public static final String DATA = "data_";
    public static final String ITENSVENDA = "itensvenda_";
    public static final String FUNCIONARIO = "funcionario_";
    public static final String CLIENTE = "cliente_";
    public static final String VALORTOTAL = "valorTotal_";
    
    public static final String VISA = "VISA";
    public static final String MASTER = "MASTER";
    public static final String BOLETO = "BOLETO";
    
    
    
    
    private int codigo;
    private Date data = new Date();
    private ArrayList<ItensVenda>itensVenda = new ArrayList<>();
    private Funcionario funcionario;
    private Cliente cliente;
    private double valorTotal;
    private String tipoCartao;

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public static int getCodigoAutoIncremento() {
        return codigoAutoIncremento;
    }

    public static void setCodigoAutoIncremento(int codigoAutoIncremento) {
        Venda.codigoAutoIncremento = codigoAutoIncremento;
    }

   
    
    
    private static int codigoAutoIncremento = 1;
    
    
    public Venda(Funcionario funcionario,Cliente cliente) {
        this.codigo = codigoAutoIncremento++;
        this.funcionario = funcionario;
        this.cliente = cliente;
        
    }

    public void adicionarItemVenda(Produto produto, int quantidade) {
        ItensVenda itemProduto = new ItensVenda(quantidade, produto);        
        this.itensVenda.add(itemProduto);
        
        // atualizar a comissao / registro do funcionario
        double lucro = produto.getPrecoVenda() - produto.getPrecoCusto();
        funcionario.atualizarLucroDeVendas(lucro);
        funcionario.atualizarQuantideDeVendas(quantidade);
        
    }
    
    public static void setContador(int contadorAtual){
        Venda.codigoAutoIncremento = contadorAtual;
    }
    
    public ArrayList<ItensVenda> mostrarProdutosDaVenda() {
        
        System.out.println(toString());
        
        return itensVenda;
    } 

    /**
     * Como saber qual funcionário efetuou a venda?
     */
    @Override
    public String toString() {
        String dadosVenda = "#######################################";
        
        if(itensVenda.isEmpty()) {
            
            dadosVenda += "\n- NENHUM PRODUTO ADICIONADO AINDA -";
            dadosVenda += "\n#######################################";
            
            return dadosVenda;
        }
        
        dadosVenda += "\nCódigo: "+codigo;
        dadosVenda += "\nData: "+data.toString();
        dadosVenda += "\nFuncinário: "+funcionario.getNome();
        float totalCusto=0, totalVenda=0, totalLucro = 0;
        
        
        
        for (ItensVenda itemProduto : itensVenda) {
            
            double totalLucroDestesItens = 0;
            double totalVendaDestesItens = 0;
            double totalCustoDestesItens = 0;
            
            Produto produto = itemProduto.getProduto();
            int quantidade = itemProduto.getQuantidade();
            
           dadosVenda += "\n-----------------------";
           dadosVenda += "\nitens vendidos: "+quantidade;
           dadosVenda += "\n----------- Produtos vendidos -----------";
            
            dadosVenda += "\n"+produto;
            dadosVenda += "\n--";
                
            totalVendaDestesItens += produto.getPrecoVenda();
            totalCustoDestesItens += produto.getPrecoCusto();
            totalLucroDestesItens += (produto.getPrecoVenda()-produto.getPrecoCusto());
            
            
            totalVenda += totalVendaDestesItens * quantidade;
            totalCusto += totalCustoDestesItens * quantidade;
            totalLucro += totalLucroDestesItens * quantidade;
            
            dadosVenda += "\nvenda total destes itens: "+totalVendaDestesItens * quantidade;
            dadosVenda += "\ncusto total destes itens: "+totalCustoDestesItens * quantidade;
            dadosVenda += "\nlucro total destes itens: "+totalLucroDestesItens * quantidade;
            
            dadosVenda += "\n-----------------------";
        }
        
        dadosVenda += "\nTOTAL Venda: "+totalVenda;
        dadosVenda += "\nTOTAL Custo: "+totalCusto;
        dadosVenda += "\nTOTAL Lucro: "+totalLucro;
        dadosVenda += "\n#######################################";
        
        return dadosVenda;
    }
    
    public ArrayList<ItensVenda> getProdutos() {
        return itensVenda;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getData() {
        return data;
    }

    public ArrayList<ItensVenda> getItensVenda() {
        return itensVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
