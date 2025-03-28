package aisco.donation.pgateway;

import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;
import java.util.Date;

public class DonationImpl extends DonationComponent {
    PaymentPage payment;
    private String transactionID;
    private String currency;
    private String status;
    private Date paymentTimestamp;

    public DonationImpl(String transactionID, String currency, String status) {
        System.out.println("\nDonation via PayPal");
        payment = PaymentPageFactory.createPaymentPage("payment.page.core.PaymentPageImpl");
        this.transactionID = transactionID;
        this.currency = currency;
        this.status = status;
        this.paymentTimestamp = new Date();
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
                "Status: " + status + "\n" +
                "Payment Timestamp: " + paymentTimestamp;
    }

}
