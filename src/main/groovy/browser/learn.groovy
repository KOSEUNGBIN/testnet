package browser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import out.Outt

class learn {
     def learn_start( id , pw )
    {
        return {
            WebDriver webDriver = new FirefoxDriver()
            try {

                webDriver.get("https://learn.inha.ac.kr")

                webDriver.findElementById("user_id").sendKeys(id)
                webDriver.findElementById("password").sendKeys(pw)
                webDriver.findElementByCssSelector("input[value='로그인']").click()
                webDriver.findElementByLinkText("로그아웃").click()
                Outt.out( "https://learn.inha.ac.kr success\n")
            }catch (Exception e)
            {
                Outt.out( "https://learn.inha.ac.kr fail\n")
            }finally {
                webDriver.quit()
            }
        }
    }
}
