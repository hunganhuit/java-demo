package thread;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HelloMain {

    public static void main(String[] args) throws InterruptedException {
//        // TODO Auto-generated method stub
//        int idx = 1;
//
//        for (int i = 0; i < 2; i++) {
//
//            System.out.println("Main thread running " + idx++);
//            // Ngủ 2101 milli giây.
//            Thread.sleep(2101);
//        }
//
//        HelloThread helloThread = new HelloThread();
//
//        // Chạy thread
//        helloThread.start();
//        helloThread.interrupt();
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Main thread runningg " + idx++);
//            // Ngủ 2101 milli giây.
//            Thread.sleep(2101);
//        }
//
//        System.out.println("==> Main thread stopped");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.forEach(number -> System.out.print(number));
        
        List<Integer> squaresList  = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.print(squaresList);
        
        List<Integer> list1 = numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(list1);
        
     // Một danh sách các loại quả.
        List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian", "Cherry");
 
        // Sử dụng phương thức tiện ích của Collections 
        // để sắp xếp lại danh sách trên.
        // Cung cấp một Comparator (Bộ so sách).
        Collections.sort(fruits, new Comparator<String>() {
 
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
 
        });

        fruits.forEach(f ->  System.out.println(f));
        
        LocalDateTime lct = LocalDateTime.now();
        System.out.println(lct);
        
        
    }
}
