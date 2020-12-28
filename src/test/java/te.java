import org.testng.annotations.Test;
import web.Web;

public class te extends Web {
    @Test
    public void t() throws InterruptedException {
        flows.LOGIN_FLOWS.Login();
        navigationMenu.ServerAdmin().Users();

        Thread.sleep(5000);
        System.out.println("ffffff");
    }
}
