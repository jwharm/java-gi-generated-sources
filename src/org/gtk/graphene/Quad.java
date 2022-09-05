package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A 4 vertex quadrilateral, as represented by four #graphene_point_t.
 * 
 * The contents of a #graphene_quad_t are private and should never be
 * accessed directly.
 */
public class Quad extends io.github.jwharm.javagi.interop.ResourceBase {

    public Quad(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Allocates a new #graphene_quad_t instance.
     * 
     * The contents of the returned instance are undefined.
     */
    public Quad() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quad_alloc(), true));
    }
    
    /**
     * Computes the bounding rectangle of @q and places it into @r.
     */
    public void bounds(Rect r) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quad_bounds(HANDLE(), r.HANDLE());
    }
    
    /**
     * Checks if the given #graphene_quad_t contains the given #graphene_point_t.
     */
    public boolean contains(Point p) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quad_contains(HANDLE(), p.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_quad_alloc()
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quad_free(HANDLE());
    }
    
    /**
     * Retrieves the point of a #graphene_quad_t at the given index.
     */
    public Point getPoint(int index) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quad_get_point(HANDLE(), index);
        return new Point(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quad_t with the given points.
     */
    public Quad init(Point p1, Point p2, Point p3, Point p4) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quad_init(HANDLE(), p1.HANDLE(), p2.HANDLE(), p3.HANDLE(), p4.HANDLE());
        return new Quad(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quad_t using an array of points.
     */
    public Quad initFromPoints(Point[] points) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quad_init_from_points(HANDLE(), Interop.allocateNativeArray(points));
        return new Quad(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quad_t using the four corners of the
     * given #graphene_rect_t.
     */
    public Quad initFromRect(Rect r) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quad_init_from_rect(HANDLE(), r.HANDLE());
        return new Quad(ProxyFactory.getProxy(RESULT, false));
    }
    
}
