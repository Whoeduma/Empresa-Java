
package Classes;

public class Vendedor extends Empregado {
        private double valorVendas;
        private int qntVendas;

    public Vendedor(String nome, String sexo, int idade, double salario, String matricula, double valorVendas, int qntVendas) {
        super(nome, sexo, idade, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;

    }

    /**
     * @return the valorVendas
     */
    public double getValorVendas() {
        return valorVendas;
    }

    /**
     * @param valorVendas the valorVendas to set
     */
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    /**
     * @return the qntVendas
     */
    public int getQntVendas() {
        return qntVendas;
    }

    /**
     * @param qntVendas the qntVendas to set
     */
    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nSalario: " + getSalario() +
            "\nValor das Vendas: " + getValorVendas() + "\nQuantidade de Vendas: " + getQntVendas();
    }
}

    
        
