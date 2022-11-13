public class llamada {
    double tiempoLlamada;
    double costoLlamada;
    double total;

    public llamada(){
        tiempoLlamada=3.5;
        costoLlamada=0.10;
        total=tiempoLlamada*costoLlamada;
    }

    public double getTiempoLlamada() {
        return tiempoLlamada;
    }

    public void setTiempoLlamada(double tiempoLlamada) {
        this.tiempoLlamada = tiempoLlamada;
    }

    public double getCostoLlamada() {
        return costoLlamada;
    }

    public void setCostoLlamada(double costoLlamada) {
        this.costoLlamada = costoLlamada;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void iniciarLlamada(){

    }
    public void terminarLlamada(){

    }
    public void pausarLlamada(){

    }

}