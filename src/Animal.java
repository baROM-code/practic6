public class Animal
{
    protected String name;
    protected String color;
    protected int age;
    static int countAnimal = 0;

    public Animal(String name, String color, int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;
        countAnimal++;
    }

    public void info()
    {
        System.out.println("Имя:" + name + " Цвет:" + color + " Возраст:" + age);
    }

    public void run(int distance)
    {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance)
    {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}