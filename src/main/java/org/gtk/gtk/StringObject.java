package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkStringObject} is the type of items in a {@code GtkStringList}.
 * <p>
 * A {@code GtkStringObject} is a wrapper around a {@code const char*}; it has
 * a {@code Gtk.StringObject:string} property.
 */
public class StringObject extends org.gtk.gobject.Object {

    public StringObject(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StringObject */
    public static StringObject castFrom(org.gtk.gobject.Object gobject) {
        return new StringObject(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String string) {
        Reference RESULT = References.get(gtk_h.gtk_string_object_new(Interop.allocateNativeString(string).handle()), true);
        return RESULT;
    }
    
    /**
     * Wraps a string in an object for use with {@code GListModel}.
     */
    public StringObject(java.lang.String string) {
        super(constructNew(string));
    }
    
    /**
     * Returns the string contained in a {@code GtkStringObject}.
     */
    public java.lang.String getString() {
        var RESULT = gtk_h.gtk_string_object_get_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
