public class Dog extends Animal
{
    public Dog(String name, String color, int age)
    {
        super(name, color, age);
    }

    @Override
    public void run(int distance)
    {
        if (distance <= 200) super.run(distance);
    }

    @Override
    public void swim(int distance)
    {
        if (distance <= 10) super.swim(distance);
    }
}
