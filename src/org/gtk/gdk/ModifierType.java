package org.gtk.gdk;

/**
 * Flags to indicate the state of modifier keys and mouse buttons
 * in events.
 * 
 * Typical modifier keys are Shift, Control, Meta, Super, Hyper, Alt, Compose,
 * Apple, CapsLock or ShiftLock.
 * 
 * Note that GDK may add internal values to events which include values outside
 * of this enumeration. Your code should preserve and ignore them.  You can use
 * %GDK_MODIFIER_MASK to remove all private values.
 */
public class ModifierType {

    /**
     * the Shift key.
     */
    public static final int SHIFT_MASK = 1;
    
    /**
     * a Lock key (depending on the modifier mapping of the
     *  X server this may either be CapsLock or ShiftLock).
     */
    public static final int LOCK_MASK = 2;
    
    /**
     * the Control key.
     */
    public static final int CONTROL_MASK = 4;
    
    /**
     * the fourth modifier key (it depends on the modifier
     *  mapping of the X server which key is interpreted as this modifier, but
     *  normally it is the Alt key).
     */
    public static final int ALT_MASK = 8;
    
    /**
     * the first mouse button.
     */
    public static final int BUTTON1_MASK = 256;
    
    /**
     * the second mouse button.
     */
    public static final int BUTTON2_MASK = 512;
    
    /**
     * the third mouse button.
     */
    public static final int BUTTON3_MASK = 1024;
    
    /**
     * the fourth mouse button.
     */
    public static final int BUTTON4_MASK = 2048;
    
    /**
     * the fifth mouse button.
     */
    public static final int BUTTON5_MASK = 4096;
    
    /**
     * the Super modifier
     */
    public static final int SUPER_MASK = 67108864;
    
    /**
     * the Hyper modifier
     */
    public static final int HYPER_MASK = 134217728;
    
    /**
     * the Meta modifier
     */
    public static final int META_MASK = 268435456;
    
}
