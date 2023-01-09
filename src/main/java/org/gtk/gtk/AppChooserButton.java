package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkAppChooserButton} lets the user select an application.
 * <p>
 * <img src="./doc-files/appchooserbutton.png" alt="An example GtkAppChooserButton">
 * <p>
 * Initially, a {@code GtkAppChooserButton} selects the first application
 * in its list, which will either be the most-recently used application
 * or, if {@code Gtk.AppChooserButton:show-default-item} is {@code true}, the
 * default application.
 * <p>
 * The list of applications shown in a {@code GtkAppChooserButton} includes
 * the recommended applications for the given content type. When
 * {@code Gtk.AppChooserButton:show-default-item} is set, the default
 * application is also included. To let the user chooser other applications,
 * you can set the {@code Gtk.AppChooserButton:show-dialog-item} property,
 * which allows to open a full {@link AppChooserDialog}.
 * <p>
 * It is possible to add custom items to the list, using
 * {@link AppChooserButton#appendCustomItem}. These items cause
 * the {@code Gtk.AppChooserButton::custom-item-activated} signal to be
 * emitted when they are selected.
 * <p>
 * To track changes in the selected application, use the
 * {@code Gtk.AppChooserButton::changed} signal.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkAppChooserButton} has a single CSS node with the name “appchooserbutton”.
 */
