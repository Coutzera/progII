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
public class Mestrado extends Graduacao{
    public String AreaPesquisa;
    public Mestrado(String AreaPesquisa, String lattes) {
        super(lattes);
        this.AreaPesquisa = AreaPesquisa;
    }



    


    
    @Override
    public double ValorSalario(){
        return super.ValorSalario() * 1.90;
    
}
    
    
    
}
