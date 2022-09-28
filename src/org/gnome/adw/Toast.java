package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public Toast(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Toast */
    public static Toast castFrom(org.gtk.gobject.Object gobject) {
        return new Toast(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String title) {
        Reference RESULT = References.get(gtk_h.adw_toast_new(Interop.allocateNativeString(title).handle()), true);
        return RESULT;
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
    
    /**
     * Dismisses {@code self}.
     */
    public void dismiss() {
        gtk_h.adw_toast_dismiss(handle());
    }
    
    /**
     * Gets the name of the associated action.
     */
    public java.lang.String getActionName() {
        var RESULT = gtk_h.adw_toast_get_action_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the parameter for action invocations.
     */
    public org.gtk.glib.Variant getActionTargetValue() {
        var RESULT = gtk_h.adw_toast_get_action_target_value(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Gets the label to show on the button.
     */
    public java.lang.String getButtonLabel() {
        var RESULT = gtk_h.adw_toast_get_button_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets priority for {@code self}.
     */
    public ToastPriority getPriority() {
        var RESULT = gtk_h.adw_toast_get_priority(handle());
        return new ToastPriority(RESULT);
    }
    
    /**
     * Gets timeout for {@code self}.
     */
    public int getTimeout() {
        var RESULT = gtk_h.adw_toast_get_timeout(handle());
        return RESULT;
    }
    
    /**
     * Gets the title that will be displayed on the toast.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.adw_toast_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the name of the associated action.
     */
    public void setActionName(java.lang.String actionName) {
        gtk_h.adw_toast_set_action_name(handle(), Interop.allocateNativeString(actionName).handle());
    }
    
    /**
     * Sets the parameter for action invocations.
     * <p>
     * If the {@code action_target} variant has a floating reference this function
     * will sink it.
     */
    public void setActionTargetValue(org.gtk.glib.Variant actionTarget) {
        gtk_h.adw_toast_set_action_target_value(handle(), actionTarget.handle());
    }
    
    /**
     * Sets the label to show on the button.
     * <p>
     * It set to {@code NULL}, the button won't be shown.
     */
    public void setButtonLabel(java.lang.String buttonLabel) {
        gtk_h.adw_toast_set_button_label(handle(), Interop.allocateNativeString(buttonLabel).handle());
    }
    
    /**
     * Sets the action name and its parameter.
     * <p>
     * {@code detailed_action_name} is a string in the format accepted by
     * {@link Gio#Action}.
     */
    public void setDetailedActionName(java.lang.String detailedActionName) {
        gtk_h.adw_toast_set_detailed_action_name(handle(), Interop.allocateNativeString(detailedActionName).handle());
    }
    
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
        gtk_h.adw_toast_set_priority(handle(), priority.getValue());
    }
    
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
        gtk_h.adw_toast_set_timeout(handle(), timeout);
    }
    
    /**
     * Sets the title that will be displayed on the toast.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.adw_toast_set_title(handle(), Interop.allocateNativeString(title).handle());
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("dismissed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Toast.class, "__signalToastDismissed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalToastDismissed(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Toast.DismissedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Toast(References.get(source)));
    }
    
}
