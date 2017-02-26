/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulos;

/**
 *
 * @author Arturo
 */
public class RectClass {
    
    private int largo;
    private int ancho;
    private int ejex;
    private int ejey;

    
    
    public RectClass (int x, int y, int anc, int lar) {
        ejex = x;
        ejey = y;
        largo = lar;
        ancho = anc;
    }

    /**
     * @return the largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @return the ejex
     */
    public int getEjex() {
        return ejex;
    }

    /**
     * @return the ejey
     */
    public int getEjey() {
        return ejey;
    }
    
}
