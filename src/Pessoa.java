// Classe base
class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    void respirar() {
        System.out.println(nome + " está respirando.");
    }

    // métodos de ações que todas as pessoas realizam...

    void dirigir() {
        System.out.println(nome + " está dirigindo.");
    }
}
