package com.lilliemountain.jadetiger;

public class Event {
    String artistName1,artist1Venue;
    int artist1ImageResource;

    public Event(String artistName1, String artist1Venue, int artist1ImageResource, String artistName2, String artist2Venue, int artist2ImageResource) {
        this.artistName1 = artistName1;
        this.artist1Venue = artist1Venue;
        this.artist1ImageResource = artist1ImageResource;
        this.artistName2 = artistName2;
        this.artist2Venue = artist2Venue;
        this.artist2ImageResource = artist2ImageResource;
    }

    public String getArtistName1() {

        return artistName1;
    }

    public void setArtistName1(String artistName1) {
        this.artistName1 = artistName1;
    }

    public String getArtist1Venue() {
        return artist1Venue;
    }

    public void setArtist1Venue(String artist1Venue) {
        this.artist1Venue = artist1Venue;
    }

    public int getArtist1ImageResource() {
        return artist1ImageResource;
    }

    public void setArtist1ImageResource(int artist1ImageResource) {
        this.artist1ImageResource = artist1ImageResource;
    }

    public String getArtistName2() {
        return artistName2;
    }

    public void setArtistName2(String artistName2) {
        this.artistName2 = artistName2;
    }

    public String getArtist2Venue() {
        return artist2Venue;
    }

    public void setArtist2Venue(String artist2Venue) {
        this.artist2Venue = artist2Venue;
    }

    public int getArtist2ImageResource() {
        return artist2ImageResource;
    }

    public void setArtist2ImageResource(int artist2ImageResource) {
        this.artist2ImageResource = artist2ImageResource;
    }

    String artistName2,artist2Venue;
    int artist2ImageResource;
}
