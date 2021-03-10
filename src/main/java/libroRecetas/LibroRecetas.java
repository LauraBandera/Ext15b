/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroRecetas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author laura
 */
public class LibroRecetas {

    private SortedMap<String, Receta> libro;
    private String nombreLibro;

    public LibroRecetas(String nomLibro) {
        this.nombreLibro = nomLibro;
        this.libro = new TreeMap<>();
    }

    public void aniadirReceta(Receta receta) {
        libro.put(receta.getNombre(), receta);
    }

    public void borrarReceta(Receta receta) {
        if (libro.containsKey(receta.getNombre())) {
            libro.remove(receta);
        }
    }

    public Receta obtenerReceta(String nombre) {
        if (libro.containsKey(nombre)) {
            Iterator<Entry<String, Receta>> it = libro.entrySet().iterator();

            while (it.hasNext()) {
                Entry<String, Receta> e = it.next();
                return e.getValue();
            }
        }
        return null;
    }

    //Obtener una lista con todos los nombres de las 
    //recetas contenidas en el libro.
    public ArrayList nombreRecetas() {
        ArrayList<String> nombres = new ArrayList();
        Iterator<Entry<String, Receta>> it = libro.entrySet().iterator();

        while (it.hasNext()) {
            Entry<String, Receta> e = it.next();
            nombres.add(e.getKey());
        }

        return nombres;
    }

    //Obtener una lista de todos los ingredientes de una 
    //receta ordenados alfabéticamente.
    public ArrayList ingredientesReceta(Receta receta) {
        ArrayList<Ingrediente> lista = new ArrayList();
        for(Ingrediente i : receta.getIngredientes()){
            lista.add(i);
        }
        ordenarIngredientes(lista);
        return lista;
    }
    

    private void ordenarIngredientes(ArrayList ingre) {
        Comparator<Ingrediente> criterio = (o1, o2) -> o1.getNombre().compareTo(o2.getNombre());
        Collections.sort(ingre, criterio);
    }

    //Obtener una lista de recetas ordenadas por tiempo 
    //de preparación y en caso de tiempos iguales que queden ordenadas por nombre.
    public ArrayList<Receta> tiempoRecetas() {
        ArrayList<Receta> lista = new ArrayList<>(libro.values());
        ordenarNombre(lista);
        ordenarTiempos(lista);
        return lista;
    }

    private void ordenarTiempos(ArrayList receta) {
        Comparator<Receta> criterio = (o1, o2) -> (int) (o1.getMin() - o2.getMin());
        Collections.sort(receta, criterio);
    }

    private void ordenarNombre(ArrayList receta) {
        Comparator<Receta> criterio = (o1, o2) -> o1.getNombre().compareTo(o2.getNombre());
        Collections.sort(receta, criterio);
    }

    //Obtener una lista con todas las recetas que 
    //contienen un ingrediente concreto, que se pasa por parámetro al método
    public ArrayList<Receta> recetasIngrediente(String ingre) {
        ArrayList<Receta> recetas = new ArrayList();
        Iterator<Entry<String, Receta>> it = libro.entrySet().iterator();

        while (it.hasNext()) {
            Entry<String, Receta> e = it.next();
            for(int i = 0; i < e.getValue().getIngredientes().length; i++){
                if(ingre.equals(e.getValue().getIngredientes()[i].getNombre())){
                    recetas.add(e.getValue());
                }
            }
        }

        return recetas;
    }

    public SortedMap<String, Receta> getLibro() {
        return libro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }
}
