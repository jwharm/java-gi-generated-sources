package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLShader extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLShader";
    
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
     * Create a GLShader proxy instance for the provided memory address.
     * <p>
     * Because GLShader is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLShader(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLShader if its GType is a (or inherits from) "GstGLShader".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLShader} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLShader", a ClassCastException will be thrown.
     */
    public static GLShader castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLShader.getType())) {
            return new GLShader(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLShader");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_new.invokeExact(
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Note: must be called in the GL thread
     * @param context a {@link GLContext}
     */
    public GLShader(@NotNull org.gstreamer.gl.GLContext context) {
        super(constructNew(context), Ownership.FULL);
    }
    
    private static Addressable constructNewDefault(@NotNull org.gstreamer.gl.GLContext context) throws GErrorException {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_new_default.invokeExact(
                    context.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Note: must be called in the GL thread
     * @param context a {@link GLContext}
     * @return a default {@code shader} or {@code null} on failure
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static GLShader newDefault(@NotNull org.gstreamer.gl.GLContext context) throws GErrorException {
        return new GLShader(constructNewDefault(context), Ownership.FULL);
    }
    
    private static Addressable constructNewLinkWithStages(@NotNull org.gstreamer.gl.GLContext context, @NotNull PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_new_link_with_stages.invokeExact(
                    context.handle(),
                    error.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Each stage will attempt to be compiled and attached to {@code shader}.  Then
     * the shader will be linked. On error, {@code null} will be returned and {@code error} will
     * contain the details of the error.
     * <p>
     * Note: must be called in the GL thread
     * @param context a {@link GLContext}
     * @param error a {@link org.gtk.glib.Error}
     * @param varargs a NULL terminated list of {@link GLSLStage}'s
     * @return a new {@code shader} with the specified stages.
     */
    public static GLShader newLinkWithStages(@NotNull org.gstreamer.gl.GLContext context, @NotNull PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        return new GLShader(constructNewLinkWithStages(context, error, varargs), Ownership.FULL);
    }
    
    private static Addressable constructNewWithStages(@NotNull org.gstreamer.gl.GLContext context, @NotNull PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_new_with_stages.invokeExact(
                    context.handle(),
                    error.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Each stage will attempt to be compiled and attached to {@code shader}.  On error,
     * {@code null} will be returned and {@code error} will contain the details of the error.
     * <p>
     * Note: must be called in the GL thread
     * @param context a {@link GLContext}
     * @param error a {@link org.gtk.glib.Error}
     * @param varargs a NULL terminated list of {@link GLSLStage}'s
     * @return a new {@code shader} with the specified stages.
     */
    public static GLShader newWithStages(@NotNull org.gstreamer.gl.GLContext context, @NotNull PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        return new GLShader(constructNewWithStages(context, error, varargs), Ownership.FULL);
    }
    
    /**
     * Attaches {@code stage} to {@code shader}.  {@code stage} must have been successfully compiled
     * with gst_glsl_stage_compile().
     * <p>
     * Note: must be called in the GL thread
     * @param stage a {@link GLSLStage} to attach
     * @return whether {@code stage} could be attached to {@code shader}
     */
    public boolean attach(@NotNull org.gstreamer.gl.GLSLStage stage) {
        java.util.Objects.requireNonNull(stage, "Parameter 'stage' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_attach.invokeExact(
                    handle(),
                    stage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Attaches {@code stage} to {@code shader}.  {@code stage} must have been successfully compiled
     * with gst_glsl_stage_compile().
     * <p>
     * Note: must be called in the GL thread
     * @param stage a {@link GLSLStage} to attach
     * @return whether {@code stage} could be attached to {@code shader}
     */
    public boolean attachUnlocked(@NotNull org.gstreamer.gl.GLSLStage stage) {
        java.util.Objects.requireNonNull(stage, "Parameter 'stage' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_attach_unlocked.invokeExact(
                    handle(),
                    stage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Bind attribute {@code name} to the specified location {@code index} using
     * {@code glBindAttributeLocation()}.
     * @param index attribute index to set
     * @param name name of the attribute
     */
    public void bindAttributeLocation(int index, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_bind_attribute_location.invokeExact(
                    handle(),
                    index,
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Bind attribute {@code name} to the specified location {@code index} using
     * {@code glBindFragDataLocation()}.
     * @param index attribute index to set
     * @param name name of the attribute
     */
    public void bindFragDataLocation(int index, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_bind_frag_data_location.invokeExact(
                    handle(),
                    index,
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compiles {@code stage} and attaches it to {@code shader}.
     * <p>
     * Note: must be called in the GL thread
     * @param stage a {@link GLSLStage} to attach
     * @return whether {@code stage} could be compiled and attached to {@code shader}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean compileAttachStage(@NotNull org.gstreamer.gl.GLSLStage stage) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(stage, "Parameter 'stage' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_compile_attach_stage.invokeExact(
                    handle(),
                    stage.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Detaches {@code stage} from {@code shader}.  {@code stage} must have been successfully attached
     * to {@code shader} with gst_gl_shader_attach() or gst_gl_shader_attach_unlocked().
     * <p>
     * Note: must be called in the GL thread
     * @param stage a {@link GLSLStage} to attach
     */
    public void detach(@NotNull org.gstreamer.gl.GLSLStage stage) {
        java.util.Objects.requireNonNull(stage, "Parameter 'stage' must not be null");
        try {
            DowncallHandles.gst_gl_shader_detach.invokeExact(
                    handle(),
                    stage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Detaches {@code stage} from {@code shader}.  {@code stage} must have been successfully attached
     * to {@code shader} with gst_gl_shader_attach() or gst_gl_shader_attach_unlocked().
     * <p>
     * Note: must be called in the GL thread
     * @param stage a {@link GLSLStage} to attach
     */
    public void detachUnlocked(@NotNull org.gstreamer.gl.GLSLStage stage) {
        java.util.Objects.requireNonNull(stage, "Parameter 'stage' must not be null");
        try {
            DowncallHandles.gst_gl_shader_detach_unlocked.invokeExact(
                    handle(),
                    stage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public int getAttributeLocation(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_get_attribute_location.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getProgramHandle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_get_program_handle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Note: must be called in the GL thread
     * @return whether {@code shader} has been successfully linked
     */
    public boolean isLinked() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_is_linked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Links the current list of {@link GLSLStage}'s in {@code shader}.
     * <p>
     * Note: must be called in the GL thread
     * @return whether {@code shader} could be linked together.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean link() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_link.invokeExact(
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
    
    /**
     * Releases the shader and stages.
     * <p>
     * Note: must be called in the GL thread
     */
    public void release() {
        try {
            DowncallHandles.gst_gl_shader_release.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Releases the shader and stages.
     * <p>
     * Note: must be called in the GL thread
     */
    public void releaseUnlocked() {
        try {
            DowncallHandles.gst_gl_shader_release_unlocked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform1f()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param value value to set
     */
    public void setUniform1f(@NotNull java.lang.String name, float value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_1f.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform1fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform1fv(@NotNull java.lang.String name, int count, @NotNull float[] value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_1fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    Interop.allocateNativeArray(value, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform1i()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param value value to set
     */
    public void setUniform1i(@NotNull java.lang.String name, int value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_1i.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform1iv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform1iv(@NotNull java.lang.String name, int count, @NotNull int[] value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_1iv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    Interop.allocateNativeArray(value, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform2f()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     */
    public void setUniform2f(@NotNull java.lang.String name, float v0, float v1) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_2f.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    v0,
                    v1);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform2fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform2fv(@NotNull java.lang.String name, int count, @NotNull float[] value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_2fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    Interop.allocateNativeArray(value, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform2i()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     */
    public void setUniform2i(@NotNull java.lang.String name, int v0, int v1) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_2i.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    v0,
                    v1);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform2iv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform2iv(@NotNull java.lang.String name, int count, @NotNull int[] value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_2iv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    Interop.allocateNativeArray(value, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform3f()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     * @param v2 third value to set
     */
    public void setUniform3f(@NotNull java.lang.String name, float v0, float v1, float v2) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_3f.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    v0,
                    v1,
                    v2);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform3fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform3fv(@NotNull java.lang.String name, int count, @NotNull float[] value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_3fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    Interop.allocateNativeArray(value, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform3i()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     * @param v2 third value to set
     */
    public void setUniform3i(@NotNull java.lang.String name, int v0, int v1, int v2) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_3i.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    v0,
                    v1,
                    v2);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform3iv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform3iv(@NotNull java.lang.String name, int count, @NotNull int[] value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_3iv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    Interop.allocateNativeArray(value, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform4f()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     * @param v2 third value to set
     * @param v3 fourth value to set
     */
    public void setUniform4f(@NotNull java.lang.String name, float v0, float v1, float v2, float v3) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_4f.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    v0,
                    v1,
                    v2,
                    v3);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform4fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform4fv(@NotNull java.lang.String name, int count, @NotNull float[] value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_4fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    Interop.allocateNativeArray(value, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform4i()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     * @param v2 third value to set
     * @param v3 fourth value to set
     */
    public void setUniform4i(@NotNull java.lang.String name, int v0, int v1, int v2, int v3) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_4i.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    v0,
                    v1,
                    v2,
                    v3);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform4iv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform4iv(@NotNull java.lang.String name, int count, @NotNull int[] value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_4iv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    Interop.allocateNativeArray(value, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniformMatrix2fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 2x2 matrices to set
     * @param transpose transpose the matrix
     * @param value matrix to set
     */
    public void setUniformMatrix2fv(@NotNull java.lang.String name, int count, boolean transpose, PointerFloat value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_matrix_2fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    transpose ? 1 : 0,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniformMatrix2x3fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 2x3 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix2x3fv(@NotNull java.lang.String name, int count, boolean transpose, PointerFloat value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_matrix_2x3fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    transpose ? 1 : 0,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniformMatrix2x4fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 2x4 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix2x4fv(@NotNull java.lang.String name, int count, boolean transpose, PointerFloat value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_matrix_2x4fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    transpose ? 1 : 0,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniformMatrix3fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 3x3 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix3fv(@NotNull java.lang.String name, int count, boolean transpose, PointerFloat value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_matrix_3fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    transpose ? 1 : 0,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniformMatrix3x2fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 3x2 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix3x2fv(@NotNull java.lang.String name, int count, boolean transpose, PointerFloat value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_matrix_3x2fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    transpose ? 1 : 0,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniformMatrix3x4fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 3x4 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix3x4fv(@NotNull java.lang.String name, int count, boolean transpose, PointerFloat value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_matrix_3x4fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    transpose ? 1 : 0,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniformMatrix4fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 4x4 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix4fv(@NotNull java.lang.String name, int count, boolean transpose, PointerFloat value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_matrix_4fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    transpose ? 1 : 0,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniformMatrix4x2fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 4x2 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix4x2fv(@NotNull java.lang.String name, int count, boolean transpose, PointerFloat value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_matrix_4x2fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    transpose ? 1 : 0,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniformMatrix4x3fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 4x3 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix4x3fv(@NotNull java.lang.String name, int count, boolean transpose, PointerFloat value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_gl_shader_set_uniform_matrix_4x3fv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    count,
                    transpose ? 1 : 0,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Mark's {@code shader} as being used for the next GL draw command.
     * <p>
     * Note: must be called in the GL thread and {@code shader} must have been linked.
     */
    public void use() {
        try {
            DowncallHandles.gst_gl_shader_use.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gst_gl_shader_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static @NotNull java.lang.String stringFragmentExternalOesGetDefault(@NotNull org.gstreamer.gl.GLContext context, @NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_string_fragment_external_oes_get_default.invokeExact(
                    context.handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public static @NotNull java.lang.String stringFragmentGetDefault(@NotNull org.gstreamer.gl.GLContext context, @NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_string_fragment_get_default.invokeExact(
                    context.handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Generates a shader string that defines the precision of float types in
     * GLSL shaders.  This is particularly needed for fragment shaders in a
     * GLSL ES context where there is no default precision specified.
     * <p>
     * Practically, this will return the string 'precision mediump float'
     * or 'precision highp float' depending on if high precision floats are
     * determined to be supported.
     * @param context a {@link GLContext}
     * @param version a {@link GLSLVersion}
     * @param profile a {@link GLSLProfile}
     * @return a shader string defining the precision of float types based on
     *      {@code context}, {@code version} and {@code profile}
     */
    public static @NotNull java.lang.String stringGetHighestPrecision(@NotNull org.gstreamer.gl.GLContext context, @NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_string_get_highest_precision.invokeExact(
                    context.handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link GLShader.Build} object constructs a {@link GLShader} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLShader} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLShader} using {@link GLShader#castFrom}.
         * @return A new instance of {@code GLShader} with the properties 
         *         that were set in the Build object.
         */
        public GLShader construct() {
            return GLShader.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLShader.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setLinked(boolean linked) {
            names.add("linked");
            values.add(org.gtk.gobject.Value.create(linked));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_shader_new = Interop.downcallHandle(
            "gst_gl_shader_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_new_default = Interop.downcallHandle(
            "gst_gl_shader_new_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_new_link_with_stages = Interop.downcallHandle(
            "gst_gl_shader_new_link_with_stages",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_gl_shader_new_with_stages = Interop.downcallHandle(
            "gst_gl_shader_new_with_stages",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_gl_shader_attach = Interop.downcallHandle(
            "gst_gl_shader_attach",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_attach_unlocked = Interop.downcallHandle(
            "gst_gl_shader_attach_unlocked",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_bind_attribute_location = Interop.downcallHandle(
            "gst_gl_shader_bind_attribute_location",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_bind_frag_data_location = Interop.downcallHandle(
            "gst_gl_shader_bind_frag_data_location",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_compile_attach_stage = Interop.downcallHandle(
            "gst_gl_shader_compile_attach_stage",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_detach = Interop.downcallHandle(
            "gst_gl_shader_detach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_detach_unlocked = Interop.downcallHandle(
            "gst_gl_shader_detach_unlocked",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_get_attribute_location = Interop.downcallHandle(
            "gst_gl_shader_get_attribute_location",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_get_program_handle = Interop.downcallHandle(
            "gst_gl_shader_get_program_handle",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_is_linked = Interop.downcallHandle(
            "gst_gl_shader_is_linked",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_link = Interop.downcallHandle(
            "gst_gl_shader_link",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_release = Interop.downcallHandle(
            "gst_gl_shader_release",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_release_unlocked = Interop.downcallHandle(
            "gst_gl_shader_release_unlocked",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_1f = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_1f",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_1fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_1fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_1i = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_1i",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_1iv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_1iv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_2f = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_2f",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_2fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_2fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_2i = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_2i",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_2iv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_2iv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_3f = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_3f",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_3fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_3fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_3i = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_3i",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_3iv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_3iv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_4f = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_4f",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_4fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_4fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_4i = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_4i",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_4iv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_4iv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_matrix_2fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_matrix_2fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_matrix_2x3fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_matrix_2x3fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_matrix_2x4fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_matrix_2x4fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_matrix_3fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_matrix_3fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_matrix_3x2fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_matrix_3x2fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_matrix_3x4fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_matrix_3x4fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_matrix_4fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_matrix_4fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_matrix_4x2fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_matrix_4x2fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_set_uniform_matrix_4x3fv = Interop.downcallHandle(
            "gst_gl_shader_set_uniform_matrix_4x3fv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_use = Interop.downcallHandle(
            "gst_gl_shader_use",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_shader_get_type = Interop.downcallHandle(
            "gst_gl_shader_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_shader_string_fragment_external_oes_get_default = Interop.downcallHandle(
            "gst_gl_shader_string_fragment_external_oes_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_string_fragment_get_default = Interop.downcallHandle(
            "gst_gl_shader_string_fragment_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_shader_string_get_highest_precision = Interop.downcallHandle(
            "gst_gl_shader_string_get_highest_precision",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
