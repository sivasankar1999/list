package epam.custom_list;

import org.apache.logging.log4j.*;
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
        List<Integer> list = new List<Integer>();
        list.add(100);
        list.add(322);
        list.add(439);
        list.add(78);
        LOGGER.info(list);
        list.remove(2);
        LOGGER.info(list);
        LOGGER.info(list.get(0) );
        LOGGER.info(list.get(1) );
        LOGGER.info(list.size());
        List<String>list2=new List<>();
        list2.add("hi");
        list2.add("Hello");
        list2.add("Bye");
        list2.add("Come");
        LOGGER.info(list2);
        LOGGER.info(list.get(0));
        LOGGER.info(list2.size());
        list2.remove(2);
        LOGGER.info(list2);
    }
}
