package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GskRenderer} is a class that renders a scene graph defined via a
 * tree of {@link RenderNode} instances.
 * <p>
 * Typically you will use a {@code GskRenderer} instance to repeatedly call
 * {@link Renderer#render} to update the contents of its associated
 * {@link org.gtk.gdk.Surface}.
 * <p>
 * It is necessary to realize a {@code GskRenderer} instance using
 * {@link Renderer#realize} before calling {@link Renderer#render},
 * in order to create the appropriate windowing system resources needed
 * to render the scene.
 */
public class Renderer extends org.gtk.gobject.Object {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRenderer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Renderer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Renderer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Renderer if its GType is a (or inherits from) "GskRenderer".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Renderer" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskRenderer", a ClassCastException will be thrown.
     */
    public static Renderer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskRenderer"))) {
            return new Renderer(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskRenderer");
        }
    }
    
    private static Addressable constructNewForSurface(@NotNull org.gtk.gdk.Surface surface) {
        java.util.Objects.requireNonNull(surface, "Parameter 'surface' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_renderer_new_for_surface.invokeExact(
                    surface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates an appropriate {@code GskRenderer} instance for the given {@code surface}.
     * <p>
     * If the {@code GSK_RENDERER} environment variable is set, GSK will
     * try that renderer first, before trying the backend-specific
     * default. The ultimate fallback is the cairo renderer.
     * <p>
     * The renderer will be realized before it is returned.
     * @param surface a {@code GdkSurface}
     * @return a {@code GskRenderer}
     */
    public static Renderer newForSurface(@NotNull org.gtk.gdk.Surface surface) {
        return new Renderer(constructNewForSurface(surface), Ownership.FULL);
    }
    
    /**
     * Retrieves the {@code GdkSurface} set using gsk_enderer_realize().
     * <p>
     * If the renderer has not been realized yet, {@code null} will be returned.
     * @return a {@code GdkSurface}
     */
    public @Nullable org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_renderer_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks whether the {@code renderer} is realized or not.
     * @return {@code true} if the {@code GskRenderer} was realized, and {@code false} otherwise
     */
    public boolean isRealized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_renderer_is_realized.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates the resources needed by the {@code renderer} to render the scene
     * graph.
     * <p>
     * Since GTK 4.6, the surface may be {@code NULL}, which allows using
     * renderers without having to create a surface.
     * <p>
     * Note that it is mandatory to call {@link Renderer#unrealize} before
     * destroying the renderer.
     * @param surface the {@code GdkSurface} renderer will be used on
     * @return Whether the renderer was successfully realized
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean realize(@Nullable org.gtk.gdk.Surface surface) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_renderer_realize.invokeExact(
                    handle(),
                    (Addressable) (surface == null ? MemoryAddress.NULL : surface.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Renders the scene graph, described by a tree of {@code GskRenderNode} instances
     * to the renderer's surface,  ensuring that the given {@code region} gets redrawn.
     * <p>
     * If the renderer has no associated surface, this function does nothing.
     * <p>
     * Renderers must ensure that changes of the contents given by the {@code root}
     * node as well as the area given by {@code region} are redrawn. They are however
     * free to not redraw any pixel outside of {@code region} if they can guarantee that
     * it didn't change.
     * <p>
     * The {@code renderer} will acquire a reference on the {@code GskRenderNode} tree while
     * the rendering is in progress.
     * @param root a {@code GskRenderNode}
     * @param region the {@code cairo_region_t} that must be redrawn or {@code null}
     *   for the whole window
     */
    public void render(@NotNull org.gtk.gsk.RenderNode root, @Nullable org.cairographics.Region region) {
        java.util.Objects.requireNonNull(root, "Parameter 'root' must not be null");
        try {
            DowncallHandles.gsk_renderer_render.invokeExact(
                    handle(),
                    root.handle(),
                    (Addressable) (region == null ? MemoryAddress.NULL : region.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Renders the scene graph, described by a tree of {@code GskRenderNode} instances,
     * to a {@code GdkTexture}.
     * <p>
     * The {@code renderer} will acquire a reference on the {@code GskRenderNode} tree while
     * the rendering is in progress.
     * <p>
     * If you want to apply any transformations to {@code root}, you should put it into a
     * transform node and pass that node instead.
     * @param root a {@code GskRenderNode}
     * @param viewport the section to draw or {@code null} to use {@code root}'s bounds
     * @return a {@code GdkTexture} with the rendered contents of {@code root}.
     */
    public @NotNull org.gtk.gdk.Texture renderTexture(@NotNull org.gtk.gsk.RenderNode root, @Nullable org.gtk.graphene.Rect viewport) {
        java.util.Objects.requireNonNull(root, "Parameter 'root' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_renderer_render_texture.invokeExact(
                    handle(),
                    root.handle(),
                    (Addressable) (viewport == null ? MemoryAddress.NULL : viewport.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Texture(RESULT, Ownership.FULL);
    }
    
    /**
     * Releases all the resources created by gsk_renderer_realize().
     */
    public void unrealize() {
        try {
            DowncallHandles.gsk_renderer_unrealize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_renderer_new_for_surface = Interop.downcallHandle(
            "gsk_renderer_new_for_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_renderer_get_surface = Interop.downcallHandle(
            "gsk_renderer_get_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_renderer_is_realized = Interop.downcallHandle(
            "gsk_renderer_is_realized",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_renderer_realize = Interop.downcallHandle(
            "gsk_renderer_realize",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_renderer_render = Interop.downcallHandle(
            "gsk_renderer_render",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_renderer_render_texture = Interop.downcallHandle(
            "gsk_renderer_render_texture",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_renderer_unrealize = Interop.downcallHandle(
            "gsk_renderer_unrealize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
