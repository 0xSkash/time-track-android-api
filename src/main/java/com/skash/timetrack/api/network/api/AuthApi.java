package com.skash.timetrack.api.network.api;

import com.skash.timetrack.api.network.CollectionFormats.*;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.skash.timetrack.api.network.model.ClientTokenResponse;
import com.skash.timetrack.api.network.model.UserResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AuthApi {
  /**
   * Login in User
   * Endpoint for User authentication
   * @param authorization Bearer Token used to authenticate user (required)
   * @param xAuth2FA 6 digit 2FA Code (optional)
   * @return Observable&lt;ClientTokenResponse&gt;
   */
  @POST("auth/login")
  Observable<ClientTokenResponse> authLoginPost(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Header("X-Auth-2FA") Integer xAuth2FA
  );

  /**
   * Disables 2FA for SelfUser
   * Endpoint for disabling 2FA for SelfUser
   * @param authorization Bearer Token used to authenticate user (required)
   * @param xAuth2FA 6 digit 2FA Code (optional)
   * @return Observable&lt;UserResponse&gt;
   */
  @POST("auth/me/disable-two-factor")
  Observable<UserResponse> authMeDisableTwoFactorPost(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Header("X-Auth-2FA") Integer xAuth2FA
  );

  /**
   * Enables 2FA for selfuser
   * Endpoint for enabling 2FA for selfuser
   * @param authorization Bearer Token used to authenticate user (required)
   * @param xAuth2FA 6 digit 2FA Code (optional)
   * @return Completable
   */
  @POST("auth/me/enable-two-factor")
  Completable authMeEnableTwoFactorPost(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Header("X-Auth-2FA") Integer xAuth2FA
  );

  /**
   * Returns the SelfUser
   * Endpoint for getting SelfUser
   * @param authorization Bearer Token used to authenticate user (required)
   * @return Observable&lt;UserResponse&gt;
   */
  @GET("auth/me")
  Observable<UserResponse> authMeGet(
    @retrofit2.http.Header("Authorization") String authorization
  );

}
