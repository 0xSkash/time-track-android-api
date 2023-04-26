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

/**
 * AvatarResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-26T14:19:40.134526+02:00[Europe/Berlin]")
public class AvatarResponse {
  public static final String SERIALIZED_NAME_AVATAR_NAME = "avatarName";
  @SerializedName(SERIALIZED_NAME_AVATAR_NAME)
  private String avatarName;

  public AvatarResponse() {
  }

  public AvatarResponse avatarName(String avatarName) {
    
    this.avatarName = avatarName;
    return this;
  }

   /**
   * Get avatarName
   * @return avatarName
  **/
  @javax.annotation.Nullable

  public String getAvatarName() {
    return avatarName;
  }


  public void setAvatarName(String avatarName) {
    this.avatarName = avatarName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvatarResponse avatarResponse = (AvatarResponse) o;
    return Objects.equals(this.avatarName, avatarResponse.avatarName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvatarResponse {\n");
    sb.append("    avatarName: ").append(toIndentedString(avatarName)).append("\n");
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

