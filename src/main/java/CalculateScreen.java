/**
 * Created by admin on 12/14/15.
 */

public class CalculateScreen {

    private Operation ops = new OpAdd();
    private Operation opsm = new opMyltiply();

    /*public static void main(String[] args){
        CalculateScreen calc = new CalculateScreen();
        calc.execute(args);
    }*/

    public void execute(String [] args){
        long op1 = Long.parseLong(args[0]);
        long op2 = Long.parseLong(args[1]);
        System.out.println("Result of " +op1 + ops.getOpsName()+ op2+" is " +ops.operate(op1,op2));
        System.out.println("Result of " +op1 + opsm.getOpsName()+ op2+" is " +opsm.operate(op1,op2));


    }
}
