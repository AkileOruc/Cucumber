package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("login linkine tiklar")
    public void login_linkine_tiklar() {
        qualitydemyPage.ilkLoginLinki.click();

    }

    @Then("username olarak {string} girer")
    public void username_olarak_girer(String kullaniciAdi) {
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(kullaniciAdi));

    }

    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));

    }

    @Then("login butonuna basar")
    public void login_butonuna_basar() {

    }

    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {

    }

    @Then("giris yapilamadigini test eder")
    public void basarili_olarak_giris_yapilamadigini_test_eder() {

    }

}










