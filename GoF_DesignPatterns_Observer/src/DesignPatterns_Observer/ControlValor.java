package DesignPatterns_Observer;

/**
 *
 * @author raulrguez
 */
import java.util.*;
//import java.util.loggin.Level;
//import java.util.loggin.Logger;

public class ControlValor extends Thread {
    ValorObservable vo = null; //sujeto observable
    MarcadorObservador mo = null; //Push
    //private MarcadorObservadorPull po = null;
    
    // Constructor de la clase que nos permite crear los objetos de
    // observador y observable
    public ControlValor() {
        int puntos[] = {0,0};
        this.vo = new ValorObservable();
        this.mo = new MarcadorObservador( vo );
        //this.po = new MarcadorObservadorPull();

        vo.addObserver(mo);
    }
    
    @Override
    public void run(){
        Random rnd = new Random();
        int local = 0, visitante = 0, i = 0;
        ArrayList<Integer> vec = new ArrayList<Integer>();
        
        while(true){
            local = rnd.nextInt(10 - 0);
            visitante = rnd.nextInt(10 - 0);
            
        try{
            Thread.sleep(1000);
        } catch(InterruptedException ex){
            //Logger.getLogger(ControlValor.class.getName());
        }
            vec.add(local);
            vec.add(visitante);
            this.vo.incrementarMarcador(vec);
            i++;
        }
    }
    
    public static void main(String[] args){
        ControlValor co = new ControlValor();
        co.run();
    }
    
}
