package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkInfoBar` can be show messages to the user without a dialog.
 * 
 * ![An example GtkInfoBar](info-bar.png)
 * 
 * It is often temporarily shown at the top or bottom of a document.
 * In contrast to [class@Gtk.Dialog], which has an action area at the
 * bottom, `GtkInfoBar` has an action area at the side.
 * 
 * The API of `GtkInfoBar` is very similar to `GtkDialog`, allowing you
 * to add buttons to the action area with [method@Gtk.InfoBar.add_button]
 * or [ctor@Gtk.InfoBar.new_with_buttons]. The sensitivity of action widgets
 * can be controlled with [method@Gtk.InfoBar.set_response_sensitive].
 * 
 * To add widgets to the main content area of a `GtkInfoBar`, use
 * [method@Gtk.InfoBar.add_child].
 * 
 * Similar to [class@Gtk.MessageDialog], the contents of a `GtkInfoBar`
 * can by classified as error message, warning, informational message, etc,
 * by using [method@Gtk.InfoBar.set_message_type]. GTK may use the message
 * type to determine how the message is displayed.
 * 
 * A simple example for using a `GtkInfoBar`:
 * ```c
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
 * ```
 * 
 * # GtkInfoBar as GtkBuildable
 * 
 * `GtkInfoBar` supports a custom `<action-widgets>` element, which can contain
 * multiple `<action-widget>` elements. The “response” attribute specifies a
 * numeric response, and the content of the element is the id of widget
 * (which should be a child of the dialogs @action_area).
 * 
 * `GtkInfoBar` supports adding action widgets by specifying “action” as
 * the “type” attribute of a `<child>` element. The widget will be added
 * either to the action area. The response id has to be associated
 * with the action widget using the `<action-widgets>` element.
 * 
 * # CSS nodes
 * 
 * `GtkInfoBar` has a single CSS node with name infobar. The node may get
 * one of the style classes .info, .warning, .error or .question, depending
 * on the message type.
 * If the info bar shows a close button, that button will have the .close
 * style class applied.
 */
public class InfoBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public InfoBar(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to InfoBar */
    public static InfoBar castFrom(org.gtk.gobject.Object gobject) {
        return new InfoBar(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkInfoBar` object.
     */
    public InfoBar() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_new(), false));
    }
    
    /**
     * Add an activatable widget to the action area of a `GtkInfoBar`.
     * 
     * This also connects a signal handler that will emit the
     * [signal@Gtk.InfoBar::response] signal on the message area
     * when the widget is activated. The widget is appended to the
     * end of the message areas action area.
     */
    public void addActionWidget(Widget child, int responseId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_add_action_widget(HANDLE(), child.HANDLE(), responseId);
    }
    
    /**
     * Adds a button with the given text.
     * 
     * Clicking the button will emit the [signal@Gtk.InfoBar::response]
     * signal with the given response_id. The button is appended to the
     * end of the info bars's action area. The button widget is returned,
     * but usually you don't need it.
     */
    public Button addButton(java.lang.String buttonText, int responseId) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_add_button(HANDLE(), Interop.getAllocator().allocateUtf8String(buttonText), responseId);
        return new Button(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Adds a widget to the content area of the info bar.
     */
    public void addChild(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_add_child(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Returns the message type of the message area.
     */
    public MessageType getMessageType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_get_message_type(HANDLE());
        return MessageType.fromValue(RESULT);
    }
    
    /**
     * Returns whether the info bar is currently revealed.
     */
    public boolean getRevealed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_get_revealed(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the widget will display a standard close button.
     */
    public boolean getShowCloseButton() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_get_show_close_button(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Removes a widget from the action area of @info_bar.
     * 
     * The widget must have been put there by a call to
     * [method@Gtk.InfoBar.add_action_widget] or [method@Gtk.InfoBar.add_button].
     */
    public void removeActionWidget(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_remove_action_widget(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Removes a widget from the content area of the info bar.
     */
    public void removeChild(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_remove_child(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Emits the “response” signal with the given @response_id.
     */
    public void response(int responseId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_response(HANDLE(), responseId);
    }
    
    /**
     * Sets the last widget in the info bar’s action area with
     * the given response_id as the default widget for the dialog.
     * 
     * Pressing “Enter” normally activates the default widget.
     * 
     * Note that this function currently requires @info_bar to
     * be added to a widget hierarchy.
     */
    public void setDefaultResponse(int responseId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_set_default_response(HANDLE(), responseId);
    }
    
    /**
     * Sets the message type of the message area.
     * 
     * GTK uses this type to determine how the message is displayed.
     */
    public void setMessageType(MessageType messageType) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_set_message_type(HANDLE(), messageType.getValue());
    }
    
    /**
     * Sets the sensitivity of action widgets for @response_id.
     * 
     * Calls `gtk_widget_set_sensitive (widget, setting)` for each
     * widget in the info bars’s action area with the given @response_id.
     * A convenient way to sensitize/desensitize buttons.
     */
    public void setResponseSensitive(int responseId, boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_set_response_sensitive(HANDLE(), responseId, setting ? 1 : 0);
    }
    
    /**
     * Sets whether the `GtkInfoBar` is revealed.
     * 
     * Changing this will make @info_bar reveal or conceal
     * itself via a sliding transition.
     * 
     * Note: this does not show or hide @info_bar in the
     * [property@Gtk.Widget:visible] sense, so revealing has no effect
     * if [property@Gtk.Widget:visible] is %FALSE.
     */
    public void setRevealed(boolean revealed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_set_revealed(HANDLE(), revealed ? 1 : 0);
    }
    
    /**
     * If true, a standard close button is shown.
     * 
     * When clicked it emits the response %GTK_RESPONSE_CLOSE.
     */
    public void setShowCloseButton(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_info_bar_set_show_close_button(HANDLE(), setting ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface CloseHandler {
        void signalReceived(InfoBar source);
    }
    
    /**
     * Gets emitted when the user uses a keybinding to dismiss the info bar.
     * 
     * The ::close signal is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is the Escape key.
     */
    public void onClose(CloseHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalInfoBarClose", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("close"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ResponseHandler {
        void signalReceived(InfoBar source, int responseId);
    }
    
    /**
     * Emitted when an action widget is clicked.
     * 
     * The signal is also emitted when the application programmer
     * calls [method@Gtk.InfoBar.response]. The @response_id depends
     * on which action widget was clicked.
     */
    public void onResponse(ResponseHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalInfoBarResponse", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("response"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
