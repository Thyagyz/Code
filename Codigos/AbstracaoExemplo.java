// Arquivo: AbstracaoExemplo.java

public class AbstracaoExemplo {
    public static void main(String[] args) {

        // Não podemos instanciar uma classe abstrata
        // FormaGeometrica forma = new FormaGeometrica(); // Isso dá erro

        // Podemos usar referências para classes concretas que estendem a abstrata
        FormaGeometrica circulo = new Circulo();
        circulo.desenhar();  // A classe filha fornece a implementação
    }
}

// Classe abstrata (modelo geral)
abstract class FormaGeometrica {
    
    // Método abstrato (sem corpo), a ser implementado nas subclasses
    abstract void desenhar();
}

// Subclasse que implementa o método abstrato
class Circulo extends FormaGeometrica {
    @Override
    void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}
