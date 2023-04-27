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
import java.util.UUID;

/**
 * CreateTaskInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-27T11:49:05.753948+02:00[Europe/Berlin]")
public class CreateTaskInput {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private UUID project;

  public static final String SERIALIZED_NAME_ENDED_AT = "endedAt";
  @SerializedName(SERIALIZED_NAME_ENDED_AT)
  private Date endedAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private Date startedAt;

  public CreateTaskInput() {
  }

  public CreateTaskInput duration(Integer duration) {
    
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


  public CreateTaskInput project(UUID project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable

  public UUID getProject() {
    return project;
  }


  public void setProject(UUID project) {
    this.project = project;
  }


  public CreateTaskInput endedAt(Date endedAt) {
    
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


  public CreateTaskInput description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateTaskInput startedAt(Date startedAt) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTaskInput createTaskInput = (CreateTaskInput) o;
    return Objects.equals(this.duration, createTaskInput.duration) &&
        Objects.equals(this.project, createTaskInput.project) &&
        Objects.equals(this.endedAt, createTaskInput.endedAt) &&
        Objects.equals(this.description, createTaskInput.description) &&
        Objects.equals(this.startedAt, createTaskInput.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, project, endedAt, description, startedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTaskInput {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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

