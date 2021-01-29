package me.mosesbassey.credojava.core;

import java.util.HashMap;

/**
 * @author Moses Bassey on 17/07/2016.
 */
public class ApiQuery {

    private HashMap<String, Object> queryMap;

    /**
     * Initializes a new query map
     */
    public ApiQuery() {
        this.queryMap = new HashMap<String, Object>();
    }

    /**
     * Used to add a parameter to the query map
     *
     * @param key
     * @param value
     */
    public void putParams(String key, Object value) {
        this.queryMap.put(key, value);
    }

    /**
     * Used to get all parameters within the query map
     *
     * @return - HashMap containing query parameters
     */
    public HashMap<String, Object> getParams() {
        return this.queryMap;
    }

}
