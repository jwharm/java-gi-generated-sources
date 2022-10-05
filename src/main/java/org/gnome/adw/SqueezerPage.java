package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle adw_squeezer_page_get_child = Interop.downcallHandle(
        "adw_squeezer_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the squeezer child to which {@code self} belongs.
     */
    public org.gtk.gtk.Widget getChild() {
        try {
            var RESULT = (MemoryAddress) adw_squeezer_page_get_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_page_get_enabled = Interop.downcallHandle(
        "adw_squeezer_page_get_enabled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is enabled.
     */
    public boolean getEnabled() {
        try {
            var RESULT = (int) adw_squeezer_page_get_enabled.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_page_set_enabled = Interop.downcallHandle(
        "adw_squeezer_page_set_enabled",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} is enabled.
     */
    public void setEnabled(boolean enabled) {
        try {
            adw_squeezer_page_set_enabled.invokeExact(handle(), enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
