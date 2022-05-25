package TipoFuncionario;

import TipoPessoa.Funcionario;

public class Secretaria extends Funcionario {

    public double getSalario() {
        return salario;
    }

    public int getRamal() {
        return ramal;
    }

    public String getNome() {
        return getNome();
    }

    public String getDocumento() {
        return getDocumento();
    }

    public Secretaria(double salario, int ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
    }

}
