package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GskGLShader` is a snippet of GLSL that is meant to run in the
 * fragment shader of the rendering pipeline.
 * 
 * A fragment shader gets the coordinates being rendered as input and
 * produces the pixel values for that particular pixel. Additionally,
 * the shader can declare a set of other input arguments, called
 * uniforms (as they are uniform over all the calls to your shader in
 * each instance of use). A shader can also receive up to 4
 * textures that it can use as input when producing the pixel data.
 * 
 * `GskGLShader` is usually used with gtk_snapshot_push_gl_shader()
 * to produce a [class@Gsk.GLShaderNode] in the rendering hierarchy,
 * and then its input textures are constructed by rendering the child
 * nodes to textures before rendering the shader node itself. (You can
 * pass texture nodes as children if you want to directly use a texture
 * as input).
 * 
 * The actual shader code is GLSL code that gets combined with
 * some other code into the fragment shader. Since the exact
 * capabilities of the GPU driver differs between different OpenGL
 * drivers and hardware, GTK adds some defines that you can use
 * to ensure your GLSL code runs on as many drivers as it can.
 * 
 * If the OpenGL driver is GLES, then the shader language version
 * is set to 100, and GSK_GLES will be defined in the shader.
 * 
 * Otherwise, if the OpenGL driver does not support the 3.2 core profile,
 * then the shader will run with language version 110 for GL2 and 130 for GL3,
 * and GSK_LEGACY will be defined in the shader.
 * 
 * If the OpenGL driver supports the 3.2 code profile, it will be used,
 * the shader language version is set to 150, and GSK_GL3 will be defined
 * in the shader.
 * 
 * The main function the shader must implement is:
 * 
 * ```glsl
 *  void mainImage(out vec4 fragColor,
 *                 in vec2 fragCoord,
 *                 in vec2 resolution,
 *                 in vec2 uv)
 * ```
 * 
 * Where the input @fragCoord is the coordinate of the pixel we're
 * currently rendering, relative to the boundary rectangle that was
 * specified in the `GskGLShaderNode`, and @resolution is the width and
 * height of that rectangle. This is in the typical GTK coordinate
 * system with the origin in the top left. @uv contains the u and v
 * coordinates that can be used to index a texture at the
 * corresponding point. These coordinates are in the [0..1]x[0..1]
 * region, with 0, 0 being in the lower left corder (which is typical
 * for OpenGL).
 * 
 * The output @fragColor should be a RGBA color (with
 * premultiplied alpha) that will be used as the output for the
 * specified pixel location. Note that this output will be
 * automatically clipped to the clip region of the glshader node.
 * 
 * In addition to the function arguments the shader can define
 * up to 4 uniforms for textures which must be called u_textureN
 * (i.e. u_texture1 to u_texture4) as well as any custom uniforms
 * you want of types int, uint, bool, float, vec2, vec3 or vec4.
 * 
 * All textures sources contain premultiplied alpha colors, but if some
 * there are outer sources of colors there is a gsk_premultiply() helper
 * to compute premultiplication when needed.
 * 
 * Note that GTK parses the uniform declarations, so each uniform has to
 * be on a line by itself with no other code, like so:
 * 
 * ```glsl
 * uniform float u_time;
 * uniform vec3 u_color;
 * uniform sampler2D u_texture1;
 * uniform sampler2D u_texture2;
 * ```
 * 
 * GTK uses the "gsk" namespace in the symbols it uses in the
 * shader, so your code should not use any symbols with the prefix gsk
 * or GSK. There are some helper functions declared that you can use:
 * 
 * ```glsl
 * vec4 GskTexture(sampler2D sampler, vec2 texCoords);
 * ```
 * 
 * This samples a texture (e.g. u_texture1) at the specified
 * coordinates, and containes some helper ifdefs to ensure that
 * it works on all OpenGL versions.
 * 
 * You can compile the shader yourself using [method@Gsk.GLShader.compile],
 * otherwise the GSK renderer will do it when it handling the glshader
 * node. If errors occurs, the returned @error will include the glsl
 * sources, so you can see what GSK was passing to the compiler. You
 * can also set GSK_DEBUG=shaders in the environment to see the sources
 * and other relevant information about all shaders that GSK is handling.
 * 
 * # An example shader
 * 
 * ```glsl
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
 * ```
 */
public class GLShader extends org.gtk.gobject.Object {

    public GLShader(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GLShader */
    public static GLShader castFrom(org.gtk.gobject.Object gobject) {
        return new GLShader(gobject.getReference());
    }
    
    /**
     * Creates a `GskGLShader` that will render pixels using the specified code.
     */
    public GLShader(org.gtk.glib.Bytes sourcecode) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_new_from_bytes(sourcecode.HANDLE()), true));
    }
    
    /**
     * Creates a `GskGLShader` that will render pixels using the specified code.
     */
    public GLShader(java.lang.String resourcePath) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_new_from_resource(Interop.allocateNativeString(resourcePath).HANDLE()), true));
    }
    
    /**
     * Tries to compile the @shader for the given @renderer.
     * 
     * If there is a problem, this function returns %FALSE and reports
     * an error. You should use this function before relying on the shader
     * for rendering and use a fallback with a simpler shader or without
     * shaders if it fails.
     * 
     * Note that this will modify the rendering state (for example
     * change the current GL context) and requires the renderer to be
     * set up. This means that the widget has to be realized. Commonly you
     * want to call this from the realize signal of a widget, or during
     * widget snapshot.
     */
    public boolean compile(Renderer renderer) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_compile(HANDLE(), renderer.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Looks for a uniform by the name @name, and returns the index
     * of the uniform, or -1 if it was not found.
     */
    public int findUniformByName(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_find_uniform_by_name(HANDLE(), Interop.allocateNativeString(name).HANDLE());
        return RESULT;
    }
    
    /**
     * Formats the uniform data as needed for feeding the named uniforms
     * values into the shader.
     * 
     * The argument list is a list of pairs of names, and values for the
     * types that match the declared uniforms (i.e. double/int/guint/gboolean
     * for primitive values and `graphene_vecN_t *` for vecN uniforms).
     * 
     * It is an error to pass a uniform name that is not declared by the shader.
     * 
     * Any uniforms of the shader that are not included in the argument list
     * are zero-initialized.
     */
    public org.gtk.glib.Bytes formatArgsVa(VaList uniforms) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_format_args_va(HANDLE(), uniforms);
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Gets the value of the uniform @idx in the @args block.
     * 
     * The uniform must be of bool type.
     */
    public boolean getArgBool(org.gtk.glib.Bytes args, int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_arg_bool(HANDLE(), args.HANDLE(), idx);
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of the uniform @idx in the @args block.
     * 
     * The uniform must be of float type.
     */
    public float getArgFloat(org.gtk.glib.Bytes args, int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_arg_float(HANDLE(), args.HANDLE(), idx);
        return RESULT;
    }
    
    /**
     * Gets the value of the uniform @idx in the @args block.
     * 
     * The uniform must be of int type.
     */
    public int getArgInt(org.gtk.glib.Bytes args, int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_arg_int(HANDLE(), args.HANDLE(), idx);
        return RESULT;
    }
    
    /**
     * Gets the value of the uniform @idx in the @args block.
     * 
     * The uniform must be of uint type.
     */
    public int getArgUint(org.gtk.glib.Bytes args, int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_arg_uint(HANDLE(), args.HANDLE(), idx);
        return RESULT;
    }
    
    /**
     * Gets the value of the uniform @idx in the @args block.
     * 
     * The uniform must be of vec2 type.
     */
    public void getArgVec2(org.gtk.glib.Bytes args, int idx, org.gtk.graphene.Vec2 outValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_arg_vec2(HANDLE(), args.HANDLE(), idx, outValue.HANDLE());
    }
    
    /**
     * Gets the value of the uniform @idx in the @args block.
     * 
     * The uniform must be of vec3 type.
     */
    public void getArgVec3(org.gtk.glib.Bytes args, int idx, org.gtk.graphene.Vec3 outValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_arg_vec3(HANDLE(), args.HANDLE(), idx, outValue.HANDLE());
    }
    
    /**
     * Gets the value of the uniform @idx in the @args block.
     * 
     * The uniform must be of vec4 type.
     */
    public void getArgVec4(org.gtk.glib.Bytes args, int idx, org.gtk.graphene.Vec4 outValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_arg_vec4(HANDLE(), args.HANDLE(), idx, outValue.HANDLE());
    }
    
    /**
     * Get the size of the data block used to specify arguments for this shader.
     */
    public long getArgsSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_args_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the number of textures that the shader requires.
     * 
     * This can be used to check that the a passed shader works
     * in your usecase. It is determined by looking at the highest
     * u_textureN value that the shader defines.
     */
    public int getNTextures() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_n_textures(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the number of declared uniforms for this shader.
     */
    public int getNUniforms() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_n_uniforms(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the resource path for the GLSL sourcecode being used
     * to render this shader.
     */
    public java.lang.String getResource() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_resource(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the GLSL sourcecode being used to render this shader.
     */
    public org.gtk.glib.Bytes getSource() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_source(HANDLE());
        return new org.gtk.glib.Bytes(References.get(RESULT, false));
    }
    
    /**
     * Get the name of the declared uniform for this shader at index @idx.
     */
    public java.lang.String getUniformName(int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_uniform_name(HANDLE(), idx);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the offset into the data block where data for this uniforms is stored.
     */
    public int getUniformOffset(int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_uniform_offset(HANDLE(), idx);
        return RESULT;
    }
    
    /**
     * Get the type of the declared uniform for this shader at index @idx.
     */
    public GLUniformType getUniformType(int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_get_uniform_type(HANDLE(), idx);
        return GLUniformType.fromValue(RESULT);
    }
    
}
