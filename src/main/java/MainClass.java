import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 14, 'M');
        person1.printInfo();
        person1.changeAge(5);
        person1.changeName();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();

        BankAccount bankAccount1 = new BankAccount(1234567890, 1000);
        bankAccount1.replenishment();
        bankAccount1.withdrawal();

        Counter counter1 = new Counter(1, 2, 3);
        Counter counter2 = new Counter(2, 5,1);
        Counter counter3 = new Counter(0, 9, 4);
        System.out.println("count= " + Counter.getCount());

        Circle circle = new Circle(5.0);
        System.out.println("Площадь круга: " + circle.getArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        Animall animal = new Animall();
        animal.move(); // Вывод: Животное передвигается.

        Fish fish = new Fish();
        fish.move(); // Вывод: Рыба плавает.

        Bird bird = new Bird();
        bird.move(); // Вывод: Птица летает.

        Dogg dog = new Dogg();
        dog.move(); // Вывод: Собака бегает.

        University university = new University();

        university.addStudent(new Student("Юля Симакина", "Group 99", 85));
        university.addStudent(new Student("Кристина Соколовская", "Group 122", 92));
        university.addStudent(new Student("Яна Симакина", "Group 230", 75));
        university.addStudent(new Student("Маша Белова", "543", 88));

        List<Student> sortedByName = university.sortByName();
        System.out.println("Студенты, отсортированные по имени:");
        sortedByName.forEach(s -> System.out.println(s.getName() + " - " + s.getGroup() + " - " + s.getGrade()));

        List<Student> filteredByGrade = university.filterByGrade(80);
        System.out.println("\nСтуденты с оценкой 80 и выше:");
        filteredByGrade.forEach(s -> System.out.println(s.getName() + " - " + s.getGroup() + " - " + s.getGrade()));

        Store store = new Store();
        store.addProduct(new Product("Хлеб", 2.99, 50));
        store.addProduct(new Product("Чай", 1.75, 30));
        store.addProduct(new Product("Сахар", 1.25, 20));

        Optional<Product> foundProduct = store.findProductByName("Молоко");
        if (foundProduct.isPresent()) {
            System.out.println("Найден продукт: " + foundProduct.get().getName() + " - " + foundProduct.get().getPrice() + " - " + foundProduct.get().getQuantity());
        } else {
            System.out.println("Продукт не найден.");
        }

        store.removeProduct(store.findProductByName("Хлеб").get());

        List<Product> allProducts = store.getAllProducts();
        System.out.println("Все продукты в магазине:");
        allProducts.forEach(p -> System.out.println(p.getName() + " - " + p.getPrice() + " - " + p.getQuantity()));

        PaymentSystem creditCard = new CreditCard("1234567890123456", "12/25", 123);
        creditCard.pay(50.0);
        creditCard.refund(20.0);
        PaymentSystem paypal = new PayPal("user@example.com", "password123");
        paypal.pay(75.0);
        paypal.refund(30.0);

        MyClass1 obj1 = new MyClass1();
        MyClass1 obj2 = new MyClass1();
        MyClass2 obj3 = new MyClass2();
        MyClass2 obj4 = new MyClass2();
        System.out.println(obj1.getId());
        System.out.println(obj2.getId());
        System.out.println(obj3.getId());
        System.out.println(obj4.getId());

        Point topLeft = new Point(0, 5);
        Point bottomRight = new Point(4, 0);
        Rectangle2 rectangle = new Rectangle2(topLeft, bottomRight);
        double area = rectangle.calculateArea();
        System.out.println("Площадь прямоугольника: " + area);

        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(1, -2);
        ComplexNumber sum = c1.add(c2);
        ComplexNumber difference = c1.subtract(c2);
        ComplexNumber product = c1.multiply(c2);
        ComplexNumber quotient = c1.divide(c2);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 + c2 = " + sum);
        System.out.println("c1 - c2 = " + difference);
        System.out.println("c1 * c2 = " + product);
        System.out.println("c1 / c2 = " + quotient);

        // Перегрузка конструктора
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix m1 = new Matrix(data);
        System.out.println("Matrix m1:");
        System.out.println(m1);
        // Перегрузка метода add
        Matrix m2 = new Matrix(3, 3);
        m2.setValue(0, 0, 9);
        m2.setValue(1, 1, 9);
        m2.setValue(2, 2, 9);
        System.out.println("\nMatrix m2:");
        System.out.println(m2);
        Matrix m3 = m1.add(m2);
        System.out.println("\nMatrix m1 + m2:");
        System.out.println(m3);
        // Перегрузка метода multiply
        Matrix m4 = m1.multiply(m2);
        System.out.println("\nMatrix m1 * m2:");
        System.out.println(m4);

        Weapon sword = new Weapon("Зачарованный Арбалет", 10);
        Player player = new Player("Стив", 100, 20, sword);
        Enemy goblin = new Enemy("Гоблин", 50, 15);
        player.attack(goblin);
        goblin.attack(player);
        player.heal(20);

        Product2 laptop = new Product2("Ноутбук", 999.99);
        Product2 phone = new Product2("Телефон", 499.99);
        Product2 monitor = new Product2("Монитор", 299.99);
        Customer john = new Customer("Джон");
        Customer jane = new Customer("Джейн");

        Order order1 = new Order(john);
        order1.addProduct(laptop);
        order1.addProduct(phone);
        john.placeOrder(order1);

        Order order2 = new Order(jane);
        order2.addProduct(monitor);
        order2.addProduct(phone);
        jane.placeOrder(order2);

        System.out.println("Заказы клиента " + john.getName() + ":");
        for (Order order : john.getOrders()) {
            System.out.println("Общая стоимость заказа: $" + order.getTotalCost());
            for (Product2 product : order.getProducts()) {
                System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            }
        }
        System.out.println("Общая сумма, потраченная " + john.getName() + ": $" + john.getTotalSpent());

        System.out.println("\nЗаказы клиента " + jane.getName() + ":");
        for (Order order : jane.getOrders()) {
            System.out.println("Общая стоимость заказа: $" + order.getTotalCost());
            for (Product2 product : order.getProducts()) {
                System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            }
        }
        System.out.println("Общая сумма, потраченная " + jane.getName() + ": $" + jane.getTotalSpent());

        Smartphone iPhone = new Smartphone("iPhone");
        Laptop macBook = new Laptop("MacBook");
        iPhone.turnOn();
        iPhone.takePhoto();
        iPhone.turnOff();
        macBook.turnOn();
        macBook.openLaptop();
        macBook.closeLaptop();
        macBook.turnOff();


    }
}

