package deligat.second;

public interface Ispolnitel extends Music {

    class Flute implements Music {

        @Override
        public void play() {
            System.out.println("Flute play");
        }
    }

    class Piano implements Music {

        @Override
        public void play() {
            System.out.println("Igraet Fortepiani");
        }
    }

    class Guitar implements Music {

        @Override
        public void play() {
            System.out.println("Guitar is play");
        }
    }

    class Boyan implements Music {

        @Override
        public void play() {
            System.out.println("Boyan rvet dyshy");
        }
    }

}
