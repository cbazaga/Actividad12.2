/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizgenerica;

import java.util.Random;
import java.lang.Math;

/**
 *
 * @author jmas
 * @param <E>
 */
public abstract class MatrizGenerica<E extends Number> {

    // Matrices implicadas en la última operación realizada
    protected E[][] matrizOpIzquierdo;
    protected E[][] matrizOpDerecho;

    protected TipoOperacion tipoUltimaOperacion;

    // Matriz resultado
    protected E[][] matriz;

    public MatrizGenerica(int tamaño) {
        Random random = new Random();

        this.matriz = (E[][]) new Number[tamaño][tamaño];
        generarAleatorio();
        
        this.matrizOpIzquierdo = null;
        this.matrizOpDerecho = null;
        this.tipoUltimaOperacion = TipoOperacion.NADA;

    }

    public abstract void suma(E obj1, E obj2) throws MatrizException;
    public abstract void multiplicacion(E obj1, E obj2) throws MatrizException;
    public abstract void cero();
    public abstract void generarAleatorio();
}