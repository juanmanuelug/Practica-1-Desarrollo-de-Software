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
public class UnsubscribedObserver extends ConcreteObserver implements Runnable{
    
    private double valorObservable;

    
    public UnsubscribedObserver(Criptomoneda cripto) {
        super(cripto);
        valorObservable = sujetoObservable.getValor();
    }

    @Override
    public void update(Observable o, Object obj) {
        super.update(o, obj);
        System.out.println("Unsubscribed: Modificación notificada " + valorObservable);
    }
    
    @Override
    public void run(){
        while(true){
            double nuevo = sujetoObservable.getValor();
            if(nuevo != valorObservable){
                valorObservable = nuevo;
                this.update(null, null);
            }

            try{
                Thread.sleep(1500);
            } catch (InterruptedException e){
                //Fallo en el sleep
            }
        }
    }
}