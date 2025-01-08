package com.bookmark.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name = "bookmark")
public class BookMark {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String title;
    String url;
    String description;
    String creationDate;
}