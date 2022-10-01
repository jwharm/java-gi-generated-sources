package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkIMMulticontext} is an input method context supporting multiple,
 * switchable input methods.
 * <p>
 * Text widgets such as {@code GtkText} or {@code GtkTextView} use a {@code GtkIMMultiContext}
 * to implement their {@code im-module} property for switching between different
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
     * Creates a new {@code GtkIMMulticontext}.
     */
    public IMMulticontext() {
        super(constructNew());
    }
    
    /**
     * Gets the id of the currently active delegate of the {@code context}.
     */
    public java.lang.String getContextId() {
        var RESULT = gtk_h.gtk_im_multicontext_get_context_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the context id for {@code context}.
     * <p>
     * This causes the currently active delegate of {@code context} to be
     * replaced by the delegate corresponding to the new context id.
     * <p>
     * Setting this to a non-{@code null} value overrides the system-wide
     * IM module setting. See the {@code Gtk.Settings:gtk-im-module}
     * property.
     */
    public void setContextId(java.lang.String contextId) {
        gtk_h.gtk_im_multicontext_set_context_id(handle(), Interop.allocateNativeString(contextId).handle());
    }
    
}
