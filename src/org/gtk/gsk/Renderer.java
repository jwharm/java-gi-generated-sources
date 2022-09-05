package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GskRenderer` is a class that renders a scene graph defined via a
 * tree of [class@Gsk.RenderNode] instances.
 * 
 * Typically you will use a `GskRenderer` instance to repeatedly call
 * [method@Gsk.Renderer.render] to update the contents of its associated
 * [class@Gdk.Surface].
 * 
 * It is necessary to realize a `GskRenderer` instance using
 * [method@Gsk.Renderer.realize] before calling [method@Gsk.Renderer.render],
 * in order to create the appropriate windowing system resources needed
 * to render the scene.
 */
public class Renderer extends org.gtk.gobject.Object {

    public Renderer(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Renderer */
    public static Renderer castFrom(org.gtk.gobject.Object gobject) {
        return new Renderer(gobject.getProxy());
    }
    
    /**
     * Creates an appropriate `GskRenderer` instance for the given @surface.
     * 
     * If the `GSK_RENDERER` environment variable is set, GSK will
     * try that renderer first, before trying the backend-specific
     * default. The ultimate fallback is the cairo renderer.
     * 
     * The renderer will be realized before it is returned.
     */
    public Renderer(org.gtk.gdk.Surface surface) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_renderer_new_for_surface(surface.HANDLE()), true));
    }
    
    /**
     * Retrieves the `GdkSurface` set using gsk_enderer_realize().
     * 
     * If the renderer has not been realized yet, %NULL will be returned.
     */
    public org.gtk.gdk.Surface getSurface() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_renderer_get_surface(HANDLE());
        return new org.gtk.gdk.Surface(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Checks whether the @renderer is realized or not.
     */
    public boolean isRealized() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_renderer_is_realized(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Creates the resources needed by the @renderer to render the scene
     * graph.
     * 
     * Since GTK 4.6, the surface may be `NULL`, which allows using
     * renderers without having to create a surface.
     * 
     * Note that it is mandatory to call [method@Gsk.Renderer.unrealize] before
     * destroying the renderer.
     */
    public boolean realize(org.gtk.gdk.Surface surface) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_renderer_realize(HANDLE(), surface.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Renders the scene graph, described by a tree of `GskRenderNode` instances
     * to the renderer's surface,  ensuring that the given @region gets redrawn.
     * 
     * If the renderer has no associated surface, this function does nothing.
     * 
     * Renderers must ensure that changes of the contents given by the @root
     * node as well as the area given by @region are redrawn. They are however
     * free to not redraw any pixel outside of @region if they can guarantee that
     * it didn't change.
     * 
     * The @renderer will acquire a reference on the `GskRenderNode` tree while
     * the rendering is in progress.
     */
    public void render(RenderNode root, org.cairographics.Region region) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_renderer_render(HANDLE(), root.HANDLE(), region.HANDLE());
    }
    
    /**
     * Renders the scene graph, described by a tree of `GskRenderNode` instances,
     * to a `GdkTexture`.
     * 
     * The @renderer will acquire a reference on the `GskRenderNode` tree while
     * the rendering is in progress.
     * 
     * If you want to apply any transformations to @root, you should put it into a
     * transform node and pass that node instead.
     */
    public org.gtk.gdk.Texture renderTexture(RenderNode root, org.gtk.graphene.Rect viewport) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_renderer_render_texture(HANDLE(), root.HANDLE(), viewport.HANDLE());
        return new org.gtk.gdk.Texture(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Releases all the resources created by gsk_renderer_realize().
     */
    public void unrealize() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_renderer_unrealize(HANDLE());
    }
    
}
