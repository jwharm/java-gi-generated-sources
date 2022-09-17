package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkTextChildAnchor</code> is a spot in a <code>GtkTextBuffer</code> where child widgets can
 * be &#8220;anchored&#8221;.
 * 
 * The anchor can have multiple widgets anchored, to allow for multiple views.
 */
public class TextChildAnchor extends org.gtk.gobject.Object {

    public TextChildAnchor(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextChildAnchor */
    public static TextChildAnchor castFrom(org.gtk.gobject.Object gobject) {
        return new TextChildAnchor(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_text_child_anchor_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkTextChildAnchor</code>.
     * <p>
     * Usually you would then insert it into a <code>GtkTextBuffer</code> with
     * {@link org.gtk.gtk.TextBuffer#insertChildAnchor}. To perform the
     * creation and insertion in one step, use the convenience
     * function {@link org.gtk.gtk.TextBuffer#createChildAnchor}.
     */
    public TextChildAnchor() {
        super(constructNew());
    }
    
    private static Reference constructNewWithReplacement(java.lang.String character) {
        Reference RESULT = References.get(gtk_h.gtk_text_child_anchor_new_with_replacement(Interop.allocateNativeString(character).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkTextChildAnchor</code> with the given replacement character.
     * <p>
     * Usually you would then insert it into a <code>GtkTextBuffer</code> with
     * {@link org.gtk.gtk.TextBuffer#insertChildAnchor}.
     */
    public static TextChildAnchor newWithReplacement(java.lang.String character) {
        return new TextChildAnchor(constructNewWithReplacement(character));
    }
    
    /**
     * Determines whether a child anchor has been deleted from
     * the buffer.
     * 
     * Keep in mind that the child anchor will be unreferenced
     * when removed from the buffer, so you need to hold your own
     * reference (with g_object_ref()) if you plan to use this
     * function &#8212; otherwise all deleted child anchors will also
     * be finalized.
     */
    public boolean getDeleted() {
        var RESULT = gtk_h.gtk_text_child_anchor_get_deleted(handle());
        return (RESULT != 0);
    }
    
}
