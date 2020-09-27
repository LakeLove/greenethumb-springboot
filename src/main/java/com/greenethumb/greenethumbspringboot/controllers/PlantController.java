package com.greenethumb.greenethumbspringboot.controllers;

import com.greenethumb.greenethumbspringboot.entities.Plant;
import com.greenethumb.greenethumbspringboot.entities.species.Species;
import com.greenethumb.greenethumbspringboot.services.PlantService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api/plants")
public class PlantController {
  
  @Autowired
  PlantService plantService;
  
  @GetMapping (value = "/all")
  @ResponseBody
  List<Plant> findAllPlants() throws IOException {
    return plantService.findAllPlants();
  }
  
  @GetMapping (value = "/id={id}")
  @ResponseBody
  Species findById(@PathVariable ("id") Long id) throws IOException, UnirestException {
    return plantService.findById(id);
  }



}
