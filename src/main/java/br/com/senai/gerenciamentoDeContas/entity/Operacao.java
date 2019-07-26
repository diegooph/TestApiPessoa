package br.com.senai.gerenciamentoDeContas.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Operacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Conta contaDestino;
    private Double valor;
    private Boolean acaoRealizada;
    private TipoOperacao tipoOperacao;

    public Operacao() {

    }

    public Operacao(Conta contaDestino, Double valor, TipoOperacao tipoOperacao) {
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.tipoOperacao = tipoOperacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean getAcaoRealizada() {
        return acaoRealizada;
    }

    public void setAcaoRealizada(Boolean acaoRealizada) {
        this.acaoRealizada = acaoRealizada;
    }

}
