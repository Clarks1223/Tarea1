public class Principal {
    public static void main(String[] args) {
        llamada llamada1=new llamada();
        System.out.println("Llamada numero 1");
        System.out.println("Tiempo de llamada: "+llamada1.getTiempoLlamada()+" minutos");
        System.out.println("Costo por minuto: "+(llamada1.getCostoLlamada()) + " ctvs");
        System.out.println("Total a pagar: "+ (llamada1.getTotal())+" ctvs");
    }
}