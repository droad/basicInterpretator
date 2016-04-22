
/**
 * Created by droad on 22.04.16.
 */
abstract public class Operator {
    String code;

    public Operator(String code) {
        this.code = code;
    }

    abstract public void exec(Interpreter inge);

}
