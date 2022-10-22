package google;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    WebDriver driver;
    @Test

    public void  testeGoogle() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
       driver.findElement(By.name("q")).sendKeys("são paulo");
       Thread.sleep(Long.parseLong("2000"));
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span")).click();
       String texto = driver.findElement(By.xpath("//*[@id=\"sports-app\"]/div/div[1]/div/div/div[1]/div/div[2]/div[2]")).getText();
        Assert.assertEquals( "texto invalido","São Paulo Futebol Clube",texto);   //comparação do   String texto
    }
    @After   // o que eu preciso fazer depois
public void fecharBrowswe(){
        driver.quit();
//        fechar o  teste
}
}
