import browser.*
import out.Outt

class Testnet {

    static void main(String[] args) {

        final def id = args[0]
        final def pw = args[1]

        System.setProperty("webdriver.gecko.driver","/Users/koseungbin/Documents/chromedriver")

        try {
            Thread.start(new admin().admin_start(id, pw)).join()
            Thread.start(new email().email_start(id, pw)).join()
            Thread.start(new hip().hip_start(id, pw)).join()
            Thread.start(new inha().inha_start(id, pw)).join()
            Thread.start(new job().job_start(id, pw)).join()
            Thread.start(new learn().learn_start(id, pw)).join()
            Thread.start(new minha().minha_start(id, pw)).join()
            Thread.start(new portal().portal_start(id, pw)).join()
        }catch(Exception e) {
            Outt.out("TestNet Error!!")
        }

        Outt.out("TestNet Clear!!")

    }


}