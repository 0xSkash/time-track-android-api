package com.skash.timetrack.api.network.api;

import com.skash.timetrack.api.network.CollectionFormats.*;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.skash.timetrack.api.network.model.CreateProjectInput;
import com.skash.timetrack.api.network.model.ProjectResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProjectApi {
  /**
   * Returns all Projects who belong to the selected workspace of the authenticated user
   * Endpoint for Project fetching
   * @param authorization Bearer Token used to authenticate user (required)
   * @return Observable&lt;List&lt;ProjectResponse&gt;&gt;
   */
  @GET("projects")
  Observable<List<ProjectResponse>> projectsGet(
    @retrofit2.http.Header("Authorization") String authorization
  );

  /**
   * Creates a project for the specified workspace
   * Endpoint for project Creation
   * @param authorization Bearer Token used to authenticate user (required)
   * @param createProjectInput  (optional)
   * @return Observable&lt;ProjectResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("projects")
  Observable<ProjectResponse> projectsPost(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body CreateProjectInput createProjectInput
  );

}
