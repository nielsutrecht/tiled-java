package com.nibado.tiled;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class MapTest {
    @Test
    public void testRead() throws IOException {
        final Map map = Map.read(new File("src/test/resources/world-1-1.json"));

        assertEquals(40, map.getHeight());
        assertEquals(40, map.getWidth());
        assertEquals("orthogonal", map.getOrientation());
        assertEquals(16, map.getTileHeight());
        assertEquals(16, map.getTileWidth());
        assertEquals(1, map.getVersion());
        assertEquals(3, map.getLayers().size());
        assertEquals(1, map.getTileSets().size());

        assertEquals("back", map.getLayers().get(0).getName());
        assertEquals("front", map.getLayers().get(1).getName());
        assertEquals("objects", map.getLayers().get(2).getName());

        final TileLayer back = (TileLayer) map.getLayers().get(0);
        final TileLayer front = (TileLayer) map.getLayers().get(1);
        final ObjectGroup objects = (ObjectGroup) map.getLayers().get(2);

        assertEquals(back.getHeight() * back.getWidth(), back.getData().length);
        assertEquals(front.getHeight() * front.getWidth(), front.getData().length);

        assertEquals(1, objects.getObjects().size());
        assertEquals("well_01", objects.getObjects().get(0).getName());
        assertEquals("well", objects.getObjects().get(0).getType());
        assertEquals(12, objects.getObjects().get(0).getWidth());
        assertEquals(11, objects.getObjects().get(0).getHeight());
        assertEquals(179, objects.getObjects().get(0).getX());
        assertEquals(130, objects.getObjects().get(0).getY());

    }
}
