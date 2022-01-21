public class Main
{
    public static void main(String[] args) throws MyException
    {


        Studenten studenten = new Studenten(20);
        System.out.println(studenten.getAge());
        studenten.ageSomething();
        System.out.println(studenten.getAge());
    }

}
