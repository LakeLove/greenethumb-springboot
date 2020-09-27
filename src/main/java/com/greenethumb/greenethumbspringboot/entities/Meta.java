package com.greenethumb.greenethumbspringboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {
  private Integer images_count;
  private Date last_modified;
  private Integer sources_count;
  private Integer synonyms_count;
  private Integer total;
  
  public Meta() {}
}
