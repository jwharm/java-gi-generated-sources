package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link Squeezer}.
 */
public class SqueezerPage extends org.gtk.gobject.Object {

    public SqueezerPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SqueezerPage */
    public static SqueezerPage castFrom(org.gtk.gobject.Object gobject) {
        return new SqueezerPage(gobject.refcounted());
    }
    
    private static final MethodHandle adw_squeezer_page_get_child = Interop.downcallHandle(
        "adw_squeezer_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the squeezer child to which {@code self} belongs.
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_squeezer_page_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_squeezer_page_get_enabled = Interop.downcallHandle(
        "adw_squeezer_page_get_enabled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is enabled.
     */
    public boolean getEnabled() {
        int RESULT;
        try {
            RESULT = (int) adw_squeezer_page_get_enabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_squeezer_page_set_enabled = Interop.downcallHandle(
        "adw_squeezer_page_set_enabled",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} is enabled.
     */
    public @NotNull void setEnabled(@NotNull boolean enabled) {
        try {
            adw_squeezer_page_set_enabled.invokeExact(handle(), enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
