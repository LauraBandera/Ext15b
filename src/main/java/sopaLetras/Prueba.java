/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopaLetras;

/**
 *
 * @author laura
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SopaLetras sl = new SopaLetras(10);
        Coordenada coor1 = new Coordenada(0,0);
        //Colocamos la palrba perro en invertido en horizontal a partir 
        //la coordenada 0,0
        sl.colocarPalabraHorizontal("perro", coor1, false);
        
        Coordenada coor2 = new Coordenada(0,3);
        //No colocamos la palabra poan en invertido en la coordenada 
        //0,3, porque choca con perro
        sl.colocarPalabraHorizontal("pan", coor2, true);
        
        //Tampoco se colocaría por salirse de la matriz
        coor2.setY(9);
        sl.colocarPalabraHorizontal("pan", coor2, true);
        
        coor2.setX(1);
        coor2.setY(0);
        sl.colocarPalabraHorizontal("pan", coor2, true);
        
        //Choca con pan
        Coordenada coor3 = new Coordenada(1,0);
        sl.colocarPalabraVertical("avion", coor3, false);
        
        coor3.setY(3);
         //Coloca la palabra avion en la vertical de manera inversa
         //a partir de la coordenada (1,1)
        sl.colocarPalabraVertical("avion", coor3, false);
        
        Coordenada coor4 = new Coordenada(2,3);
        //No la coloca porque choca con avion
        sl.colocarPalabraVertical("gato", coor4, true);
        
        //Tampoco se colocaría por salirse de la matriz
        coor4.setX(9);
        sl.colocarPalabraVertical("gato", coor4, true);
        
        coor4.setY(2);
        coor4.setX(2);
        sl.colocarPalabraVertical("gato", coor4, true);
        
        System.out.println(sl.toString());
    }
    
}
