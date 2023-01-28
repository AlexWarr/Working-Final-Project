package com.Alex.Forest.tables;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import lombok.Data;

@Data
public class Plant_Species {
  
  @Id
  private String Plant_Latin_Name;
  
  @Column(value = "Plant_Common_Name")
  private String Common_Name;
  
  @Column(value = "Plant_Phylum")
  private String Phylum;
  
  @Column(value = "Body_Trunk_Stem_Description")
  private String Body;
  
  @Column(value = "Branch_Leaf_Pattern_Description")
  private String Branch;
  
  @Column(value = "Flower_Fruit_Description")
  private String Flower_Fruit;
  
  @Column(value = "Toxic")
  private Boolean Toxic;
  
  @Column(value = "Edible")
  private Boolean Edible;
  
  @Column(value = "Medicinal")
  private Boolean Medicinal;
  
  @Column(value = "Plant_Description")
  private String Plant_Description;
  
}
