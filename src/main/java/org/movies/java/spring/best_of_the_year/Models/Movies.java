package org.movies.java.spring.best_of_the_year.Models;

public class Movies {
    private Integer id;
    private String title;

    public Movies (Integer id,String title){
    this.id=id;
    this.title=title;

 
}

public int getId(){
    return id;

}

public void setId(Integer id){
    this.id=id;
}

public String getTitle(){
    return title;

}

public void setTitle(String title){
    this.title=title;
}

@Override
public String toString(){
    return String.format("Movie [ID: %d, Title: %s]", this.id, this.title);
}
}