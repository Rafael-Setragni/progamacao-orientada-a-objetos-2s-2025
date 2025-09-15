package atividade1;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 500, 4, 2.5f); // 16GB RAM, 500GB SSD, 4 núcleos, 2.5 ops/seg
        SistemaOperacional so = new SistemaOperacional(pc);

        Programa p1 = new Programa(8, 100, 2, 10000);   // deve rodar
        Programa p2 = new Programa(8, 600, 2, 10000);   // erro por SSD
        Programa p3 = new Programa(32, 100, 2, 10000);  // erro por RAM

        so.executarPrograma(p1);
        so.executarPrograma(p2);
        so.executarPrograma(p3);
    }
}
