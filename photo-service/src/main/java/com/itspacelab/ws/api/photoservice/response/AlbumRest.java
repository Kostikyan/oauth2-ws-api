package com.itspacelab.ws.api.photoservice.response;

import java.util.List;

public class AlbumRest {
    private String albumId;
    private String albumTitle;
    private String albumUrl;
    private List<PhotoRest> photos;

    public AlbumRest(String albumId, String albumTitle, String albumUrl, List<PhotoRest> photos) {
        this.albumId = albumId;
        this.albumTitle = albumTitle;
        this.albumUrl = albumUrl;
        this.photos = photos;
    }

    /**
     * @return the albumId
     */
    public String getAlbumId() {
        return albumId;
    }

    /**
     * @param albumId the albumId to set
     */
    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    /**
     * @return the albumTitle
     */
    public String getAlbumTitle() {
        return albumTitle;
    }

    /**
     * @param albumTitle the albumTitle to set
     */
    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    /**
     * @return the albumUrl
     */
    public String getAlbumUrl() {
        return albumUrl;
    }

    /**
     * @param albumUrl the albumUrl to set
     */
    public void setAlbumUrl(String albumUrl) {
        this.albumUrl = albumUrl;
    }

    /**
     * @return the photos
     */
    public List<PhotoRest> getPhotos() {
        return photos;
    }

    /**
     * @param photos the photos to set
     */
    public void setPhotos(List<PhotoRest> photos) {
        this.photos = photos;
    }

}