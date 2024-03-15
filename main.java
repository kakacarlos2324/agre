package java_poo.agregacao;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Av", "89638000", "Assis");
        Pessoa pessoa1 = new Pessoa("Carlos", 18, "10449601919", endereco1);

        pessoa1.falar("Hellow World!");
    }    
}