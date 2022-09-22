package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Information about an annotation.
 */
public class DBusAnnotationInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusAnnotationInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusAnnotationInfo ref() {
        var RESULT = gtk_h.g_dbus_annotation_info_ref(handle());
        return new DBusAnnotationInfo(References.get(RESULT, true));
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        gtk_h.g_dbus_annotation_info_unref(handle());
    }
    
    /**
     * Looks up the value of an annotation.
     * <p>
     * The cost of this function is O(n) in number of annotations.
     */
    public static java.lang.String lookup(DBusAnnotationInfo[] annotations, java.lang.String name) {
        var RESULT = gtk_h.g_dbus_annotation_info_lookup(Interop.allocateNativeArray(annotations).handle(), Interop.allocateNativeString(name).handle());
        return RESULT.getUtf8String(0);
    }
    
}
