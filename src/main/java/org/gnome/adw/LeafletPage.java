package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link Leaflet}.
 */
public class LeafletPage extends org.gtk.gobject.Object {

    public LeafletPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to LeafletPage */
    public static LeafletPage castFrom(org.gtk.gobject.Object gobject) {
        return new LeafletPage(gobject.refcounted());
    }
    
    private static final MethodHandle adw_leaflet_page_get_child = Interop.downcallHandle(
        "adw_leaflet_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the leaflet child th which {@code self} belongs.
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_page_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_leaflet_page_get_name = Interop.downcallHandle(
        "adw_leaflet_page_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of {@code self}.
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_page_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_leaflet_page_get_navigatable = Interop.downcallHandle(
        "adw_leaflet_page_get_navigatable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the child can be navigated to when folded.
     */
    public boolean getNavigatable() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_page_get_navigatable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_leaflet_page_set_name = Interop.downcallHandle(
        "adw_leaflet_page_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the {@code self}.
     */
    public @NotNull void setName(@Nullable java.lang.String name) {
        try {
            adw_leaflet_page_set_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_page_set_navigatable = Interop.downcallHandle(
        "adw_leaflet_page_set_navigatable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} can be navigated to when folded.
     */
    public @NotNull void setNavigatable(@NotNull boolean navigatable) {
        try {
            adw_leaflet_page_set_navigatable.invokeExact(handle(), navigatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
