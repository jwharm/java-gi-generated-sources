package org.gtk.gsk;

/**
 * The type of a node determines what the node is rendering.
 */
public enum RenderNodeType {

    /**
     * Error type. No node will ever have this type.
     */
    NOT_A_RENDER_NODE,
    
    /**
     * A node containing a stack of children
     */
    CONTAINER_NODE,
    
    /**
     * A node drawing a {@code cairo_surface_t}
     */
    CAIRO_NODE,
    
    /**
     * A node drawing a single color rectangle
     */
    COLOR_NODE,
    
    /**
     * A node drawing a linear gradient
     */
    LINEAR_GRADIENT_NODE,
    
    /**
     * A node drawing a repeating linear gradient
     */
    REPEATING_LINEAR_GRADIENT_NODE,
    
    /**
     * A node drawing a radial gradient
     */
    RADIAL_GRADIENT_NODE,
    
    /**
     * A node drawing a repeating radial gradient
     */
    REPEATING_RADIAL_GRADIENT_NODE,
    
    /**
     * A node drawing a conic gradient
     */
    CONIC_GRADIENT_NODE,
    
    /**
     * A node stroking a border around an area
     */
    BORDER_NODE,
    
    /**
     * A node drawing a {@code GdkTexture}
     */
    TEXTURE_NODE,
    
    /**
     * A node drawing an inset shadow
     */
    INSET_SHADOW_NODE,
    
    /**
     * A node drawing an outset shadow
     */
    OUTSET_SHADOW_NODE,
    
    /**
     * A node that renders its child after applying a matrix transform
     */
    TRANSFORM_NODE,
    
    /**
     * A node that changes the opacity of its child
     */
    OPACITY_NODE,
    
    /**
     * A node that applies a color matrix to every pixel
     */
    COLOR_MATRIX_NODE,
    
    /**
     * A node that repeats the child's contents
     */
    REPEAT_NODE,
    
    /**
     * A node that clips its child to a rectangular area
     */
    CLIP_NODE,
    
    /**
     * A node that clips its child to a rounded rectangle
     */
    ROUNDED_CLIP_NODE,
    
    /**
     * A node that draws a shadow below its child
     */
    SHADOW_NODE,
    
    /**
     * A node that blends two children together
     */
    BLEND_NODE,
    
    /**
     * A node that cross-fades between two children
     */
    CROSS_FADE_NODE,
    
    /**
     * A node containing a glyph string
     */
    TEXT_NODE,
    
    /**
     * A node that applies a blur
     */
    BLUR_NODE,
    
    /**
     * Debug information that does not affect the rendering
     */
    DEBUG_NODE,
    
    /**
     * A node that uses OpenGL fragment shaders to render
     */
    GL_SHADER_NODE;
    
    public static RenderNodeType fromValue(int value) {
        return switch(value) {
            case 0 -> NOT_A_RENDER_NODE;
            case 1 -> CONTAINER_NODE;
            case 2 -> CAIRO_NODE;
            case 3 -> COLOR_NODE;
            case 4 -> LINEAR_GRADIENT_NODE;
            case 5 -> REPEATING_LINEAR_GRADIENT_NODE;
            case 6 -> RADIAL_GRADIENT_NODE;
            case 7 -> REPEATING_RADIAL_GRADIENT_NODE;
            case 8 -> CONIC_GRADIENT_NODE;
            case 9 -> BORDER_NODE;
            case 10 -> TEXTURE_NODE;
            case 11 -> INSET_SHADOW_NODE;
            case 12 -> OUTSET_SHADOW_NODE;
            case 13 -> TRANSFORM_NODE;
            case 14 -> OPACITY_NODE;
            case 15 -> COLOR_MATRIX_NODE;
            case 16 -> REPEAT_NODE;
            case 17 -> CLIP_NODE;
            case 18 -> ROUNDED_CLIP_NODE;
            case 19 -> SHADOW_NODE;
            case 20 -> BLEND_NODE;
            case 21 -> CROSS_FADE_NODE;
            case 22 -> TEXT_NODE;
            case 23 -> BLUR_NODE;
            case 24 -> DEBUG_NODE;
            case 25 -> GL_SHADER_NODE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NOT_A_RENDER_NODE -> 0;
            case CONTAINER_NODE -> 1;
            case CAIRO_NODE -> 2;
            case COLOR_NODE -> 3;
            case LINEAR_GRADIENT_NODE -> 4;
            case REPEATING_LINEAR_GRADIENT_NODE -> 5;
            case RADIAL_GRADIENT_NODE -> 6;
            case REPEATING_RADIAL_GRADIENT_NODE -> 7;
            case CONIC_GRADIENT_NODE -> 8;
            case BORDER_NODE -> 9;
            case TEXTURE_NODE -> 10;
            case INSET_SHADOW_NODE -> 11;
            case OUTSET_SHADOW_NODE -> 12;
            case TRANSFORM_NODE -> 13;
            case OPACITY_NODE -> 14;
            case COLOR_MATRIX_NODE -> 15;
            case REPEAT_NODE -> 16;
            case CLIP_NODE -> 17;
            case ROUNDED_CLIP_NODE -> 18;
            case SHADOW_NODE -> 19;
            case BLEND_NODE -> 20;
            case CROSS_FADE_NODE -> 21;
            case TEXT_NODE -> 22;
            case BLUR_NODE -> 23;
            case DEBUG_NODE -> 24;
            case GL_SHADER_NODE -> 25;
        };
    }

}
