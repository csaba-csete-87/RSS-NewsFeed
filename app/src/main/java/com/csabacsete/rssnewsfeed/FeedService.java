package com.csabacsete.rssnewsfeed;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;

public interface FeedService {
    @GET("/rss/frontpage")
    void getFeed(Callback<String> cb);
}
