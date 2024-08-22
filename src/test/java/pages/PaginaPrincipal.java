package pages;

import java.util.List;

public class PaginaPrincipal extends BasePage {

    // private String sectionLink = "//a[normalize-space()='%s' and @href]";
    // private String sectionLink = "//a[text()='%s']";
    private String sectionLink = "//a[normalize-space()='%s' and @href]";

    private String elegirUnPlanButton = "//a[contains(text(),'Elegir Plan')]";

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");

    }

    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnElegirPlanButton() {
        clickElement(elegirUnPlanButton);
    }

}