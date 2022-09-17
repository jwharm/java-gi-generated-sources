package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkTextMark</code> is a position in a <code>GtkTextbuffer</code> that is preserved
 * across modifications.
 * <p>
 * You may wish to begin by reading the
 * {@link [text widget conceptual overview]}(section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * <p>
 * A <code>GtkTextMark</code> is like a bookmark in a text buffer; it preserves
 * a position in the text. You can convert the mark to an iterator using
 * {@link org.gtk.gtk.TextBuffer#getIterAtMark}. Unlike iterators, marks remain
 * valid across buffer mutations, because their behavior is defined when
 * text is inserted or deleted. When text containing a mark is deleted,
 * the mark remains in the position originally occupied by the deleted
 * text. When text is inserted at a mark, a mark with &#8220;left gravity&#8221; will
 * be moved to the beginning of the newly-inserted text, and a mark with
 * &#8220;right gravity&#8221; will be moved to the end.
 * <p>
 * Note that &#8220;left&#8221; and &#8220;right&#8221; here refer to logical direction (left
 * is the toward the start of the buffer); in some languages such as
 * Hebrew the logically-leftmost text is not actually on the left when
 * displayed.
 * <p>
 * Marks are reference counted, but the reference count only controls
 * the validity of the memory; marks can be deleted from the buffer at
 * any time with {@link org.gtk.gtk.TextBuffer#deleteMark}. Once deleted from
 * the buffer, a mark is essentially useless.
 * <p>
 * Marks optionally have names; these can be convenient to avoid passing
 * the <code>GtkTextMark</code> object around.
 * 
 * Marks are typically created using the {@link org.gtk.gtk.TextBuffer#createMark}
 * function.
 */
public class TextMark extends org.gtk.gobject.Object {

    public TextMark(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextMark */
    public static TextMark castFrom(org.gtk.gobject.Object gobject) {
        return new TextMark(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String name, boolean leftGravity) {
        Reference RESULT = References.get(gtk_h.gtk_text_mark_new(Interop.allocateNativeString(name).handle(), leftGravity ? 1 : 0), true);
        return RESULT;
    }
    
    /**
     * Creates a text mark.
     * 
     * Add it to a buffer using {@link org.gtk.gtk.TextBuffer#addMark}.
     * If @name is <code>NULL,</code> the mark is anonymous; otherwise, the mark can be
     * retrieved by name using {@link org.gtk.gtk.TextBuffer#getMark}. If a mark
     * has left gravity, and text is inserted at the mark&#8217;s current location,
     * the mark will be moved to the left of the newly-inserted text. If the
     * mark has right gravity (@left_gravity = <code>FALSE),</code> the mark will end up
     * on the right of newly-inserted text. The standard left-to-right cursor
     * is a mark with right gravity (when you type, the cursor stays on the
     * right side of the text you&#8217;re typing).
     */
    public TextMark(java.lang.String name, boolean leftGravity) {
        super(constructNew(name, leftGravity));
    }
    
    /**
     * Gets the buffer this mark is located inside.
     * 
     * Returns <code>null</code> if the mark is deleted.
     */
    public TextBuffer getBuffer() {
        var RESULT = gtk_h.gtk_text_mark_get_buffer(handle());
        return new TextBuffer(References.get(RESULT, false));
    }
    
    /**
     * Returns <code>true</code> if the mark has been removed from its buffer.
     * 
     * See {@link org.gtk.gtk.TextBuffer#addMark} for a way to add it
     * to a buffer again.
     */
    public boolean getDeleted() {
        var RESULT = gtk_h.gtk_text_mark_get_deleted(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether the mark has left gravity.
     */
    public boolean getLeftGravity() {
        var RESULT = gtk_h.gtk_text_mark_get_left_gravity(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the mark name.
     * 
     * Returns <code>null</code> for anonymous marks.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_text_mark_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns <code>true</code> if the mark is visible.
     * 
     * A cursor is displayed for visible marks.
     */
    public boolean getVisible() {
        var RESULT = gtk_h.gtk_text_mark_get_visible(handle());
        return (RESULT != 0);
    }
    
    public void setVisible(boolean setting) {
        gtk_h.gtk_text_mark_set_visible(handle(), setting ? 1 : 0);
    }
    
}
