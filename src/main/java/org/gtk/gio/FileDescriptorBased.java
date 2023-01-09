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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileDescriptorBasedImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileDescriptorBasedImpl(input);
    
    /**
     * Gets the underlying file descriptor.
     * @return The file descriptor
     */
    default int getFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_descriptor_based_get_fd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_file_descriptor_based_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_file_descriptor_based_get_fd = Interop.downcallHandle(
                "g_file_descriptor_based_get_fd",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_descriptor_based_get_type = Interop.downcallHandle(
                "g_file_descriptor_based_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The FileDescriptorBasedImpl type represents a native instance of the FileDescriptorBased interface.
     */
    class FileDescriptorBasedImpl extends org.gtk.gobject.GObject implements FileDescriptorBased {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of FileDescriptorBased for the provided memory address.
         * @param address the memory address of the instance
         */
        public FileDescriptorBasedImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_file_descriptor_based_get_type != null;
    }
}
