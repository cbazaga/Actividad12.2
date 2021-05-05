/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otras;

/**
 *
 * @author ciclost
 */
public class Fraccion extends Number{
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public Fraccion suma(Fraccion obj){
        return new Fraccion(this.numerador+obj.numerador, this.denominador+obj.denominador);
    }
    
    public Fraccion multiplica(Fraccion obj){
        return new Fraccion(this.numerador*obj.numerador, this.denominador*obj.denominador);
    }
    
    @Override
    public int intValue() {
        return numerador/denominador;
    }

    @Override
    public long longValue() {
        return (long)numerador/denominador;
    }

    @Override
    public float floatValue() {
        return (float)numerador/denominador;
    }

    @Override
    public double doubleValue() {
        return (double)numerador/denominador;
    }
    
}
