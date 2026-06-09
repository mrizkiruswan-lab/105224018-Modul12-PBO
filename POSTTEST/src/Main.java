public class Main {

    public static void main(String[] args) {

        PaymentMethod payment =
                new CreditCard();

        EmailNotifier notifier =
                new EmailSystem();

        OrderService orderService =
                new OrderService(
                        payment,
                        notifier);

        orderService.processOrder(
                500000);
    }
}