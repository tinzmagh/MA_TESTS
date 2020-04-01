package mandatory.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    Purchase purchase = new Purchase();


    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/check-InternetConnection")
    public @ResponseBody int checkInternetConnection(boolean internetConnection){
        return purchase.checkInternetConnection(internetConnection);
    }

    @PostMapping("/add-PhoneLine")
    public @ResponseBody int addPhoneLine(){
        return purchase.addPhoneLine();
    }

    @PostMapping("/remove-PhoneLine")
    public @ResponseBody int removePhoneLine(){
        return purchase.removePhoneLine();
    }

    @PostMapping("/add-CellPhone")
    public @ResponseBody int addCellPhone(String cellphone){
        return purchase.addCellPhone(cellphone);
    }

    @PostMapping("/remove-CellPhone")
    public @ResponseBody int removeCellPhone(String cellphone){
        return purchase.removeCellPhone(cellphone);
    }

    @PostMapping("/buy")
    public @ResponseBody String buyProducts() {
        return purchase.buy();
    }

    @PostMapping("/reset")
    public @ResponseBody String reset(){
        return purchase.reset();
    }

}
