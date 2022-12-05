package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a node determines what the node is rendering.
 */
public enum RenderNodeType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Error type. No node will ever have this type.
     */
    NOT_A_RENDER_NODE(0),
    /**
     * A node containing a stack of children
     */
    CONTAINER_NODE(1),
    /**
     * A node drawing a {@code cairo_surface_t}
     */
    CAIRO_NODE(2),
    /**
     * A node drawing a single color rectangle
     */
    COLOR_NODE(3),
    /**
     * A node drawing a linear gradient
     */
    LINEAR_GRADIENT_NODE(4),
    /**
     * A node drawing a repeating linear gradient
     */
    REPEATING_LINEAR_GRADIENT_NODE(5),
    /**
     * A node drawing a radial gradient
     */
    RADIAL_GRADIENT_NODE(6),
    /**
     * A node drawing a repeating radial gradient
     */
    REPEATING_RADIAL_GRADIENT_NODE(7),
    /**
     * A node drawing a conic gradient
     */
    CONIC_GRADIENT_NODE(8),
    /**
     * A node stroking a border around an area
     */
    BORDER_NODE(9),
    /**
     * A node drawing a {@code GdkTexture}
     */
    TEXTURE_NODE(10),
    /**
     * A node drawing an inset shadow
     */
    INSET_SHADOW_NODE(11),
    /**
     * A node drawing an outset shadow
     */
    OUTSET_SHADOW_NODE(12),
    /**
     * A node that renders its child after applying a matrix transform
     */
    TRANSFORM_NODE(13),
    /**
     * A node that changes the opacity of its child
     */
    OPACITY_NODE(14),
    /**
     * A node that applies a color matrix to every pixel
     */
    COLOR_MATRIX_NODE(15),
    /**
     * A node that repeats the child's contents
     */
    REPEAT_NODE(16),
    /**
     * A node that clips its child to a rectangular area
     */
    CLIP_NODE(17),
    /**
     * A node that clips its child to a rounded rectangle
     */
    ROUNDED_CLIP_NODE(18),
    /**
     * A node that draws a shadow below its child
     */
    SHADOW_NODE(19),
    /**
     * A node that blends two children together
     */
    BLEND_NODE(20),
    /**
     * A node that cross-fades between two children
     */
    CROSS_FADE_NODE(21),
    /**
     * A node containing a glyph string
     */
    TEXT_NODE(22),
    /**
     * A node that applies a blur
     */
    BLUR_NODE(23),
    /**
     * Debug information that does not affect the rendering
     */
    DEBUG_NODE(24),
    /**
     * A node that uses OpenGL fragment shaders to render
     */
    GL_SHADER_NODE(25);
    
    private static final java.lang.String C_TYPE_NAME = "GskRenderNodeType";
    
    private final int value;
    RenderNodeType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RenderNodeType of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
