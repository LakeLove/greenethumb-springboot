package com.greenethumb.greenethumbspringboot.entities.species;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.greenethumb.greenethumbspringboot.entities.*;
import com.greenethumb.greenethumbspringboot.entities.species.distributions.Distribution;
import com.greenethumb.greenethumbspringboot.entities.species.distributions.Distributions;
import com.greenethumb.greenethumbspringboot.entities.species.growth.Growth;
import com.greenethumb.greenethumbspringboot.entities.species.images.Images;
import com.greenethumb.greenethumbspringboot.entities.species.specifications.Specifications;

import java.util.List;
@JsonIgnoreProperties (ignoreUnknown = true)
public class Species {
  private Long id;
  private String author;
  private String bibliography;
  private String common_name;
  private String family;
  private String family_common_name;
  private String genus;
  private Long genus_id;
  private String image_url;
  private String rank;
  private String scientific_name;
  private String slug;
  private String status;
  private Integer year;
  private String observations;
  private Boolean vegetable;
  private List<String> duration;
  private List<String> edible_part;
  private Boolean edible;
  private Images images;
  private CommonNames common_names;
  private Distribution distribution;
  private Distributions distributions;
  private Flower flower;
  private Foliage foliage;
  private FruitOrSeed fruitOrSeed;
  private Specifications specifications;
  private Growth growth;
  private Links links;
  private List<Synonyms> synonyms;
  private List<Sources> sources;
  
  public Species() {}
  
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
  
  public Integer getYear() {
    return year;
  }
  
  public void setYear(Integer year) {
    this.year = year;
  }
  
  public String getObservations() {
    return observations;
  }
  
  public void setObservations(String observations) {
    this.observations = observations;
  }
  
  public Boolean getVegetable() {
    return vegetable;
  }
  
  public void setVegetable(Boolean vegetable) {
    this.vegetable = vegetable;
  }
  
  public List<String> getDuration() {
    return duration;
  }
  
  public void setDuration(List<String> duration) {
    this.duration = duration;
  }
  
  public List<String> getEdible_part() {
    return edible_part;
  }
  
  public void setEdible_part(List<String> edible_part) {
    this.edible_part = edible_part;
  }
  
  public Boolean getEdible() {
    return edible;
  }
  
  public void setEdible(Boolean edible) {
    this.edible = edible;
  }
  
  public Images getImages() {
    return images;
  }
  
  public void setImages(Images images) {
    this.images = images;
  }
  
  public CommonNames getCommon_names() {
    return common_names;
  }
  
  public void setCommon_names(CommonNames common_names) {
    this.common_names = common_names;
  }
  
  public Distribution getDistribution() {
    return distribution;
  }
  
  public void setDistribution(Distribution distribution) {
    this.distribution = distribution;
  }
  
  public Distributions getDistributions() {
    return distributions;
  }
  
  public void setDistributions(Distributions distributions) {
    this.distributions = distributions;
  }
  
  public Flower getFlower() {
    return flower;
  }
  
  public void setFlower(Flower flower) {
    this.flower = flower;
  }
  
  public Foliage getFoliage() {
    return foliage;
  }
  
  public void setFoliage(Foliage foliage) {
    this.foliage = foliage;
  }
  
  public FruitOrSeed getFruitOrSeed() {
    return fruitOrSeed;
  }
  
  public void setFruitOrSeed(FruitOrSeed fruitOrSeed) {
    this.fruitOrSeed = fruitOrSeed;
  }
  
  public Specifications getSpecifications() {
    return specifications;
  }
  
  public void setSpecifications(Specifications specifications) {
    this.specifications = specifications;
  }
  
  public Growth getGrowth() {
    return growth;
  }
  
  public void setGrowth(Growth growth) {
    this.growth = growth;
  }
  
  public Links getLinks() {
    return links;
  }
  
  public void setLinks(Links links) {
    this.links = links;
  }
  
  public List<Synonyms> getSynonyms() {
    return synonyms;
  }
  
  public void setSynonyms(List<Synonyms> synonyms) {
    this.synonyms = synonyms;
  }
  
  public List<Sources> getSources() {
    return sources;
  }
  
  public void setSources(List<Sources> sources) {
    this.sources = sources;
  }
}