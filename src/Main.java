public class Main {

    public static void main(String[] args) {

        int ticketPrice = 10000; // стоимость билета
        int rublesPerOneMile = 20; // количество рублей для одной бонусной мили
        int bonus = ticketPrice / rublesPerOneMile; // бонусные мили

        System.out.println("Начисленные мили за купленный билет:" + bonus);
    }
}
