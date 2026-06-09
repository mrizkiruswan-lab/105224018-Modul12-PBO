public class OrderService {

    private PaymentMethod payment;
    private EmailNotifier notifier;

    public OrderService(
            PaymentMethod payment,
            EmailNotifier notifier) {

        this.payment = payment;
        this.notifier = notifier;
    }

    public void processOrder(
            double amount) {

        payment.pay(amount);

        notifier.sendEmail(
                "Pesanan berhasil diproses");
    }
}