package lambdas;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

class Instruments{  
    int id;  
    String name;  
    float price;  
    public Instruments(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class FilterCollectionDataWithStream {

	public static void main(String[] args) {
		List<Instruments> list=new ArrayList<Instruments>();  
        list.add(new Instruments(1,"Samsung A5",17000f));  
        list.add(new Instruments(3,"Iphone 6S",65000f));  
        list.add(new Instruments(2,"Sony Xperia",25000f));  
        list.add(new Instruments(4,"Nokia Lumia",15000f));  
        list.add(new Instruments(5,"Redmi4 ",26000f));  
        list.add(new Instruments(6,"Lenevo Vibe",19000f)); 
		
        Stream<Instruments> filteredData = list.stream().filter(p -> p.price>20000);
        
        filteredData.forEach(product -> System.out.println(product.name+" "+product.price));
	}

}
