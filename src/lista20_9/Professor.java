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
public abstract class Professor extends Funcionario{
    private String lattes;
    public Professor(String lattes) {
        this.lattes = lattes;
    }


    public abstract double ValorSalario();
           
}
        
     



