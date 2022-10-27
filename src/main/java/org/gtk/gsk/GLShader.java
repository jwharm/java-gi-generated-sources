package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GskGLShader} is a snippet of GLSL that is meant to run in the
 * fragment shader of the rendering pipeline.
 * <p>
 * A fragment shader gets the coordinates being rendered as input and
 * produces the pixel values for that particular pixel. Additionally,
 * the shader can declare a set of other input arguments, called
 * uniforms (as they are uniform over all the calls to your shader in
 * each instance of use). A shader can also receive up to 4
 * textures that it can use as input when producing the pixel data.
 * <p>
 * {@code GskGLShader} is usually used with gtk_snapshot_push_gl_shader()
 * to produce a {@link GLShaderNode} in the rendering hierarchy,
 * and then its input textures are constructed by rendering the child
 * nodes to textures before rendering the shader node itself. (You can
 * pass texture nodes as children if you want to directly use a texture
 * as input).
 * <p>
 * The actual shader code is GLSL code that gets combined with
 * some other code into the fragment shader. Since the exact
 * capabilities of the GPU driver differs between different OpenGL
 * drivers and hardware, GTK adds some defines that you can use
 * to ensure your GLSL code runs on as many drivers as it can.
 * <p>
 * If the OpenGL driver is GLES, then the shader language version
 * is set to 100, and GSK_GLES will be defined in the shader.
 * <p>
 * Otherwise, if the OpenGL driver does not support the 3.2 core profile,
 * then the shader will run with language version 110 for GL2 and 130 for GL3,
 * and GSK_LEGACY will be defined in the shader.
 * <p>
 * If the OpenGL driver supports the 3.2 code profile, it will be used,
 * the shader language version is set to 150, and GSK_GL3 will be defined
 * in the shader.
 * <p>
 * The main function the shader must implement is:
 * <pre>{@code glsl
 *  void mainImage(out vec4 fragColor,
 *                 in vec2 fragCoord,
 *                 in vec2 resolution,
 *                 in vec2 uv)
 * }</pre>
 * <p>
 * Where the input {@code fragCoord} is the coordinate of the pixel we're
 * currently rendering, relative to the boundary rectangle that was
 * specified in the {@code GskGLShaderNode}, and {@code resolution} is the width and
 * height of that rectangle. This is in the typical GTK coordinate
 * system with the origin in the top left. {@code uv} contains the u and v
 * coordinates that can be used to index a texture at the
 * corresponding point. These coordinates are in the [0..1]x[0..1]
 * region, with 0, 0 being in the lower left corder (which is typical
 * for OpenGL).
 * <p>
 * The output {@code fragColor} should be a RGBA color (with
 * premultiplied alpha) that will be used as the output for the
 * specified pixel location. Note that this output will be
 * automatically clipped to the clip region of the glshader node.
 * <p>
 * In addition to the function arguments the shader can define
 * up to 4 uniforms for textures which must be called u_textureN
 * (i.e. u_texture1 to u_texture4) as well as any custom uniforms
 * you want of types int, uint, bool, float, vec2, vec3 or vec4.
 * <p>
 * All textures sources contain premultiplied alpha colors, but if some
 * there are outer sources of colors there is a gsk_premultiply() helper
 * to compute premultiplication when needed.
 * <p>
 * Note that GTK parses the uniform declarations, so each uniform has to
 * be on a line by itself with no other code, like so:
 * <pre>{@code glsl
 * uniform float u_time;
 * uniform vec3 u_color;
 * uniform sampler2D u_texture1;
 * uniform sampler2D u_texture2;
 * }</pre>
 * <p>
 * GTK uses the "gsk" namespace in the symbols it uses in the
 * shader, so your code should not use any symbols with the prefix gsk
 * or GSK. There are some helper functions declared that you can use:
 * <pre>{@code glsl
 * vec4 GskTexture(sampler2D sampler, vec2 texCoords);
 * }</pre>
 * <p>
 * This samples a texture (e.g. u_texture1) at the specified
 * coordinates, and containes some helper ifdefs to ensure that
 * it works on all OpenGL versions.
 * <p>
 * You can compile the shader yourself using {@link GLShader#compile},
 * otherwise the GSK renderer will do it when it handling the glshader
 * node. If errors occurs, the returned {@code error} will include the glsl
 * sources, so you can see what GSK was passing to the compiler. You
 * can also set GSK_DEBUG=shaders in the environment to see the sources
 * and other relevant information about all shaders that GSK is handling.
 * <p>
 * <strong>An example shader</strong><br/>
 * <pre>{@code glsl
 * uniform float position;
 * uniform sampler2D u_texture1;
 * uniform sampler2D u_texture2;
 * 
 * void mainImage(out vec4 fragColor,
 *                in vec2 fragCoord,
 *                in vec2 resolution,
 *                in vec2 uv) {
 *   vec4 source1 = GskTexture(u_texture1, uv);
 *   vec4 source2 = GskTexture(u_texture2, uv);
 * 
 *   fragColor = position * source1 + (1.0 - position) * source2;
 * }
 * }</pre>
 */
public class GLShader extends org.gtk.gobject.Object {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public GLShader(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GLShader */
    public static GLShader castFrom(org.gtk.gobject.Object gobject) {
        return new GLShader(gobject.refcounted());
    }
    
    private static Refcounted constructNewFromBytes(@NotNull org.gtk.glib.Bytes sourcecode) {
        java.util.Objects.requireNonNull(sourcecode, "Parameter 'sourcecode' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_gl_shader_new_from_bytes.invokeExact(sourcecode.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskGLShader} that will render pixels using the specified code.
     * @param sourcecode GLSL sourcecode for the shader, as a {@code GBytes}
     * @return A new {@code GskGLShader}
     */
    public static GLShader newFromBytes(@NotNull org.gtk.glib.Bytes sourcecode) {
        return new GLShader(constructNewFromBytes(sourcecode));
    }
    
    private static Refcounted constructNewFromResource(@NotNull java.lang.String resourcePath) {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_gl_shader_new_from_resource.invokeExact(Interop.allocateNativeString(resourcePath)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskGLShader} that will render pixels using the specified code.
     * @param resourcePath path to a resource that contains the GLSL sourcecode for
     *     the shader
     * @return A new {@code GskGLShader}
     */
    public static GLShader newFromResource(@NotNull java.lang.String resourcePath) {
        return new GLShader(constructNewFromResource(resourcePath));
    }
    
    /**
     * Tries to compile the {@code shader} for the given {@code renderer}.
     * <p>
     * If there is a problem, this function returns {@code false} and reports
     * an error. You should use this function before relying on the shader
     * for rendering and use a fallback with a simpler shader or without
     * shaders if it fails.
     * <p>
     * Note that this will modify the rendering state (for example
     * change the current GL context) and requires the renderer to be
     * set up. This means that the widget has to be realized. Commonly you
     * want to call this from the realize signal of a widget, or during
     * widget snapshot.
     * @param renderer a {@code GskRenderer}
     * @return {@code true} on success, {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean compile(@NotNull org.gtk.gsk.Renderer renderer) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_compile.invokeExact(handle(), renderer.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Looks for a uniform by the name {@code name}, and returns the index
     * of the uniform, or -1 if it was not found.
     * @param name uniform name
     * @return The index of the uniform, or -1
     */
    public int findUniformByName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_find_uniform_by_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Formats the uniform data as needed for feeding the named uniforms
     * values into the shader.
     * <p>
     * The argument list is a list of pairs of names, and values for the types
     * that match the declared uniforms (i.e. double/int/guint/gboolean for
     * primitive values and {@code graphene_vecN_t *} for vecN uniforms).
     * <p>
     * Any uniforms of the shader that are not included in the argument list
     * are zero-initialized.
     * @return A newly allocated block of data which can be
     *     passed to {@link GLShaderNode#GLShaderNode}.
     */
    public @NotNull org.gtk.glib.Bytes formatArgs() {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Formats the uniform data as needed for feeding the named uniforms
     * values into the shader.
     * <p>
     * The argument list is a list of pairs of names, and values for the
     * types that match the declared uniforms (i.e. double/int/guint/gboolean
     * for primitive values and {@code graphene_vecN_t *} for vecN uniforms).
     * <p>
     * It is an error to pass a uniform name that is not declared by the shader.
     * <p>
     * Any uniforms of the shader that are not included in the argument list
     * are zero-initialized.
     * @param uniforms name-Value pairs for the uniforms of {@code shader}, ending
     *     with a {@code null} name
     * @return A newly allocated block of data which can be
     *     passed to {@link GLShaderNode#GLShaderNode}.
     */
    public @NotNull org.gtk.glib.Bytes formatArgsVa(@NotNull VaList uniforms) {
        java.util.Objects.requireNonNull(uniforms, "Parameter 'uniforms' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_gl_shader_format_args_va.invokeExact(handle(), uniforms);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the value of the uniform {@code idx} in the {@code args} block.
     * <p>
     * The uniform must be of bool type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public boolean getArgBool(@NotNull org.gtk.glib.Bytes args, int idx) {
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_get_arg_bool.invokeExact(handle(), args.handle(), idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value of the uniform {@code idx} in the {@code args} block.
     * <p>
     * The uniform must be of float type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public float getArgFloat(@NotNull org.gtk.glib.Bytes args, int idx) {
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_gl_shader_get_arg_float.invokeExact(handle(), args.handle(), idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of the uniform {@code idx} in the {@code args} block.
     * <p>
     * The uniform must be of int type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public int getArgInt(@NotNull org.gtk.glib.Bytes args, int idx) {
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_get_arg_int.invokeExact(handle(), args.handle(), idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of the uniform {@code idx} in the {@code args} block.
     * <p>
     * The uniform must be of uint type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
     */
    public int getArgUint(@NotNull org.gtk.glib.Bytes args, int idx) {
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_get_arg_uint.invokeExact(handle(), args.handle(), idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of the uniform {@code idx} in the {@code args} block.
     * <p>
     * The uniform must be of vec2 type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param outValue location to store the uniform value in
     */
    public void getArgVec2(@NotNull org.gtk.glib.Bytes args, int idx, @NotNull org.gtk.graphene.Vec2 outValue) {
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(outValue, "Parameter 'outValue' must not be null");
        try {
            DowncallHandles.gsk_gl_shader_get_arg_vec2.invokeExact(handle(), args.handle(), idx, outValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the value of the uniform {@code idx} in the {@code args} block.
     * <p>
     * The uniform must be of vec3 type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param outValue location to store the uniform value in
     */
    public void getArgVec3(@NotNull org.gtk.glib.Bytes args, int idx, @NotNull org.gtk.graphene.Vec3 outValue) {
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(outValue, "Parameter 'outValue' must not be null");
        try {
            DowncallHandles.gsk_gl_shader_get_arg_vec3.invokeExact(handle(), args.handle(), idx, outValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the value of the uniform {@code idx} in the {@code args} block.
     * <p>
     * The uniform must be of vec4 type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param outValue location to store set the uniform value in
     */
    public void getArgVec4(@NotNull org.gtk.glib.Bytes args, int idx, @NotNull org.gtk.graphene.Vec4 outValue) {
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(outValue, "Parameter 'outValue' must not be null");
        try {
            DowncallHandles.gsk_gl_shader_get_arg_vec4.invokeExact(handle(), args.handle(), idx, outValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the size of the data block used to specify arguments for this shader.
     * @return The size of the data block
     */
    public long getArgsSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_gl_shader_get_args_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of textures that the shader requires.
     * <p>
     * This can be used to check that the a passed shader works
     * in your usecase. It is determined by looking at the highest
     * u_textureN value that the shader defines.
     * @return The number of texture inputs required by {@code shader}
     */
    public int getNTextures() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_get_n_textures.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the number of declared uniforms for this shader.
     * @return The number of declared uniforms
     */
    public int getNUniforms() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_get_n_uniforms.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the resource path for the GLSL sourcecode being used
     * to render this shader.
     * @return The resource path for the shader
     */
    public @Nullable java.lang.String getResource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_gl_shader_get_resource.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the GLSL sourcecode being used to render this shader.
     * @return The source code for the shader
     */
    public @NotNull org.gtk.glib.Bytes getSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_gl_shader_get_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, false));
    }
    
    /**
     * Get the name of the declared uniform for this shader at index {@code idx}.
     * @param idx index of the uniform
     * @return The name of the declared uniform
     */
    public @NotNull java.lang.String getUniformName(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_gl_shader_get_uniform_name.invokeExact(handle(), idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the offset into the data block where data for this uniforms is stored.
     * @param idx index of the uniform
     * @return The data offset
     */
    public int getUniformOffset(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_get_uniform_offset.invokeExact(handle(), idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the type of the declared uniform for this shader at index {@code idx}.
     * @param idx index of the uniform
     * @return The type of the declared uniform
     */
    public @NotNull org.gtk.gsk.GLUniformType getUniformType(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_get_uniform_type.invokeExact(handle(), idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.GLUniformType(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_gl_shader_new_from_bytes = Interop.downcallHandle(
            "gsk_gl_shader_new_from_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_new_from_resource = Interop.downcallHandle(
            "gsk_gl_shader_new_from_resource",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_compile = Interop.downcallHandle(
            "gsk_gl_shader_compile",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_find_uniform_by_name = Interop.downcallHandle(
            "gsk_gl_shader_find_uniform_by_name",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_format_args = Interop.downcallHandle(
            "gsk_gl_shader_format_args",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_format_args_va = Interop.downcallHandle(
            "gsk_gl_shader_format_args_va",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_get_arg_bool = Interop.downcallHandle(
            "gsk_gl_shader_get_arg_bool",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gsk_gl_shader_get_arg_float = Interop.downcallHandle(
            "gsk_gl_shader_get_arg_float",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gsk_gl_shader_get_arg_int = Interop.downcallHandle(
            "gsk_gl_shader_get_arg_int",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gsk_gl_shader_get_arg_uint = Interop.downcallHandle(
            "gsk_gl_shader_get_arg_uint",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gsk_gl_shader_get_arg_vec2 = Interop.downcallHandle(
            "gsk_gl_shader_get_arg_vec2",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_get_arg_vec3 = Interop.downcallHandle(
            "gsk_gl_shader_get_arg_vec3",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_get_arg_vec4 = Interop.downcallHandle(
            "gsk_gl_shader_get_arg_vec4",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_get_args_size = Interop.downcallHandle(
            "gsk_gl_shader_get_args_size",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_get_n_textures = Interop.downcallHandle(
            "gsk_gl_shader_get_n_textures",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_get_n_uniforms = Interop.downcallHandle(
            "gsk_gl_shader_get_n_uniforms",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_get_resource = Interop.downcallHandle(
            "gsk_gl_shader_get_resource",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_get_source = Interop.downcallHandle(
            "gsk_gl_shader_get_source",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_get_uniform_name = Interop.downcallHandle(
            "gsk_gl_shader_get_uniform_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gsk_gl_shader_get_uniform_offset = Interop.downcallHandle(
            "gsk_gl_shader_get_uniform_offset",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gsk_gl_shader_get_uniform_type = Interop.downcallHandle(
            "gsk_gl_shader_get_uniform_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
