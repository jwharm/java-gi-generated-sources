package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class ModifierType extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GdkModifierType";
    
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
    
    public ModifierType(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ModifierType or(ModifierType mask) {
        return new ModifierType(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ModifierType combined(ModifierType mask, ModifierType... masks) {
        int value = mask.getValue();        for (ModifierType arg : masks) {
            value |= arg.getValue();
        }
        return new ModifierType(value);
    }
}
