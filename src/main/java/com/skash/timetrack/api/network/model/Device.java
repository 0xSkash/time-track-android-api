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
 * Device
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-26T14:19:40.134526+02:00[Europe/Berlin]")
public class Device {
  public static final String SERIALIZED_NAME_OS_VERSION = "osVersion";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private String manufacturer;

  public static final String SERIALIZED_NAME_PUSH_TOKEN = "pushToken";
  @SerializedName(SERIALIZED_NAME_PUSH_TOKEN)
  private String pushToken;

  public Device() {
  }

  public Device osVersion(String osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @javax.annotation.Nullable

  public String getOsVersion() {
    return osVersion;
  }


  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public Device model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public Device manufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @javax.annotation.Nullable

  public String getManufacturer() {
    return manufacturer;
  }


  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public Device pushToken(String pushToken) {
    
    this.pushToken = pushToken;
    return this;
  }

   /**
   * Get pushToken
   * @return pushToken
  **/
  @javax.annotation.Nullable

  public String getPushToken() {
    return pushToken;
  }


  public void setPushToken(String pushToken) {
    this.pushToken = pushToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.osVersion, device.osVersion) &&
        Objects.equals(this.model, device.model) &&
        Objects.equals(this.manufacturer, device.manufacturer) &&
        Objects.equals(this.pushToken, device.pushToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osVersion, model, manufacturer, pushToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
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

