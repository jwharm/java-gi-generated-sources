package org.gtk.graphene;

/**
 * The type of intersection.
 */
public class RayIntersectionKind {

    /**
     * No intersection
     */
    public static final RayIntersectionKind NONE = new RayIntersectionKind(0);
    
    /**
     * The ray is entering the intersected
     *   object
     */
    public static final RayIntersectionKind ENTER = new RayIntersectionKind(1);
    
    /**
     * The ray is leaving the intersected
     *   object
     */
    public static final RayIntersectionKind LEAVE = new RayIntersectionKind(2);
    
    private int value;
    
    public RayIntersectionKind(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(RayIntersectionKind[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
