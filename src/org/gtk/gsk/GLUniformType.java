package org.gtk.gsk;

/**
 * This defines the types of the uniforms that {@code GskGLShaders}
 * declare.
 * <p>
 * It defines both what the type is called in the GLSL shader
 * code, and what the corresponding C type is on the Gtk side.
 */
public class GLUniformType extends io.github.jwharm.javagi.Enumeration {

    /**
     * No type, used for uninitialized or unspecified values.
     */
    public static final GLUniformType NONE = new GLUniformType(0);
    
    /**
     * A float uniform
     */
    public static final GLUniformType FLOAT = new GLUniformType(1);
    
    /**
     * A GLSL int / gint32 uniform
     */
    public static final GLUniformType INT = new GLUniformType(2);
    
    /**
     * A GLSL uint / guint32 uniform
     */
    public static final GLUniformType UINT = new GLUniformType(3);
    
    /**
     * A GLSL bool / gboolean uniform
     */
    public static final GLUniformType BOOL = new GLUniformType(4);
    
    /**
     * A GLSL vec2 / graphene_vec2_t uniform
     */
    public static final GLUniformType VEC2 = new GLUniformType(5);
    
    /**
     * A GLSL vec3 / graphene_vec3_t uniform
     */
    public static final GLUniformType VEC3 = new GLUniformType(6);
    
    /**
     * A GLSL vec4 / graphene_vec4_t uniform
     */
    public static final GLUniformType VEC4 = new GLUniformType(7);
    
    public GLUniformType(int value) {
        super(value);
    }
    
}
