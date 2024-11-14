public class Main
{
    public static void main(String[] args)
    {
        Dice d20 = new Dice(20);
        Dice d10 = new Dice(10);
        Dice d2 = new Dice(2);

        System.out.print(d2.roll());
    }
}