package org.gtk.gsk;

/**
 * The filters used when scaling texture data.
 * <p>
 * The actual implementation of each filter is deferred to the
 * rendering pipeline.
 */
public class ScalingFilter {

    /**
     * linear interpolation filter
     */
    public static final ScalingFilter LINEAR = new ScalingFilter(0);
    
    /**
     * nearest neighbor interpolation filter
     */
    public static final ScalingFilter NEAREST = new ScalingFilter(1);
    
    /**
     * linear interpolation along each axis,
     *   plus mipmap generation, with linear interpolation along the mipmap
     *   levels
     */
    public static final ScalingFilter TRILINEAR = new ScalingFilter(2);
    
    private int value;
    
    public ScalingFilter(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ScalingFilter[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
