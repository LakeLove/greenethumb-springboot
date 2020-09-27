package com.greenethumb.greenethumbspringboot.entities.species.images;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties (ignoreUnknown = true)
public class Images {
  private List<FlowerImage> flowers;
  private List<LeafImage> leaf;
  private List<HabitImage> habit;
  private List<FruitImage> fruit;
  private List<BarkImage> bark;
  private List<OtherImage> other;
  public Images() {}
  
  public List<FlowerImage> getFlowers() {
    return flowers;
  }
  
  public void setFlowers(List<FlowerImage> flowers) {
    this.flowers = flowers;
  }
  
  public List<LeafImage> getLeaf() {
    return leaf;
  }
  
  public void setLeaf(List<LeafImage> leaf) {
    this.leaf = leaf;
  }
  
  public List<HabitImage> getHabit() {
    return habit;
  }
  
  public void setHabit(List<HabitImage> habit) {
    this.habit = habit;
  }
  
  public List<FruitImage> getFruit() {
    return fruit;
  }
  
  public void setFruit(List<FruitImage> fruit) {
    this.fruit = fruit;
  }
  
  public List<BarkImage> getBark() {
    return bark;
  }
  
  public void setBark(List<BarkImage> bark) {
    this.bark = bark;
  }
  
  public List<OtherImage> getOther() {
    return other;
  }
  
  public void setOther(List<OtherImage> other) {
    this.other = other;
  }
}
