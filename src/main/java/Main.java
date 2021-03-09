import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        var date = new DateThings();
        ManagementFactory.getPlatformMBeanServer().registerMBean(
                date, new ObjectName("jmxtest:type=Test"));
        System.out.println("Делаю ничего, но в бесконечном цикле");
        while(true){

        }
    }
}
