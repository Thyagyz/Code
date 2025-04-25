// Arquivo: ObjetoExemplo.java

// Declaração da classe principal com o mesmo nome do arquivo
public class ObjetoExemplo {

    // Método principal - ponto de entrada do programa Java
    public static void main(String[] args) {

        // Criando um objeto da classe Pessoa (instanciando a classe)
        Pessoa pessoa1 = new Pessoa();  // "new" cria um novo objeto

        // Atribuindo valores aos atributos do objeto
        pessoa1.nome = "Maria";
        pessoa1.idade = 30;

        // Chamando o método do objeto para realizar uma ação
        pessoa1.apresentar();  // Executa o método que imprime no console
    }
}

// Definição de uma classe chamada Pessoa
class Pessoa {
    
    // Atributos da classe: características de cada pessoa
    String nome;
    int idade;

    // Método da classe: comportamento de uma pessoa
    void apresentar() {
        // Imprime uma mensagem usando os atributos
        System.out.println("Olá! Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
