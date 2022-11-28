package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkInfoBar} can be show messages to the user without a dialog.
 * <p>
 * <img src="./doc-files/info-bar.png" alt="An example GtkInfoBar">
 * <p>
 * It is often temporarily shown at the top or bottom of a document.
 * In contrast to {@link Dialog}, which has an action area at the
 * bottom, {@code GtkInfoBar} has an action area at the side.
 * <p>
 * The API of {@code GtkInfoBar} is very similar to {@code GtkDialog}, allowing you
 * to add buttons to the action area with {@link InfoBar#addButton}
 * or {@link InfoBar#newWithButtons}. The sensitivity of action widgets
 * can be controlled with {@link InfoBar#setResponseSensitive}.
 * <p>
 * To add widgets to the main content area of a {@code GtkInfoBar}, use
 * {@link InfoBar#addChild}.
 * <p>
 * Similar to {@link MessageDialog}, the contents of a {@code GtkInfoBar}
 * can by classified as error message, warning, informational message, etc,
 * by using {@link InfoBar#setMessageType}. GTK may use the message
 * type to determine how the message is displayed.
 * <p>
 * A simple example for using a {@code GtkInfoBar}:
 * <pre>{@code c
 * GtkWidget *message_label;
 * GtkWidget *widget;
 * GtkWidget *grid;
 * GtkInfoBar *bar;
 * 
 * // set up info bar
 * widget = gtk_info_bar_new ();
 * bar = GTK_INFO_BAR (widget);
 * grid = gtk_grid_new ();
 * 
 * message_label = gtk_label_new ("");
 * gtk_info_bar_add_child (bar, message_label);
 * gtk_info_bar_add_button (bar,
 *                          _("_OK"),
 *                          GTK_RESPONSE_OK);
 * g_signal_connect (bar,
 *                   "response",
 *                   G_CALLBACK (gtk_widget_hide),
 *                   NULL);
 * gtk_grid_attach (GTK_GRID (grid),
 *                  widget,
 *                  0, 2, 1, 1);
 * 
 * // ...
 * 
 * // show an error message
 * gtk_label_set_text (GTK_LABEL (message_label), "An error occurred!");
 * gtk_info_bar_set_message_type (bar, GTK_MESSAGE_ERROR);
 * gtk_widget_show (bar);
 * }</pre>
 * <p>
 * <strong>GtkInfoBar as GtkBuildable</strong><br/>
 * {@code GtkInfoBar} supports a custom {@code <action-widgets>} element, which can contain
 * multiple {@code <action-widget>} elements. The “response” attribute specifies a
 * numeric response, and the content of the element is the id of widget
 * (which should be a child of the dialogs {@code action_area}).
 * <p>
 * {@code GtkInfoBar} supports adding action widgets by specifying “action” as
 * the “type” attribute of a {@code <child>} element. The widget will be added
 * either to the action area. The response id has to be associated
 * with the action widget using the {@code <action-widgets>} element.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkInfoBar} has a single CSS node with name infobar. The node may get
 * one of the style classes .info, .warning, .error or .question, depending
 * on the message type.
 * If the info bar shows a close button, that button will have the .close
 * style class applied.
 */
public class InfoBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkInfoBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a InfoBar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InfoBar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to InfoBar if its GType is a (or inherits from) "GtkInfoBar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code InfoBar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkInfoBar", a ClassCastException will be thrown.
     */
    public static InfoBar castFrom(org.gtk.gobject.Object gobject) {
            return new InfoBar(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_info_bar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkInfoBar} object.
     */
    public InfoBar() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewWithButtons(@Nullable java.lang.String firstButtonText, java.lang.Object... varargs) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_info_bar_new_with_buttons.invokeExact(
                    (Addressable) (firstButtonText == null ? MemoryAddress.NULL : Interop.allocateNativeString(firstButtonText)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkInfoBar} with buttons.
     * <p>
     * Button text/response ID pairs should be listed, with a {@code null} pointer
     * ending the list. A response ID can be any positive number,
     * or one of the values in the {@code GtkResponseType} enumeration. If the
     * user clicks one of these dialog buttons, GtkInfoBar will emit
     * the {@code Gtk.InfoBar::response} signal with the corresponding
     * response ID.
     * @param firstButtonText ext to go in first button
     * @param varargs response ID for first button, then additional buttons, ending
     *    with {@code null}
     * @return a new {@code GtkInfoBar}
     */
    public static InfoBar newWithButtons(@Nullable java.lang.String firstButtonText, java.lang.Object... varargs) {
        return new InfoBar(constructNewWithButtons(firstButtonText, varargs), Ownership.NONE);
    }
    
    /**
     * Add an activatable widget to the action area of a {@code GtkInfoBar}.
     * <p>
     * This also connects a signal handler that will emit the
     * {@code Gtk.InfoBar::response} signal on the message area
     * when the widget is activated. The widget is appended to the
     * end of the message areas action area.
     * @param child an activatable widget
     * @param responseId response ID for {@code child}
     */
    public void addActionWidget(@NotNull org.gtk.gtk.Widget child, int responseId) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_info_bar_add_action_widget.invokeExact(
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
     * Clicking the button will emit the {@code Gtk.InfoBar::response}
     * signal with the given response_id. The button is appended to the
     * end of the info bars's action area. The button widget is returned,
     * but usually you don't need it.
     * @param buttonText text of button
     * @param responseId response ID for the button
     * @return the {@code GtkButton} widget
     * that was added
     */
    public @NotNull org.gtk.gtk.Button addButton(@NotNull java.lang.String buttonText, int responseId) {
        java.util.Objects.requireNonNull(buttonText, "Parameter 'buttonText' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_info_bar_add_button.invokeExact(
                    handle(),
                    Interop.allocateNativeString(buttonText),
                    responseId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Button(RESULT, Ownership.NONE);
    }
    
    /**
     * Adds multiple buttons.
     * <p>
     * This is the same as calling {@link InfoBar#addButton}
     * repeatedly. The variable argument list should be {@code null}-terminated
     * as with {@link InfoBar#newWithButtons}. Each button must have both
     * text and response ID.
     * @param firstButtonText button text
     * @param varargs response ID for first button, then more text-response_id pairs,
     *   ending with {@code null}
     */
    public void addButtons(@NotNull java.lang.String firstButtonText, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(firstButtonText, "Parameter 'firstButtonText' must not be null");
        try {
            DowncallHandles.gtk_info_bar_add_buttons.invokeExact(
                    handle(),
                    Interop.allocateNativeString(firstButtonText),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a widget to the content area of the info bar.
     * @param widget the child to be added
     */
    public void addChild(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_info_bar_add_child.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the message type of the message area.
     * @return the message type of the message area.
     */
    public @NotNull org.gtk.gtk.MessageType getMessageType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_info_bar_get_message_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.MessageType(RESULT);
    }
    
    /**
     * Returns whether the info bar is currently revealed.
     * @return the current value of the {@code Gtk.InfoBar:revealed} property
     */
    public boolean getRevealed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_info_bar_get_revealed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the widget will display a standard close button.
     * @return {@code true} if the widget displays standard close button
     */
    public boolean getShowCloseButton() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_info_bar_get_show_close_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes a widget from the action area of {@code info_bar}.
     * <p>
     * The widget must have been put there by a call to
     * {@link InfoBar#addActionWidget} or {@link InfoBar#addButton}.
     * @param widget an action widget to remove
     */
    public void removeActionWidget(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_info_bar_remove_action_widget.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a widget from the content area of the info bar.
     * @param widget a child that has been added to the content area
     */
    public void removeChild(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_info_bar_remove_child.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the “response” signal with the given {@code response_id}.
     * @param responseId a response ID
     */
    public void response(int responseId) {
        try {
            DowncallHandles.gtk_info_bar_response.invokeExact(
                    handle(),
                    responseId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the last widget in the info bar’s action area with
     * the given response_id as the default widget for the dialog.
     * <p>
     * Pressing “Enter” normally activates the default widget.
     * <p>
     * Note that this function currently requires {@code info_bar} to
     * be added to a widget hierarchy.
     * @param responseId a response ID
     */
    public void setDefaultResponse(int responseId) {
        try {
            DowncallHandles.gtk_info_bar_set_default_response.invokeExact(
                    handle(),
                    responseId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the message type of the message area.
     * <p>
     * GTK uses this type to determine how the message is displayed.
     * @param messageType a {@code GtkMessageType}
     */
    public void setMessageType(@NotNull org.gtk.gtk.MessageType messageType) {
        java.util.Objects.requireNonNull(messageType, "Parameter 'messageType' must not be null");
        try {
            DowncallHandles.gtk_info_bar_set_message_type.invokeExact(
                    handle(),
                    messageType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the sensitivity of action widgets for {@code response_id}.
     * <p>
     * Calls {@code gtk_widget_set_sensitive (widget, setting)} for each
     * widget in the info bars’s action area with the given {@code response_id}.
     * A convenient way to sensitize/desensitize buttons.
     * @param responseId a response ID
     * @param setting TRUE for sensitive
     */
    public void setResponseSensitive(int responseId, boolean setting) {
        try {
            DowncallHandles.gtk_info_bar_set_response_sensitive.invokeExact(
                    handle(),
                    responseId,
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code GtkInfoBar} is revealed.
     * <p>
     * Changing this will make {@code info_bar} reveal or conceal
     * itself via a sliding transition.
     * <p>
     * Note: this does not show or hide {@code info_bar} in the
     * {@code Gtk.Widget:visible} sense, so revealing has no effect
     * if {@code Gtk.Widget:visible} is {@code false}.
     * @param revealed The new value of the property
     */
    public void setRevealed(boolean revealed) {
        try {
            DowncallHandles.gtk_info_bar_set_revealed.invokeExact(
                    handle(),
                    revealed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If true, a standard close button is shown.
     * <p>
     * When clicked it emits the response {@link ResponseType#CLOSE}.
     * @param setting {@code true} to include a close button
     */
    public void setShowCloseButton(boolean setting) {
        try {
            DowncallHandles.gtk_info_bar_set_show_close_button.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_info_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Close {
        void signalReceived(InfoBar source);
    }
    
    /**
     * Gets emitted when the user uses a keybinding to dismiss the info bar.
     * <p>
     * The ::close signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is the Escape key.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<InfoBar.Close> onClose(InfoBar.Close handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InfoBar.Callbacks.class, "signalInfoBarClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<InfoBar.Close>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Response {
        void signalReceived(InfoBar source, int responseId);
    }
    
    /**
     * Emitted when an action widget is clicked.
     * <p>
     * The signal is also emitted when the application programmer
     * calls {@link InfoBar#response}. The {@code response_id} depends
     * on which action widget was clicked.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<InfoBar.Response> onResponse(InfoBar.Response handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("response"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InfoBar.Callbacks.class, "signalInfoBarResponse",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<InfoBar.Response>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link InfoBar.Build} object constructs a {@link InfoBar} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link InfoBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InfoBar} using {@link InfoBar#castFrom}.
         * @return A new instance of {@code InfoBar} with the properties 
         *         that were set in the Build object.
         */
        public InfoBar construct() {
            return InfoBar.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    InfoBar.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The type of the message.
         * <p>
         * The type may be used to determine the appearance of the info bar.
         * @param messageType The value for the {@code message-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMessageType(org.gtk.gtk.MessageType messageType) {
            names.add("message-type");
            values.add(org.gtk.gobject.Value.create(messageType));
            return this;
        }
        
        /**
         * Whether the info bar shows its contents.
         * @param revealed The value for the {@code revealed} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRevealed(boolean revealed) {
            names.add("revealed");
            values.add(org.gtk.gobject.Value.create(revealed));
            return this;
        }
        
        /**
         * Whether to include a standard close button.
         * @param showCloseButton The value for the {@code show-close-button} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowCloseButton(boolean showCloseButton) {
            names.add("show-close-button");
            values.add(org.gtk.gobject.Value.create(showCloseButton));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_info_bar_new = Interop.downcallHandle(
            "gtk_info_bar_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_info_bar_new_with_buttons = Interop.downcallHandle(
            "gtk_info_bar_new_with_buttons",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_info_bar_add_action_widget = Interop.downcallHandle(
            "gtk_info_bar_add_action_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_info_bar_add_button = Interop.downcallHandle(
            "gtk_info_bar_add_button",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_info_bar_add_buttons = Interop.downcallHandle(
            "gtk_info_bar_add_buttons",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_info_bar_add_child = Interop.downcallHandle(
            "gtk_info_bar_add_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_info_bar_get_message_type = Interop.downcallHandle(
            "gtk_info_bar_get_message_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_info_bar_get_revealed = Interop.downcallHandle(
            "gtk_info_bar_get_revealed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_info_bar_get_show_close_button = Interop.downcallHandle(
            "gtk_info_bar_get_show_close_button",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_info_bar_remove_action_widget = Interop.downcallHandle(
            "gtk_info_bar_remove_action_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_info_bar_remove_child = Interop.downcallHandle(
            "gtk_info_bar_remove_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_info_bar_response = Interop.downcallHandle(
            "gtk_info_bar_response",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_info_bar_set_default_response = Interop.downcallHandle(
            "gtk_info_bar_set_default_response",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_info_bar_set_message_type = Interop.downcallHandle(
            "gtk_info_bar_set_message_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_info_bar_set_response_sensitive = Interop.downcallHandle(
            "gtk_info_bar_set_response_sensitive",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_info_bar_set_revealed = Interop.downcallHandle(
            "gtk_info_bar_set_revealed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_info_bar_set_show_close_button = Interop.downcallHandle(
            "gtk_info_bar_set_show_close_button",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_info_bar_get_type = Interop.downcallHandle(
            "gtk_info_bar_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalInfoBarClose(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InfoBar.Close) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new InfoBar(source, Ownership.NONE));
        }
        
        public static void signalInfoBarResponse(MemoryAddress source, int responseId, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InfoBar.Response) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new InfoBar(source, Ownership.NONE), responseId);
        }
    }
}
