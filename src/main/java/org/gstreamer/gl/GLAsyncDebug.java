package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLAsyncDebug} an opaque structure and should only be accessed through the
 * provided API.
 */
public class GLAsyncDebug extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLAsyncDebug";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("state_flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("cat"),
        Interop.valueLayout.C_INT.withName("level"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("file"),
        Interop.valueLayout.ADDRESS.withName("function"),
        Interop.valueLayout.C_INT.withName("line"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("object"),
        Interop.valueLayout.ADDRESS.withName("debug_msg"),
        Interop.valueLayout.ADDRESS.withName("callback"),
        Interop.valueLayout.ADDRESS.withName("user_data"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLAsyncDebug}
     * @return A new, uninitialized @{link GLAsyncDebug}
     */
    public static GLAsyncDebug allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLAsyncDebug newInstance = new GLAsyncDebug(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a GLAsyncDebug proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLAsyncDebug(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Frees {@code ad}
     */
    public void free() {
        try {
            DowncallHandles.gst_gl_async_debug_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * freeze the debug output.  While frozen, any call to
     * gst_gl_async_debug_output_log_msg() will not output any messages but
     * subsequent calls to gst_gl_async_debug_store_log_msg() will overwrite previous
     * messages.
     */
    public void freeze() {
        try {
            DowncallHandles.gst_gl_async_debug_freeze.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initialize {@code ad}.  Intended for use with {@link GLAsyncDebug}'s that are embedded
     * in other structs.
     */
    public void init() {
        try {
            DowncallHandles.gst_gl_async_debug_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Outputs a previously stored debug message.
     */
    public void outputLogMsg() {
        try {
            DowncallHandles.gst_gl_async_debug_output_log_msg.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stores a debug message for later output by gst_gl_async_debug_output_log_msg()
     * @param cat the {@link org.gstreamer.gst.DebugCategory} to output the message in
     * @param level the {@link org.gstreamer.gst.DebugLevel}
     * @param file the file where the debug message originates from
     * @param function the function where the debug message originates from
     * @param line the line in {@code file} where the debug message originates from
     * @param object a {@link org.gtk.gobject.Object} to associate with the debug message
     * @param format a printf style format string
     * @param varargs the list of arguments for {@code format}
     */
    public void storeLogMsg(@NotNull org.gstreamer.gst.DebugCategory cat, @NotNull org.gstreamer.gst.DebugLevel level, @NotNull java.lang.String file, @NotNull java.lang.String function, int line, @Nullable org.gtk.gobject.Object object, @NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(cat, "Parameter 'cat' must not be null");
        java.util.Objects.requireNonNull(level, "Parameter 'level' must not be null");
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        java.util.Objects.requireNonNull(function, "Parameter 'function' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.gst_gl_async_debug_store_log_msg.invokeExact(
                    handle(),
                    cat.handle(),
                    level.getValue(),
                    Interop.allocateNativeString(file),
                    Interop.allocateNativeString(function),
                    line,
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stores a debug message for later output by gst_gl_async_debug_output_log_msg()
     * @param cat the {@link org.gstreamer.gst.DebugCategory} to output the message in
     * @param level the {@link org.gstreamer.gst.DebugLevel}
     * @param file the file where the debug message originates from
     * @param function the function where the debug message originates from
     * @param line the line in {@code file} where the debug message originates from
     * @param object a {@link org.gtk.gobject.Object} to associate with the debug message
     * @param format a printf style format string
     * @param varargs the list of arguments for {@code format}
     */
    public void storeLogMsgValist(@NotNull org.gstreamer.gst.DebugCategory cat, @NotNull org.gstreamer.gst.DebugLevel level, @NotNull java.lang.String file, @NotNull java.lang.String function, int line, @Nullable org.gtk.gobject.Object object, @NotNull java.lang.String format, @NotNull VaList varargs) {
        java.util.Objects.requireNonNull(cat, "Parameter 'cat' must not be null");
        java.util.Objects.requireNonNull(level, "Parameter 'level' must not be null");
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        java.util.Objects.requireNonNull(function, "Parameter 'function' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(varargs, "Parameter 'varargs' must not be null");
        try {
            DowncallHandles.gst_gl_async_debug_store_log_msg_valist.invokeExact(
                    handle(),
                    cat.handle(),
                    level.getValue(),
                    Interop.allocateNativeString(file),
                    Interop.allocateNativeString(function),
                    line,
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * unfreeze the debug output.  See gst_gl_async_debug_freeze() for what freezing means
     */
    public void thaw() {
        try {
            DowncallHandles.gst_gl_async_debug_thaw.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unset any dynamically allocated data.  Intended for use with
     * {@link GLAsyncDebug}'s that are embedded in other structs.
     */
    public void unset() {
        try {
            DowncallHandles.gst_gl_async_debug_unset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free with gst_gl_async_debug_free()
     * @return a new {@link GLAsyncDebug}
     */
    public static @NotNull org.gstreamer.gl.GLAsyncDebug new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_async_debug_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLAsyncDebug(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_async_debug_free = Interop.downcallHandle(
            "gst_gl_async_debug_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_async_debug_freeze = Interop.downcallHandle(
            "gst_gl_async_debug_freeze",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_async_debug_init = Interop.downcallHandle(
            "gst_gl_async_debug_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_async_debug_output_log_msg = Interop.downcallHandle(
            "gst_gl_async_debug_output_log_msg",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_async_debug_store_log_msg = Interop.downcallHandle(
            "gst_gl_async_debug_store_log_msg",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_gl_async_debug_store_log_msg_valist = Interop.downcallHandle(
            "gst_gl_async_debug_store_log_msg_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_async_debug_thaw = Interop.downcallHandle(
            "gst_gl_async_debug_thaw",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_async_debug_unset = Interop.downcallHandle(
            "gst_gl_async_debug_unset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_async_debug_new = Interop.downcallHandle(
            "gst_gl_async_debug_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLAsyncDebug struct;
        
         /**
         * A {@link GLAsyncDebug.Build} object constructs a {@link GLAsyncDebug} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLAsyncDebug.allocate();
        }
        
         /**
         * Finish building the {@link GLAsyncDebug} struct.
         * @return A new instance of {@code GLAsyncDebug} with the fields 
         *         that were set in the Build object.
         */
        public GLAsyncDebug construct() {
            return struct;
        }
        
        public Build setStateFlags(int stateFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), stateFlags);
            return this;
        }
        
        public Build setCat(org.gstreamer.gst.DebugCategory cat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cat"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cat == null ? MemoryAddress.NULL : cat.handle()));
            return this;
        }
        
        public Build setLevel(org.gstreamer.gst.DebugLevel level) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (level == null ? MemoryAddress.NULL : level.getValue()));
            return this;
        }
        
        public Build setFile(java.lang.String file) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (file == null ? MemoryAddress.NULL : Interop.allocateNativeString(file)));
            return this;
        }
        
        public Build setFunction(java.lang.String function) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("function"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (function == null ? MemoryAddress.NULL : Interop.allocateNativeString(function)));
            return this;
        }
        
        public Build setLine(int line) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), line);
            return this;
        }
        
        public Build setObject(org.gtk.gobject.Object object) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (object == null ? MemoryAddress.NULL : object.handle()));
            return this;
        }
        
        public Build setDebugMsg(java.lang.String debugMsg) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("debug_msg"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (debugMsg == null ? MemoryAddress.NULL : Interop.allocateNativeString(debugMsg)));
            return this;
        }
        
        public Build setCallback(java.lang.foreign.MemoryAddress callback) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("callback"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (callback == null ? MemoryAddress.NULL : callback));
            return this;
        }
        
        public Build setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Build setNotify(java.lang.foreign.MemoryAddress notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : notify));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
