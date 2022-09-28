package org.gtk.gobject;

/**
 * These flags used to be passed to g_type_init_with_debug_flags() which
 * is now deprecated.
 * <p>
 * If you need to enable debugging features, use the GOBJECT_DEBUG
 * environment variable.
 */
public class TypeDebugFlags {

    /**
     * Print no messages
     */
    public static final TypeDebugFlags NONE = new TypeDebugFlags(0);
    
    /**
     * Print messages about object bookkeeping
     */
    public static final TypeDebugFlags OBJECTS = new TypeDebugFlags(1);
    
    /**
     * Print messages about signal emissions
     */
    public static final TypeDebugFlags SIGNALS = new TypeDebugFlags(2);
    
    /**
     * Keep a count of instances of each type
     */
    public static final TypeDebugFlags INSTANCE_COUNT = new TypeDebugFlags(4);
    
    /**
     * Mask covering all debug flags
     */
    public static final TypeDebugFlags MASK = new TypeDebugFlags(7);
    
    private int value;
    
    public TypeDebugFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TypeDebugFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TypeDebugFlags combined(TypeDebugFlags mask) {
        return new TypeDebugFlags(this.getValue() | mask.getValue());
    }
    
    public static TypeDebugFlags combined(TypeDebugFlags mask, TypeDebugFlags... masks) {
        int value = mask.getValue();
        for (TypeDebugFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TypeDebugFlags(value);
    }
    
}
