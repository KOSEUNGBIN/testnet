package browser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import out.Outt

class portal {
     def portal_start( id , pw )
    {
        return {
            WebDriver webDriver = new FirefoxDriver()
            try {
                webDriver.get("https://portal.inha.ac.kr")
                webDriver.switchTo().frame("PortalMain")

                webDriver.findElementById("userId").sendKeys(id)
                webDriver.findElementById("passwd").sendKeys(pw)
                webDriver.findElementByCssSelector("input[onclick='doLogin()']").click()
                Outt.out( "https://portal.inha.ac.kr success\n")
            }catch (Exception e)
            {
                Outt.out("https://portal.inha.ac.kr fail\n")
            }
            finally {
                webDriver.quit()
            }
        }
    }
}
