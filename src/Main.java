import domain.Product;
import service.ProductService;

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
        service.addProduct(new Product("Sony Walkman", "Headphones", "Electronics", 2023));
        service.addProduct(new Product("HP Desktop", "Laptop", "Office", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Mouse", "Home", 2025));
        service.addProduct(new Product("Samsung Soundbar", "TV", "Living Room", 2023));
        service.addProduct(new Product("Apple Watch", "iPad", "Home", 2024));
        service.addProduct(new Product("Nike Running Shoes", "Shoes", "Clothing", 2023));
        service.addProduct(new Product("Canon DSLR Camera", "Camera", "Photography", 2025));
        service.addProduct(new Product("Microsoft Surface Book", "Surface", "Office", 2024));
        service.addProduct(new Product("LG Washing Machine", "Washing Machine", "Kitchen", 2023));
        service.addProduct(new Product("Sony PlayStation", "Headphones", "Electronics", 2025));
        service.addProduct(new Product("Samsung Galaxy", "Smartphone", "Electronics", 2023));
        service.addProduct(new Product("HP Laptop", "Laptop", "Office", 2024));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Office", 2023));
        service.addProduct(new Product("Sony PlayStation", "Gaming Console", "Living Room", 2025));
        service.addProduct(new Product("LG TV", "TV", "Living Room", 2024));
        service.addProduct(new Product("Nike Running Shoes", "Shoes", "Sports", 2023));
        service.addProduct(new Product("Canon DSLR Camera", "Camera", "Photography", 2024));
        service.addProduct(new Product("Microsoft Xbox", "Gaming Console", "Living Room", 2025));
        service.addProduct(new Product("Apple MacBook Pro", "Laptop", "Office", 2023));
        service.addProduct(new Product("Samsung Refrigerator", "Refrigerator", "Kitchen", 2023));
        service.addProduct(new Product("Sony Noise-Cancelling Headphones", "Headphones", "Electronics", 2025));
        service.addProduct(new Product("HP All-in-One Printer", "Printer", "Office", 2023));
        service.addProduct(new Product("Logitech Gaming Mouse", "Mouse", "Gaming", 2024));
        service.addProduct(new Product("Samsung QLED TV", "TV", "Living Room", 2025));
        service.addProduct(new Product("Apple HomePod", "Speaker", "Living Room", 2023));
        service.addProduct(new Product("Nike Basketball Shoes", "Shoes", "Sports", 2024));
        service.addProduct(new Product("Canon Mirrorless Camera", "Camera", "Photography", 2022));
        service.addProduct(new Product("Microsoft Surface Pro", "Surface", "Office", 2023));
        service.addProduct(new Product("LG Microwave Oven", "Appliance", "Kitchen", 2025));
        service.addProduct(new Product("Sony Wireless Earbuds", "Earbuds", "Electronics", 2024));
        service.addProduct(new Product("HP Desktop Computer", "Computer", "Office", 2023));
        service.addProduct(new Product("Logitech Gaming Keyboard", "Keyboard", "Gaming", 2022));
        service.addProduct(new Product("Samsung Washing Machine", "Appliance", "Laundry", 2025));
        service.addProduct(new Product("Apple AirPods", "Earbuds", "Electronics", 2024));
        service.addProduct(new Product("Nike Soccer Cleats", "Shoes", "Sports", 2023));

        //Find products by warranty year
        System.out.println("=======================================");
        System.out.println("Get Product By Warranty Year");
        int warrantyYear = 2023;
        if(service.getProductsByWarrantyYear(warrantyYear).isEmpty()) {
            System.out.println("No products found for the year");
        }else {
            for (Product p : service.getProductsByWarrantyYear(warrantyYear)) {
                System.out.println(p + "\n");
            }
        }

        //Find products by keywords
        System.out.println("=======================================");
        System.out.println("Get Product By KeyWord");
        String keyWord = "phone";
        if(service.getProductsByKeyWord(keyWord).isEmpty()){
            System.out.println("No products found for the keyword");
        }else {
            for (Product p: service.getProductsByKeyWord(keyWord)){
                System.out.println(p + "\n");
            }
        }


    }
}