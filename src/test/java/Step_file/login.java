package Step_file;

import Runner_class.run;
import base.base_clas;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pom_file.Login_path;

public class login extends base_clas {
WebDriver driver = run.driver;
Login_path lp=new Login_path(driver);

    @Given("user launch dominos URL")
    public void user_launch_dominos_url() {
       Launchurl(driver, "https://pizzaonline.dominos.co.in/menu");
       maxview(driver);
    }


    @And("user click the pizza type")
    public void userClickThePizzaType() {
        click(lp.getPizzasizeblazingonion());
        click(lp.getLargesize());
        click(lp.getCrustblazingonion());
        click(lp.getCrusttype());
    }

    @And("user click add to cart")
    public void userClickAddToCart() throws InterruptedException {
        click(lp.getAddtocart());
        click(lp.getClickadd());
        slep(driver);
        for (int i=1; i<=5; i++){
            click(lp.getAddquantity());
        }
        click(lp.getAllowbutton());
        }

    @And("user click the beverages")
    public void userClickTheBeverages() throws InterruptedException {
       click(lp.getClickbeverages());
        click(lp.getAddbeverages());
        slep(driver);
        for (int i=1; i<=3; i++){
            click(lp.getAddbeverquantity());
        }
    }

    @And("user procced to checkout")
    public void userProccedToCheckout() throws InterruptedException {
        slep(driver);
        click(lp.getCheckout());
    }

    @And("user add the desserts")
    public void userAddTheDesserts() throws InterruptedException {
        slep(driver);
        click(lp.getRightarr());
        slep(driver);
        click(lp.getAddchocolava());


    }

    @And("user remove a pizza")
    public void userRemoveAPizza() throws InterruptedException {
        slep(driver);
//        click(lp.getRemoverpizza());
//        slep(driver);
//        click(lp.getRemoverpizza());
//slep(driver);
        //click(lp.getRemoverpizza());
        for(int i=0; i<=3; i++){
            click(lp.getRemoverpizza());
            slep(driver);
        }

    }
}
