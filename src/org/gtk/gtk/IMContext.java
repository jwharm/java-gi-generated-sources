package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkIMContext</code> defines the interface for GTK input methods.
 * <p><code>GtkIMContext</code> is used by GTK text input widgets like <code>GtkText</code>
 * to map from key events to Unicode character strings.
 * <p>
 * An input method may consume multiple key events in sequence before finally
 * outputting the composed result. This is called *preediting*, and an input
 * method may provide feedback about this process by displaying the intermediate
 * composition states as preedit text. To do so, the <code>GtkIMContext</code> will emit
 * {@link [signal@Gtk.IMContext::preedit-start] (ref=signal)}, {@link [signal@Gtk.IMContext::preedit-changed] (ref=signal)}
 * and {@link [signal@Gtk.IMContext::preedit-end] (ref=signal)} signals.
 * <p>
 * For instance, the built-in GTK input method {@link org.gtk.gtk.IMContextSimple}
 * implements the input of arbitrary Unicode code points by holding down the
 * &<code>#60</code> kbd&<code>#62</code> Control&<code>#60</code> /kbd&<code>#62</code>  and &<code>#60</code> kbd&<code>#62</code> Shift&<code>#60</code> /kbd&<code>#62</code>  keys and then typing &<code>#60</code> kbd&<code>#62</code> u&<code>#60</code> /kbd&<code>#62</code> 
 * followed by the hexadecimal digits of the code point. When releasing the
 * &<code>#60</code> kbd&<code>#62</code> Control&<code>#60</code> /kbd&<code>#62</code>  and &<code>#60</code> kbd&<code>#62</code> Shift&<code>#60</code> /kbd&<code>#62</code>  keys, preediting ends and the
 * character is inserted as text. For example,
 * <p>
 *     Ctrl+Shift+u 2 0 A C
 * <p>
 * results in the &<code>#8364</code>  sign.
 * <p>
 * Additional input methods can be made available for use by GTK widgets as
 * loadable modules. An input method module is a small shared library which
 * provides a <code>GIOExtension</code> for the extension point named &<code>#34</code> gtk-im-module&<code>#34</code> .
 * 
 * To connect a widget to the users preferred input method, you should use
 * {@link org.gtk.gtk.IMMulticontext}.
 */
public class IMContext extends org.gtk.gobject.Object {

    public IMContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IMContext */
    public static IMContext castFrom(org.gtk.gobject.Object gobject) {
        return new IMContext(gobject.getReference());
    }
    
    /**
     * Asks the widget that the input context is attached to delete
     * characters around the cursor position by emitting the<code>::delete_surrounding</code> signal.
     * <p>
     * Note that @offset and @n_chars are in characters not in bytes
     * which differs from the usage other places in <code>GtkIMContext</code>.
     * 
     * In order to use this function, you should first call
     * {@link org.gtk.gtk.IMContext<code>#getSurrounding</code>  to get the current context,
     * and call this function immediately afterwards to make sure that you
     * know what you are deleting. You should also account for the fact
     * that even if the signal was handled, the input context might not
     * have deleted all the characters that were requested to be deleted.
     * 
     * This function is used by an input method that wants to make
     * subsitutions in the existing text in response to new input.
     * It is not useful for applications.
     */
    public boolean deleteSurrounding(int offset, int nChars) {
        var RESULT = gtk_h.gtk_im_context_delete_surrounding(handle(), offset, nChars);
        return (RESULT != 0);
    }
    
    /**
     * Allow an input method to forward key press and release events
     * to another input method without necessarily having a <code>GdkEvent</code>
     * available.
     */
    public boolean filterKey(boolean press, org.gtk.gdk.Surface surface, org.gtk.gdk.Device device, int time, int keycode, int state, int group) {
        var RESULT = gtk_h.gtk_im_context_filter_key(handle(), press ? 1 : 0, surface.handle(), device.handle(), time, keycode, state, group);
        return (RESULT != 0);
    }
    
    /**
     * Allow an input method to internally handle key press and release
     * events.
     * 
     * If this function returns <code>true</code>  then no further processing
     * should be done for this key event.
     */
    public boolean filterKeypress(org.gtk.gdk.Event event) {
        var RESULT = gtk_h.gtk_im_context_filter_keypress(handle(), event.handle());
        return (RESULT != 0);
    }
    
    /**
     * Notify the input method that the widget to which this
     * input context corresponds has gained focus.
     * 
     * The input method may, for example, change the displayed
     * feedback to reflect this change.
     */
    public void focusIn() {
        gtk_h.gtk_im_context_focus_in(handle());
    }
    
