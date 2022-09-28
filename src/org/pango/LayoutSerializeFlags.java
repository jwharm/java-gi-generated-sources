package org.pango;

/**
 * Flags that influence the behavior of {@link Layout#serialize}.
 * <p>
 * New members may be added to this enumeration over time.
 */
public class LayoutSerializeFlags {

    /**
     * Default behavior
     */
    public static final LayoutSerializeFlags DEFAULT = new LayoutSerializeFlags(0);
    
    /**
     * Include context information
     */
    public static final LayoutSerializeFlags CONTEXT = new LayoutSerializeFlags(1);
    
    /**
     * Include information about the formatted output
     */
    public static final LayoutSerializeFlags OUTPUT = new LayoutSerializeFlags(2);
    
    private int value;
    
    public LayoutSerializeFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(LayoutSerializeFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public LayoutSerializeFlags combined(LayoutSerializeFlags mask) {
        return new LayoutSerializeFlags(this.getValue() | mask.getValue());
    }
    
    public static LayoutSerializeFlags combined(LayoutSerializeFlags mask, LayoutSerializeFlags... masks) {
        int value = mask.getValue();
        for (LayoutSerializeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new LayoutSerializeFlags(value);
    }
    
}
