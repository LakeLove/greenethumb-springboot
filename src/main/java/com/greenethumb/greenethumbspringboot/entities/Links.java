package com.greenethumb.greenethumbspringboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {
  private String genus;
  private String plant;
  private String self;
  
  public Links() {}
  
  public String getGenus() {
    return genus;
  }
  
  public void setGenus(String genus) {
    this.genus = genus;
  }
  
  public String getPlant() {
    return plant;
  }
  
  public void setPlant(String plant) {
    this.plant = plant;
  }
  
  public String getSelf() {
    return self;
  }
  
  public void setSelf(String self) {
    this.self = self;
  }
}
