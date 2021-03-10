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
public class SopaLetras {

    char[][] matriz;

    public SopaLetras(int tam) {
        matriz = new char[tam][tam];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '*';
            }
        }
    }

    //En caso de ser true el booleano sentido indicará que la palabra es en sentido natural
    public boolean colocarPalabraHorizontal(String palabra, Coordenada coor, boolean sentido) {
        //Debe comprobar si la palabra entra en la matriz.
        if (palabra.length() + coor.getY() >= matriz.length) {
            //System.out.println("NO se ha colocado la palabra");
            return false;
        } else {
            //Debe comprobar si la palabra choca con alguna otra.
            for (int i = 0; i < palabra.length(); i++) {
                if (matriz[coor.getX()][coor.getY() + i] != '*') {
                    //System.out.println("NO se ha colocado la palabra");
                    return false;
                }
            }

            //Cambiamos el sentido de la palabra en caso de ser necesario
            if (!sentido) {
                palabra = invertirPalabra(palabra);
            }

            for (int i = 0; i < palabra.length(); i++) {
                char[] letras = palabra.toCharArray();
                matriz[coor.getX()][coor.getY() + i] = letras[i];
            }
        }
        //System.out.println("Se ha colocado la palabra");
        return true;
    }

    //En caso de ser true el booleano sentido indicará que la palabra es en sentido natural
    public boolean colocarPalabraVertical(String palabra, Coordenada coor, boolean sentido) {
        //Debe comprobar si la palabra entra en la matriz.
        if (palabra.length() + coor.getX() >= matriz.length) {
            //System.out.println("NO se ha colocado la palabra");
            return false;
        } else {
            //Debe comprobar si la palabra choca con alguna otra.
            for (int i = 0; i < palabra.length(); i++) {
                if (matriz[coor.getX() + i][coor.getY()] != '*') {
                    //System.out.println("NO se ha colocado la palabra");
                    return false;
                }
            }

            //Cambiamos el sentido de la palabra en caso de ser necesario
            if (!sentido) {
                palabra = invertirPalabra(palabra);
            }

            for (int i = 0; i < palabra.length(); i++) {
                char[] letras = palabra.toCharArray();
                matriz[coor.getX() + i][coor.getY()] = letras[i];
            }
        }
        //System.out.println("Se ha colocado la palabra");
        return true;
    }

    private String invertirPalabra(String palabra){
        StringBuilder revertida = new StringBuilder(palabra);
        return revertida.reverse().toString();
    }

    @Override
    public String toString() {
        String impresion = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                impresion += matriz[i][j] + " ";
            }
            impresion += "\n";
        }
        impresion += "\n";

        return impresion;
    }

}
