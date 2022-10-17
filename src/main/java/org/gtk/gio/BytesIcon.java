package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link BytesIcon} specifies an image held in memory in a common format (usually
 * png) to be used as icon.
 */
public class BytesIcon extends org.gtk.gobject.Object implements Icon, LoadableIcon {

    public BytesIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BytesIcon */
    public static BytesIcon castFrom(org.gtk.gobject.Object gobject) {
        return new BytesIcon(gobject.refcounted());
    }
    
    private static final MethodHandle g_bytes_icon_new = Interop.downcallHandle(
        "g_bytes_icon_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Bytes bytes) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_bytes_icon_new.invokeExact(bytes.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new icon for a bytes.
     * <p>
     * This cannot fail, but loading and interpreting the bytes may fail later on
     * (for example, if g_loadable_icon_load() is called) if the image is invalid.
     */
    public BytesIcon(@NotNull org.gtk.glib.Bytes bytes) {
        super(constructNew(bytes));
    }
    
    private static final MethodHandle g_bytes_icon_get_bytes = Interop.downcallHandle(
        "g_bytes_icon_get_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Bytes} associated with the given {@code icon}.
     */
    public @NotNull org.gtk.glib.Bytes getBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bytes_icon_get_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, false));
    }
    
}
