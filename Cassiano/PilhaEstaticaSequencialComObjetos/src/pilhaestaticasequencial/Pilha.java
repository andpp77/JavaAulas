package pilhaestaticasequencial;

import java.util.ArrayList;

public class Pilha {
    private ArrayList<Trabalhador> pilha;

    public Pilha() {
        pilha = new ArrayList<>();
    }

    public void push(Trabalhador t) {
        pilha.add(t); // Adiciona um trabalhador ao topo da pilha
    }

    public Trabalhador pop() {
        if (!isEmpty()) {
            return pilha.remove(pilha.size() - 1); // Remove e retorna o trabalhador do topo da pilha
        }
        return null; // Retorna null se a pilha estiver vazia
    }

    public boolean isEmpty() {
        return pilha.isEmpty(); // Verifica se a pilha está vazia
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Trabalhador t : pilha) {
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}
