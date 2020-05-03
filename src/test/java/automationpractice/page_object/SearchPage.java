package automationpractice.page_object;

import automationpractice.driver.DriverHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends DriverHelper {
    public  SearchPage() {
        PageFactory.initElements(driver,this);
    }

     @FindBy(css = "input[class='search_query form-control ac_input']")
    private WebElement submitSearchField;

    @FindBy(className="lighter")
    private WebElement iteamName;

    @FindBy(css="input[id='search_query_top']")
    private WebElement searchedIteam;


  public void searchBox(String Text) {
      submitSearchField.sendKeys(Text);

    }
    public void submitSearch() {
      submitSearchField.sendKeys(Keys.ENTER);
    }

    public String assertSearchedText() {
     return iteamName.getText();

    }
    public String assertSearchedIteam(){
      return iteamName.getText();
    }

}
