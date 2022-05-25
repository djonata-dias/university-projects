package filacaixa;

/**
 *
 * @author djonata
 */
class Senha {

    String tipo;
    int numero;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Senha() {
    }

    public Senha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return tipo + "-" + numero;
    }

}
