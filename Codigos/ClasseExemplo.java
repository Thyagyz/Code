// Arquivo: ClasseExemplo.java

// Classe principal que contém o método main
public class ClasseExemplo {

    // Método principal do programa
    public static void main(String[] args) {

        // Criando um objeto do tipo Carro
        Carro meuCarro = new Carro();  // "new" instancia a classe Carro

        // Atribuindo valores aos atributos do objeto
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2022;

        // Chamando o método do objeto para exibir as informações
        meuCarro.mostrarInformacoes();
    }
}

// Definindo a classe Carro (modelo para objetos)
class Carro {

    // Atributos da classe Carro
    String modelo;
    int ano;

    // Método da classe Carro
    void mostrarInformacoes() {
        // Exibe o conteúdo dos atributos no console
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
