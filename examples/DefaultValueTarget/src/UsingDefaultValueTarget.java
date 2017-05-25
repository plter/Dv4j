import top.yunp.dv4j.DefaultValue;
import top.yunp.dv4j.DefaultValueObject;
import top.yunp.dv4j.IDefaultValueObject;

/**
 * Created by plter on 5/25/17.
 */
public class UsingDefaultValueTarget implements IDefaultValueObject {

    public static void main(String[] args) {
        new UsingDefaultValueTarget();
    }


    private DefaultValueObject dvo;

    public UsingDefaultValueTarget() {
        dvo = new DefaultValueObject(this);

        call("sayHello","XiaoMing");
    }

    @Override
    public Object call(String methodName, String... args) {
        return dvo.call(methodName, args);
    }

    public void sayHello(@DefaultValue(defaultValue = "XiaoHua") String name) {
        System.out.println("Hello " + name);
    }
}
