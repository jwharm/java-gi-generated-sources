package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque object representing an iterator which points to a
 * certain position in an animation.
 */
public class PixbufAnimationIter extends org.gtk.gobject.Object {

    public PixbufAnimationIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PixbufAnimationIter */
    public static PixbufAnimationIter castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufAnimationIter(gobject.getReference());
    }
    
    /**
     * Possibly advances an animation to a new frame.
     * 
     * Chooses the frame based on the start time passed to
     * gdk_pixbuf_animation_get_iter().
     * 
     * @current_time would normally come from g_get_current_time(), and
     * must be greater than or equal to the time passed to
     * gdk_pixbuf_animation_get_iter(), and must increase or remain
     * unchanged each time gdk_pixbuf_animation_iter_get_pixbuf() is
     * called. That is, you can't go backward in time; animations only
     * play forward.
     * 
     * As a shortcut, pass `NULL` for the current time and g_get_current_time()
     * will be invoked on your behalf. So you only need to explicitly pass
     * @current_time if you're doing something odd like playing the animation
     * at double speed.
     * 
     * If this function returns `FALSE`, there's no need to update the animation
     * display, assuming the display had been rendered prior to advancing;
     * if `TRUE`, you need to call gdk_pixbuf_animation_iter_get_pixbuf()
     * and update the display with the new pixbuf.
     */
    public boolean advance(org.gtk.glib.TimeVal currentTime) {
        var RESULT = gtk_h.gdk_pixbuf_animation_iter_advance(handle(), currentTime.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the number of milliseconds the current pixbuf should be displayed,
     * or -1 if the current pixbuf should be displayed forever.
     * 
     * The `g_timeout_add()` function conveniently takes a timeout in milliseconds,
     * so you can use a timeout to schedule the next update.
     * 
     * Note that some formats, like GIF, might clamp the timeout values in the
     * image file to avoid updates that are just too quick. The minimum timeout
     * for GIF images is currently 20 milliseconds.
     */
    public int getDelayTime() {
        var RESULT = gtk_h.gdk_pixbuf_animation_iter_get_delay_time(handle());
        return RESULT;
    }
    
    /**
     * Gets the current pixbuf which should be displayed.
     * 
     * The pixbuf might not be the same size as the animation itself
     * (gdk_pixbuf_animation_get_width(), gdk_pixbuf_animation_get_height()).
     * 
     * This pixbuf should be displayed for gdk_pixbuf_animation_iter_get_delay_time()
     * milliseconds.
     * 
     * The caller of this function does not own a reference to the returned
     * pixbuf; the returned pixbuf will become invalid when the iterator
     * advances to the next frame, which may happen anytime you call
     * gdk_pixbuf_animation_iter_advance().
     * 
     * Copy the pixbuf to keep it (don't just add a reference), as it may get
     * recycled as you advance the iterator.
     */
    public Pixbuf getPixbuf() {
        var RESULT = gtk_h.gdk_pixbuf_animation_iter_get_pixbuf(handle());
        return new Pixbuf(References.get(RESULT, false));
    }
    
    /**
     * Used to determine how to respond to the area_updated signal on
     * #GdkPixbufLoader when loading an animation.
     * 
     * The `::area_updated` signal is emitted for an area of the frame currently
     * streaming in to the loader. So if you're on the currently loading frame,
     * you will need to redraw the screen for the updated area.
     */
    public boolean onCurrentlyLoadingFrame() {
        var RESULT = gtk_h.gdk_pixbuf_animation_iter_on_currently_loading_frame(handle());
        return (RESULT != 0);
    }
    
}
