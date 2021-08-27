package me.mosesbassey.credojava.core;

import me.mosesbassey.credojava.constants.Definitions;

import org.json.JSONObject;
import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author Moses Bassey on 28/01/2021.
 */
public class Payments {

    private ApiConnection apiConnection;

    /**
     * Used to initialize a transaction
     *
     * @param
     * @param amount
     * @param customerEmail
     * @param customerPhoneNo
     * @param paymentOptions
     * @param transRef
     * @param customerName
     * @param currency
     * @param redirectUrl
     * @return
     */
    public JSONObject initiatePayments(String transRef, String amount, String customerEmail,
                                            String customerName, String paymentOptions, String customerPhoneNo, String currency, String redirectUrl)
    {
        this.apiConnection = new ApiConnection(Definitions.CREDO_PAYMENTS_INITIATE);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("transRef", transRef);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("customerEmail", customerEmail);
        apiQuery.putParams("customerName", customerName);
        apiQuery.putParams("paymentOptions", paymentOptions);
        apiQuery.putParams("customerPhoneNo", customerPhoneNo);
        apiQuery.putParams("currency", currency);
        apiQuery.putParams("redirectUrl", redirectUrl);
        return this.apiConnection.connectAndQuery(apiQuery);
    }

    /**
     * Used for card payments
     * @param
     * @param expiryMonth
     * @param securityCode
     * @param expiryYear
     * @param orderAmount
     * @param orderCurrency
     * @param customerEmail
     * @param customerName
     * @param transRef
     * @param securityCode
     * @return
     */
    public JSONObject thirdPartyPay(String transRef, String orderAmount, String customerEmail, String customerName,
                                       String securityCode, String cardNumber, String customerPhoneNo, String expiryMonth, String orderCurrency, String expiryYear)
    {
        this.apiConnection = new ApiConnection(Definitions.CREDO_PAYMENTS_CARD_THIRD_PARTY_PAY);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("transRef", transRef);
        apiQuery.putParams("orderAmount", orderAmount);
        apiQuery.putParams("customerEmail", orderAmount);
        apiQuery.putParams("cardNumber", cardNumber);
        apiQuery.putParams("customerPhoneNo", customerPhoneNo);
        apiQuery.putParams("customerName", customerName);
        apiQuery.putParams("securityCode", securityCode);
        apiQuery.putParams("orderCurrency", orderCurrency);
        apiQuery.putParams("expiryMonth", expiryMonth);
        apiQuery.putParams("orderCurrency", orderCurrency);
        apiQuery.putParams("expiryYear", expiryYear);
        return this.apiConnection.connectAndQuery(apiQuery);
    }

    /**
     * Used for card payments
     * @param
     * @param cardNumber
     * @param orderCurrency
     * @return
     **/
    public JSONObject verifyCardNumber(String cardNumber, String orderCurrency, String paymentSlug)
    {
        this.apiConnection = new ApiConnection(Definitions.CREDO_PAYMENTS_CARD_THIRD_3DS_VERIFY_CARD_NUMBER);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("cardNumber", cardNumber);
        apiQuery.putParams("orderCurrency", orderCurrency);
        apiQuery.putParams("paymentSlug", paymentSlug);
        return this.apiConnection.connectAndQuery(apiQuery);
    }

    /**
     * Used for card payments
     * @param
     * @param customerName
     * @param transRef
     * @param currency
     * @param paymentOptions
     * @param amount
     * @param currency
     * @param reason
     * @param customerPhoneNo
     * @param customerEmail
     * @param redirectUrl
     * @return
     **/
    public JSONObject pay(String transRef, 
        String amount, String customerEmail,
                                       String customerName, String paymentOptions, String customerPhoneNo, String currency, String redirectUrl)
    {
        this.apiConnection = new ApiConnection(Definitions.CREDO_PAYMENTS_CARD_THIRD_3DS_PAY);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("transRef", transRef);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("customerEmail", customerEmail);
        apiQuery.putParams("customerName", customerName);
        apiQuery.putParams("paymentOptions", paymentOptions);
        apiQuery.putParams("customerPhoneNo", customerPhoneNo);
        apiQuery.putParams("currency", currency);
        apiQuery.putParams("redirectUrl", redirectUrl);
        return this.apiConnection.connectAndQuery(apiQuery);
    }


}
