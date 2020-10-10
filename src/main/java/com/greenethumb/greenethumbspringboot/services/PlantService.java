package com.greenethumb.greenethumbspringboot.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenethumb.greenethumbspringboot.entities.species.DataSpecies;
import com.greenethumb.greenethumbspringboot.entities.plants.DataPlants;
import com.greenethumb.greenethumbspringboot.entities.plants.Plant;
//import com.greenethumb.greenethumbspringboot.repositories.PlantRepositority;
import com.greenethumb.greenethumbspringboot.entities.species.Species;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.IOException;
import java.util.List;
@Service
@CrossOrigin
public class PlantService {
//  @Autowired
//  PlantRepositority plantRepositority;
  private static final String rootURL;
  private static final String token = System.getenv("TREFLE_TOKEN");
  private static final OkHttpClient client;
  private static final ObjectMapper objectMapper;
  
  static {
    rootURL = "https://trefle.io";
    client = new OkHttpClient();
    objectMapper = new ObjectMapper();
  }
  
  public List<Plant> findAllPlants() throws IOException {
    Request request = new Request.Builder().url(rootURL+"/api/v1/plants?token="+token).build();
    try (Response response = client.newCall(request).execute()) {
      return toDataPlants((response.body()).string()).getPlants();
    }
  }

  public Species findById(Long id) throws IOException {
    Plant plant = findPlantById(id);
    String URL = rootURL+plant.getLinks().getSelf()+"?token="+token;
    Request request = new Request.Builder().url(URL).build();
    try (Response response = client.newCall(request).execute()) {
      return toDataSpecies((response.body()).string()).getSpecies();
    }
  }

  public Plant findPlantById(Long id) throws IOException {
    Plant plant = searchPlant(id, findAllPlants());
    int page = 2;
    while (plant == null) {
      String URL = rootURL+"/api/v1/plants?token="+token+"&page="+page;
      Request request = new Request.Builder().url(URL).build();
      try (Response response = client.newCall(request).execute()) {
        plant = searchPlant(id, toDataPlants((response.body()).string()).getPlants());
      }
      page++;
    }
    return plant;
  }

  public Plant searchPlant(Long id, List<Plant> plants) {
    Plant plant = null;
    for (Plant p : plants) {
      if (p.getId().equals(id)) {
        plant = p;
        break;
      }
    }
    return plant;
  }

  public static DataPlants toDataPlants(String json) throws IOException {
    JavaType type = objectMapper.getTypeFactory().constructType(DataPlants.class);
    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    return objectMapper.readValue(json, type);
  }
  
  public static DataSpecies toDataSpecies(String json) throws IOException {
    JavaType type = objectMapper.getTypeFactory().constructType(DataSpecies.class);
    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    return objectMapper.readValue(json, type);
  }

}
