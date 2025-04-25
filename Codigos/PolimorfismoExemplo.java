// Arquivo: PolimorfismoExemplo.java

// Classe principal que contém o método main (ponto de entrada do programa)
public class PolimorfismoExemplo {
    public static void main(String[] args) {

        // Criando um objeto da classe Animal
        Animal meuAnimal = new Animal();

        // Criando um objeto da classe Cachorro, mas usando a referência do tipo Animal (polimorfismo)
        Animal meuCachorro = new Cachorro();

        // Criando um objeto da classe Gato, também com referência do tipo Animal (polimorfismo)
        Animal meuGato = new Gato();

        // Chamando o método fazerSom() para cada objeto
        // Aqui, será usado o método da classe Animal
        meuAnimal.fazerSom(); // Saída: O animal faz um som.

        // Aqui, será usado o método da classe Cachorro (sobrescrito)
        meuCachorro.fazerSom(); // Saída: O cachorro late.

        // Aqui, será usado o método da classe Gato (sobrescrito)
        meuGato.fazerSom(); // Saída: O gato mia.
    }
}

// Classe base (superclasse) chamada Animal
class Animal {
    // Método que será sobrescrito pelas subclasses
    void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse Cachorro que herda de Animal
class Cachorro extends Animal {
    // Sobrescreve o método fazerSom() com um comportamento específico
    @Override
    void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

// Subclasse Gato que também herda de Animal
class Gato extends Animal {
    // Sobrescreve o método fazerSom() com um comportamento específico
    @Override
    void fazerSom() {
        System.out.println("O gato mia.");
    }
}
