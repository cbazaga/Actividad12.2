/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizgenerica;

/**
 *
 * @author jmas
 */
public enum TipoOperacion {
    SUMA, MULTIPLICACION, NADA;
    
    public String simboloOperacion() {
        switch(this) {
            case SUMA:
                return "+";
            case MULTIPLICACION:
                return "X";
            case NADA:
                return "";
            default:
                return null;
        }
    }
}
