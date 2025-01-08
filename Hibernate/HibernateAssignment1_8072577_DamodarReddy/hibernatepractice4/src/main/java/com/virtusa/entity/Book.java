/**
 * 
 */
package com.virtusa.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * @author Damodar Reddy11:40:52 PMApr 8, 2020
 * Book.java
 */
@Embeddable
public class Book implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
 
    @Column(name = "bk_name")
    private String bk_name;
 
    @Column(name = "author_name")
    private String author_name;
 
    public Book() { }
 
   
 
    public String getBk_name() {
        return bk_name;
    }
 
    public void setBk_name(String bk_name) {
        this.bk_name = bk_name;
    }
 
    public String getAuthor_name() {
        return author_name;
    }
 
    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
 
    
}