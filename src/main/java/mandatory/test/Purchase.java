package mandatory.test;


import java.util.ArrayList;
import java.util.List;

public class Purchase {


    public boolean internetConnection;
    public int phoneLines;
    public ArrayList<String> cellPhones;
    public int price = 0;
    public List<String> selectedItems;

    public Purchase() {
    }

    public Purchase(boolean internetConnection, int phoneLines, ArrayList<String> cellPhones, int price) {
        this.internetConnection = internetConnection;
        this.phoneLines = phoneLines;
        this.cellPhones = cellPhones;
        this.price = price;
    }

    public boolean isInternetConnection() {
        return internetConnection;
    }

    public void setInternetConnection(boolean internetConnection) {
        this.internetConnection = internetConnection;
    }

    public int getPhoneLines() {
        return phoneLines;
    }

    public void setPhoneLines(int phoneLines) {
        this.phoneLines = phoneLines;
    }

    public List<String> getCellPhones() {
        return cellPhones;
    }

    public void setCellPhones(ArrayList<String> cellPhones) {
        this.cellPhones = cellPhones;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int checkInternetConnection(boolean internetConnection) {

        if (internetConnection) {
            this.price = this.price + 200;
            System.out.println("Internet connection");
        } else {
            this.price = this.price - 200;
            System.out.println("Internet connection removed");
        }

        return this.price;
    }

    public int addPhoneLine() {

        if (phoneLines < 8) {
            phoneLines++;
            System.out.println("phone line added");
            price = price + 150;
        }
        return price;
    }

    public int removePhoneLine() {

        if (phoneLines > 0) {
            phoneLines--;
            System.out.println("phone line removed");
            price = price - 150;
        }
        return price;
    }


    public int addCellPhone(String model) {
        switch (model) {
            case "Motorola G99":
                System.out.println("Motorola G99 added");
                price = price + 800;
                break;
            case "iPhone 99":
                System.out.println("iPhone 99 added");
                price = price + 6000;
                break;
            case "Samsung Galaxy 99":
                System.out.println("Samsung Galaxy 99 added");
                price = price + 1000;
                break;
            case "Sony Xperia 99":
                System.out.println("Sony Xperia 99 added");
                price = price + 900;
                break;
            case "Huawei 99":
                System.out.println("Huawei 99 added");
                price = price + 900;
                break;
        }
        return price;
    }



    public int removeCellPhone(String model) {
        switch (model) {
            case "Motorola G99":
                System.out.println("Motorola G99 removed");
                price = price - 800;
                break;
            case "iPhone 99":
                System.out.println("iPhone 99 removed");
                price = price - 6000;
                break;
            case "Samsung Galaxy 99":
                System.out.println("Samsung Galaxy 99 removed");
                price = price - 1000;
                break;
            case "Sony Xperia 99":
                System.out.println("Sony Xperia 99 removed");
                price = price - 900;
                break;
            case "Huawei 99":
                System.out.println("Huawei 99 removed");
                price = price - 900;
                break;
        }

        return price;

    }

    public String totalPrice() {
        return "Total price: " + getPrice();
    }

    public void reset() {
        setPrice(0);
    }


}
