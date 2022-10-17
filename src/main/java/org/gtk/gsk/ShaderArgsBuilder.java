package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An object to build the uniforms data for a {@code GskGLShader}.
 */
public class ShaderArgsBuilder extends io.github.jwharm.javagi.ResourceBase {

    public ShaderArgsBuilder(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gsk_shader_args_builder_new = Interop.downcallHandle(
        "gsk_shader_args_builder_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull GLShader shader, @Nullable org.gtk.glib.Bytes initialValues) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_shader_args_builder_new.invokeExact(shader.handle(), initialValues.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a builder that can be used to construct a new uniform data
     * chunk.
     */
    public ShaderArgsBuilder(@NotNull GLShader shader, @Nullable org.gtk.glib.Bytes initialValues) {
        super(constructNew(shader, initialValues));
    }
    
    private static final MethodHandle gsk_shader_args_builder_free_to_args = Interop.downcallHandle(
        "gsk_shader_args_builder_free_to_args",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code GBytes} args from the current state of the
     * given {@code builder}, and frees the {@code builder} instance.
     * <p>
     * Any uniforms of the shader that have not been explicitly set
     * on the {@code builder} are zero-initialized.
     */
    public @NotNull org.gtk.glib.Bytes freeToArgs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_shader_args_builder_free_to_args.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_shader_args_builder_ref = Interop.downcallHandle(
        "gsk_shader_args_builder_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of a {@code GskShaderArgsBuilder} by one.
     */
    public @NotNull ShaderArgsBuilder ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_shader_args_builder_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShaderArgsBuilder(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_shader_args_builder_set_bool = Interop.downcallHandle(
        "gsk_shader_args_builder_set_bool",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of bool type.
     */
    public @NotNull void setBool(@NotNull int idx, @NotNull boolean value) {
        try {
            gsk_shader_args_builder_set_bool.invokeExact(handle(), idx, value ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gsk_shader_args_builder_set_float = Interop.downcallHandle(
        "gsk_shader_args_builder_set_float",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of float type.
     */
    public @NotNull void setFloat(@NotNull int idx, @NotNull float value) {
        try {
            gsk_shader_args_builder_set_float.invokeExact(handle(), idx, value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gsk_shader_args_builder_set_int = Interop.downcallHandle(
        "gsk_shader_args_builder_set_int",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of int type.
     */
    public @NotNull void setInt(@NotNull int idx, @NotNull int value) {
        try {
            gsk_shader_args_builder_set_int.invokeExact(handle(), idx, value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gsk_shader_args_builder_set_uint = Interop.downcallHandle(
        "gsk_shader_args_builder_set_uint",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of uint type.
     */
    public @NotNull void setUint(@NotNull int idx, @NotNull int value) {
        try {
            gsk_shader_args_builder_set_uint.invokeExact(handle(), idx, value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gsk_shader_args_builder_set_vec2 = Interop.downcallHandle(
        "gsk_shader_args_builder_set_vec2",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of vec2 type.
     */
    public @NotNull void setVec2(@NotNull int idx, @NotNull org.gtk.graphene.Vec2 value) {
        try {
            gsk_shader_args_builder_set_vec2.invokeExact(handle(), idx, value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gsk_shader_args_builder_set_vec3 = Interop.downcallHandle(
        "gsk_shader_args_builder_set_vec3",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of vec3 type.
     */
    public @NotNull void setVec3(@NotNull int idx, @NotNull org.gtk.graphene.Vec3 value) {
        try {
            gsk_shader_args_builder_set_vec3.invokeExact(handle(), idx, value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gsk_shader_args_builder_set_vec4 = Interop.downcallHandle(
        "gsk_shader_args_builder_set_vec4",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of the uniform {@code idx}.
     * <p>
     * The uniform must be of vec4 type.
     */
    public @NotNull void setVec4(@NotNull int idx, @NotNull org.gtk.graphene.Vec4 value) {
        try {
            gsk_shader_args_builder_set_vec4.invokeExact(handle(), idx, value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gsk_shader_args_builder_to_args = Interop.downcallHandle(
        "gsk_shader_args_builder_to_args",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull org.gtk.glib.Bytes toArgs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_shader_args_builder_to_args.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_shader_args_builder_unref = Interop.downcallHandle(
        "gsk_shader_args_builder_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of a {@code GskShaderArgBuilder} by one.
     * <p>
     * If the resulting reference count is zero, frees the builder.
     */
    public @NotNull void unref() {
        try {
            gsk_shader_args_builder_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
