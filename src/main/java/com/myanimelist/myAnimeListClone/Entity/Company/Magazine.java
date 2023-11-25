package com.myanimelist.myAnimeListClone.Entity.Company;

import com.myanimelist.myAnimeListClone.Entity.Company.Company;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "magazine")
public class Magazine extends Company {


}