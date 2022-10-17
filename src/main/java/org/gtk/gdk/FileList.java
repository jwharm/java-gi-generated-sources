package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque type representing a list of files.
 */
public class FileList extends io.github.jwharm.javagi.ResourceBase {

    public FileList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gdk_file_list_get_files = Interop.downcallHandle(
        "gdk_file_list_get_files",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the list of files inside a {@code GdkFileList}.
     * <p>
     * This function is meant for language bindings.
     */
    public @NotNull org.gtk.glib.SList getFiles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_file_list_get_files.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
    }
    
}
