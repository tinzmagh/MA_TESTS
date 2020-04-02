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

        Purchase purchase = new Purchase();

        // checks that the internet connection is false form start
        assertFalse(purchase.internetConnection);
        // when internet connection is set to true is should add 200 to price
        assertEquals(purchase.price + 200, purchase.checkInternetConnection(true));
        // when internet connection is set to false is should take 200 to price
        assertEquals(purchase.price - 200, purchase.checkInternetConnection(false));
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

        Purchase purchase = new Purchase();
        int i;
        for(i = 0; i<cellPhones.size(); i++) {
            assertEquals(purchase.addCellPhone(cellPhones.get(i)), cellPhonePrices.get(i));
            purchase.price = 0;
        }
    }

    @Test
    void removeCellPhone() {
    }

    @Test
    void buy() {
    }
}