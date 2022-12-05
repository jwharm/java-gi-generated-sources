package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLSLStage} holds and represents a single OpenGL shader stage.
 */
public class GLSLStage extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLSLStage";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("context"),
        Interop.valueLayout.ADDRESS.withName("priv"),
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
    
    /**
     * Create a GLSLStage proxy instance for the provided memory address.
     * <p>
     * Because GLSLStage is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLSLStage(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLSLStage if its GType is a (or inherits from) "GstGLSLStage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLSLStage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLSLStage", a ClassCastException will be thrown.
     */
    public static GLSLStage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLSLStage.getType())) {
            return new GLSLStage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLSLStage");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLContext context, int type) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new.invokeExact(
                    context.handle(),
                    type);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLSLStage(@NotNull org.gstreamer.gl.GLContext context, int type) {
        super(constructNew(context, type), Ownership.NONE);
    }
    
    private static Addressable constructNewDefaultFragment(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new_default_fragment.invokeExact(
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLSLStage newDefaultFragment(@NotNull org.gstreamer.gl.GLContext context) {
        return new GLSLStage(constructNewDefaultFragment(context), Ownership.NONE);
    }
    
    private static Addressable constructNewDefaultVertex(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new_default_vertex.invokeExact(
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLSLStage newDefaultVertex(@NotNull org.gstreamer.gl.GLContext context) {
        return new GLSLStage(constructNewDefaultVertex(context), Ownership.NONE);
    }
    
    private static Addressable constructNewWithString(@NotNull org.gstreamer.gl.GLContext context, int type, @NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile, @NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new_with_string.invokeExact(
                    context.handle(),
                    type,
                    version.getValue(),
                    profile.getValue(),
                    Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLSLStage newWithString(@NotNull org.gstreamer.gl.GLContext context, int type, @NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile, @NotNull java.lang.String str) {
        return new GLSLStage(constructNewWithString(context, type, version, profile, str), Ownership.NONE);
    }
    
    private static Addressable constructNewWithStrings(@NotNull org.gstreamer.gl.GLContext context, int type, @NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile, int nStrings, @NotNull java.lang.String[] str) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_stage_new_with_strings.invokeExact(
                    context.handle(),
                    type,
                    version.getValue(),
                    profile.getValue(),
                    nStrings,
                    Interop.allocateNativeArray(str, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLSLStage newWithStrings(@NotNull org.gstreamer.gl.GLContext context, int type, @NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile, int nStrings, @NotNull java.lang.String[] str) {
        return new GLSLStage(constructNewWithStrings(context, type, version, profile, nStrings, str), Ownership.NONE);
    }
    
    public boolean compile() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_compile.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    public int getHandle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_get_handle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull org.gstreamer.gl.GLSLProfile getProfile() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_get_profile.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLSLProfile(RESULT);
    }
    
    public int getShaderType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_get_shader_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull org.gstreamer.gl.GLSLVersion getVersion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_get_version.invokeExact(
                    handle());
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
    public boolean setStrings(@NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile, int nStrings, @NotNull java.lang.String[] str) {
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_stage_set_strings.invokeExact(
                    handle(),
                    version.getValue(),
                    profile.getValue(),
                    nStrings,
                    Interop.allocateNativeArray(str, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_glsl_stage_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link GLSLStage.Build} object constructs a {@link GLSLStage} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLSLStage} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLSLStage} using {@link GLSLStage#castFrom}.
         * @return A new instance of {@code GLSLStage} with the properties 
         *         that were set in the Build object.
         */
        public GLSLStage construct() {
            return GLSLStage.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLSLStage.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
