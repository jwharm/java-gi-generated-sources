package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A widget showing toasts above its content.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="toast-overlay-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="toast-overlay.png" alt="toast-overlay"&gt;
 * &lt;/picture&gt;
 * <p>
 * Toasts can be shown with {@link ToastOverlay#addToast}.
 * <p>
 * See {@link Toast} for details.
 * 
 * <h2>CSS nodes</h2>
 * <pre>{@code 
 * toastoverlay
 * ├── [child]
 * ├── toast
 * ┊   ├── label.heading
 *     ├── [button]
 *     ╰── button.circular.flat
 * }</pre>
 * <p>
 * {@code AdwToastOverlay}'s CSS node is called {@code toastoverlay}. It contains the child,
 * as well as zero or more {@code toast} subnodes.
 * <p>
 * Each of the {@code toast} nodes contains a {@code label} subnode with the {@code .heading}
 * style class, optionally a {@code button} subnode, and another {@code button} subnode with
 * {@code .circular} and {@code .flat} style classes.
 * 
 * <h2>Accessibility</h2>
 * {@code AdwToastOverlay} uses the {@code GTK_ACCESSIBLE_ROLE_TAB_GROUP} role.
 */
public class ToastOverlay extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ToastOverlay(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ToastOverlay */
    public static ToastOverlay castFrom(org.gtk.gobject.Object gobject) {
        return new ToastOverlay(gobject.refcounted());
    }
    
    private static final MethodHandle adw_toast_overlay_new = Interop.downcallHandle(
        "adw_toast_overlay_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_toast_overlay_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwToastOverlay}.
     */
    public ToastOverlay() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_toast_overlay_add_toast = Interop.downcallHandle(
        "adw_toast_overlay_add_toast",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Displays {@code toast}.
     * <p>
     * Only one toast can be shown at a time; if a toast is already being displayed,
     * either {@code toast} or the original toast will be placed in a queue, depending on
     * the priority of {@code toast}. See {@code Toast:priority}.
     */
    public @NotNull void addToast(@NotNull Toast toast) {
        try {
            adw_toast_overlay_add_toast.invokeExact(handle(), toast.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_toast_overlay_get_child = Interop.downcallHandle(
        "adw_toast_overlay_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code self}.
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_toast_overlay_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_toast_overlay_set_child = Interop.downcallHandle(
        "adw_toast_overlay_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code self}.
     */
    public @NotNull void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            adw_toast_overlay_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
