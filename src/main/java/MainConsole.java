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
        LOG.info(person.toString());
//        person.getAddress().getFlats().forEach(f -> System.out.println("Flat" + f));

//        CollectionBean cb = (CollectionBean) context.getBean("collectionBean");
//        LOG.info(cb.toString());
//
//        MapBean mb = (MapBean) context.getBean("mapBean");
//        LOG.info(mb.toString());
//
//        PropertiesBean pb = (PropertiesBean) context.getBean("propertiesBean");
//        LOG.info(pb.toString());
//
//        ConstructorBean conB = (ConstructorBean) context.getBean("constructorBean");
//        LOG.info(conB.toString());
//
//        CalcBean calcBean = (CalcBean) context.getBean("calcBean");
//        LOG.info(calcBean.toString());
//
//        Person personBean = (Person) context.getBean("personBean");
//        LOG.info(personBean.toString());
//
//        CollectionBean collectionBean = (CollectionBean) context.getBean("personsSelector");
//        LOG.info(collectionBean.toString());


        ((ClassPathXmlApplicationContext) context).close();
    }

}
