package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link SimplePermission} is a trivial implementation of {@link Permission} that
 * represents a permission that is either always or never allowed.  The
 * value is given at construction and doesn't change.
 * <p>
 * Calling request or release will result in errors.
 */
public class SimplePermission extends Permission {

    public SimplePermission(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SimplePermission */
    public static SimplePermission castFrom(org.gtk.gobject.Object gobject) {
        return new SimplePermission(gobject.refcounted());
    }
    
    private static Refcounted constructNew(boolean allowed) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_simple_permission_new(allowed ? 1 : 0), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Permission} instance that represents an action that is
     * either always or never allowed.
     */
    public SimplePermission(boolean allowed) {
        super(constructNew(allowed));
    }
    
}
