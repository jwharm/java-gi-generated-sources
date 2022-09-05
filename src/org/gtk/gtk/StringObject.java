package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkStringObject` is the type of items in a `GtkStringList`.
 * 
 * A `GtkStringObject` is a wrapper around a `const char*`; it has
 * a [property@Gtk.StringObject:string] property.
 */
public class StringObject extends org.gtk.gobject.Object {

    public StringObject(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to StringObject */
    public static StringObject castFrom(org.gtk.gobject.Object gobject) {
        return new StringObject(gobject.getProxy());
    }
    
    /**
     * Wraps a string in an object for use with `GListModel`.
     */
    public StringObject(java.lang.String string) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_object_new(Interop.allocateNativeString(string).HANDLE()), true));
    }
    
    /**
     * Returns the string contained in a `GtkStringObject`.
     */
    public java.lang.String getString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_string_object_get_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
}
