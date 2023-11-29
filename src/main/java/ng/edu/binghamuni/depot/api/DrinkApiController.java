package ng.edu.binghamuni.depot.api;
import ng.edu.binghamuni.depot.Domain.Drink;
import ng.edu.binghamuni.depot.repository.DrinkRepository;
import ng.edu.binghamuni.depot.services.DrinkServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping("/drink/{id}")
    @GetMapping
    public ResponseEntity<Drink>getDrinkId(@PathVariable long id){
        return ResponseEntity.ok().body(drinkService.getDrinkById(id));
    }

    @PostMapping("/drink")
    public ResponseEntity<Drink>createDrink(@RequestBody Drink drink){
        return ResponseEntity.ok().body(drinkService.saveDrink(drink));
    }

    @PutMapping("/drink")
    public ResponseEntity<Drink>updateDrink(@PathVariable long id, @RequestBody Drink drink){
        return ResponseEntity.ok().body(drinkService.updateDrink(drink));
    }

    @DeleteMapping("/drink/{id}")
    public HttpStatus deleteDrink(@PathVariable long id){
        drinkService.deleteDrink(id);
        return HttpStatus.OK;
    }
}
