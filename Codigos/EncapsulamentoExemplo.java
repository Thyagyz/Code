// Arquivo: EncapsulamentoExemplo.java

// Classe principal com o método main
public class EncapsulamentoExemplo {
    public static void main(String[] args) {

        // Criando um objeto da classe Conta
        Conta conta1 = new Conta();

        // Tentando acessar diretamente o atributo saldo (não é permitido pois é private)
        // conta1.saldo = 1000;  // Isso causaria erro!

        // Usando método set para definir o saldo
        conta1.setSaldo(1000.50);

        // Usando método get para acessar o saldo
        double valor = conta1.getSaldo();

        // Mostrando o valor no terminal
        System.out.println("Saldo da conta: R$ " + valor);
    }
}

// Classe Conta que encapsula o atributo saldo
class Conta {
    
    // Atributo privado (não pode ser acessado diretamente de fora da classe)
    private double saldo;

    // Método público para definir o saldo
    public void setSaldo(double valor) {
        // Só define saldo se o valor for positivo
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Valor inválido para saldo.");
        }
    }

    // Método público para retornar o saldo
    public double getSaldo() {
        return this.saldo;
    }
}
