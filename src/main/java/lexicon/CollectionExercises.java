package lexicon;

import java.util.*;

public class CollectionExercises {

    void main() {

        daysOfWeek();   //Exercise 1
        insertDay();    //Exercise 3
        daysOfWeekHashSet();    //Exercise 5
        sortNames();    //Exercise 7
        exampleForSet();    //Exercise 8
        exampleForMap();    //Exercise 9
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

    /*
    This method prints the days of a week in HashSet pattern.
     */
    void daysOfWeekHashSet() {
        HashSet<String> days = new HashSet<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        System.out.println("Days of a week (HashSet): " + days);

        //Exercise 6: Convert the HashSet into ArrayList.
        ArrayList<String> daysInList = new ArrayList<>(days);
        System.out.println("Days of a week (ArrayList): " + daysInList);
    }

    /*
    This method returns the names in alphabetical order.
     */
    void sortNames() {
        HashSet<String> names = new HashSet<>();
        names.add("Lily");
        names.add("Rose");
        names.add("Dalia");
        names.add("Peace Lily");

        ArrayList<String> namesInList = new ArrayList<>(names);
        Collections.sort(namesInList);
        System.out.println("Names are: " + namesInList);
    }

    /*
    Example for Set and TreeSet(Default the list is sorted).
     */
    void exampleForSet() {
        TreeSet<String> names = new TreeSet<>();
        names.add("Lily");
        names.add("Rose");
        names.add("Dalia");
        names.add("Peace Lily");
        System.out.println("Names are: " + names);
    }

    /*
    Example for Map and hashMap.
     */
    void exampleForMap() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(11 , "Volvo");
        cars.put(22, "Volkswagen");
        cars.put(33, "Audi");
        cars.put(44, "BMW");
        System.out.println("Car Brands are: " + cars);
        //Exercise 10: Print out only the keys of HashMap.
        System.out.println("Car brands keys are: " + cars.keySet());
        //Exercise 11: Print out only the values of HashMap.
        System.out.println("Car brands values are: " + cars.values());
    }

}
