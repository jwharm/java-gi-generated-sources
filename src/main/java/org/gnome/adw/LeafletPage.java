package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle adw_leaflet_page_get_child = Interop.downcallHandle(
        "adw_leaflet_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the leaflet child th which {@code self} belongs.
     */
    public org.gtk.gtk.Widget getChild() {
        try {
            var RESULT = (MemoryAddress) adw_leaflet_page_get_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_leaflet_page_get_name = Interop.downcallHandle(
        "adw_leaflet_page_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of {@code self}.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) adw_leaflet_page_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_leaflet_page_get_navigatable = Interop.downcallHandle(
        "adw_leaflet_page_get_navigatable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the child can be navigated to when folded.
     */
    public boolean getNavigatable() {
        try {
            var RESULT = (int) adw_leaflet_page_get_navigatable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_leaflet_page_set_name = Interop.downcallHandle(
        "adw_leaflet_page_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the {@code self}.
     */
    public void setName(java.lang.String name) {
        try {
            adw_leaflet_page_set_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_leaflet_page_set_navigatable = Interop.downcallHandle(
        "adw_leaflet_page_set_navigatable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} can be navigated to when folded.
     */
    public void setNavigatable(boolean navigatable) {
        try {
            adw_leaflet_page_set_navigatable.invokeExact(handle(), navigatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
