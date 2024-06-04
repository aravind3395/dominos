package pom_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_path {

    public static WebDriver driver;
public Login_path(WebDriver driver1){
this.driver=driver1;
    PageFactory.initElements(driver, this);
}

@FindBy (xpath = "(//div[@class=\"itm-dsc__actn__sz__dd-ttl\"])[1]")
    private WebElement pizzasizeblazingonion;

@FindBy (xpath = "(//span[@class=\"sz-dd-spn1\"])[1]")
   private WebElement largesize;

@FindBy (xpath = "(//div[@class=\"itm-dsc__actn__crst\"])[1]")
   private WebElement crustblazingonion;

@FindBy (xpath = "(//li[@class=\"itm-dsc__actn__sz__dd-mn__itm slctd\"])[1]")
    private WebElement crusttype;

@FindBy (xpath = "(//div[@class=\"injectStyles-sc-1jy9bcf-0 gwKvJy\"])[1]")
    private WebElement addquantity;

@FindBy (xpath = "//button[@data-label=\"No thanks button\"]")
private WebElement clickadd;

@FindBy (id = "optInText")
private WebElement allowbutton;

@FindBy (xpath = "(//div[@class=\"mn-hdr active\"])")
private WebElement clickbeverages;

@FindBy (xpath = "(//div[@class=\"injectStyles-sc-1jy9bcf-0 jrxrSi\"])[42]")
private WebElement addbeverages;

@FindBy (xpath = "(//div[@class=\"injectStyles-sc-1jy9bcf-0 gwKvJy\"])[6]")
private WebElement addbeverquantity;

@FindBy (xpath = "(//button[@data-label=\"miniCartCheckout\"])")
private WebElement checkout;

    public WebElement getCheckout() {
        return checkout;
    }

    public WebElement getRightarr() {
        return rightarr;
    }



    @FindBy (xpath = "(//img[@alt=\"Arrow Right\"])")
private WebElement rightarr;

@FindBy (xpath = "(//div[@class=\"upsell__add-cntnr\"])[6]")
private WebElement addchocolava;

    public WebElement getAddchocolava() {
        return addchocolava;
    }

    @FindBy (xpath = "(//div[@data-label='decrease'])[2]")
private WebElement removerpizza;

    public WebElement getRemoverpizza() {
        return removerpizza;
    }


    public WebElement getAddbeverquantity() {
        return addbeverquantity;
    }

    public WebElement getAddbeverages() {
        return addbeverages;
    }

    public WebElement getClickbeverages() {
        return clickbeverages;
    }

    public WebElement getAllowbutton() {
        return allowbutton;
    }

    public WebElement getClickadd() {
        return clickadd;
    }

    public WebElement getAddquantity() {
        return addquantity;
    }

    public WebElement getPizzasizeblazingonion() {
        return pizzasizeblazingonion;
    }

    public WebElement getLargesize() {
        return largesize;
    }

    public WebElement getCrustblazingonion() {
        return crustblazingonion;
    }

    public WebElement getCrusttype() {
        return crusttype;
    }

    public WebElement getAddtocart() {
        return addtocart;
    }

    @FindBy (xpath = "(//button[@data-label=\"addTocart\"])[1]")
    private WebElement addtocart;
}
