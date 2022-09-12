import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,CarData>map=new HashMap<>();
        map.put(new Car(12,"A4747K"),new CarData(2018,"bmw",15000,"silver"));
        for (Map.Entry e:map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        

    }
}