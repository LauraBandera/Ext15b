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
public class Ingrediente {
    private String nombre;
    private double gramos;

    public Ingrediente(String nombre, double gramos) {
        this.nombre = nombre;
        this.gramos = gramos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getGramos() {
        return gramos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

	@Override
	public String toString() {
		return "Ingrediente [nombre=" + nombre + ", gramos=" + gramos + "]";
	}
    
    
}
