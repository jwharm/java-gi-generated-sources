package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A rectangular region with rounded corners.
 * 
 * Application code should normalize rectangles using
 * [method@Gsk.RoundedRect.normalize]; this function will ensure that
 * the bounds of the rectangle are normalized and ensure that the corner
 * values are positive and the corners do not overlap.
 * 
 * All functions taking a `GskRoundedRect` as an argument will internally
 * operate on a normalized copy; all functions returning a `GskRoundedRect`
 * will always return a normalized one.
 * 
 * The algorithm used for normalizing corner sizes is described in
 * [the CSS specification](https://drafts.csswg.org/css-backgrounds-3/#border-radius).
 */
public class RoundedRect extends io.github.jwharm.javagi.interop.ResourceBase {

    public RoundedRect(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Checks if the given @point is inside the rounded rectangle.
     */
    public boolean containsPoint(org.gtk.graphene.Point point) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_contains_point(HANDLE(), point.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the given @rect is contained inside the rounded rectangle.
     */
    public boolean containsRect(org.gtk.graphene.Rect rect) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_contains_rect(HANDLE(), rect.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Initializes the given `GskRoundedRect` with the given values.
     * 
     * This function will implicitly normalize the `GskRoundedRect`
     * before returning.
     */
    public RoundedRect init(org.gtk.graphene.Rect bounds, org.gtk.graphene.Size topLeft, org.gtk.graphene.Size topRight, org.gtk.graphene.Size bottomRight, org.gtk.graphene.Size bottomLeft) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_init(HANDLE(), bounds.HANDLE(), topLeft.HANDLE(), topRight.HANDLE(), bottomRight.HANDLE(), bottomLeft.HANDLE());
        return new RoundedRect(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes @self using the given @src rectangle.
     * 
     * This function will not normalize the `GskRoundedRect`,
     * so make sure the source is normalized.
     */
    public RoundedRect initCopy(RoundedRect src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_init_copy(HANDLE(), src.HANDLE());
        return new RoundedRect(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes @self to the given @bounds and sets the radius
     * of all four corners to @radius.
     */
    public RoundedRect initFromRect(org.gtk.graphene.Rect bounds, float radius) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_init_from_rect(HANDLE(), bounds.HANDLE(), radius);
        return new RoundedRect(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Checks if part of the given @rect is contained inside the rounded rectangle.
     */
    public boolean intersectsRect(org.gtk.graphene.Rect rect) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_intersects_rect(HANDLE(), rect.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if all corners of @self are right angles and the
     * rectangle covers all of its bounds.
     * 
     * This information can be used to decide if [ctor@Gsk.ClipNode.new]
     * or [ctor@Gsk.RoundedClipNode.new] should be called.
     */
    public boolean isRectilinear() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_is_rectilinear(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Normalizes the passed rectangle.
     * 
     * This function will ensure that the bounds of the rectangle
     * are normalized and ensure that the corner values are positive
     * and the corners do not overlap.
     */
    public RoundedRect normalize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_normalize(HANDLE());
        return new RoundedRect(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Offsets the bound's origin by @dx and @dy.
     * 
     * The size and corners of the rectangle are unchanged.
     */
    public RoundedRect offset(float dx, float dy) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_offset(HANDLE(), dx, dy);
        return new RoundedRect(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Shrinks (or grows) the given rectangle by moving the 4 sides
     * according to the offsets given.
     * 
     * The corner radii will be changed in a way that tries to keep
     * the center of the corner circle intact. This emulates CSS behavior.
     * 
     * This function also works for growing rectangles if you pass
     * negative values for the @top, @right, @bottom or @left.
     */
    public RoundedRect shrink(float top, float right, float bottom, float left) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_rect_shrink(HANDLE(), top, right, bottom, left);
        return new RoundedRect(ProxyFactory.get(RESULT, false));
    }
    
}
