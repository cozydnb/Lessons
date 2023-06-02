
public class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // Геттеры и сеттеры для всех свойств

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // конец геттеров и сеттеров

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    // создание сообщения

    @Override
    public String toString() {
        String yearSuffix = (age == 1 || (age > 20 && age % 10 == 1)) ? "год" :
                ((age >= 2 && age <= 4) || (age > 20 && age % 10 >= 2 && age % 10 <= 4)) ? "года" : "лет";
        return String.format("Привет! меня зовут %s, мне %d %s, я вешу - %.1f кг, мой цвет - %s",
                name, age, yearSuffix, weight, color);
    }
}

