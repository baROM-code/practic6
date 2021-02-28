public class Cat extends Animal
{
    public Cat(String name, String color, int age)
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
        System.out.println(name + " не умеет плавать!");
    }
}
