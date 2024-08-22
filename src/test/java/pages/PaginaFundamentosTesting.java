package pages;

public class PaginaFundamentosTesting extends BasePage {

    private String fundamentosTestingLink = "//a[contains(.,'Introducción al Testing de Software')]";

    public PaginaFundamentosTesting() {
        super(driver); // llamar al constructor de mi padre y pasarle este webdriver como argumento
    }

    public void clickIntroduccionTestingLink() {
        clickElement(fundamentosTestingLink);
    }
}
