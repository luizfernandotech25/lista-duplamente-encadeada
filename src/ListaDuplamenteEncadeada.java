
package listaduplamenteencadeada;

public class ListaDuplamenteEncadeada {

    No inicio;
    No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(String nome) {

        No novoNo = new No(nome);

        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
    }

    public void inserirInicio(String nome) {

        No novoNo = new No(nome);

        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.proximo = this.inicio;
            this.inicio.anterior = novoNo;
            this.inicio = novoNo;
        }
    }

    public void inserirPosicao(String nome, int posicao) {

        if (posicao <= 0) {
            inserirInicio(nome);
            return;
        }

        No atual = this.inicio;
        int i = 0;

        while (atual != null && i < posicao) {
            atual = atual.proximo;
            i++;
        }

        if (atual == null) {
            inserir(nome);
            return;
        }

        No novoNo = new No(nome);

        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;

        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;
    }

    public boolean removerInicio() {

        if (this.inicio == null) {
            return false;
        }

        this.inicio = this.inicio.proximo;

        if (this.inicio != null) {
            this.inicio.anterior = null;
        } else {
            this.fim = null;
        }

        return true;
    }

    public boolean removerFim() {

        if (this.fim == null) {
            return false;
        }

        this.fim = this.fim.anterior;

        if (this.fim != null) {
            this.fim.proximo = null;
        } else {
            this.inicio = null;
        }

        return true;
    }

    public boolean removerPosicao(int posicao) {

        if (posicao < 0 || this.inicio == null) {
            return false;
        }

        No atual = this.inicio;

        for (int i = 0; i < posicao && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null) {
            return false;
        }

        if (atual.anterior == null) {
            return removerInicio();
        }

        if (atual.proximo == null) {
            return removerFim();
        }

        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;

        return true;
    }

    public boolean contem(String nome) {

        No atual = this.inicio;

        while (atual != null) {
            if (atual.nome.equalsIgnoreCase(nome)) {
                return true;
            }

            atual = atual.proximo;
        }

        return false;
    }

    public int tamanho() {

        int contador = 0;
        No atual = this.inicio;

        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }

        return contador;
    }

    public void esvaziar() {
        this.inicio = null;
        this.fim = null;
    }

    public void exibir() {

        No atual = this.inicio;

        while (atual != null) {
            System.out.print(atual.nome + " <-> ");
            atual = atual.proximo;
        }

        System.out.println("null");
    }

    public void exibirInverso() {

        No atual = this.fim;

        while (atual != null) {
            System.out.print(atual.nome + " <-> ");
            atual = atual.anterior;
        }

        System.out.println("null");
    }
}
