package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the granularity of font selection
 * that is desired in a {@code GtkFontChooser}.
 * <p>
 * This enumeration may be extended in the future; applications should
 * ignore unknown values.
 */
public class FontChooserLevel extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkFontChooserLevel";
    
    /**
     * Allow selecting a font family
     */
    public static final FontChooserLevel FAMILY = new FontChooserLevel(0);
    
    /**
     * Allow selecting a specific font face
     */
    public static final FontChooserLevel STYLE = new FontChooserLevel(1);
    
    /**
     * Allow selecting a specific font size
     */
    public static final FontChooserLevel SIZE = new FontChooserLevel(2);
    
    /**
     * Allow changing OpenType font variation axes
     */
    public static final FontChooserLevel VARIATIONS = new FontChooserLevel(4);
    
    /**
     * Allow selecting specific OpenType font features
     */
    public static final FontChooserLevel FEATURES = new FontChooserLevel(8);
    
    public FontChooserLevel(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FontChooserLevel or(FontChooserLevel... masks) {
        int value = this.getValue();
        for (FontChooserLevel arg : masks) {
            value |= arg.getValue();
        }
        return new FontChooserLevel(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FontChooserLevel combined(FontChooserLevel mask, FontChooserLevel... masks) {
        int value = mask.getValue();
        for (FontChooserLevel arg : masks) {
            value |= arg.getValue();
        }
        return new FontChooserLevel(value);
    }
}
