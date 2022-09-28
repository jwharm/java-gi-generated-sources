package org.gtk.gdk;

/**
 * Flags to indicate the state of modifier keys and mouse buttons
 * in events.
 * <p>
 * Typical modifier keys are Shift, Control, Meta, Super, Hyper, Alt, Compose,
 * Apple, CapsLock or ShiftLock.
 * <p>
 * Note that GDK may add internal values to events which include values outside
 * of this enumeration. Your code should preserve and ignore them.  You can use
 * {@code GDK_MODIFIER_MASK} to remove all private values.
 */
public class ModifierType {

    /**
     * the Shift key.
     */
    public static final ModifierType SHIFT_MASK = new ModifierType(1);
    
    /**
     * a Lock key (depending on the modifier mapping of the
     *  X server this may either be CapsLock or ShiftLock).
     */
    public static final ModifierType LOCK_MASK = new ModifierType(2);
    
    /**
     * the Control key.
     */
    public static final ModifierType CONTROL_MASK = new ModifierType(4);
    
    /**
     * the fourth modifier key (it depends on the modifier
     *  mapping of the X server which key is interpreted as this modifier, but
     *  normally it is the Alt key).
     */
    public static final ModifierType ALT_MASK = new ModifierType(8);
    
    /**
     * the first mouse button.
     */
    public static final ModifierType BUTTON1_MASK = new ModifierType(256);
    
    /**
     * the second mouse button.
     */
    public static final ModifierType BUTTON2_MASK = new ModifierType(512);
    
    /**
     * the third mouse button.
     */
    public static final ModifierType BUTTON3_MASK = new ModifierType(1024);
    
    /**
     * the fourth mouse button.
     */
    public static final ModifierType BUTTON4_MASK = new ModifierType(2048);
    
    /**
     * the fifth mouse button.
     */
    public static final ModifierType BUTTON5_MASK = new ModifierType(4096);
    
    /**
     * the Super modifier
     */
    public static final ModifierType SUPER_MASK = new ModifierType(67108864);
    
    /**
     * the Hyper modifier
     */
    public static final ModifierType HYPER_MASK = new ModifierType(134217728);
    
    /**
     * the Meta modifier
     */
    public static final ModifierType META_MASK = new ModifierType(268435456);
    
    private int value;
    
    public ModifierType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ModifierType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ModifierType combined(ModifierType mask) {
        return new ModifierType(this.getValue() | mask.getValue());
    }
    
    public static ModifierType combined(ModifierType mask, ModifierType... masks) {
        int value = mask.getValue();
        for (ModifierType arg : masks) {
            value |= arg.getValue();
        }
        return new ModifierType(value);
    }
    
}
