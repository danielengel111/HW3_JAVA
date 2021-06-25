import java.util.*;


public class Zoo
{
    private static Zoo instance = new Zoo();
    private ArrayList<ZooObserver> observers;
    private int hunger;
    private int happiness;

    private Zoo()
    {
        this.observers = new ArrayList<>();
        this.happiness = 2;
        this.hunger = 3;
    }

    public static Zoo getInstance() { return instance; }

    public void addObserver(ZooObserver observer)
    {
        this.observers.add(observer);
    }

    public void addAnimal(Animal animal)
    {

    }

    public void showAnimalsInfo()
    {

    }

    public void feedAnimals()
    {

    }

    public void watchAnimals()
    {

    }

    public void removeObserver(ZooObserver observer)
    {
        this.observers.remove(observer);
    }
}
