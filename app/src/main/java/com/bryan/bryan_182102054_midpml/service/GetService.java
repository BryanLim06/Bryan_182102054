package com.bryan.bryan_182102054_midpml.service;

import com.bryan.bryan_182102054_midpml.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
