import java.util.ArrayList;
import java.util.List;


public class Box <T extends Fruit>{
    private List<T> fructs = new ArrayList<>();
        public Box(){
        fructs = new ArrayList<>();
    }

    public List<T> GetFructs(){
        return fructs;
    }

    public void AddFructsBox(T fruct){
        fructs.add(fruct);
    }

    public <T> double getWeight(){
        return fructs.size()*fructs.get(0).getWeight();
    }

    public boolean compareBox(Box box){
        return this.getWeight() == box.getWeight();
    }

    public void addBoxFrom(Box<T> box) {
        System.out.println("было в первом ящике  = " + this.getWeight());
        System.out.println("было в другом ящике = " + box.getWeight());
        for(T t:box.GetFructs()){
            this.GetFructs().add(t);
            }
        box.GetFructs().clear();
        System.out.println("стало в первом ящике = " + this.getWeight());
        }
}
