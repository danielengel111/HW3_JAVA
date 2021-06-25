public class Zebra implements Animal
{
    @Override
    public void eat()
    {
        System.out.println("The zebra is eating grass...");
    }

    @Override
    public void participateInShow()
    {
        System.out.println("The zebra is running...");
    }

    @Override
    public String getName()
    {
        return "Zebra";
    }
}
