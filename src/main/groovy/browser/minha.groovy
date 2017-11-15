package browser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import out.Outt

class minha {
     def minha_start( id , pw )
    {
        return {
            WebDriver webDriver = new FirefoxDriver()
            try {

                webDriver.get("http://m.inha.ac.kr")
                webDriver.findElementByCssSelector("img[alt='Quick']").click()
                webDriver.findElementByLinkText("포털서비스").click()
                webDriver.findElementById("UserID").sendKeys(id)
                webDriver.findElementById("Password").sendKeys(pw)

                webDriver.findElementByCssSelector("input[title='로그인']").click()
                webDriver.findElementByLinkText("로그아웃").click()
                Outt.out("http://m.inha.ac.kr success\n")
            }catch (Exception e)
            {
                Outt.out("http://m.inha.ac.kr fail\n")
            }finally {
                webDriver.quit()
            }
        }
    }
}
