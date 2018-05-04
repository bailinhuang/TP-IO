import java.util.PriorityQueue;
import java.util.Random;

public class Sistema {

    public final int numero_servidores = 2;
    private int ocupabilidad;
    private int reloj;
    private int tamano_cola;
    private PriorityQueue<Evento> lista_eventos;
    private Evento evento;

    public Sistema(){
        ocupabilidad = 0;
        reloj = 0;
        tamano_cola = 0;
        lista_eventos = new PriorityQueue<Evento>();
        lista_eventos.add(new Evento(0,0,0));
    }

    public void procesar_entrada(){

        if (ocupabilidad == numero_servidores){
            tamano_cola++;
        } else{
            ocupabilidad++;
            //generar_salida();
        }
        //generar_entrada();
    }

    public void procesar_salida(){
        if (tamano_cola > 0){
            tamano_cola--;
            //generar_salida();
        } else{
            ocupabilidad--;
        }
    }

    public void procesar_evento(){
        
    }



    public void generar_entrada(){
        double random = obtener_numero_azar();
        evento = new Evento(0,random,reloj);
    }

    public void generar_salida(){
        double random = obtener_numero_azar();
        evento = new Evento(0,random,reloj);
    }

    public double obtener_numero_azar(){
        return Math.random();
    }
}
