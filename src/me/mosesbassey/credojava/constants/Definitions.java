package me.mosesbassey.credojava.constants;

/**
 * @author Moses Bassey on 28/01/2021.
 */
public class Definitions {

    /**
     * The following are URL definitions for the Credo API. All URLs are
     * RESTful endpoints and as such modification of any of these URL resources
     * will lead to problems with querying the Credo API. Only modify if you
     * know what you are doing.
     */
    private final static String BASE_API_ENDPOINT = "https://credo-payments.nugitech.com/v1";

    //URL definitions for transaction endpoints
    public static final String CREDO_TRANSACTIONS_VERIFY_TRANSACTION = BASE_API_ENDPOINT + "/payment/request/";

    public static final String CREDO_PAYMENTS_CARD_THIRD_PARTY_PAY = BASE_API_ENDPOINT + "/payments/card/third-party/pay";
    public static final String CREDO_PAYMENTS_INITIATE = BASE_API_ENDPOINT + "/payments/initiate";
    public static final String CREDO_PAYMENTS_CARD_THIRD_3DS_VERIFY_CARD_NUMBER = BASE_API_ENDPOINT + "/payments/card/third-party/3ds-verify-card-number";
    public static final String CREDO_PAYMENTS_CARD_THIRD_3DS_PAY = BASE_API_ENDPOINT + "/payments/card/third-party/3ds-pay";
}
