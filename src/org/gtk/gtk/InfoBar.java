package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkInfoBar</code> can be show messages to the user without a dialog.
 * <p>
 * !{@link [An example GtkInfoBar]}(info-bar.png)
 * <p>
 * It is often temporarily shown at the top or bottom of a document.
 * In contrast to {@link org.gtk.gtk.Dialog}, which has an action area at the
 * bottom, <code>GtkInfoBar</code> has an action area at the side.
 * <p>
 * The API of <code>GtkInfoBar</code> is very similar to <code>GtkDialog</code>, allowing you
 * to add buttons to the action area with {@link org.gtk.gtk.InfoBar<code>#addButton</code> 
 * or {@link [ctor@Gtk.InfoBar.new_with_buttons] (ref=ctor)}. The sensitivity of action widgets
 * can be controlled with {@link org.gtk.gtk.InfoBar<code>#setResponseSensitive</code> .
 * <p>
 * To add widgets to the main content area of a <code>GtkInfoBar</code>, use
 * {@link org.gtk.gtk.InfoBar<code>#addChild</code> .
 * <p>
 * Similar to {@link org.gtk.gtk.MessageDialog}, the contents of a <code>GtkInfoBar</code>
 * can by classified as error message, warning, informational message, etc,
 * by using {@link org.gtk.gtk.InfoBar<code>#setMessageType</code> . GTK may use the message
 * type to determine how the message is displayed.
 * <p>
 * A simple example for using a <code>GtkInfoBar</code>:<pre>c
 * GtkWidget *message_label;
 * GtkWidget *widget;
 * GtkWidget *grid;
 * GtkInfoBar *bar;
 * <p>
 * // set up info bar
 * widget = gtk_info_bar_new ();
 * bar = GTK_INFO_BAR (widget);
 * grid = gtk_grid_new ();
 * <p>
 * message_label = gtk_label_new (&<code>#34</code> &<code>#34</code> );
 * gtk_info_bar_add_child (bar, message_label);
 * gtk_info_bar_add_button (bar,
 *                          _(&<code>#34</code> _OK&<code>#34</code> ),
 *                          GTK_RESPONSE_OK);
 * g_signal_connect (bar,
 *                   &<code>#34</code> response&<code>#34</code> ,
 *                   G_CALLBACK (gtk_widget_hide),
 *                   NULL);
 * gtk_grid_attach (GTK_GRID (grid),
 *                  widget,
 *                  0, 2, 1, 1);
 * <p>
 * // ...
 * <p>
 * // show an error message
 * gtk_label_set_text (GTK_LABEL (message_label), &<code>#34</code> An error occurred!&<code>#34</code> );
 * gtk_info_bar_set_message_type (bar, GTK_MESSAGE_ERROR);
 * gtk_widget_show (bar);
 * </pre>
 * <p>
 * <h1>GtkInfoBar as GtkBuildable</h1>
 * <p><code>GtkInfoBar</code> supports a custom <code>&<code>#60</code> action-widgets&<code>#62</code> </code> element, which can contain
 * multiple <code>&<code>#60</code> action-widget&<code>#62</code> </code> elements. The &<code>#8220</code> response&<code>#8221</code>  attribute specifies a
 * numeric response, and the content of the element is the id of widget
 * (which should be a child of the dialogs @action_area).
 * <p><code>GtkInfoBar</code> supports adding action widgets by specifying &<code>#8220</code> action&<code>#8221</code>  as
 * the &<code>#8220</code> type&<code>#8221</code>  attribute of a <code>&<code>#60</code> child&<code>#62</code> </code> element. The widget will be added
 * either to the action area. The response id has to be associated
 * with the action widget using the <code>&<code>#60</code> action-widgets&<code>#62</code> </code> element.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><code>GtkInfoBar</code> has a single CSS node with name infobar. The node may get
 * one of the style classes .info, .warning, .error or .question, depending
 * on the message type.
 * If the info bar shows a close button, that button will have the .close
 * style class applied.
 */
public class InfoBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public InfoBar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to InfoBar */
    public static InfoBar castFrom(org.gtk.gobject.Object gobject) {
        return new InfoBar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_info_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkInfoBar</code> object.
     */
    public InfoBar() {
        super(constructNew());
    }
    
    /**
     * Add an activatable widget to the action area of a <code>GtkInfoBar</code>.
     * 
     * This also connects a signal handler that will emit the
     * {@link [signal@Gtk.InfoBar::response] (ref=signal)} signal on the message area
     * when the widget is activated. The widget is appended to the
     * end of the message areas action area.
     */
    public void addActionWidget(Widget child, int responseId) {
        gtk_h.gtk_info_bar_add_action_widget(handle(), child.handle(), responseId);
    }
    
    /**
     * Adds a button with the given text.
     * 
     * Clicking the button will emit the {@link [signal@Gtk.InfoBar::response] (ref=signal)}
     * signal with the given response_id. The button is appended to the
     * end of the info bars&<code>#39</code> s action area. The button widget is returned,
     * but usually you don&<code>#39</code> t need it.
     */
    public Button addButton(java.lang.String buttonText, int responseId) {
        var RESULT = gtk_h.gtk_info_bar_add_button(handle(), Interop.allocateNativeString(buttonText).handle(), responseId);
        return new Button(References.get(RESULT, false));
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
        return MessageType.fromValue(RESULT);
    }
    
    /**
     * Returns whether the info bar is currently revealed.
     */
    public boolean getRevealed() {
        var RESULT = gtk_h.gtk_info_bar_get_revealed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the widget will display a standard close button.
     */
    public boolean getShowCloseButton() {
        var RESULT = gtk_h.gtk_info_bar_get_show_close_button(handle());
        return (RESULT != 0);
    }
    
    /**
     * Removes a widget from the action area of @info_bar.
     * 
     * The widget must have been put there by a call to
     * {@link org.gtk.gtk.InfoBar<code>#addActionWidget</code>  or {@link org.gtk.gtk.InfoBar<code>#addButton</code> .
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
     * Emits the &<code>#8220</code> response&<code>#8221</code>  signal with the given @response_id.
     */
    public void response(int responseId) {
        gtk_h.gtk_info_bar_response(handle(), responseId);
    }
    
    /**
     * Sets the last widget in the info bar&<code>#8217</code> s action area with
     * the given response_id as the default widget for the dialog.
     * 
     * Pressing &<code>#8220</code> Enter&<code>#8221</code>  normally activates the default widget.
     * 
     * Note that this function currently requires @info_bar to
     * be added to a widget hierarchy.
     */
    public void setDefaultResponse(int responseId) {
        gtk_h.gtk_info_bar_set_default_response(handle(), responseId);
    }
    
    /**
     * Sets the message type of the message area.
     * 
     * GTK uses this type to determine how the message is displayed.
     */
    public void setMessageType(MessageType messageType) {
        gtk_h.gtk_info_bar_set_message_type(handle(), messageType.getValue());
    }
    
    /**
     * Sets the sensitivity of action widgets for @response_id.
     * <p>
     * Calls <code>gtk_widget_set_sensitive (widget, setting)</code> for each
     * widget in the info bars&<code>#8217</code> s action area with the given @response_id.
     * A convenient way to sensitize/desensitize buttons.
     */
    public void setResponseSensitive(int responseId, boolean setting) {
        gtk_h.gtk_info_bar_set_response_sensitive(handle(), responseId, setting ? 1 : 0);
    }
    
    /**
     * Sets whether the <code>GtkInfoBar</code> is revealed.
     * 
     * Changing this will make @info_bar reveal or conceal
     * itself via a sliding transition.
     * 
     * Note: this does not show or hide @info_bar in the
     * {@link [property@Gtk.Widget:visible] (ref=property)} sense, so revealing has no effect
     * if {@link [property@Gtk.Widget:visible] (ref=property)} is <code>false</code>
     */
    public void setRevealed(boolean revealed) {
        gtk_h.gtk_info_bar_set_revealed(handle(), revealed ? 1 : 0);
    }
    
    /**
     * If true, a standard close button is shown.
     * 
     * When clicked it emits the response {@link org.gtk.gtk.ResponseType<code>#CLOSE</code>
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
     * 
     * The ::close signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding for this signal is the Escape key.
     */
    public SignalHandle onClose(CloseHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalInfoBarClose", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("close").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * calls {@link org.gtk.gtk.InfoBar<code>#response</code> . The @response_id depends
     * on which action widget was clicked.
     */
    public SignalHandle onResponse(ResponseHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalInfoBarResponse", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("response").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
