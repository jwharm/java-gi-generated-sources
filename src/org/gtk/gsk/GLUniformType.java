package org.gtk.gsk;

/**
 * This defines the types of the uniforms that {@code GskGLShaders}
 * declare.
 * <p>
 * It defines both what the type is called in the GLSL shader
 * code, and what the corresponding C type is on the Gtk side.
 */
public enum GLUniformType {

    /**
     * No type, used for uninitialized or unspecified values.
     */
    NONE,
    
    /**
     * A float uniform
     */
    FLOAT,
    
    /**
     * A GLSL int / gint32 uniform
     */
    INT,
    
    /**
     * A GLSL uint / guint32 uniform
     */
    UINT,
    
    /**
     * A GLSL bool / gboolean uniform
     */
    BOOL,
    
    /**
     * A GLSL vec2 / graphene_vec2_t uniform
     */
    VEC2,
    
    /**
     * A GLSL vec3 / graphene_vec3_t uniform
     */
    VEC3,
    
    /**
     * A GLSL vec4 / graphene_vec4_t uniform
     */
    VEC4;
    
    public static GLUniformType fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> FLOAT;
            case 2 -> INT;
            case 3 -> UINT;
            case 4 -> BOOL;
            case 5 -> VEC2;
            case 6 -> VEC3;
            case 7 -> VEC4;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case FLOAT -> 1;
            case INT -> 2;
            case UINT -> 3;
            case BOOL -> 4;
            case VEC2 -> 5;
            case VEC3 -> 6;
            case VEC4 -> 7;
        };
    }

}
