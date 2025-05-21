package com.javaspring.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.javaspring.dslist.entity.Game;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import jakarta.persistence.Column;

public class GameDTO {
    
    private long id;
    private String title;
    
    @Column(name ="game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;


    public GameDTO(){}


    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public Integer getYear() {
        return year;
    }


    public void setYear(Integer year) {
        this.year = year;
    }


    public String getGenre() {
        return genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getPlatforms() {
        return platforms;
    }


    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }


    public Double getScore() {
        return score;
    }


    public void setScore(Double score) {
        this.score = score;
    }


    public String getImgUrl() {
        return imgUrl;
    }


    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    public String getShortDescription() {
        return shortDescription;
    }


    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }


    public String getLongDescription() {
        return longDescription;
    }


    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    
}
