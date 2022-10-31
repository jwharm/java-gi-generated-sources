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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public AppChooserButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to AppChooserButton if its GType is a (or inherits from) "GtkAppChooserButton".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "AppChooserButton" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAppChooserButton", a ClassCastException will be thrown.
     */
    public static AppChooserButton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkAppChooserButton"))) {
            return new AppChooserButton(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAppChooserButton");
        }
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String contentType) {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_app_chooser_button_new.invokeExact(
                    Interop.allocateNativeString(contentType)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkAppChooserButton} for applications
     * that can handle content of the given type.
     * @param contentType the content type to show applications for
     */
    public AppChooserButton(@NotNull java.lang.String contentType) {
        super(constructNew(contentType));
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
    public void appendCustomItem(@NotNull java.lang.String name, @NotNull java.lang.String label, @NotNull org.gtk.gio.Icon icon) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(label, "Parameter 'label' must not be null");
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        try {
            DowncallHandles.gtk_app_chooser_button_append_custom_item.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(label),
                    icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends a separator to the list of applications that is shown
     * in the popup.
     */
    public void appendSeparator() {
        try {
            DowncallHandles.gtk_app_chooser_button_append_separator.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_button_get_heading.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the dialog is modal.
     * @return {@code true} if the dialog is modal
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_button_get_modal.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the dropdown menu should show the default
     * application at the top.
     * @return the value of {@code Gtk.AppChooserButton:show-default-item}
     */
    public boolean getShowDefaultItem() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_button_get_show_default_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the dropdown menu shows an item
     * for a {@code GtkAppChooserDialog}.
     * @return the value of {@code Gtk.AppChooserButton:show-dialog-item}
     */
    public boolean getShowDialogItem() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_button_get_show_dialog_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public void setActiveCustomItem(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gtk_app_chooser_button_set_active_custom_item.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text to display at the top of the dialog.
     * <p>
     * If the heading is not set, the dialog displays a default text.
     * @param heading a string containing Pango markup
     */
    public void setHeading(@NotNull java.lang.String heading) {
        java.util.Objects.requireNonNull(heading, "Parameter 'heading' must not be null");
        try {
            DowncallHandles.gtk_app_chooser_button_set_heading.invokeExact(
                    handle(),
                    Interop.allocateNativeString(heading));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
                    modal ? 1 : 0);
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
                    setting ? 1 : 0);
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
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(AppChooserButton source);
    }
    
    /**
     * Emitted to when the button is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkAppChooserButton} is an action signal and
     * emitting it causes the button to pop up its dialog.
     */
    public Signal<AppChooserButton.Activate> onActivate(AppChooserButton.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserButton.Callbacks.class, "signalAppChooserButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppChooserButton.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(AppChooserButton source);
    }
    
    /**
     * Emitted when the active application changes.
     */
    public Signal<AppChooserButton.Changed> onChanged(AppChooserButton.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserButton.Callbacks.class, "signalAppChooserButtonChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppChooserButton.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CustomItemActivated {
        void signalReceived(AppChooserButton source, @NotNull java.lang.String itemName);
    }
    
    /**
     * Emitted when a custom item is activated.
     * <p>
     * Use {@link AppChooserButton#appendCustomItem},
     * to add custom items.
     */
    public Signal<AppChooserButton.CustomItemActivated> onCustomItemActivated(@Nullable String detail, AppChooserButton.CustomItemActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("custom-item-activated" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserButton.Callbacks.class, "signalAppChooserButtonCustomItemActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppChooserButton.CustomItemActivated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_app_chooser_button_new = Interop.downcallHandle(
            "gtk_app_chooser_button_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_button_append_custom_item = Interop.downcallHandle(
            "gtk_app_chooser_button_append_custom_item",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_button_append_separator = Interop.downcallHandle(
            "gtk_app_chooser_button_append_separator",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_button_get_heading = Interop.downcallHandle(
            "gtk_app_chooser_button_get_heading",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_button_get_modal = Interop.downcallHandle(
            "gtk_app_chooser_button_get_modal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_button_get_show_default_item = Interop.downcallHandle(
            "gtk_app_chooser_button_get_show_default_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_button_get_show_dialog_item = Interop.downcallHandle(
            "gtk_app_chooser_button_get_show_dialog_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_active_custom_item = Interop.downcallHandle(
            "gtk_app_chooser_button_set_active_custom_item",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_heading = Interop.downcallHandle(
            "gtk_app_chooser_button_set_heading",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_modal = Interop.downcallHandle(
            "gtk_app_chooser_button_set_modal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_show_default_item = Interop.downcallHandle(
            "gtk_app_chooser_button_set_show_default_item",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_app_chooser_button_set_show_dialog_item = Interop.downcallHandle(
            "gtk_app_chooser_button_set_show_dialog_item",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalAppChooserButtonActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AppChooserButton.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppChooserButton(Refcounted.get(source)));
        }
        
        public static void signalAppChooserButtonChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AppChooserButton.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppChooserButton(Refcounted.get(source)));
        }
        
        public static void signalAppChooserButtonCustomItemActivated(MemoryAddress source, MemoryAddress itemName, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AppChooserButton.CustomItemActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppChooserButton(Refcounted.get(source)), Interop.getStringFrom(itemName));
        }
    }
}
