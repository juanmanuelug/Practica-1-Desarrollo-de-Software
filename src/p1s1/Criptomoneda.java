/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1s1;

import java.util.Observable;
/**
 *
 * @author jesus
 */
public class Criptomoneda extends Observable{
    private double valor;
    private String nombre;
    private double valor_medio;
    private double disponible;
    
    public Criptomoneda(double valor, String nombre, double valor_medio, double disponible){
        this.valor = valor;
        this.nombre = nombre;
        this.valor_medio = valor_medio;
        this.disponible = disponible;        
    }
    public double getValor(){
        return valor;
    }
    protected void setValor(double valor){
        this.valor = valor;
        
        setChanged();
        notifyObservers(valor);
    }
}
