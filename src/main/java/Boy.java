public class Boy implements Study, Player
{
    @Override
    public void read()
    {
        System.out.println("The boy is reading");
    }

    @Override
    public void write()
    {
        System.out.println("The boy is writing");
    }

    @Override
    public void play()
    {
        System.out.println("The boy is play");
    }
}
