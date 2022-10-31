package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Dialogs are a convenient way to prompt the user for a small amount
 * of input.
 * <p>
 * <img src="./doc-files/dialog.png" alt="An example GtkDialog">
 * <p>
 * Typical uses are to display a message, ask a question, or anything else
 * that does not require extensive effort on the user’s part.
 * <p>
 * The main area of a {@code GtkDialog} is called the "content area", and is yours
 * to populate with widgets such a {@code GtkLabel} or {@code GtkEntry}, to present
 * your information, questions, or tasks to the user.
 * <p>
 * In addition, dialogs allow you to add "action widgets". Most commonly,
 * action widgets are buttons. Depending on the platform, action widgets may
 * be presented in the header bar at the top of the window, or at the bottom
 * of the window. To add action widgets, create your {@code GtkDialog} using
 * {@link Dialog#newWithButtons}, or use
 * {@link Dialog#addButton}, {@link Dialog#addButtons},
 * or {@link Dialog#addActionWidget}.
 * <p>
 * {@code GtkDialogs} uses some heuristics to decide whether to add a close
 * button to the window decorations. If any of the action buttons use
 * the response ID {@link ResponseType#CLOSE} or {@link ResponseType#CANCEL}, the
 * close button is omitted.
 * <p>
 * Clicking a button that was added as an action widget will emit the
 * {@code Gtk.Dialog::response} signal with a response ID that you specified.
 * GTK will never assign a meaning to positive response IDs; these are
 * entirely user-defined. But for convenience, you can use the response
 * IDs in the {@code Gtk.ResponseType} enumeration (these all have values
 * less than zero). If a dialog receives a delete event, the
 * {@code Gtk.Dialog::response} signal will be emitted with the
 * {@link ResponseType#DELETE_EVENT} response ID.
 * <p>
 * Dialogs are created with a call to {@link Dialog#Dialog} or
 * {@link Dialog#newWithButtons}. The latter is recommended; it allows
 * you to set the dialog title, some convenient flags, and add buttons.
 * <p>
 * A “modal” dialog (that is, one which freezes the rest of the application
 * from user input), can be created by calling {@link Window#setModal}
 * on the dialog. When using {@link Dialog#newWithButtons}, you can also
 * pass the {@link DialogFlags#MODAL} flag to make a dialog modal.
 * <p>
 * For the simple dialog in the following example, a {@link MessageDialog}
 * would save some effort. But you’d need to create the dialog contents manually
 * if you had more than a simple message in the dialog.
 * <p>
 * An example for simple {@code GtkDialog} usage:
 * <pre>{@code c
 * // Function to open a dialog box with a message
 * void
 * quick_message (GtkWindow *parent, char *message)
 * {
 *  GtkWidget *dialog, *label, *content_area;
 *  GtkDialogFlags flags;
 * 
 *  // Create the widgets
 *  flags = GTK_DIALOG_DESTROY_WITH_PARENT;
 *  dialog = gtk_dialog_new_with_buttons ("Message",
 *                                        parent,
 *                                        flags,
 *                                        _("_OK"),
 *                                        GTK_RESPONSE_NONE,
 *                                        NULL);
 *  content_area = gtk_dialog_get_content_area (GTK_DIALOG (dialog));
 *  label = gtk_label_new (message);
 * 
 *  // Ensure that the dialog box is destroyed when the user responds
 * 
 *  g_signal_connect_swapped (dialog,
 *                            "response",
 *                            G_CALLBACK (gtk_window_destroy),
 *                            dialog);
 * 
 *  // Add the label, and show everything we’ve added
 * 
 *  gtk_box_append (GTK_BOX (content_area), label);
 *  gtk_widget_show (dialog);
 * }
 * }</pre>
 * <p>
 * <strong>GtkDialog as GtkBuildable</strong><br/>
 * The {@code GtkDialog} implementation of the {@code GtkBuildable} interface exposes the
 * {@code content_area} as an internal child with the name “content_area”.
 * <p>
 * {@code GtkDialog} supports a custom {@code <action-widgets>} element, which can contain
 * multiple {@code <action-widget>} elements. The “response” attribute specifies a
 * numeric response, and the content of the element is the id of widget
 * (which should be a child of the dialogs {@code action_area}). To mark a response
 * as default, set the “default” attribute of the {@code <action-widget>} element
 * to true.
 * <p>
 * {@code GtkDialog} supports adding action widgets by specifying “action” as
 * the “type” attribute of a {@code <child>} element. The widget will be added
 * either to the action area or the headerbar of the dialog, depending
 * on the “use-header-bar” property. The response id has to be associated
 * with the action widget using the {@code <action-widgets>} element.
 * <p>
 * An example of a {@code GtkDialog} UI definition fragment:
 * <pre>{@code xml
 * <object class="GtkDialog" id="dialog1">
 *   <child type="action">
 *     <object class="GtkButton" id="button_cancel"/>
 *   </child>
 *   <child type="action">
 *     <object class="GtkButton" id="button_ok">
 *     </object>
 *   </child>
 *   <action-widgets>
 *     <action-widget response="cancel">button_cancel</action-widget>
 *     <action-widget response="ok" default="true">button_ok</action-widget>
 *   </action-widgets>
 * </object>
 * }</pre>
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkDialog} uses the {@link AccessibleRole#DIALOG} role.
 */
public class Dialog extends org.gtk.gtk.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDialog";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Window.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Window parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Window(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public Dialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Dialog if its GType is a (or inherits from) "GtkDialog".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Dialog" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkDialog", a ClassCastException will be thrown.
     */
    public static Dialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkDialog"))) {
            return new Dialog(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkDialog");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_dialog_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new dialog box.
     * <p>
     * Widgets should not be packed into the {@code GtkWindow}
     * directly, but into the {@code content_area} and {@code action_area},
     * as described above.
     */
    public Dialog() {
        super(constructNew());
    }
    
    private static Refcounted constructNewWithButtons(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @Nullable java.lang.String firstButtonText) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new {@code GtkDialog} with the given title and transient parent.
     * <p>
     * The {@code flags} argument can be used to make the dialog modal, have it
     * destroyed along with its transient parent, or make it use a headerbar.
     * <p>
     * Button text/response ID pairs should be listed in pairs, with a {@code null}
     * pointer ending the list. Button text can be arbitrary text. A response
     * ID can be any positive number, or one of the values in the
     * {@code Gtk.ResponseType} enumeration. If the user clicks one of these
     * buttons, {@code GtkDialog} will emit the {@code Gtk.Dialog::response} signal
     * with the corresponding response ID.
     * <p>
     * If a {@code GtkDialog} receives a delete event, it will emit ::response with a
     * response ID of {@link ResponseType#DELETE_EVENT}.
     * <p>
     * However, destroying a dialog does not emit the ::response signal;
     * so be careful relying on ::response when using the
     * {@link DialogFlags#DESTROY_WITH_PARENT} flag.
     * <p>
     * Here’s a simple example:
     * <pre>{@code c
     * GtkWindow *main_app_window; // Window the dialog should show up on
     * GtkWidget *dialog;
     * GtkDialogFlags flags = GTK_DIALOG_MODAL | GTK_DIALOG_DESTROY_WITH_PARENT;
     * dialog = gtk_dialog_new_with_buttons ("My dialog",
     *                                       main_app_window,
     *                                       flags,
     *                                       _("_OK"),
     *                                       GTK_RESPONSE_ACCEPT,
     *                                       _("_Cancel"),
     *                                       GTK_RESPONSE_REJECT,
     *                                       NULL);
     * }</pre>
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @param flags from {@code GtkDialogFlags}
     * @param firstButtonText text to go in first button
     * @return a new {@code GtkDialog}
     */
    public static Dialog newWithButtons(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @Nullable java.lang.String firstButtonText) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Adds an activatable widget to the action area of a {@code GtkDialog}.
     * <p>
     * GTK connects a signal handler that will emit the
     * {@code Gtk.Dialog::response} signal on the dialog when the widget
     * is activated. The widget is appended to the end of the dialog’s action
     * area.
     * <p>
     * If you want to add a non-activatable widget, simply pack it into
     * the {@code action_area} field of the {@code GtkDialog} struct.
     * @param child an activatable widget
     * @param responseId response ID for {@code child}
     */
    public void addActionWidget(@NotNull org.gtk.gtk.Widget child, int responseId) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_dialog_add_action_widget.invokeExact(
                    handle(),
                    child.handle(),
                    responseId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a button with the given text.
     * <p>
     * GTK arranges things so that clicking the button will emit the
     * {@code Gtk.Dialog::response} signal with the given {@code response_id}.
     * The button is appended to the end of the dialog’s action area.
     * The button widget is returned, but usually you don’t need it.
     * @param buttonText text of button
     * @param responseId response ID for the button
     * @return the {@code GtkButton} widget that was added
     */
    public @NotNull org.gtk.gtk.Widget addButton(@NotNull java.lang.String buttonText, int responseId) {
        java.util.Objects.requireNonNull(buttonText, "Parameter 'buttonText' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_dialog_add_button.invokeExact(
                    handle(),
                    Interop.allocateNativeString(buttonText),
                    responseId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds multiple buttons.
     * <p>
     * This is the same as calling {@link Dialog#addButton}
     * repeatedly. The variable argument list should be {@code null}-terminated
     * as with {@link Dialog#newWithButtons}. Each button must have both
     * text and response ID.
     * @param firstButtonText button text
     */
    public void addButtons(@NotNull java.lang.String firstButtonText) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Returns the content area of {@code dialog}.
     * @return the content area {@code GtkBox}.
     */
    public @NotNull org.gtk.gtk.Box getContentArea() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_dialog_get_content_area.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Box(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the header bar of {@code dialog}.
     * <p>
     * Note that the headerbar is only used by the dialog if the
     * {@code Gtk.Dialog:use-header-bar} property is {@code true}.
     * @return the header bar
     */
    public @NotNull org.gtk.gtk.HeaderBar getHeaderBar() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_dialog_get_header_bar.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.HeaderBar(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the response id of a widget in the action area
     * of a dialog.
     * @param widget a widget in the action area of {@code dialog}
     * @return the response id of {@code widget}, or {@link ResponseType#NONE}
     *  if {@code widget} doesn’t have a response id set.
     */
    public int getResponseForWidget(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_dialog_get_response_for_widget.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the widget button that uses the given response ID in the action area
     * of a dialog.
     * @param responseId the response ID used by the {@code dialog} widget
     * @return the {@code widget} button that uses the given
     *   {@code response_id}
     */
    public @Nullable org.gtk.gtk.Widget getWidgetForResponse(int responseId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_dialog_get_widget_for_response.invokeExact(
                    handle(),
                    responseId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Emits the ::response signal with the given response ID.
     * <p>
     * Used to indicate that the user has responded to the dialog in some way.
     * @param responseId response ID
     */
    public void response(int responseId) {
        try {
            DowncallHandles.gtk_dialog_response.invokeExact(
                    handle(),
                    responseId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default widget for the dialog based on the response ID.
     * <p>
     * Pressing “Enter” normally activates the default widget.
     * @param responseId a response ID
     */
    public void setDefaultResponse(int responseId) {
        try {
            DowncallHandles.gtk_dialog_set_default_response.invokeExact(
                    handle(),
                    responseId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenient way to sensitize/desensitize dialog buttons.
     * <p>
     * Calls {@code gtk_widget_set_sensitive (widget, @setting)}
     * for each widget in the dialog’s action area with the given {@code response_id}.
     * @param responseId a response ID
     * @param setting {@code true} for sensitive
     */
    public void setResponseSensitive(int responseId, boolean setting) {
        try {
            DowncallHandles.gtk_dialog_set_response_sensitive.invokeExact(
                    handle(),
                    responseId,
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Close {
        void signalReceived(Dialog source);
    }
    
    /**
     * Emitted when the user uses a keybinding to close the dialog.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is the Escape key.
     */
    public Signal<Dialog.Close> onClose(Dialog.Close handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Dialog.Callbacks.class, "signalDialogClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Dialog.Close>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Response {
        void signalReceived(Dialog source, int responseId);
    }
    
    /**
     * Emitted when an action widget is clicked.
     * <p>
     * The signal is also emitted when the dialog receives a
     * delete event, and when {@link Dialog#response} is called.
     * On a delete event, the response ID is {@link ResponseType#DELETE_EVENT}.
     * Otherwise, it depends on which action widget was clicked.
     */
    public Signal<Dialog.Response> onResponse(Dialog.Response handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("response"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Dialog.Callbacks.class, "signalDialogResponse",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Dialog.Response>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_dialog_new = Interop.downcallHandle(
            "gtk_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_dialog_new_with_buttons = Interop.downcallHandle(
            "gtk_dialog_new_with_buttons",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_dialog_add_action_widget = Interop.downcallHandle(
            "gtk_dialog_add_action_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_dialog_add_button = Interop.downcallHandle(
            "gtk_dialog_add_button",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_dialog_add_buttons = Interop.downcallHandle(
            "gtk_dialog_add_buttons",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_dialog_get_content_area = Interop.downcallHandle(
            "gtk_dialog_get_content_area",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_dialog_get_header_bar = Interop.downcallHandle(
            "gtk_dialog_get_header_bar",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_dialog_get_response_for_widget = Interop.downcallHandle(
            "gtk_dialog_get_response_for_widget",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_dialog_get_widget_for_response = Interop.downcallHandle(
            "gtk_dialog_get_widget_for_response",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_dialog_response = Interop.downcallHandle(
            "gtk_dialog_response",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_dialog_set_default_response = Interop.downcallHandle(
            "gtk_dialog_set_default_response",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_dialog_set_response_sensitive = Interop.downcallHandle(
            "gtk_dialog_set_response_sensitive",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalDialogClose(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Dialog.Close) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Dialog(Refcounted.get(source)));
        }
        
        public static void signalDialogResponse(MemoryAddress source, int responseId, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Dialog.Response) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Dialog(Refcounted.get(source)), responseId);
        }
    }
}
