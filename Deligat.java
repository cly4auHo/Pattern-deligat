package deligat.second;

public class Deligat implements Ispolnitel {

    @Override
    public void play() {
        System.out.println("Ochen plokhaya mysica");
    }

    public static void main(String[] args) {
        Piano p = new Piano();
        p.play();
    }
}
