package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkBuildable} allows objects to extend and customize their deserialization
 * from ui files.
 * <p>
 * The interface includes methods for setting names and properties of objects,
 * parsing custom tags and constructing child objects.
 * <p>
 * The {@code GtkBuildable} interface is implemented by all widgets and
 * many of the non-widget objects that are provided by GTK. The
 * main user of this interface is {@link Builder}. There should be
 * very little need for applications to call any of these functions directly.
 * <p>
 * An object only needs to implement this interface if it needs to extend the
 * {@code GtkBuilder} XML format or run any extra routines at deserialization time.
 */
public interface Buildable extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_buildable_get_buildable_id = Interop.downcallHandle(
        "gtk_buildable_get_buildable_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the ID of the {@code buildable} object.
     * <p>
     * {@code GtkBuilder} sets the name based on the ID attribute
     * of the &lt;object&gt; tag used to construct the {@code buildable}.
     */
    public default java.lang.String getBuildableId() {
        try {
            var RESULT = (MemoryAddress) gtk_buildable_get_buildable_id.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class BuildableImpl extends org.gtk.gobject.Object implements Buildable {
        public BuildableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
