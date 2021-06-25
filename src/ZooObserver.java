public class ZooObserver
{
    private String name;

    public ZooObserver(String name)
    {
        this.name = name;
    }

    public void update(String message)
    {
        System.out.println("[" + name + "] " + message);
    }

    public String getName(){ return this.name; }
}
