package org.pango;

/**
 * Flags that influence the behavior of {@link Pango#Layout}.
 * <p>
 * New members may be added to this enumeration over time.
 */
public class LayoutDeserializeFlags {

    /**
     * Default behavior
     */
    public static final LayoutDeserializeFlags DEFAULT = new LayoutDeserializeFlags(0);
    
    /**
     * Apply context information
     *   from the serialization to the {@code PangoContext}
     */
    public static final LayoutDeserializeFlags CONTEXT = new LayoutDeserializeFlags(1);
    
    private int value;
    
    public LayoutDeserializeFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(LayoutDeserializeFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public LayoutDeserializeFlags combined(LayoutDeserializeFlags mask) {
        return new LayoutDeserializeFlags(this.getValue() | mask.getValue());
    }
    
    public static LayoutDeserializeFlags combined(LayoutDeserializeFlags mask, LayoutDeserializeFlags... masks) {
        int value = mask.getValue();
        for (LayoutDeserializeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new LayoutDeserializeFlags(value);
    }
    
}
