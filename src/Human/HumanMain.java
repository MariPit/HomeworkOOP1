package Human;

public class HumanMain {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", "Минск", 35,"бренд-менеджер");
        Human anna = new Human("Аня", "Москва", -29, "методист образовательных программ");
        Human kate = new Human(null, "Калининград",28,"продакт-менеджер");
        Human artem = new Human("Артем","Москва",27,"директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города " + maxim.town
                + ". Я родился в " + maxim.yearOfBirth + " году. Я работаю на должности " + maxim.job
                + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + ". Я из города " + anna.town
                + ". Я родился в " + anna.yearOfBirth + " году. Я работаю на должности " + anna.job
                + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + kate.name + ". Я из города " + kate.town
                + ". Я родился в " + kate.yearOfBirth + " году. Я работаю на должности " + kate.job
                + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.town
                + ". Я родился в " + artem.yearOfBirth + " году. Я работаю на должности " + artem.job
                + ". Будем знакомы!");
        //maxim.human();
        //anna.human();
        //kate.human();
        //artem.human();

    }
}
