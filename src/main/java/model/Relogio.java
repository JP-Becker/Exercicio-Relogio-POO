package model;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Relogio() {
        this(0, 0, 0);
    }
    
    public Relogio (int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.hora = segundo;
    }
    
    // HORA
    public int getHora() {
        return hora;
    }
    public void setHora (int hora) {
        this.hora = hora;
    }

    // MINUTO
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto (int minuto) {
        this.minuto = minuto;
    }

    // SEGUNDO
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo (int segundo) {
        this.segundo = segundo;
    }

    public int getTempoSegundos () {
        return ((getHora()*60*60) + (getMinuto()*60) + getSegundo());
    }
    
    public void incrementarSegundo () {
        if (segundo > 59) {
           segundo = 0;
           minuto++;
        }
    }
    
    public void incrementarMinuto () {
        if (minuto > 59) {
           minuto = 0;
           hora++;
        }
    }
    
     public void incrementarHora () {
        if (hora == 24) {
            hora = 0;
        }
    }
}
