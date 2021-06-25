import java.util.*;


public class Zoo
{
    private static Zoo instance = new Zoo();

    private ArrayList<ZooObserver> observers;
    private ArrayList<Animal> animals;
    private  HashMap<String, Integer> dictionary;
    private int hunger;
    private int happiness;

    private Zoo()
    {
        this.observers = new ArrayList<>();
        this.happiness = 2;
        this.hunger = 3;
        this.dictionary = new HashMap<>();
        this.animals = new ArrayList<>();
    }

    public static Zoo getInstance()
    {
        return instance;
    }

    public void addObserver(ZooObserver observer)
    {
        this.observers.add(observer);
    }

    public void addAnimal(Animal animal)
    {
        if(this.dictionary.containsKey(animal.getName()))
        {
            this.dictionary.put(animal.getName(), this.dictionary.get(animal.getName()) + 1);
        }
        else
        {
            dictionary.put(animal.getName(), 1);
        }
        animals.add(animal);
        notifyObservers(animal.getName() + " has been added to the zoo!");
    }

    public void feedAnimals()
    {
        if(this.hunger > 1)
            this.hunger--;
        for(Animal animal: this.animals)
        {
            animal.eat();
        }
        notifyObservers("The animals are being fed");
    }

    public void watchAnimals()
    {
        if(this.happiness < 5)
            this.happiness++;
        if(this.hunger < 5)
            this.hunger++;
        for(Animal animal: this.animals)
        {
            animal.participateInShow();
        }
        notifyObservers("The animals are being watched");
    }

    public void notifyObservers(String message)
    {
        System.out.println("Notifying observers:");
        for(ZooObserver observer: observers)
        {
            observer.update(message);
        }
    }

    public void showAnimalsInfo()
    {
        System.out.println("The zoo contains total of " + this.animals.size() + " animals:");
        for(String animal_name: this.dictionary.keySet())
        {
            System.out.println("- " + animal_name + ": " + this.dictionary.get(animal_name));
        }

        System.out.println("Happiness level: " + this.happiness);
        if(this.happiness < 3)
        {
            System.out.println("The animals are not happy, you should watch them...");
        }
        else if(this.happiness > 3)
        {
            System.out.println("The animals are very happy, keep working hard...");
        }

        System.out.println("Hunger level: " + this.happiness);
        if(this.hunger > 3)
        {
            System.out.println("The animals are hungry, you should feed them...");
        }
    }

    public void removeObserver(ZooObserver observer)
    {
        this.observers.remove(observer);
    }
}
