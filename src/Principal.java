import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat dcf=new DecimalFormat("0.00");
        llamada llamada1=new llamada();
        System.out.println("Llamada numero 1");
        System.out.println("Tiempo de llamada: "+llamada1.getTiempoLlamada()+" minutos");
        System.out.println("Costo por minuto: "+dcf.format(llamada1.getCostoLlamada()) + " ctvs");
        System.out.println("Total a pagar: "+ dcf.format(llamada1.getTotal())+" ctvs");
    }
}