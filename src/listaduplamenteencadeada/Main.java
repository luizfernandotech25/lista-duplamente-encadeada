
package listaduplamenteencadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada lista =
                new ListaDuplamenteEncadeada();

        System.out.println("\n=== TESTE 1 ===");
        lista.inserir("Homer");
        lista.inserir("Marge");
        lista.exibir();

        System.out.println("\n=== TESTE 2 ===");
        lista.esvaziar();
        lista.exibir();

        System.out.println("\n=== TESTE 3 ===");
        lista.inserir("Homer");
        lista.inserirPosicao("Bart", 0);
        lista.inserirPosicao("Moll", 1);
        lista.exibir();

        System.out.println("\n=== TESTE 4 ===");
        lista.esvaziar();
        lista.exibir();

        System.out.println("\n=== TESTE 5 ===");
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserirInicio("Lisa");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n=== TESTE 6 ===");
        lista.esvaziar();
        lista.exibir();

        System.out.println("\n=== TESTE 7 ===");
        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserirPosicao("Bart", 0);
        lista.inserirPosicao("Marge", 1);
        lista.exibir();
        System.out.println("Lisa está na lista? " + lista.contem("Lisa"));

        System.out.println("\n=== TESTE 8 ===");
        lista.esvaziar();

        System.out.println("\n=== TESTE 9 ===");
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n=== TESTE 10 ===");
        System.out.println("Marge: " + lista.contem("Marge"));
        System.out.println("Homer: " + lista.contem("Homer"));
        System.out.println("Bart: " + lista.contem("Bart"));
        System.out.println("Maggie: " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n=== TESTE 11 ===");
        lista.esvaziar();

        System.out.println("\n=== TESTE 12 ===");
        lista.inserirInicio("Bart");
        lista.inserirInicio("Homer");
        lista.inserir("Marge");
        lista.inserirPosicao("Maggie", 1);
        lista.inserirInicio("Ned Flanders");
        lista.inserir("Sr. Burns");
        lista.exibir();

        System.out.println("\n=== TESTE 13 ===");
        lista.removerFim();
        lista.exibir();

        System.out.println("\n=== TESTE 14 ===");
        lista.removerPosicao(1);
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n=== TESTE 15 ===");
        System.out.println("Marge: " + lista.contem("Marge"));
        System.out.println("Homer: " + lista.contem("Homer"));
        System.out.println("Bart: " + lista.contem("Bart"));
        System.out.println("Maggie: " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n=== TESTE 16 ===");
        lista.removerInicio();
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n=== TESTE 17 ===");
        System.out.println("Marge: " + lista.contem("Marge"));
        System.out.println("Homer: " + lista.contem("Homer"));
        System.out.println("Bart: " + lista.contem("Bart"));
        System.out.println("Maggie: " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n=== TESTE 18 ===");
        lista.esvaziar();
        lista.exibir();

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
