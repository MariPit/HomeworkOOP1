package Human;

public class Human {
    public String name;
    public String town;
    public int age;
    public int yearOfBirth;
    String job;

    Human(String name, String town, int age, String job) {
        this.name = name;
        if (name == null) {
            this.name = "Информация не указана";
        }
        this.town = town;
        if (town == null) {
            this.town = "Информация не указана";
        }
        this.job = job;
        if (job == null) {
            this.job = "Информация не указана";
        }
        this.age = age;
        if (age < 0) {
            age = 0;
        }
        yearOfBirth = 2022 - age;

        }  //else { System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job+ ". Будем знакомы!");}
    }

