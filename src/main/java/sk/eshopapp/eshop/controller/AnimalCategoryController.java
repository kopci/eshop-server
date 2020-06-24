package sk.eshopapp.eshop.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.eshopapp.eshop.model.AnimalCategoryEnum;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class AnimalCategoryController {

    @RequestMapping("/getAll")
    public AnimalCategoryEnum[] getAllCategories() {
        return AnimalCategoryEnum.values();
    }

}
