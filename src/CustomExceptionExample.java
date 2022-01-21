public class CustomExceptionExample
{
    public static void main(String args[])
    {
        //creating Test object.
        Test obj = new Test();

        //method call.
        try
        {
            obj.display();
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
