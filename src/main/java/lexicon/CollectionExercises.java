package lexicon;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExercises {

    void main() {

        daysOfWeek();   //Exercise 1

        insertDay();
    }

    /*
    This method prints the days of the week.
     */
    void daysOfWeek() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        System.out.println("Days of the Weeks: " + days);

        //Exercise 2: Iterate the list and print the days.
        Iterator<String> it = days.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /*
    This method adds the specific day in its position.
     */
    void insertDay() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Friday");
        days.add("Saturday");
        System.out.println("Original days: " + days);
        days.add(4, "Thursday");
        System.out.println("Days after insertion: " + days);

        //Exercise 4: To print first 3 elements in the list.
        System.out.println("First three days: " + days.subList(0,3));
    }

}
