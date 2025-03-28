package aisco.donation.cryptocurrency;

import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

public class DonationImpl extends DonationComponent {
    PaymentPage payment;
    private String transactionHash;
    private String walletAddress;
    private String tokenSymbol;
    private String blockchainNetwork;

    public DonationImpl(String transactionHash, String walletAddress, String tokenSymbol, String blockchainNetwork) {
        System.out.println("\nDonation via Cryptocurrency");
        payment = PaymentPageFactory.createPaymentPage("payment.page.core.PaymentPageImpl");
        this.transactionHash = transactionHash;
        this.walletAddress = walletAddress;
        this.tokenSymbol = tokenSymbol;
        this.blockchainNetwork = blockchainNetwork;
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
        return "Transaction Hash: " + transactionHash + "\n" +
                "Wallet Address: " + walletAddress + "\n" +
                "Token Symbol: " + tokenSymbol + "\n" +
                "Blockchain Network: " + blockchainNetwork;
    }

}
