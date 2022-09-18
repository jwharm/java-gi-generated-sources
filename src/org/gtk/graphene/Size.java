package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A size.
 */
public class Size extends io.github.jwharm.javagi.ResourceBase {

    public Size(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_size_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link org.gtk.graphene.Size} 
     * 
     * The contents of the returned value are undefined.
     */
    public static Size alloc() {
        return new Size(constructAlloc());
    }
    
    /**
     * Checks whether the two give {@link org.gtk.graphene.Size} are equal.
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
     * Initializes a {@link org.gtk.graphene.Size} using the given @width and @height.
     */
    public Size init(float width, float height) {
        var RESULT = gtk_h.graphene_size_init(handle(), width, height);
        return new Size(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Size} using the width and height of
     * the given @src.
     */
    public Size initFromSize(Size src) {
        var RESULT = gtk_h.graphene_size_init_from_size(handle(), src.handle());
        return new Size(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates the two given {@link org.gtk.graphene.Size} using the given
     * interpolation @factor.
     */
    public void interpolate(Size b, double factor, Size res) {
        gtk_h.graphene_size_interpolate(handle(), b.handle(), factor, res.handle());
    }
    
    /**
     * Scales the components of a {@link org.gtk.graphene.Size} using the given @factor.
     */
    public void scale(float factor, Size res) {
        gtk_h.graphene_size_scale(handle(), factor, res.handle());
    }
    
    /**
     * A constant pointer to a zero {@link org.gtk.graphene.Size}  useful for
     * equality checks and interpolations.
     */
    public static Size zero() {
        var RESULT = gtk_h.graphene_size_zero();
        return new Size(References.get(RESULT, false));
    }
    
}
