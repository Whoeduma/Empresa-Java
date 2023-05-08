
package Classes;

public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public Empregado(String nome, String sexo, int idade, double salario, String matricula) {
        super(nome, sexo, idade);
        this.salario = salario;
        this.matricula = matricula;
        
    }

   
    public double getSalario() {
        return salario;
    }

   
    public void setSalario(double salario) {
        this.salario = salario;
    }

  
    public String getMatricula() {
        return matricula;
    }

    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
     public double valorInss() {
        return salario * 0.11;
    }
     
    @Override 
    public String toString(){
        return super.toString() + "\nMatricula: " + matricula;
    }
    
}
