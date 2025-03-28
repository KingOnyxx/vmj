package aisco.donation.transferbank;

import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;
import java.util.UUID;

public class DonationImpl extends DonationComponent {
    PaymentPage payment;
    private String transactionID;
    private String currency;
    private String bankName;
    private String accountSender;
    private String accountReceiver;

    public DonationImpl(String currency, String bankName, String accountSender,
            String accountReceiver) {
        System.out.println("\nDonation via Bank Transfer");
        payment = PaymentPageFactory.createPaymentPage("payment.page.core.PaymentPageImpl");
        this.transactionID = UUID.randomUUID().toString();
        this.currency = currency;
        this.bankName = bankName;
        this.accountSender = accountSender;
        this.accountReceiver = accountReceiver;
    }

    public void getDonation() {

        payment.getTransaction();
    }

    public void addDonation() {

        payment.addTransaction();
    }

    public void processPayment() {
        if (payment != null) {
            System.out.println("Processing payment...");
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Payment page is not initialized.");
        }
    }

    public String getPaymentDetails() {
        return "Transaction ID: " + transactionID + "\n" +
                "Currency: " + currency + "\n" +
                "Bank Name: " + bankName + "\n" +
                "Account Sender: " + accountSender + "\n" +
                "Account Receiver: " + accountReceiver;
    }

}
