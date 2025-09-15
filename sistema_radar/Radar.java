package sistema_radar;

public class Radar {
    private String localisacao;
    private Integer limiteVelocidade;

    public Radar(String localisacao, Integer limiteVelocidade){
        this.localisacao = localisacao;
        this.limiteVelocidade = limiteVelocidade;
    }

    //localizacao
    public String getLocalisacao(){
        return this.localisacao;
    }
    public void setLocalisacao(String localisacao){
        this.localisacao = localisacao;
    }

    //limitevelocidade
    public Integer getlimiteVelocidade(){
        return this.limiteVelocidade;
    }
    public void setlimiteVelocidade(Integer limiteVelocidade){
        this.limiteVelocidade = limiteVelocidade;
    }

    public void emitirNotificasao(String placa, Integer velocidadeObservada){
        System.out.println("placa: "+placa);
        System.out.println("velocidade observada: "+velocidadeObservada);
        System.out.println("localizacao"+ this.localisacao);
        System.out.println("velocidade da via: "+ this.limiteVelocidade);
    }

    public void avaliarVelocidade(Carro carro){
        if(carro.getVelocidade() > this.limiteVelocidade){
            emitirNotificasao(carro.getPalca(), carro.getVelocidade());
        }
    }
    
}
