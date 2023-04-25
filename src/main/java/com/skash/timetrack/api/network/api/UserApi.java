package com.skash.timetrack.api.network.api;

import com.skash.timetrack.api.network.CollectionFormats.*;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.io.File;
import com.skash.timetrack.api.network.model.UserInput;
import com.skash.timetrack.api.network.model.UserResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserApi {
  /**
   * Updates avatar of authenticated user
   * Endpoint for updating avatar of authenticated users
   * @param avatar  (optional)
   * @return Completable
   */
  @retrofit2.http.Multipart
  @POST("users/me/avatar")
  Completable usersMeAvatarPost(
    @retrofit2.http.Part MultipartBody.Part avatar
  );

  /**
   * Registers a new user
   * Endpoint for registration of users
   * @param userInput  (optional)
   * @return Observable&lt;UserResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/register")
  Observable<UserResponse> usersRegisterPost(
    @retrofit2.http.Body UserInput userInput
  );

}
