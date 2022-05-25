package TipoUsuário;

public abstract class Pessoa {

    private String nome;
    private String documento;

    public void exibeDados() {
        System.out.println("Nome: " + nome + " ,CPF: " + documento + " ,Cargo: " + this.getClass().getSimpleName());

    }

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

}
