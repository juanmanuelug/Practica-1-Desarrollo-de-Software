/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1s1;

import java.util.Observable;

import GUI.GUIInterface;
/**
 *
 * @author jesus
 */
public class GUISubscribedObserver extends SubscribedObserver{
    
    public GUIInterface interfaz;
    int periodo;
    
    public GUISubscribedObserver (Criptomoneda cripto, int periodo){
        super(cripto);
        this.periodo = periodo;
    }
    
    public void setInterface(GUIInterface interfaz){
        this.interfaz = interfaz;
    }
    
    @Override
    public void update(Observable o, Object obj) {
        interfaz.generarGrafica(periodo);
        System.out.println("GUISubscribed: Modificación notificada " + obj);
    }    
}
