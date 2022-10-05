package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSnapshot} assists in creating {@link org.gtk.gsk.RenderNode}s for widgets.
 * <p>
 * It functions in a similar way to a cairo context, and maintains a stack
 * of render nodes and their associated transformations.
 * <p>
 * The node at the top of the stack is the one that {@code gtk_snapshot_append_…()}
 * functions operate on. Use the {@code gtk_snapshot_push_…()} functions and
 * {@link Snapshot#pop} to change the current node.
 * <p>
 * The typical way to obtain a {@code GtkSnapshot} object is as an argument to
 * the {@link Widget#snapshot} vfunc. If you need to create your own
 * {@code GtkSnapshot}, use {@link Snapshot#Snapshot}.
 */
public class Snapshot extends org.gtk.gdk.Snapshot {

    public Snapshot(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Snapshot */
    public static Snapshot castFrom(org.gtk.gobject.Object gobject) {
        return new Snapshot(gobject.refcounted());
    }
    
    static final MethodHandle gtk_snapshot_new = Interop.downcallHandle(
        "gtk_snapshot_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_snapshot_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkSnapshot}.
     */
    public Snapshot() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_snapshot_append_border = Interop.downcallHandle(
        "gtk_snapshot_append_border",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends a stroked border rectangle inside the given {@code outline}.
     * <p>
     * The four sides of the border can have different widths and colors.
     */
    public void appendBorder(org.gtk.gsk.RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        try {
            gtk_snapshot_append_border.invokeExact(handle(), outline.handle(), Interop.allocateNativeArray(borderWidth).handle(), Interop.allocateNativeArray(borderColor).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_cairo = Interop.downcallHandle(
        "gtk_snapshot_append_cairo",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link org.gtk.gsk.CairoNode} and appends it to the current
     * render node of {@code snapshot}, without changing the current node.
     */
    public org.cairographics.Context appendCairo(org.gtk.graphene.Rect bounds) {
        try {
            var RESULT = (MemoryAddress) gtk_snapshot_append_cairo.invokeExact(handle(), bounds.handle());
            return new org.cairographics.Context(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_color = Interop.downcallHandle(
        "gtk_snapshot_append_color",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new render node drawing the {@code color} into the
     * given {@code bounds} and appends it to the current render node
     * of {@code snapshot}.
     * <p>
     * You should try to avoid calling this function if
     * {@code color} is transparent.
     */
    public void appendColor(org.gtk.gdk.RGBA color, org.gtk.graphene.Rect bounds) {
        try {
            gtk_snapshot_append_color.invokeExact(handle(), color.handle(), bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_conic_gradient = Interop.downcallHandle(
        "gtk_snapshot_append_conic_gradient",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Appends a conic gradient node with the given stops to {@code snapshot}.
     */
    public void appendConicGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try {
            gtk_snapshot_append_conic_gradient.invokeExact(handle(), bounds.handle(), center.handle(), rotation, Interop.allocateNativeArray(stops).handle(), nStops);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_inset_shadow = Interop.downcallHandle(
        "gtk_snapshot_append_inset_shadow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Appends an inset shadow into the box given by {@code outline}.
     */
    public void appendInsetShadow(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        try {
            gtk_snapshot_append_inset_shadow.invokeExact(handle(), outline.handle(), color.handle(), dx, dy, spread, blurRadius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_layout = Interop.downcallHandle(
        "gtk_snapshot_append_layout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public void appendLayout(org.pango.Layout layout, org.gtk.gdk.RGBA color) {
        try {
            gtk_snapshot_append_layout.invokeExact(handle(), layout.handle(), color.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_linear_gradient = Interop.downcallHandle(
        "gtk_snapshot_append_linear_gradient",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Appends a linear gradient node with the given stops to {@code snapshot}.
     */
    public void appendLinearGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point startPoint, org.gtk.graphene.Point endPoint, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try {
            gtk_snapshot_append_linear_gradient.invokeExact(handle(), bounds.handle(), startPoint.handle(), endPoint.handle(), Interop.allocateNativeArray(stops).handle(), nStops);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_node = Interop.downcallHandle(
        "gtk_snapshot_append_node",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends {@code node} to the current render node of {@code snapshot},
     * without changing the current node.
     * <p>
     * If {@code snapshot} does not have a current node yet, {@code node}
     * will become the initial node.
     */
    public void appendNode(org.gtk.gsk.RenderNode node) {
        try {
            gtk_snapshot_append_node.invokeExact(handle(), node.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_outset_shadow = Interop.downcallHandle(
        "gtk_snapshot_append_outset_shadow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Appends an outset shadow node around the box given by {@code outline}.
     */
    public void appendOutsetShadow(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        try {
            gtk_snapshot_append_outset_shadow.invokeExact(handle(), outline.handle(), color.handle(), dx, dy, spread, blurRadius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_radial_gradient = Interop.downcallHandle(
        "gtk_snapshot_append_radial_gradient",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Appends a radial gradient node with the given stops to {@code snapshot}.
     */
    public void appendRadialGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try {
            gtk_snapshot_append_radial_gradient.invokeExact(handle(), bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(stops).handle(), nStops);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_repeating_linear_gradient = Interop.downcallHandle(
        "gtk_snapshot_append_repeating_linear_gradient",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Appends a repeating linear gradient node with the given stops to {@code snapshot}.
     */
    public void appendRepeatingLinearGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point startPoint, org.gtk.graphene.Point endPoint, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try {
            gtk_snapshot_append_repeating_linear_gradient.invokeExact(handle(), bounds.handle(), startPoint.handle(), endPoint.handle(), Interop.allocateNativeArray(stops).handle(), nStops);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_repeating_radial_gradient = Interop.downcallHandle(
        "gtk_snapshot_append_repeating_radial_gradient",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Appends a repeating radial gradient node with the given stops to {@code snapshot}.
     */
    public void appendRepeatingRadialGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] stops, long nStops) {
        try {
            gtk_snapshot_append_repeating_radial_gradient.invokeExact(handle(), bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(stops).handle(), nStops);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_append_texture = Interop.downcallHandle(
        "gtk_snapshot_append_texture",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new render node drawing the {@code texture}
     * into the given {@code bounds} and appends it to the
     * current render node of {@code snapshot}.
     */
    public void appendTexture(org.gtk.gdk.Texture texture, org.gtk.graphene.Rect bounds) {
        try {
            gtk_snapshot_append_texture.invokeExact(handle(), texture.handle(), bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_free_to_node = Interop.downcallHandle(
        "gtk_snapshot_free_to_node",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the node that was constructed by {@code snapshot}
     * and frees {@code snapshot}.
     */
    public org.gtk.gsk.RenderNode freeToNode() {
        try {
            var RESULT = (MemoryAddress) gtk_snapshot_free_to_node.invokeExact(handle());
            return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_free_to_paintable = Interop.downcallHandle(
        "gtk_snapshot_free_to_paintable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a paintable for the node that was
     * constructed by {@code snapshot} and frees {@code snapshot}.
     */
    public org.gtk.gdk.Paintable freeToPaintable(org.gtk.graphene.Size size) {
        try {
            var RESULT = (MemoryAddress) gtk_snapshot_free_to_paintable.invokeExact(handle(), size.handle());
            return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_gl_shader_pop_texture = Interop.downcallHandle(
        "gtk_snapshot_gl_shader_pop_texture",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            gtk_snapshot_gl_shader_pop_texture.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_perspective = Interop.downcallHandle(
        "gtk_snapshot_perspective",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Applies a perspective projection transform.
     * <p>
     * See {@link org.gtk.gsk.Transform#perspective} for a discussion on the details.
     */
    public void perspective(float depth) {
        try {
            gtk_snapshot_perspective.invokeExact(handle(), depth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_pop = Interop.downcallHandle(
        "gtk_snapshot_pop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the top element from the stack of render nodes,
     * and appends it to the node underneath it.
     */
    public void pop() {
        try {
            gtk_snapshot_pop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_blend = Interop.downcallHandle(
        "gtk_snapshot_push_blend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public void pushBlend(org.gtk.gsk.BlendMode blendMode) {
        try {
            gtk_snapshot_push_blend.invokeExact(handle(), blendMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_blur = Interop.downcallHandle(
        "gtk_snapshot_push_blur",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Blurs an image.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushBlur(double radius) {
        try {
            gtk_snapshot_push_blur.invokeExact(handle(), radius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_clip = Interop.downcallHandle(
        "gtk_snapshot_push_clip",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Clips an image to a rectangle.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushClip(org.gtk.graphene.Rect bounds) {
        try {
            gtk_snapshot_push_clip.invokeExact(handle(), bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_color_matrix = Interop.downcallHandle(
        "gtk_snapshot_push_color_matrix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Modifies the colors of an image by applying an affine transformation
     * in RGB space.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushColorMatrix(org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        try {
            gtk_snapshot_push_color_matrix.invokeExact(handle(), colorMatrix.handle(), colorOffset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_cross_fade = Interop.downcallHandle(
        "gtk_snapshot_push_cross_fade",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
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
     */
    public void pushCrossFade(double progress) {
        try {
            gtk_snapshot_push_cross_fade.invokeExact(handle(), progress);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_gl_shader = Interop.downcallHandle(
        "gtk_snapshot_push_gl_shader",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * You should use {@code shader
     * will work for the renderer before using it.
     * 
     * If the shader requires textures (see [method@Gsk.GLShader.get_n_textures}),
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
     */
    public void pushGlShader(org.gtk.gsk.GLShader shader, org.gtk.graphene.Rect bounds, org.gtk.glib.Bytes takeArgs) {
        try {
            gtk_snapshot_push_gl_shader.invokeExact(handle(), shader.handle(), bounds.handle(), takeArgs.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_opacity = Interop.downcallHandle(
        "gtk_snapshot_push_opacity",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Modifies the opacity of an image.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushOpacity(double opacity) {
        try {
            gtk_snapshot_push_opacity.invokeExact(handle(), opacity);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_repeat = Interop.downcallHandle(
        "gtk_snapshot_push_repeat",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a node that repeats the child node.
     * <p>
     * The child is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushRepeat(org.gtk.graphene.Rect bounds, org.gtk.graphene.Rect childBounds) {
        try {
            gtk_snapshot_push_repeat.invokeExact(handle(), bounds.handle(), childBounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_rounded_clip = Interop.downcallHandle(
        "gtk_snapshot_push_rounded_clip",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Clips an image to a rounded rectangle.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushRoundedClip(org.gtk.gsk.RoundedRect bounds) {
        try {
            gtk_snapshot_push_rounded_clip.invokeExact(handle(), bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_push_shadow = Interop.downcallHandle(
        "gtk_snapshot_push_shadow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Applies a shadow to an image.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushShadow(org.gtk.gsk.Shadow[] shadow, long nShadows) {
        try {
            gtk_snapshot_push_shadow.invokeExact(handle(), Interop.allocateNativeArray(shadow).handle(), nShadows);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_render_background = Interop.downcallHandle(
        "gtk_snapshot_render_background",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Creates a render node for the CSS background according to {@code context},
     * and appends it to the current node of {@code snapshot}, without changing
     * the current node.
     */
    public void renderBackground(StyleContext context, double x, double y, double width, double height) {
        try {
            gtk_snapshot_render_background.invokeExact(handle(), context.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_render_focus = Interop.downcallHandle(
        "gtk_snapshot_render_focus",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Creates a render node for the focus outline according to {@code context},
     * and appends it to the current node of {@code snapshot}, without changing
     * the current node.
     */
    public void renderFocus(StyleContext context, double x, double y, double width, double height) {
        try {
            gtk_snapshot_render_focus.invokeExact(handle(), context.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_render_frame = Interop.downcallHandle(
        "gtk_snapshot_render_frame",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Creates a render node for the CSS border according to {@code context},
     * and appends it to the current node of {@code snapshot}, without changing
     * the current node.
     */
    public void renderFrame(StyleContext context, double x, double y, double width, double height) {
        try {
            gtk_snapshot_render_frame.invokeExact(handle(), context.handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_render_insertion_cursor = Interop.downcallHandle(
        "gtk_snapshot_render_insertion_cursor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Draws a text caret using {@code snapshot} at the specified index of {@code layout}.
     */
    public void renderInsertionCursor(StyleContext context, double x, double y, org.pango.Layout layout, int index, org.pango.Direction direction) {
        try {
            gtk_snapshot_render_insertion_cursor.invokeExact(handle(), context.handle(), x, y, layout.handle(), index, direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_render_layout = Interop.downcallHandle(
        "gtk_snapshot_render_layout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a render node for rendering {@code layout} according to the style
     * information in {@code context}, and appends it to the current node of {@code snapshot},
     * without changing the current node.
     */
    public void renderLayout(StyleContext context, double x, double y, org.pango.Layout layout) {
        try {
            gtk_snapshot_render_layout.invokeExact(handle(), context.handle(), x, y, layout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_restore = Interop.downcallHandle(
        "gtk_snapshot_restore",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Restores {@code snapshot} to the state saved by a preceding call to
     * {@link Snapshot#save} and removes that state from the stack of
     * saved states.
     */
    public void restore() {
        try {
            gtk_snapshot_restore.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_rotate = Interop.downcallHandle(
        "gtk_snapshot_rotate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Rotates @{@code snapshot}'s coordinate system by {@code angle} degrees in 2D space -
     * or in 3D speak, rotates around the Z axis.
     * <p>
     * To rotate around other axes, use {@link org.gtk.gsk.Transform#rotate3d}.
     */
    public void rotate(float angle) {
        try {
            gtk_snapshot_rotate.invokeExact(handle(), angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_rotate_3d = Interop.downcallHandle(
        "gtk_snapshot_rotate_3d",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Rotates {@code snapshot}'s coordinate system by {@code angle} degrees around {@code axis}.
     * <p>
     * For a rotation in 2D space, use {@link org.gtk.gsk.Transform#rotate}.
     */
    public void rotate3d(float angle, org.gtk.graphene.Vec3 axis) {
        try {
            gtk_snapshot_rotate_3d.invokeExact(handle(), angle, axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_save = Interop.downcallHandle(
        "gtk_snapshot_save",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a copy of the current state of {@code snapshot} and saves it
     * on an internal stack.
     * <p>
     * When {@code snapshot will
     * be restored to the saved state. Multiple calls to
     * [method@Snapshot.save] and [class@Snapshot.restore} can be nested;
     * each call to {@code gtk_snapshot_restore()} restores the state from
     * the matching paired {@code gtk_snapshot_save()}.
     * <p>
     * It is necessary to clear all saved states with corresponding
     * calls to {@code gtk_snapshot_restore()}.
     */
    public void save() {
        try {
            gtk_snapshot_save.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_scale = Interop.downcallHandle(
        "gtk_snapshot_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Scales {@code snapshot}'s coordinate system in 2-dimensional space by
     * the given factors.
     * <p>
     * Use {@link Snapshot#scale3d} to scale in all 3 dimensions.
     */
    public void scale(float factorX, float factorY) {
        try {
            gtk_snapshot_scale.invokeExact(handle(), factorX, factorY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_scale_3d = Interop.downcallHandle(
        "gtk_snapshot_scale_3d",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Scales {@code snapshot}'s coordinate system by the given factors.
     */
    public void scale3d(float factorX, float factorY, float factorZ) {
        try {
            gtk_snapshot_scale_3d.invokeExact(handle(), factorX, factorY, factorZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_to_node = Interop.downcallHandle(
        "gtk_snapshot_to_node",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the render node that was constructed
     * by {@code snapshot}.
     * <p>
     * After calling this function, it is no longer possible to
     * add more nodes to {@code snapshot}. The only function that should
     * be called after this is {@link org.gtk.gobject.Object#unref}.
     */
    public org.gtk.gsk.RenderNode toNode() {
        try {
            var RESULT = (MemoryAddress) gtk_snapshot_to_node.invokeExact(handle());
            return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_to_paintable = Interop.downcallHandle(
        "gtk_snapshot_to_paintable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a paintable encapsulating the render node
     * that was constructed by {@code snapshot}.
     * <p>
     * After calling this function, it is no longer possible to
     * add more nodes to {@code snapshot}. The only function that should
     * be called after this is {@link org.gtk.gobject.Object#unref}.
     */
    public org.gtk.gdk.Paintable toPaintable(org.gtk.graphene.Size size) {
        try {
            var RESULT = (MemoryAddress) gtk_snapshot_to_paintable.invokeExact(handle(), size.handle());
            return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_transform = Interop.downcallHandle(
        "gtk_snapshot_transform",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms {@code snapshot}'s coordinate system with the given {@code transform}.
     */
    public void transform(org.gtk.gsk.Transform transform) {
        try {
            gtk_snapshot_transform.invokeExact(handle(), transform.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_transform_matrix = Interop.downcallHandle(
        "gtk_snapshot_transform_matrix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms {@code snapshot}'s coordinate system with the given {@code matrix}.
     */
    public void transformMatrix(org.gtk.graphene.Matrix matrix) {
        try {
            gtk_snapshot_transform_matrix.invokeExact(handle(), matrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_translate = Interop.downcallHandle(
        "gtk_snapshot_translate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Translates {@code snapshot}'s coordinate system by {@code point} in 2-dimensional space.
     */
    public void translate(org.gtk.graphene.Point point) {
        try {
            gtk_snapshot_translate.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_snapshot_translate_3d = Interop.downcallHandle(
        "gtk_snapshot_translate_3d",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Translates {@code snapshot}'s coordinate system by {@code point}.
     */
    public void translate3d(org.gtk.graphene.Point3D point) {
        try {
            gtk_snapshot_translate_3d.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
