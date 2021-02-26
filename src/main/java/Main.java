import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.ui.Select;



public class Main {
    /* Nombre en la pagina de pruebas
    public static void main(String[] args) {
        // driver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\areal\\Desktop\\chromedriver.exe");
        //Creacion de instancia del driver
        WebDriver driver=new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/keypress");
        WebElement element=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        element.sendKeys("Alejandro Ramirez");
        element.submit();
        driver.quit();
    }
    */
    //Ventanas y pestañas
    /*
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\areal\\Desktop\\chromedriver.exe");
        //Creacion de instancia del driver
        WebDriver driver=new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        WebElement newAlertButton= driver.findElement(By.id("alert-button"));
        newTabButton.click();
        newAlertButton.click();

        String originalHandel= driver.getWindowHandle();
        for (String handel: driver.getWindowHandles()){
            driver.switchTo().window(handel);
        }
        driver.switchTo().window(originalHandel);
        driver.switchTo().alert().accept();
        //driver.quit();
    }*/
    /*
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\areal\\Desktop\\chromedriver.exe");
        //Creacion de instancia del driver
        WebDriver driver=new ChromeDriver();
        driver.get("http://bibliotecas.uson.mx");
        WebElement autocomplete = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtBuscar"));
        autocomplete.sendKeys("Java");
        WebElement autocompleteResult=driver.findElement(By.className("rbDecorated"));
        autocompleteResult.click();
        //driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\areal\\Desktop\\chromedriver.exe");
        //Creacion de instancia del driver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.aa.com/homePage.do?locale=es_MX");
        WebElement radio=driver.findElement(By.xpath("//*[@id=\"flightSearchForm.tripType.oneWay\"]"));
        radio.click();
        WebElement autocomplete = driver.findElement(By.name("originAirport"));
        autocomplete.clear();
        autocomplete.sendKeys("Hermosillo");
        Thread.sleep(3000);
        WebElement autocompleteResult=driver.findElement(By.className("ui-helper-hidden-accessible"));
        autocompleteResult.click();

        //driver.quit();
        //ui-helper-hidden-accessible
        //aaAutoComplete ui-autocomplete-input
    }

    GOOGLE
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


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\areal\\Desktop\\chromedriver.exe");
        //Creacion de instancia del driver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.budlight.com");
        WebElement uno=driver.findElement(By.id("mnth")); //icono de camara
        uno.sendKeys("05");
        WebElement dos=driver.findElement(By.id("dy")); //icono de camara
        dos.sendKeys("06");
        WebElement tres=driver.findElement(By.id("yr")); //icono de camara
        tres.sendKeys("1999");
        WebElement go=driver.findElement(By.xpath("//*[@id=\"formDesktop\"]/div[2]/div/button"));
        go.click();
        Thread.sleep(1000);
        WebElement join=driver.findElement(By.id("home-masthead-carousel"));
        join.click();
        Thread.sleep(10000);
        WebElement correo=driver.findElement(By.className("email"));
        correo.sendKeys("rae.alejandro@gmail.com");
        WebElement contra=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        contra.sendKeys("are.06.05.99");
        WebElement nombre=driver.findElement(By.id("profile.fistName"));
        nombre.sendKeys("Alejandro");
        WebElement apellido=driver.findElement(By.id("profile.lastName"));
        apellido.sendKeys("Ramirez");
        WebElement mes=driver.findElement(By.name("profile.birthMonth")); //icono de camara
        mes.sendKeys("are.06.05.99");
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\areal\\Desktop\\chromedriver.exe");
        //Creacion de instancia del driver
        WebDriver driver = new ChromeDriver();
        driver.get("http://bibliotecas.uson.mx");
        driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtBuscar")).sendKeys("Java");
        driver.findElement(By.className("rbDecorated")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert =
                wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_lblResultados"))));
        String alertText = alert.getText();
        assertEquals("Búsqueda realizada: Titulo=Java\n" +
                "Registros encontrados: 117", alertText);
        //driver.quit();
    }

    ////////////////////////////////

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\areal\\Desktop\\chromedriver.exe");
        //Creacion de instancia del driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        submitForm(driver);
        waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!", getAlertBannerText(driver));
        driver.quit();
        //Check your email to verify your account
    }

    public static void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Alejandro");
        driver.findElement(By.id("last-name")).sendKeys("Ramirez");
        driver.findElement(By.id("job-title")).sendKeys("Supervisor de cajas");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='4']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("06/05/1999");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
    public static void waitForAlertBanner(WebDriver driver)
    {
        WebDriverWait wait= new WebDriverWait(driver, 10);
        WebElement alert= wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
    }
    public static String getAlertBannerText(WebDriver driver)
    {
        return driver.findElement(By.className("alert")).getText();
    }
    ////////////////////////////////////
    *////////////-----------AQUI EMPIEZA ESTA PRACTICA---------------------
    /*
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\areal\\Desktop\\chromedriver.exe");
        //Creacion de instancia del driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://universidaduvm.secure.force.com/calculadoraUVM");
        llenado(driver);
        waitForAlertBanner(driver);
        assertEquals("¿Qué promedio obtuviste en tu último grado de estudios?", getAlertBannerText(driver));
        driver.quit();
        //Check your email to verify your account
    }

    public static void llenado(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("firstname")).sendKeys("Alejandro");
        driver.findElement(By.id("lastname")).sendKeys("Ramirez");
        driver.findElement(By.id("apellido_materno__c")).sendKeys("Elizalde");
        driver.findElement(By.id("email_field")).sendKeys("are.alejandro@hotmail.com");
        driver.findElement(By.id("phone")).sendKeys("6624757126");
        driver.findElement(By.id("aviso_privacidad")).click();
        driver.findElement(By.id("comienzaCalcular")).click();
        Select nivel= new Select(driver.findElement(By.id("nivel_de_interes")));
        Select carrera= new Select(driver.findElement(By.id("selCarreras")));
        Select campus= new Select(driver.findElement(By.id("campus_interes")));
        Thread.sleep(1000);
        nivel.selectByValue("Licenciatura");
        Thread.sleep(1000);
        carrera.selectByValue("Ingenieria En Sistemas Computacionales");
        Thread.sleep(1000);
        campus.selectByValue("001o000000etAAyAAM");
        driver.findElement(By.id("pPromedio")).click();
    }
    public static void waitForAlertBanner(WebDriver driver) {
        WebDriverWait wait= new WebDriverWait(driver, 10);
        WebElement alert= wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"promedio\"]/div/div[2]/h3"))));
    }
    public static String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"promedio\"]/div/div[2]/h3")).getText();
    }
    -------------------AQUI TERMINA LA PRACTICA-----------------
*/

}
