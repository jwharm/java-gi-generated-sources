package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A helper object for {@link ToastOverlay}.
 * <p>
 * Toasts are meant to be passed into {@link ToastOverlay#addToast} as
 * follows:
 * <p>
 * <pre>{@code c
 * adw_toast_overlay_add_toast (overlay, adw_toast_new (_("Simple Toast")));
 * }</pre>
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="toast-simple-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="toast-simple.png" alt="toast-simple"&gt;
 * &lt;/picture&gt;
 * <p>
 * Toasts always have a close button. They emit the {@code Toast::dismissed}
 * signal when disappearing.
 * <p>
 * {@code Toast:timeout} determines how long the toast stays on screen, while
 * {@code Toast:priority} determines how it behaves if another toast is
 * already being displayed.
 * <p>
 * <h2>Actions</h2>
 * <p>
 * Toasts can have one button on them, with a label and an attached
 * {@code Gio.Action}.
 * <p>
 * <pre>{@code c
 * AdwToast *toast = adw_toast_new (_("Toast with Action"));
 * 
 * adw_toast_set_button_label (toast, _("_Example"));
 * adw_toast_set_action_name (toast, "win.example");
 * 
 * adw_toast_overlay_add_toast (overlay, toast);
 * }</pre>
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="toast-action-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="toast-action.png" alt="toast-action"&gt;
 * &lt;/picture&gt;
 * <p>
 * <h2>Modifying toasts</h2>
 * <p>
 * Toasts can be modified after they have been shown. For this, an {@code AdwToast}
 * reference must be kept around while the toast is visible.
 * <p>
 * A common use case for this is using toasts as undo prompts that stack with
 * each other, allowing to batch undo the last deleted items:
 * <p>
 * <pre>{@code c
 * 
 * static void
 * toast_undo_cb (GtkWidget  *sender,
 *                const char *action,
 *                GVariant   *param)
 * {
 *   // Undo the deletion
 * }
 * 
 * static void
 * dismissed_cb (MyWindow *self)
 * {
 *   self->undo_toast = NULL;
 * 
 *   // Permanently delete the items
 * }
 * 
 * static void
 * delete_item (MyWindow *self,
 *              MyItem   *item)
 * {
 *   g_autofree char *title = NULL;
 *   int n_items;
 * 
 *   // Mark the item as waiting for deletion
 *   n_items = ... // The number of waiting items
 * 
 *   if (!self->undo_toast) {
 *     title = g_strdup_printf (_("‘%s’ deleted"), ...);
 * 
 *     self->undo_toast = adw_toast_new (title);
 * 
 *     adw_toast_set_priority (self->undo_toast, ADW_TOAST_PRIORITY_HIGH);
 *     adw_toast_set_button_label (self->undo_toast, _("_Undo"));
 *     adw_toast_set_action_name (self->undo_toast, "toast.undo");
 * 
 *     g_signal_connect_swapped (self->undo_toast, "dismissed",
 *                               G_CALLBACK (dismissed_cb), self);
 * 
 *     adw_toast_overlay_add_toast (self->toast_overlay, self->undo_toast);
 * 
 *     return;
 *   }
 * 
 *   title =
 *     g_strdup_printf (ngettext ("<span font_features='tnum=1'>%d</span> item deleted",
 *                                "<span font_features='tnum=1'>%d</span> items deleted",
 *                                n_items), n_items);
 * 
 *   adw_toast_set_title (self->undo_toast, title);
 * }
 * 
 * static void
 * my_window_class_init (MyWindowClass *klass)
 * {
 *   GtkWidgetClass *widget_class = GTK_WIDGET_CLASS (klass);
 * 
 *   gtk_widget_class_install_action (widget_class, "toast.undo", NULL, toast_undo_cb);
 * }
 * }</pre>
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="toast-undo-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="toast-undo.png" alt="toast-undo"&gt;
 * &lt;/picture&gt;
 */
public class Toast extends org.gtk.gobject.Object {

    public Toast(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Toast */
    public static Toast castFrom(org.gtk.gobject.Object gobject) {
        return new Toast(gobject.refcounted());
    }
    
    static final MethodHandle adw_toast_new = Interop.downcallHandle(
        "adw_toast_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String title) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_toast_new.invokeExact(Interop.allocateNativeString(title).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwToast}.
     * <p>
     * The toast will use {@code title} as its title.
     * <p>
     * {@code title} can be marked up with the Pango text markup language.
     */
    public Toast(java.lang.String title) {
        super(constructNew(title));
    }
    
    static final MethodHandle adw_toast_dismiss = Interop.downcallHandle(
        "adw_toast_dismiss",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Dismisses {@code self}.
     */
    public void dismiss() {
        try {
            adw_toast_dismiss.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_get_action_name = Interop.downcallHandle(
        "adw_toast_get_action_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the associated action.
     */
    public java.lang.String getActionName() {
        try {
            var RESULT = (MemoryAddress) adw_toast_get_action_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_get_action_target_value = Interop.downcallHandle(
        "adw_toast_get_action_target_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the parameter for action invocations.
     */
    public org.gtk.glib.Variant getActionTargetValue() {
        try {
            var RESULT = (MemoryAddress) adw_toast_get_action_target_value.invokeExact(handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_get_button_label = Interop.downcallHandle(
        "adw_toast_get_button_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the label to show on the button.
     */
    public java.lang.String getButtonLabel() {
        try {
            var RESULT = (MemoryAddress) adw_toast_get_button_label.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_get_priority = Interop.downcallHandle(
        "adw_toast_get_priority",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets priority for {@code self}.
     */
    public ToastPriority getPriority() {
        try {
            var RESULT = (int) adw_toast_get_priority.invokeExact(handle());
            return new ToastPriority(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_get_timeout = Interop.downcallHandle(
        "adw_toast_get_timeout",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets timeout for {@code self}.
     */
    public int getTimeout() {
        try {
            var RESULT = (int) adw_toast_get_timeout.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_get_title = Interop.downcallHandle(
        "adw_toast_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title that will be displayed on the toast.
     */
    public java.lang.String getTitle() {
        try {
            var RESULT = (MemoryAddress) adw_toast_get_title.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_set_action_name = Interop.downcallHandle(
        "adw_toast_set_action_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the associated action.
     */
    public void setActionName(java.lang.String actionName) {
        try {
            adw_toast_set_action_name.invokeExact(handle(), Interop.allocateNativeString(actionName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_set_action_target_value = Interop.downcallHandle(
        "adw_toast_set_action_target_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the parameter for action invocations.
     * <p>
     * If the {@code action_target} variant has a floating reference this function
     * will sink it.
     */
    public void setActionTargetValue(org.gtk.glib.Variant actionTarget) {
        try {
            adw_toast_set_action_target_value.invokeExact(handle(), actionTarget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_set_button_label = Interop.downcallHandle(
        "adw_toast_set_button_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the label to show on the button.
     * <p>
     * It set to {@code NULL}, the button won't be shown.
     */
    public void setButtonLabel(java.lang.String buttonLabel) {
        try {
            adw_toast_set_button_label.invokeExact(handle(), Interop.allocateNativeString(buttonLabel).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_set_detailed_action_name = Interop.downcallHandle(
        "adw_toast_set_detailed_action_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the action name and its parameter.
     * <p>
     * {@code detailed_action_name} is a string in the format accepted by
     * {@link Gio#Action}.
     */
    public void setDetailedActionName(java.lang.String detailedActionName) {
        try {
            adw_toast_set_detailed_action_name.invokeExact(handle(), Interop.allocateNativeString(detailedActionName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_set_priority = Interop.downcallHandle(
        "adw_toast_set_priority",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets priority for {@code self}.
     * <p>
     * Priority controls how the toast behaves when another toast is already
     * being displayed.
     * <p>
     * If {@code priority} is {@code ADW_TOAST_PRIORITY_NORMAL}, the toast will be queued.
     * <p>
     * If {@code priority} is {@code ADW_TOAST_PRIORITY_HIGH}, the toast will be displayed immediately,
     * pushing the previous toast into the queue instead.
     */
    public void setPriority(ToastPriority priority) {
        try {
            adw_toast_set_priority.invokeExact(handle(), priority.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_set_timeout = Interop.downcallHandle(
        "adw_toast_set_timeout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets timeout for {@code self}.
     * <p>
     * If {@code timeout} is 0, the toast is displayed indefinitely until manually
     * dismissed.
     * <p>
     * Toasts cannot disappear while being hovered, pressed (on touchscreen), or
     * have keyboard focus inside them.
     */
    public void setTimeout(int timeout) {
        try {
            adw_toast_set_timeout.invokeExact(handle(), timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_toast_set_title = Interop.downcallHandle(
        "adw_toast_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title that will be displayed on the toast.
     */
    public void setTitle(java.lang.String title) {
        try {
            adw_toast_set_title.invokeExact(handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DismissedHandler {
        void signalReceived(Toast source);
    }
    
    /**
     * Emitted when the toast has been dismissed.
     */
    public SignalHandle onDismissed(DismissedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("dismissed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Toast.Callbacks.class, "signalToastDismissed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalToastDismissed(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Toast.DismissedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Toast(Refcounted.get(source)));
        }
        
    }
}
