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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public InfoBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InfoBar */
    public static InfoBar castFrom(org.gtk.gobject.Object gobject) {
        return new InfoBar(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_info_bar_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkInfoBar} object.
     */
    public InfoBar() {
        super(constructNew());
    }
    
    private static Refcounted constructNewWithButtons(@Nullable java.lang.String firstButtonText) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
     * @return a new {@code GtkInfoBar}
     */
    public static InfoBar newWithButtons(@Nullable java.lang.String firstButtonText) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
            DowncallHandles.gtk_info_bar_add_action_widget.invokeExact(handle(), child.handle(), responseId);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_info_bar_add_button.invokeExact(handle(), Interop.allocateNativeString(buttonText), responseId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Button(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds multiple buttons.
     * <p>
     * This is the same as calling {@link InfoBar#addButton}
     * repeatedly. The variable argument list should be {@code null}-terminated
     * as with {@link InfoBar#newWithButtons}. Each button must have both
     * text and response ID.
     * @param firstButtonText button text
     */
    public void addButtons(@NotNull java.lang.String firstButtonText) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Adds a widget to the content area of the info bar.
     * @param widget the child to be added
     */
    public void addChild(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.gtk_info_bar_add_child.invokeExact(handle(), widget.handle());
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
            RESULT = (int) DowncallHandles.gtk_info_bar_get_message_type.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_info_bar_get_revealed.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_info_bar_get_show_close_button.invokeExact(handle());
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
            DowncallHandles.gtk_info_bar_remove_action_widget.invokeExact(handle(), widget.handle());
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
            DowncallHandles.gtk_info_bar_remove_child.invokeExact(handle(), widget.handle());
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
            DowncallHandles.gtk_info_bar_response.invokeExact(handle(), responseId);
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
            DowncallHandles.gtk_info_bar_set_default_response.invokeExact(handle(), responseId);
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
            DowncallHandles.gtk_info_bar_set_message_type.invokeExact(handle(), messageType.getValue());
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
            DowncallHandles.gtk_info_bar_set_response_sensitive.invokeExact(handle(), responseId, setting ? 1 : 0);
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
            DowncallHandles.gtk_info_bar_set_revealed.invokeExact(handle(), revealed ? 1 : 0);
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
            DowncallHandles.gtk_info_bar_set_show_close_button.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public Signal<InfoBar.Close> onClose(InfoBar.Close handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InfoBar.Callbacks.class, "signalInfoBarClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
     */
    public Signal<InfoBar.Response> onResponse(InfoBar.Response handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("response"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InfoBar.Callbacks.class, "signalInfoBarResponse",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<InfoBar.Response>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_info_bar_new = Interop.downcallHandle(
            "gtk_info_bar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_info_bar_new_with_buttons = Interop.downcallHandle(
            "gtk_info_bar_new_with_buttons",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_info_bar_add_action_widget = Interop.downcallHandle(
            "gtk_info_bar_add_action_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_info_bar_add_button = Interop.downcallHandle(
            "gtk_info_bar_add_button",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_info_bar_add_buttons = Interop.downcallHandle(
            "gtk_info_bar_add_buttons",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_info_bar_add_child = Interop.downcallHandle(
            "gtk_info_bar_add_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_info_bar_get_message_type = Interop.downcallHandle(
            "gtk_info_bar_get_message_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_info_bar_get_revealed = Interop.downcallHandle(
            "gtk_info_bar_get_revealed",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_info_bar_get_show_close_button = Interop.downcallHandle(
            "gtk_info_bar_get_show_close_button",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_info_bar_remove_action_widget = Interop.downcallHandle(
            "gtk_info_bar_remove_action_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_info_bar_remove_child = Interop.downcallHandle(
            "gtk_info_bar_remove_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_info_bar_response = Interop.downcallHandle(
            "gtk_info_bar_response",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_info_bar_set_default_response = Interop.downcallHandle(
            "gtk_info_bar_set_default_response",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_info_bar_set_message_type = Interop.downcallHandle(
            "gtk_info_bar_set_message_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_info_bar_set_response_sensitive = Interop.downcallHandle(
            "gtk_info_bar_set_response_sensitive",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_info_bar_set_revealed = Interop.downcallHandle(
            "gtk_info_bar_set_revealed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_info_bar_set_show_close_button = Interop.downcallHandle(
            "gtk_info_bar_set_show_close_button",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalInfoBarClose(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (InfoBar.Close) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new InfoBar(Refcounted.get(source)));
        }
        
        public static void signalInfoBarResponse(MemoryAddress source, int responseId, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (InfoBar.Response) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new InfoBar(Refcounted.get(source)), responseId);
        }
    }
}
