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
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkAppChooserButton} has a single CSS node with the name “appchooserbutton”.
 */
public class AppChooserButton extends Widget implements Accessible, AppChooser, Buildable, ConstraintTarget {

    public AppChooserButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AppChooserButton */
    public static AppChooserButton castFrom(org.gtk.gobject.Object gobject) {
        return new AppChooserButton(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_app_chooser_button_new = Interop.downcallHandle(
        "gtk_app_chooser_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String contentType) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_app_chooser_button_new.invokeExact(Interop.allocateNativeString(contentType)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkAppChooserButton} for applications
     * that can handle content of the given type.
     */
    public AppChooserButton(@NotNull java.lang.String contentType) {
        super(constructNew(contentType));
    }
    
    private static final MethodHandle gtk_app_chooser_button_append_custom_item = Interop.downcallHandle(
        "gtk_app_chooser_button_append_custom_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void appendCustomItem(@NotNull java.lang.String name, @NotNull java.lang.String label, @NotNull org.gtk.gio.Icon icon) {
        try {
            gtk_app_chooser_button_append_custom_item.invokeExact(handle(), Interop.allocateNativeString(name), Interop.allocateNativeString(label), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_button_append_separator = Interop.downcallHandle(
        "gtk_app_chooser_button_append_separator",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Appends a separator to the list of applications that is shown
     * in the popup.
     */
    public @NotNull void appendSeparator() {
        try {
            gtk_app_chooser_button_append_separator.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_button_get_heading = Interop.downcallHandle(
        "gtk_app_chooser_button_get_heading",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the text to display at the top of the dialog.
     */
    public @Nullable java.lang.String getHeading() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_app_chooser_button_get_heading.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_app_chooser_button_get_modal = Interop.downcallHandle(
        "gtk_app_chooser_button_get_modal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the dialog is modal.
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) gtk_app_chooser_button_get_modal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_app_chooser_button_get_show_default_item = Interop.downcallHandle(
        "gtk_app_chooser_button_get_show_default_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the dropdown menu should show the default
     * application at the top.
     */
    public boolean getShowDefaultItem() {
        int RESULT;
        try {
            RESULT = (int) gtk_app_chooser_button_get_show_default_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_app_chooser_button_get_show_dialog_item = Interop.downcallHandle(
        "gtk_app_chooser_button_get_show_dialog_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the dropdown menu shows an item
     * for a {@code GtkAppChooserDialog}.
     */
    public boolean getShowDialogItem() {
        int RESULT;
        try {
            RESULT = (int) gtk_app_chooser_button_get_show_dialog_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_app_chooser_button_set_active_custom_item = Interop.downcallHandle(
        "gtk_app_chooser_button_set_active_custom_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Selects a custom item.
     * <p>
     * See {@link AppChooserButton#appendCustomItem}.
     * <p>
     * Use {@link AppChooser#refresh} to bring the selection
     * to its initial state.
     */
    public @NotNull void setActiveCustomItem(@NotNull java.lang.String name) {
        try {
            gtk_app_chooser_button_set_active_custom_item.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_button_set_heading = Interop.downcallHandle(
        "gtk_app_chooser_button_set_heading",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text to display at the top of the dialog.
     * <p>
     * If the heading is not set, the dialog displays a default text.
     */
    public @NotNull void setHeading(@NotNull java.lang.String heading) {
        try {
            gtk_app_chooser_button_set_heading.invokeExact(handle(), Interop.allocateNativeString(heading));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_button_set_modal = Interop.downcallHandle(
        "gtk_app_chooser_button_set_modal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the dialog should be modal.
     */
    public @NotNull void setModal(@NotNull boolean modal) {
        try {
            gtk_app_chooser_button_set_modal.invokeExact(handle(), modal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_button_set_show_default_item = Interop.downcallHandle(
        "gtk_app_chooser_button_set_show_default_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the dropdown menu of this button should show the
     * default application for the given content type at top.
     */
    public @NotNull void setShowDefaultItem(@NotNull boolean setting) {
        try {
            gtk_app_chooser_button_set_show_default_item.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_button_set_show_dialog_item = Interop.downcallHandle(
        "gtk_app_chooser_button_set_show_dialog_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the dropdown menu of this button should show an
     * entry to trigger a {@code GtkAppChooserDialog}.
     */
    public @NotNull void setShowDialogItem(@NotNull boolean setting) {
        try {
            gtk_app_chooser_button_set_show_dialog_item.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(AppChooserButton source);
    }
    
    /**
     * Emitted to when the button is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkAppChooserButton} is an action signal and
     * emitting it causes the button to pop up its dialog.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserButton.Callbacks.class, "signalAppChooserButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(AppChooserButton source);
    }
    
    /**
     * Emitted when the active application changes.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserButton.Callbacks.class, "signalAppChooserButtonChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CustomItemActivatedHandler {
        void signalReceived(AppChooserButton source, @NotNull java.lang.String itemName);
    }
    
    /**
     * Emitted when a custom item is activated.
     * <p>
     * Use {@link AppChooserButton#appendCustomItem},
     * to add custom items.
     */
    public SignalHandle onCustomItemActivated(CustomItemActivatedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("custom-item-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserButton.Callbacks.class, "signalAppChooserButtonCustomItemActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalAppChooserButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (AppChooserButton.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new AppChooserButton(Refcounted.get(source)));
        }
        
        public static void signalAppChooserButtonChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (AppChooserButton.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new AppChooserButton(Refcounted.get(source)));
        }
        
        public static void signalAppChooserButtonCustomItemActivated(MemoryAddress source, MemoryAddress itemName, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (AppChooserButton.CustomItemActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new AppChooserButton(Refcounted.get(source)), itemName.getUtf8String(0));
        }
        
    }
}
