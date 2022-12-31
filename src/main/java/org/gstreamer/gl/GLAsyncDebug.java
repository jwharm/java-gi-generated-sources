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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    protected GLAsyncDebug(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLAsyncDebug> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLAsyncDebug(input, ownership);
    
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
     * @param object a {@link org.gtk.gobject.GObject} to associate with the debug message
     * @param format a printf style format string
     * @param varargs the list of arguments for {@code format}
     */
    public void storeLogMsg(org.gstreamer.gst.DebugCategory cat, org.gstreamer.gst.DebugLevel level, java.lang.String file, java.lang.String function, int line, @Nullable org.gtk.gobject.GObject object, java.lang.String format, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_gl_async_debug_store_log_msg.invokeExact(
                    handle(),
                    cat.handle(),
                    level.getValue(),
                    Marshal.stringToAddress.marshal(file, null),
                    Marshal.stringToAddress.marshal(function, null),
                    line,
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    Marshal.stringToAddress.marshal(format, null),
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
     * @param object a {@link org.gtk.gobject.GObject} to associate with the debug message
     * @param format a printf style format string
     * @param varargs the list of arguments for {@code format}
     */
    public void storeLogMsgValist(org.gstreamer.gst.DebugCategory cat, org.gstreamer.gst.DebugLevel level, java.lang.String file, java.lang.String function, int line, @Nullable org.gtk.gobject.GObject object, java.lang.String format, VaList varargs) {
        try {
            DowncallHandles.gst_gl_async_debug_store_log_msg_valist.invokeExact(
                    handle(),
                    cat.handle(),
                    level.getValue(),
                    Marshal.stringToAddress.marshal(file, null),
                    Marshal.stringToAddress.marshal(function, null),
                    line,
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()),
                    Marshal.stringToAddress.marshal(format, null),
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
    public static org.gstreamer.gl.GLAsyncDebug new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_async_debug_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLAsyncDebug.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
     * A {@link GLAsyncDebug.Builder} object constructs a {@link GLAsyncDebug} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLAsyncDebug.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLAsyncDebug struct;
        
        private Builder() {
            struct = GLAsyncDebug.allocate();
        }
        
         /**
         * Finish building the {@link GLAsyncDebug} struct.
         * @return A new instance of {@code GLAsyncDebug} with the fields 
         *         that were set in the Builder object.
         */
        public GLAsyncDebug build() {
            return struct;
        }
        
        public Builder setStateFlags(int stateFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), stateFlags);
            return this;
        }
        
        public Builder setCat(org.gstreamer.gst.DebugCategory cat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cat"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cat == null ? MemoryAddress.NULL : cat.handle()));
            return this;
        }
        
        public Builder setLevel(org.gstreamer.gst.DebugLevel level) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (level == null ? MemoryAddress.NULL : level.getValue()));
            return this;
        }
        
        public Builder setFile(java.lang.String file) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (file == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(file, null)));
            return this;
        }
        
        public Builder setFunction(java.lang.String function) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("function"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (function == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(function, null)));
            return this;
        }
        
        public Builder setLine(int line) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("line"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), line);
            return this;
        }
        
        public Builder setObject(org.gtk.gobject.GObject object) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (object == null ? MemoryAddress.NULL : object.handle()));
            return this;
        }
        
        public Builder setDebugMsg(java.lang.String debugMsg) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("debug_msg"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (debugMsg == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(debugMsg, null)));
            return this;
        }
        
        public Builder setCallback(org.gstreamer.gl.GLAsyncDebugLogGetMessage callback) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("callback"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()));
            return this;
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Builder setNotify(org.gtk.glib.DestroyNotify notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
