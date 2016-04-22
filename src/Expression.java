import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Map;

/**
 * Created by droad on 22.04.16.
 */
public class Expression {

    public static Object eval(Map<String, Double> vars, String code) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("");
        return engine.eval(code);

    }
}
