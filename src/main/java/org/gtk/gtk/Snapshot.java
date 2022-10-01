package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_snapshot_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSnapshot}.
     */
    public Snapshot() {
        super(constructNew());
    }
    
    /**
     * Appends a stroked border rectangle inside the given {@code outline}.
     * <p>
     * The four sides of the border can have different widths and colors.
     */
    public void appendBorder(org.gtk.gsk.RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        gtk_h.gtk_snapshot_append_border(handle(), outline.handle(), Interop.allocateNativeArray(borderWidth).handle(), Interop.allocateNativeArray(borderColor).handle());
    }
    
    /**
     * Creates a new {@link org.gtk.gsk.CairoNode} and appends it to the current
     * render node of {@code snapshot}, without changing the current node.
     */
    public org.cairographics.Context appendCairo(org.gtk.graphene.Rect bounds) {
        var RESULT = gtk_h.gtk_snapshot_append_cairo(handle(), bounds.handle());
        return new org.cairographics.Context(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new render node drawing the {@code color} into the
     * given {@code bounds} and appends it to the current render node
     * of {@code snapshot}.
     * <p>
     * You should try to avoid calling this function if
     * {@code color} is transparent.
     */
    public void appendColor(org.gtk.gdk.RGBA color, org.gtk.graphene.Rect bounds) {
        gtk_h.gtk_snapshot_append_color(handle(), color.handle(), bounds.handle());
    }
    
    /**
     * Appends a conic gradient node with the given stops to {@code snapshot}.
     */
    public void appendConicGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, org.gtk.gsk.ColorStop[] stops, long nStops) {
        gtk_h.gtk_snapshot_append_conic_gradient(handle(), bounds.handle(), center.handle(), rotation, Interop.allocateNativeArray(stops).handle(), nStops);
    }
    
    /**
     * Appends an inset shadow into the box given by {@code outline}.
     */
    public void appendInsetShadow(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        gtk_h.gtk_snapshot_append_inset_shadow(handle(), outline.handle(), color.handle(), dx, dy, spread, blurRadius);
    }
    
    public void appendLayout(org.pango.Layout layout, org.gtk.gdk.RGBA color) {
        gtk_h.gtk_snapshot_append_layout(handle(), layout.handle(), color.handle());
    }
    
    /**
     * Appends a linear gradient node with the given stops to {@code snapshot}.
     */
    public void appendLinearGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point startPoint, org.gtk.graphene.Point endPoint, org.gtk.gsk.ColorStop[] stops, long nStops) {
        gtk_h.gtk_snapshot_append_linear_gradient(handle(), bounds.handle(), startPoint.handle(), endPoint.handle(), Interop.allocateNativeArray(stops).handle(), nStops);
    }
    
    /**
     * Appends {@code node} to the current render node of {@code snapshot},
     * without changing the current node.
     * <p>
     * If {@code snapshot} does not have a current node yet, {@code node}
     * will become the initial node.
     */
    public void appendNode(org.gtk.gsk.RenderNode node) {
        gtk_h.gtk_snapshot_append_node(handle(), node.handle());
    }
    
    /**
     * Appends an outset shadow node around the box given by {@code outline}.
     */
    public void appendOutsetShadow(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        gtk_h.gtk_snapshot_append_outset_shadow(handle(), outline.handle(), color.handle(), dx, dy, spread, blurRadius);
    }
    
    /**
     * Appends a radial gradient node with the given stops to {@code snapshot}.
     */
    public void appendRadialGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] stops, long nStops) {
        gtk_h.gtk_snapshot_append_radial_gradient(handle(), bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(stops).handle(), nStops);
    }
    
    /**
     * Appends a repeating linear gradient node with the given stops to {@code snapshot}.
     */
    public void appendRepeatingLinearGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point startPoint, org.gtk.graphene.Point endPoint, org.gtk.gsk.ColorStop[] stops, long nStops) {
        gtk_h.gtk_snapshot_append_repeating_linear_gradient(handle(), bounds.handle(), startPoint.handle(), endPoint.handle(), Interop.allocateNativeArray(stops).handle(), nStops);
    }
    
    /**
     * Appends a repeating radial gradient node with the given stops to {@code snapshot}.
     */
    public void appendRepeatingRadialGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] stops, long nStops) {
        gtk_h.gtk_snapshot_append_repeating_radial_gradient(handle(), bounds.handle(), center.handle(), hradius, vradius, start, end, Interop.allocateNativeArray(stops).handle(), nStops);
    }
    
    /**
     * Creates a new render node drawing the {@code texture}
     * into the given {@code bounds} and appends it to the
     * current render node of {@code snapshot}.
     */
    public void appendTexture(org.gtk.gdk.Texture texture, org.gtk.graphene.Rect bounds) {
        gtk_h.gtk_snapshot_append_texture(handle(), texture.handle(), bounds.handle());
    }
    
    /**
     * Returns the node that was constructed by {@code snapshot}
     * and frees {@code snapshot}.
     */
    public org.gtk.gsk.RenderNode freeToNode() {
        var RESULT = gtk_h.gtk_snapshot_free_to_node(handle());
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns a paintable for the node that was
     * constructed by {@code snapshot} and frees {@code snapshot}.
     */
    public org.gtk.gdk.Paintable freeToPaintable(org.gtk.graphene.Size size) {
        var RESULT = gtk_h.gtk_snapshot_free_to_paintable(handle(), size.handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, true));
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
        gtk_h.gtk_snapshot_gl_shader_pop_texture(handle());
    }
    
    /**
     * Applies a perspective projection transform.
     * <p>
     * See {@link org.gtk.gsk.Transform#perspective} for a discussion on the details.
     */
    public void perspective(float depth) {
        gtk_h.gtk_snapshot_perspective(handle(), depth);
    }
    
    /**
     * Removes the top element from the stack of render nodes,
     * and appends it to the node underneath it.
     */
    public void pop() {
        gtk_h.gtk_snapshot_pop(handle());
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
     */
    public void pushBlend(org.gtk.gsk.BlendMode blendMode) {
        gtk_h.gtk_snapshot_push_blend(handle(), blendMode.getValue());
    }
    
    /**
     * Blurs an image.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushBlur(double radius) {
        gtk_h.gtk_snapshot_push_blur(handle(), radius);
    }
    
    /**
     * Clips an image to a rectangle.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushClip(org.gtk.graphene.Rect bounds) {
        gtk_h.gtk_snapshot_push_clip(handle(), bounds.handle());
    }
    
    /**
     * Modifies the colors of an image by applying an affine transformation
     * in RGB space.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushColorMatrix(org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        gtk_h.gtk_snapshot_push_color_matrix(handle(), colorMatrix.handle(), colorOffset.handle());
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
     */
    public void pushCrossFade(double progress) {
        gtk_h.gtk_snapshot_push_cross_fade(handle(), progress);
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
        gtk_h.gtk_snapshot_push_gl_shader(handle(), shader.handle(), bounds.handle(), takeArgs.refcounted().unowned().handle());
    }
    
    /**
     * Modifies the opacity of an image.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushOpacity(double opacity) {
        gtk_h.gtk_snapshot_push_opacity(handle(), opacity);
    }
    
    /**
     * Creates a node that repeats the child node.
     * <p>
     * The child is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushRepeat(org.gtk.graphene.Rect bounds, org.gtk.graphene.Rect childBounds) {
        gtk_h.gtk_snapshot_push_repeat(handle(), bounds.handle(), childBounds.handle());
    }
    
    /**
     * Clips an image to a rounded rectangle.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushRoundedClip(org.gtk.gsk.RoundedRect bounds) {
        gtk_h.gtk_snapshot_push_rounded_clip(handle(), bounds.handle());
    }
    
    /**
     * Applies a shadow to an image.
     * <p>
     * The image is recorded until the next call to {@link Snapshot#pop}.
     */
    public void pushShadow(org.gtk.gsk.Shadow[] shadow, long nShadows) {
        gtk_h.gtk_snapshot_push_shadow(handle(), Interop.allocateNativeArray(shadow).handle(), nShadows);
    }
    
    /**
     * Creates a render node for the CSS background according to {@code context},
     * and appends it to the current node of {@code snapshot}, without changing
     * the current node.
     */
    public void renderBackground(StyleContext context, double x, double y, double width, double height) {
        gtk_h.gtk_snapshot_render_background(handle(), context.handle(), x, y, width, height);
    }
    
    /**
     * Creates a render node for the focus outline according to {@code context},
     * and appends it to the current node of {@code snapshot}, without changing
     * the current node.
     */
    public void renderFocus(StyleContext context, double x, double y, double width, double height) {
        gtk_h.gtk_snapshot_render_focus(handle(), context.handle(), x, y, width, height);
    }
    
    /**
     * Creates a render node for the CSS border according to {@code context},
     * and appends it to the current node of {@code snapshot}, without changing
     * the current node.
     */
    public void renderFrame(StyleContext context, double x, double y, double width, double height) {
        gtk_h.gtk_snapshot_render_frame(handle(), context.handle(), x, y, width, height);
    }
    
    /**
     * Draws a text caret using {@code snapshot} at the specified index of {@code layout}.
     */
    public void renderInsertionCursor(StyleContext context, double x, double y, org.pango.Layout layout, int index, org.pango.Direction direction) {
        gtk_h.gtk_snapshot_render_insertion_cursor(handle(), context.handle(), x, y, layout.handle(), index, direction.getValue());
    }
    
    /**
     * Creates a render node for rendering {@code layout} according to the style
     * information in {@code context}, and appends it to the current node of {@code snapshot},
     * without changing the current node.
     */
    public void renderLayout(StyleContext context, double x, double y, org.pango.Layout layout) {
        gtk_h.gtk_snapshot_render_layout(handle(), context.handle(), x, y, layout.handle());
    }
    
    /**
     * Restores {@code snapshot} to the state saved by a preceding call to
     * {@link Snapshot#save} and removes that state from the stack of
     * saved states.
     */
    public void restore() {
        gtk_h.gtk_snapshot_restore(handle());
    }
    
    /**
     * Rotates @{@code snapshot}'s coordinate system by {@code angle} degrees in 2D space -
     * or in 3D speak, rotates around the Z axis.
     * <p>
     * To rotate around other axes, use {@link org.gtk.gsk.Transform#rotate3d}.
     */
    public void rotate(float angle) {
        gtk_h.gtk_snapshot_rotate(handle(), angle);
    }
    
    /**
     * Rotates {@code snapshot}'s coordinate system by {@code angle} degrees around {@code axis}.
     * <p>
     * For a rotation in 2D space, use {@link org.gtk.gsk.Transform#rotate}.
     */
    public void rotate3d(float angle, org.gtk.graphene.Vec3 axis) {
        gtk_h.gtk_snapshot_rotate_3d(handle(), angle, axis.handle());
    }
    
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
        gtk_h.gtk_snapshot_save(handle());
    }
    
    /**
     * Scales {@code snapshot}'s coordinate system in 2-dimensional space by
     * the given factors.
     * <p>
     * Use {@link Snapshot#scale3d} to scale in all 3 dimensions.
     */
    public void scale(float factorX, float factorY) {
        gtk_h.gtk_snapshot_scale(handle(), factorX, factorY);
    }
    
    /**
     * Scales {@code snapshot}'s coordinate system by the given factors.
     */
    public void scale3d(float factorX, float factorY, float factorZ) {
        gtk_h.gtk_snapshot_scale_3d(handle(), factorX, factorY, factorZ);
    }
    
    /**
     * Returns the render node that was constructed
     * by {@code snapshot}.
     * <p>
     * After calling this function, it is no longer possible to
     * add more nodes to {@code snapshot}. The only function that should
     * be called after this is {@link org.gtk.gobject.Object#unref}.
     */
    public org.gtk.gsk.RenderNode toNode() {
        var RESULT = gtk_h.gtk_snapshot_to_node(handle());
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns a paintable encapsulating the render node
     * that was constructed by {@code snapshot}.
     * <p>
     * After calling this function, it is no longer possible to
     * add more nodes to {@code snapshot}. The only function that should
     * be called after this is {@link org.gtk.gobject.Object#unref}.
     */
    public org.gtk.gdk.Paintable toPaintable(org.gtk.graphene.Size size) {
        var RESULT = gtk_h.gtk_snapshot_to_paintable(handle(), size.handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Transforms {@code snapshot}'s coordinate system with the given {@code transform}.
     */
    public void transform(org.gtk.gsk.Transform transform) {
        gtk_h.gtk_snapshot_transform(handle(), transform.handle());
    }
    
    /**
     * Transforms {@code snapshot}'s coordinate system with the given {@code matrix}.
     */
    public void transformMatrix(org.gtk.graphene.Matrix matrix) {
        gtk_h.gtk_snapshot_transform_matrix(handle(), matrix.handle());
    }
    
    /**
     * Translates {@code snapshot}'s coordinate system by {@code point} in 2-dimensional space.
     */
    public void translate(org.gtk.graphene.Point point) {
        gtk_h.gtk_snapshot_translate(handle(), point.handle());
    }
    
    /**
     * Translates {@code snapshot}'s coordinate system by {@code point}.
     */
    public void translate3d(org.gtk.graphene.Point3D point) {
        gtk_h.gtk_snapshot_translate_3d(handle(), point.handle());
    }
    
}
