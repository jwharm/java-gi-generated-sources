package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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
    
    /**
     * Retrieves the {@code GdkSurface} set using gsk_enderer_realize().
     * <p>
     * If the renderer has not been realized yet, <code>null</code> will be returned.
     */
    public org.gtk.gdk.Surface getSurface() {
        var RESULT = gtk_h.gsk_renderer_get_surface(handle());
        return new org.gtk.gdk.Surface(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the {@code renderer} is realized or not.
     */
    public boolean isRealized() {
        var RESULT = gtk_h.gsk_renderer_is_realized(handle());
        return (RESULT != 0);
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
        gtk_h.gsk_renderer_render(handle(), root.handle(), region.handle());
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
