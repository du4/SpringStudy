package beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Notifier {
    private static final Logger LOG = LoggerFactory.getLogger(Notifier.class);
    private static Long startTime = 0L;

    public Notifier() {
    }

    public void notifyBefore(){
        startTime =  System.currentTimeMillis();
        LOG.info("Notify Before");
    }

    public void notifyAfter(){
        LOG.info("NotifyAfter, duration=" + (System.currentTimeMillis() - startTime)+"ms");
    }
}
