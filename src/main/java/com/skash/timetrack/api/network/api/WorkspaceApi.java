package com.skash.timetrack.api.network.api;

import com.skash.timetrack.api.network.CollectionFormats.*;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.util.UUID;
import com.skash.timetrack.api.network.model.WorkspaceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface WorkspaceApi {
  /**
   * Returns all Workspaces who belong to the specified organizations for the authenticated user
   * Endpoint for workspace fetching
   * @param authorization Bearer Token used to authenticate user (required)
   * @param organizationId  (required)
   * @return Observable&lt;List&lt;WorkspaceResponse&gt;&gt;
   */
  @GET("organizations/{organizationId}/workspaces")
  Observable<List<WorkspaceResponse>> organizationsOrganizationIdWorkspacesGet(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("organizationId") UUID organizationId
  );

}
