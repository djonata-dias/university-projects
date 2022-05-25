/**
 *
 * @author Djonata de Souza Dias
 * @matricula 19116461-5
 * @curso SUPERIOR DE TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 */
package main;

import TipoPessoa.*;
import TipoFuncionario.*;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        ArrayList funcionariosCadastrados = new ArrayList();
        ArrayList<Cliente> clientesCadastrados = new ArrayList<Cliente>();

        Presidente ceo = new Presidente(20000, 8099, "Asdrubal Leôncio Correa", "873.572.130-80");
        funcionariosCadastrados.add(ceo);
        Secretaria secretariaFatima = new Secretaria(2000, 8084, "Fátima", "899.031.910-22");
        funcionariosCadastrados.add(secretariaFatima);
        Secretaria secretariaAna = new Secretaria(2000, 8084, "Ana", "139.569.730-20");
        funcionariosCadastrados.add(secretariaAna);
        Vendedor vendedorJoao = new Vendedor(1300, 8030, "João", "208.648.430-54");
        funcionariosCadastrados.add(vendedorJoao);
        Vendedor vendedorVanessa = new Vendedor(1300, 8031, "Vanessa", "591.287.510-51");
        funcionariosCadastrados.add(vendedorVanessa);
        Vendedor vendedorCarlos = new Vendedor(1300, 8032, "Carlos", "636.072.910-55");
        Cliente clienteMarcos = new Cliente("marcos", "@sda$15", "Marcos", "137.882.300-10");
        clientesCadastrados.add(clienteMarcos);
        Cliente clienteJoana = new Cliente("joana", "por%777S", "Joana", "679.892.740-86");
        clientesCadastrados.add(clienteJoana);
        Cliente clienteElisa = new Cliente("elisa", "Vu46dA2", "Elisa", "657.695.710-63");
        clientesCadastrados.add(clienteElisa);
        Cliente clienteLucas = new Cliente("lucas", "123456", "Lucas", "870.765.860-53");
        clientesCadastrados.add(clienteLucas);

        vendedorJoao.setComissao(1.15);
        vendedorVanessa.setComissao(1.11);
        vendedorCarlos.setComissao(1.23);

        ceo.calculaSalarioAnual();
        secretariaAna.calculaSalarioAnual();

        clienteLucas.verificarSenha("123456");
        clienteLucas.verificarSenha("segredo");
        clienteLucas.verificarSenha("teste");

        for (int i = 0; i < funcionariosCadastrados.size(); ++i) {
            Funcionario funcionario = (Funcionario) funcionariosCadastrados.get(i);
            funcionario.exibeDados();
        }
        for (int i = 0; i < clientesCadastrados.size(); ++i) {
            Cliente cliente = (Cliente) clientesCadastrados.get(i);
            cliente.exibeDados();
        }

    }

}
