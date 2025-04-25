// Arquivo: PolimorfismoComScanner.java

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

// Classe principal
public class PolimorfismoComScanner {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler entradas do teclado
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu para o usuário
        System.out.println("Escolha um animal:");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Pássaro");
        System.out.print("Digite o número correspondente: ");

        // Lê a opção digitada pelo usuário
        int opcao = scanner.nextInt();

        // Declara uma referência para a superclasse
        Animal animalEscolhido;

        // Usa polimorfismo para instanciar o tipo correto
        if (opcao == 1) {
            animalEscolhido = new Cachorro();
        } else if (opcao == 2) {
            animalEscolhido = new Gato();
        } else if (opcao == 3) {
            animalEscolhido = new Passaro();
        } else {
            // Se a opção for inválida, instancia um animal genérico
            animalEscolhido = new Animal();
        }

        // Executa o método que pode mudar conforme o tipo do objeto
        animalEscolhido.fazerSom();

        // Fecha o scanner (boa prática)
        scanner.close();
    }
}

// Classe base (superclasse)
class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

// Subclasse Cachorro sobrescreve o método
class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O cachorro late: au au!");
    }
}

// Subclasse Gato sobrescreve o método
class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O gato mia: miau!");
    }
}

// Subclasse Passaro sobrescreve o método
class Passaro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O pássaro canta: piu piu!");
    }
}
