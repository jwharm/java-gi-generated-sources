package org.gtk.gio;

/**
 * GResourceLookupFlags determine how resource path lookups are handled.
 */
public class ResourceLookupFlags {

    /**
     * No flags set.
     */
    public static final ResourceLookupFlags NONE = new ResourceLookupFlags(0);
    
    private int value;
    
    public ResourceLookupFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ResourceLookupFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ResourceLookupFlags combined(ResourceLookupFlags mask) {
        return new ResourceLookupFlags(this.getValue() | mask.getValue());
    }
    
    public static ResourceLookupFlags combined(ResourceLookupFlags mask, ResourceLookupFlags... masks) {
        int value = mask.getValue();
        for (ResourceLookupFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ResourceLookupFlags(value);
    }
    
}
