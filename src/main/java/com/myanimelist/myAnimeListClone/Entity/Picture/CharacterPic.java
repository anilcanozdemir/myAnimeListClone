package com.myanimelist.myAnimeListClone.Entity.Picture;

import com.myanimelist.myAnimeListClone.Entity.Item.ItemCharacter;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "character_pic")
public class CharacterPic extends EntityPicture {
    @ManyToOne
    @JoinColumn(name = "item_character_id")
    private ItemCharacter itemCharacter;

}