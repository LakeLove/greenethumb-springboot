package com.greenethumb.greenethumbspringboot.entities.species.distributions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.greenethumb.greenethumbspringboot.entities.Links;
@JsonIgnoreProperties (ignoreUnknown = true)
public class NativeDist {
  private Long id;
  private String name;
  private String slug;
  private String tdwg_code;
  private Integer tdwg_level;
  private Integer species_count;
  private Links links;
  
  public NativeDist() {}
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getSlug() {
    return slug;
  }
  
  public void setSlug(String slug) {
    this.slug = slug;
  }
  
  public String getTdwg_code() {
    return tdwg_code;
  }
  
  public void setTdwg_code(String tdwg_code) {
    this.tdwg_code = tdwg_code;
  }
  
  public Integer getTdwg_level() {
    return tdwg_level;
  }
  
  public void setTdwg_level(Integer tdwg_level) {
    this.tdwg_level = tdwg_level;
  }
  
  public Integer getSpecies_count() {
    return species_count;
  }
  
  public void setSpecies_count(Integer species_count) {
    this.species_count = species_count;
  }
  
  public Links getLinks() {
    return links;
  }
  
  public void setLinks(Links links) {
    this.links = links;
  }
}