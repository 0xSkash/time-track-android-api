# ClientApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**organizationsOrganizationIdWorkspacesWorkspaceIdClientsGet**](ClientApi.md#organizationsOrganizationIdWorkspacesWorkspaceIdClientsGet) | **GET** organizations/{organizationId}/workspaces/{workspaceId}/clients | Returns all Clients who belong to the specified workspace |
| [**organizationsOrganizationIdWorkspacesWorkspaceIdClientsPost**](ClientApi.md#organizationsOrganizationIdWorkspacesWorkspaceIdClientsPost) | **POST** organizations/{organizationId}/workspaces/{workspaceId}/clients | Creates a client for the specified workspace |



## organizationsOrganizationIdWorkspacesWorkspaceIdClientsGet

> List&lt;ClientResponse&gt; organizationsOrganizationIdWorkspacesWorkspaceIdClientsGet(authorization, organizationId, workspaceId)

Returns all Clients who belong to the specified workspace

Endpoint for Client fetching

### Example

```java
// Import classes:
import com.skash.timetrack.api.network.ApiClient;
import com.skash.timetrack.api.network.ApiException;
import com.skash.timetrack.api.network.Configuration;
import com.skash.timetrack.api.network.models.*;
import com.skash.timetrack.api.network.api.ClientApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ClientApi apiInstance = new ClientApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Token used to authenticate user
        UUID organizationId = UUID.randomUUID(); // UUID | 
        UUID workspaceId = UUID.randomUUID(); // UUID | 
        try {
            List<ClientResponse> result = apiInstance.organizationsOrganizationIdWorkspacesWorkspaceIdClientsGet(authorization, organizationId, workspaceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientApi#organizationsOrganizationIdWorkspacesWorkspaceIdClientsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| Bearer Token used to authenticate user | |
| **organizationId** | **UUID**|  | |
| **workspaceId** | **UUID**|  | |

### Return type

[**List&lt;ClientResponse&gt;**](ClientResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **200** | List of Clients of the specified workspace |  -  |
| **400** | Workspace does not exist |  -  |


## organizationsOrganizationIdWorkspacesWorkspaceIdClientsPost

> ClientResponse organizationsOrganizationIdWorkspacesWorkspaceIdClientsPost(authorization, organizationId, workspaceId)

Creates a client for the specified workspace

Endpoint for Client Creation

### Example

```java
// Import classes:
import com.skash.timetrack.api.network.ApiClient;
import com.skash.timetrack.api.network.ApiException;
import com.skash.timetrack.api.network.Configuration;
import com.skash.timetrack.api.network.models.*;
import com.skash.timetrack.api.network.api.ClientApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ClientApi apiInstance = new ClientApi(defaultClient);
        String authorization = "authorization_example"; // String | Bearer Token used to authenticate user
        UUID organizationId = UUID.randomUUID(); // UUID | 
        UUID workspaceId = UUID.randomUUID(); // UUID | 
        try {
            ClientResponse result = apiInstance.organizationsOrganizationIdWorkspacesWorkspaceIdClientsPost(authorization, organizationId, workspaceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientApi#organizationsOrganizationIdWorkspacesWorkspaceIdClientsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| Bearer Token used to authenticate user | |
| **organizationId** | **UUID**|  | |
| **workspaceId** | **UUID**|  | |

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **200** | The created client |  -  |
| **400** | Workspace does not exist |  -  |

