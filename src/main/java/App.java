import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catbean = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        System.out.println(catbean.getMessage_cat());
    }
}