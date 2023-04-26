/*
 * Time Track API Docs
 * API Docs for the Time Track Backend
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.skash.timetrack.api.network.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.UUID;

/**
 * WorkspaceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-26T15:30:45.198318+02:00[Europe/Berlin]")
public class WorkspaceResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_IS_BILLABLE = "isBillable";
  @SerializedName(SERIALIZED_NAME_IS_BILLABLE)
  private Boolean isBillable;

  public static final String SERIALIZED_NAME_ORGANIZTION_ID = "organiztionId";
  @SerializedName(SERIALIZED_NAME_ORGANIZTION_ID)
  private UUID organiztionId;

  public WorkspaceResponse() {
  }

  public WorkspaceResponse id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public WorkspaceResponse title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public WorkspaceResponse isBillable(Boolean isBillable) {
    
    this.isBillable = isBillable;
    return this;
  }

   /**
   * Get isBillable
   * @return isBillable
  **/
  @javax.annotation.Nullable

  public Boolean getIsBillable() {
    return isBillable;
  }


  public void setIsBillable(Boolean isBillable) {
    this.isBillable = isBillable;
  }


  public WorkspaceResponse organiztionId(UUID organiztionId) {
    
    this.organiztionId = organiztionId;
    return this;
  }

   /**
   * Get organiztionId
   * @return organiztionId
  **/
  @javax.annotation.Nullable

  public UUID getOrganiztionId() {
    return organiztionId;
  }


  public void setOrganiztionId(UUID organiztionId) {
    this.organiztionId = organiztionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceResponse workspaceResponse = (WorkspaceResponse) o;
    return Objects.equals(this.id, workspaceResponse.id) &&
        Objects.equals(this.title, workspaceResponse.title) &&
        Objects.equals(this.isBillable, workspaceResponse.isBillable) &&
        Objects.equals(this.organiztionId, workspaceResponse.organiztionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, isBillable, organiztionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isBillable: ").append(toIndentedString(isBillable)).append("\n");
    sb.append("    organiztionId: ").append(toIndentedString(organiztionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

