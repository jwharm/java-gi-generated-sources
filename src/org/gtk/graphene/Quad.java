package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A 4 vertex quadrilateral, as represented by four {@link org.gtk.graphene.Point} 
 * 
 * The contents of a {@link org.gtk.graphene.Quad} are private and should never be
 * accessed directly.
 */
public class Quad extends io.github.jwharm.javagi.ResourceBase {

    public Quad(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_quad_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link org.gtk.graphene.Quad} instance.
     * 
     * The contents of the returned instance are undefined.
     */
    public static Quad alloc() {
        return new Quad(constructAlloc());
    }
    
    /**
     * Computes the bounding rectangle of @q and places it into @r.
     */
    public void bounds(Rect r) {
        gtk_h.graphene_quad_bounds(handle(), r.handle());
    }
    
    /**
     * Checks if the given {@link org.gtk.graphene.Quad} contains the given {@link org.gtk.graphene.Point}
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
     * Retrieves the point of a {@link org.gtk.graphene.Quad} at the given index.
     */
    public Point getPoint(int index) {
        var RESULT = gtk_h.graphene_quad_get_point(handle(), index);
        return new Point(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quad} with the given points.
     */
    public Quad init(Point p1, Point p2, Point p3, Point p4) {
        var RESULT = gtk_h.graphene_quad_init(handle(), p1.handle(), p2.handle(), p3.handle(), p4.handle());
        return new Quad(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quad} using an array of points.
     */
    public Quad initFromPoints(Point[] points) {
        var RESULT = gtk_h.graphene_quad_init_from_points(handle(), Interop.allocateNativeArray(points).handle());
        return new Quad(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quad} using the four corners of the
     * given {@link org.gtk.graphene.Rect}
     */
    public Quad initFromRect(Rect r) {
        var RESULT = gtk_h.graphene_quad_init_from_rect(handle(), r.handle());
        return new Quad(References.get(RESULT, false));
    }
    
}
