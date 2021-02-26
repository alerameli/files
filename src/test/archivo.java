import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class archivo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\areal\\Desktop\\chromedriver.exe");
        //Creacion de instancia del driver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com.mx/imghp?hl=es");
        WebElement uno=driver.findElement(By.className("BwoPOe")); //icono de camara
        uno.click();
        WebElement dos=driver.findElement(By.xpath("//*[@id=\"dRSWfb\"]/div/a")); //Pestaña
        dos.click();
        WebElement fileT=driver.findElement(By.id("awyMjb"));
        fileT.sendKeys("C:\\Users\\areal\\IdeaProjects\\ejercicio02\\src\\test\\file-to-upload.jpg");
    }
}