//Задача 1. Класс "Человек"
class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printInfo(){
        System.out.println("Имя: " + name + "; Возраст: " + age + "; Пол: " + gender);
    }

    public void changeAge(int num){
        age = this.age + num;
        System.out.println("Имя: " + name + "; Возраст: " + age + "; Пол: " + gender);
    }

    public void changeName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новое имя: ");
        name = scanner.nextLine();
        System.out.println("Имя: " + name + "; Возраст: " + age + "; Пол: " + gender);
    }

}

//Задача 2. Наследование: Класс "Работник" и "Менеджер"
class Worker extends Person{

    public Worker(String name, int age, char gender) {
        super(name, age, gender);
    }

    private int salary;
}

class Manager extends Worker{

    public Manager(String name, int age, char gender) {
        super(name, age, gender);
    }

    private String employee;
}

//Задача 3. Полиморфизм: Животные
interface Animal{
    static void makeSound(){
    }
}

class Cat implements Animal {
    static void makeSound(){
        System.out.println("meow");
    }
}

class Dog implements Animal {
    static void makeSound(){
        System.out.println("bark");
    }
}

class Cow implements Animal {
    static void makeSound(){
        System.out.println("mooow");
    }
}

//Задача 4. Абстрактный класс "Транспорт"

abstract class Transport{
    abstract void move(int x, int y);
}

class Car extends Transport{
    void move(int x, int y){
        
    }
}

class Bike extends Transport{
    void move(int x, int y){

    }
}

