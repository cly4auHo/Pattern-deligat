package deligat;

public class DeligatApp {

    public static void main(String[] args) {
        Ispolnitel isp = new Ispolnitel();
        Ispolnitel isp2 = new Ispolnitel();

        Music flute = new Flute();
        Music quitar = new Guitar();
        Music piano = new Piano();
        Music boyan = new Boyan();

        isp.setMusic(boyan);
        isp2.setMusic(flute);
        isp.play();
        isp2.play();
       
    }

}
