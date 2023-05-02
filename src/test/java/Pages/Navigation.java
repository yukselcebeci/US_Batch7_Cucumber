package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods {

    public Navigation(){
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesBtn;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsButton;

    @FindBy(xpath = "(//span[text()=\"Setup\"])[2]")
    private WebElement entranceExamsSetupButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsInnerButton;

    public WebElement getEntranceExamsButton() {
        return entranceExamsButton;
    }

    public WebElement getEntranceExamsSetupButton() {
        return entranceExamsSetupButton;
    }

    public WebElement getEntranceExamsInnerButton() {
        return entranceExamsInnerButton;
    }




    public WebElement getFeesButton() {
        return feesButton;
    }

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement feesButton;

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getParameterBtn() {
        return parameterBtn;
    }

    public WebElement getCountriesBtn() {
        return countriesBtn;
    }
}