//Задача 5. Класс "Книга" и "Библиотека"

class Book{
    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    Book book = new Book("Коралина в стране кошмаров", "Нил Гейман", "2002");
}

class Library extends Book{

    public Library(String title, String author, String year) {
        super(title, author, year);
    }

    ArrayList<String> list = new ArrayList<>();
}

//Задача 6.  Инкапсуляция: Банк

class BankAccount{
    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void replenishment(){
        int N;
        System.out.println("На какую сумму Вы хотите пополнить счет?");
        Scanner scanner = new Scanner(System.in);
         N = Integer.parseInt(scanner.nextLine());
        System.out.println("Ваш счет пополнен\nБаланс составляет: " + (balance + N));
    }

    void withdrawal(){
        int M;
        System.out.println("Какую сумму Вы хотите снять со счета?");
        Scanner scanner = new Scanner(System.in);
        M = Integer.parseInt(scanner.nextLine());
        System.out.println("С Вашего счета списаны деньги\nБаланс составляет: " + (balance - M));
    }
}

//Задача 7. Счетчик объектов

class Counter{
    private static int count;
    private int a;
    private int b;
    private int c;

    public Counter(int a, int b, int c) {
        //this();
        this.a = a;
        this.b = b;
        this.c = c;
        count++;
    }

    public static int getCount(){
        return count;
    }
}

//Задача 8. Площадь фигур
abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

//Задача 9. Наследование: Животные и их движения
class Animall {
    public void move() {
        System.out.println("Бегает");
    }
}

class Fish extends Animall {
    public void move() {
        System.out.println("Плавает");
    }
}

class Bird extends Animall {
    public void move() {
        System.out.println("Летает");
    }
}

class Dogg extends Animall {
    public void move() {
        System.out.println("Бегает");
    }
}

//Задача 10. Работа с коллекциями: Университет

class Student {
    private String name;
    private String group;
    private int grade;

    public Student(String name, String group, int grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getGrade() {
        return grade;
    }
}

class University {
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> sortByName() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public List<Student> filterByGrade(int minGrade) {
        return students.stream()
                .filter(s -> s.getGrade() >= minGrade)
                .collect(Collectors.toList());
    }
}

//Задача 11. Класс "Магазин"

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Optional<Product> findProductByName(String name) {
        return products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}

//Задача 12. Интерфейс "Платежная система"

interface PaymentSystem {
    void pay(double amount);
    void refund(double amount);
}
class CreditCard implements PaymentSystem {
    private String cardNumber;
    private String expirationDate;
    private int cvv;

    public CreditCard(String cardNumber, String expirationDate, int cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public void pay(double amount) {
        System.out.println("Оплата картой на сумму " + amount + " долларов.");
    }

    public void refund(double amount) {
        System.out.println("Возврат на карту " + amount + " долларов.");
    }
}

class PayPal implements PaymentSystem {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount + " долларов.");
    }
    public void refund(double amount) {
        System.out.println("Возврат через PayPal " + amount + " долларов.");

    }
}

//Задача 13. Генерация уникальных идентификаторов

class UniqueID {
    private static int nextId = 1;

    public static int getNextId() {
        return nextId++;
    }
}

class MyClass1 {
    private int id;

    public MyClass1() {
        this.id = UniqueID.getNextId();
    }

    public int getId() {
        return id;
    }
}

class MyClass2 {
    private int id;

    public MyClass2() {
        this.id = UniqueID.getNextId();
    }

    public int getId() {
        return id;
    }
}

//Задача 14. Класс "Точка" и "Прямоугольник"

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Rectangle2 {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle2(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double calculateArea() {
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();
        return width * height;
    }
}

//Задача 15. Комплексные числа

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}

//Задача 16.  Перегрузка операторов: Матрица

