public class Monkey implements Animal
{
    @Override
    public void eat()
    {
        System.out.println("The monkey is eating a banana...");
    }

    @Override
    public void participateInShow()
    {
        System.out.println("The monkey is hanging on trees...");
    }

    @Override
    public String getName() {
        return "Monkey";
    }
}
