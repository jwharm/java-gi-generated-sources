package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A freeform application window.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="application-window-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="application-window.png" alt="application-window"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwApplicationWindow} is a {@link org.gtk.gtk.ApplicationWindow} subclass providing
 * the same features as {@link Window}.
 * <p>
 * See {@link Window} for details.
 * <p>
 * Using {@code Gtk.Application:menubar} is not supported and may result in
 * visual glitches.
 */
public class ApplicationWindow extends org.gtk.gtk.ApplicationWindow implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap, org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {

    public ApplicationWindow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ApplicationWindow */
    public static ApplicationWindow castFrom(org.gtk.gobject.Object gobject) {
        return new ApplicationWindow(gobject.refcounted());
    }
    
    static final MethodHandle adw_application_window_new = Interop.downcallHandle(
        "adw_application_window_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gtk.Application app) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_application_window_new.invokeExact(app.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwApplicationWindow} for {@code app}.
     */
    public ApplicationWindow(org.gtk.gtk.Application app) {
        super(constructNew(app));
    }
    
    static final MethodHandle adw_application_window_get_content = Interop.downcallHandle(
        "adw_application_window_get_content",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#getChild}.
     */
    public org.gtk.gtk.Widget getContent() {
        try {
            var RESULT = (MemoryAddress) adw_application_window_get_content.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_application_window_set_content = Interop.downcallHandle(
        "adw_application_window_set_content",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#setChild}.
     */
    public void setContent(org.gtk.gtk.Widget content) {
        try {
            adw_application_window_set_content.invokeExact(handle(), content.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
