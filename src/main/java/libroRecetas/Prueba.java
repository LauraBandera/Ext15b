/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroRecetas;

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
        
        LibroRecetas libro = new LibroRecetas("liobro1");
        
        libro.aniadirReceta(new Receta("Macarrones", 40, 
                new Ingrediente[]{
                    new Ingrediente("Pasta", 250), 
                    new Ingrediente("Tomate", 120), 
                    new Ingrediente("Agua", 500), 
                    new Ingrediente("Agua", 500) }));
        libro.aniadirReceta(new Receta("Pizza", 35, 
                new Ingrediente[]{
                    new Ingrediente("BasePizza", 300), 
                    new Ingrediente("Tomate", 120), 
                    new Ingrediente("Queso", 30), 
                    new Ingrediente("Bacon", 500) }));
        libro.aniadirReceta(new Receta("Burger", 40, 
                new Ingrediente[]{
                    new Ingrediente("Pan", 130), 
                    new Ingrediente("Carne", 100),
                    new Ingrediente("Queso", 30),
                    new Ingrediente("Bacon", 500) }));
        libro.aniadirReceta(new Receta("Fish&Chips", 50, 
                new Ingrediente[]{
                    new Ingrediente("Pescado", 250), 
                    new Ingrediente("Harina", 200), 
                    new Ingrediente("Aceite", 330), 
                    new Ingrediente("Patatas", 500) }));
        
      //lista recetas con Tomate
        for(Receta recetaConTomate : libro.recetasIngrediente("Tomate")){
            System.out.println(recetaConTomate);
            System.out.println("---");
        }
        
        System.out.println("------------------------");
        
        //Muestra recetas ordenadas por tiempo y nombre
        for(Receta recetaOrdenada : libro.tiempoRecetas()) {
            System.out.println(recetaOrdenada);
            System.out.println("---");
        }

        
    }
    
}
