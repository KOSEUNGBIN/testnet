package browser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import out.Outt

class email {
    def email_start( id , pw )
    {
        return {
            WebDriver webDriver = new FirefoxDriver()
            try {

                webDriver.get("https://email.inha.ac.kr")
                webDriver.findElementByName("username").sendKeys(id)
                webDriver.findElementByName("password").sendKeys(pw)
                webDriver.findElementByLinkText("LOGIN").click()

                webDriver.quit()
                Outt.out("https://email.inha.ac.kr success\n")
            }catch (Exception e)
            {
                Outt.out( "https://email.inha.ac.kr fail\n")
            }finally {
                webDriver.quit()
            }
        }
    }
}
