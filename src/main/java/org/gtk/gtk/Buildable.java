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
 * main user of this interface is {@link GtkBuilder}. There should be
 * very little need for applications to call any of these functions directly.
 * <p>
 * An object only needs to implement this interface if it needs to extend the
 * {@code GtkBuilder} XML format or run any extra routines at deserialization time.
 */
public interface Buildable extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BuildableImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BuildableImpl(input, ownership);
    
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
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_buildable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_buildable_get_buildable_id = Interop.downcallHandle(
            "gtk_buildable_get_buildable_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_buildable_get_type = Interop.downcallHandle(
            "gtk_buildable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class BuildableImpl extends org.gtk.gobject.GObject implements Buildable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public BuildableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
