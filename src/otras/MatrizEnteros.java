/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otras;
import matrizgenerica.MatrizException;
import matrizgenerica.MatrizGenerica;
import matrizgenerica.TipoOperacion;
import java.util.Random;
/**
 *
 * @author ciclost
 */
public class MatrizEnteros extends MatrizGenerica <Integer>{
    
    public MatrizEnteros(int numero) {
        super(numero);
    }
    

    @Override
    public void suma(Integer obj1, Integer obj2) throws MatrizException {
        if ((this.matriz.length != matriz.length)
                || (this.matriz[0].length != matriz[0].length)) {
            throw new MatrizException("Las matriz a sumar no es de tamaño " + this.matriz.length);
        }

        // Nuevo array que sustituirá al actual
        Integer[][] resultado = new Integer[this.matriz.length][this.matriz[0].length];

        // Realizar la suma
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = this.matriz[i][j] + matriz[i][j];
            }
        }

        // Almacenamiento de la información en los atributos de la clase
        this.matrizOpIzquierdo = this.matriz;
        this.matrizOpDerecho = matriz;
        this.matriz = resultado;
        this.tipoUltimaOperacion = TipoOperacion.SUMA;
    }
    

    

    @Override
    public void multiplicacion(Integer obj1, Integer obj2) throws MatrizException{
        // Comprobar las dimensiones de las matrices (número de columnas de la izqda igual al número de filas de la dcha)
        if (this.matriz[0].length != matriz.length) {
            throw new MatrizException(
                    "La matriz a multiplicar no tiene un tamaño compatible. Debe tener " + this.matriz[0].length + " filas");
        }

        // Nuevo array que sustituirá al actual
        Integer[][] resultado = new Integer[this.matriz.length][matriz[0].length];

        // Realizar la multiplicación
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = 0;

                for (int k = 0; k < this.matriz[0].length; k++) {
                    resultado[i][j] = resultado[i][j] + this.matriz[i][k] * matriz[k][j];
                }
            }
        }

        // Almacenamiento de la información en los atributos de la clase
        this.matrizOpIzquierdo = this.matriz;
        this.matrizOpDerecho = matriz;
        this.matriz = resultado;
        this.tipoUltimaOperacion = TipoOperacion.MULTIPLICACION;
    }

    @Override
    public void cero() {
        
    }

    @Override
    public void generarAleatorio() {
        Random random = new Random();
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                    this.matriz[i][j] = random.nextInt(9);
                }
        }
    }
    
}
