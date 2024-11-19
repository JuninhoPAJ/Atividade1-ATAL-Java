public class Main {
    public static void main(String[] args) {
 
        Fila fila = new Fila(5);

        fila.adicionar(10);
        fila.adicionar(20);
        fila.adicionar(30);

        fila.exibirFila();

        System.out.println("Elemento removido: " + fila.remover());

        fila.exibirFila();

        System.out.println("Primeiro elemento: " + fila.frente());

        fila.adicionar(40);
        fila.adicionar(50);
        fila.adicionar(60); 
        
        fila.exibirFila(); 

        System.out.println("Fila cheia: " + fila.estaCheia());
    }
}
