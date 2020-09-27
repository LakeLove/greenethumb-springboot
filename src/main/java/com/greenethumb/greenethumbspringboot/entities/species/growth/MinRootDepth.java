package com.greenethumb.greenethumbspringboot.entities.species.growth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class MinRootDepth {
  private Double cm;
  
  public MinRootDepth() {}
  
  public Double getCm() {
    return cm;
  }
  
  public void setCm(Double cm) {
    this.cm = cm;
  }
}