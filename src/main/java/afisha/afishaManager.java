package afisha;

public class afishaManager {


    private String[] film = new String[0];
    private int limit;


    public afishaManager() {
        limit = 10;
    }

    public afishaManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = movie;
        film = tmp;
    }

    public String[] findAll() {
        return film;
    }

    public String[] findLast() {

        int resultLength;
        if (limit < film.length) {
            resultLength = limit;
        } else {
            resultLength = film.length;
        }

        String[] result = new String[resultLength];


        for (int i = 0; i < resultLength; i++) {
            result[i] = film[film.length - 1 - i];

        }
        return result;

    }
}



