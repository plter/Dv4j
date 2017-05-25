import top.yunp.dv4j.DefaultValue;
import top.yunp.dv4j.DefaultValueObject;

/**
 * Created by plter on 5/25/17.
 */
public class UsingDefaultValue extends DefaultValueObject {


    public static void main(String[] args) {
        new UsingDefaultValue();
    }


    public UsingDefaultValue() {
        call("sayHello");
        call("sayHello", "ZhangSan");
        call("sayHello", "ZhangSan", "15");
    }

    public void sayHello(@DefaultValue(defaultValue = "XiaoMing") String name, @DefaultValue(defaultValue = "18") String age) {
        System.out.println("Hello " + name + ",and your age is " + age);
    }
}
