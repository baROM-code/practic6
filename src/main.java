public class main
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Васька", "Рыжый", 3);
        Cat cat2 = new Cat("Барсик", "Черный", 1);
        Dog dog1 = new Dog("Дружок", "Разноцветный", 4);
        Dog dog2 = new Dog("Тузик", "Белый", 2);

        cat1.info();
        cat1.run(30);
        cat1.swim(12);

        dog2.info();
        dog2.swim(7);

        // System.out.println("Всего животных: " + Animal.countAnimal);
        Animal[] Animals = {cat1, cat2, dog1, dog2};
        System.out.println("Всего животных: " + Animals.length);
    }
}
