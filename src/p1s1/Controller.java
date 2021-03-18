/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1s1;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Controller extends Thread implements Runnable{
    
    Criptomoneda cripto;
    public UnsubscribedObserver uo;
    public SubscribedObserver so;
    public VIPSubscribedObserver vso;
    public GUISubscribedObserver gso;
    public GUIVIPSubscribedObserver gvso;
    static final int PERIODO = 5000;
    
    public Controller(){
        cripto = new Criptomoneda(5, "bitcoin", 3.5, 200);
        so = new SubscribedObserver(cripto);
        uo = new UnsubscribedObserver(cripto);
        vso = new VIPSubscribedObserver(cripto);
        gso = new GUISubscribedObserver(cripto, PERIODO);
        gvso = new GUIVIPSubscribedObserver(cripto, PERIODO);
        
        cripto.addObserver(so);
        cripto.addObserver(vso);
        cripto.addObserver(gso);
        cripto.addObserver(gvso);
    }
    
    @Override
    public void run(){
        //for(int i = 0; i<5; i++){
        while(true){
            Random rand = new Random();
            double num = rand.nextDouble() * 10 + 2;
            cripto.setValor(num);
            
            try{
                Thread.sleep(PERIODO);
            } catch (InterruptedException e){
                //Fallo en el sleep
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller control = new Controller();
        new Thread(control.uo).start();
        new Thread(control).start();
    }
    
}
