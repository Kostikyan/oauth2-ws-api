package com.itspacelab.ws.api.photoservice.controller;

import java.util.Arrays;
import java.util.List;

import com.itspacelab.ws.api.photoservice.response.PhotoRest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumsPhotosController {

    @GetMapping(path="/albums/{albumId}/photos")
    public List<PhotoRest> getAlbumPhotos(@PathVariable String albumId) {

        PhotoRest photo1 = new PhotoRest();
        photo1.setAlbumId(albumId);
        photo1.setPhotoId("1");
        photo1.setUserId("1");
        photo1.setPhotoTitle("Photo 1 title");
        photo1.setPhotoDescription("Photo 1 description");
        photo1.setPhotoUrl("Photo 1 URL");

        return Arrays.asList(photo1);
    }

}