package com.dmcokami.matok.adsv001.app.Model;

import java.util.List;

/**
 * Created by matok on 29/09/2016.
 */

public class ResponceAdsNews {

    public final String Error;
    public List<AdsNews> adsNews;


    public ResponceAdsNews(String error, List<AdsNews> adsNewses) {
        Error = error;
        adsNews =adsNewses;
    }
}
