import browser.*
import out.Outt

class Testnet {

    // Todo: gem 적용, Page 구성
    static void main(String[] args) {

        final def id = args[0]
        final def pw = args[1]
        Thread t_admin, t_email, t_hip, t_inha, t_job, t_learn, t_minha, t_portal
        System.setProperty("webdriver.gecko.driver","/Users/koseungbin/Documents/chromedriver")

        try {
            t_admin = Thread.start(new admin().admin_start(id, pw))
            t_email = Thread.start(new email().email_start(id, pw))
            t_hip = Thread.start(new hip().hip_start(id, pw))
            t_inha = Thread.start(new inha().inha_start(id, pw))
            t_job = Thread.start(new job().job_start(id, pw))
            t_learn = Thread.start(new learn().learn_start(id, pw))
            t_minha = Thread.start(new minha().minha_start(id, pw))
            t_portal = Thread.start(new portal().portal_start(id, pw))

            t_admin.join()
            t_email.join()
            t_hip.join()
            t_inha.join()
            t_job.join()
            t_learn.join()
            t_minha.join()
            t_portal.join()

        }catch(Exception e) {
            Outt.out("TestNet Error!!")
        }

        Outt.out("TestNet Clear!!")

    }


}