package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link FileDescriptorBased} is implemented by streams (implementations of
 * {@link InputStream} or {@link OutputStream}) that are based on file descriptors.
 * <p>
 * Note that {@code <gio/gfiledescriptorbased.h>} belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the {@code gio-unix-2.0.pc} pkg-config
 * file when using it.
 * @version 2.24
 */
public interface FileDescriptorBased extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to FileDescriptorBased if its GType is a (or inherits from) "GFileDescriptorBased".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FileDescriptorBased" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GFileDescriptorBased", a ClassCastException will be thrown.
     */
    public static FileDescriptorBased castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GFileDescriptorBased"))) {
            return new FileDescriptorBasedImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GFileDescriptorBased");
        }
    }
    
    /**
     * Gets the underlying file descriptor.
     * @return The file descriptor
     */
    default int getFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_descriptor_based_get_fd.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_file_descriptor_based_get_fd = Interop.downcallHandle(
            "g_file_descriptor_based_get_fd",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
    
    class FileDescriptorBasedImpl extends org.gtk.gobject.Object implements FileDescriptorBased {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public FileDescriptorBasedImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
