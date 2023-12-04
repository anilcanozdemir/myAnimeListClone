package com.myanimelist.myAnimeListClone.Entity.Company;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "magazine")
public class Magazine extends Company {


}