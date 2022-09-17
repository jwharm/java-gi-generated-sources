package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A rectangular region with rounded corners.
 * <p>
 * Application code should normalize rectangles using
 * {@link org.gtk.gsk.RoundedRect#normalize}; this function will ensure that
 * the bounds of the rectangle are normalized and ensure that the corner
 * values are positive and the corners do not overlap.
 * <p>
 * All functions taking a <code>GskRoundedRect</code> as an argument will internally
 * operate on a normalized copy; all functions returning a <code>GskRoundedRect</code>
 * will always return a normalized one.
 * 
 * The algorithm used for normalizing corner sizes is described in
 * {@link [the CSS specification]}(https://drafts.csswg.org/css-backgrounds-3/#border-radius).
 */
public class RoundedRect extends io.github.jwharm.javagi.ResourceBase {

    public RoundedRect(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Checks if the given @point is inside the rounded rectangle.
     */
    public boolean containsPoint(org.gtk.graphene.Point point) {
        var RESULT = gtk_h.gsk_rounded_rect_contains_point(handle(), point.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the given @rect is contained inside the rounded rectangle.
     */
    public boolean containsRect(org.gtk.graphene.Rect rect) {
        var RESULT = gtk_h.gsk_rounded_rect_contains_rect(handle(), rect.handle());
        return (RESULT != 0);
    }
    
    /**
     * Initializes the given <code>GskRoundedRect</code> with the given values.
     * <p>
     * This function will implicitly normalize the <code>GskRoundedRect</code>
     * before returning.
     */
    public RoundedRect init(org.gtk.graphene.Rect bounds, org.gtk.graphene.Size topLeft, org.gtk.graphene.Size topRight, org.gtk.graphene.Size bottomRight, org.gtk.graphene.Size bottomLeft) {
        var RESULT = gtk_h.gsk_rounded_rect_init(handle(), bounds.handle(), topLeft.handle(), topRight.handle(), bottomRight.handle(), bottomLeft.handle());
        return new RoundedRect(References.get(RESULT, false));
    }
    
    /**
     * Initializes @self using the given @src rectangle.
     * <p>
     * This function will not normalize the <code>GskRoundedRect</code>,
     * so make sure the source is normalized.
     */
    public RoundedRect initCopy(RoundedRect src) {
        var RESULT = gtk_h.gsk_rounded_rect_init_copy(handle(), src.handle());
        return new RoundedRect(References.get(RESULT, false));
    }
    
    /**
     * Initializes @self to the given @bounds and sets the radius
     * of all four corners to @radius.
     */
    public RoundedRect initFromRect(org.gtk.graphene.Rect bounds, float radius) {
        var RESULT = gtk_h.gsk_rounded_rect_init_from_rect(handle(), bounds.handle(), radius);
        return new RoundedRect(References.get(RESULT, false));
    }
    
    /**
     * Checks if part of the given @rect is contained inside the rounded rectangle.
     */
    public boolean intersectsRect(org.gtk.graphene.Rect rect) {
        var RESULT = gtk_h.gsk_rounded_rect_intersects_rect(handle(), rect.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if all corners of @self are right angles and the
     * rectangle covers all of its bounds.
     * 
     * This information can be used to decide if {@link [ctor@Gsk.ClipNode.new] (ref=ctor)}
     * or {@link [ctor@Gsk.RoundedClipNode.new] (ref=ctor)} should be called.
     */
    public boolean isRectilinear() {
        var RESULT = gtk_h.gsk_rounded_rect_is_rectilinear(handle());
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
        var RESULT = gtk_h.gsk_rounded_rect_normalize(handle());
        return new RoundedRect(References.get(RESULT, false));
    }
    
    /**
     * Offsets the bound&#39;s origin by @dx and @dy.
     * 
     * The size and corners of the rectangle are unchanged.
     */
    public RoundedRect offset(float dx, float dy) {
        var RESULT = gtk_h.gsk_rounded_rect_offset(handle(), dx, dy);
        return new RoundedRect(References.get(RESULT, false));
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
        var RESULT = gtk_h.gsk_rounded_rect_shrink(handle(), top, right, bottom, left);
        return new RoundedRect(References.get(RESULT, false));
    }
    
}
