
public class Main {
    public static void main(String[] args) {
                Pessoa pessoa1 = new Adulto("Kallyne");
                Pessoa pessoa2 = new Bebe("Tonin");

                pessoa1.respirar(); // Kallyne está respirando.
                pessoa1.dirigir(); // Kallyne está dirigindo.
                pessoa2.respirar(); // Tonin está respirando.
                pessoa2.dirigir(); // Tonin não pode dirigir, é um bebê!
    }
}


