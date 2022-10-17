package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link FileIcon} specifies an icon by pointing to an image file
 * to be used as icon.
 */
public class FileIcon extends org.gtk.gobject.Object implements Icon, LoadableIcon {

    public FileIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FileIcon */
    public static FileIcon castFrom(org.gtk.gobject.Object gobject) {
        return new FileIcon(gobject.refcounted());
    }
    
    private static final MethodHandle g_file_icon_new = Interop.downcallHandle(
        "g_file_icon_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull File file) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_file_icon_new.invokeExact(file.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new icon for a file.
     */
    public FileIcon(@NotNull File file) {
        super(constructNew(file));
    }
    
    private static final MethodHandle g_file_icon_get_file = Interop.downcallHandle(
        "g_file_icon_get_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link File} associated with the given {@code icon}.
     */
    public @NotNull File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_file_icon_get_file.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new File.FileImpl(Refcounted.get(RESULT, false));
    }
    
}
