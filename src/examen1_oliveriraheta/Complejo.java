
package examen1_oliveriraheta;



public class Complejo{
    private Imaginario imaginario;
    private Real real;

    public Complejo() {
    }

    public Complejo(Imaginario imaginario, Real real) {
        this.imaginario = imaginario;
        this.real = real;
    }

    public Imaginario getImaginario() {
        return imaginario;
    }

    public void setImaginario(Imaginario imaginario) {
        this.imaginario = imaginario;
    }

    public Real getReal() {
        return real;
    }

    public void setReal(Real real) {
        this.real = real;
    }
   
    public Complejo suma(Complejo a,Complejo b){

       //return new Complejo(a.getImaginario().getR()+b.getImaginario().getR(),);
    }

    
            
    
    
}
