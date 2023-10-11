package ra.modal;

public abstract class Animal {
    private String name;

    public abstract void makeNoise();
    public static void eat(){
        System.out.println("Eating");
    }

}