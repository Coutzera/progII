/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20_9;

/**
 *
 * @author Pedro
 */
public class Lista20_9 {

    /**
     * @param args the command line arguments
     */
    public static void Herança(String[] args) {
        // TODO code application logic here
        Especialista e = new Especialista("teste1", "teste");
        System.out.println( "Especialista:" + e.ValorSalario() + "|"+ e.NomeEspecializacao);
        Mestrado m = new Mestrado("Teste3", "teste4");
        System.out.println("Mestrado" + m.ValorSalario() + "|"+ m.AreaPesquisa );
        Doutorado d = new Doutorado(5, "teste5", "teste6");
        System.out.println("Doutorado" + d.ValorSalario() + "|"+ d.QtdOrientados);
        
        
        
    }
    
}
