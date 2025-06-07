import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("travel_date")).click();
        List<WebElement> list=driver.findElements(By.className("day"));
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equalsIgnoreCase("23")) {
                System.out.println();
                list.get(i).click();
            }

        }
    }

}
