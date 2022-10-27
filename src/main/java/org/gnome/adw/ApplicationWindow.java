package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 1.0
 */
public class ApplicationWindow extends org.gtk.gtk.ApplicationWindow implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap, org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.ApplicationWindow.getMemoryLayout().withName("parent_instance")
    ).withName("AdwApplicationWindow");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ApplicationWindow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ApplicationWindow */
    public static ApplicationWindow castFrom(org.gtk.gobject.Object gobject) {
        return new ApplicationWindow(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gtk.Application app) {
        java.util.Objects.requireNonNull(app, "Parameter 'app' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_application_window_new.invokeExact(app.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwApplicationWindow} for {@code app}.
     * @param app an application instance
     */
    public ApplicationWindow(@NotNull org.gtk.gtk.Application app) {
        super(constructNew(app));
    }
    
    /**
     * Gets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#getChild}.
     * @return the content widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_application_window_get_content.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#setChild}.
     * @param content the content widget
     */
    public void setContent(@Nullable org.gtk.gtk.Widget content) {
        java.util.Objects.requireNonNullElse(content, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_application_window_set_content.invokeExact(handle(), content.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_application_window_new = Interop.downcallHandle(
            "adw_application_window_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_application_window_get_content = Interop.downcallHandle(
            "adw_application_window_get_content",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_application_window_set_content = Interop.downcallHandle(
            "adw_application_window_set_content",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
