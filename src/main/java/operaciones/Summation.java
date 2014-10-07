package operaciones;

public class Summation extends Operation {

    public Summation(int operador1, int operador2) {
        super(operador1, operador2);
    }

    @Override
    public int operar() {
        
        return this.getOperador1()+this.getOperador2();
    }

}
