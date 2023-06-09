package com.skash.timetrack.api.network.api;

import com.skash.timetrack.api.network.CollectionFormats.*;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.skash.timetrack.api.network.model.AvatarResponse;
import java.io.File;
import com.skash.timetrack.api.network.model.OrganizationResponse;
import com.skash.timetrack.api.network.model.SelectedWorkspaceInput;
import com.skash.timetrack.api.network.model.TaskResponse;
import com.skash.timetrack.api.network.model.UserInput;
import com.skash.timetrack.api.network.model.UserResponse;
import com.skash.timetrack.api.network.model.WorktimeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserApi {
  /**
   * Delets avatar of user
   * Endpoint for destroying avatar of authenticated user
   * @param authorization Bearer Token used to authenticate user (required)
   * @return Completable
   */
  @DELETE("users/me/avatar")
  Completable usersMeAvatarDelete(
    @retrofit2.http.Header("Authorization") String authorization
  );

  /**
   * Updates avatar of authenticated user
   * Endpoint for updating avatar of authenticated users
   * @param authorization Bearer Token used to authenticate user (required)
   * @param avatar  (optional)
   * @return Observable&lt;AvatarResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("users/me/avatar")
  Observable<AvatarResponse> usersMeAvatarPost(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Part MultipartBody.Part avatar
  );

  /**
   * Returns all Organizations of the authenticated user.
   * Endpoint for fetching of users organizations
   * @param authorization Bearer Token used to authenticate user (required)
   * @return Observable&lt;List&lt;OrganizationResponse&gt;&gt;
   */
  @GET("users/me/organizations")
  Observable<List<OrganizationResponse>> usersMeOrganizationsGet(
    @retrofit2.http.Header("Authorization") String authorization
  );

  /**
   * Updates selected workspace of authenticated user
   * Endpoint for updating selected workspace of authenticated users
   * @param authorization Bearer Token used to authenticate user (required)
   * @param selectedWorkspaceInput  (optional)
   * @return Observable&lt;UserResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/me/selected_workspace")
  Observable<UserResponse> usersMeSelectedWorkspacePut(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body SelectedWorkspaceInput selectedWorkspaceInput
  );

  /**
   * Returns tasks of the authenticated user.
   * Endpoint for fetching of users tasks
   * @param authorization Bearer Token used to authenticate user (required)
   * @return Observable&lt;List&lt;TaskResponse&gt;&gt;
   */
  @GET("users/me/tasks")
  Observable<List<TaskResponse>> usersMeTasksGet(
    @retrofit2.http.Header("Authorization") String authorization
  );

  /**
   * Returns worktimes of the authenticated user in specified.
   * Endpoint for fetching of users worktimes
   * @param authorization Bearer Token used to authenticate user (required)
   * @return Observable&lt;List&lt;WorktimeResponse&gt;&gt;
   */
  @GET("users/me/worktime")
  Observable<List<WorktimeResponse>> usersMeWorktimeGet(
    @retrofit2.http.Header("Authorization") String authorization
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
