package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An object to build the uniforms data for a {@code GskGLShader}.
 */
public class ShaderArgsBuilder extends Struct {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskShaderArgsBuilder";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ShaderArgsBuilder}
     * @return A new, uninitialized @{link ShaderArgsBuilder}
     */
    public static ShaderArgsBuilder allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ShaderArgsBuilder newInstance = new ShaderArgsBuilder(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ShaderArgsBuilder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShaderArgsBuilder(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.GLShader shader, @Nullable org.gtk.glib.Bytes initialValues) {
        java.util.Objects.requireNonNull(shader, "Parameter 'shader' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_shader_args_builder_new.invokeExact(
                    shader.handle(),
                    (Addressable) (initialValues == null ? MemoryAddress.NULL : initialValues.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a builder that can be used to construct a new uniform data
     * chunk.
     * @param shader a {@code GskGLShader}
     * @param initialValues optional {@code GBytes} with initial values
     */
    public ShaderArgsBuilder(@NotNull org.gtk.gsk.GLShader shader, @Nullable org.gtk.glib.Bytes initialValues) {
        super(constructNew(shader, initialValues), Ownership.FULL);
    }
    
    /**
     * Creates a new {@code GBytes} args from the current state of the
     * given {@code builder}, and frees the {@code builder} instance.
     * <p>
     * Any uniforms of the shader that have not been explicitly set
     * on the {@code builder} are zero-initialized.
     * @return the newly allocated buffer with
     *   all the args added to {@code builder}
     */
    public @NotNull org.gtk.glib.Bytes freeToArgs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_shader_args_builder_free_to_args.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.FULL);
    }
    
    /**
     * Increases the reference count of a {@code GskShaderArgsBuilder} by one.
     * @return the passed in {@code GskShaderArgsBuilder}
     */
    public @NotNull org.gtk.gsk.ShaderArgsBuilder ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_shader_args_builder_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.ShaderArgsBuilder(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of bool type.
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public void setBool(int idx, boolean value) {
        try {
            DowncallHandles.gsk_shader_args_builder_set_bool.invokeExact(
                    handle(),
                    idx,
                    value ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of float type.
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public void setFloat(int idx, float value) {
        try {
            DowncallHandles.gsk_shader_args_builder_set_float.invokeExact(
                    handle(),
                    idx,
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of int type.
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public void setInt(int idx, int value) {
        try {
            DowncallHandles.gsk_shader_args_builder_set_int.invokeExact(
                    handle(),
                    idx,
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of uint type.
     * @param idx index of the uniform
     * @param value value to set the uniform to
     */
    public void setUint(int idx, int value) {
        try {
            DowncallHandles.gsk_shader_args_builder_set_uint.invokeExact(
                    handle(),
                    idx,
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of vec2 type.
     * @param idx index of the uniform
     * @param value value to set the uniform too
     */
    public void setVec2(int idx, @NotNull org.gtk.graphene.Vec2 value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gsk_shader_args_builder_set_vec2.invokeExact(
                    handle(),
                    idx,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of vec3 type.
     * @param idx index of the uniform
     * @param value value to set the uniform too
     */
    public void setVec3(int idx, @NotNull org.gtk.graphene.Vec3 value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gsk_shader_args_builder_set_vec3.invokeExact(
                    handle(),
                    idx,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of vec4 type.
     * @param idx index of the uniform
     * @param value value to set the uniform too
     */
    public void setVec4(int idx, @NotNull org.gtk.graphene.Vec4 value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gsk_shader_args_builder_set_vec4.invokeExact(
                    handle(),
                    idx,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GBytes} args from the current state of the
     * given {@code builder}.
     * <p>
     * Any uniforms of the shader that have not been explicitly set on
     * the {@code builder} are zero-initialized.
     * <p>
     * The given {@code GskShaderArgsBuilder} is reset once this function returns;
     * you cannot call this function multiple times on the same {@code builder} instance.
     * <p>
     * This function is intended primarily for bindings. C code should use
     * {@link ShaderArgsBuilder#freeToArgs}.
     * @return the newly allocated buffer with
     *   all the args added to {@code builder}
     */
    public @NotNull org.gtk.glib.Bytes toArgs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_shader_args_builder_to_args.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count of a {@code GskShaderArgBuilder} by one.
     * <p>
     * If the resulting reference count is zero, frees the builder.
     */
    public void unref() {
        try {
            DowncallHandles.gsk_shader_args_builder_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_shader_args_builder_new = Interop.downcallHandle(
            "gsk_shader_args_builder_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_free_to_args = Interop.downcallHandle(
            "gsk_shader_args_builder_free_to_args",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_ref = Interop.downcallHandle(
            "gsk_shader_args_builder_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_set_bool = Interop.downcallHandle(
            "gsk_shader_args_builder_set_bool",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_set_float = Interop.downcallHandle(
            "gsk_shader_args_builder_set_float",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_set_int = Interop.downcallHandle(
            "gsk_shader_args_builder_set_int",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_set_uint = Interop.downcallHandle(
            "gsk_shader_args_builder_set_uint",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_set_vec2 = Interop.downcallHandle(
            "gsk_shader_args_builder_set_vec2",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_set_vec3 = Interop.downcallHandle(
            "gsk_shader_args_builder_set_vec3",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_set_vec4 = Interop.downcallHandle(
            "gsk_shader_args_builder_set_vec4",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_to_args = Interop.downcallHandle(
            "gsk_shader_args_builder_to_args",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_shader_args_builder_unref = Interop.downcallHandle(
            "gsk_shader_args_builder_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
