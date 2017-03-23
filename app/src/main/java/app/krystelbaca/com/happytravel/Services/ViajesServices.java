package app.krystelbaca.com.happytravel.Services;

import java.util.List;

import app.krystelbaca.com.happytravel.dummy.Destino;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by krystelbaca on 3/23/17.
 */

public interface ViajesServices {

    @GET("/viajes")
    Call<List<Destino>> listDestinos();

    //@POST("/message")
    //Call<Message> send(@Body Message message);
}
