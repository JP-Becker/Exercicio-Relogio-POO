package model;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Relogio() {
        this(0, 0, 0);
    }
    
    public Relogio (int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
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

    public int getTempoEmSegundos () {
        return ((getHora()*3600) + (getMinuto()*60) + getSegundo());
    }
    
    // incrementando segundo, se for maior que 59, segundos vira zero e adiciona um minuto no campo de minutos.
    public void incrementarSegundo () {
        segundo++;
        if (segundo == 60) {
            setSegundo(0);
            incrementarMinuto();
        }
    }
    
    // incrementando minuto, se for maior que 59, minutos vira zero e adiciona uma hora no campo de hora.
    public void incrementarMinuto () {
        minuto++;
        if (minuto == 60) {
            setMinuto(0);
            incrementarHora();
        }
    }
    
    // incrementando hora, se der 24 horas (meia-noite), hora vira zero.
    public void incrementarHora () {
        hora++;
        if (hora > 23) {
            setHora(0);
        }
    }
     
    public void decrementarSegundo () {
        segundo--;
        if (segundo <= 0) {
            setSegundo(59);
            decrementarMinuto();
        }
    }
    
    public void decrementarMinuto() {
        minuto--;
        if (minuto <= 0) {
            setMinuto(59);
            decrementarHora();
        }
    }
    
    public void decrementarHora() {
        hora--;
        if (hora <= 0) {
            setHora(23);
        }
    }
}
