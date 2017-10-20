package original;

public class SuperAthletes extends Participants implements SuperCompete {

    public SuperAthletes(String id, String name, String state, int age) {
        super(id, name, state, age);
    }

    @Override
    double compete(Games g) {
        if (g.getClass() == Cycling.class) {
            return this.cycling();
        } else if (g.getClass() == Running.class) {
            return this.run();
        } else {
            return this.swim();
        }
    }

    @Override
    public double cycling() {
        int x = 500 + (int) (Math.random() * 300);
        int y = (int) (Math.random() * 99);
        double z = x + ((double) y / 100);
        return z;
    }

    @Override
    public double run() {
        int x = 10 + (int) (Math.random() * 10);
        int y = (int) (Math.random() * 99);
        double z = x + ((double) y / 100);
        return z;
    }

    @Override
    public double swim() {
        int x = 100 + (int) (Math.random() * 100);
        int y = (int) (Math.random() * 99);
        double z = x + ((double) y / 100);
        return z;
    }
}
