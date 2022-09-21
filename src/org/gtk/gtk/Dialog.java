package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

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
 * {@code Gtk.Dialog.add_buttons},
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
 * <p>
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
 * <h1>GtkDialog as GtkBuildable</h1>
 * <p>
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
 * <p>
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
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkDialog} uses the {@link AccessibleRole#DIALOG} role.
 */
public class Dialog extends Window implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public Dialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Dialog */
    public static Dialog castFrom(org.gtk.gobject.Object gobject) {
        return new Dialog(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_dialog_new(), false);
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
     */
    public void addActionWidget(Widget child, int responseId) {
        gtk_h.gtk_dialog_add_action_widget(handle(), child.handle(), responseId);
    }
    
    /**
     * Adds a button with the given text.
     * <p>
     * GTK arranges things so that clicking the button will emit the
     * {@code Gtk.Dialog::response} signal with the given {@code response_id}.
     * The button is appended to the end of the dialog’s action area.
     * The button widget is returned, but usually you don’t need it.
     */
    public Widget addButton(java.lang.String buttonText, int responseId) {
        var RESULT = gtk_h.gtk_dialog_add_button(handle(), Interop.allocateNativeString(buttonText).handle(), responseId);
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the content area of {@code dialog}.
     */
    public Box getContentArea() {
        var RESULT = gtk_h.gtk_dialog_get_content_area(handle());
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Returns the header bar of {@code dialog}.
     * <p>
     * Note that the headerbar is only used by the dialog if the
     * {@code Gtk.Dialog:use-header-bar} property is <code>true</code>.
     */
    public HeaderBar getHeaderBar() {
        var RESULT = gtk_h.gtk_dialog_get_header_bar(handle());
        return new HeaderBar(References.get(RESULT, false));
    }
    
    /**
     * Gets the response id of a widget in the action area
     * of a dialog.
     */
    public int getResponseForWidget(Widget widget) {
        var RESULT = gtk_h.gtk_dialog_get_response_for_widget(handle(), widget.handle());
        return RESULT;
    }
    
    /**
     * Gets the widget button that uses the given response ID in the action area
     * of a dialog.
     */
    public Widget getWidgetForResponse(int responseId) {
        var RESULT = gtk_h.gtk_dialog_get_widget_for_response(handle(), responseId);
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Emits the ::response signal with the given response ID.
     * <p>
     * Used to indicate that the user has responded to the dialog in some way.
     */
    public void response(int responseId) {
        gtk_h.gtk_dialog_response(handle(), responseId);
    }
    
    /**
     * Sets the default widget for the dialog based on the response ID.
     * <p>
     * Pressing “Enter” normally activates the default widget.
     */
    public void setDefaultResponse(int responseId) {
        gtk_h.gtk_dialog_set_default_response(handle(), responseId);
    }
    
    /**
     * A convenient way to sensitize/desensitize dialog buttons.
     * <p>
     * Calls {@code gtk_widget_set_sensitive (widget, @setting)}
     * for each widget in the dialog’s action area with the given {@code response_id}.
     */
    public void setResponseSensitive(int responseId, boolean setting) {
        gtk_h.gtk_dialog_set_response_sensitive(handle(), responseId, setting ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface CloseHandler {
        void signalReceived(Dialog source);
    }
    
    /**
     * Emitted when the user uses a keybinding to close the dialog.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is the Escape key.
     */
    public SignalHandle onClose(CloseHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDialogClose", methodType);
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
    public SignalHandle onResponse(ResponseHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDialogResponse", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("response").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
