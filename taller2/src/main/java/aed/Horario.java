package aed;

public class Horario {
    private int hora;
    private int minutos;


    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;
    }

    @Override
    public String toString() {
        if (this.minutos >= 0 && this.minutos <= 9) {
            this.minutos = 0 + this.minutos;
        }
        if (this.hora >= 0 && this.hora <= 9) {
            this.hora = 0 + this.hora;
        }
        return this.hora + ":" + this.minutos;
    }

    @Override
    public boolean equals(Object otro) {
        boolean otroEsNull = (otro == null);
        boolean claseDistinta = otro.getClass() != this.getClass();
    
        if (otroEsNull || claseDistinta) {
            return false; 
        }

        Horario otroH = (Horario) otro;
        return this.hora == otroH.hora && this.minutos == otroH.minutos;
    }

}
