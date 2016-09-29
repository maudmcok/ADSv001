package com.dmcokami.matok.adsv001.app.ServiceKami;

/**
 * Created by matok on 29/09/2016.
 */

import com.dmcokami.matok.adsv001.app.Model.ResponceAdsNews;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface KamiManager {
    //methode for see all  warriors
    @GET("news.php")
    Call<ResponceAdsNews> seeWarrior();
}
