public class Unicorn implements Animal
{
    @Override
    public void eat()
    {
        System.out.println("The unicorn is eating rainbow cakes...");
    }

    @Override
    public void participateInShow()
    {
        System.out.println("The unicorn is flying...");
    }

    @Override
    public String getName() {
        return "Unicorn";
    }
}
