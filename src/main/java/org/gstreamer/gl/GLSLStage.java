package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLSLStage} holds and represents a single OpenGL shader stage.
 */
public class GLSLStage extends org.gstreamer.gst.GstObject {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLSLStage";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLSLStage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLSLStage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLSLStage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLSLStage(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context, int type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new.invokeExact(
                    context.handle(),
                    type);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLSLStage(org.gstreamer.gl.GLContext context, int type) {
        super(constructNew(context, type));
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewDefaultFragment(org.gstreamer.gl.GLContext context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new_default_fragment.invokeExact(context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    public static GLSLStage newDefaultFragment(org.gstreamer.gl.GLContext context) {
        var RESULT = constructNewDefaultFragment(context);
        var OBJECT = (org.gstreamer.gl.GLSLStage) Interop.register(RESULT, org.gstreamer.gl.GLSLStage.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewDefaultVertex(org.gstreamer.gl.GLContext context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new_default_vertex.invokeExact(context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    public static GLSLStage newDefaultVertex(org.gstreamer.gl.GLContext context) {
        var RESULT = constructNewDefaultVertex(context);
        var OBJECT = (org.gstreamer.gl.GLSLStage) Interop.register(RESULT, org.gstreamer.gl.GLSLStage.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithString(org.gstreamer.gl.GLContext context, int type, org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile, java.lang.String str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new_with_string.invokeExact(
                        context.handle(),
                        type,
                        version.getValue(),
                        profile.getValue(),
                        Marshal.stringToAddress.marshal(str, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    public static GLSLStage newWithString(org.gstreamer.gl.GLContext context, int type, org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile, java.lang.String str) {
        var RESULT = constructNewWithString(context, type, version, profile, str);
        var OBJECT = (org.gstreamer.gl.GLSLStage) Interop.register(RESULT, org.gstreamer.gl.GLSLStage.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithStrings(org.gstreamer.gl.GLContext context, int type, org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile, int nStrings, java.lang.String[] str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new_with_strings.invokeExact(
                        context.handle(),
                        type,
                        version.getValue(),
                        profile.getValue(),
                        nStrings,
                        Interop.allocateNativeArray(str, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    public static GLSLStage newWithStrings(org.gstreamer.gl.GLContext context, int type, org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile, int nStrings, java.lang.String[] str) {
        var RESULT = constructNewWithStrings(context, type, version, profile, nStrings, str);
        var OBJECT = (org.gstreamer.gl.GLSLStage) Interop.register(RESULT, org.gstreamer.gl.GLSLStage.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public boolean compile() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_glsl_stage_compile.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public int getHandle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_get_handle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public org.gstreamer.gl.GLSLProfile getProfile() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_get_profile.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLSLProfile(RESULT);
    }
    
    public int getShaderType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_get_shader_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public org.gstreamer.gl.GLSLVersion getVersion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_get_version.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLSLVersion.of(RESULT);
    }
    
    /**
     * Replaces the current shader string with {@code str}.
     * @param version a {@link GLSLVersion}
     * @param profile a {@link GLSLProfile}
     * @param nStrings number of strings in {@code str}
     * @param str a GLSL shader string
     */
    public boolean setStrings(org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile, int nStrings, java.lang.String[] str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_glsl_stage_set_strings.invokeExact(
                        handle(),
                        version.getValue(),
                        profile.getValue(),
                        nStrings,
                        Interop.allocateNativeArray(str, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_glsl_stage_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLSLStage.Builder} object constructs a {@link GLSLStage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLSLStage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLSLStage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLSLStage}.
         * @return A new instance of {@code GLSLStage} with the properties 
         *         that were set in the Builder object.
         */
        public GLSLStage build() {
            return (GLSLStage) org.gtk.gobject.GObject.newWithProperties(
                GLSLStage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_glsl_stage_new = Interop.downcallHandle(
                "gst_glsl_stage_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_new_default_fragment = Interop.downcallHandle(
                "gst_glsl_stage_new_default_fragment",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_new_default_vertex = Interop.downcallHandle(
                "gst_glsl_stage_new_default_vertex",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_new_with_string = Interop.downcallHandle(
                "gst_glsl_stage_new_with_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_new_with_strings = Interop.downcallHandle(
                "gst_glsl_stage_new_with_strings",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_compile = Interop.downcallHandle(
                "gst_glsl_stage_compile",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_get_handle = Interop.downcallHandle(
                "gst_glsl_stage_get_handle",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_get_profile = Interop.downcallHandle(
                "gst_glsl_stage_get_profile",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_get_shader_type = Interop.downcallHandle(
                "gst_glsl_stage_get_shader_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_get_version = Interop.downcallHandle(
                "gst_glsl_stage_get_version",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_set_strings = Interop.downcallHandle(
                "gst_glsl_stage_set_strings",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_glsl_stage_get_type = Interop.downcallHandle(
                "gst_glsl_stage_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_glsl_stage_get_type != null;
    }
}
