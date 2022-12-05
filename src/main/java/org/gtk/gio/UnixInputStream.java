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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.InputStream.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a UnixInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public UnixInputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to UnixInputStream if its GType is a (or inherits from) "GUnixInputStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code UnixInputStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GUnixInputStream", a ClassCastException will be thrown.
     */
    public static UnixInputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), UnixInputStream.getType())) {
            return new UnixInputStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GUnixInputStream");
        }
    }
    
    private static Addressable constructNew(int fd, boolean closeFd) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_input_stream_new.invokeExact(
                    fd,
                    closeFd ? 1 : 0);
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
        super(constructNew(fd, closeFd), Ownership.FULL);
    }
    
    /**
     * Returns whether the file descriptor of {@code stream} will be
     * closed when the stream is closed.
     * @return {@code true} if the file descriptor is closed when done
     */
    public boolean getCloseFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_input_stream_get_close_fd.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Return the UNIX file descriptor that the stream reads from.
     * @return The file descriptor of {@code stream}
     */
    public int getFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_input_stream_get_fd.invokeExact(
                    handle());
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
                    closeFd ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_unix_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.InputStream.Build {
        
         /**
         * A {@link UnixInputStream.Build} object constructs a {@link UnixInputStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link UnixInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link UnixInputStream} using {@link UnixInputStream#castFrom}.
         * @return A new instance of {@code UnixInputStream} with the properties 
         *         that were set in the Build object.
         */
        public UnixInputStream construct() {
            return UnixInputStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    UnixInputStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether to close the file descriptor when the stream is closed.
         * @param closeFd The value for the {@code close-fd} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCloseFd(boolean closeFd) {
            names.add("close-fd");
            values.add(org.gtk.gobject.Value.create(closeFd));
            return this;
        }
        
        /**
         * The file descriptor that the stream reads from.
         * @param fd The value for the {@code fd} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFd(int fd) {
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
}
