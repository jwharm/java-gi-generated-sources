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
 * Toasts can be shown with {@code ToastOverlay#addToast}.
 * <p>
 * See {@link Toast} for details.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * toastoverlay
 * ├── [child]
 * ├── toast
 * ┊   ├── widget
 * ┊   │   ├── [label.heading]
 *     │   ╰── [custom title]
 *     ├── [button]
 *     ╰── button.circular.flat
 * }</pre>
 * <p>
 * {@code AdwToastOverlay}'s CSS node is called {@code toastoverlay}. It contains the child,
 * as well as zero or more {@code toast} subnodes.
 * <p>
 * Each of the {@code toast} nodes contains a {@code widget} subnode, optionally a {@code button}
 * subnode, and another {@code button} subnode with {@code .circular} and {@code .flat} style
 * classes.
 * <p>
 * The {@code widget} subnode contains a {@code label} subnode with the {@code .heading} style
 * class, or a custom widget provided by the application.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwToastOverlay} uses the {@code GTK_ACCESSIBLE_ROLE_TAB_GROUP} role.
 * @version 1.0
 */
public class ToastOverlay extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwToastOverlay";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ToastOverlay proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ToastOverlay(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ToastOverlay if its GType is a (or inherits from) "AdwToastOverlay".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ToastOverlay} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwToastOverlay", a ClassCastException will be thrown.
     */
    public static ToastOverlay castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwToastOverlay"))) {
            return new ToastOverlay(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwToastOverlay");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_overlay_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwToastOverlay}.
     */
    public ToastOverlay() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Displays {@code toast}.
     * <p>
     * Only one toast can be shown at a time; if a toast is already being displayed,
     * either {@code toast} or the original toast will be placed in a queue, depending on
     * the priority of {@code toast}. See {@code Toast:priority}.
     * <p>
     * If called on a toast that's already displayed, its timeout will be reset.
     * <p>
     * If called on a toast currently in the queue, the toast will be bumped
     * forward to be shown as soon as possible.
     * @param toast a toast
     */
    public void addToast(@NotNull org.gnome.adw.Toast toast) {
        java.util.Objects.requireNonNull(toast, "Parameter 'toast' must not be null");
        try {
            DowncallHandles.adw_toast_overlay_add_toast.invokeExact(
                    handle(),
                    toast.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        toast.yieldOwnership();
    }
    
    /**
     * Gets the child widget of {@code self}.
     * @return the child widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_overlay_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the child widget of {@code self}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.adw_toast_overlay_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_toast_overlay_new = Interop.downcallHandle(
            "adw_toast_overlay_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_overlay_add_toast = Interop.downcallHandle(
            "adw_toast_overlay_add_toast",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_overlay_get_child = Interop.downcallHandle(
            "adw_toast_overlay_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_overlay_set_child = Interop.downcallHandle(
            "adw_toast_overlay_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
