package exercise3;

public class BoxWithFruits<T extends Fruit> {
    private float weight;
    private int number;
    private final static int MAX_NAMBER=40;

    public BoxWithFruits(int number) {
        this.number = number;
    }

    public float getWeight() {
        weight=Fruit.weight*number;
        return weight;
    }
    public int getNumber() {
        return number;
    }
    public void add(int n){
        if(number+n<=MAX_NAMBER) number+=n;
        else number=MAX_NAMBER;
    }
    public void replace(int n,BoxWithFruits<T>other){
        if(n>number)n=number;
            if(other.getNumber()+n<=MAX_NAMBER) {
                other.add(n);
                number -= n;
            }else {
                number =number-(MAX_NAMBER-other.getNumber());
                other.add(n);
            }
    }
    public boolean compareByWeight(BoxWithFruits<?> b2) {
        if(getWeight() == b2.getWeight()) return true;
        return false;
    }
    public boolean compareByType(BoxWithFruits<?> b2) {
        if(this.getClass() == b2.getClass()) return true;   //всегда будет true (class BoxWithFruits)
        return false;
    }
    public boolean compareByTypeAndWeight(BoxWithFruits<T> b2) { // типы должны совпадать
        if(getWeight() == b2.getWeight()) return true;
        return false;
    }
}