class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public Matrix(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int getValue(int row, int col) {
        return data[row][col];
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public Matrix add(Matrix other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (cols != other.rows) {
            throw new IllegalArgumentException("The number of columns in the first matrix must be equal to the number of rows in the second matrix");
        }

        Matrix result = new Matrix(rows, other.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                int sum = 0;
                for (int k = 0; k < cols; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

//Задача 17. Создание игры с использованием ООП
abstract class Character {
    protected String name;
    protected int health;
    protected int strength;

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public abstract void attack(Character target);

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isDead() {
        return this.health <= 0;
    }

    public String getName() {
        return this.name;
    }

    // Геттеры и сеттеры
}

class Player extends Character {
    private Weapon weapon;

    public Player(String name, int health, int strength, Weapon weapon) {
        super(name, health, strength);
        this.weapon = weapon;
    }

    @Override
    public void attack(Character target) {
        int damage = this.strength + this.weapon.getDamage();
        target.takeDamage(damage);
        System.out.println(this.name + " атакует " + target.getName() + " с помощью " + this.weapon.getName() + " и наносит " + damage + " урона.");
    }

    public void heal(int amount) {
        this.health += amount;
        System.out.println(this.name + " восстанавливает " + amount + " здоровья.");
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
}

class Enemy extends Character {
    public Enemy(String name, int health, int strength) {
        super(name, health, strength);
    }

    @Override
    public void attack(Character target) {
        int damage = this.strength;
        target.takeDamage(damage);
        System.out.println(this.name + " атакует " + target.getName() + " и наносит " + damage + " урона.");
    }
}

class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getName() {
        return this.name;
    }
}

//Задача 18. Автоматизированная система заказов
class Product2 {
    private String name;
    private double price;

    public Product2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public double getTotalSpent() {
        double total = 0;
        for (Order order : orders) {
            total += order.getTotalCost();
        }
        return total;
    }
}

class Order {
    private Customer customer;
    private List<Product2> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product2 product) {
        products.add(product);
    }

    public double getTotalCost() {
        double total = 0;
        for (Product2 product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product2> getProducts() {
        return products;
    }
}

//Задача 19. Наследование: Электроника
class Device {
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println(brand + " включен.");
    }

    public void turnOff() {
        System.out.println(brand + " выключен.");
    }
}

class Smartphone extends Device {
    public Smartphone(String brand) {
        super(brand);
    }

    public void takePhoto() {
        System.out.println(brand + " делает фото.");
    }
}

class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }

    public void openLaptop() {
        System.out.println(brand + " открыт.");
    }

    public void closeLaptop() {
        System.out.println(brand + " закрыт.");
    }
}

//Задача 20. Игра "Крестики-нолики"

class Player2 {
    private char symbol;
    private String name;

    public Player2(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}

class Game {
    private char[][] board;
    Player2[] players;
    int currentPlayerIndex;

    public Game(Player2 player1, Player2 player2) {
        this.players = new Player2[]{player1, player2};
        this.currentPlayerIndex = 0;
        this.board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean makeMove(int row, int col) {
        if (board[row][col] == '-') {
            board[row][col] = players[currentPlayerIndex].getSymbol();
            togglePlayer();
            return true;
        }
        return false;
    }

    private void togglePlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    }

    public boolean isGameOver() {
        return checkWin() || checkDraw();
    }

    boolean checkWin() {
        char symbol = players[currentPlayerIndex].getSymbol();

        // Проверка строк
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }

        // Проверка столбцов
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }

        // Проверка диагоналей
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    private boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

class TicTacToe {
    public static void main(String[] args) {
        Player2 player1 = new Player2('X', "Игрок 1");
        Player2 player2 = new Player2('O', "Игрок 2");
        Game game = new Game(player1, player2);

        while (!game.isGameOver()) {
            game.printBoard();
            System.out.println(game.players[game.currentPlayerIndex].getName() + ", ваш ход.");
            int row, col;
            do {
                System.out.print("Введите строку (0-2): ");
                row = Integer.parseInt(System.console().readLine());
                System.out.print("Введите столбец (0-2): ");
                col = Integer.parseInt(System.console().readLine());
            } while (!game.makeMove(row, col));
        }

        game.printBoard();
        if (game.checkWin()) {
            System.out.println(game.players[game.currentPlayerIndex].getName() + " победил!");
        } else {
            System.out.println("Ничья!");
        }
    }
}

