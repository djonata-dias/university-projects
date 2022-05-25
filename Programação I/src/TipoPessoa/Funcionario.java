package TipoPessoa;

import TipoUsuário.Pessoa;
import TipoPessoa.Cliente;

public abstract class Funcionario extends Pessoa {

    protected double salario;
    protected int ramal;

    public double calculaSalarioAnual() {
        double salarioAnual = salario * 13;
        System.out.println(salarioAnual);
        return salarioAnual;
    }

    public double getSalario() {
        return salario;
    }

    public int getRamal() {
        return ramal;
    }

    public Funcionario(double salario, int ramal, String nome, String documento) {
        super(nome, documento);
        this.salario = salario;
        this.ramal = ramal;
    }

    

}
