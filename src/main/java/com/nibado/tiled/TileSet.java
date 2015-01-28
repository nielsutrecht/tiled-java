package com.nibado.tiled;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TileSet {
    @JsonProperty(value = "firstgid")
    private int firstGid;
    private String image;
    @JsonProperty(value = "imagewidth")
    private int imageWidth;
    @JsonProperty(value = "imageheight")
    private int imageHeight;
    @JsonProperty(value = "tilewidth")
    private int tileWidth;
    @JsonProperty(value = "tileheight")
    private int tileHeight;
    private int margin;
    private int spacing;
    private String name;
    private java.util.Map<String, String> properties;

    public int getFirstGid() {
        return firstGid;
    }

    public void setFirstGid(final int firstGid) {
        this.firstGid = firstGid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(final int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(final int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getTileWidth() {
        return tileWidth;
    }

    public void setTileWidth(final int tileWidth) {
        this.tileWidth = tileWidth;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(final int tileHeight) {
        this.tileHeight = tileHeight;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(final int margin) {
        this.margin = margin;
    }

    public int getSpacing() {
        return spacing;
    }

    public void setSpacing(final int spacing) {
        this.spacing = spacing;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(final java.util.Map<String, String> properties) {
        this.properties = properties;
    }

}
