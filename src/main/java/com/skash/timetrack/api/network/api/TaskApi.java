package com.skash.timetrack.api.network.api;

import com.skash.timetrack.api.network.CollectionFormats.*;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.skash.timetrack.api.network.model.CreateTaskInput;
import com.skash.timetrack.api.network.model.TaskResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface TaskApi {
  /**
   * Creates a task entry for the authenticated user
   * Endpoint for worktime Creation
   * @param authorization Bearer Token used to authenticate user (required)
   * @param createTaskInput  (optional)
   * @return Observable&lt;TaskResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("tasks/")
  Observable<TaskResponse> tasksPost(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Body CreateTaskInput createTaskInput
  );

}
