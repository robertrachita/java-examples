public  abstract class Student
{

    private int age;
    public Student(int age)
    {
        this.age = age;
    }

    public  int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public int ageSomething() throws MyException
    {
        verify Verify = new verify();

        age = Verify.calculateAge(this) + age;
        if(age > 20)
        {
            throw new MyException("Dude");
        }

        return age;
    }
}
