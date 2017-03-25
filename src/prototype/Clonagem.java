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
public class Clonagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PoodleClone poodleClone = new PoodleClone();
        
        Cachorro poodleFilhote =  poodleClone.clonar();
        poodleFilhote.setValorCompra(200);
        Cachorro poodleAdulto = poodleClone.clonar();
        poodleAdulto.setValorCompra(120);
        
        System.out.println(poodleFilhote.informacao());
        System.out.println(poodleAdulto.informacao());

    }
    
}
