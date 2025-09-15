package sistema_calcula_IPTU;

public class Imovel {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;

    public Double calcularIPTU(){
        return this.areaM2 * this.municipio.getPrecoM2()*1.005;
    }
}
