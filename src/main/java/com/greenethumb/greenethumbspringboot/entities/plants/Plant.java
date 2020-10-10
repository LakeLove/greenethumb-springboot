package com.greenethumb.greenethumbspringboot.entities.plants;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.greenethumb.greenethumbspringboot.entities.Links;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Plant {
  private Long id;
  private String author;
  private String bibliography;
  private String common_name;
  private String family;
  private String family_common_name;
  private String genus;
  private Long genus_id;
  private String image_url;
  private Links links;
  private String rank;
  private String scientific_name;
  private String slug;
  private String status;
  private List<String> synonyms;
  private Integer year;
  
  public Plant() {}
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public void setAuthor(String author) {
    this.author = author;
  }
  
  public String getBibliography() {
    return bibliography;
  }
  
  public void setBibliography(String bibliography) {
    this.bibliography = bibliography;
  }
  
  public String getCommon_name() {
    return common_name;
  }
  
  public void setCommon_name(String common_name) {
    this.common_name = common_name;
  }
  
  public String getFamily() {
    return family;
  }
  
  public void setFamily(String family) {
    this.family = family;
  }
  
  public String getFamily_common_name() {
    return family_common_name;
  }
  
  public void setFamily_common_name(String family_common_name) {
    this.family_common_name = family_common_name;
  }
  
  public String getGenus() {
    return genus;
  }
  
  public void setGenus(String genus) {
    this.genus = genus;
  }
  
  public Long getGenus_id() {
    return genus_id;
  }
  
  public void setGenus_id(Long genus_id) {
    this.genus_id = genus_id;
  }
  
  public String getImage_url() {
    return image_url;
  }
  
  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }
  
  public String getRank() {
    return rank;
  }
  
  public void setRank(String rank) {
    this.rank = rank;
  }
  
  public String getScientific_name() {
    return scientific_name;
  }
  
  public void setScientific_name(String scientific_name) {
    this.scientific_name = scientific_name;
  }
  
  public String getSlug() {
    return slug;
  }
  
  public void setSlug(String slug) {
    this.slug = slug;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  public List<String> getSynonyms() {
    return synonyms;
  }
  
  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }
  
  public Integer getYear() {
    return year;
  }
  
  public void setYear(Integer year) {
    this.year = year;
  }
  
  public Links getLinks() {
    return links;
  }
  
  public void setLinks(Links links) {
    this.links = links;
  }
  
  @Override
  public String toString() {
    return "Plant{" + "id=" + id + ", author='" + author + '\'' + ", bibliography='" + bibliography + '\'' + ", " +
             "common_name='" + common_name + '\'' + ", family='" + family + '\'' + ", family_common_name='" +
             family_common_name + '\'' + ", genus='" + genus + '\'' + ", genus_id=" + genus_id + ", image_url='" +
             image_url + '\'' + ", links=" + links + ", rank='" + rank + '\'' + ", scientific_name='" +
             scientific_name + '\'' + ", slug='" + slug + '\'' + ", status='" + status + '\'' + ", synonyms=" +
             synonyms + ", year=" + year + '}';
  }
}
