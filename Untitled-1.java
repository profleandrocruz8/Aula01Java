// Definindo a classe "Pessoa"
class Pessoa {
    // Atributos da classe
    private String nome; // Atributo privado para encapsulamento
    private int idade;   // Atributo privado para encapsulamento
    
    // Método construtor da classe para inicializar os atributos
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Método getter para obter o nome da pessoa
    public String getNome() {
        return nome;
    }
    
    // Método getter para obter a idade da pessoa
    public int getIdade() {
        return idade;
    }
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa chamado "pessoa1"
        Pessoa pessoa1 = new Pessoa("João", 30);
        
        // Usando os métodos getters para obter e imprimir as informações da pessoa
        System.out.println("Nome: " + pessoa1.getNome()); // Obtém e imprime o nome da pessoa
        System.out.println("Idade: " + pessoa1.getIdade()); // Obtém e imprime a idade da pessoa
    }
}
