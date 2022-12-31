package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link GLQuery} represents and holds an OpenGL query object.  Various types of
 * queries can be run or counters retrieved.
 * @version 1.10
 */
public class GLQuery extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLQuery";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.C_INT.withName("query_type"),
            Interop.valueLayout.C_INT.withName("query_id"),
            Interop.valueLayout.C_INT.withName("supported"),
            Interop.valueLayout.C_INT.withName("start_called"),
            org.gstreamer.gl.GLAsyncDebug.getMemoryLayout().withName("debug"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLQuery}
     * @return A new, uninitialized @{link GLQuery}
     */
    public static GLQuery allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLQuery newInstance = new GLQuery(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a GLQuery proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLQuery(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLQuery> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLQuery(input, ownership);
    
    /**
     * Record the result of a counter
     */
    public void counter() {
        try {
            DowncallHandles.gst_gl_query_counter.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * End counting the query
     */
    public void end() {
        try {
            DowncallHandles.gst_gl_query_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees a {@link GLQuery}
     */
    public void free() {
        try {
            DowncallHandles.gst_gl_query_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void init(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLQueryType queryType) {
        try {
            DowncallHandles.gst_gl_query_init.invokeExact(
                    handle(),
                    context.handle(),
                    queryType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public long result() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_query_result.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Start counting the query
     */
    public void start() {
        try {
            DowncallHandles.gst_gl_query_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free any dynamically allocated resources
     */
    public void unset() {
        try {
            DowncallHandles.gst_gl_query_unset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Performs a GST_QUERY_CONTEXT query of type "gst.gl.local_context" on all
     * {@code GstPads} in {@code element} of {@code direction} for the local OpenGL context used by
     * GStreamer elements.
     * @param element a {@link org.gstreamer.gst.Element} to query from
     * @param direction the {@link org.gstreamer.gst.PadDirection} to query
     * @param contextPtr location containing the current and/or resulting
     *                      {@link GLContext}
     * @return whether {@code context_ptr} contains a {@link GLContext}
     */
    public static boolean localGlContext(org.gstreamer.gst.Element element, org.gstreamer.gst.PadDirection direction, Out<org.gstreamer.gl.GLContext> contextPtr) {
        MemorySegment contextPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_query_local_gl_context.invokeExact(
                    element.handle(),
                    direction.getValue(),
                    (Addressable) contextPtrPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        contextPtr.set((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(contextPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gl.GLContext.fromAddress).marshal(contextPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Free with gst_gl_query_free()
     * @param context a {@link GLContext}
     * @param queryType the {@link GLQueryType} to create
     * @return a new {@link GLQuery}
     */
    public static org.gstreamer.gl.GLQuery new_(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLQueryType queryType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_query_new.invokeExact(
                    context.handle(),
                    queryType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLQuery.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_query_counter = Interop.downcallHandle(
            "gst_gl_query_counter",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_query_end = Interop.downcallHandle(
            "gst_gl_query_end",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_query_free = Interop.downcallHandle(
            "gst_gl_query_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_query_init = Interop.downcallHandle(
            "gst_gl_query_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_query_result = Interop.downcallHandle(
            "gst_gl_query_result",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_query_start = Interop.downcallHandle(
            "gst_gl_query_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_query_unset = Interop.downcallHandle(
            "gst_gl_query_unset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_query_local_gl_context = Interop.downcallHandle(
            "gst_gl_query_local_gl_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_query_new = Interop.downcallHandle(
            "gst_gl_query_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
    
    /**
     * A {@link GLQuery.Builder} object constructs a {@link GLQuery} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLQuery.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLQuery struct;
        
        private Builder() {
            struct = GLQuery.allocate();
        }
        
         /**
         * Finish building the {@link GLQuery} struct.
         * @return A new instance of {@code GLQuery} with the fields 
         *         that were set in the Builder object.
         */
        public GLQuery build() {
            return struct;
        }
        
        public Builder setContext(org.gstreamer.gl.GLContext context) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
            return this;
        }
        
        public Builder setQueryType(int queryType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), queryType);
            return this;
        }
        
        public Builder setQueryId(int queryId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), queryId);
            return this;
        }
        
        public Builder setSupported(boolean supported) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supported"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(supported, null).intValue());
            return this;
        }
        
        public Builder setStartCalled(boolean startCalled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_called"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(startCalled, null).intValue());
            return this;
        }
        
        public Builder setDebug(org.gstreamer.gl.GLAsyncDebug debug) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("debug"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (debug == null ? MemoryAddress.NULL : debug.handle()));
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
