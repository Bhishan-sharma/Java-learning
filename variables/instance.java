package variables;
public class instance {
    public String color;
    instance(String str){
        color = str;
    }
    public void display() {
        System.out.println("color of the car is : " + color);
    }
    public static void main(String[] args) {
        instance ob = new instance("black");
        ob.display();
    }
}