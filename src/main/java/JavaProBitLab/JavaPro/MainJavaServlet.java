package JavaProBitLab.JavaPro;

import JavaProBitLab.DB.DBManager;
import JavaProBitLab.Model.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainJavaServlet {

    @GetMapping(value = "/")
    public String getItems(Model model){
        ArrayList<Items> arr = DBManager.getAllItems();
        model.addAttribute("tovary", arr);
        return "MainMenu";
    }

    @GetMapping(value = "/Details/{id}")
    public String getDetails(@PathVariable(name="id") Long id, Model model){
        Items item = DBManager.getDetails(id);
        model.addAttribute("DetailsTovar", item);
        return "Details";
    }

    @PostMapping(value = "/addItem")
    public String addItem(@RequestParam(name = "name") String name,
                          @RequestParam(name = "description") String description,
                          @RequestParam(name = "price") double price,
                          Model model) {
        boolean b = DBManager.addItem(name, description, price);
        if (b = true) {
            return "redirect:/";
        } else {
            return "redirect:/NewSalesPage";
        }
    }

        @GetMapping(value = "/getSalesPage")
        public String getSalesPage(){
                return "NewSalesPage";
    }
}