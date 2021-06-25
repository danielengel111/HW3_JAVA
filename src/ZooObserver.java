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

    /**
     * setter fo name attribute
     * @param name - the new name
     */
    public void setName(String name){
        this.name = name;
    }
}
