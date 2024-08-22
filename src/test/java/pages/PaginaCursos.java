package pages;

public class PaginaCursos extends BasePage {

    private String fundamentosTestingLink = "//a[contains(.,'Fundamentos del Testing')]";

    

    public PaginaCursos() {
        super(driver); // llamar al constructor de mi padre y pasarle este webdriver como argumento
    }

    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);
    }
}
