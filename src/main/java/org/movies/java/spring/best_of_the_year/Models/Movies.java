package org.movies.java.spring.best_of_the_year.Models;

public class Movies {
    private int id;
    private String title;

    public Movies (int id,String title){
    this.id=id;
    this.title=title;

 
}

public int getId(){
    return id;

}

public void setId(){
    this.id=id;
}

public String getTitle(){
    return title;

}

public void setTitle(){
    this.title=title;
}
}

