package org.gtk.gio;

/**
 * GEmblemOrigin is used to add information about the origin of the emblem
 * to {@link Emblem}.
 */
public class EmblemOrigin {

    /**
     * Emblem of unknown origin
     */
    public static final EmblemOrigin UNKNOWN = new EmblemOrigin(0);
    
    /**
     * Emblem adds device-specific information
     */
    public static final EmblemOrigin DEVICE = new EmblemOrigin(1);
    
    /**
     * Emblem depicts live metadata, such as "readonly"
     */
    public static final EmblemOrigin LIVEMETADATA = new EmblemOrigin(2);
    
    /**
     * Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)
     */
    public static final EmblemOrigin TAG = new EmblemOrigin(3);
    
    private int value;
    
    public EmblemOrigin(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(EmblemOrigin[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
