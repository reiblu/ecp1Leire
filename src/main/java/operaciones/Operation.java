package operaciones;

public abstract class Operation {

    private int operador1;

    private int operador2;

    public Operation(int operador1, int operador2) {
        super();
        this.setOperador1(operador1);
        this.operador2 = operador2;
    }

    public int Getoperador1() {
        return this.getOperador1();
    }

    public int Getoperador2() {
        return this.operador2;
    }

    public abstract int operar();

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

}
