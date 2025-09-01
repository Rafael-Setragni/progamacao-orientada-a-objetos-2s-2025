package sistema_radar;

public class Radar {
    public String localisacao;
    public Integer limiteVelocidade;

    public void emitirNotificasao(String placa, Integer velocidadeObservada){
        System.out.println("placa: "+placa);
        System.out.println("velocidade observada: "+velocidadeObservada);
        System.out.println("localizacao"+ this.localisacao);
        System.out.println("velocidade da via: "+ this.limiteVelocidade);
    }

    public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            emitirNotificasao(carro.placa, carro.velocidade);
        }
    }
    
}
