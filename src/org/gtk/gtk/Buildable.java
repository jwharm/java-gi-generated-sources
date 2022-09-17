package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkBuildable</code> allows objects to extend and customize their deserialization
 * from ui files.
 * <p>
 * The interface includes methods for setting names and properties of objects,
 * parsing custom tags and constructing child objects.
 * <p>
 * The <code>GtkBuildable</code> interface is implemented by all widgets and
 * many of the non-widget objects that are provided by GTK. The
 * main user of this interface is {@link org.gtk.gtk.Builder}. There should be
 * very little need for applications to call any of these functions directly.
 * <p>
 * An object only needs to implement this interface if it needs to extend the<code>GtkBuilder</code> XML format or run any extra routines at deserialization time.
 */
public interface Buildable extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the ID of the @buildable object.
     * <p><code>GtkBuilder</code> sets the name based on the ID attribute
     * of the &#60;object&#62; tag used to construct the @buildable.
     */
    public default java.lang.String getBuildableId() {
        var RESULT = gtk_h.gtk_buildable_get_buildable_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    class BuildableImpl extends org.gtk.gobject.Object implements Buildable {
        public BuildableImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
