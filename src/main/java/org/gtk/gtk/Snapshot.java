package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSnapshot} assists in creating {@link org.gtk.gsk.RenderNode}s for widgets.
 * <p>
 * It functions in a similar way to a cairo context, and maintains a stack
 * of render nodes and their associated transformations.
 * <p>
 * The node at the top of the stack is the one that {@code gtk_snapshot_append_…()}
 * functions operate on. Use the {@code gtk_snapshot_push_…()} functions and
 * {@code Snapshot#pop} to change the current node.
 * <p>
 * The typical way to obtain a {@code GtkSnapshot} object is as an argument to
 * the {@code Widget#snapshot} vfunc. If you need to create your own
 * {@code GtkSnapshot}, use {@link Snapshot#Snapshot}.
 */
public class Snapshot extends org.gtk.gdk.Snapshot {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "Snapshot";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Snapshot proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Snapshot(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Snapshot> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Snapshot(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_snapshot_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSnapshot}.
     */
    public Snapshot() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Appends a stroked border rectangle inside the given {@code outline}.
     * <p>
     * The four sides of the border can have different widths and colors.
     * @param outline the outline of the border
     * @param borderWidth the stroke width of the border on
     *   the top, right, bottom and left side respectively.
     * @param borderColor the color used on the top, right,
     *   bottom and left side.
     */
    public void appendBorder(org.gtk.gsk.RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_snapshot_append_border.invokeExact(
                        handle(),
                        outline.handle(),
                        Interop.allocateNativeArray(borderWidth, false, SCOPE),
                        Interop.allocateNativeArray(borderColor, org.gtk.gdk.RGBA.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Creates a new {@link org.gtk.gsk.CairoNode} and appends it to the current
     * render node of {@code snapshot}, without changing the current node.
     * @param bounds the bounds for the new node
     * @return a {@code cairo_t} suitable for drawing the contents of
     *   the newly created render node
     */
    public org.cairographics.Context appendCairo(org.gtk.graphene.Rect bounds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_snapshot_append_cairo.invokeExact(
                    handle(),
                    bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.cairographics.Context.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new render node drawing the {@code color} into the
     * given {@code bounds} and appends it to the current render node
     * of {@code snapshot}.
     * <p>
     * You should try to avoid calling this function if
     * {@code color} is transparent.
     * @param color the color to draw
     * @param bounds the bounds for the new node
     */
    public void appendColor(org.gtk.gdk.RGBA color, org.gtk.graphene.Rect bounds) {
        try {
            DowncallHandles.gtk_snapshot_append_color.invokeExact(
                    handle(),
                    color.handle(),
                    bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends a conic gradient node with the given stops to {@code snapshot}.
     * @param bounds the rectangle to render the gradient into
     * @param center the center point of the conic gradient
     * @param rotation the clockwise rotation in degrees of the starting angle.
     *   0 means the starting angle is the top.
     * @param stops the color stops defining the gradient
     * @param nStops the number of elements in {@code stops}
     */
    public void appendConicGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_snapshot_append_conic_gradient.invokeExact(
                        handle(),
                        bounds.handle(),
                        center.handle(),
                        rotation,
                        Interop.allocateNativeArray(stops, org.gtk.gsk.ColorStop.getMemoryLayout(), false, SCOPE),
                        nStops);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Appends an inset shadow into the box given by {@code outline}.
     * @param outline outline of the region surrounded by shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the inside
     * @param blurRadius how much blur to apply to the shadow
     */
    public void appendInsetShadow(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        try {
            DowncallHandles.gtk_snapshot_append_inset_shadow.invokeExact(
                    handle(),
                    outline.handle(),
                    color.handle(),
                    dx,
                    dy,
                    spread,
                    blurRadius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void appendLayout(org.pango.Layout layout, org.gtk.gdk.RGBA color) {
        try {
            DowncallHandles.gtk_snapshot_append_layout.invokeExact(
                    handle(),
                    layout.handle(),
                    color.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends a linear gradient node with the given stops to {@code snapshot}.
     * @param bounds the rectangle to render the linear gradient into
     * @param startPoint the point at which the linear gradient will begin
     * @param endPoint the point at which the linear gradient will finish
     * @param stops the color stops defining the gradient
     * @param nStops the number of elements in {@code stops}
     */
    public void appendLinearGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point startPoint, org.gtk.graphene.Point endPoint, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_snapshot_append_linear_gradient.invokeExact(
                        handle(),
                        bounds.handle(),
                        startPoint.handle(),
                        endPoint.handle(),
                        Interop.allocateNativeArray(stops, org.gtk.gsk.ColorStop.getMemoryLayout(), false, SCOPE),
                        nStops);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Appends {@code node} to the current render node of {@code snapshot},
     * without changing the current node.
     * <p>
     * If {@code snapshot} does not have a current node yet, {@code node}
     * will become the initial node.
     * @param node a {@code GskRenderNode}
     */
    public void appendNode(org.gtk.gsk.RenderNode node) {
        try {
            DowncallHandles.gtk_snapshot_append_node.invokeExact(
                    handle(),
                    node.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends an outset shadow node around the box given by {@code outline}.
     * @param outline outline of the region surrounded by shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the outside
     * @param blurRadius how much blur to apply to the shadow
     */
    public void appendOutsetShadow(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        try {
            DowncallHandles.gtk_snapshot_append_outset_shadow.invokeExact(
                    handle(),
                    outline.handle(),
                    color.handle(),
                    dx,
                    dy,
                    spread,
                    blurRadius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends a radial gradient node with the given stops to {@code snapshot}.
     * @param bounds the rectangle to render the readial gradient into
     * @param center the center point for the radial gradient
     * @param hradius the horizontal radius
     * @param vradius the vertical radius
     * @param start the start position (on the horizontal axis)
     * @param end the end position (on the horizontal axis)
     * @param stops the color stops defining the gradient
     * @param nStops the number of elements in {@code stops}
     */
    public void appendRadialGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_snapshot_append_radial_gradient.invokeExact(
                        handle(),
                        bounds.handle(),
                        center.handle(),
                        hradius,
                        vradius,
                        start,
                        end,
                        Interop.allocateNativeArray(stops, org.gtk.gsk.ColorStop.getMemoryLayout(), false, SCOPE),
                        nStops);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Appends a repeating linear gradient node with the given stops to {@code snapshot}.
     * @param bounds the rectangle to render the linear gradient into
     * @param startPoint the point at which the linear gradient will begin
     * @param endPoint the point at which the linear gradient will finish
     * @param stops the color stops defining the gradient
     * @param nStops the number of elements in {@code stops}
     */
    public void appendRepeatingLinearGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point startPoint, org.gtk.graphene.Point endPoint, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_snapshot_append_repeating_linear_gradient.invokeExact(
                        handle(),
                        bounds.handle(),
                        startPoint.handle(),
                        endPoint.handle(),
                        Interop.allocateNativeArray(stops, org.gtk.gsk.ColorStop.getMemoryLayout(), false, SCOPE),
                        nStops);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Appends a repeating radial gradient node with the given stops to {@code snapshot}.
     * @param bounds the rectangle to render the readial gradient into
     * @param center the center point for the radial gradient
     * @param hradius the horizontal radius
     * @param vradius the vertical radius
     * @param start the start position (on the horizontal axis)
     * @param end the end position (on the horizontal axis)
     * @param stops the color stops defining the gradient
     * @param nStops the number of elements in {@code stops}
     */
    public void appendRepeatingRadialGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_snapshot_append_repeating_radial_gradient.invokeExact(
                        handle(),
                        bounds.handle(),
                        center.handle(),
                        hradius,
                        vradius,
                        start,
                        end,
                        Interop.allocateNativeArray(stops, org.gtk.gsk.ColorStop.getMemoryLayout(), false, SCOPE),
                        nStops);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Creates a new render node drawing the {@code texture}
     * into the given {@code bounds} and appends it to the
     * current render node of {@code snapshot}.
     * @param texture the texture to render
     * @param bounds the bounds for the new node
     */
    public void appendTexture(org.gtk.gdk.Texture texture, org.gtk.graphene.Rect bounds) {
        try {
            DowncallHandles.gtk_snapshot_append_texture.invokeExact(
                    handle(),
                    texture.handle(),
                    bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the node that was constructed by {@code snapshot}
     * and frees {@code snapshot}.
     * @return a newly-created {@link org.gtk.gsk.RenderNode}
     */
    public @Nullable org.gtk.gsk.RenderNode freeToNode() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_snapshot_free_to_node.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns a paintable for the node that was
     * constructed by {@code snapshot} and frees {@code snapshot}.
     * @param size The size of the resulting paintable
     *   or {@code null} to use the bounds of the snapshot
     * @return a newly-created {@code Gdk.Paintable}
     */
    public @Nullable org.gtk.gdk.Paintable freeToPaintable(@Nullable org.gtk.graphene.Size size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_snapshot_free_to_paintable.invokeExact(
                    handle(),
                    (Addressable) (size == null ? MemoryAddress.NULL : size.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = (org.gtk.gdk.Paintable) Interop.register(RESULT, org.gtk.gdk.Paintable.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Removes the top element from the stack of render nodes and
     * adds it to the nearest {@link org.gtk.gsk.GLShaderNode} below it.
     * <p>
     * This must be called the same number of times as the number
     * of textures is needed for the shader in
     * {@link Snapshot#pushGlShader}.
     */
    public void glShaderPopTexture() {
        try {
            DowncallHandles.gtk_snapshot_gl_shader_pop_texture.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Applies a perspective projection transform.
     * <p>
     * See {@link org.gtk.gsk.Transform#perspective} for a discussion on the details.
     * @param depth distance of the z=0 plane
     */
    public void perspective(float depth) {
        try {
            DowncallHandles.gtk_snapshot_perspective.invokeExact(
                    handle(),
                    depth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the top element from the stack of render nodes,
     * and appends it to the node underneath it.
     */
    public void pop() {
        try {
            DowncallHandles.gtk_snapshot_pop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Blends together two images with the given blend mode.
     * <p>
     * Until the first call to {@link Snapshot#pop}, the
     * bottom image for the blend operation will be recorded.
     * After that call, the top image to be blended will be
     * recorded until the second call to {@link Snapshot#pop}.
     * <p>
     * Calling this function requires two subsequent calls
     * to {@link Snapshot#pop}.
     * @param blendMode blend mode to use
     */
    public void pushBlend(org.gtk.gsk.BlendMode blendMode) {
        try {
            DowncallHandles.gtk_snapshot_push_blend.invokeExact(
                    handle(),
                    blendMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Blurs an image.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     * @param radius the blur radius to use. Must be positive
     */
    public void pushBlur(double radius) {
        try {
            DowncallHandles.gtk_snapshot_push_blur.invokeExact(
                    handle(),
                    radius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clips an image to a rectangle.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     * @param bounds the rectangle to clip to
     */
    public void pushClip(org.gtk.graphene.Rect bounds) {
        try {
            DowncallHandles.gtk_snapshot_push_clip.invokeExact(
                    handle(),
                    bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Modifies the colors of an image by applying an affine transformation
     * in RGB space.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     * @param colorMatrix the color matrix to use
     * @param colorOffset the color offset to use
     */
    public void pushColorMatrix(org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        try {
            DowncallHandles.gtk_snapshot_push_color_matrix.invokeExact(
                    handle(),
                    colorMatrix.handle(),
                    colorOffset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Snapshots a cross-fade operation between two images with the
     * given {@code progress}.
     * <p>
     * Until the first call to {@link Snapshot#pop}, the start image
     * will be snapshot. After that call, the end image will be recorded
     * until the second call to {@link Snapshot#pop}.
     * <p>
     * Calling this function requires two subsequent calls
     * to {@link Snapshot#pop}.
     * @param progress progress between 0.0 and 1.0
     */
    public void pushCrossFade(double progress) {
        try {
            DowncallHandles.gtk_snapshot_push_cross_fade.invokeExact(
                    handle(),
                    progress);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts a debug node with a message.
     * <p>
     * Debug nodes don't affect the rendering at all, but can be
     * helpful in identifying parts of a render node tree dump,
     * for example in the GTK inspector.
     * @param message a printf-style format string
     * @param varargs arguments for {@code message}
     */
    public void pushDebug(java.lang.String message, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_snapshot_push_debug.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(message, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Push a {@link org.gtk.gsk.GLShaderNode}.
     * <p>
     * The node uses the given {@link org.gtk.gsk.GLShader} and uniform values
     * Additionally this takes a list of {@code n_children} other nodes
     * which will be passed to the {@link org.gtk.gsk.GLShaderNode}.
     * <p>
     * The {@code take_args} argument is a block of data to use for uniform
     * arguments, as per types and offsets defined by the {@code shader}.
     * Normally this is generated by {@link org.gtk.gsk.GLShader#formatArgs}
     * or {@code Gsk.ShaderArgsBuilder}.
     * <p>
     * The snapshotter takes ownership of {@code take_args}, so the caller should
     * not free it after this.
     * <p>
     * If the renderer doesn't support GL shaders, or if there is any
     * problem when compiling the shader, then the node will draw pink.
     * You should use {@link org.gtk.gsk.GLShader#compile} to ensure the {@code shader}
     * will work for the renderer before using it.
     * <p>
     * If the shader requires textures (see {@link org.gtk.gsk.GLShader#getNTextures}),
     * then it is expected that you call {@link Snapshot#glShaderPopTexture}
     * the number of times that are required. Each of these calls will generate
     * a node that is added as a child to the {@code GskGLShaderNode}, which in turn
     * will render these offscreen and pass as a texture to the shader.
     * <p>
     * Once all textures (if any) are pop:ed, you must call the regular
     * {@link Snapshot#pop}.
     * <p>
     * If you want to use pre-existing textures as input to the shader rather
     * than rendering new ones, use {@link Snapshot#appendTexture} to
     * push a texture node. These will be used directly rather than being
     * re-rendered.
     * <p>
     * For details on how to write shaders, see {@link org.gtk.gsk.GLShader}.
     * @param shader The code to run
     * @param bounds the rectangle to render into
     * @param takeArgs Data block with arguments for the shader.
     */
    public void pushGlShader(org.gtk.gsk.GLShader shader, org.gtk.graphene.Rect bounds, org.gtk.glib.Bytes takeArgs) {
        try {
            DowncallHandles.gtk_snapshot_push_gl_shader.invokeExact(
                    handle(),
                    shader.handle(),
                    bounds.handle(),
                    takeArgs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        takeArgs.yieldOwnership();
    }
    
    /**
     * Modifies the opacity of an image.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     * @param opacity the opacity to use
     */
    public void pushOpacity(double opacity) {
        try {
            DowncallHandles.gtk_snapshot_push_opacity.invokeExact(
                    handle(),
                    opacity);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a node that repeats the child node.
     * <p>
     * The child is recorded until the next call to {@link Snapshot#pop}.
     * @param bounds the bounds within which to repeat
     * @param childBounds the bounds of the child or {@code null}
     *   to use the full size of the collected child node
     */
    public void pushRepeat(org.gtk.graphene.Rect bounds, @Nullable org.gtk.graphene.Rect childBounds) {
        try {
            DowncallHandles.gtk_snapshot_push_repeat.invokeExact(
                    handle(),
                    bounds.handle(),
                    (Addressable) (childBounds == null ? MemoryAddress.NULL : childBounds.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clips an image to a rounded rectangle.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     * @param bounds the rounded rectangle to clip to
     */
    public void pushRoundedClip(org.gtk.gsk.RoundedRect bounds) {
        try {
            DowncallHandles.gtk_snapshot_push_rounded_clip.invokeExact(
                    handle(),
                    bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Applies a shadow to an image.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     * @param shadow the first shadow specification
     * @param nShadows number of shadow specifications
     */
    public void pushShadow(org.gtk.gsk.Shadow[] shadow, long nShadows) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_snapshot_push_shadow.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(shadow, org.gtk.gsk.Shadow.getMemoryLayout(), false, SCOPE),
                        nShadows);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Creates a render node for the CSS background according to {@code context},
     * and appends it to the current node of {@code snapshot}, without changing
     * the current node.
     * @param context the style context that defines the background
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public void renderBackground(org.gtk.gtk.StyleContext context, double x, double y, double width, double height) {
        try {
            DowncallHandles.gtk_snapshot_render_background.invokeExact(
                    handle(),
                    context.handle(),
                    x,
                    y,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a render node for the focus outline according to {@code context},
     * and appends it to the current node of {@code snapshot}, without changing
     * the current node.
     * @param context the style context that defines the focus ring
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public void renderFocus(org.gtk.gtk.StyleContext context, double x, double y, double width, double height) {
        try {
            DowncallHandles.gtk_snapshot_render_focus.invokeExact(
                    handle(),
                    context.handle(),
                    x,
                    y,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a render node for the CSS border according to {@code context},
     * and appends it to the current node of {@code snapshot}, without changing
     * the current node.
     * @param context the style context that defines the frame
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public void renderFrame(org.gtk.gtk.StyleContext context, double x, double y, double width, double height) {
        try {
            DowncallHandles.gtk_snapshot_render_frame.invokeExact(
                    handle(),
                    context.handle(),
                    x,
                    y,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Draws a text caret using {@code snapshot} at the specified index of {@code layout}.
     * @param context a {@code GtkStyleContext}
     * @param x X origin
     * @param y Y origin
     * @param layout the {@code PangoLayout} of the text
     * @param index the index in the {@code PangoLayout}
     * @param direction the {@code PangoDirection} of the text
     */
    public void renderInsertionCursor(org.gtk.gtk.StyleContext context, double x, double y, org.pango.Layout layout, int index, org.pango.Direction direction) {
        try {
            DowncallHandles.gtk_snapshot_render_insertion_cursor.invokeExact(
                    handle(),
                    context.handle(),
                    x,
                    y,
                    layout.handle(),
                    index,
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a render node for rendering {@code layout} according to the style
     * information in {@code context}, and appends it to the current node of {@code snapshot},
     * without changing the current node.
     * @param context the style context that defines the text
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param layout the {@code PangoLayout} to render
     */
    public void renderLayout(org.gtk.gtk.StyleContext context, double x, double y, org.pango.Layout layout) {
        try {
            DowncallHandles.gtk_snapshot_render_layout.invokeExact(
                    handle(),
                    context.handle(),
                    x,
                    y,
                    layout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Restores {@code snapshot} to the state saved by a preceding call to
     * {@code Snapshot#save} and removes that state from the stack of
     * saved states.
     */
    public void restore() {
        try {
            DowncallHandles.gtk_snapshot_restore.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Rotates {@code snapshot}'s coordinate system by {@code angle} degrees in 2D space -
     * or in 3D speak, rotates around the Z axis.
     * <p>
     * To rotate around other axes, use {@link org.gtk.gsk.Transform#rotate3d}.
     * @param angle the rotation angle, in degrees (clockwise)
     */
    public void rotate(float angle) {
        try {
            DowncallHandles.gtk_snapshot_rotate.invokeExact(
                    handle(),
                    angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Rotates {@code snapshot}'s coordinate system by {@code angle} degrees around {@code axis}.
     * <p>
     * For a rotation in 2D space, use {@link org.gtk.gsk.Transform#rotate}.
     * @param angle the rotation angle, in degrees (clockwise)
     * @param axis The rotation axis
     */
    public void rotate3d(float angle, org.gtk.graphene.Vec3 axis) {
        try {
            DowncallHandles.gtk_snapshot_rotate_3d.invokeExact(
                    handle(),
                    angle,
                    axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes a copy of the current state of {@code snapshot} and saves it
     * on an internal stack.
     * <p>
     * When {@link Snapshot#restore} is called, {@code snapshot} will
     * be restored to the saved state. Multiple calls to
     * {@code Snapshot.save#] and [class@Snapshot.restore} can be nested;
     * each call to {@code gtk_snapshot_restore()} restores the state from
     * the matching paired {@code gtk_snapshot_save()}.
     * <p>
     * It is necessary to clear all saved states with corresponding
     * calls to {@code gtk_snapshot_restore()}.
     */
    public void save() {
        try {
            DowncallHandles.gtk_snapshot_save.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scales {@code snapshot}'s coordinate system in 2-dimensional space by
     * the given factors.
     * <p>
     * Use {@link Snapshot#scale3d} to scale in all 3 dimensions.
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     */
    public void scale(float factorX, float factorY) {
        try {
            DowncallHandles.gtk_snapshot_scale.invokeExact(
                    handle(),
                    factorX,
                    factorY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scales {@code snapshot}'s coordinate system by the given factors.
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     * @param factorZ scaling factor on the Z axis
     */
    public void scale3d(float factorX, float factorY, float factorZ) {
        try {
            DowncallHandles.gtk_snapshot_scale_3d.invokeExact(
                    handle(),
                    factorX,
                    factorY,
                    factorZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the render node that was constructed
     * by {@code snapshot}.
     * <p>
     * After calling this function, it is no longer possible to
     * add more nodes to {@code snapshot}. The only function that should
     * be called after this is {@link org.gtk.gobject.GObject#unref}.
     * @return the constructed {@code GskRenderNode}
     */
    public @Nullable org.gtk.gsk.RenderNode toNode() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_snapshot_to_node.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns a paintable encapsulating the render node
     * that was constructed by {@code snapshot}.
     * <p>
     * After calling this function, it is no longer possible to
     * add more nodes to {@code snapshot}. The only function that should
     * be called after this is {@link org.gtk.gobject.GObject#unref}.
     * @param size The size of the resulting paintable
     *   or {@code null} to use the bounds of the snapshot
     * @return a new {@code GdkPaintable}
     */
    public @Nullable org.gtk.gdk.Paintable toPaintable(@Nullable org.gtk.graphene.Size size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_snapshot_to_paintable.invokeExact(
                    handle(),
                    (Addressable) (size == null ? MemoryAddress.NULL : size.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gdk.Paintable) Interop.register(RESULT, org.gtk.gdk.Paintable.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Transforms {@code snapshot}'s coordinate system with the given {@code transform}.
     * @param transform the transform to apply
     */
    public void transform(@Nullable org.gtk.gsk.Transform transform) {
        try {
            DowncallHandles.gtk_snapshot_transform.invokeExact(
                    handle(),
                    (Addressable) (transform == null ? MemoryAddress.NULL : transform.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms {@code snapshot}'s coordinate system with the given {@code matrix}.
     * @param matrix the matrix to multiply the transform with
     */
    public void transformMatrix(org.gtk.graphene.Matrix matrix) {
        try {
            DowncallHandles.gtk_snapshot_transform_matrix.invokeExact(
                    handle(),
                    matrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Translates {@code snapshot}'s coordinate system by {@code point} in 2-dimensional space.
     * @param point the point to translate the snapshot by
     */
    public void translate(org.gtk.graphene.Point point) {
        try {
            DowncallHandles.gtk_snapshot_translate.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Translates {@code snapshot}'s coordinate system by {@code point}.
     * @param point the point to translate the snapshot by
     */
    public void translate3d(org.gtk.graphene.Point3D point) {
        try {
            DowncallHandles.gtk_snapshot_translate_3d.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_snapshot_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_snapshot_new = Interop.downcallHandle(
                "gtk_snapshot_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_border = Interop.downcallHandle(
                "gtk_snapshot_append_border",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_cairo = Interop.downcallHandle(
                "gtk_snapshot_append_cairo",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_color = Interop.downcallHandle(
                "gtk_snapshot_append_color",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_conic_gradient = Interop.downcallHandle(
                "gtk_snapshot_append_conic_gradient",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_inset_shadow = Interop.downcallHandle(
                "gtk_snapshot_append_inset_shadow",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_layout = Interop.downcallHandle(
                "gtk_snapshot_append_layout",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_linear_gradient = Interop.downcallHandle(
                "gtk_snapshot_append_linear_gradient",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_node = Interop.downcallHandle(
                "gtk_snapshot_append_node",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_outset_shadow = Interop.downcallHandle(
                "gtk_snapshot_append_outset_shadow",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_radial_gradient = Interop.downcallHandle(
                "gtk_snapshot_append_radial_gradient",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_repeating_linear_gradient = Interop.downcallHandle(
                "gtk_snapshot_append_repeating_linear_gradient",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_repeating_radial_gradient = Interop.downcallHandle(
                "gtk_snapshot_append_repeating_radial_gradient",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_snapshot_append_texture = Interop.downcallHandle(
                "gtk_snapshot_append_texture",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_free_to_node = Interop.downcallHandle(
                "gtk_snapshot_free_to_node",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_free_to_paintable = Interop.downcallHandle(
                "gtk_snapshot_free_to_paintable",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_gl_shader_pop_texture = Interop.downcallHandle(
                "gtk_snapshot_gl_shader_pop_texture",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_perspective = Interop.downcallHandle(
                "gtk_snapshot_perspective",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_snapshot_pop = Interop.downcallHandle(
                "gtk_snapshot_pop",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_blend = Interop.downcallHandle(
                "gtk_snapshot_push_blend",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_blur = Interop.downcallHandle(
                "gtk_snapshot_push_blur",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_clip = Interop.downcallHandle(
                "gtk_snapshot_push_clip",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_color_matrix = Interop.downcallHandle(
                "gtk_snapshot_push_color_matrix",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_cross_fade = Interop.downcallHandle(
                "gtk_snapshot_push_cross_fade",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_debug = Interop.downcallHandle(
                "gtk_snapshot_push_debug",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gtk_snapshot_push_gl_shader = Interop.downcallHandle(
                "gtk_snapshot_push_gl_shader",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_opacity = Interop.downcallHandle(
                "gtk_snapshot_push_opacity",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_repeat = Interop.downcallHandle(
                "gtk_snapshot_push_repeat",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_rounded_clip = Interop.downcallHandle(
                "gtk_snapshot_push_rounded_clip",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_push_shadow = Interop.downcallHandle(
                "gtk_snapshot_push_shadow",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_snapshot_render_background = Interop.downcallHandle(
                "gtk_snapshot_render_background",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_snapshot_render_focus = Interop.downcallHandle(
                "gtk_snapshot_render_focus",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_snapshot_render_frame = Interop.downcallHandle(
                "gtk_snapshot_render_frame",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_snapshot_render_insertion_cursor = Interop.downcallHandle(
                "gtk_snapshot_render_insertion_cursor",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_snapshot_render_layout = Interop.downcallHandle(
                "gtk_snapshot_render_layout",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_restore = Interop.downcallHandle(
                "gtk_snapshot_restore",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_rotate = Interop.downcallHandle(
                "gtk_snapshot_rotate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_snapshot_rotate_3d = Interop.downcallHandle(
                "gtk_snapshot_rotate_3d",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_save = Interop.downcallHandle(
                "gtk_snapshot_save",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_scale = Interop.downcallHandle(
                "gtk_snapshot_scale",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_snapshot_scale_3d = Interop.downcallHandle(
                "gtk_snapshot_scale_3d",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_snapshot_to_node = Interop.downcallHandle(
                "gtk_snapshot_to_node",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_to_paintable = Interop.downcallHandle(
                "gtk_snapshot_to_paintable",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_transform = Interop.downcallHandle(
                "gtk_snapshot_transform",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_transform_matrix = Interop.downcallHandle(
                "gtk_snapshot_transform_matrix",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_translate = Interop.downcallHandle(
                "gtk_snapshot_translate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_translate_3d = Interop.downcallHandle(
                "gtk_snapshot_translate_3d",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_snapshot_get_type = Interop.downcallHandle(
                "gtk_snapshot_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_snapshot_get_type != null;
    }
}
