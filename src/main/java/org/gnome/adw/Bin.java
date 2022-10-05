package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A widget with one child.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="bin-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="bin.png" alt="bin"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwBin} widget has only one child, set with the {@code Bin:child}
 * property.
 * <p>
 * It is useful for deriving subclasses, since it provides common code needed
 * for handling a single child widget.
 */
public class Bin extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public Bin(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Bin */
    public static Bin castFrom(org.gtk.gobject.Object gobject) {
        return new Bin(gobject.refcounted());
    }
    
    static final MethodHandle adw_bin_new = Interop.downcallHandle(
        "adw_bin_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_bin_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwBin}.
     */
    public Bin() {
        super(constructNew());
    }
    
    static final MethodHandle adw_bin_get_child = Interop.downcallHandle(
        "adw_bin_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        try {
            var RESULT = (MemoryAddress) adw_bin_get_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_bin_set_child = Interop.downcallHandle(
        "adw_bin_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        try {
            adw_bin_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
