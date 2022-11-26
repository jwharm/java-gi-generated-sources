package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes for {@code GtkIconTheme} operations.
 */
public class IconThemeError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconThemeError";
    
    /**
     * The icon specified does not exist in the theme
     */
    public static final IconThemeError NOT_FOUND = new IconThemeError(0);
    
    /**
     * An unspecified error occurred.
     */
    public static final IconThemeError FAILED = new IconThemeError(1);
    
    public IconThemeError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_theme_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_icon_theme_error_quark = Interop.downcallHandle(
            "gtk_icon_theme_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
