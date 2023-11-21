// Classe derivada Bebê
class Bebe extends Pessoa {
    Bebe(String nome) {
        super(nome);
    }

    // Precisamos sobrescrever o método dirigir
    @Override
    void dirigir() {
        System.out.println(nome + " não pode dirigir, é um bebê!");
    }
}


