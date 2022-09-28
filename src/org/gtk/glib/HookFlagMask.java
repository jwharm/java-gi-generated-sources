package org.gtk.glib;

/**
 * Flags used internally in the {@link Hook} implementation.
 */
public class HookFlagMask {

    /**
     * set if the hook has not been destroyed
     */
    public static final HookFlagMask ACTIVE = new HookFlagMask(1);
    
    /**
     * set if the hook is currently being run
     */
    public static final HookFlagMask IN_CALL = new HookFlagMask(2);
    
    /**
     * A mask covering all bits reserved for
     *   hook flags; see {@code G_HOOK_FLAG_USER_SHIFT}
     */
    public static final HookFlagMask MASK = new HookFlagMask(15);
    
    private int value;
    
    public HookFlagMask(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(HookFlagMask[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public HookFlagMask combined(HookFlagMask mask) {
        return new HookFlagMask(this.getValue() | mask.getValue());
    }
    
    public static HookFlagMask combined(HookFlagMask mask, HookFlagMask... masks) {
        int value = mask.getValue();
        for (HookFlagMask arg : masks) {
            value |= arg.getValue();
        }
        return new HookFlagMask(value);
    }
    
}
