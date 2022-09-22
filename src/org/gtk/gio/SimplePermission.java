package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public SimplePermission(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SimplePermission */
    public static SimplePermission castFrom(org.gtk.gobject.Object gobject) {
        return new SimplePermission(gobject.getReference());
    }
    
    private static Reference constructNew(boolean allowed) {
        Reference RESULT = References.get(gtk_h.g_simple_permission_new(allowed ? 1 : 0), true);
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
