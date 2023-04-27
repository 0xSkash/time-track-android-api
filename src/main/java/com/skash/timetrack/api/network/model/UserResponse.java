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
 * UserResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-27T11:16:47.057315+02:00[Europe/Berlin]")
public class UserResponse {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TWO_FACTOR_ENABLED = "twoFactorEnabled";
  @SerializedName(SERIALIZED_NAME_TWO_FACTOR_ENABLED)
  private Boolean twoFactorEnabled;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SELECTED_WORKSPACE_ID = "selectedWorkspaceId";
  @SerializedName(SERIALIZED_NAME_SELECTED_WORKSPACE_ID)
  private UUID selectedWorkspaceId;

  public static final String SERIALIZED_NAME_AVATAR_PATH = "avatarPath";
  @SerializedName(SERIALIZED_NAME_AVATAR_PATH)
  private String avatarPath;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public UserResponse() {
  }

  public UserResponse firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserResponse id(UUID id) {
    
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


  public UserResponse twoFactorEnabled(Boolean twoFactorEnabled) {
    
    this.twoFactorEnabled = twoFactorEnabled;
    return this;
  }

   /**
   * Get twoFactorEnabled
   * @return twoFactorEnabled
  **/
  @javax.annotation.Nullable

  public Boolean getTwoFactorEnabled() {
    return twoFactorEnabled;
  }


  public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
    this.twoFactorEnabled = twoFactorEnabled;
  }


  public UserResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserResponse selectedWorkspaceId(UUID selectedWorkspaceId) {
    
    this.selectedWorkspaceId = selectedWorkspaceId;
    return this;
  }

   /**
   * Get selectedWorkspaceId
   * @return selectedWorkspaceId
  **/
  @javax.annotation.Nullable

  public UUID getSelectedWorkspaceId() {
    return selectedWorkspaceId;
  }


  public void setSelectedWorkspaceId(UUID selectedWorkspaceId) {
    this.selectedWorkspaceId = selectedWorkspaceId;
  }


  public UserResponse avatarPath(String avatarPath) {
    
    this.avatarPath = avatarPath;
    return this;
  }

   /**
   * Get avatarPath
   * @return avatarPath
  **/
  @javax.annotation.Nullable

  public String getAvatarPath() {
    return avatarPath;
  }


  public void setAvatarPath(String avatarPath) {
    this.avatarPath = avatarPath;
  }


  public UserResponse lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.firstName, userResponse.firstName) &&
        Objects.equals(this.id, userResponse.id) &&
        Objects.equals(this.twoFactorEnabled, userResponse.twoFactorEnabled) &&
        Objects.equals(this.email, userResponse.email) &&
        Objects.equals(this.selectedWorkspaceId, userResponse.selectedWorkspaceId) &&
        Objects.equals(this.avatarPath, userResponse.avatarPath) &&
        Objects.equals(this.lastName, userResponse.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, id, twoFactorEnabled, email, selectedWorkspaceId, avatarPath, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    twoFactorEnabled: ").append(toIndentedString(twoFactorEnabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    selectedWorkspaceId: ").append(toIndentedString(selectedWorkspaceId)).append("\n");
    sb.append("    avatarPath: ").append(toIndentedString(avatarPath)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

