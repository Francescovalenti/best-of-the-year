package org.movies.java.spring.best_of_the_year.Models;

public class Songs {
    private int id;
    private String songs;


    public Songs (int id,String songs){
    this.id=id;
    this.songs=songs;
}

public int getId(){
    return id;
}

public void setId(){
    this.id=id;
}

public String songs(){
    return songs;
}

public void setSongs(){
    this.songs=songs;
}
}
