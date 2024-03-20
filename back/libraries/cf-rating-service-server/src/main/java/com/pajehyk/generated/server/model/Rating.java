package com.pajehyk.generated.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Rating
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-20T15:24:56.187136+03:00[Europe/Moscow]", comments = "Generator version: 7.2.0")
public class Rating {

  private Integer value;

  public Rating() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Rating(Integer value) {
    this.value = value;
  }

  public Rating value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(this.value, rating.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

