/**
 * Created by admin on 12/14/15.
 */
public class OpAdd implements Operation{

    public OpAdd() {
    }

    public String getOpsName() {
        return " plus ";
    }

    public long operate(long op1, long op2) {
        return op1 + op2;
    }
}
