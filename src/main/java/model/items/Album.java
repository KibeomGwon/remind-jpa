package model.items;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import model.items.Item;

@Entity
@DiscriminatorValue("ALBUM")
public class Album extends Item {
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
