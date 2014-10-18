package vehiculos;

public class Coche extends Vehiculo {

    public enum Categoria {
        A, B, C
    }

    private Categoria categoria;

    public Coche(int id, String descripcion, Categoria categoria) {
        super(id, descripcion);
        this.categoria = categoria;
    }

    @Override
    public int calcularPrecio(int dias) {
        int precioBase;
        if (categoria == Categoria.A) {
            precioBase = 10;
        } else if (categoria == Categoria.B) {
            precioBase = 15;
        } else if (categoria == Categoria.C){
            precioBase = 20;
        } else {
            assert false;
            precioBase = 0;
        }
        
        if(dias<=3){
            return precioBase * dias;
        } else if (dias > 3 && dias <= 7){
            return (precioBase*3) + (((precioBase*80)/100)*(dias-3));
        } else if (dias > 7){
            return (precioBase*3) + (((precioBase*80)/100)*4) + (((precioBase*50)/100)*(dias-7));
        } else {
            assert false;
        }
        return -1;
    }

}
