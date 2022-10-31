package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkBinLayout} is a {@code GtkLayoutManager} subclass useful for create "bins" of
 * widgets.
 * <p>
 * {@code GtkBinLayout} will stack each child of a widget on top of each other,
 * using the {@code Gtk.Widget:hexpand}, {@code Gtk.Widget:vexpand},
 * {@code Gtk.Widget:halign}, and {@code Gtk.Widget:valign} properties
 * of each child to determine where they should be positioned.
 */
public class BinLayout extends org.gtk.gtk.LayoutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBinLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public BinLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to BinLayout if its GType is a (or inherits from) "GtkBinLayout".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BinLayout" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBinLayout", a ClassCastException will be thrown.
     */
    public static BinLayout castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkBinLayout"))) {
            return new BinLayout(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBinLayout");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_bin_layout_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBinLayout} instance.
     */
    public BinLayout() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_bin_layout_new = Interop.downcallHandle(
            "gtk_bin_layout_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
