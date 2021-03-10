package DesignPatterns_Observer;

/**
 *
 * @author raulrguez
 */
import java.util.*;

public class ControlValor extends Thread {
    ValorObservable vo = null;
    private MarcadorObservador mo = null;
    //private MarcadorObservadorPull po = null;
    
    // Constructor de la clase que nos permite crear los objetos de
    // observador y observable
    public ControlValor() {
        int puntos[] = {0,0};
        this.vo = new ValorObservable( puntos );
        this.mo = new MarcadorObservador( vo );
        //this.po = new MarcadorObservadorPull();

        vo.addObserver( mo );
    }
    
    public void run(){
        Random rnd = new Random();
        int local = 0, visitante = 0, i = 0;
        int vec[] = {0,0};
        
        while(true){
            local = rnd.nextInt(20 - 0);
            visitante = rnd.nextInt(20 - 0);
            
        try{
            Thread.sleep(100);
        } catch(InterruptedException ex){
            //Logger.getLogger(ControlValor.class.getName());
        }
            this.vo.setValor(vec);
            i++;
        }
    }
    
    public static void main(String[] args){
        ControlValor co = new ControlValor();
        co.run();
    }
    
}
