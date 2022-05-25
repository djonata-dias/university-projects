package TipoPessoa;

import TipoUsuário.Pessoa;

public class Cliente extends Pessoa {

    private String usuario;
    private String senha;

    public boolean verificarSenha(String senhaInserida) {
        if (senhaInserida == senha) {
            System.out.println("Login efetuado com sucesso!");
            return true;
        } else {
            System.out.println("Senha incorreto!");
            return false;
        }
    }

    public Cliente(String usuario, String senha, String nome, String documento) {
        super(nome, documento);
        this.usuario = usuario;
        this.senha = senha;
    }

}
