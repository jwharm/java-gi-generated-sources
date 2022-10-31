package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link FileIcon} specifies an icon by pointing to an image file
 * to be used as icon.
 */
public class FileIcon extends org.gtk.gobject.Object implements org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileIcon";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public FileIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FileIcon if its GType is a (or inherits from) "GFileIcon".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FileIcon" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GFileIcon", a ClassCastException will be thrown.
     */
    public static FileIcon castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GFileIcon"))) {
            return new FileIcon(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GFileIcon");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.File file) {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_file_icon_new.invokeExact(
                    file.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new icon for a file.
     * @param file a {@link File}.
     */
    public FileIcon(@NotNull org.gtk.gio.File file) {
        super(constructNew(file));
    }
    
    /**
     * Gets the {@link File} associated with the given {@code icon}.
     * @return a {@link File}.
     */
    public @NotNull org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_icon_get_file.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_icon_new = Interop.downcallHandle(
            "g_file_icon_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_file_icon_get_file = Interop.downcallHandle(
            "g_file_icon_get_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
