public class llamada {
    double tiempoLlamada;
    double costoLlamada;
    double total;
    String numerofinal;

    String numeroinicial;

    public llamada(){
        tiempoLlamada=3.5;
        costoLlamada=0.10;
        total=tiempoLlamada*costoLlamada;
        numerofinal="0987654321";
        numeroinicial="1234567890";
    }

    public String getNumerofinal() {
        return numerofinal;
    }

    public void setNumerofinal(String numerofinal) {
        this.numerofinal = numerofinal;
    }

    public String getNumeroinicial() {
        return numeroinicial;
    }

    public void setNumeroinicial(String numeroinicial) {
        this.numeroinicial = numeroinicial;
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