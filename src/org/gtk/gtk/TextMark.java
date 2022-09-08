package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkTextMark` is a position in a `GtkTextbuffer` that is preserved
 * across modifications.
 * 
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * 
 * A `GtkTextMark` is like a bookmark in a text buffer; it preserves
 * a position in the text. You can convert the mark to an iterator using
 * [method@Gtk.TextBuffer.get_iter_at_mark]. Unlike iterators, marks remain
 * valid across buffer mutations, because their behavior is defined when
 * text is inserted or deleted. When text containing a mark is deleted,
 * the mark remains in the position originally occupied by the deleted
 * text. When text is inserted at a mark, a mark with “left gravity” will
 * be moved to the beginning of the newly-inserted text, and a mark with
 * “right gravity” will be moved to the end.
 * 
 * Note that “left” and “right” here refer to logical direction (left
 * is the toward the start of the buffer); in some languages such as
 * Hebrew the logically-leftmost text is not actually on the left when
 * displayed.
 * 
 * Marks are reference counted, but the reference count only controls
 * the validity of the memory; marks can be deleted from the buffer at
 * any time with [method@Gtk.TextBuffer.delete_mark]. Once deleted from
 * the buffer, a mark is essentially useless.
 * 
 * Marks optionally have names; these can be convenient to avoid passing
 * the `GtkTextMark` object around.
 * 
 * Marks are typically created using the [method@Gtk.TextBuffer.create_mark]
 * function.
 */
public class TextMark extends org.gtk.gobject.Object {

    public TextMark(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextMark */
    public static TextMark castFrom(org.gtk.gobject.Object gobject) {
        return new TextMark(gobject.getReference());
    }
    
    /**
     * Creates a text mark.
     * 
     * Add it to a buffer using [method@Gtk.TextBuffer.add_mark].
     * If @name is %NULL, the mark is anonymous; otherwise, the mark can be
     * retrieved by name using [method@Gtk.TextBuffer.get_mark]. If a mark
     * has left gravity, and text is inserted at the mark’s current location,
     * the mark will be moved to the left of the newly-inserted text. If the
     * mark has right gravity (@left_gravity = %FALSE), the mark will end up
     * on the right of newly-inserted text. The standard left-to-right cursor
     * is a mark with right gravity (when you type, the cursor stays on the
     * right side of the text you’re typing).
     */
    public TextMark(java.lang.String name, boolean leftGravity) {
        super(References.get(gtk_h.gtk_text_mark_new(Interop.allocateNativeString(name).handle(), leftGravity ? 1 : 0), true));
    }
    
    /**
     * Gets the buffer this mark is located inside.
     * 
     * Returns %NULL if the mark is deleted.
     */
    public TextBuffer getBuffer() {
        var RESULT = gtk_h.gtk_text_mark_get_buffer(handle());
        return new TextBuffer(References.get(RESULT, false));
    }
    
    /**
     * Returns %TRUE if the mark has been removed from its buffer.
     * 
     * See [method@Gtk.TextBuffer.add_mark] for a way to add it
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
     * Returns %NULL for anonymous marks.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_text_mark_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns %TRUE if the mark is visible.
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
