package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkTextChildAnchor` is a spot in a `GtkTextBuffer` where child widgets can
 * be “anchored”.
 * 
 * The anchor can have multiple widgets anchored, to allow for multiple views.
 */
public class TextChildAnchor extends org.gtk.gobject.Object {

    public TextChildAnchor(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextChildAnchor */
    public static TextChildAnchor castFrom(org.gtk.gobject.Object gobject) {
        return new TextChildAnchor(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkTextChildAnchor`.
     * 
     * Usually you would then insert it into a `GtkTextBuffer` with
     * [method@Gtk.TextBuffer.insert_child_anchor]. To perform the
     * creation and insertion in one step, use the convenience
     * function [method@Gtk.TextBuffer.create_child_anchor].
     */
    public TextChildAnchor() {
        super(References.get(gtk_h.gtk_text_child_anchor_new(), true));
    }
    
    /**
     * Creates a new `GtkTextChildAnchor` with the given replacement character.
     * 
     * Usually you would then insert it into a `GtkTextBuffer` with
     * [method@Gtk.TextBuffer.insert_child_anchor].
     */
    public TextChildAnchor(java.lang.String character) {
        super(References.get(gtk_h.gtk_text_child_anchor_new_with_replacement(Interop.allocateNativeString(character).handle()), true));
    }
    
    /**
     * Determines whether a child anchor has been deleted from
     * the buffer.
     * 
     * Keep in mind that the child anchor will be unreferenced
     * when removed from the buffer, so you need to hold your own
     * reference (with g_object_ref()) if you plan to use this
     * function — otherwise all deleted child anchors will also
     * be finalized.
     */
    public boolean getDeleted() {
        var RESULT = gtk_h.gtk_text_child_anchor_get_deleted(handle());
        return (RESULT != 0);
    }
    
}
