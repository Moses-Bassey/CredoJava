package me.mosesbassey.credojava.core;

import me.mosesbassey.credojava.constants.Definitions;

import org.json.JSONObject;
import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author Moses Bassey on 28/01/2021.
 */
public class Transactions {

    private ApiConnection apiConnection;


    /**
     * Used to verify a transaction
     *
     * @param reference
     * @return
     */
    public JSONObject verifyTransaction(String reference) {
        this.apiConnection = new ApiConnection(Definitions.CREDO_TRANSACTIONS_VERIFY_TRANSACTION + reference);
        return this.apiConnection.connectAndQueryWithGet();
    }


}
