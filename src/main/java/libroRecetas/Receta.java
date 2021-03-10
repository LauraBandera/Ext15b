/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroRecetas;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author laura
 */
public class Receta {
    private Ingrediente[] ingredientes;
    private String nombre;
    private double min;

    public Receta(String nombre, double min, Ingrediente[] ingredientes) {
        this.nombre = nombre;
        this.min = min;
        this.ingredientes = ingredientes;
    }
    
    
    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Receta(Ingrediente[] ingredientes, String nombre, double min) {
        this.ingredientes = ingredientes;
        this.nombre = nombre;
        this.min = min;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMin() {
        return min;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }


	@Override
	public String toString() {
		return "Receta [ingredientes=" + Arrays.toString(ingredientes) + ", nombre=" + nombre + ", min=" + min + "]";
	}
    
    
}
