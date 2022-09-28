package org.gtk.gsk;

/**
 * The type of a node determines what the node is rendering.
 */
public class RenderNodeType {

    /**
     * Error type. No node will ever have this type.
     */
    public static final RenderNodeType NOT_A_RENDER_NODE = new RenderNodeType(0);
    
    /**
     * A node containing a stack of children
     */
    public static final RenderNodeType CONTAINER_NODE = new RenderNodeType(1);
    
    /**
     * A node drawing a {@code cairo_surface_t}
     */
    public static final RenderNodeType CAIRO_NODE = new RenderNodeType(2);
    
    /**
     * A node drawing a single color rectangle
     */
    public static final RenderNodeType COLOR_NODE = new RenderNodeType(3);
    
    /**
     * A node drawing a linear gradient
     */
    public static final RenderNodeType LINEAR_GRADIENT_NODE = new RenderNodeType(4);
    
    /**
     * A node drawing a repeating linear gradient
     */
    public static final RenderNodeType REPEATING_LINEAR_GRADIENT_NODE = new RenderNodeType(5);
    
    /**
     * A node drawing a radial gradient
     */
    public static final RenderNodeType RADIAL_GRADIENT_NODE = new RenderNodeType(6);
    
    /**
     * A node drawing a repeating radial gradient
     */
    public static final RenderNodeType REPEATING_RADIAL_GRADIENT_NODE = new RenderNodeType(7);
    
    /**
     * A node drawing a conic gradient
     */
    public static final RenderNodeType CONIC_GRADIENT_NODE = new RenderNodeType(8);
    
    /**
     * A node stroking a border around an area
     */
    public static final RenderNodeType BORDER_NODE = new RenderNodeType(9);
    
    /**
     * A node drawing a {@code GdkTexture}
     */
    public static final RenderNodeType TEXTURE_NODE = new RenderNodeType(10);
    
    /**
     * A node drawing an inset shadow
     */
    public static final RenderNodeType INSET_SHADOW_NODE = new RenderNodeType(11);
    
    /**
     * A node drawing an outset shadow
     */
    public static final RenderNodeType OUTSET_SHADOW_NODE = new RenderNodeType(12);
    
    /**
     * A node that renders its child after applying a matrix transform
     */
    public static final RenderNodeType TRANSFORM_NODE = new RenderNodeType(13);
    
    /**
     * A node that changes the opacity of its child
     */
    public static final RenderNodeType OPACITY_NODE = new RenderNodeType(14);
    
    /**
     * A node that applies a color matrix to every pixel
     */
    public static final RenderNodeType COLOR_MATRIX_NODE = new RenderNodeType(15);
    
    /**
     * A node that repeats the child's contents
     */
    public static final RenderNodeType REPEAT_NODE = new RenderNodeType(16);
    
    /**
     * A node that clips its child to a rectangular area
     */
    public static final RenderNodeType CLIP_NODE = new RenderNodeType(17);
    
    /**
     * A node that clips its child to a rounded rectangle
     */
    public static final RenderNodeType ROUNDED_CLIP_NODE = new RenderNodeType(18);
    
    /**
     * A node that draws a shadow below its child
     */
    public static final RenderNodeType SHADOW_NODE = new RenderNodeType(19);
    
    /**
     * A node that blends two children together
     */
    public static final RenderNodeType BLEND_NODE = new RenderNodeType(20);
    
    /**
     * A node that cross-fades between two children
     */
    public static final RenderNodeType CROSS_FADE_NODE = new RenderNodeType(21);
    
    /**
     * A node containing a glyph string
     */
    public static final RenderNodeType TEXT_NODE = new RenderNodeType(22);
    
    /**
     * A node that applies a blur
     */
    public static final RenderNodeType BLUR_NODE = new RenderNodeType(23);
    
    /**
     * Debug information that does not affect the rendering
     */
    public static final RenderNodeType DEBUG_NODE = new RenderNodeType(24);
    
    /**
     * A node that uses OpenGL fragment shaders to render
     */
    public static final RenderNodeType GL_SHADER_NODE = new RenderNodeType(25);
    
    private int value;
    
    public RenderNodeType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(RenderNodeType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
