import beans.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainConsole {
    private  static Logger LOG = LoggerFactory.getLogger(MainConsole.class);
    @Autowired
    private PersonService personService;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("beans");

        MainConsole main = context.getBean(MainConsole.class);
        System.out.println("Name = "+main.personService.getPersonName());


    }

}
