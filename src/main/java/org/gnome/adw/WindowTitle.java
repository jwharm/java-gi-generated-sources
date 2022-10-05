package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A helper widget for setting a window's title and subtitle.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="window-title-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="window-title.png" alt="window-title"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwWindowTitle} shows a title and subtitle. It's intended to be used as the
 * title child of {@code HeaderBar}.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwWindowTitle} has a single CSS node with name {@code windowtitle}.
 */
public class WindowTitle extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public WindowTitle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to WindowTitle */
    public static WindowTitle castFrom(org.gtk.gobject.Object gobject) {
        return new WindowTitle(gobject.refcounted());
    }
    
    static final MethodHandle adw_window_title_new = Interop.downcallHandle(
        "adw_window_title_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String title, java.lang.String subtitle) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_window_title_new.invokeExact(Interop.allocateNativeString(title).handle(), Interop.allocateNativeString(subtitle).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwWindowTitle}.
     */
    public WindowTitle(java.lang.String title, java.lang.String subtitle) {
        super(constructNew(title, subtitle));
    }
    
    static final MethodHandle adw_window_title_get_subtitle = Interop.downcallHandle(
        "adw_window_title_get_subtitle",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the subtitle of {@code self}.
     */
    public java.lang.String getSubtitle() {
        try {
            var RESULT = (MemoryAddress) adw_window_title_get_subtitle.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_window_title_get_title = Interop.downcallHandle(
        "adw_window_title_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title of {@code self}.
     */
    public java.lang.String getTitle() {
        try {
            var RESULT = (MemoryAddress) adw_window_title_get_title.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_window_title_set_subtitle = Interop.downcallHandle(
        "adw_window_title_set_subtitle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the subtitle of {@code self}.
     */
    public void setSubtitle(java.lang.String subtitle) {
        try {
            adw_window_title_set_subtitle.invokeExact(handle(), Interop.allocateNativeString(subtitle).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_window_title_set_title = Interop.downcallHandle(
        "adw_window_title_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title of {@code self}.
     */
    public void setTitle(java.lang.String title) {
        try {
            adw_window_title_set_title.invokeExact(handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
