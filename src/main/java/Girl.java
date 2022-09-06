public class Girl implements Study, Player
{
    @Override
    public void read()
    {
        System.out.println("Girl is reading");
    }

    @Override
    public void write()
    {
        System.out.println("Girl is writing");
    }

    @Override
    public void play()
    {
        System.out.println("The girl is play");
    }
}
