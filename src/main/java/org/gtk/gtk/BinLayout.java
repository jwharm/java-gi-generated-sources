package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkBinLayout} is a {@code GtkLayoutManager} subclass useful for create "bins" of
 * widgets.
 * <p>
 * {@code GtkBinLayout} will stack each child of a widget on top of each other,
 * using the {@code Gtk.Widget:vexpand},
 * {@code Gtk.Widget:valign} properties
 * of each child to determine where they should be positioned.
 */
public class BinLayout extends LayoutManager {

    public BinLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BinLayout */
    public static BinLayout castFrom(org.gtk.gobject.Object gobject) {
        return new BinLayout(gobject.refcounted());
    }
    
    static final MethodHandle gtk_bin_layout_new = Interop.downcallHandle(
        "gtk_bin_layout_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_bin_layout_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkBinLayout} instance.
     */
    public BinLayout() {
        super(constructNew());
    }
    
}
