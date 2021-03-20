package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CQbOj3fDA3WwSJyppA8d8jLmQiVKCrEukNQ6odIv")
                .clientKey("JcQeW5DU1H2bg8Vu0NvJuFH2n4gGm1MyJQLjPDsN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

