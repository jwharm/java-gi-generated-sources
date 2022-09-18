package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GskRenderer</code> is a class that renders a scene graph defined via a
 * tree of {@link org.gtk.gsk.RenderNode} instances.
 * <p>
 * Typically you will use a <code>GskRenderer</code> instance to repeatedly call
 * {@link org.gtk.gsk.Renderer<code>#render</code>  to update the contents of its associated
 * {@link org.gtk.gdk.Surface}.
 * <p>
 * It is necessary to realize a <code>GskRenderer</code> instance using
 * {@link org.gtk.gsk.Renderer<code>#realize</code>  before calling {@link org.gtk.gsk.Renderer<code>#render</code> ,
 * in order to create the appropriate windowing system resources needed
 * to render the scene.
 */
public class Renderer extends org.gtk.gobject.Object {

    public Renderer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Renderer */
    public static Renderer castFrom(org.gtk.gobject.Object gobject) {
        return new Renderer(gobject.getReference());
    }
    
    private static Reference constructNewForSurface(org.gtk.gdk.Surface surface) {
        Reference RESULT = References.get(gtk_h.gsk_renderer_new_for_surface(surface.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates an appropriate <code>GskRenderer</code> instance for the given @surface.
     * <p>
     * If the <code>GSK_RENDERER</code> environment variable is set, GSK will
     * try that renderer first, before trying the backend-specific
     * default. The ultimate fallback is the cairo renderer.
     * 
     * The renderer will be realized before it is returned.
     */
    public static Renderer newForSurface(org.gtk.gdk.Surface surface) {
        return new Renderer(constructNewForSurface(surface));
    }
    
    /**
     * Retrieves the <code>GdkSurface</code> set using gsk_enderer_realize().
     * 
     * If the renderer has not been realized yet, <code>null</code> will be returned.
     */
    public org.gtk.gdk.Surface getSurface() {
        var RESULT = gtk_h.gsk_renderer_get_surface(handle());
        return new org.gtk.gdk.Surface(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the @renderer is realized or not.
     */
    public boolean isRealized() {
        var RESULT = gtk_h.gsk_renderer_is_realized(handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates the resources needed by the @renderer to render the scene
     * graph.
     * <p>
     * Since GTK 4.6, the surface may be <code>NULL</code>, which allows using
     * renderers without having to create a surface.
     * 
     * Note that it is mandatory to call {@link org.gtk.gsk.Renderer<code>#unrealize</code>  before
     * destroying the renderer.
     */
    public boolean realize(org.gtk.gdk.Surface surface) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gsk_renderer_realize(handle(), surface.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Renders the scene graph, described by a tree of <code>GskRenderNode</code> instances
     * to the renderer&<code>#39</code> s surface,  ensuring that the given @region gets redrawn.
     * <p>
     * If the renderer has no associated surface, this function does nothing.
     * <p>
     * Renderers must ensure that changes of the contents given by the @root
     * node as well as the area given by @region are redrawn. They are however
     * free to not redraw any pixel outside of @region if they can guarantee that
     * it didn&<code>#39</code> t change.
     * <p>
     * The @renderer will acquire a reference on the <code>GskRenderNode</code> tree while
     * the rendering is in progress.
     */
    public void render(RenderNode root, org.cairographics.Region region) {
        gtk_h.gsk_renderer_render(handle(), root.handle(), region.handle());
    }
    
    /**
     * Renders the scene graph, described by a tree of <code>GskRenderNode</code> instances,
     * to a <code>GdkTexture</code>.
     * <p>
     * The @renderer will acquire a reference on the <code>GskRenderNode</code> tree while
     * the rendering is in progress.
     * 
     * If you want to apply any transformations to @root, you should put it into a
     * transform node and pass that node instead.
     */
    public org.gtk.gdk.Texture renderTexture(RenderNode root, org.gtk.graphene.Rect viewport) {
        var RESULT = gtk_h.gsk_renderer_render_texture(handle(), root.handle(), viewport.handle());
        return new org.gtk.gdk.Texture(References.get(RESULT, true));
    }
    
    /**
     * Releases all the resources created by gsk_renderer_realize().
     */
    public void unrealize() {
        gtk_h.gsk_renderer_unrealize(handle());
    }
    
}
