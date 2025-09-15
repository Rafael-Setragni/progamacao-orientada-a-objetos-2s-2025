package atividade1;

public class Programa {
    private int memoriaRAMAlocada;
    private int SSDOcupado;
    private int nucleos;
    private int quantidadeOperacoes;

    public Programa(int memoriaRAMAlocada, int SSDOcupado, int nucleos, int quantidadeOperacoes) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public Integer getMemoriaRAMAlocada(){
        return this.memoriaRAMAlocada;
    }
    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada){
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public Integer getSSDOcupado(){
        return this.SSDOcupado;
    }
    public void setSSDOcupado(Integer SSDOcupado){
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getnNcleos(){
        return this.nucleos;
    }
    public void setNucleos(Integer nucleos){
        this.nucleos = nucleos;
    }

    public Integer getQuantidadeOperacoes(){
        return this.quantidadeOperacoes;
    }
    public void setQuantidadeOperacoes(Integer quantidadeOperacoes){
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}
