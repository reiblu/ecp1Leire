package operaciones;

public class Multiplication extends Operation {

    public Multiplication(int operador1, int operador2) {
        super(operador1, operador2);
    }

    @Override
    public int operar() {

        return this.getOperador1() * this.getOperador2();
    }

}
