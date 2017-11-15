package browser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import out.Outt

class hip {
     def hip_start( id , pw )
    {
        return {
            WebDriver webDriver = new FirefoxDriver()
            try {

                webDriver.get("http://hip.inha.ac.kr")
                webDriver.findElementsByCssSelector("img[src='img/home_title.gif']")
                Outt.out("http://hip.inha.ac.kr success\n")
            }catch (Exception e)
            {
                Outt.out("http://hip.inha.ac.kr fail\n")
            }finally {
                webDriver.quit()
            }
        }
    }

}
