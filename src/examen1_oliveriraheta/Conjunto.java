
package examen1_oliveriraheta;

import java.awt.Color;
import java.util.ArrayList;

public class Conjunto {
    protected Color color;
    private ArrayList<Complejo> complejos = new ArrayList();

    public Conjunto() {
    }

    public ArrayList<Complejo> getComplejos() {
        return complejos;
    }

    public void setComplejos(ArrayList<Complejo> complejos) {
        this.complejos = complejos;
    }

    public Conjunto(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
  
 
}
