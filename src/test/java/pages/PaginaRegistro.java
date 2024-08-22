package pages;
 
import java.util.List;

public class PaginaRegistro extends BasePage {

 
    private String planDropdown = "//select[@id='cart_cart_item_attributes_plan_with_interval']";

    public PaginaRegistro() {
        super(driver); // llamar al constructor de mi padre y pasarle este webdriver como argumento
    }

    public List<String> returnPlanDropdownValues(){
        return getDropdownValues(planDropdown);
    }

}