package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Built-in icon sizes.
 * <p>
 * Icon sizes default to being inherited. Where they cannot be
 * inherited, text size is the default.
 * <p>
 * All widgets which use {@code GtkIconSize} set the normal-icons or
 * large-icons style classes correspondingly, and let themes
 * determine the actual size to be used with the
 * {@code -gtk-icon-size} CSS property.
 */
public class IconSize extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Keep the size of the parent element
     */
    public static final IconSize INHERIT = new IconSize(0);
    
    /**
     * Size similar to text size
     */
    public static final IconSize NORMAL = new IconSize(1);
    
    /**
     * Large size, for example in an icon view
     */
    public static final IconSize LARGE = new IconSize(2);
    
    public IconSize(int value) {
        super(value);
    }
}
