package browser

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import out.Outt

class inha {
     def inha_start( id , pw )
    {
        return {
            WebDriver webDriver = new FirefoxDriver()
            try {

                webDriver.get("http://www.inha.ac.kr")

                webDriver.findElement(By.linkText("로그인")).click()
                webDriver.findElement(By.id("userId")).sendKeys(id)
                webDriver.findElement(By.id("userPw")).sendKeys(pw)
                println webDriver.findElement(By.id("userId")).text
                webDriver.findElementByCssSelector("img[alt='로그인']").click()
                webDriver.findElementByLinkText("로그아웃").click()
                webDriver.switchTo().alert().accept()
                Outt.out( "http://www.inha.ac.kr success\n")
            }catch (Exception e)
            {
                Outt.out("http://www.inha.ac.kr fail\n")
            }finally {
                webDriver.quit()
            }
        }
    }
}
