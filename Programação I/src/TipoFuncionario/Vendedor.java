package TipoFuncionario;

import TipoPessoa.Funcionario;

public class Vendedor extends Funcionario {

    double comissao;

    public double getSalario() {
        return salario;
    }

    public int getRamal() {
        return ramal;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double salarioMesComComiisao() {
        double salarioComissionado = this.salario * comissao;
        System.out.println(salarioComissionado);
        return salarioComissionado;
    }

    public Vendedor(double salario, int ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
    }

}
