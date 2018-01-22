package java_nine.test;


import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private final static Logger LOG = Logger.getLogger(Main.class.getName());
    //private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    //

    public static void main(String[] args) {
        try{
            System.out.println(System.getProperties());

            while(1==1){
                System.out.println("date: "+new Date());
                Thread.sleep(1000);
            }

        }catch(Throwable t){
            //LOG.(t.getMessage(),t);
            LOG.log(Level.SEVERE, t.getMessage(), t);
        }
    }
}
