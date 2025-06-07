package org.movies.java.spring.best_of_the_year.Models;

public class Songs {
    private int id;
    private String title;


    public Songs (int id,String songs){
    this.id=id;
    this.title=songs;
}

public int getId(){
    return id;
}

public void setId( int id){
    this.id=id;
}

public String getTitle(){
    return title;
}

public void setTitle( String title){
    this.title=title;
}
@Override
public String toString(){
    return String.format("Song [ID: %d, Title: %s]", this.id, this.title);
}
}
