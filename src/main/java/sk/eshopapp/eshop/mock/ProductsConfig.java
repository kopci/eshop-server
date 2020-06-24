package sk.eshopapp.eshop.mock;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import sk.eshopapp.eshop.model.AnimalCategoryEnum;
import sk.eshopapp.eshop.model.Product;
import sk.eshopapp.eshop.repository.ProductRepository;

@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
@Configuration
public class ProductsConfig {

    @Bean
    CommandLineRunner cmdRunner(ProductRepository productRepository) {
        return strings -> {
            productRepository.save(new Product("Super Doggo Leash", AnimalCategoryEnum.DOGS, 15.22f,
                    "Amazing long-range leash for your beloved pet. With almost 5 meters of its length, it's considered to be one of the longest leashes on the market."));
            productRepository.save(new Product("Fluffy Ball", AnimalCategoryEnum.CATS, 9.88f,
                    "Instant must-have. Your cat will be satisfied for a whole 10 minutes."));
            productRepository.save(new Product("Meat-flavoured Bone", AnimalCategoryEnum.DOGS, 20.15f,
                    "Another ground-breaking product for your toothy friend. Great deal: 1 plus 1 for only 39.99."));
            productRepository.save(new Product("Himalayan Aquarium Water", AnimalCategoryEnum.OTHERS, 62.44f,
                    "With this Zen product your fish will finally fing inner piece and may even discover true meaning of their existence."));
            productRepository.save(new Product("Himalayan Aquarium Water (salted)", AnimalCategoryEnum.OTHERS, 62.44f,
                    "With this Zen product your sea fish will finally fing inner piece and may even discover true meaning of their existence."));
        };
    }
}
