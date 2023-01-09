package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLShader extends org.gstreamer.gst.GstObject {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLShader";
    
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
     * Create a GLShader proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLShader(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLShader> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLShader(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_new.invokeExact(context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Note: must be called in the GL thread
     * @param context a {@link GLContext}
     */
    public GLShader(org.gstreamer.gl.GLContext context) {
        super(constructNew(context));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewDefault(org.gstreamer.gl.GLContext context) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_new_default.invokeExact(context.handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
        
    /**
     * Note: must be called in the GL thread
     * @param context a {@link GLContext}
     * @return a default {@code shader} or {@code null} on failure
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static GLShader newDefault(org.gstreamer.gl.GLContext context) throws GErrorException {
        var RESULT = constructNewDefault(context);
        var OBJECT = (org.gstreamer.gl.GLShader) Interop.register(RESULT, org.gstreamer.gl.GLShader.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewLinkWithStages(org.gstreamer.gl.GLContext context, PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        MemoryAddress RESULT;
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
    public static GLShader newLinkWithStages(org.gstreamer.gl.GLContext context, PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        var RESULT = constructNewLinkWithStages(context, error, varargs);
        var OBJECT = (org.gstreamer.gl.GLShader) Interop.register(RESULT, org.gstreamer.gl.GLShader.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithStages(org.gstreamer.gl.GLContext context, PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        MemoryAddress RESULT;
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
    public static GLShader newWithStages(org.gstreamer.gl.GLContext context, PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        var RESULT = constructNewWithStages(context, error, varargs);
        var OBJECT = (org.gstreamer.gl.GLShader) Interop.register(RESULT, org.gstreamer.gl.GLShader.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Attaches {@code stage} to {@code shader}.  {@code stage} must have been successfully compiled
     * with gst_glsl_stage_compile().
     * <p>
     * Note: must be called in the GL thread
     * @param stage a {@link GLSLStage} to attach
     * @return whether {@code stage} could be attached to {@code shader}
     */
    public boolean attach(org.gstreamer.gl.GLSLStage stage) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_attach.invokeExact(
                    handle(),
                    stage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Attaches {@code stage} to {@code shader}.  {@code stage} must have been successfully compiled
     * with gst_glsl_stage_compile().
     * <p>
     * Note: must be called in the GL thread
     * @param stage a {@link GLSLStage} to attach
     * @return whether {@code stage} could be attached to {@code shader}
     */
    public boolean attachUnlocked(org.gstreamer.gl.GLSLStage stage) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_attach_unlocked.invokeExact(
                    handle(),
                    stage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Bind attribute {@code name} to the specified location {@code index} using
     * {@code glBindAttributeLocation()}.
     * @param index attribute index to set
     * @param name name of the attribute
     */
    public void bindAttributeLocation(int index, java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_bind_attribute_location.invokeExact(
                        handle(),
                        index,
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Bind attribute {@code name} to the specified location {@code index} using
     * {@code glBindFragDataLocation()}.
     * @param index attribute index to set
     * @param name name of the attribute
     */
    public void bindFragDataLocation(int index, java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_bind_frag_data_location.invokeExact(
                        handle(),
                        index,
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public boolean compileAttachStage(org.gstreamer.gl.GLSLStage stage) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Detaches {@code stage} from {@code shader}.  {@code stage} must have been successfully attached
     * to {@code shader} with gst_gl_shader_attach() or gst_gl_shader_attach_unlocked().
     * <p>
     * Note: must be called in the GL thread
     * @param stage a {@link GLSLStage} to attach
     */
    public void detach(org.gstreamer.gl.GLSLStage stage) {
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
    public void detachUnlocked(org.gstreamer.gl.GLSLStage stage) {
        try {
            DowncallHandles.gst_gl_shader_detach_unlocked.invokeExact(
                    handle(),
                    stage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public int getAttributeLocation(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_gl_shader_get_attribute_location.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    public int getProgramHandle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_shader_get_program_handle.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gst_gl_shader_is_linked.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Links the current list of {@link GLSLStage}'s in {@code shader}.
     * <p>
     * Note: must be called in the GL thread
     * @return whether {@code shader} could be linked together.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean link() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_gl_shader_link.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Releases the shader and stages.
     * <p>
     * Note: must be called in the GL thread
     */
    public void release() {
        try {
            DowncallHandles.gst_gl_shader_release.invokeExact(handle());
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
            DowncallHandles.gst_gl_shader_release_unlocked.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform {@code glUniform1f()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param value value to set
     */
    public void setUniform1f(java.lang.String name, float value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_1f.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform1fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform1fv(java.lang.String name, int count, float[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_1fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Interop.allocateNativeArray(value, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform1i()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param value value to set
     */
    public void setUniform1i(java.lang.String name, int value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_1i.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform1iv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform1iv(java.lang.String name, int count, int[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_1iv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Interop.allocateNativeArray(value, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform2f()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     */
    public void setUniform2f(java.lang.String name, float v0, float v1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_2f.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        v0,
                        v1);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform2fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform2fv(java.lang.String name, int count, float[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_2fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Interop.allocateNativeArray(value, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform2i()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     */
    public void setUniform2i(java.lang.String name, int v0, int v1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_2i.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        v0,
                        v1);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform2iv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform2iv(java.lang.String name, int count, int[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_2iv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Interop.allocateNativeArray(value, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform3f()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     * @param v2 third value to set
     */
    public void setUniform3f(java.lang.String name, float v0, float v1, float v2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_3f.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        v0,
                        v1,
                        v2);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform3fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform3fv(java.lang.String name, int count, float[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_3fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Interop.allocateNativeArray(value, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform3i()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param v0 first value to set
     * @param v1 second value to set
     * @param v2 third value to set
     */
    public void setUniform3i(java.lang.String name, int v0, int v1, int v2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_3i.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        v0,
                        v1,
                        v2);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform3iv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform3iv(java.lang.String name, int count, int[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_3iv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Interop.allocateNativeArray(value, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void setUniform4f(java.lang.String name, float v0, float v1, float v2, float v3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_4f.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        v0,
                        v1,
                        v2,
                        v3);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform4fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform4fv(java.lang.String name, int count, float[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_4fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Interop.allocateNativeArray(value, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void setUniform4i(java.lang.String name, int v0, int v1, int v2, int v3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_4i.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        v0,
                        v1,
                        v2,
                        v3);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniform4iv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of values to set
     * @param value values to set
     */
    public void setUniform4iv(java.lang.String name, int count, int[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_4iv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Interop.allocateNativeArray(value, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniformMatrix2fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 2x2 matrices to set
     * @param transpose transpose the matrix
     * @param value matrix to set
     */
    public void setUniformMatrix2fv(java.lang.String name, int count, boolean transpose, PointerFloat value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_matrix_2fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Marshal.booleanToInteger.marshal(transpose, null).intValue(),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniformMatrix2x3fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 2x3 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix2x3fv(java.lang.String name, int count, boolean transpose, PointerFloat value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_matrix_2x3fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Marshal.booleanToInteger.marshal(transpose, null).intValue(),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniformMatrix2x4fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 2x4 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix2x4fv(java.lang.String name, int count, boolean transpose, PointerFloat value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_matrix_2x4fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Marshal.booleanToInteger.marshal(transpose, null).intValue(),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniformMatrix3fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 3x3 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix3fv(java.lang.String name, int count, boolean transpose, PointerFloat value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_matrix_3fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Marshal.booleanToInteger.marshal(transpose, null).intValue(),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniformMatrix3x2fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 3x2 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix3x2fv(java.lang.String name, int count, boolean transpose, PointerFloat value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_matrix_3x2fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Marshal.booleanToInteger.marshal(transpose, null).intValue(),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniformMatrix3x4fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 3x4 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix3x4fv(java.lang.String name, int count, boolean transpose, PointerFloat value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_matrix_3x4fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Marshal.booleanToInteger.marshal(transpose, null).intValue(),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniformMatrix4fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 4x4 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix4fv(java.lang.String name, int count, boolean transpose, PointerFloat value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_matrix_4fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Marshal.booleanToInteger.marshal(transpose, null).intValue(),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniformMatrix4x2fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 4x2 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix4x2fv(java.lang.String name, int count, boolean transpose, PointerFloat value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_matrix_4x2fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Marshal.booleanToInteger.marshal(transpose, null).intValue(),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Perform {@code glUniformMatrix4x3fv()} for {@code name} on {@code shader}
     * @param name name of the uniform
     * @param count number of 4x3 matrices to set
     * @param transpose transpose the matrix
     * @param value values to set
     */
    public void setUniformMatrix4x3fv(java.lang.String name, int count, boolean transpose, PointerFloat value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_gl_shader_set_uniform_matrix_4x3fv.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        count,
                        Marshal.booleanToInteger.marshal(transpose, null).intValue(),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Mark's {@code shader} as being used for the next GL draw command.
     * <p>
     * Note: must be called in the GL thread and {@code shader} must have been linked.
     */
    public void use() {
        try {
            DowncallHandles.gst_gl_shader_use.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gst_gl_shader_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static java.lang.String stringFragmentExternalOesGetDefault(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_string_fragment_external_oes_get_default.invokeExact(
                    context.handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static java.lang.String stringFragmentGetDefault(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_string_fragment_get_default.invokeExact(
                    context.handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
    public static java.lang.String stringGetHighestPrecision(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_shader_string_get_highest_precision.invokeExact(
                    context.handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * A {@link GLShader.Builder} object constructs a {@link GLShader} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLShader.Builder#build()}. 
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
         * Finish building the {@link GLShader} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLShader}.
         * @return A new instance of {@code GLShader} with the properties 
         *         that were set in the Builder object.
         */
        public GLShader build() {
            return (GLShader) org.gtk.gobject.GObject.newWithProperties(
                GLShader.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setLinked(boolean linked) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_gl_shader_get_type != null;
    }
}
