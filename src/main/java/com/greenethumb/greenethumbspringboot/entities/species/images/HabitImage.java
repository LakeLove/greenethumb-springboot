package com.greenethumb.greenethumbspringboot.entities.species.images;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class HabitImage {
  private Long id;
  private String image_url;
  private String copyright;
  
  public HabitImage() {}
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getImage_url() {
    return image_url;
  }
  
  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }
  
  public String getCopyright() {
    return copyright;
  }
  
  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }
}