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
public class Especialista extends Graduacao{
    public String NomeEspecializacao;
    
    public Especialista(String NomeEspecializacao, String lattes) {
        super(lattes);
        this.NomeEspecializacao = NomeEspecializacao;
    }

    
    


    

    @Override
    public double ValorSalario(){
       return super.ValorSalario() *1.50;
    }
    
     
   







        
    
    
}
