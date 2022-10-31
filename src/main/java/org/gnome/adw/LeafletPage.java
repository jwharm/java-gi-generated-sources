package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link Leaflet}.
 */
public class LeafletPage extends org.gtk.gobject.Object {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwLeafletPage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public LeafletPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to LeafletPage if its GType is a (or inherits from) "AdwLeafletPage".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "LeafletPage" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwLeafletPage", a ClassCastException will be thrown.
     */
    public static LeafletPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwLeafletPage"))) {
            return new LeafletPage(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwLeafletPage");
        }
    }
    
    /**
     * Gets the leaflet child to which {@code self} belongs.
     * @return the child to which {@code self} belongs
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the name of {@code self}.
     * @return the name of {@code self}.
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_page_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the child can be navigated to when folded.
     * @return whether {@code self} can be navigated to when folded
     */
    public boolean getNavigatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_page_get_navigatable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the name of the {@code self}.
     * @param name the new value to set
     */
    public void setName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.adw_leaflet_page_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can be navigated to when folded.
     * <p>
     * If {@code FALSE}, the child will be ignored by {@code Leaflet#getAdjacentChild},
     * {@code Leaflet#navigate}, and swipe gestures.
     * <p>
     * This can be used used to prevent switching to widgets like separators.
     * @param navigatable whether {@code self} can be navigated to when folded
     */
    public void setNavigatable(boolean navigatable) {
        try {
            DowncallHandles.adw_leaflet_page_set_navigatable.invokeExact(
                    handle(),
                    navigatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_leaflet_page_get_child = Interop.downcallHandle(
            "adw_leaflet_page_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_leaflet_page_get_name = Interop.downcallHandle(
            "adw_leaflet_page_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_leaflet_page_get_navigatable = Interop.downcallHandle(
            "adw_leaflet_page_get_navigatable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_leaflet_page_set_name = Interop.downcallHandle(
            "adw_leaflet_page_set_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_leaflet_page_set_navigatable = Interop.downcallHandle(
            "adw_leaflet_page_set_navigatable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
