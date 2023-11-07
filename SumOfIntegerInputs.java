public class SumOfIntegerInputs
{
    public static void main(String[] args)
    {
        if(args.length == 0)
        {
            System.out.println("Please input numbers in the arguments!");
        }

        int sum = 0;
        for (int num = 0; num < args.length; num++)
        {
            sum += Integer.parseInt (args[num]);
        }
        System.out.println("The sum of all the numbers (in the arguments) is " + sum + ".");
    }
}
