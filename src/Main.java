public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();//объект
        int monthPayOneYear = service.calculate(1_000_000, 1, 9.99);//функция
        System.out.println("Ежемесячный платеж, срок 1год  " + monthPayOneYear + "руб.");
        int monthPayTwoYear = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж, срок 2года  " + monthPayTwoYear + "руб.");
        int monthPayTreeYear = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж, срок 3года  " + monthPayTreeYear + "руб.");
    }
}