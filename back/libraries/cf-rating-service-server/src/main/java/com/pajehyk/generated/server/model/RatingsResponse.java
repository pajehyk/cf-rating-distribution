package com.pajehyk.generated.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pajehyk.generated.server.model.Rating;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RatingsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-20T15:24:56.187136+03:00[Europe/Moscow]", comments = "Generator version: 7.2.0")
public class RatingsResponse {

  @Valid
  private List<@Valid Rating> ratings;

  public RatingsResponse ratings(List<@Valid Rating> ratings) {
    this.ratings = ratings;
    return this;
  }

  public RatingsResponse addRatingsItem(Rating ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new ArrayList<>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

  /**
   * Get ratings
   * @return ratings
  */
  @Valid 
  @Schema(name = "ratings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratings")
  public List<@Valid Rating> getRatings() {
    return ratings;
  }

  public void setRatings(List<@Valid Rating> ratings) {
    this.ratings = ratings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingsResponse ratingsResponse = (RatingsResponse) o;
    return Objects.equals(this.ratings, ratingsResponse.ratings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingsResponse {\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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

