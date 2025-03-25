# Comparator vs Comparable 

In Java, both Comparable and Comparator are used for sorting objects. The main difference between Comparable and Comparator is:

- Comparable: It is used to define the natural ordering of the objects within the class.
- Comparator: It is used to define custom sorting logic externally.
  

| **Features**      | **Comparable** | **Comparator** |
|------------------|--------------|-------------|
| **Definition**   | It defines natural ordering within the class. | It defines external sorting logic. |
| **Method**      | `compareTo()`  | `compare()`  |
| **Implementation** | It is implemented in the class. | It is implemented in a separate class. |
| **Sorting Criteria** | Natural order sorting | Custom sorting |
| **Usage** | It is used for a single sorting order. | It is used for multiple sorting orders. |

## Example of Comparable:
  In this example, we use Comparable to sort Movies by their release year using compareTo() method.

  ```java
// Java program to demonstrate 
// the use of Comparable for sorting
import java.util.ArrayList;
import java.util.Collections;

// Movie class implements Comparable 
// interface to define default sorting
class Movie implements Comparable<Movie> {
    private String n; // Movie Name
    private double r; // Movie Rating
    private int y; // Release year of the movie

    // Constructor 
    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // Implementation of the compareTo method 
    // for default sorting by year
    public int compareTo(Movie m) {
      
        // Sort movies in ascending 
        // order of year
        return this.y - m.y; 
    }

    // Getter and Setter method 
    public String getName() {
        return n;
    }

    public double getRating() {
        return r;
    }

    public int getYear() {
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
      
        // Create a list of movies
        ArrayList<Movie> l = new ArrayList<>();
        l.add(new Movie("Star Wars", 8.7, 1977));
        l.add(new Movie("Empire Strikes Back", 8.8, 1980));
        l.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sort movies using Comparable's 
        // compareTo method by year
        Collections.sort(l);

        // Display the sorted list of movies
        System.out.println("Movies after sorting by year:");
        for (Movie m : l) {
          
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}

```
Explanation: In the above example, the compareTo() method sorts the Movie objects by their release year. The Collections.sort() method uses the compareTo() method to compare and sort the movies in ascending order.

Now, suppose we want to sort movies by their rating and names as well. When we make a collection element comparable(by having it implement Comparable), we get only one chance to implement the compareTo() method. The solution is using Comparator.

## Example of Comparator:

In this example, we use Comparator to define custom sorting logic to sort movies first by rating and then by name.

```java

// Java program to demonstrate Comparator interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
    private String n; // Movie name
    private double r; // Movie rating
    private int y;    // Movie year

    // Constructor to initialize movie details
    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // Getter methods 
    public String getN() { 
      return n; 
    } 
    public double getR() { 
      return r; 
    } 
    public int getY() { 
      return y; 
    }    
}

// Comparator to sort movies by rating
class Rating implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
      
        // Sort by rating in descending order
        return Double.compare(m2.getR(), m1.getR());
    }
}

// Comparator to sort movies by name
class NameCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
      
        // Sort by name in alphabetical order
        return m1.getN().compareTo(m2.getN()); 
    }
}

// Main class 
public class Main {
    public static void main(String[] args) {
      
        // Create a list of movies 
        ArrayList<Movie> m = new ArrayList<>();
        m.add(new Movie("Force Awakens", 8.3, 2015));
        m.add(new Movie("Star Wars", 8.7, 1977));
        m.add(new Movie("Empire Strikes Back", 8.8, 1980));

        // Sort movies by rating and display all
        Collections.sort(m, new Rating());
        System.out.println("Movies sorted by rating:");
        for (Movie m1 : m) {
            System.out.println(m1.getR() + " " + m1.getN() + " " + m1.getY());
        }

        // Sort movies by name and display all
        Collections.sort(m, new NameCompare());
        System.out.println("\nMovies sorted by name:");
        for (Movie m1 : m) {
            System.out.println(m1.getN() + " " + m1.getR() + " " + m1.getY());
        }
    }
}


```

Explanation: In the above example, the Comparator is used to sort the movies first by rating and then by name. The Rating and NameCompare classes implement custom sorting logic. The Collections.sort() method uses these comparators to sort the list by multiple criteria.



