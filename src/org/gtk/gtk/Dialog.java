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
 * !{@link [An example GtkDialog]}(dialog.png)
 * <p>
 * Typical uses are to display a message, ask a question, or anything else
 * that does not require extensive effort on the user&#8217;s part.
 * <p>
 * The main area of a <code>GtkDialog</code> is called the &#34;content area&#34;, and is yours
 * to populate with widgets such a <code>GtkLabel</code> or <code>GtkEntry</code>, to present
 * your information, questions, or tasks to the user.
 * <p>
 * In addition, dialogs allow you to add &#34;action widgets&#34;. Most commonly,
 * action widgets are buttons. Depending on the platform, action widgets may
 * be presented in the header bar at the top of the window, or at the bottom
 * of the window. To add action widgets, create your <code>GtkDialog</code> using
 * {@link [ctor@Gtk.Dialog.new_with_buttons] (ref=ctor)}, or use
 * {@link org.gtk.gtk.Dialog#addButton}, {@link org.gtk.gtk.Dialog#addButtons},
 * or {@link org.gtk.gtk.Dialog#addActionWidget}.
 * <p><code>GtkDialogs</code> uses some heuristics to decide whether to add a close
 * button to the window decorations. If any of the action buttons use
 * the response ID {@link org.gtk.gtk.ResponseType#CLOSE} or <code>GTK_RESPONSE_CANCEL,</code> the
 * close button is omitted.
 * <p>
 * Clicking a button that was added as an action widget will emit the
 * {@link [signal@Gtk.Dialog::response] (ref=signal)} signal with a response ID that you specified.
 * GTK will never assign a meaning to positive response IDs; these are
 * entirely user-defined. But for convenience, you can use the response
 * IDs in the {@link [enum@Gtk.ResponseType] (ref=enum)} enumeration (these all have values
 * less than zero). If a dialog receives a delete event, the
 * {@link [signal@Gtk.Dialog::response] (ref=signal)} signal will be emitted with the
 * {@link org.gtk.gtk.ResponseType#DELETE_EVENT} response ID.
 * <p>
 * Dialogs are created with a call to {@link [ctor@Gtk.Dialog.new] (ref=ctor)} or
 * {@link [ctor@Gtk.Dialog.new_with_buttons] (ref=ctor)}. The latter is recommended; it allows
 * you to set the dialog title, some convenient flags, and add buttons.
 * <p>
 * A &#8220;modal&#8221; dialog (that is, one which freezes the rest of the application
 * from user input), can be created by calling {@link org.gtk.gtk.Window#setModal}
 * on the dialog. When using {@link [ctor@Gtk.Dialog.new_with_buttons] (ref=ctor)}, you can also
 * pass the {@link org.gtk.gtk.DialogFlags#MODAL} flag to make a dialog modal.
 * <p>
 * For the simple dialog in the following example, a {@link org.gtk.gtk.MessageDialog}
 * would save some effort. But you&#8217;d need to create the dialog contents manually
 * if you had more than a simple message in the dialog.
 * <p>
 * An example for simple <code>GtkDialog</code> usage:
 * <p><pre>c
 * // Function to open a dialog box with a message
 * void
 * quick_message (GtkWindow *parent, char *message)
 * {
 *  GtkWidget *dialog, *label, *content_area;
 *  GtkDialogFlags flags;
 * <p>
 *  // Create the widgets
 *  flags = GTK_DIALOG_DESTROY_WITH_PARENT;
 *  dialog = gtk_dialog_new_with_buttons (&#34;Message&#34;,
 *                                        parent,
 *                                        flags,
 *                                        _(&#34;_OK&#34;),
 *                                        GTK_RESPONSE_NONE,
 *                                        NULL);
 *  content_area = gtk_dialog_get_content_area (GTK_DIALOG (dialog));
 *  label = gtk_label_new (message);
 * <p>
 *  // Ensure that the dialog box is destroyed when the user responds
 * <p>
 *  g_signal_connect_swapped (dialog,
 *                            &#34;response&#34;,
 *                            G_CALLBACK (gtk_window_destroy),
 *                            dialog);
 * <p>
 *  // Add the label, and show everything we&#8217;ve added
 * <p>
 *  gtk_box_append (GTK_BOX (content_area), label);
 *  gtk_widget_show (dialog);
 * }
 * </pre>
 * <p>
 * <h1>tkDialog as GtkBuildable</h1>
 * <p>
 * The <code>GtkDialog</code> implementation of the <code>GtkBuildable</code> interface exposes the
 * @content_area as an internal child with the name &#8220;content_area&#8221;.
 * <p><code>GtkDialog</code> supports a custom <code>&#60;action-widgets&#62;</code> element, which can contain
 * multiple <code>&#60;action-widget&#62;</code> elements. The &#8220;response&#8221; attribute specifies a
 * numeric response, and the content of the element is the id of widget
 * (which should be a child of the dialogs @action_area). To mark a response
 * as default, set the &#8220;default&#8221; attribute of the <code>&#60;action-widget&#62;</code> element
 * to true.
 * <p><code>GtkDialog</code> supports adding action widgets by specifying &#8220;action&#8221; as
 * the &#8220;type&#8221; attribute of a <code>&#60;child&#62;</code> element. The widget will be added
 * either to the action area or the headerbar of the dialog, depending
 * on the &#8220;use-header-bar&#8221; property. The response id has to be associated
 * with the action widget using the <code>&#60;action-widgets&#62;</code> element.
 * <p>
 * An example of a <code>GtkDialog</code> UI definition fragment:
 * <p><pre>xml
 * &#60;object class=&#34;GtkDialog&#34; id=&#34;dialog1&#34;&#62;
 *   &#60;child type=&#34;action&#34;&#62;
 *     &#60;object class=&#34;GtkButton&#34; id=&#34;button_cancel&#34;/&#62;
 *   &#60;/child&#62;
 *   &#60;child type=&#34;action&#34;&#62;
 *     &#60;object class=&#34;GtkButton&#34; id=&#34;button_ok&#34;&#62;
 *     &#60;/object&#62;
 *   &#60;/child&#62;
 *   &#60;action-widgets&#62;
 *     &#60;action-widget response=&#34;cancel&#34;&#62;button_cancel&#60;/action-widget&#62;
 *     &#60;action-widget response=&#34;ok&#34; default=&#34;true&#34;&#62;button_ok&#60;/action-widget&#62;
 *   &#60;/action-widgets&#62;
 * &#60;/object&#62;
 * </pre>
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkDialog</code> uses the {@link org.gtk.gtk.AccessibleRole#DIALOG} role.
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
     * Widgets should not be packed into the <code>GtkWindow</code>
     * directly, but into the @content_area and @action_area,
     * as described above.
     */
    public Dialog() {
        super(constructNew());
    }
    
    /**
     * Adds an activatable widget to the action area of a <code>GtkDialog</code>.
     * <p>
     * GTK connects a signal handler that will emit the
     * {@link [signal@Gtk.Dialog::response] (ref=signal)} signal on the dialog when the widget
     * is activated. The widget is appended to the end of the dialog&#8217;s action
     * area.
     * <p>
     * If you want to add a non-activatable widget, simply pack it into
     * the @action_area field of the <code>GtkDialog</code> struct.
     */
    public void addActionWidget(Widget child, int responseId) {
        gtk_h.gtk_dialog_add_action_widget(handle(), child.handle(), responseId);
    }
    
    /**
     * Adds a button with the given text.
     * 
     * GTK arranges things so that clicking the button will emit the
     * {@link [signal@Gtk.Dialog::response] (ref=signal)} signal with the given @response_id.
     * The button is appended to the end of the dialog&#8217;s action area.
     * The button widget is returned, but usually you don&#8217;t need it.
     */
    public Widget addButton(java.lang.String buttonText, int responseId) {
        var RESULT = gtk_h.gtk_dialog_add_button(handle(), Interop.allocateNativeString(buttonText).handle(), responseId);
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the content area of @dialog.
     */
    public Box getContentArea() {
        var RESULT = gtk_h.gtk_dialog_get_content_area(handle());
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Returns the header bar of @dialog.
     * 
     * Note that the headerbar is only used by the dialog if the
     * {@link [property@Gtk.Dialog:use-header-bar] (ref=property)} property is 
     *             
     *           
     *         
     *       
     *       
     *         Returns the header bar of @dialog.
     * 
     * Note that the headerbar is only used by the dialog if the
     * {@link [property@Gtk.Dialog:use-header-bar] (ref=property)} property is %TRUE.
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
     * 
     * Used to indicate that the user has responded to the dialog in some way.
     */
    public void response(int responseId) {
        gtk_h.gtk_dialog_response(handle(), responseId);
    }
    
    /**
     * Sets the default widget for the dialog based on the response ID.
     * 
     * Pressing &#8220;Enter&#8221; normally activates the default widget.
     */
    public void setDefaultResponse(int responseId) {
        gtk_h.gtk_dialog_set_default_response(handle(), responseId);
    }
    
    /**
     * A convenient way to sensitize/desensitize dialog buttons.
     * <p>
     * Calls <code>gtk_widget_set_sensitive (widget, @setting)</code>
     * for each widget in the dialog&#8217;s action area with the given @response_id.
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
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
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
     * 
     * The signal is also emitted when the dialog receives a
     * delete event, and when {@link org.gtk.gtk.Dialog#response} is called.
     * On a delete event, the response ID is <code>GTK_RESPONSE_DELETE_EVENT.
     * Otherwise,</code> it depends on which action widget was clicked.
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
