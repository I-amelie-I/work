package helpers;

import pages.base.PageInstance;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.lang.RandomStringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by logovskoy on 12/3/2015.
 */
public class SystemHelper extends PageInstance {
    public static final String URL;
    public static final String BROWSER;
    public static String USERNAME;
    public static String PASSWORD;
    public static String TARGETCYCLE;
    public static String MAINWINDOWHANDLER;
    public static final int TIMEOUT;
    public static String GUIDUSER="";
    public static String CURRENTPAGE;
    public static Map<String,String> _inputdata;
    public static Map<String,String> firstValues = new HashMap<>();
    public static String PROJECTKEY;

    static {
        /**
         * Read GRSConfiguration.xml file
         */
        HashMap<String, String> ARPConfig = read();
        URL = ARPConfig.get("url");
        USERNAME = ARPConfig.get("login");
        PASSWORD = ARPConfig.get("password");
        BROWSER = ARPConfig.get("browser");
        TARGETCYCLE = ARPConfig.get("targetTestCycle");
        PROJECTKEY = ARPConfig.get("projectKey");
        TIMEOUT = 30;
    }

    public static String getGUIDUSER() {
        return _inputdata.get("GUID");
    }

    public static HashMap<String, String> read() {
        XMLConfiguration config = null;
        HashMap<String, String> map = new HashMap<>();
        try {
            config = new XMLConfiguration("ARP_Configuration.xml");
           // config.setExpressionEngine(new XPathExpressionEngine());
            map.put("url", config.getString("url"));
            map.put("backdoor", config.getString("//backdoor"));
            map.put("login", config.getString("login"));
            map.put("password", config.getString("password"));
            map.put("profile", config.getString("profile"));
            map.put("browser", config.getString("browser"));
            map.put("targetTestCycle", config.getString("targetTestCycle"));
            map.put("task", config.getString("task"));
            map.put("projectKey",config.getString("projectKey"));
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setImplicitlyWait(int timeout) {
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }



    public static void Reset_Values() {
        _inputdata = new HashMap<String,String>();
        _inputdata.put("GUID", ("П"+UUID.randomUUID().toString())); // Поставил "П" для того чтобы рандомное отчество начиналось с этой буквы, т.к. тест падает
        _inputdata.put("DATE", new Date().toString());
    }

    public static String GET_VALUE(String value) {
        if (!_inputdata.containsKey(value)) {
            if (value.contains("GUIDUSER")){
                GUIDUSER = String.valueOf("П")+UUID.randomUUID().toString();  // Поставил "П" для того чтобы рандомное отчество начиналось с этой буквы, т.к. тест падает если не совпадают инициалы
                _inputdata.put(value, GUIDUSER);
            }
                //else if(value.toLowerCase().contains("mail"))
                //   _inputdata.put(value,RandomStringUtils.randomAlphanumeric(10)+"@mail.com");
            else if (value.contains("RandMail"))
                _inputdata.put(value, RandomStringUtils.randomAlphanumeric(10) + "@mail.com");
            else if (value.contains("TagRand"))                                   // random value for tag
                _inputdata.put(value, RandomStringUtils.randomNumeric(10));
            else
                _inputdata.put(value, value);
        }
        return _inputdata.get(value);
    }

}
