import beans.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConsole {
    private  static Logger LOG = LoggerFactory.getLogger(MainConsole.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        //Lesson1
        Calculator calculator = context.getBean("calculator", Calculator.class);
        System.out.println("FibonacciNumber(300)="+calculator.calculate(300));
        //Lesson2
        Person person = (Person) context.getBean("person");
        System.out.println(person);


        ((ClassPathXmlApplicationContext) context).close();
    }

}
