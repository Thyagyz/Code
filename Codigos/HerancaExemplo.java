// Arquivo: HerancaExemplo.java

// Classe principal com o método main
public class HerancaExemplo {
    public static void main(String[] args) {

        // Criando um objeto da classe Cachorro (que herda de Animal)
        Cachorro meuCachorro = new Cachorro();

        // Definindo valores herdados da classe Animal
        meuCachorro.nome = "Rex";
        meuCachorro.idade = 5;

        // Chamando métodos herdados e específicos
        meuCachorro.fazerSom();  // Método herdado
        meuCachorro.abanarRabo();  // Método próprio da classe Cachorro
    }
}

// Classe base (superclasse)
class Animal {
    String nome;
    int idade;

    void fazerSom() {
        System.out.println(nome + " está fazendo um som genérico.");
    }

    public int getIdade() {
        return idade;
    }
}

// Classe derivada (subclasse) que herda de Animal
class Cachorro extends Animal {
    
    // Método exclusivo da subclasse
    void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }
}
