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
    public @ResponseBody int checkInternetConnection(@RequestParam(defaultValue = "false") boolean internetConnection){
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
    public @ResponseBody int addCellPhone(@RequestParam(defaultValue = "false") String cellphone){
        return purchase.addCellPhone(cellphone);
    }

    @PostMapping("/remove-CellPhone")
    public @ResponseBody int removeCellPhone(@RequestParam(defaultValue = "false") String cellphone){
        return purchase.removeCellPhone(cellphone);
    }

}
