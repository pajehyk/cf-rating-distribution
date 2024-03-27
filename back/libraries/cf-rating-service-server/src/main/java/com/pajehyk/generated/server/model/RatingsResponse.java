package com.pajehyk.generated.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pajehyk.generated.server.model.Rating;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-27T16:46:53.787980661+03:00[Europe/Moscow]")
public class RatingsResponse {

  @Valid
  private List<@Valid Rating> ratings;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateUpdated;

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

  public RatingsResponse dateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

  /**
   * Get dateUpdated
   * @return dateUpdated
  */
  @Valid 
  @Schema(name = "date_updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_updated")
  public OffsetDateTime getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
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
    return Objects.equals(this.ratings, ratingsResponse.ratings) &&
        Objects.equals(this.dateUpdated, ratingsResponse.dateUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings, dateUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingsResponse {\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
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

