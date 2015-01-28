package com.nibado.tiled;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Map {
    private int height;
    private int width;
    @JsonProperty(value = "tileheight")
    private int tileHeight;
    @JsonProperty(value = "tilewidth")
    private int tileWidth;
    private String orientation;
    private int version;
    private java.util.Map<String, String> properties;
    @JsonProperty(value = "tilesets")
    List<TileSet> tileSets;

    private List<Layer> layers;

    public static Map read(final File file) {
        try {
            return new ObjectMapper().readValue(file, Map.class);
        }
        catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(final int tileHeight) {
        this.tileHeight = tileHeight;
    }

    public int getTileWidth() {
        return tileWidth;
    }

    public void setTileWidth(final int tileWidth) {
        this.tileWidth = tileWidth;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(final String orientation) {
        this.orientation = orientation;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(final int version) {
        this.version = version;
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(final List<Layer> layers) {
        this.layers = layers;
    }

    public List<TileSet> getTileSets() {
        return tileSets;
    }

    public void setTileSets(final List<TileSet> tileSets) {
        this.tileSets = tileSets;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        }
        catch (final JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(final java.util.Map properties) {
        this.properties = properties;
    }
}
