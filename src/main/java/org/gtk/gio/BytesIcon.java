package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link BytesIcon} specifies an image held in memory in a common format (usually
 * png) to be used as icon.
 * @version 2.38
 */
public class BytesIcon extends org.gtk.gobject.Object implements org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GBytesIcon";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public BytesIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to BytesIcon if its GType is a (or inherits from) "GBytesIcon".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BytesIcon" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GBytesIcon", a ClassCastException will be thrown.
     */
    public static BytesIcon castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GBytesIcon"))) {
            return new BytesIcon(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GBytesIcon");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Bytes bytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_bytes_icon_new.invokeExact(
                    bytes.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new icon for a bytes.
     * <p>
     * This cannot fail, but loading and interpreting the bytes may fail later on
     * (for example, if g_loadable_icon_load() is called) if the image is invalid.
     * @param bytes a {@link org.gtk.glib.Bytes}.
     */
    public BytesIcon(@NotNull org.gtk.glib.Bytes bytes) {
        super(constructNew(bytes));
    }
    
    /**
     * Gets the {@link org.gtk.glib.Bytes} associated with the given {@code icon}.
     * @return a {@link org.gtk.glib.Bytes}.
     */
    public @NotNull org.gtk.glib.Bytes getBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bytes_icon_get_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_bytes_icon_new = Interop.downcallHandle(
            "g_bytes_icon_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bytes_icon_get_bytes = Interop.downcallHandle(
            "g_bytes_icon_get_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
