import java.util.*;


public class Zoo
{
    private static Zoo instance = null;

    private ArrayList<Observer> observers;
    private ArrayList<Animal> animals;
    private HashMap<String, Integer> animalHistogram;
    private int hunger;
    private int happiness;

    /**
     * initializes class attributes.
     * private method because we
     * are using the Singleton design method.
     */
    private Zoo()
    {
        this.observers = new ArrayList<>();
        this.happiness = 2;
        this.hunger = 3;
        this.animalHistogram = new HashMap<>();
        this.animals = new ArrayList<>();
    }

    /**
     * return an instance of Zoo
     * using the Singleton design pattern.
     */
    public static Zoo getInstance()
    {
        if (instance == null)
        {
            System.out.println("Creating zoo...");
            instance = new Zoo();
            return instance;
        }
        System.out.println("The zoo already exists...");
        return instance;
    }

    /**
     * add new observer to the list of
     * observers observing the Zoo subject
     */
    public void addObserver(Observer observer)
    {
        this.observers.add(observer);
    }

    /**
     * add new animal to the list of
     * animals in the Zoo.
     * increment the amount of animals in the zoo
     * of the same type of the new animal (using a hash map
     * that maps animal type to number of those animals in the zoo)
     */
    public void addAnimal(Animal animal)
    {
        if(this.animalHistogram.containsKey(animal.getName()))
        {
            this.animalHistogram.put(animal.getName(),
                    this.animalHistogram.get(animal.getName()) + 1);
        }
        else
        {
            animalHistogram.put(animal.getName(), 1);
        }
        animals.add(animal);
        //notify observers of the addition
        notifyObservers(animal.getName() + " has been added to the zoo!");
    }

    /**
     * feed all the animals in the zoo
     * and decrement the hunger attribute
     * of the zoo.
     */
    public void feedAnimals()
    {
        //keep hunger levels in range
        if(this.hunger > 1)
            this.hunger--;
        for(Animal animal: this.animals)
        {
            animal.eat();
        }
        //notify observers of the feeding
        notifyObservers("The animals are being fed");
    }

    /**
     * watch the animals in the zoo
     * participate in the show.
     */
    public void watchAnimals()
    {
        //keep happiness and hunger levels in range
        if(this.happiness < 5)
            this.happiness++;
        if(this.hunger < 5)
            this.hunger++;
        for(Animal animal: this.animals)
        {
            animal.participateInShow();
        }
        //notify observers of the show
        notifyObservers("The animals are being watched");
    }

    /**
     * send a message to all the observers
     * of the zoo.
     */
    public void notifyObservers(String message)
    {
        System.out.println("Notifying observers:");
        for(Observer observer: observers)
        {
            observer.update(message);
        }
    }

    /**
     * print info about the zoo and its animals:
     *  - number of each type
     *  - happiness and hunger levels
     */
    public void showAnimalsInfo()
    {
        System.out.println("The zoo contains total of " +
                this.animals.size() + " animals:");
        for(String animal_name: this.animalHistogram.keySet())
        {
            System.out.println("- " + animal_name + ": " +
                    this.animalHistogram.get(animal_name));
        }

        System.out.println("Happiness level: " + this.happiness);
        if(this.happiness < 3)
        {
            System.out.println("The animals are not happy, " +
                    "you should watch them...");
        }
        else
        {
            System.out.println("The animals are very happy, " +
                    "keep working hard...");
        }

        System.out.println("Hunger level: " + this.hunger);
        if(this.hunger > 3)
        {
            System.out.println("The animals are hungry, " +
                    "you should feed them...");
        }
    }

    /**
     * remove an observer from the list of
     * observers observing the Zoo subject.
     */
    public void removeObserver(Observer observer)
    {
        this.observers.remove(observer);
    }
}
