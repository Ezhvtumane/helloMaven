/**
 * Created by admin on 12/14/15.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateSpring {
    private Operation ops;
    private ResultWriter wtr;
    public void setOps(Operation ops) {
        this.ops = ops;
    }

   /* public void setWriter(ResultWriter writer) {
        this.wtr = writer;
    }*/

    public void calculateSpring(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        BeanFactory factory = (BeanFactory) context;
        CalculateSpring calc =(CalculateSpring) factory.getBean("opsbean");
        calc.execute(args);
    }
    public void execute(String[] args) {
        long op1 = Long.parseLong("20");
        long op2 = Long.parseLong("5");
        wtr.showResult("The result of " + op1 + ops.getOpsName() + op2 + " is " + ops.operate(op1, op2) + "!");
    }
}
