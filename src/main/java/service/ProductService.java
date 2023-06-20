package service;

import controller.ProductDBController;
import domain.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    private List<Product> products = new ArrayList<>();
    ProductDBController db = new ProductDBController();

    public void addProduct(Product p){

        products.add(p);
        db.save(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public List<Product> getProductByName(String name){
        String productName = name.toLowerCase();
        List<Product> filterByName = products.stream()
                .filter(product -> product.getName().toLowerCase().contains(productName))
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
        return filterByName;
    }

    public List<Product> getProductByType(String type) {
        String productType = type.toLowerCase();
        List<Product> filterByType = products.stream()
                .filter(product -> product.getType().toLowerCase().contains(productType))
                .sorted(Comparator.comparing(Product::getType))
                .collect(Collectors.toList());
        return filterByType;
    }

    public List<Product> getProductByPlace(String place) {
        String productPlace = place.toLowerCase();
        List<Product> filterByPlace = products.stream()
                .filter(product -> product.getPlace().toLowerCase().contains(productPlace))
                .sorted(Comparator.comparing(Product::getType))
                .collect(Collectors.toList());
        return filterByPlace;
    }

    public List<Product> getProductsByWarrantyYear(int year){

        //This is to filter product by warranty year
        List<Product> filterByWarranty = products.stream()
                .filter(product -> product.getWarranty()==year)
                .sorted((p1,p2) ->p1.getWarranty()- p2.getWarranty())
                .collect(Collectors.toList());

        return filterByWarranty;
    }

    public List<Product> getProductsByKeyWord(String keyWord) {
        String word = keyWord.toLowerCase();

        List<Product> filterByKeyword = products.stream()
                .filter(product -> product.getName().toLowerCase().contains(word)|| product.getType().toLowerCase().contains(word)||product.getPlace().toLowerCase().contains(word))
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());

        return filterByKeyword;
    }
}
