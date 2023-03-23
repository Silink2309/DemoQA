import elements.WebTables;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebTablesTest extends BaseTest {
    WebTables objWebTables = new WebTables(getDriver());
    @Before
    public void openTest(){
        openUrl(Url.urlWebTables);
    }
    @Test
    public void addUserTest(){
        objWebTables.addBodyTest("eee","aaa","sss","10","ss","sss");
    }
    @Test
    public void editTest(){
        objWebTables.editBodyTest("dd","dd","ss","23","fdfd","dfd");
    }
    @After
    public void quitDriver() {
        baseAfter(getDriver());
    }
}
