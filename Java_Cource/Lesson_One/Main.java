
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        enum Command {ADD, LIST, EXIT}
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите команду (add/list/exit):");
                String commandString = scanner.nextLine().trim().toUpperCase();
                try {
                    Command command = Command.valueOf(commandString);
                    switch (command) {
                        case ADD:
                            String type = "";
                            while (!type.equals("cat") && !type.equals("dog") && !type.equals("duck")) {
                                System.out.println("Какое животное вы хотите добавить (cat/dog/duck)?");
                                type = scanner.nextLine().trim().toLowerCase();
                                if (!type.equals("cat") && !type.equals("dog") && !type.equals("duck")) {
                                    System.out.println("Неверный тип животного");
                                }
                            }
                            System.out.println("Введите имя:");
                            String name = scanner.nextLine().trim();
                            int age;
                            while (true) {
                                try {
                                    System.out.println("Введите возраст:");
                                    age = Integer.parseInt(scanner.nextLine().trim());
                                    if (age < 0) {
                                        System.out.println("Возраст не может быть отрицательным.");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Неправильный формат ввода. Введите число больше 0.");
                                }
                            }
                            double weight;
                            while (true) {
                                try {
                                    System.out.println("Введите вес:");
                                    weight = Double.parseDouble(scanner.nextLine().trim());
                                    if (weight < 0) {
                                        System.out.println("Вес не может быть отрицательным.");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Неправильный формат ввода. Введите число больше 0.");
                                }
                            }
                            System.out.println("Введите цвет:");
                            String color = scanner.nextLine().trim();
                            Animal animal;
                            switch (type) {
                                case "cat":
                                    animal = new Cat(name, age, weight, color);
                                    break;
                                case "dog":
                                    animal = new Dog(name, age, weight, color);
                                    break;
                                case "duck":
                                    animal = new Duck(name, age, weight, color);
                                    break;
                                default:
                                    continue; // This should never happen since we validated the input earlier
                            }
                            animals.add(animal);
                            animal.say();
                            break;
                        case LIST:
                            for (Animal a : animals) {
                                System.out.println(a.toString());
                            }
                            break;
                        case EXIT:
                            System.out.println("До свидания!");
                            return;
                        default:
                            System.out.println("Неправильная команда.");
                            continue;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Неправильная команда.");
                }
            }
        }
    }
    
}