import domain.Product;
import service.ProductService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // TODO: Implement this to add the service
        service.addProduct(new Product("TONOR Mic", "Mic", "Computer Table", 2025));
        service.addProduct(new Product("Dell Laptop", "Laptop", "Office", 2024));
        service.addProduct(new Product("Logitech Mouse", "Mouse", "Home", 2023));
        service.addProduct(new Product("Sony Headphones", "Headphones", "Electronics", 2025));
        service.addProduct(new Product("HP Printer", "Printer", "Office", 2023));
        service.addProduct(new Product("Samsung TV", "TV", "Living Room", 2024));
        service.addProduct(new Product("Apple iPad", "iPad", "Home", 2022));
        service.addProduct(new Product("Nike Shoes", "Shoes", "Clothing", 2023));
        service.addProduct(new Product("Canon Camera", "Camera", "Photography", 2024));
        service.addProduct(new Product("Microsoft Surface", "Surface", "Office", 2025));
        service.addProduct(new Product("LG Refrigerator", "Refrigerator", "Kitchen", 2023));

        List<Product> products = service.getAllProducts();
        List<Product> filterProductsWarranty = products.stream()
                        .filter(product -> product.getWarranty()>=2024)
                                .sorted((p1,p2) ->p1.getWarranty()- p2.getWarranty())
                                        .collect(Collectors.toList());


        System.out.println(filterProductsWarranty);
    }
}