package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSnapshot` assists in creating [class@Gsk.RenderNode]s for widgets.
 * 
 * It functions in a similar way to a cairo context, and maintains a stack
 * of render nodes and their associated transformations.
 * 
 * The node at the top of the stack is the one that `gtk_snapshot_append_…()`
 * functions operate on. Use the `gtk_snapshot_push_…()` functions and
 * [method@Snapshot.pop] to change the current node.
 * 
 * The typical way to obtain a `GtkSnapshot` object is as an argument to
 * the [vfunc@Gtk.Widget.snapshot] vfunc. If you need to create your own
 * `GtkSnapshot`, use [ctor@Gtk.Snapshot.new].
 */
public class Snapshot extends org.gtk.gdk.Snapshot {

    public Snapshot(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Snapshot */
    public static Snapshot castFrom(org.gtk.gobject.Object gobject) {
        return new Snapshot(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkSnapshot`.
     */
    public Snapshot() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_new(), true));
    }
    
    /**
     * Appends a stroked border rectangle inside the given @outline.
     * 
     * The four sides of the border can have different widths and colors.
     */
    public void appendBorder(org.gtk.gsk.RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_border(HANDLE(), outline.HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, borderWidth), Interop.allocateNativeArray(borderColor));
    }
    
    /**
     * Creates a new [class@Gsk.CairoNode] and appends it to the current
     * render node of @snapshot, without changing the current node.
     */
    public org.cairographics.Context appendCairo(org.gtk.graphene.Rect bounds) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_cairo(HANDLE(), bounds.HANDLE());
        return new org.cairographics.Context(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Creates a new render node drawing the @color into the
     * given @bounds and appends it to the current render node
     * of @snapshot.
     * 
     * You should try to avoid calling this function if
     * @color is transparent.
     */
    public void appendColor(org.gtk.gdk.RGBA color, org.gtk.graphene.Rect bounds) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_color(HANDLE(), color.HANDLE(), bounds.HANDLE());
    }
    
    /**
     * Appends a conic gradient node with the given stops to @snapshot.
     */
    public void appendConicGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float rotation, org.gtk.gsk.ColorStop[] stops, long nStops) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_conic_gradient(HANDLE(), bounds.HANDLE(), center.HANDLE(), rotation, Interop.allocateNativeArray(stops), nStops);
    }
    
    /**
     * Appends an inset shadow into the box given by @outline.
     */
    public void appendInsetShadow(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_inset_shadow(HANDLE(), outline.HANDLE(), color.HANDLE(), dx, dy, spread, blurRadius);
    }
    
    public void appendLayout(org.pango.Layout layout, org.gtk.gdk.RGBA color) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_layout(HANDLE(), layout.HANDLE(), color.HANDLE());
    }
    
    /**
     * Appends a linear gradient node with the given stops to @snapshot.
     */
    public void appendLinearGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point startPoint, org.gtk.graphene.Point endPoint, org.gtk.gsk.ColorStop[] stops, long nStops) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_linear_gradient(HANDLE(), bounds.HANDLE(), startPoint.HANDLE(), endPoint.HANDLE(), Interop.allocateNativeArray(stops), nStops);
    }
    
    /**
     * Appends @node to the current render node of @snapshot,
     * without changing the current node.
     * 
     * If @snapshot does not have a current node yet, @node
     * will become the initial node.
     */
    public void appendNode(org.gtk.gsk.RenderNode node) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_node(HANDLE(), node.HANDLE());
    }
    
    /**
     * Appends an outset shadow node around the box given by @outline.
     */
    public void appendOutsetShadow(org.gtk.gsk.RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_outset_shadow(HANDLE(), outline.HANDLE(), color.HANDLE(), dx, dy, spread, blurRadius);
    }
    
    /**
     * Appends a radial gradient node with the given stops to @snapshot.
     */
    public void appendRadialGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] stops, long nStops) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_radial_gradient(HANDLE(), bounds.HANDLE(), center.HANDLE(), hradius, vradius, start, end, Interop.allocateNativeArray(stops), nStops);
    }
    
    /**
     * Appends a repeating linear gradient node with the given stops to @snapshot.
     */
    public void appendRepeatingLinearGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point startPoint, org.gtk.graphene.Point endPoint, org.gtk.gsk.ColorStop[] stops, long nStops) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_repeating_linear_gradient(HANDLE(), bounds.HANDLE(), startPoint.HANDLE(), endPoint.HANDLE(), Interop.allocateNativeArray(stops), nStops);
    }
    
    /**
     * Appends a repeating radial gradient node with the given stops to @snapshot.
     */
    public void appendRepeatingRadialGradient(org.gtk.graphene.Rect bounds, org.gtk.graphene.Point center, float hradius, float vradius, float start, float end, org.gtk.gsk.ColorStop[] stops, long nStops) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_repeating_radial_gradient(HANDLE(), bounds.HANDLE(), center.HANDLE(), hradius, vradius, start, end, Interop.allocateNativeArray(stops), nStops);
    }
    
    /**
     * Creates a new render node drawing the @texture
     * into the given @bounds and appends it to the
     * current render node of @snapshot.
     */
    public void appendTexture(org.gtk.gdk.Texture texture, org.gtk.graphene.Rect bounds) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_append_texture(HANDLE(), texture.HANDLE(), bounds.HANDLE());
    }
    
    /**
     * Returns the node that was constructed by @snapshot
     * and frees @snapshot.
     */
    public org.gtk.gsk.RenderNode freeToNode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_free_to_node(HANDLE());
        return new org.gtk.gsk.RenderNode(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Returns a paintable for the node that was
     * constructed by @snapshot and frees @snapshot.
     */
    public org.gtk.gdk.Paintable freeToPaintable(org.gtk.graphene.Size size) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_free_to_paintable(HANDLE(), size.HANDLE());
        return new org.gtk.gdk.Paintable.PaintableImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Removes the top element from the stack of render nodes and
     * adds it to the nearest [class@Gsk.GLShaderNode] below it.
     * 
     * This must be called the same number of times as the number
     * of textures is needed for the shader in
     * [method@Gtk.Snapshot.push_gl_shader].
     */
    public void glShaderPopTexture() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_gl_shader_pop_texture(HANDLE());
    }
    
    /**
     * Applies a perspective projection transform.
     * 
     * See [method@Gsk.Transform.perspective] for a discussion on the details.
     */
    public void perspective(float depth) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_perspective(HANDLE(), depth);
    }
    
    /**
     * Removes the top element from the stack of render nodes,
     * and appends it to the node underneath it.
     */
    public void pop() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_pop(HANDLE());
    }
    
    /**
     * Blends together two images with the given blend mode.
     * 
     * Until the first call to [method@Gtk.Snapshot.pop], the
     * bottom image for the blend operation will be recorded.
     * After that call, the top image to be blended will be
     * recorded until the second call to [method@Gtk.Snapshot.pop].
     * 
     * Calling this function requires two subsequent calls
     * to [method@Gtk.Snapshot.pop].
     */
    public void pushBlend(org.gtk.gsk.BlendMode blendMode) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_blend(HANDLE(), blendMode.getValue());
    }
    
    /**
     * Blurs an image.
     * 
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     */
    public void pushBlur(double radius) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_blur(HANDLE(), radius);
    }
    
    /**
     * Clips an image to a rectangle.
     * 
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     */
    public void pushClip(org.gtk.graphene.Rect bounds) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_clip(HANDLE(), bounds.HANDLE());
    }
    
    /**
     * Modifies the colors of an image by applying an affine transformation
     * in RGB space.
     * 
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     */
    public void pushColorMatrix(org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_color_matrix(HANDLE(), colorMatrix.HANDLE(), colorOffset.HANDLE());
    }
    
    /**
     * Snapshots a cross-fade operation between two images with the
     * given @progress.
     * 
     * Until the first call to [method@Gtk.Snapshot.pop], the start image
     * will be snapshot. After that call, the end image will be recorded
     * until the second call to [method@Gtk.Snapshot.pop].
     * 
     * Calling this function requires two subsequent calls
     * to [method@Gtk.Snapshot.pop].
     */
    public void pushCrossFade(double progress) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_cross_fade(HANDLE(), progress);
    }
    
    /**
     * Push a [class@Gsk.GLShaderNode].
     * 
     * The node uses the given [class@Gsk.GLShader] and uniform values
     * Additionally this takes a list of @n_children other nodes
     * which will be passed to the [class@Gsk.GLShaderNode].
     * 
     * The @take_args argument is a block of data to use for uniform
     * arguments, as per types and offsets defined by the @shader.
     * Normally this is generated by [method@Gsk.GLShader.format_args]
     * or [struct@Gsk.ShaderArgsBuilder].
     * 
     * The snapshotter takes ownership of @take_args, so the caller should
     * not free it after this.
     * 
     * If the renderer doesn't support GL shaders, or if there is any
     * problem when compiling the shader, then the node will draw pink.
     * You should use [method@Gsk.GLShader.compile] to ensure the @shader
     * will work for the renderer before using it.
     * 
     * If the shader requires textures (see [method@Gsk.GLShader.get_n_textures]),
     * then it is expected that you call [method@Gtk.Snapshot.gl_shader_pop_texture]
     * the number of times that are required. Each of these calls will generate
     * a node that is added as a child to the `GskGLShaderNode`, which in turn
     * will render these offscreen and pass as a texture to the shader.
     * 
     * Once all textures (if any) are pop:ed, you must call the regular
     * [method@Gtk.Snapshot.pop].
     * 
     * If you want to use pre-existing textures as input to the shader rather
     * than rendering new ones, use [method@Gtk.Snapshot.append_texture] to
     * push a texture node. These will be used directly rather than being
     * re-rendered.
     * 
     * For details on how to write shaders, see [class@Gsk.GLShader].
     */
    public void pushGlShader(org.gtk.gsk.GLShader shader, org.gtk.graphene.Rect bounds, org.gtk.glib.Bytes takeArgs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_gl_shader(HANDLE(), shader.HANDLE(), bounds.HANDLE(), takeArgs.HANDLE());
    }
    
    /**
     * Modifies the opacity of an image.
     * 
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     */
    public void pushOpacity(double opacity) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_opacity(HANDLE(), opacity);
    }
    
    /**
     * Creates a node that repeats the child node.
     * 
     * The child is recorded until the next call to [method@Gtk.Snapshot.pop].
     */
    public void pushRepeat(org.gtk.graphene.Rect bounds, org.gtk.graphene.Rect childBounds) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_repeat(HANDLE(), bounds.HANDLE(), childBounds.HANDLE());
    }
    
    /**
     * Clips an image to a rounded rectangle.
     * 
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     */
    public void pushRoundedClip(org.gtk.gsk.RoundedRect bounds) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_rounded_clip(HANDLE(), bounds.HANDLE());
    }
    
    /**
     * Applies a shadow to an image.
     * 
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     */
    public void pushShadow(org.gtk.gsk.Shadow[] shadow, long nShadows) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_push_shadow(HANDLE(), Interop.allocateNativeArray(shadow), nShadows);
    }
    
    /**
     * Creates a render node for the CSS background according to @context,
     * and appends it to the current node of @snapshot, without changing
     * the current node.
     */
    public void renderBackground(StyleContext context, double x, double y, double width, double height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_render_background(HANDLE(), context.HANDLE(), x, y, width, height);
    }
    
    /**
     * Creates a render node for the focus outline according to @context,
     * and appends it to the current node of @snapshot, without changing
     * the current node.
     */
    public void renderFocus(StyleContext context, double x, double y, double width, double height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_render_focus(HANDLE(), context.HANDLE(), x, y, width, height);
    }
    
    /**
     * Creates a render node for the CSS border according to @context,
     * and appends it to the current node of @snapshot, without changing
     * the current node.
     */
    public void renderFrame(StyleContext context, double x, double y, double width, double height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_render_frame(HANDLE(), context.HANDLE(), x, y, width, height);
    }
    
    /**
     * Draws a text caret using @snapshot at the specified index of @layout.
     */
    public void renderInsertionCursor(StyleContext context, double x, double y, org.pango.Layout layout, int index, org.pango.Direction direction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_render_insertion_cursor(HANDLE(), context.HANDLE(), x, y, layout.HANDLE(), index, direction.getValue());
    }
    
    /**
     * Creates a render node for rendering @layout according to the style
     * information in @context, and appends it to the current node of @snapshot,
     * without changing the current node.
     */
    public void renderLayout(StyleContext context, double x, double y, org.pango.Layout layout) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_render_layout(HANDLE(), context.HANDLE(), x, y, layout.HANDLE());
    }
    
    /**
     * Restores @snapshot to the state saved by a preceding call to
     * [method@Snapshot.save] and removes that state from the stack of
     * saved states.
     */
    public void restore() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_restore(HANDLE());
    }
    
    /**
     * Rotates @@snapshot's coordinate system by @angle degrees in 2D space -
     * or in 3D speak, rotates around the Z axis.
     * 
     * To rotate around other axes, use [method@Gsk.Transform.rotate_3d].
     */
    public void rotate(float angle) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_rotate(HANDLE(), angle);
    }
    
    /**
     * Rotates @snapshot's coordinate system by @angle degrees around @axis.
     * 
     * For a rotation in 2D space, use [method@Gsk.Transform.rotate].
     */
    public void rotate3d(float angle, org.gtk.graphene.Vec3 axis) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_rotate_3d(HANDLE(), angle, axis.HANDLE());
    }
    
    /**
     * Makes a copy of the current state of @snapshot and saves it
     * on an internal stack.
     * 
     * When [method@Gtk.Snapshot.restore] is called, @snapshot will
     * be restored to the saved state. Multiple calls to
     * [method@Snapshot.save] and [class@Snapshot.restore] can be nested;
     * each call to `gtk_snapshot_restore()` restores the state from
     * the matching paired `gtk_snapshot_save()`.
     * 
     * It is necessary to clear all saved states with corresponding
     * calls to `gtk_snapshot_restore()`.
     */
    public void save() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_save(HANDLE());
    }
    
    /**
     * Scales @snapshot's coordinate system in 2-dimensional space by
     * the given factors.
     * 
     * Use [method@Gtk.Snapshot.scale_3d] to scale in all 3 dimensions.
     */
    public void scale(float factorX, float factorY) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_scale(HANDLE(), factorX, factorY);
    }
    
    /**
     * Scales @snapshot's coordinate system by the given factors.
     */
    public void scale3d(float factorX, float factorY, float factorZ) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_scale_3d(HANDLE(), factorX, factorY, factorZ);
    }
    
    /**
     * Returns the render node that was constructed
     * by @snapshot.
     * 
     * After calling this function, it is no longer possible to
     * add more nodes to @snapshot. The only function that should
     * be called after this is [method@GObject.Object.unref].
     */
    public org.gtk.gsk.RenderNode toNode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_to_node(HANDLE());
        return new org.gtk.gsk.RenderNode(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Returns a paintable encapsulating the render node
     * that was constructed by @snapshot.
     * 
     * After calling this function, it is no longer possible to
     * add more nodes to @snapshot. The only function that should
     * be called after this is [method@GObject.Object.unref].
     */
    public org.gtk.gdk.Paintable toPaintable(org.gtk.graphene.Size size) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_to_paintable(HANDLE(), size.HANDLE());
        return new org.gtk.gdk.Paintable.PaintableImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Transforms @snapshot's coordinate system with the given @transform.
     */
    public void transform(org.gtk.gsk.Transform transform) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_transform(HANDLE(), transform.HANDLE());
    }
    
    /**
     * Transforms @snapshot's coordinate system with the given @matrix.
     */
    public void transformMatrix(org.gtk.graphene.Matrix matrix) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_transform_matrix(HANDLE(), matrix.HANDLE());
    }
    
    /**
     * Translates @snapshot's coordinate system by @point in 2-dimensional space.
     */
    public void translate(org.gtk.graphene.Point point) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_translate(HANDLE(), point.HANDLE());
    }
    
    /**
     * Translates @snapshot's coordinate system by @point.
     */
    public void translate3d(org.gtk.graphene.Point3D point) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_snapshot_translate_3d(HANDLE(), point.HANDLE());
    }
    
}
