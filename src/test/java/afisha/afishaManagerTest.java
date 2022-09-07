package afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class afishaManagerTest {

    afishaManager manager = new afishaManager();
    String movie1 = "film1";
    String movie2 = "film2";
    String movie3 = "film3";
    String movie4 = "film4";
    String movie5 = "film5";

    @Test
    public void findAll() {

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {

                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limitUp() {

        afishaManager manager = new afishaManager(11);

        String movie1 = "film1";
        String movie2 = "film2";
        String movie3 = "film3";
        String movie4 = "film4";
        String movie5 = "film5";
        String movie6 = "film6";
        String movie7 = "film7";
        String movie8 = "film8";
        String movie9 = "film9";
        String movie10 = "film10";
        String movie11 = "film11";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        String[] expected = {

                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limitDown() {

        afishaManager manager = new afishaManager(2);

        String movie1 = "film1";
        String movie2 = "film2";
        String movie3 = "film3";
        String movie4 = "film4";
        String movie5 = "film5";
        String movie6 = "film6";
        String movie7 = "film7";
        String movie8 = "film8";
        String movie9 = "film9";
        String movie10 = "film10";
        String movie11 = "film11";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        String[] expected = {

                movie11,
                movie10

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
