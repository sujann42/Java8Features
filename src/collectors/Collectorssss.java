package collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class Collectorssss {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        List<Float> productPriceList = productsList.stream().map(x->x.price).collect(Collectors.toList());
        System.out.println(productPriceList);
        List<String> nameOfProducts = productsList.stream().map(x->x.name).collect(Collectors.toList());
        System.out.println(nameOfProducts);

        
       List<Float> prices = productsList.stream().map(p -> p.price).collect(Collectors.toList());
       System.out.println(prices);
       
       //Converting list to SET
       Set<Float> setOfPrices = productsList.stream().map(x->x.price).collect(Collectors.toSet());
       System.out.println(setOfPrices);
       
       //Sum of Prices
       Double sumOfPrices = productsList.stream().collect(Collectors.summingDouble(s -> s.price));
       System.out.println(sumOfPrices);
       //Sum of IDs
       Integer sumOfIds = productsList.stream().collect(Collectors.summingInt(x->x.id));
       System.out.println(sumOfIds);
       //Average Price
       Double average = productsList.stream().collect(Collectors.averagingDouble(x->x.price));
       System.out.println(average);
       //Count elements
       Long  count = productsList.stream().collect(Collectors.counting());
       System.out.println(count);
       
       //Filtering using stream
       List<Float> pl = productsList.stream().filter(p->p.price > 30000).map(p->p.price).collect(Collectors.toList());
       System.out.println(pl);
       
	}

}
