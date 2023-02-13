package com.nttdata.steps;

import com.nttdata.page.CartPage;
import com.nttdata.page.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartSteps {

    private WebDriver driver;

    public CartSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Retorna la cantidad de items
     * @return la cantidad de items
     */
    public int getItemAdd(){
        List<WebElement> items = this.driver.findElements(CartPage.ItemsAdd);
        return items.size();
    }

    public String getTitleItemAdd(){
        return this.driver.findElement(CartPage.titleItemAdd).getText();
    }
}
