package com.greenethumb.greenethumbspringboot.entities.species;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class Sources {
  private String id;
  private String name;
  private String citation;
  private String url;
  private String last_update;
  
  public Sources() {}
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getCitation() {
    return citation;
  }
  
  public void setCitation(String citation) {
    this.citation = citation;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public String getLast_update() {
    return last_update;
  }
  
  public void setLast_update(String last_update) {
    this.last_update = last_update;
  }
}
