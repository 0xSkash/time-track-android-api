package com.skash.timetrack.api.network.api;

import com.skash.timetrack.api.network.CollectionFormats.*;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.skash.timetrack.api.network.model.ClientResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ClientApi {
  /**
   * Returns all Clients who belong to the specified workspace
   * Endpoint for Client fetching
   * @param authorization Bearer Token used to authenticate user (required)
   * @param organizationId  (required)
   * @param workspaceId  (required)
   * @return Observable&lt;List&lt;ClientResponse&gt;&gt;
   */
  @GET("organizations/{organizationId}/workspaces/{workspaceId}/clients")
  Observable<List<ClientResponse>> organizationsOrganizationIdWorkspacesWorkspaceIdClientsGet(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("organizationId") UUID organizationId, @retrofit2.http.Path("workspaceId") UUID workspaceId
  );

  /**
   * Creates a client for the specified workspace
   * Endpoint for Client Creation
   * @param authorization Bearer Token used to authenticate user (required)
   * @param organizationId  (required)
   * @param workspaceId  (required)
   * @return Observable&lt;ClientResponse&gt;
   */
  @POST("organizations/{organizationId}/workspaces/{workspaceId}/clients")
  Observable<ClientResponse> organizationsOrganizationIdWorkspacesWorkspaceIdClientsPost(
    @retrofit2.http.Header("Authorization") String authorization, @retrofit2.http.Path("organizationId") UUID organizationId, @retrofit2.http.Path("workspaceId") UUID workspaceId
  );

}
