
package examen1_oliveriraheta;

import java.awt.Color;


public final class Racional extends Real {
    private int numerador,denominador;

    public Racional() {
        super();
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) throws Exception{
        if (denominador!=0) {
            this.denominador = denominador;
        }else{
            throw new Exception("EL DENOMINADOR NO PUEDE SER 0");
        }    
    }
    public Racional simpli(Racional ra) throws Exception{
        int deno = ra.getDenominador();
        int nume = ra.getNumerador();
        for (int i = 10; i > 1; i--) {
            if (nume%i==0 && deno%i==0) {
            ra.setDenominador(deno/i);
            ra.setNumerador(nume/i);
            }
        }
        return ra;
    }

    @Override
    public double valor(int a, int b) {
        return numerador/denominador;
    }
    
    
}
