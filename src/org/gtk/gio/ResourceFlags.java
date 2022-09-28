package org.gtk.gio;

/**
 * GResourceFlags give information about a particular file inside a resource
 * bundle.
 */
public class ResourceFlags {

    /**
     * No flags set.
     */
    public static final ResourceFlags NONE = new ResourceFlags(0);
    
    /**
     * The file is compressed.
     */
    public static final ResourceFlags COMPRESSED = new ResourceFlags(1);
    
    private int value;
    
    public ResourceFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ResourceFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ResourceFlags combined(ResourceFlags mask) {
        return new ResourceFlags(this.getValue() | mask.getValue());
    }
    
    public static ResourceFlags combined(ResourceFlags mask, ResourceFlags... masks) {
        int value = mask.getValue();
        for (ResourceFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ResourceFlags(value);
    }
    
}
