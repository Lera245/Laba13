public class Main {
    public static void main(String[] args) {
        Myaso m = new Myaso("Свинина на кости", "420", "8");
        Pelmeni p = new Pelmeni("Пельмени Сибирские", "350", "9");
        Kotleta k = new Kotleta("Котлеты куриные", "280", "7");
        People s = new People("Анпилов Алексей  Владимирович", 26, "Программист");
        Teacher t= new Teacher("Никитин А. Н.", 53, "Директор школы");
        Student asanov = new Student("Цапулина П. Л. ", 19, "Председатель студсовета");
        Pocupatel kipishinov = new Pocupatel("Буженина", "510", "10", "Лазарев К. И", 21, "Системный администратор");

    }
}

interface Tovar {
    void t(String name, String price, String reiting);
}

interface User {
    void t1(String login, String password);
}

class Myaso implements Tovar {
    String name;
    String price;
    String reiting;

    Pelmeni(String name, String price, String reiting) {
        this.name = name;
        this.price = price;
        this.reiting = reiting;
    }

    public void t(String name, String price, String reiting) {
        System.out.println("название -" + name + ", цена -" + price + ", рейтинг -" + reiting);
    }
}

class Pelmeni extends Myaso {
    Pelmeni(String name, String price, String reiting) {
        super(name, price, reiting);
    }

    @Override
    public void t(String name, String price, String reiting) {
        System.out.println("название -" + name + ", цена -" + price + ", рейтинг -" + reiting);
    }
}

class Kotleta extends Myaso {
    Kotleta(String name, String price, String reiting) {
        super(name, price, reiting);
    }

    @Override
    public void t(String name, String price, String reiting) {
        System.out.println("название -" + name + ", цена -" + price + ", рейтинг -" + reiting);
    }
}

class People implements User {
    String fio;
    int age;
    String post;

    People(String fio, int age, String post) {
        this.fio = fio;
        this.age = age;
        this.post = post;
    }

    public void t1(String login, String password) {
        System.out.println("login" + login + ", password " + password);
    }
}

class Teacher extends People {
    Teacher(String fio, int age, String post) {
        super(fio, age, post);
    }

    @Override
    public void t1(String login, String password) {
        System.out.println("login" + login + ", password " + password);
    }
}

class Student extends People {
    Student(String fio, int age, String post) {
        super(fio, age, post);
    }

    @Override
    public void t1(String login, String password) {
        System.out.println("login" + login + ", password " + password);
    }
}

class Pocupatel implements Tovar, User {
    String name;
    String price;
    String reiting;
    String fio;
    int age;
    String post;

    Pocupatel(String name, String price, String reiting, String fio, int age, String post) {
        this.name = name;
        this.price = price;
        this.reiting = reiting;
        this.fio = fio;
        this.age = age;
        this.post = post;
    }

    public void t(String name, String price, String reiting) {
        System.out.println("название -" + name + ", цена -" + price + ", рейтинг -" + reiting);
    }

    public void t1(String login, String password) {
        System.out.println("login" + login + ", password " + password);
    }

    public void e(String name, String fio) {
        System.out.printf("покупатель %s купил товар %s", fio, name);
    }
    }
