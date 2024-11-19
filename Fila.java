public class Fila {
    private int[] fila;
    private int tamanho;
    private int inicio;
    private int fim;
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new int[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public void adicionar(int elemento) {
        if (estaCheia()) {
            System.out.println("Fila cheia. Não é possível adicionar o elemento.");
        } else {
            fim = (fim + 1) % capacidade;
            fila[fim] = elemento;
            tamanho++;
        }
    }

    public int remover() {
        if (estaVazia()) {
            System.out.println("Fila vazia. Não é possível remover.");
            return -1;
        } else {
            int elementoRemovido = fila[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            return elementoRemovido;
        }
    }

    public int frente() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return -1;
        } else {
            return fila[inicio];
        }
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.print("Fila: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(fila[(inicio + i) % capacidade] + " ");
            }
            System.out.println();
        }
    }
}
