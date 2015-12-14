/**
 * Created by admin on 12/14/15.
 */
public class opMyltiply implements Operation{

    public opMyltiply(){}

    public String getOpsName(){
        return " times ";
    }

    public long operate(long op1, long op2){
        return op1 * op2;
    }
}

