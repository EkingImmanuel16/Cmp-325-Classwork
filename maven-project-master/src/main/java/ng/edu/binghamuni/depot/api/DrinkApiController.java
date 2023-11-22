package ng.edu.binghamuni.depot.api;
import ng.edu.binghamuni.depot.Domain.Drink;
import ng.edu.binghamuni.depot.repository.DrinkRepository;
import ng.edu.binghamuni.depot.services.DrinkServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


import java.util.List;
@Controller
public class DrinkApiController {
    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkServices drinkService;

    @RequestMapping("/drinks")
    @GetMapping("/drinks")

    public ResponseEntity<List<Drink>> getAlldrinks(){
        return ResponseEntity.ok().body(drinkService.getAllDrink());
    };

}
