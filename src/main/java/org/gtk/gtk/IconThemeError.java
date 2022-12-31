package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes for {@code GtkIconTheme} operations.
 */
public enum IconThemeError implements io.github.jwharm.javagi.Enumeration {
    /**
     * The icon specified does not exist in the theme
     */
    NOT_FOUND(0),
    /**
     * An unspecified error occurred.
     */
    FAILED(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconThemeError";
    
    private final int value;
    IconThemeError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static IconThemeError of(int value) {
        return switch (value) {
            case 0 -> NOT_FOUND;
            case 1 -> FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
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
