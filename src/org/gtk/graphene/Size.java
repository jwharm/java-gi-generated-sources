package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A size.
 */
public class Size extends io.github.jwharm.javagi.interop.ResourceBase {

    public Size(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Allocates a new #graphene_size_t.
     * 
     * The contents of the returned value are undefined.
     */
    public Size() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_size_alloc(), true));
    }
    
    /**
     * Checks whether the two give #graphene_size_t are equal.
     */
    public boolean equal(Size b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_size_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_size_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_size_free(HANDLE());
    }
    
    /**
     * Initializes a #graphene_size_t using the given @width and @height.
     */
    public Size init(float width, float height) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_size_init(HANDLE(), width, height);
        return new Size(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_size_t using the width and height of
     * the given @src.
     */
    public Size initFromSize(Size src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_size_init_from_size(HANDLE(), src.HANDLE());
        return new Size(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Linearly interpolates the two given #graphene_size_t using the given
     * interpolation @factor.
     */
    public void interpolate(Size b, double factor, Size res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_size_interpolate(HANDLE(), b.HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Scales the components of a #graphene_size_t using the given @factor.
     */
    public void scale(float factor, Size res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_size_scale(HANDLE(), factor, res.HANDLE());
    }
    
}
