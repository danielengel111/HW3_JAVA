public class ZooObserver
{
    private String name;

    /**
     * initializes class attributes
     */
    public ZooObserver(String name)
    {
        this.name = name;
    }

    /**
     * print a message sent by subject
     * to this observer
     */
    public void update(String message)
    {
        System.out.println("[" + name + "] " + message);
    }

    /**
     * getter for name attribute
     */
    public String getName(){ return this.name; }

    /**
     * setter for name attribute
     * @param name - the new name
     */
    public void setName(String name){
        this.name = name;
    }
}
