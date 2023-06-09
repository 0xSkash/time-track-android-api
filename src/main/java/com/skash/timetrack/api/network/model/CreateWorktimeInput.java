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
import java.util.Date;

/**
 * CreateWorktimeInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-27T16:29:15.381123+02:00[Europe/Berlin]")
public class CreateWorktimeInput {
  public static final String SERIALIZED_NAME_ENDED_AT = "endedAt";
  @SerializedName(SERIALIZED_NAME_ENDED_AT)
  private Date endedAt;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private Date startedAt;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public CreateWorktimeInput() {
  }

  public CreateWorktimeInput endedAt(Date endedAt) {
    
    this.endedAt = endedAt;
    return this;
  }

   /**
   * Get endedAt
   * @return endedAt
  **/
  @javax.annotation.Nullable

  public Date getEndedAt() {
    return endedAt;
  }


  public void setEndedAt(Date endedAt) {
    this.endedAt = endedAt;
  }


  public CreateWorktimeInput startedAt(Date startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable

  public Date getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(Date startedAt) {
    this.startedAt = startedAt;
  }


  public CreateWorktimeInput duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorktimeInput createWorktimeInput = (CreateWorktimeInput) o;
    return Objects.equals(this.endedAt, createWorktimeInput.endedAt) &&
        Objects.equals(this.startedAt, createWorktimeInput.startedAt) &&
        Objects.equals(this.duration, createWorktimeInput.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endedAt, startedAt, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorktimeInput {\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

