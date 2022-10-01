package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h1>GtkInfoBar as GtkBuildable</h1>
 * <p>
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
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkInfoBar} has a single CSS node with name infobar. The node may get
 * one of the style classes .info, .warning, .error or .question, depending
 * on the message type.
 * If the info bar shows a close button, that button will have the .close
 * style class applied.
 */
public class InfoBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public InfoBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InfoBar */
    public static InfoBar castFrom(org.gtk.gobject.Object gobject) {
        return new InfoBar(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_info_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkInfoBar} object.
     */
    public InfoBar() {
        super(constructNew());
    }
    
    /**
     * Add an activatable widget to the action area of a {@code GtkInfoBar}.
     * <p>
     * This also connects a signal handler that will emit the
     * {@code Gtk.InfoBar::response} signal on the message area
     * when the widget is activated. The widget is appended to the
     * end of the message areas action area.
     */
    public void addActionWidget(Widget child, int responseId) {
        gtk_h.gtk_info_bar_add_action_widget(handle(), child.handle(), responseId);
    }
    
    /**
     * Adds a button with the given text.
     * <p>
     * Clicking the button will emit the {@code Gtk.InfoBar::response}
     * signal with the given response_id. The button is appended to the
     * end of the info bars's action area. The button widget is returned,
     * but usually you don't need it.
     */
    public Button addButton(java.lang.String buttonText, int responseId) {
        var RESULT = gtk_h.gtk_info_bar_add_button(handle(), Interop.allocateNativeString(buttonText).handle(), responseId);
        return new Button(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds a widget to the content area of the info bar.
     */
    public void addChild(Widget widget) {
        gtk_h.gtk_info_bar_add_child(handle(), widget.handle());
    }
    
    /**
     * Returns the message type of the message area.
     */
    public MessageType getMessageType() {
        var RESULT = gtk_h.gtk_info_bar_get_message_type(handle());
        return new MessageType(RESULT);
    }
    
    /**
     * Returns whether the info bar is currently revealed.
     */
    public boolean getRevealed() {
        var RESULT = gtk_h.gtk_info_bar_get_revealed(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the widget will display a standard close button.
     */
    public boolean getShowCloseButton() {
        var RESULT = gtk_h.gtk_info_bar_get_show_close_button(handle());
        return RESULT != 0;
    }
    
    /**
     * Removes a widget from the action area of {@code info_bar}.
     * <p>
     * The widget must have been put there by a call to
     * {@code Gtk.InfoBar.add_button}.
     */
    public void removeActionWidget(Widget widget) {
        gtk_h.gtk_info_bar_remove_action_widget(handle(), widget.handle());
    }
    
    /**
     * Removes a widget from the content area of the info bar.
     */
    public void removeChild(Widget widget) {
        gtk_h.gtk_info_bar_remove_child(handle(), widget.handle());
    }
    
    /**
     * Emits the “response” signal with the given {@code response_id}.
     */
    public void response(int responseId) {
        gtk_h.gtk_info_bar_response(handle(), responseId);
    }
    
    /**
     * Sets the last widget in the info bar’s action area with
     * the given response_id as the default widget for the dialog.
     * <p>
     * Pressing “Enter” normally activates the default widget.
     * <p>
     * Note that this function currently requires {@code info_bar} to
     * be added to a widget hierarchy.
     */
    public void setDefaultResponse(int responseId) {
        gtk_h.gtk_info_bar_set_default_response(handle(), responseId);
    }
    
    /**
     * Sets the message type of the message area.
     * <p>
     * GTK uses this type to determine how the message is displayed.
     */
    public void setMessageType(MessageType messageType) {
        gtk_h.gtk_info_bar_set_message_type(handle(), messageType.getValue());
    }
    
    /**
     * Sets the sensitivity of action widgets for {@code response_id}.
     * <p>
     * Calls {@code gtk_widget_set_sensitive (widget, setting)} for each
     * widget in the info bars’s action area with the given {@code response_id}.
     * A convenient way to sensitize/desensitize buttons.
     */
    public void setResponseSensitive(int responseId, boolean setting) {
        gtk_h.gtk_info_bar_set_response_sensitive(handle(), responseId, setting ? 1 : 0);
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
     */
    public void setRevealed(boolean revealed) {
        gtk_h.gtk_info_bar_set_revealed(handle(), revealed ? 1 : 0);
    }
    
    /**
     * If true, a standard close button is shown.
     * <p>
     * When clicked it emits the response {@link ResponseType#CLOSE}.
     */
    public void setShowCloseButton(boolean setting) {
        gtk_h.gtk_info_bar_set_show_close_button(handle(), setting ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface CloseHandler {
        void signalReceived(InfoBar source);
    }
    
    /**
     * Gets emitted when the user uses a keybinding to dismiss the info bar.
     * <p>
     * The ::close signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is the Escape key.
     */
    public SignalHandle onClose(CloseHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("close").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InfoBar.Callbacks.class, "signalInfoBarClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ResponseHandler {
        void signalReceived(InfoBar source, int responseId);
    }
    
    /**
     * Emitted when an action widget is clicked.
     * <p>
     * The signal is also emitted when the application programmer
     * calls {@link InfoBar#response}. The {@code response_id} depends
     * on which action widget was clicked.
     */
    public SignalHandle onResponse(ResponseHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("response").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InfoBar.Callbacks.class, "signalInfoBarResponse",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalInfoBarClose(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (InfoBar.CloseHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new InfoBar(Refcounted.get(source)));
        }
        
        public static void signalInfoBarResponse(MemoryAddress source, int responseId, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (InfoBar.ResponseHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new InfoBar(Refcounted.get(source)), responseId);
        }
        
    }
}
