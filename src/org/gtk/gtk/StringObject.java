package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkStringObject</code> is the type of items in a <code>GtkStringList</code>.
 * <p>
 * A <code>GtkStringObject</code> is a wrapper around a <code>const char*</code>; it has
 * a {@link [property@Gtk.StringObject:string] (ref=property)} property.
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
     * Wraps a string in an object for use with <code>GListModel</code>.
     */
    public StringObject(java.lang.String string) {
        super(constructNew(string));
    }
    
    /**
     * Returns the string contained in a <code>GtkStringObject</code>.
     */
    public java.lang.String getString() {
        var RESULT = gtk_h.gtk_string_object_get_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