    /**
     * Notify the input method that the widget to which this
     * input context corresponds has lost focus.
     * 
     * The input method may, for example, change the displayed
     * feedback or reset the contexts state to reflect this change.
     */
    public void focusOut() {
        gtk_h.gtk_im_context_focus_out(handle());
    }
    
    /**
     * Notify the input method that a change such as a change in cursor
     * position has been made.
     * 
     * This will typically cause the input method to clear the preedit state.
     */
    public void reset() {
        gtk_h.gtk_im_context_reset(handle());
    }
    
    /**
     * Set the client widget for the input context.
     * <p>
     * This is the <code>GtkWidget</code> holding the input focus. This widget is
     * used in order to correctly position status windows, and may
     * also be used for purposes internal to the input method.
     */
    public void setClientWidget(Widget widget) {
        gtk_h.gtk_im_context_set_client_widget(handle(), widget.handle());
    }
    
    /**
     * Notify the input method that a change in cursor
     * position has been made.
     * 
     * The location is relative to the client widget.
     */
    public void setCursorLocation(org.gtk.gdk.Rectangle area) {
        gtk_h.gtk_im_context_set_cursor_location(handle(), area.handle());
    }
    
    /**
     * Sets surrounding context around the insertion point and preedit
     * string. This function is expected to be called in response to the
     * {@link [signal@Gtk.IMContext::retrieve_surrounding] (ref=signal)} signal, and will likely
     * have no effect if called at other times.
     */
    public void setSurroundingWithSelection(java.lang.String text, int len, int cursorIndex, int anchorIndex) {
        gtk_h.gtk_im_context_set_surrounding_with_selection(handle(), Interop.allocateNativeString(text).handle(), len, cursorIndex, anchorIndex);
    }
    
    /**
     * Sets whether the IM context should use the preedit string
     * to display feedback.
     * 
     * If @use_preedit is <code>false</code> (default is <code>true</code> , then the IM context
     * may use some other method to display feedback, such as displaying
     * it in a child of the root window.
     */
    public void setUsePreedit(boolean usePreedit) {
        gtk_h.gtk_im_context_set_use_preedit(handle(), usePreedit ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface CommitHandler {
        void signalReceived(IMContext source, java.lang.String str);
    }
    
    /**
     * The ::commit signal is emitted when a complete input sequence
     * has been entered by the user.
     * 
     * If the commit comes after a preediting sequence, the
     * ::commit signal is emitted after ::preedit-end.
     * 
     * This can be a single character immediately after a key press or
     * the final result of preediting.
     */
    public SignalHandle onCommit(CommitHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextCommit", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("commit").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DeleteSurroundingHandler {
        boolean signalReceived(IMContext source, int offset, int nChars);
    }
    
    /**
     * The ::delete-surrounding signal is emitted when the input method
     * needs to delete all or part of the context surrounding the cursor.
     */
    public SignalHandle onDeleteSurrounding(DeleteSurroundingHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextDeleteSurrounding", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("delete-surrounding").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PreeditChangedHandler {
        void signalReceived(IMContext source);
    }
    
    /**
     * The ::preedit-changed signal is emitted whenever the preedit sequence
     * currently being entered has changed.
     * 
     * It is also emitted at the end of a preedit sequence, in which case
     * {@link org.gtk.gtk.IMContext<code>#getPreeditString</code>  returns the empty string.
     */
    public SignalHandle onPreeditChanged(PreeditChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextPreeditChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("preedit-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PreeditEndHandler {
        void signalReceived(IMContext source);
    }
    
    /**
     * The ::preedit-end signal is emitted when a preediting sequence
     * has been completed or canceled.
     */
    public SignalHandle onPreeditEnd(PreeditEndHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextPreeditEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("preedit-end").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PreeditStartHandler {
        void signalReceived(IMContext source);
    }
    
    /**
     * The ::preedit-start signal is emitted when a new preediting sequence
     * starts.
     */
    public SignalHandle onPreeditStart(PreeditStartHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextPreeditStart", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("preedit-start").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RetrieveSurroundingHandler {
        boolean signalReceived(IMContext source);
    }
    
    /**
     * The ::retrieve-surrounding signal is emitted when the input method
     * requires the context surrounding the cursor.
     * 
     * The callback should set the input method surrounding context by
     * calling the {@link org.gtk.gtk.IMContext<code>#setSurrounding</code>  method.
     */
    public SignalHandle onRetrieveSurrounding(RetrieveSurroundingHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextRetrieveSurrounding", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("retrieve-surrounding").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
