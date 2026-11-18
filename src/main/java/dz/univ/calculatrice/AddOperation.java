
package dz.univ.calculatrice;

public class AddOperation implements Operation {

    @Override
    public double calculer(double a, double b) {
        return a + b;
    }

    @Override
    public String getSymbole() {
        return "+";
    }
}
