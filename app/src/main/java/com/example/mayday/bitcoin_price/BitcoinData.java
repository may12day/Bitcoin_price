package com.example.mayday.bitcoin_price;

import org.json.JSONException;
import org.json.JSONObject;


public class BitcoinData {

    // TODO: declare member variables:
    private String mCurrency;


    // TODO: parse json in a try-catch block
    public static BitcoinData fromJson(JSONObject jsonObject) {

        BitcoinData bitcoinData = new BitcoinData();

        try {
            double marketPrice = jsonObject.getDouble("last");
            bitcoinData.mCurrency = Double.toString(marketPrice);

            return bitcoinData;

        } catch (JSONException e) {
            e.printStackTrace();

            return null;
        }

    }

    public String getCurrency() {
        return mCurrency;
    }

}
