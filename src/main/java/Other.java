public class Other implements Study, Player
{
    public void read()
    {
        System.out.println("The other is reading");
    }

    public void write()
    {
        System.out.println("The other is writing");
    }

    @Override
    public void play()
    {
        System.out.println("The other is play");
    }
}
