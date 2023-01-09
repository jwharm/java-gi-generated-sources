package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This defines the types of the uniforms that {@code GskGLShaders}
 * declare.
 * <p>
 * It defines both what the type is called in the GLSL shader
 * code, and what the corresponding C type is on the Gtk side.
 */
public enum GLUniformType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No type, used for uninitialized or unspecified values.
     */
    NONE(0),
    
    /**
     * A float uniform
     */
    FLOAT(1),
    
    /**
     * A GLSL int / gint32 uniform
     */
    INT(2),
    
    /**
     * A GLSL uint / guint32 uniform
     */
    UINT(3),
    
    /**
     * A GLSL bool / gboolean uniform
     */
    BOOL(4),
    
    /**
     * A GLSL vec2 / graphene_vec2_t uniform
     */
    VEC2(5),
    
    /**
     * A GLSL vec3 / graphene_vec3_t uniform
     */
    VEC3(6),
    
    /**
     * A GLSL vec4 / graphene_vec4_t uniform
     */
    VEC4(7);
    
    private static final java.lang.String C_TYPE_NAME = "GskGLUniformType";
    
    private final int value;
    
    /**
     * Create a new GLUniformType for the provided value
     * @param numeric value the enum value
     */
    GLUniformType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new GLUniformType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static GLUniformType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> FLOAT;
            case 2 -> INT;
            case 3 -> UINT;
            case 4 -> BOOL;
            case 5 -> VEC2;
            case 6 -> VEC3;
            case 7 -> VEC4;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
