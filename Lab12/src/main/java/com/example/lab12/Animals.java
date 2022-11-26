package com.example.lab12;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Animals implements Serializable { //NOPMD - suppressed AtLeastOneConstructor - TODO explain reason for suppression
    @SuppressWarnings("MissingSerialAnnotation")
    private static final long serialVersionUID = 1L;
    private List<Animal> animals; //NOPMD - suppressed AvoidFieldNameMatchingTypeName - TODO explain reason for suppression //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression


    @SuppressWarnings("unused")
    public List<Animal> getAnimals() {
        return animals;
    }

    @SuppressWarnings("unused")
    public void setResults(List<Animal> animals) { //NOPMD - suppressed CommentRequired - TODO explain reason for suppression
        this.animals = animals;
    }

    /**
     * поток из JSON
     **/
    @SuppressWarnings({"TryFinallyCanBeTryWithResources", "UnnecessaryLocalVariable"})
    public Animal loadByURL(String url) throws IOException { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        StringBuilder jsonIn = new StringBuilder(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        final InputStream inputStream = new URL(url).openStream();
        try { //NOPMD - suppressed UseTryWithResources - TODO explain reason for suppression
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)); //NOPMD - suppressed CloseResource - TODO explain reason for suppression //NOPMD - suppressed CloseResource - TODO explain reason for suppression

            int i; //NOPMD - suppressed ShortVariable - TODO explain reason for suppression
            while ((i = bufferedReader.read()) != -1) { //NOPMD - suppressed AssignmentInOperand - TODO explain reason for suppression
                jsonIn.append((char) i);
            }
        } finally {

            inputStream.close();
        }
        ObjectMapper om = new ObjectMapper(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        Animal animal = om.readValue(jsonIn.toString(), Animal.class); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        return animal; //NOPMD - suppressed UnnecessaryLocalBeforeReturn - TODO explain reason for suppression
    }


    /**
     * Получение одного случайного животного
     **/
    @SuppressWarnings("UnnecessaryLocalVariable")
    public Animal getRandomAnimal() throws IOException {
        String url = "https://zoo-animal-api.herokuapp.com/animals/rand/";
        Animal animal = this.loadByURL(url); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        return animal; //NOPMD - suppressed UnnecessaryLocalBeforeReturn - TODO explain reason for suppression
    }

}