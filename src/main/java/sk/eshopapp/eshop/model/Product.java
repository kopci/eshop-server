package sk.eshopapp.eshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

    @Id
    String id;
    String name;
    AnimalCategoryEnum animalCategory;
    Float price;
    String description;

    public Product(final String name, final AnimalCategoryEnum animalCategory, final Float price, final String description) {
        this.name = name;
        this.animalCategory = animalCategory;
        this.price = price;
        this.description = description;
    }

    public String getId() { return id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalCategoryEnum getAnimalCategory() {
        return animalCategory;
    }

    public void setAnimalCategory(AnimalCategoryEnum animalCategory) {
        this.animalCategory = animalCategory;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
