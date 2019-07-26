package br.com.senai.gerenciamentoDeContas.dto;

public class OperacaoDto {
    private String idContaEmissora;
    private Double valorAcao;
    private int codigoAcao;
    private String idContaReseptora;

    public String getIdContaEmissora() {
        return idContaEmissora;
    }

    public void setIdContaEmissora(String idContaEmissora) {
        this.idContaEmissora = idContaEmissora;
    }

    public Double getValorAcao() {
        return valorAcao;
    }

    public void setValorAcao(Double valorAcao) {
        this.valorAcao = valorAcao;
    }

    public int getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(int codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public String getIdContaReseptora() {
        return idContaReseptora;
    }

    public void setIdContaReseptora(String idContaReseptora) {
        this.idContaReseptora = idContaReseptora;
    }
}
