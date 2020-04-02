package mandatory.test;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class PurchaseTest {

    ArrayList<String> cellPhones = new ArrayList<String>( Arrays.asList("Motorola G99", "iPhone 99", "Samsung Galaxy 99", "Sony Xperia 99", "Huawei 99"));
    ArrayList<Integer> cellPhonePrices = new ArrayList<Integer>( Arrays.asList(800, 6000, 1000, 900, 900));

    @Test
    void checkInternetConnection() {

// Given parameters
// From start
        Purchase purchase = new Purchase();
// When internet Connection boolean touched
        Purchase purchaseCheck = new Purchase(false, 0, null, 0);
// Then Expected Test True
        assertFalse(purchase.internetConnection);
// Then Expected price to be price + 200
        assertEquals(purchase.price + 200, purchaseCheck.checkInternetConnection(true));
// Then Expected price to be price - 200
        assertEquals(purchase.price, purchaseCheck.checkInternetConnection(false));

    }

    @Test
    void addPhoneLine() {

        // Given parameters
        ArrayList<String> cellphones = new ArrayList<>();
        Purchase purchase = new Purchase(false, 9, cellphones, 0);
        // When maximum of phonelines is exceeded
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> purchase.addPhoneLine());
        // Then exeption error is shown
        assertEquals("8 phone lines is the maximum", exception.getMessage());

    }

    @Test
    void removePhoneLine() {

    }

    @Test
    void addCellPhone() {
    // Check that the addCellPhone method returns the appropiate price for each corresponding phone
        Purchase purchase = new Purchase();
        int i;

        for(i = 0; i<cellPhones.size(); i++) {
            assertEquals(purchase.addCellPhone(cellPhones.get(i)), cellPhonePrices.get(i));
            purchase.price = 0;
        }
    }

    @Test
    void removeCellPhone() {
        //make price generalised
        //Purchase purchase = new Purchase(false, 0, cellPhones, 9600);
        Purchase purchase = new Purchase();
        int i;
        for(i = 0; i < cellPhones.size(); i++) {
            purchase.addCellPhone(cellPhones.get(i)); //tiføjer en tlf - incrementer den også price?
            assertEquals(purchase.removeCellPhone(cellPhones.get(i)), purchase.price);
        }

    }

    @Test
    void buy() {
    }
}