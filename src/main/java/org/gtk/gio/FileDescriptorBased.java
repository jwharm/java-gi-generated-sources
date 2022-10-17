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
 */
public interface FileDescriptorBased extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_file_descriptor_based_get_fd = Interop.downcallHandle(
        "g_file_descriptor_based_get_fd",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the underlying file descriptor.
     */
    default int getFd() {
        int RESULT;
        try {
            RESULT = (int) g_file_descriptor_based_get_fd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    class FileDescriptorBasedImpl extends org.gtk.gobject.Object implements FileDescriptorBased {
        public FileDescriptorBasedImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
