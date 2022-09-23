package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A widget showing toasts above its content.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="toast-overlay-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="toast-overlay.png" alt="toast-overlay"&gt;
 * &lt;/picture&gt;
 * <p>
 * Toasts can be shown with {@link toastoverlay.add_toast#null}.
 * <p>
 * See {@link Toast} for details.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
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
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code AdwToastOverlay} uses the {@code GTK_ACCESSIBLE_ROLE_TAB_GROUP} role.
 */
public class ToastOverlay extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ToastOverlay(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ToastOverlay */
    public static ToastOverlay castFrom(org.gtk.gobject.Object gobject) {
        return new ToastOverlay(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_toast_overlay_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwToastOverlay}.
     */
    public ToastOverlay() {
        super(constructNew());
    }
    
    /**
     * Displays {@code toast}.
     * <p>
     * Only one toast can be shown at a time; if a toast is already being displayed,
     * either {@code toast} or the original toast will be placed in a queue, depending on
     * the priority of {@code toast}. See {@code Toast:priority}.
     */
    public void addToast(Toast toast) {
        gtk_h.adw_toast_overlay_add_toast(handle(), toast.getReference().unowned().handle());
    }
    
    /**
     * Gets the child widget of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        var RESULT = gtk_h.adw_toast_overlay_get_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        gtk_h.adw_toast_overlay_set_child(handle(), child.handle());
    }
    
}
