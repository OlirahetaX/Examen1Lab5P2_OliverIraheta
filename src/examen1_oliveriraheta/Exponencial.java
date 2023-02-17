package examen1_oliveriraheta;

import java.awt.Color;


public final class Exponencial extends Real {
    private int base,exponente;

    public Exponencial(int base, int exponente) throws Exception {
        super();
        this.base = base;
        setExponente(exponente);
    }

    public Exponencial() {
        super();
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente)throws Exception{
        if (exponente<=10) {
            this.exponente = exponente;
        }else  {
            throw new Exception("EL EXPONENTE NO PUEDE SER MAYOR A 10");
        }
    }
    
    public Exponencial mult(Exponencial a,Exponencial b) throws Exception{
        if (a.getBase()==b.getBase()) {
            return new Exponencial(a.getBase(), a.getExponente()+b.getExponente());
        }
        if (a.getExponente()==b.getExponente()) {
            return new Exponencial(a.getBase()*b.getBase(), a.getExponente());
        }
        return new Exponencial(base, exponente)
    }
    
    public Exponencial div(Exponencial a,Exponencial b) throws Exception{
        if (a.getBase()==b.getBase()) {
            return new Exponencial(a.getBase(), a.getExponente()-b.getExponente());
        }
        if (a.getExponente()==b.getExponente()) {
            return new Exponencial((a.getBase()/b.getBase()), a.getExponente());
        }
        
        return ;
    }

    @Override
    public double valor(int base,int exponente) {
        return Math.pow(base, exponente);
    }
}
