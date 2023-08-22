public class Main {
    public static void main(String[] args) {
        Box<Apple> fructBox1 = new Box<>();
        Box<Orange> fructBox2 = new Box<>();
        Box<Apple> fructBox3 = new Box<>();
        Box<Orange> fructBox4 = new Box<>();
        int size1 = 15;
        int size2 = 10;
        for (int i = 0; i < size1; i++) {
            fructBox1.AddFructsBox(new Apple());
            fructBox4.AddFructsBox(new Orange());
        }
        for (int i = 0; i < size2; i++) {
            fructBox2.AddFructsBox(new Orange());
            fructBox3.AddFructsBox(new Apple());
        }
        double weightBox1 = fructBox1.getWeight();
        double weightBox2 = fructBox2.getWeight();
        double weightBox3 = fructBox3.getWeight();
        double weightBox4 = fructBox4.getWeight();
        System.out.println(weightBox1 + " и " + weightBox2 + " и " + weightBox3 + " и " + weightBox4);
        System.out.println(fructBox1.compareBox(fructBox2));
        System.out.println(fructBox3.compareBox(fructBox4));
        fructBox1.addBoxFrom(fructBox3);
    }


}