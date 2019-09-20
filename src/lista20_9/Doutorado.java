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
public class Doutorado extends Mestrado{

    public Doutorado(int QtdOrientados, String AreaPesquisa, String lattes) {
        super(AreaPesquisa, lattes);
        this.QtdOrientados = QtdOrientados;
    }
    public int QtdOrientados;


    
    @Override
    public double ValorSalario(){
        return super.ValorSalario() * 1.35;
    
}
    
    
}
