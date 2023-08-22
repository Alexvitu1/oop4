public class Fruit {
    private String nameFruct;
    private double weight;

    public String getNameFruct() {
        return nameFruct;
    }

    public double getWeight() {
        return weight;
    }

    public void setNameFruct(String nameFruct) {
        this.nameFruct = nameFruct;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Type Fruit{" +
                "nameFruct='" + nameFruct + '\'' +
                ", weight=" + weight +
                '}';
    }
}
