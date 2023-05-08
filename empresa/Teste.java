
package empresa;

import Classes.Cliente;
import Classes.Gerente;
import Classes.Vendedor;





public class Teste {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Luisa", "Feminino", 29, 1994, 20000 );
        
        
        Gerente gerente = new Gerente("Olivia", "Feminino", 37, 6000, "1234", "Financeiro");
        
        Vendedor vendedor = new Vendedor("Marcos", "Masculino", 50, 2000,"002",10000, 50);
        
        System.out.println("Dados do Cliente: \n" + cliente.toString());
        System.out.println("------//------");
        System.out.println("Dados do gerente: \n" + gerente.toString());
        System.out.println("------//------");
        System.out.println("Dados do Vendedor: \n" + vendedor.toString());
        
        
        
    }
    
    
}
