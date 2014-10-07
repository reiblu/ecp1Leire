package operaciones;

public abstract class Operation {

    private int operador1;

    private int operador2;

    public Operation(int operador1, int operador2) {
        super();
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public int Getoperador1() {
        return this.operador1;
    }

    public int Getoperador2() {
        return this.operador2;
    }

    public abstract int operar();

}
