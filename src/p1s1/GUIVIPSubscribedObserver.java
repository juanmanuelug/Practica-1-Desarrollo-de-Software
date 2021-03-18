/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1s1;

import java.util.Observable;
import GUI.GUIVIPInterface;

/**
 *
 * @author jesus
 */
public class GUIVIPSubscribedObserver extends SubscribedObserver{
        
    public GUIVIPInterface interfaz;
    int periodo;
    
    public GUIVIPSubscribedObserver (Criptomoneda cripto, int periodo){
        super(cripto);
        this.periodo = periodo;
    }
    
    public void setValorObservable(double num){
        sujetoObservable.setValor(num);
    }
    
    public void setInterface(GUIVIPInterface interfaz){
        this.interfaz = interfaz;
    }
    
    @Override
    public void update(Observable o, Object obj) {
        interfaz.generarGrafica(periodo);
        System.out.println("GUIVIPSubscribed: Modificación notificada " + obj);
    } 
}
