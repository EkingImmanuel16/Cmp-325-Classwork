package ng.edu.binghamuni.depot.Control;
import ch.qos.logback.core.model.Model;
import ng.edu.binghamuni.depot.Domain.Drink;
import ng.edu.binghamuni.depot.services.DrinkServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DrinkController {
    @Autowired
    DrinkServices drinkServices;

@GetMapping("/")
    public String homePage(Model model){
    model.addAttribute("drinks", drinkService.getAllDrink());
            return "index";
}

@GetMapping("/showNewDrinkForm")
    public String showNewDrinkForm(Model model){
    Drink drink = new Drink();
    model.addText("drink",drink);
    return "new drink";
}

@GetMapping("/saveDrink")
    public String saveDrink(Model model){

}
}
