package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An object to build the uniforms data for a `GskGLShader`.
 */
public class ShaderArgsBuilder extends io.github.jwharm.javagi.ResourceBase {

    public ShaderArgsBuilder(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(GLShader shader, org.gtk.glib.Bytes initialValues) {
        Reference RESULT = References.get(gtk_h.gsk_shader_args_builder_new(shader.handle(), initialValues.handle()), true);
        return RESULT;
    }
    
    /**
     * Allocates a builder that can be used to construct a new uniform data
     * chunk.
     */
    public ShaderArgsBuilder(GLShader shader, org.gtk.glib.Bytes initialValues) {
        super(constructNew(shader, initialValues));
    }
    
    /**
     * Creates a new `GBytes` args from the current state of the
     * given @builder, and frees the @builder instance.
     * 
     * Any uniforms of the shader that have not been explicitly set
     * on the @builder are zero-initialized.
     */
    public org.gtk.glib.Bytes freeToArgs() {
        var RESULT = gtk_h.gsk_shader_args_builder_free_to_args(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Increases the reference count of a `GskShaderArgsBuilder` by one.
     */
    public ShaderArgsBuilder ref() {
        var RESULT = gtk_h.gsk_shader_args_builder_ref(handle());
        return new ShaderArgsBuilder(References.get(RESULT, true));
    }
    
    /**
     * Sets the value of the uniform @idx.
     * 
     * The uniform must be of bool type.
     */
    public void setBool(int idx, boolean value) {
        gtk_h.gsk_shader_args_builder_set_bool(handle(), idx, value ? 1 : 0);
    }
    
    /**
     * Sets the value of the uniform @idx.
     * 
     * The uniform must be of float type.
     */
    public void setFloat(int idx, float value) {
        gtk_h.gsk_shader_args_builder_set_float(handle(), idx, value);
    }
    
    /**
     * Sets the value of the uniform @idx.
     * 
     * The uniform must be of int type.
     */
    public void setInt(int idx, int value) {
        gtk_h.gsk_shader_args_builder_set_int(handle(), idx, value);
    }
    
    /**
     * Sets the value of the uniform @idx.
     * 
     * The uniform must be of uint type.
     */
    public void setUint(int idx, int value) {
        gtk_h.gsk_shader_args_builder_set_uint(handle(), idx, value);
    }
    
    /**
     * Sets the value of the uniform @idx.
     * 
     * The uniform must be of vec2 type.
     */
    public void setVec2(int idx, org.gtk.graphene.Vec2 value) {
        gtk_h.gsk_shader_args_builder_set_vec2(handle(), idx, value.handle());
    }
    
    /**
     * Sets the value of the uniform @idx.
     * 
     * The uniform must be of vec3 type.
     */
    public void setVec3(int idx, org.gtk.graphene.Vec3 value) {
        gtk_h.gsk_shader_args_builder_set_vec3(handle(), idx, value.handle());
    }
    
    /**
     * Sets the value of the uniform @idx.
     * 
     * The uniform must be of vec4 type.
     */
    public void setVec4(int idx, org.gtk.graphene.Vec4 value) {
        gtk_h.gsk_shader_args_builder_set_vec4(handle(), idx, value.handle());
    }
    
    /**
     * Creates a new `GBytes` args from the current state of the
     * given @builder.
     * 
     * Any uniforms of the shader that have not been explicitly set on
     * the @builder are zero-initialized.
     * 
     * The given `GskShaderArgsBuilder` is reset once this function returns;
     * you cannot call this function multiple times on the same @builder instance.
     * 
     * This function is intended primarily for bindings. C code should use
     * [method@Gsk.ShaderArgsBuilder.free_to_args].
     */
    public org.gtk.glib.Bytes toArgs() {
        var RESULT = gtk_h.gsk_shader_args_builder_to_args(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of a `GskShaderArgBuilder` by one.
     * 
     * If the resulting reference count is zero, frees the builder.
     */
    public void unref() {
        gtk_h.gsk_shader_args_builder_unref(handle());
    }
    
}
