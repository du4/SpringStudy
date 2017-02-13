import myAcpect.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConsole {
    private  static Logger LOG = LoggerFactory.getLogger(MainConsole.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        TaskService bean = (TaskService)context.getBean("taskService");
        bean.performJob("Spring");
        bean.performJob();
        bean.preformJobAround();

        try {
            bean.performExceptionJob();
        } catch (Exception e) {
            LOG.error(""+e);
        }

        ((ClassPathXmlApplicationContext) context).close();
    }

}
