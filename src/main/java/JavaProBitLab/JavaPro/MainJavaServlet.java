package JavaProBitLab.JavaPro;

import JavaProBitLab.DB.DBManager;
import JavaProBitLab.Model.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MainJavaServlet {

    @GetMapping(value = "/")
    public String getItems(Model model){
        ArrayList<Items> arr = DBManager.getAllItems();
        model.addAttribute("tovary", arr);
        return "MainMenu";
    }
}
