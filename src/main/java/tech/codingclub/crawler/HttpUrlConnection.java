package tech.codingclub.crawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnection {
    private final static String USER_AGENT = "Mozilla/5.0";

    // HTTP GET request
    public static String sendGet(String urlStr) throws Exception {

        StringBuilder result = new StringBuilder();
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("User-Agent", "Chrome");
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }


    public static void main(String[] args) {
        try {
            System.out.println(sendGet("https://songspk.mobi/bulleya-hindi-2019-mp3-song-spp04.html"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
