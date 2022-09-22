package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A rectangular region with rounded corners.
 * <p>
 * Application code should normalize rectangles using
 * {@link RoundedRect#normalize}; this function will ensure that
 * the bounds of the rectangle are normalized and ensure that the corner
 * values are positive and the corners do not overlap.
 * <p>
 * All functions taking a {@code GskRoundedRect} as an argument will internally
 * operate on a normalized copy; all functions returning a {@code GskRoundedRect}
 * will always return a normalized one.
 * <p>
 * The algorithm used for normalizing corner sizes is described in
 * <a href="https://drafts.csswg.org/css-backgrounds-3/#border-radius">the CSS specification</a>.
 */
public class RoundedRect extends io.github.jwharm.javagi.ResourceBase {

    public RoundedRect(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Checks if the given {@code point} is inside the rounded rectangle.
     */
    public boolean containsPoint(org.gtk.graphene.Point point) {
        var RESULT = gtk_h.gsk_rounded_rect_contains_point(handle(), point.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the given {@code rect} is contained inside the rounded rectangle.
     */
    public boolean containsRect(org.gtk.graphene.Rect rect) {
        var RESULT = gtk_h.gsk_rounded_rect_contains_rect(handle(), rect.handle());
        return (RESULT != 0);
    }
    
    /**
     * Initializes the given {@code GskRoundedRect} with the given values.
     * <p>
     * This function will implicitly normalize the {@code GskRoundedRect}
     * before returning.
     */
    public RoundedRect init(org.gtk.graphene.Rect bounds, org.gtk.graphene.Size topLeft, org.gtk.graphene.Size topRight, org.gtk.graphene.Size bottomRight, org.gtk.graphene.Size bottomLeft) {
        var RESULT = gtk_h.gsk_rounded_rect_init(handle(), bounds.handle(), topLeft.handle(), topRight.handle(), bottomRight.handle(), bottomLeft.handle());
        return new RoundedRect(References.get(RESULT, false));
    }
    
    /**
     * Initializes {@code self} using the given {@code src} rectangle.
     * <p>
     * This function will not normalize the {@code GskRoundedRect},
     * so make sure the source is normalized.
     */
    public RoundedRect initCopy(RoundedRect src) {
        var RESULT = gtk_h.gsk_rounded_rect_init_copy(handle(), src.handle());
        return new RoundedRect(References.get(RESULT, false));
    }
    
    /**
     * Initializes {@code self} to the given {@code bounds} and sets the radius
     * of all four corners to {@code radius}.
     */
    public RoundedRect initFromRect(org.gtk.graphene.Rect bounds, float radius) {
        var RESULT = gtk_h.gsk_rounded_rect_init_from_rect(handle(), bounds.handle(), radius);
        return new RoundedRect(References.get(RESULT, false));
    }
    
    /**
     * Checks if part of the given {@code rect} is contained inside the rounded rectangle.
     */
    public boolean intersectsRect(org.gtk.graphene.Rect rect) {
        var RESULT = gtk_h.gsk_rounded_rect_intersects_rect(handle(), rect.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if all corners of {@code self} are right angles and the
     * rectangle covers all of its bounds.
     * <p>
     * This information can be used to decide if {@link ClipNode#ClipNode}
     * or {@link RoundedClipNode#RoundedClipNode} should be called.
     */
    public boolean isRectilinear() {
        var RESULT = gtk_h.gsk_rounded_rect_is_rectilinear(handle());
        return (RESULT != 0);
    }
    
    /**
     * Normalizes the passed rectangle.
     * <p>
     * This function will ensure that the bounds of the rectangle
     * are normalized and ensure that the corner values are positive
     * and the corners do not overlap.
     */
    public RoundedRect normalize() {
        var RESULT = gtk_h.gsk_rounded_rect_normalize(handle());
        return new RoundedRect(References.get(RESULT, false));
    }
    
    /**
     * Offsets the bound's origin by {@code dx} and {@code dy}.
     * <p>
     * The size and corners of the rectangle are unchanged.
     */
    public RoundedRect offset(float dx, float dy) {
        var RESULT = gtk_h.gsk_rounded_rect_offset(handle(), dx, dy);
        return new RoundedRect(References.get(RESULT, false));
    }
    
    /**
     * Shrinks (or grows) the given rectangle by moving the 4 sides
     * according to the offsets given.
     * <p>
     * The corner radii will be changed in a way that tries to keep
     * the center of the corner circle intact. This emulates CSS behavior.
     * <p>
     * This function also works for growing rectangles if you pass
     * negative values for the {@code top}, {@code right}, {@code bottom} or {@code left}.
     */
    public RoundedRect shrink(float top, float right, float bottom, float left) {
        var RESULT = gtk_h.gsk_rounded_rect_shrink(handle(), top, right, bottom, left);
        return new RoundedRect(References.get(RESULT, false));
    }
    
}
