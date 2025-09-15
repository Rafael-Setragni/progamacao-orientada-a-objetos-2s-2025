package sistema_calcula_IPTU;

public class SecretariaFazenda {
    private String nome;
    private String estado;
    private String precoM2;


    public SecretariaFazenda(String nome, String estado, String precoM2) {
        this.nome = nome;
        this.estado = estado;
        this.precoM2 = precoM2;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrecoM2() {
        return this.precoM2;
    }

    public void setPrecoM2(String precoM2) {
        this.precoM2 = precoM2;
    }

}
