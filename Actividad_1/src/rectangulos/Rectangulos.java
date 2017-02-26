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
public class Rectangulos {

    public static void main(String[] args) {
        
        //RectClass rectangulos= new RectClass(ejex, ejey, ancho, largo);
        RectClass rectangulo1 = new RectClass(20,30,40,11);
        RectClass rectangulo2 = new RectClass(50,22,26,36);
        //Condiciones para la colision
        if (colisionan(rectangulo1, rectangulo2) == false ) {
            System.out.println("No hay colision");
        }
        else {
            System.out.println("Hay colision");
        }
    }

    /**
     * @param rect1
     * @param rect2
     * @return the rectangulo1
     */
    
    public static boolean colisionan(RectClass rect1, RectClass rect2) {
        //Comprobamos la colision en lo ancho de las imagenes
        if ((rect1.getEjex()+rect1.getAncho()> rect2.getEjex()) && (rect1.getEjex() < rect2.getEjex()+rect2.getAncho())) {
            //En caso de que si, comprobamos colision en lo largo, y en caso de cumplise los dos ifs, hay colision
            if ((rect1.getEjey()+rect1.getLargo()> rect2.getEjey()) && (rect1.getEjey() < rect2.getEjey()+rect2.getLargo())) {
                return true;
            }      
        }
        return false;
    }
    
}
