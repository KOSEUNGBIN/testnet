package browser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import out.Outt

class job {

     def job_start( id , pw )
    {
        return {
            WebDriver webDriver = new FirefoxDriver()
            try {

                webDriver.get("https://job.inha.ac.kr")
                webDriver.findElementsByCssSelector("img[alt='인하대학교 취업진로지원팀']")
                Outt.out("https://job.inha.ac.krl success\n")
            }catch (Exception e)
            {
                Outt.out( "https://job.inha.ac.krl fail\n")
            }finally {
                webDriver.quit()
            }
        }
    }
}
