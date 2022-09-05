package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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

    public IMMulticontext(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to IMMulticontext */
    public static IMMulticontext castFrom(org.gtk.gobject.Object gobject) {
        return new IMMulticontext(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkIMMulticontext`.
     */
    public IMMulticontext() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_multicontext_new(), true));
    }
    
    /**
     * Gets the id of the currently active delegate of the @context.
     */
    public java.lang.String getContextId() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_multicontext_get_context_id(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_multicontext_set_context_id(HANDLE(), Interop.allocateNativeString(contextId).HANDLE());
    }
    
}
