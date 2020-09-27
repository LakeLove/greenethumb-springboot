package com.greenethumb.greenethumbspringboot.entities.species;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Foliage {
  private String texture;
  private List<String> color;
  private Boolean leaf_retention;
  
  public Foliage() {}
  
  public String getTexture() {
    return texture;
  }
  
  public void setTexture(String texture) {
    this.texture = texture;
  }
  
  public List<String> getColor() {
    return color;
  }
  
  public void setColor(List<String> color) {
    this.color = color;
  }
  
  public Boolean getLeaf_retention() {
    return leaf_retention;
  }
  
  public void setLeaf_retention(Boolean leaf_retention) {
    this.leaf_retention = leaf_retention;
  }
}
