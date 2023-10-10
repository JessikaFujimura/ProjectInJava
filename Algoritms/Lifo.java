import java.util.Stack;

public class Lifo {

    public static void main(String[] args) {
        // Instancia a classe Stack
        Stack<String> tube = new Stack<>();

        // Verifica se a pilha está vazia
        tube.empty();

        // Empilha item na pilha
        tube.push("Vermelha");
        tube.push("Amarela");
        tube.push("Azul");
        tube.push("Verde");
        
        // Conta o número de itens na pilha
        tube.size();
        
        // Desempilha item na pilha 
        System.out.println(tube.pop());  // Retorna: Verde

        // Informa quem está no topo da pilha
        System.out.println(tube.peek()); // Retorna: Azul

        // Informa a posição que o item está na pilha
        System.out.println(tube.search("Azul")); // Retorna: 1

    }
    
}
