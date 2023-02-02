public class CreditPaymentService {
    // cv - creditValue - сумма кредита
    // cr - creditRate - годовая процентная ставка
    // ce - creditExpire - срок до окончания кредита в месяцах
    public int calculate(int cv, double cr, int ce){
        double annuityPayment = cv * ((cr / (100 * 12)) / (1 - (1 / Math.pow((1 + (cr / (100 * 12))), ce))));
        int myAnnuityPayment = (int) annuityPayment;
        return myAnnuityPayment;
    }
}
