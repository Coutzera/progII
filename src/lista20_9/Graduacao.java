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
public class Graduacao extends Professor{

    public Graduacao(String lattes) {
        super(lattes);
    }
    
    @Override
    public double ValorSalario(){
        return 2000.0;
    
}
}
