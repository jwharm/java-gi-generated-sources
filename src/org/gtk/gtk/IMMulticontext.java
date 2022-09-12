package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkIMMulticontext` is an input method context supporting multiple,
 * switchable input methods.
 * 
 * Text widgets such as `GtkText` or `GtkTextView` use a `GtkIMMultiContext`
 * to implement their `im-module` property for switching between different
 * input methods.
 */
public class IMMulticontext extends IMContext {

    public IMMulticontext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IMMulticontext */
    public static IMMulticontext castFrom(org.gtk.gobject.Object gobject) {
        return new IMMulticontext(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_im_multicontext_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkIMMulticontext`.
     */
    public IMMulticontext() {
        super(constructNew());
    }
    
    /**
     * Gets the id of the currently active delegate of the @context.
     */
    public java.lang.String getContextId() {
        var RESULT = gtk_h.gtk_im_multicontext_get_context_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the context id for @context.
     * 
     * This causes the currently active delegate of @context to be
     * replaced by the delegate corresponding to the new context id.
     * 
     * Setting this to a non-%NULL value overrides the system-wide
     * IM module setting. See the [property@Gtk.Settings:gtk-im-module]
     * property.
     */
    public void setContextId(java.lang.String contextId) {
        gtk_h.gtk_im_multicontext_set_context_id(handle(), Interop.allocateNativeString(contextId).handle());
    }
    
}
