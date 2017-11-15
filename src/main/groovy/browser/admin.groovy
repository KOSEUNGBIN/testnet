package browser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import out.Outt

class admin {
    def admin_start( id , pw )
    {
        return {
            WebDriver webDriver = new FirefoxDriver()
            try {

                webDriver.get("http://admission.inha.ac.kr")
                webDriver.findElementsByCssSelector("img[alt='인하대학교']")
                Outt.out("http://admission.inha.ac.kr success\n")
            }catch (Exception e)
            {
                Outt.out("http://admission.inha.ac.kr fail\n")
            }finally {
                webDriver.quit()
            }
        }
    }
}
