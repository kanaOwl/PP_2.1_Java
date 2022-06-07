import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());
        Cat beanCatOne = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatOne.getName());
        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatTwo.getName());

        System.out.println(bean.equals(beanTwo));
        System.out.println(beanCatOne.equals(beanCatTwo));
    }
}