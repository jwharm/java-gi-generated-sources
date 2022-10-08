package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GskRenderer} is a class that renders a scene graph defined via a
 * tree of {@link RenderNode} instances.
 * <p>
 * Typically you will use a {@code GskRenderer} instance to repeatedly call
 * {@link Renderer#render} to update the contents of its associated
 * {@link org.gtk.gdk.Surface}.
 * <p>
 * It is necessary to realize a {@code GskRenderer} instance using
 * {@code Gsk.Renderer.render},
 * in order to create the appropriate windowing system resources needed
 * to render the scene.
 */
public class Renderer extends org.gtk.gobject.Object {

    public Renderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Renderer */
    public static Renderer castFrom(org.gtk.gobject.Object gobject) {
        return new Renderer(gobject.refcounted());
    }
    
    static final MethodHandle gsk_renderer_new_for_surface = Interop.downcallHandle(
        "gsk_renderer_new_for_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForSurface(org.gtk.gdk.Surface surface) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_renderer_new_for_surface.invokeExact(surface.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates an appropriate {@code GskRenderer} instance for the given {@code surface}.
     * <p>
     * If the {@code GSK_RENDERER} environment variable is set, GSK will
     * try that renderer first, before trying the backend-specific
     * default. The ultimate fallback is the cairo renderer.
     * <p>
     * The renderer will be realized before it is returned.
     */
    public static Renderer newForSurface(org.gtk.gdk.Surface surface) {
        return new Renderer(constructNewForSurface(surface));
    }
    
    static final MethodHandle gsk_renderer_get_surface = Interop.downcallHandle(
        "gsk_renderer_get_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GdkSurface} set using gsk_enderer_realize().
     * <p>
     * If the renderer has not been realized yet, {@code null} will be returned.
     */
    public org.gtk.gdk.Surface getSurface() {
        try {
            var RESULT = (MemoryAddress) gsk_renderer_get_surface.invokeExact(handle());
            return new org.gtk.gdk.Surface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_renderer_is_realized = Interop.downcallHandle(
        "gsk_renderer_is_realized",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the {@code renderer} is realized or not.
     */
    public boolean isRealized() {
        try {
            var RESULT = (int) gsk_renderer_is_realized.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_renderer_realize = Interop.downcallHandle(
        "gsk_renderer_realize",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates the resources needed by the {@code renderer} to render the scene
     * graph.
     * <p>
     * Since GTK 4.6, the surface may be {@code NULL}, which allows using
     * renderers without having to create a surface.
     * <p>
     * Note that it is mandatory to call {@link Renderer#unrealize} before
     * destroying the renderer.
     */
    public boolean realize(org.gtk.gdk.Surface surface) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gsk_renderer_realize.invokeExact(handle(), surface.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_renderer_render = Interop.downcallHandle(
        "gsk_renderer_render",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void render(RenderNode root, org.cairographics.Region region) {
        try {
            gsk_renderer_render.invokeExact(handle(), root.handle(), region.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_renderer_render_texture = Interop.downcallHandle(
        "gsk_renderer_render_texture",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Renders the scene graph, described by a tree of {@code GskRenderNode} instances,
     * to a {@code GdkTexture}.
     * <p>
     * The {@code renderer} will acquire a reference on the {@code GskRenderNode} tree while
     * the rendering is in progress.
     * <p>
     * If you want to apply any transformations to {@code root}, you should put it into a
     * transform node and pass that node instead.
     */
    public org.gtk.gdk.Texture renderTexture(RenderNode root, org.gtk.graphene.Rect viewport) {
        try {
            var RESULT = (MemoryAddress) gsk_renderer_render_texture.invokeExact(handle(), root.handle(), viewport.handle());
            return new org.gtk.gdk.Texture(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_renderer_unrealize = Interop.downcallHandle(
        "gsk_renderer_unrealize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases all the resources created by gsk_renderer_realize().
     */
    public void unrealize() {
        try {
            gsk_renderer_unrealize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
