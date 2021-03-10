package DesignPatterns_Observer;

/**
 *
 * @author raulrguez
 */
import java.util.ArrayList;
import java.util.Observer;
import java.util.Observable;


public class MarcadorObservador implements Observer {
    private int local;
    private int visitante;
    public ValorObservable vo = null;
    

    // Constructor en el que creamos una ventana donde poder introducir
    // el valor numerico que represente la cantidad que corresponda
    // al objeto observable
    public MarcadorObservador( ValorObservable o ) {
        this.vo = o;
    }

    // Actualizamos el valor del objeto que estamos observando en
    // nuestro campo de texto, para reflejar el valor actual del
    // objeto
    public void update( Observable obs, Object obj) {
        if( obs == vo ){
            ArrayList<Integer> marcador = (ArrayList<Integer>) obj;
            local = marcador.get(0);
            visitante = marcador.get(1);            
        }
        
        System.out.println("Observando con Push: "+local+" - "+visitante);
    }
}

