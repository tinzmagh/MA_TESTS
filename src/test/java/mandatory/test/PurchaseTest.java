package mandatory.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseTest {



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

        ArrayList<String> cellphones = new ArrayList<>();
        Purchase purchase = new Purchase(false, 8, cellphones, 0);
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> purchase.addPhoneLine());
        assertEquals("8 phone lines is the maximum", exception.getMessage());


    }

    @Test
    void removePhoneLine() {
    }

    @Test
    void addCellPhone() {
    }

    @Test
    void removeCellPhone() {
    }

    @Test
    void buy() {
    }
}