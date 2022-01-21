public class verify implements Animal
{

    @Override
    public int calculateAge(Student student)
    {
        return student.getAge() * 15;
    }
}
