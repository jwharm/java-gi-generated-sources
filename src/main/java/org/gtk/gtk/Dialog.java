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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Window.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Dialog proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Dialog(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Dialog> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Dialog(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_dialog_new.invokeExact();
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
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithButtons(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, @Nullable java.lang.String firstButtonText, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_dialog_new_with_buttons.invokeExact(
                        (Addressable) (title == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(title, SCOPE)),
                        (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                        flags.getValue(),
                        (Addressable) (firstButtonText == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(firstButtonText, SCOPE)),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
     * @param varargs response ID for first button, then additional buttons, ending with {@code null}
     * @return a new {@code GtkDialog}
     */
    public static Dialog newWithButtons(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, @Nullable java.lang.String firstButtonText, java.lang.Object... varargs) {
        var RESULT = constructNewWithButtons(title, parent, flags, firstButtonText, varargs);
        var OBJECT = (org.gtk.gtk.Dialog) Interop.register(RESULT, org.gtk.gtk.Dialog.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
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
    public void addActionWidget(org.gtk.gtk.Widget child, int responseId) {
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
    public org.gtk.gtk.Widget addButton(java.lang.String buttonText, int responseId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_dialog_add_button.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(buttonText, SCOPE),
                        responseId);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Adds multiple buttons.
     * <p>
     * This is the same as calling {@link Dialog#addButton}
     * repeatedly. The variable argument list should be {@code null}-terminated
     * as with {@link Dialog#newWithButtons}. Each button must have both
     * text and response ID.
     * @param firstButtonText button text
     * @param varargs response ID for first button, then more text-response_id pairs
     */
    public void addButtons(java.lang.String firstButtonText, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_dialog_add_buttons.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(firstButtonText, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Returns the content area of {@code dialog}.
     * @return the content area {@code GtkBox}.
     */
    public org.gtk.gtk.Box getContentArea() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_dialog_get_content_area.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Box) Interop.register(RESULT, org.gtk.gtk.Box.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the header bar of {@code dialog}.
     * <p>
     * Note that the headerbar is only used by the dialog if the
     * {@code Gtk.Dialog:use-header-bar} property is {@code true}.
     * @return the header bar
     */
    public org.gtk.gtk.HeaderBar getHeaderBar() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_dialog_get_header_bar.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.HeaderBar) Interop.register(RESULT, org.gtk.gtk.HeaderBar.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the response id of a widget in the action area
     * of a dialog.
     * @param widget a widget in the action area of {@code dialog}
     * @return the response id of {@code widget}, or {@link ResponseType#NONE}
     *  if {@code widget} doesn’t have a response id set.
     */
    public int getResponseForWidget(org.gtk.gtk.Widget widget) {
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
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
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
            RESULT = (long) DowncallHandles.gtk_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Close} callback.
     */
    @FunctionalInterface
    public interface Close {
    
        /**
         * Emitted when the user uses a keybinding to close the dialog.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is the Escape key.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDialog) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Close.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the user uses a keybinding to close the dialog.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is the Escape key.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Dialog.Close> onClose(Dialog.Close handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("close", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Response} callback.
     */
    @FunctionalInterface
    public interface Response {
    
        /**
         * Emitted when an action widget is clicked.
         * <p>
         * The signal is also emitted when the dialog receives a
         * delete event, and when {@link Dialog#response} is called.
         * On a delete event, the response ID is {@link ResponseType#DELETE_EVENT}.
         * Otherwise, it depends on which action widget was clicked.
         */
        void run(int responseId);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDialog, int responseId) {
            run(responseId);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Response.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when an action widget is clicked.
     * <p>
     * The signal is also emitted when the dialog receives a
     * delete event, and when {@link Dialog#response} is called.
     * On a delete event, the response ID is {@link ResponseType#DELETE_EVENT}.
     * Otherwise, it depends on which action widget was clicked.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Dialog.Response> onResponse(Dialog.Response handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("response", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Dialog.Builder} object constructs a {@link Dialog} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Dialog.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Window.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Dialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Dialog}.
         * @return A new instance of {@code Dialog} with the properties 
         *         that were set in the Builder object.
         */
        public Dialog build() {
            return (Dialog) org.gtk.gobject.GObject.newWithProperties(
                Dialog.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@code true} if the dialog uses a headerbar for action buttons
         * instead of the action-area.
         * <p>
         * For technical reasons, this property is declared as an integer
         * property, but you should only set it to {@code true} or {@code false}.
         * <p>
         * <strong>Creating a dialog with headerbar</strong><br/>
         * Builtin {@code GtkDialog} subclasses such as {@link ColorChooserDialog}
         * set this property according to platform conventions (using the
         * {@code Gtk.Settings:gtk-dialogs-use-header} setting).
         * <p>
         * Here is how you can achieve the same:
         * <pre>{@code c
         * g_object_get (settings, "gtk-dialogs-use-header", &header, NULL);
         * dialog = g_object_new (GTK_TYPE_DIALOG, header, TRUE, NULL);
         * }</pre>
         * @param useHeaderBar The value for the {@code use-header-bar} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseHeaderBar(int useHeaderBar) {
            names.add("use-header-bar");
            values.add(org.gtk.gobject.Value.create(useHeaderBar));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_dialog_new = Interop.downcallHandle(
                "gtk_dialog_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_dialog_new_with_buttons = Interop.downcallHandle(
                "gtk_dialog_new_with_buttons",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gtk_dialog_add_action_widget = Interop.downcallHandle(
                "gtk_dialog_add_action_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_dialog_add_button = Interop.downcallHandle(
                "gtk_dialog_add_button",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_dialog_add_buttons = Interop.downcallHandle(
                "gtk_dialog_add_buttons",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gtk_dialog_get_content_area = Interop.downcallHandle(
                "gtk_dialog_get_content_area",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_dialog_get_header_bar = Interop.downcallHandle(
                "gtk_dialog_get_header_bar",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_dialog_get_response_for_widget = Interop.downcallHandle(
                "gtk_dialog_get_response_for_widget",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_dialog_get_widget_for_response = Interop.downcallHandle(
                "gtk_dialog_get_widget_for_response",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_dialog_response = Interop.downcallHandle(
                "gtk_dialog_response",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_dialog_set_default_response = Interop.downcallHandle(
                "gtk_dialog_set_default_response",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_dialog_set_response_sensitive = Interop.downcallHandle(
                "gtk_dialog_set_response_sensitive",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_dialog_get_type = Interop.downcallHandle(
                "gtk_dialog_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_dialog_get_type != null;
    }
}