public class AppChooserButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.AppChooser, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAppChooserButton";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AppChooserButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AppChooserButton(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppChooserButton> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AppChooserButton(input);
    
    private static MemoryAddress constructNew(java.lang.String contentType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_button_new.invokeExact(Marshal.stringToAddress.marshal(contentType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@code GtkAppChooserButton} for applications
     * that can handle content of the given type.
     * @param contentType the content type to show applications for
     */
    public AppChooserButton(java.lang.String contentType) {
        super(constructNew(contentType));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Appends a custom item to the list of applications that is shown
     * in the popup.
     * <p>
     * The item name must be unique per-widget. Clients can use the
     * provided name as a detail for the
     * {@code Gtk.AppChooserButton::custom-item-activated} signal, to add a
     * callback for the activation of a particular custom item in the list.
     * <p>
     * See also {@link AppChooserButton#appendSeparator}.
     * @param name the name of the custom item
     * @param label the label for the custom item
     * @param icon the icon for the custom item
     */
    public void appendCustomItem(java.lang.String name, java.lang.String label, org.gtk.gio.Icon icon) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_app_chooser_button_append_custom_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        Marshal.stringToAddress.marshal(label, SCOPE),
                        icon.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Appends a separator to the list of applications that is shown
     * in the popup.
     */
    public void appendSeparator() {
        try {
            DowncallHandles.gtk_app_chooser_button_append_separator.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the text to display at the top of the dialog.
     * @return the text to display at the top of the dialog,
     *   or {@code null}, in which case a default text is displayed
     */
    public @Nullable java.lang.String getHeading() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_button_get_heading.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether the dialog is modal.
     * @return {@code true} if the dialog is modal
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_button_get_modal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the dropdown menu should show the default
     * application at the top.
     * @return the value of {@code Gtk.AppChooserButton:show-default-item}
     */
    public boolean getShowDefaultItem() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_button_get_show_default_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the dropdown menu shows an item
     * for a {@code GtkAppChooserDialog}.
     * @return the value of {@code Gtk.AppChooserButton:show-dialog-item}
     */
    public boolean getShowDialogItem() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_button_get_show_dialog_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Selects a custom item.
     * <p>
     * See {@link AppChooserButton#appendCustomItem}.
     * <p>
     * Use {@link AppChooser#refresh} to bring the selection
     * to its initial state.
     * @param name the name of the custom item
     */
    public void setActiveCustomItem(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_app_chooser_button_set_active_custom_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the text to display at the top of the dialog.
     * <p>
     * If the heading is not set, the dialog displays a default text.
     * @param heading a string containing Pango markup
     */
    public void setHeading(java.lang.String heading) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_app_chooser_button_set_heading.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(heading, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets whether the dialog should be modal.
     * @param modal {@code true} to make the dialog modal
     */
    public void setModal(boolean modal) {
        try {
            DowncallHandles.gtk_app_chooser_button_set_modal.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(modal, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the dropdown menu of this button should show the
     * default application for the given content type at top.
     * @param setting the new value for {@code Gtk.AppChooserButton:show-default-item}
     */
    public void setShowDefaultItem(boolean setting) {
        try {
            DowncallHandles.gtk_app_chooser_button_set_show_default_item.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the dropdown menu of this button should show an
     * entry to trigger a {@code GtkAppChooserDialog}.
     * @param setting the new value for {@code Gtk.AppChooserButton:show-dialog-item}
     */
    public void setShowDialogItem(boolean setting) {
        try {
            DowncallHandles.gtk_app_chooser_button_set_show_dialog_item.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_app_chooser_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Activate} callback.
     */
    @FunctionalInterface
    public interface Activate {
    
        /**
         * Emitted to when the button is activated.
         * <p>
         * The {@code ::activate} signal on {@code GtkAppChooserButton} is an action signal and
         * emitting it causes the button to pop up its dialog.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppChooserButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Activate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to when the button is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkAppChooserButton} is an action signal and
     * emitting it causes the button to pop up its dialog.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppChooserButton.Activate> onActivate(AppChooserButton.Activate handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
        /**
         * Emitted when the active application changes.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppChooserButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Changed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the active application changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppChooserButton.Changed> onChanged(AppChooserButton.Changed handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code CustomItemActivated} callback.
     */
    @FunctionalInterface
    public interface CustomItemActivated {
    
        /**
         * Emitted when a custom item is activated.
         * <p>
         * Use {@link AppChooserButton#appendCustomItem},
         * to add custom items.
         */
        void run(java.lang.String itemName);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppChooserButton, MemoryAddress itemName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(itemName, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CustomItemActivated.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a custom item is activated.
     * <p>
     * Use {@link AppChooserButton#appendCustomItem},
     * to add custom items.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppChooserButton.CustomItemActivated> onCustomItemActivated(@Nullable String detail, AppChooserButton.CustomItemActivated handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("custom-item-activated" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail)), SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link AppChooserButton.Builder} object constructs a {@link AppChooserButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AppChooserButton.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AppChooserButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppChooserButton}.
         * @return A new instance of {@code AppChooserButton} with the properties 
         *         that were set in the Builder object.
         */
        public AppChooserButton build() {
            return (AppChooserButton) org.gtk.gobject.GObject.newWithProperties(
                AppChooserButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The text to show at the top of the dialog that can be
         * opened from the button.
         * <p>
         * The string may contain Pango markup.
         * @param heading The value for the {@code heading} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeading(java.lang.String heading) {
            names.add("heading");
            values.add(org.gtk.gobject.Value.create(heading));
            return this;
        }
        
        /**
         * Whether the app chooser dialog should be modal.
         * @param modal The value for the {@code modal} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModal(boolean modal) {
            names.add("modal");
            values.add(org.gtk.gobject.Value.create(modal));
            return this;
        }
        
        /**
         * Determines whether the dropdown menu shows the default application
         * on top for the provided content type.
         * @param showDefaultItem The value for the {@code show-default-item} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowDefaultItem(boolean showDefaultItem) {
            names.add("show-default-item");
            values.add(org.gtk.gobject.Value.create(showDefaultItem));
            return this;
        }
        
        /**
         * Determines whether the dropdown menu shows an item to open
         * a {@code GtkAppChooserDialog}.
         * @param showDialogItem The value for the {@code show-dialog-item} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowDialogItem(boolean showDialogItem) {
            names.add("show-dialog-item");
            values.add(org.gtk.gobject.Value.create(showDialogItem));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_app_chooser_button_new = Interop.downcallHandle(
                "gtk_app_chooser_button_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_append_custom_item = Interop.downcallHandle(
                "gtk_app_chooser_button_append_custom_item",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_append_separator = Interop.downcallHandle(
                "gtk_app_chooser_button_append_separator",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_get_heading = Interop.downcallHandle(
                "gtk_app_chooser_button_get_heading",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_get_modal = Interop.downcallHandle(
                "gtk_app_chooser_button_get_modal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_get_show_default_item = Interop.downcallHandle(
                "gtk_app_chooser_button_get_show_default_item",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_get_show_dialog_item = Interop.downcallHandle(
                "gtk_app_chooser_button_get_show_dialog_item",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_active_custom_item = Interop.downcallHandle(
                "gtk_app_chooser_button_set_active_custom_item",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_heading = Interop.downcallHandle(
                "gtk_app_chooser_button_set_heading",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_modal = Interop.downcallHandle(
                "gtk_app_chooser_button_set_modal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_show_default_item = Interop.downcallHandle(
                "gtk_app_chooser_button_set_show_default_item",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_show_dialog_item = Interop.downcallHandle(
                "gtk_app_chooser_button_set_show_dialog_item",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_app_chooser_button_get_type = Interop.downcallHandle(
                "gtk_app_chooser_button_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_app_chooser_button_get_type != null;
    }
}
