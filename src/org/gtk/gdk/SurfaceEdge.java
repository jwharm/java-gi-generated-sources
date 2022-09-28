package org.gtk.gdk;

/**
 * Determines a surface edge or corner.
 */
public class SurfaceEdge {

    /**
     * the top left corner.
     */
    public static final SurfaceEdge NORTH_WEST = new SurfaceEdge(0);
    
    /**
     * the top edge.
     */
    public static final SurfaceEdge NORTH = new SurfaceEdge(1);
    
    /**
     * the top right corner.
     */
    public static final SurfaceEdge NORTH_EAST = new SurfaceEdge(2);
    
    /**
     * the left edge.
     */
    public static final SurfaceEdge WEST = new SurfaceEdge(3);
    
    /**
     * the right edge.
     */
    public static final SurfaceEdge EAST = new SurfaceEdge(4);
    
    /**
     * the lower left corner.
     */
    public static final SurfaceEdge SOUTH_WEST = new SurfaceEdge(5);
    
    /**
     * the lower edge.
     */
    public static final SurfaceEdge SOUTH = new SurfaceEdge(6);
    
    /**
     * the lower right corner.
     */
    public static final SurfaceEdge SOUTH_EAST = new SurfaceEdge(7);
    
    private int value;
    
    public SurfaceEdge(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SurfaceEdge[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
