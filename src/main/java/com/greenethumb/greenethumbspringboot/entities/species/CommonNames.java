package com.greenethumb.greenethumbspringboot.entities.species;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties (ignoreUnknown = true)
public class CommonNames {
  private List<String> es;
  private List<String> fr;
  private List<String> en;
  
  public CommonNames() {}
  
  public List<String> getEs() {
    return es;
  }
  
  public void setEs(List<String> es) {
    this.es = es;
  }
  
  public List<String> getFr() {
    return fr;
  }
  
  public void setFr(List<String> fr) {
    this.fr = fr;
  }
  
  public List<String> getEn() {
    return en;
  }
  
  public void setEn(List<String> en) {
    this.en = en;
  }
}
