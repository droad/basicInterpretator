import javax.script.ScriptException;

/**
 * Created by droad on 22.04.16.
 */
public class Print extends Operator {
    public Print(String code){
        super(code);
    }

    @Override
    public void exec(Interpreter inge) {
        Object res;
        try {
            res = Expression.eval(inge.getVars(), code);
            System.out.println(res);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        inge.next();

    }


}


