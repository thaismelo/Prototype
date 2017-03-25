/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Thais
 */
public class PoodleClone extends Cachorro {
    
    

    @Override
    public String informacao() {
       return "Valor do cachorro:" + getValorCompra();
    }

    @Override
    public Cachorro clonar() {
        return new PoodleClone();
    }
    
}
