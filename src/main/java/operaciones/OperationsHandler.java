package operaciones;

public class OperationsHandler {

    private Operation [] operations;
    
    public OperationsHandler(){
        this.operations = new Operation[6];
    }
    
    public void addOperation(Operation operation){
        for (int i = 0; i < operations.length; i++) {
            if(operations[i]==null){
                operations[i]=operation;
            }
        }
    }
    
    public void reset(){
        for (int i = 0; i < operations.length; i++) {
           operations[i]=null; 
        }
        
    }
    
    public int total(){
        int result = 0;
        for (Operation operation : operations) {
            if(operation !=null){
             result += operation.operar();
            }
        }
        return result;
    }
    
}
