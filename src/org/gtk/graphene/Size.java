package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A size.
 */
public class Size extends io.github.jwharm.javagi.interop.ResourceBase {

    public Size(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new #graphene_size_t.
     * 
     * The contents of the returned value are undefined.
     */
    public static Size alloc() {
        return new Size(References.get(gtk_h.graphene_size_alloc(), true));
    }
    
    /**
     * Checks whether the two give #graphene_size_t are equal.
     */
    public boolean equal(Size b) {
        var RESULT = gtk_h.graphene_size_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_size_alloc().
     */
    public void free() {
        gtk_h.graphene_size_free(handle());
    }
    
    /**
     * Initializes a #graphene_size_t using the given @width and @height.
     */
    public Size init(float width, float height) {
        var RESULT = gtk_h.graphene_size_init(handle(), width, height);
        return new Size(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_size_t using the width and height of
     * the given @src.
     */
    public Size initFromSize(Size src) {
        var RESULT = gtk_h.graphene_size_init_from_size(handle(), src.handle());
        return new Size(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates the two given #graphene_size_t using the given
     * interpolation @factor.
     */
    public void interpolate(Size b, double factor, Size res) {
        gtk_h.graphene_size_interpolate(handle(), b.handle(), factor, res.handle());
    }
    
    /**
     * Scales the components of a #graphene_size_t using the given @factor.
     */
    public void scale(float factor, Size res) {
        gtk_h.graphene_size_scale(handle(), factor, res.handle());
    }
    
    /**
     * A constant pointer to a zero #graphene_size_t, useful for
     * equality checks and interpolations.
     */
    public static Size zero() {
        var RESULT = gtk_h.graphene_size_zero();
        return new Size(References.get(RESULT, false));
    }
    
}
