package com.example.lab12;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;


/**
 * класс  Animal
 **/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "latin_name",
        "animal_type",
        "active_time",
        "length_min",
        "length_max",
        "weight_min",
        "weight_max",
        "lifespan",
        "habitat",
        "diet",
        "geo_range",
        "image_link"
})

public class Animal implements Serializable { //NOPMD - suppressed MissingSerialVersionUID - TODO explain reason for suppression
    /**
     * поле
     */
    @JsonProperty("name")
    private String name;
    /**
     * поле
     */
    @JsonProperty("latin_name")
    private String latinName;
    /**
     * поле
     */
    @JsonProperty("animal_type")
    private String animalType;
    /**
     * поле
     */
    @JsonProperty("active_time")
    private String activeTime;
    /**
     * поле
     */
    @JsonProperty("length_min")
    private Double lenMin;
    /**
     * поле
     */
    @JsonProperty("length_max")
    private Double lenMax;
    /**
     * поле
     */
    @JsonProperty("weight_min")
    private Double wgMin;
    /**
     * поле
     */
    @JsonProperty("weight_max")
    private Double wgMax;
    /**
     * поле
     */
    @JsonProperty("lifespan")
    private Double lifespan;
    /**
     * поле
     */
    @JsonProperty("habitat")
    private String habitat;
    /**
     * поле
     */
    @JsonProperty("diet")
    private String diet;
    /**
     * поле
     */
    @JsonProperty("geo_range")
    private String geoRange;
    /**
     * поле
     */
    @JsonProperty("image_link")
    private String imageLink;
    /**
     * поле
     */

    @JsonProperty("id")
    private int id; //NOPMD - suppressed FieldDeclarationsShouldBeAtStartOfClass - TODO explain reason for suppression

    /**
     * конструктор
     */
    public Animal(int animalID, String name, String latinName, String animalType, String activeTime, Double lengthMin, Double lengthMax, Double weightMin, Double weightMax, Double lifespan, String habitat, String diet, String geoRange, String imageLink) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        id = animalID;
        this.setName(name);
        this.setLatinName(latinName);
        this.setAnimalType(animalType);
        this.setActiveTime(activeTime);
        this.setLenMin(lengthMin);
        this.setLenMax(lengthMax);
        this.setWgMin(weightMin);
        this.setWgMax(weightMax);
        this.setLifespan(lifespan);
        this.setHabitat(habitat);
        this.setDiet(diet);
        this.setGeoRange(geoRange);
        this.setImageLink(imageLink);

    }

    /**
     * пустой констуктор
     */

    public Animal() { //NOPMD - suppressed UncommentedEmptyConstructor - TODO explain reason for suppression

    }

    /**
     * геттер
     */
    public String getName() {
        return name;
    }

    public void setName(String name) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.name = name.strip();
    }

    /**
     * геттер
     */

    public String getLatinName() {
        return latinName;
    }

    @SuppressWarnings("unused") //NOPMD - suppressed AvoidDuplicateLiterals - TODO explain reason for suppression
    public void setLatinName(String latinName) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.latinName = latinName.strip();
    }

    /**
     * геттер
     */
    public String getAnimalType() {
        return animalType;
    }

    @SuppressWarnings("unused")
    public void setAnimalType(String animalType) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.animalType = animalType.strip();
    }

    /**
     * геттер
     */
    public String getActiveTime() {
        return activeTime;
    }

    @SuppressWarnings("unused")
    public void setActiveTime(String activeTime) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.activeTime = activeTime.strip();
    }

    /**
     * геттер
     */
    public Double getLenMin() {
        return lenMin;
    }

    @SuppressWarnings("unused")
    public void setLenMin(Double lenMin) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.lenMin = lenMin;
    }

    /**
     * геттер
     */
    public Double getLenMax() {
        return lenMax;
    }

    public void setLenMax(Double lengthMax) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.lenMax = lengthMax;
    }

    /**
     * геттер
     */
    public Double getWgMin() {
        return wgMin;
    }

    @SuppressWarnings("unused")
    public void setWgMin(Double wgMin) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.wgMin = wgMin;
    }

    /**
     * геттер
     */
    public Double getWgMax() {
        return wgMax;
    }

    @SuppressWarnings("unused")
    public void setWgMax(Double wgMax) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.wgMax = wgMax;
    }

    /**
     * геттер
     */
    public Double getLifespan() {
        return lifespan;
    }

    @SuppressWarnings("unused")
    public void setLifespan(Double lifespan) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.lifespan = lifespan;
    }

    /**
     * геттер
     */
    public String getHabitat() {
        return habitat;
    }

    @SuppressWarnings("unused")
    public void setHabitat(String habitat) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.habitat = habitat.strip();
    }

    /**
     * геттер
     */
    public String getDiet() {
        return diet;
    }

    @SuppressWarnings("unused")
    public void setDiet(String diet) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.diet = diet.strip();
    }

    /**
     * геттер
     */
    public String getGeoRange() {
        return geoRange;
    }

    @SuppressWarnings("unused")
    public void setGeoRange(String geoRange) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.geoRange = geoRange.strip();
    }

    /**
     * геттер
     */
    public String getImageLink() {
        return imageLink;
    }

    @SuppressWarnings("unused")
    public void setImageLink(String imageLink) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        this.imageLink = imageLink.strip();
    }

    /**
     * геттер
     */
    public int getId() {
        return id;
    }

    /**
     * геттер
     */
    @SuppressWarnings("unused")
    public void setId(int animalID) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        id = animalID;
    }


}