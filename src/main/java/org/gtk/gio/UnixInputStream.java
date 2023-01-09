package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link UnixInputStream} implements {@link InputStream} for reading from a UNIX
 * file descriptor, including asynchronous operations. (If the file
 * descriptor refers to a socket or pipe, this will use poll() to do
 * asynchronous I/O. If it refers to a regular file, it will fall back
 * to doing asynchronous I/O in another thread.)
 * <p>
 * Note that {@code <gio/gunixinputstream.h>} belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the {@code gio-unix-2.0.pc} pkg-config
 * file when using it.
 */
public class UnixInputStream extends org.gtk.gio.InputStream implements org.gtk.gio.FileDescriptorBased, org.gtk.gio.PollableInputStream {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixInputStream";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.InputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a UnixInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected UnixInputStream(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, UnixInputStream> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new UnixInputStream(input);
    
    private static MemoryAddress constructNew(int fd, boolean closeFd) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_input_stream_new.invokeExact(
                    fd,
                    Marshal.booleanToInteger.marshal(closeFd, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixInputStream} for the given {@code fd}.
     * <p>
     * If {@code close_fd} is {@code true}, the file descriptor will be closed
     * when the stream is closed.
     * @param fd a UNIX file descriptor
     * @param closeFd {@code true} to close the file descriptor when done
     */
    public UnixInputStream(int fd, boolean closeFd) {
        super(constructNew(fd, closeFd));
        this.takeOwnership();
    }
    
    /**
     * Returns whether the file descriptor of {@code stream} will be
     * closed when the stream is closed.
     * @return {@code true} if the file descriptor is closed when done
     */
    public boolean getCloseFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_input_stream_get_close_fd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Return the UNIX file descriptor that the stream reads from.
     * @return The file descriptor of {@code stream}
     */
    public int getFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_input_stream_get_fd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets whether the file descriptor of {@code stream} shall be closed
     * when the stream is closed.
     * @param closeFd {@code true} to close the file descriptor when done
     */
    public void setCloseFd(boolean closeFd) {
        try {
            DowncallHandles.g_unix_input_stream_set_close_fd.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(closeFd, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_unix_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link UnixInputStream.Builder} object constructs a {@link UnixInputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link UnixInputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.InputStream.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link UnixInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link UnixInputStream}.
         * @return A new instance of {@code UnixInputStream} with the properties 
         *         that were set in the Builder object.
         */
        public UnixInputStream build() {
            return (UnixInputStream) org.gtk.gobject.GObject.newWithProperties(
                UnixInputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to close the file descriptor when the stream is closed.
         * @param closeFd The value for the {@code close-fd} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCloseFd(boolean closeFd) {
            names.add("close-fd");
            values.add(org.gtk.gobject.Value.create(closeFd));
            return this;
        }
        
        /**
         * The file descriptor that the stream reads from.
         * @param fd The value for the {@code fd} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFd(int fd) {
            names.add("fd");
            values.add(org.gtk.gobject.Value.create(fd));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_input_stream_new = Interop.downcallHandle(
                "g_unix_input_stream_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_unix_input_stream_get_close_fd = Interop.downcallHandle(
                "g_unix_input_stream_get_close_fd",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_input_stream_get_fd = Interop.downcallHandle(
                "g_unix_input_stream_get_fd",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_unix_input_stream_set_close_fd = Interop.downcallHandle(
                "g_unix_input_stream_set_close_fd",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_unix_input_stream_get_type = Interop.downcallHandle(
                "g_unix_input_stream_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_unix_input_stream_get_type != null;
    }
}
