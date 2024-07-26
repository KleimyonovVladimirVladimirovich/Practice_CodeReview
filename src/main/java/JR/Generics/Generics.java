package JR.Generics;

public class Generics<T> {

    public boolean getString;
    String pole = ".";

    public String getPole() {
        return pole;
    }

    public void addToString(T t) {
        this.pole += t.toString();
    }


}
