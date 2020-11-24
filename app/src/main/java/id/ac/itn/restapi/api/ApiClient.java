package id.ac.itn.restapi.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private final static String API_KEY = "24b8e4999d13a7dbaad86a4ec653631e";
    private static final String BASE_URL = "https://api.themoviedb.org/3/";

    public static Retrofit retrofit;

    public static String getApiKey() {
        return API_KEY;
    }

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

