package DesignPatterns_Observer;

/**
 *
 * @author raulrguez
 */
import java.util.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class ControlValor extends Thread {
    ValorObservable vo = null; //sujeto observable
    MarcadorObservador mo = null; //Push
    MarcadorObservadorPull po = null;
    
    // Constructor de la clase que nos permite crear los objetos de
    // observador y observable
    public ControlValor() {
        int puntos[] = {0,0};
        this.vo = new ValorObservable();
        this.mo = new MarcadorObservador( vo );
        this.po = new MarcadorObservadorPull( vo );

        vo.addObserver(mo);
    }
    
    @Override
    public void run(){
        Random rnd = new Random();
        int local = 0, visitante = 0, i = 0;
        ArrayList<Integer> vec = new ArrayList<Integer>();
        
        //po.start();
        while(true){
            local = rnd.nextInt(10 - 0);
            visitante = rnd.nextInt(10 - 0);
            
        try{
            Thread.sleep(1000);
        } catch(InterruptedException ex){
            // Logger.getLogger(ControlValor.class.getName());
        }
            vec.add(local);
            vec.add(visitante);
            this.vo.incrementarMarcador(vec);
            i++;
            
            if(i%5 == 0){
                po.preguntarDatos();
            }
        }
    }
    
    public static void main(String[] args){
        ControlValor co = new ControlValor();
        co.run();
    }
    
}
