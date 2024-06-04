public class Dog {
    String color = "Red";
    String speak = "Bark";
    int weight = 40;

    public Dog(String color, String speak, int weight) {
        this.color = color;
        this.speak = speak;
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSpeak() {
        return speak;
    }
    public void setSpeak(String speak) {
        this.speak = speak;
    }
    private int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

}

class Bull {
    public static void main(String[] args) {
        Dog bull = new Dog("Normal", "Slow bark", 29);
    
        // int BullWeight = bull.getWeight(); // not visible while private
        System.out.println(bull.getSpeak());
    }
}

