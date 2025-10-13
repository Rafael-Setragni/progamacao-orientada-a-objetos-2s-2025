public class Emprestimo {
    private Pessoa pessoa;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao) {
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("Data de empréstimo: " + dataEmprestimo);
        System.out.println("Data de devolução: " + dataDevolucao);
        System.out.println("--- Pessoa ---");
        pessoa.exibirInfo();
        System.out.println("--- Material ---");
        material.descricao();
    }
}