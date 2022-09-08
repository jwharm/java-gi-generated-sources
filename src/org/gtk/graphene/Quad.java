package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public Quad(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new #graphene_quad_t instance.
     * 
     * The contents of the returned instance are undefined.
     */
    public Quad() {
        super(References.get(gtk_h.graphene_quad_alloc(), true));
    }
    
    /**
     * Computes the bounding rectangle of @q and places it into @r.
     */
    public void bounds(Rect r) {
        gtk_h.graphene_quad_bounds(handle(), r.handle());
    }
    
    /**
     * Checks if the given #graphene_quad_t contains the given #graphene_point_t.
     */
    public boolean contains(Point p) {
        var RESULT = gtk_h.graphene_quad_contains(handle(), p.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_quad_alloc()
     */
    public void free() {
        gtk_h.graphene_quad_free(handle());
    }
    
    /**
     * Retrieves the point of a #graphene_quad_t at the given index.
     */
    public Point getPoint(int index) {
        var RESULT = gtk_h.graphene_quad_get_point(handle(), index);
        return new Point(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quad_t with the given points.
     */
    public Quad init(Point p1, Point p2, Point p3, Point p4) {
        var RESULT = gtk_h.graphene_quad_init(handle(), p1.handle(), p2.handle(), p3.handle(), p4.handle());
        return new Quad(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quad_t using an array of points.
     */
    public Quad initFromPoints(Point[] points) {
        var RESULT = gtk_h.graphene_quad_init_from_points(handle(), Interop.allocateNativeArray(points));
        return new Quad(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quad_t using the four corners of the
     * given #graphene_rect_t.
     */
    public Quad initFromRect(Rect r) {
        var RESULT = gtk_h.graphene_quad_init_from_rect(handle(), r.handle());
        return new Quad(References.get(RESULT, false));
    }
    
}
