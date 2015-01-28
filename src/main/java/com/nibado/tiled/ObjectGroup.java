package com.nibado.tiled;

import java.util.List;

public class ObjectGroup extends Layer {
    private List<Object> objects;

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(final List<Object> objects) {
        this.objects = objects;
    }

    public static class Object {
        private int height;
        private int width;
        private int x;
        private int y;
        private String type;
        private String name;
        private boolean visible;
        private java.util.Map<String, String> properties;

        public Object() {

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

        public int getX() {
            return x;
        }

        public void setX(final int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(final int y) {
            this.y = y;
        }

        public String getType() {
            return type;
        }

        public void setType(final String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public boolean isVisible() {
            return visible;
        }

        public void setVisible(final boolean visible) {
            this.visible = visible;
        }

        public java.util.Map<String, String> getProperties() {
            return properties;
        }

        public void setProperties(final java.util.Map<String, String> properties) {
            this.properties = properties;
        }
    }
}
