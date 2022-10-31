package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    /**
     * Cast object to Buildable if its GType is a (or inherits from) "GtkBuildable".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Buildable" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBuildable", a ClassCastException will be thrown.
     */
    public static Buildable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkBuildable"))) {
            return new BuildableImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBuildable");
        }
    }
    
    /**
     * Gets the ID of the {@code buildable} object.
     * <p>
     * {@code GtkBuilder} sets the name based on the ID attribute
     * of the &lt;object&gt; tag used to construct the {@code buildable}.
     * @return the ID of the buildable object
     */
    default @Nullable java.lang.String getBuildableId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_buildable_get_buildable_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_buildable_get_buildable_id = Interop.downcallHandle(
            "gtk_buildable_get_buildable_id",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class BuildableImpl extends org.gtk.gobject.Object implements Buildable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public BuildableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
