
package Classes;

public class Gerente extends Empregado {
        private String nomeGerencia;
    
    public Gerente(String nome, String sexo, int idade, double salario, String matricula, String nomeGerencia) {
        super(nome, sexo, idade, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

  
    public String getNomeGerencia() {
        return nomeGerencia;
    }

    
    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
     @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nMatricula: " + getMatricula() +
            "\nNome da Gerencia: " + getNomeGerencia() + "\nValor do INSS: " + valorInss();
    }
}
