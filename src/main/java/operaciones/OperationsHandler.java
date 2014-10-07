package operaciones;

public class OperationsHandler {

    private Operation [] operations;
    
    public OperationsHandler(){
        this.operations = new Operation[6];
    }
    
    public void addOperation(Operation operation){
        for (int i = 0; i < 6; i++) {
            if(operations[i]==null){
                operations[i]=operation;
            }
        }
    }
    
    public void reset(){
        for (int i = 0; i < 6; i++) {
           operations[i]=null; 
        }
        
    }
    
    public int total(){
        return 0;
    }
    
}
