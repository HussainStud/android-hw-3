package com.example.kuwaitcodes.Model;

public class Tracks {
    private String trackName;
    private String trackDescription;
    private String trackURLVideo;
    private int trackImage;

    public Tracks(String trackName, String trackDescription, String trackURLVideo, int trackImage) {
        this.trackName = trackName;
        this.trackDescription = trackDescription;
        this.trackURLVideo = trackURLVideo;
        this.trackImage = trackImage;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackDescription() {
        return trackDescription;
    }

    public void setTrackDescription(String trackDescription) {
        this.trackDescription = trackDescription;
    }

    public String getTrackURLVideo() {
        return trackURLVideo;
    }

    public void setTrackURLVideo(String trackURLVideo) {
        this.trackURLVideo = trackURLVideo;
    }

    public int getTrackImage() {
        return trackImage;
    }

    public void setTrackImage(int trackImage) {
        this.trackImage = trackImage;
    }
}
