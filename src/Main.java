public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int creditValue = 1000_000; // сумма кредита
        double creditRate = 9.99; // годовая процентная ставка
        //int creditExpire = 12; // срок до окончания кредита в месяцах

        System.out.println("для 12ти месяцев");
        System.out.println("Ежемесячный платеж равен " + service.calculate(creditValue, creditRate, 12) + " руб");
        System.out.println();
        System.out.println("для 24x месяцев");
        System.out.println("Ежемесячный платеж равен " + service.calculate(creditValue, creditRate, 24) + " руб");
        System.out.println();
        System.out.println("для 36ти месяцев");
        System.out.println("Ежемесячный платеж равен " + service.calculate(creditValue, creditRate, 36) + " руб");
        System.out.println();
    }
}