package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A helper object for {@link ToastOverlay}.
 * <p>
 * Toasts are meant to be passed into {@code ToastOverlay#addToast} as
 * follows:
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
 * {@code Toast:custom-title} can be used to replace the title label with a
 * custom widget.
 * <p>
 * <strong>Actions</strong><br/>
 * Toasts can have one button on them, with a label and an attached
 * {@code Gio.Action}.
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
 * <strong>Modifying toasts</strong><br/>
 * Toasts can be modified after they have been shown. For this, an {@code AdwToast}
 * reference must be kept around while the toast is visible.
 * <p>
 * A common use case for this is using toasts as undo prompts that stack with
 * each other, allowing to batch undo the last deleted items:
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
 *     self->undo_toast = adw_toast_new_format (_("‘%s’ deleted"), ...);
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
 * 
 *   // Bump the toast timeout
 *   adw_toast_overlay_add_toast (self->toast_overlay, g_object_ref (self->undo_toast));
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
 * @version 1.0
 */
public class Toast extends org.gtk.gobject.GObject {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwToast";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Toast proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Toast(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Toast> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Toast(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String title) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_new.invokeExact(
                    Marshal.stringToAddress.marshal(title, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwToast}.
     * <p>
     * The toast will use {@code title} as its title.
     * <p>
     * {@code title} can be marked up with the Pango text markup language.
     * @param title the title to be displayed
     */
    public Toast(java.lang.String title) {
        super(constructNew(title), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFormat(java.lang.String format, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_new_format.invokeExact(
                    Marshal.stringToAddress.marshal(format, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwToast}.
     * <p>
     * The toast will use the format string as its title.
     * <p>
     * See also: {@link Toast#Toast}
     * @param format the formatted string for the toast title
     * @param varargs the parameters to insert into the format string
     * @return the newly created toast object
     */
    public static Toast newFormat(java.lang.String format, java.lang.Object... varargs) {
        var RESULT = constructNewFormat(format, varargs);
        return (org.gnome.adw.Toast) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.Toast.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Dismisses {@code self}.
     * <p>
     * Does nothing if {@code self} has already been dismissed, or hasn't been added to an
     * {@link ToastOverlay}.
     */
    public void dismiss() {
        try {
            DowncallHandles.adw_toast_dismiss.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the name of the associated action.
     * @return the action name
     */
    public @Nullable java.lang.String getActionName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_get_action_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the parameter for action invocations.
     * @return the action target
     */
    public @Nullable org.gtk.glib.Variant getActionTargetValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_get_action_target_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the label to show on the button.
     * @return the button label
     */
    public @Nullable java.lang.String getButtonLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_get_button_label.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the custom title widget of {@code self}.
     * @return the custom title widget
     */
    public @Nullable org.gtk.gtk.Widget getCustomTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_get_custom_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets priority for {@code self}.
     * @return the priority
     */
    public org.gnome.adw.ToastPriority getPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_toast_get_priority.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gnome.adw.ToastPriority.of(RESULT);
    }
    
    /**
     * Gets timeout for {@code self}.
     * @return the timeout
     */
    public int getTimeout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_toast_get_timeout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the title that will be displayed on the toast.
     * <p>
     * If a custom title has been set with {@link Toast#setCustomTitle}
     * the return value will be {@code null}.
     * @return the title
     */
    public @Nullable java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets the name of the associated action.
     * <p>
     * It will be activated when clicking the button.
     * <p>
     * See {@code Toast:action-target}.
     * @param actionName the action name
     */
    public void setActionName(@Nullable java.lang.String actionName) {
        try {
            DowncallHandles.adw_toast_set_action_name.invokeExact(
                    handle(),
                    (Addressable) (actionName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(actionName, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the parameter for action invocations.
     * <p>
     * This is a convenience function that calls {@link org.gtk.glib.Variant#Variant} for
     * {@code format_string} and uses the result to call
     * {@code Toast#setActionTargetValue}.
     * <p>
     * If you are setting a string-valued target and want to set
     * the action name at the same time, you can use
     * {@code Toast#setDetailedActionName}.
     * @param formatString a variant format string
     * @param varargs arguments appropriate for {@code target_format}
     */
    public void setActionTarget(@Nullable java.lang.String formatString, java.lang.Object... varargs) {
        try {
            DowncallHandles.adw_toast_set_action_target.invokeExact(
                    handle(),
                    (Addressable) (formatString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(formatString, null)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the parameter for action invocations.
     * <p>
     * If the {@code action_target} variant has a floating reference this function
     * will sink it.
     * @param actionTarget the action target
     */
    public void setActionTargetValue(@Nullable org.gtk.glib.Variant actionTarget) {
        try {
            DowncallHandles.adw_toast_set_action_target_value.invokeExact(
                    handle(),
                    (Addressable) (actionTarget == null ? MemoryAddress.NULL : actionTarget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the label to show on the button.
     * <p>
     * Underlines in the button text can be used to indicate a mnemonic.
     * <p>
     * If set to {@code NULL}, the button won't be shown.
     * <p>
     * See {@code Toast:action-name}.
     * @param buttonLabel a button label
     */
    public void setButtonLabel(@Nullable java.lang.String buttonLabel) {
        try {
            DowncallHandles.adw_toast_set_button_label.invokeExact(
                    handle(),
                    (Addressable) (buttonLabel == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(buttonLabel, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the custom title widget of {@code self}.
     * <p>
     * It will be displayed instead of the title if set. In this case,
     * {@code Toast:title} is ignored.
     * <p>
     * Setting a custom title will unset {@code Toast:title}.
     * @param widget the custom title widget
     */
    public void setCustomTitle(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.adw_toast_set_custom_title.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the action name and its parameter.
     * <p>
     * {@code detailed_action_name} is a string in the format accepted by
     * {@link org.gtk.gio.Action#parseDetailedName}.
     * @param detailedActionName the detailed action name
     */
    public void setDetailedActionName(@Nullable java.lang.String detailedActionName) {
        try {
            DowncallHandles.adw_toast_set_detailed_action_name.invokeExact(
                    handle(),
                    (Addressable) (detailedActionName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(detailedActionName, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets priority for {@code self}.
     * <p>
     * Priority controls how the toast behaves when another toast is already
     * being displayed.
     * <p>
     * If {@code priority} is {@code ADW_TOAST_PRIORITY_NORMAL}, the toast will be queued.
     * <p>
     * If {@code priority} is {@code ADW_TOAST_PRIORITY_HIGH}, the toast will be displayed
     * immediately, pushing the previous toast into the queue instead.
     * @param priority the priority
     */
    public void setPriority(org.gnome.adw.ToastPriority priority) {
        try {
            DowncallHandles.adw_toast_set_priority.invokeExact(
                    handle(),
                    priority.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets timeout for {@code self}.
     * <p>
     * If {@code timeout} is 0, the toast is displayed indefinitely until manually
     * dismissed.
     * <p>
     * Toasts cannot disappear while being hovered, pressed (on touchscreen), or
     * have keyboard focus inside them.
     * @param timeout the timeout
     */
    public void setTimeout(int timeout) {
        try {
            DowncallHandles.adw_toast_set_timeout.invokeExact(
                    handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title that will be displayed on the toast.
     * <p>
     * The title can be marked up with the Pango text markup language.
     * <p>
     * Setting a title will unset {@code Toast:custom-title}.
     * <p>
     * If {@code Toast:custom-title} is set, it will be used instead.
     * @param title a title
     */
    public void setTitle(java.lang.String title) {
        try {
            DowncallHandles.adw_toast_set_title.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(title, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_toast_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ButtonClicked {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceToast) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ButtonClicked.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted after the button has been clicked.
     * <p>
     * It can be used as an alternative to setting an action.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Toast.ButtonClicked> onButtonClicked(Toast.ButtonClicked handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("button-clicked"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Dismissed {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceToast) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Dismissed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the toast has been dismissed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Toast.Dismissed> onDismissed(Toast.Dismissed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("dismissed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Toast.Builder} object constructs a {@link Toast} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Toast.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Toast} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Toast}.
         * @return A new instance of {@code Toast} with the properties 
         *         that were set in the Builder object.
         */
        public Toast build() {
            return (Toast) org.gtk.gobject.GObject.newWithProperties(
                Toast.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The name of the associated action.
         * <p>
         * It will be activated when clicking the button.
         * <p>
         * See {@code Toast:action-target}.
         * @param actionName The value for the {@code action-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActionName(java.lang.String actionName) {
            names.add("action-name");
            values.add(org.gtk.gobject.Value.create(actionName));
            return this;
        }
        
        /**
         * The parameter for action invocations.
         * @param actionTarget The value for the {@code action-target} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActionTarget(org.gtk.glib.Variant actionTarget) {
            names.add("action-target");
            values.add(org.gtk.gobject.Value.create(actionTarget));
            return this;
        }
        
        /**
         * The label to show on the button.
         * <p>
         * Underlines in the button text can be used to indicate a mnemonic.
         * <p>
         * If set to {@code NULL}, the button won't be shown.
         * <p>
         * See {@code Toast:action-name}.
         * @param buttonLabel The value for the {@code button-label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setButtonLabel(java.lang.String buttonLabel) {
            names.add("button-label");
            values.add(org.gtk.gobject.Value.create(buttonLabel));
            return this;
        }
        
        /**
         * The custom title widget.
         * <p>
         * It will be displayed instead of the title if set. In this case,
         * {@code Toast:title} is ignored.
         * <p>
         * Setting a custom title will unset {@code Toast:title}.
         * @param customTitle The value for the {@code custom-title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCustomTitle(org.gtk.gtk.Widget customTitle) {
            names.add("custom-title");
            values.add(org.gtk.gobject.Value.create(customTitle));
            return this;
        }
        
        /**
         * The priority of the toast.
         * <p>
         * Priority controls how the toast behaves when another toast is already
         * being displayed.
         * <p>
         * If the priority is {@code ADW_TOAST_PRIORITY_NORMAL}, the toast will be queued.
         * <p>
         * If the priority is {@code ADW_TOAST_PRIORITY_HIGH}, the toast will be displayed
         * immediately, pushing the previous toast into the queue instead.
         * @param priority The value for the {@code priority} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPriority(org.gnome.adw.ToastPriority priority) {
            names.add("priority");
            values.add(org.gtk.gobject.Value.create(priority));
            return this;
        }
        
        /**
         * The timeout of the toast, in seconds.
         * <p>
         * If timeout is 0, the toast is displayed indefinitely until manually
         * dismissed.
         * <p>
         * Toasts cannot disappear while being hovered, pressed (on touchscreen), or
         * have keyboard focus inside them.
         * @param timeout The value for the {@code timeout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimeout(int timeout) {
            names.add("timeout");
            values.add(org.gtk.gobject.Value.create(timeout));
            return this;
        }
        
        /**
         * The title of the toast.
         * <p>
         * The title can be marked up with the Pango text markup language.
         * <p>
         * Setting a title will unset {@code Toast:custom-title}.
         * <p>
         * If {@code Toast:custom-title} is set, it will be used instead.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_toast_new = Interop.downcallHandle(
            "adw_toast_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_new_format = Interop.downcallHandle(
            "adw_toast_new_format",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle adw_toast_dismiss = Interop.downcallHandle(
            "adw_toast_dismiss",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_get_action_name = Interop.downcallHandle(
            "adw_toast_get_action_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_get_action_target_value = Interop.downcallHandle(
            "adw_toast_get_action_target_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_get_button_label = Interop.downcallHandle(
            "adw_toast_get_button_label",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_get_custom_title = Interop.downcallHandle(
            "adw_toast_get_custom_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_get_priority = Interop.downcallHandle(
            "adw_toast_get_priority",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_get_timeout = Interop.downcallHandle(
            "adw_toast_get_timeout",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_get_title = Interop.downcallHandle(
            "adw_toast_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_set_action_name = Interop.downcallHandle(
            "adw_toast_set_action_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_set_action_target = Interop.downcallHandle(
            "adw_toast_set_action_target",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle adw_toast_set_action_target_value = Interop.downcallHandle(
            "adw_toast_set_action_target_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_set_button_label = Interop.downcallHandle(
            "adw_toast_set_button_label",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_set_custom_title = Interop.downcallHandle(
            "adw_toast_set_custom_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_set_detailed_action_name = Interop.downcallHandle(
            "adw_toast_set_detailed_action_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_set_priority = Interop.downcallHandle(
            "adw_toast_set_priority",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_toast_set_timeout = Interop.downcallHandle(
            "adw_toast_set_timeout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_toast_set_title = Interop.downcallHandle(
            "adw_toast_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_get_type = Interop.downcallHandle(
            "adw_toast_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
