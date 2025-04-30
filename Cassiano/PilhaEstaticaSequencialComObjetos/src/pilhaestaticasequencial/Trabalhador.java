package pilhaestaticasequencial;

public class Trabalhador {
    private String nome;
    private float salario;
    private char sexo;

    public Trabalhador(String nome, float salario, char sexo) {
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salario: " + salario + ", Sexo: " + sexo ;
    }
}
