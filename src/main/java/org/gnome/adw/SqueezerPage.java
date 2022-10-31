package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link Squeezer}.
 */
public class SqueezerPage extends org.gtk.gobject.Object {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwSqueezerPage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public SqueezerPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SqueezerPage if its GType is a (or inherits from) "AdwSqueezerPage".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SqueezerPage" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwSqueezerPage", a ClassCastException will be thrown.
     */
    public static SqueezerPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwSqueezerPage"))) {
            return new SqueezerPage(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwSqueezerPage");
        }
    }
    
    /**
     * Returns the squeezer child to which {@code self} belongs.
     * @return the child to which {@code self} belongs
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_squeezer_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code self} is enabled.
     * @return whether {@code self} is enabled
     */
    public boolean getEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_squeezer_page_get_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets whether {@code self} is enabled.
     * <p>
     * If a child is disabled, it will be ignored when looking for the child
     * fitting the available size best.
     * <p>
     * This allows to programmatically and prematurely hide a child even if it fits
     * in the available space.
     * <p>
     * This can be used e.g. to ensure a certain child is hidden below a certain
     * window width, or any other constraint you find suitable.
     * @param enabled whether {@code self} is enabled
     */
    public void setEnabled(boolean enabled) {
        try {
            DowncallHandles.adw_squeezer_page_set_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_squeezer_page_get_child = Interop.downcallHandle(
            "adw_squeezer_page_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_squeezer_page_get_enabled = Interop.downcallHandle(
            "adw_squeezer_page_get_enabled",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_squeezer_page_set_enabled = Interop.downcallHandle(
            "adw_squeezer_page_set_enabled",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
