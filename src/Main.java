import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Sort 5 people
        List<Person> people = new ArrayList<>(5);
         people.add(new Person("Tam", "Lee"));
         people.add(new Person("Nam", "Jee"));

         //Before sorting
         for (Person person : people) {
             System.out.println(person);
         }

         Collections.sort(people);

         for (Person person : people) {
             System.out.println(person);
         }


         // Sort 5 Rectangle
        List<Rectangle> rectangles = new ArrayList<>(5);
         rectangles.add(new Rectangle(4, 6));
         rectangles.add(new Rectangle(4, 23));

         for  (Rectangle rectangle : rectangles) {
             System.out.println("Area: " + rectangle.area());
         }

         Collections.sort(rectangles);

         for  (Rectangle rectangle : rectangles) {
             System.out.println("Area: " + rectangle.area());
         }

    }
}