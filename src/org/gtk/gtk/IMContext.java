package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkIMContext` defines the interface for GTK input methods.
 * 
 * `GtkIMContext` is used by GTK text input widgets like `GtkText`
 * to map from key events to Unicode character strings.
 * 
 * An input method may consume multiple key events in sequence before finally
 * outputting the composed result. This is called *preediting*, and an input
 * method may provide feedback about this process by displaying the intermediate
 * composition states as preedit text. To do so, the `GtkIMContext` will emit
 * [signal@Gtk.IMContext::preedit-start], [signal@Gtk.IMContext::preedit-changed]
 * and [signal@Gtk.IMContext::preedit-end] signals.
 * 
 * For instance, the built-in GTK input method [class@Gtk.IMContextSimple]
 * implements the input of arbitrary Unicode code points by holding down the
 * <kbd>Control</kbd> and <kbd>Shift</kbd> keys and then typing <kbd>u</kbd>
 * followed by the hexadecimal digits of the code point. When releasing the
 * <kbd>Control</kbd> and <kbd>Shift</kbd> keys, preediting ends and the
 * character is inserted as text. For example,
 * 
 *     Ctrl+Shift+u 2 0 A C
 * 
 * results in the € sign.
 * 
 * Additional input methods can be made available for use by GTK widgets as
 * loadable modules. An input method module is a small shared library which
 * provides a `GIOExtension` for the extension point named "gtk-im-module".
 * 
 * To connect a widget to the users preferred input method, you should use
 * [class@Gtk.IMMulticontext].
 */
public class IMContext extends org.gtk.gobject.Object {

    public IMContext(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IMContext */
    public static IMContext castFrom(org.gtk.gobject.Object gobject) {
        return new IMContext(gobject.getReference());
    }
    
    /**
     * Asks the widget that the input context is attached to delete
     * characters around the cursor position by emitting the
     * `::delete_surrounding` signal.
     * 
     * Note that @offset and @n_chars are in characters not in bytes
     * which differs from the usage other places in `GtkIMContext`.
     * 
     * In order to use this function, you should first call
     * [method@Gtk.IMContext.get_surrounding] to get the current context,
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_delete_surrounding(HANDLE(), offset, nChars);
        return (RESULT != 0);
    }
    
    /**
     * Allow an input method to forward key press and release events
     * to another input method without necessarily having a `GdkEvent`
     * available.
     */
    public boolean filterKey(boolean press, org.gtk.gdk.Surface surface, org.gtk.gdk.Device device, int time, int keycode, int state, int group) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_filter_key(HANDLE(), press ? 1 : 0, surface.HANDLE(), device.HANDLE(), time, keycode, state, group);
        return (RESULT != 0);
    }
    
    /**
     * Allow an input method to internally handle key press and release
     * events.
     * 
     * If this function returns %TRUE, then no further processing
     * should be done for this key event.
     */
    public boolean filterKeypress(org.gtk.gdk.Event event) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_filter_keypress(HANDLE(), event.HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_focus_in(HANDLE());
    }
    
    /**
     * Notify the input method that the widget to which this
     * input context corresponds has lost focus.
     * 
     * The input method may, for example, change the displayed
     * feedback or reset the contexts state to reflect this change.
     */
    public void focusOut() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_focus_out(HANDLE());
    }
    
    /**
     * Notify the input method that a change such as a change in cursor
     * position has been made.
     * 
     * This will typically cause the input method to clear the preedit state.
     */
    public void reset() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_reset(HANDLE());
    }
    
    /**
     * Set the client widget for the input context.
     * 
     * This is the `GtkWidget` holding the input focus. This widget is
     * used in order to correctly position status windows, and may
     * also be used for purposes internal to the input method.
     */
    public void setClientWidget(Widget widget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_set_client_widget(HANDLE(), widget.HANDLE());
    }
    
    /**
     * Notify the input method that a change in cursor
     * position has been made.
     * 
     * The location is relative to the client widget.
     */
    public void setCursorLocation(org.gtk.gdk.Rectangle area) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_set_cursor_location(HANDLE(), area.HANDLE());
    }
    
    /**
     * Sets surrounding context around the insertion point and preedit
     * string. This function is expected to be called in response to the
     * [signal@Gtk.IMContext::retrieve_surrounding] signal, and will likely
     * have no effect if called at other times.
     */
    public void setSurroundingWithSelection(java.lang.String text, int len, int cursorIndex, int anchorIndex) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_set_surrounding_with_selection(HANDLE(), Interop.allocateNativeString(text).HANDLE(), len, cursorIndex, anchorIndex);
    }
    
    /**
     * Sets whether the IM context should use the preedit string
     * to display feedback.
     * 
     * If @use_preedit is %FALSE (default is %TRUE), then the IM context
     * may use some other method to display feedback, such as displaying
     * it in a child of the root window.
     */
    public void setUsePreedit(boolean usePreedit) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_im_context_set_use_preedit(HANDLE(), usePreedit ? 1 : 0);
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
    public void onCommit(CommitHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextCommit", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("commit").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onDeleteSurrounding(DeleteSurroundingHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextDeleteSurrounding", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("delete-surrounding").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * [method@Gtk.IMContext.get_preedit_string] returns the empty string.
     */
    public void onPreeditChanged(PreeditChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextPreeditChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("preedit-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onPreeditEnd(PreeditEndHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextPreeditEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("preedit-end").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onPreeditStart(PreeditStartHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextPreeditStart", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("preedit-start").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * calling the [method@Gtk.IMContext.set_surrounding] method.
     */
    public void onRetrieveSurrounding(RetrieveSurroundingHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIMContextRetrieveSurrounding", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("retrieve-surrounding").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
