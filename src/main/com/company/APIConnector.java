package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIConnector {
    public static String date = "2021-02-02";
    public static final String API_KEY = "67LWnsxMc5O95oVbWFZRxPmMamtjEUaw8I6UgnFE";
    public static final String URL_ADDRESS = "https://freecurrencyapi.net/api/v2/latest?apikey="+API_KEY;
    public String getCurrencyData() throws  Exception{
        URL urlForGetRequest = new URL(URL_ADDRESS);
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        int responseCode = conection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in.readLine()) != null) {
                response.append(readLine);
            }
            in.close();
            System.out.println(response.toString());
            return response.toString();
        } else {
            throw new Exception("Error in API Call");
        }
    }
}
