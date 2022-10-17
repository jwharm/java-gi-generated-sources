package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkIMContext} defines the interface for GTK input methods.
 * <p>
 * {@code GtkIMContext} is used by GTK text input widgets like {@code GtkText}
 * to map from key events to Unicode character strings.
 * <p>
 * An input method may consume multiple key events in sequence before finally
 * outputting the composed result. This is called <strong>preediting</strong>, and an input
 * method may provide feedback about this process by displaying the intermediate
 * composition states as preedit text. To do so, the {@code GtkIMContext} will emit
 * {@code Gtk.IMContext::preedit-changed}
 * and {@code Gtk.IMContext::preedit-end} signals.
 * <p>
 * For instance, the built-in GTK input method {@link IMContextSimple}
 * implements the input of arbitrary Unicode code points by holding down the
 * &lt;kbd&gt;Control&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt; keys and then typing &lt;kbd&gt;u&lt;/kbd&gt;
 * followed by the hexadecimal digits of the code point. When releasing the
 * &lt;kbd&gt;Control&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt; keys, preediting ends and the
 * character is inserted as text. For example,
 * <p>
 *     Ctrl+Shift+u 2 0 A C
 * <p>
 * results in the € sign.
 * <p>
 * Additional input methods can be made available for use by GTK widgets as
 * loadable modules. An input method module is a small shared library which
 * provides a {@code GIOExtension} for the extension point named "gtk-im-module".
 * <p>
 * To connect a widget to the users preferred input method, you should use
 * {@link IMMulticontext}.
 */
public class IMContext extends org.gtk.gobject.Object {

    public IMContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to IMContext */
    public static IMContext castFrom(org.gtk.gobject.Object gobject) {
        return new IMContext(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_im_context_delete_surrounding = Interop.downcallHandle(
        "gtk_im_context_delete_surrounding",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Asks the widget that the input context is attached to delete
     * characters around the cursor position by emitting the
     * {@code ::delete_surrounding} signal.
     * <p>
     * Note that {@code offset} and {@code n_chars} are in characters not in bytes
     * which differs from the usage other places in {@code GtkIMContext}.
     * <p>
     * In order to use this function, you should first call
     * {@link IMContext#getSurrounding} to get the current context,
     * and call this function immediately afterwards to make sure that you
     * know what you are deleting. You should also account for the fact
     * that even if the signal was handled, the input context might not
     * have deleted all the characters that were requested to be deleted.
     * <p>
     * This function is used by an input method that wants to make
     * subsitutions in the existing text in response to new input.
     * It is not useful for applications.
     */
    public boolean deleteSurrounding(@NotNull int offset, @NotNull int nChars) {
        int RESULT;
        try {
            RESULT = (int) gtk_im_context_delete_surrounding.invokeExact(handle(), offset, nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_im_context_filter_key = Interop.downcallHandle(
        "gtk_im_context_filter_key",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Allow an input method to forward key press and release events
     * to another input method without necessarily having a {@code GdkEvent}
     * available.
     */
    public boolean filterKey(@NotNull boolean press, @NotNull org.gtk.gdk.Surface surface, @NotNull org.gtk.gdk.Device device, @NotNull int time, @NotNull int keycode, @NotNull org.gtk.gdk.ModifierType state, @NotNull int group) {
        int RESULT;
        try {
            RESULT = (int) gtk_im_context_filter_key.invokeExact(handle(), press ? 1 : 0, surface.handle(), device.handle(), time, keycode, state.getValue(), group);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_im_context_filter_keypress = Interop.downcallHandle(
        "gtk_im_context_filter_keypress",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Allow an input method to internally handle key press and release
     * events.
     * <p>
     * If this function returns {@code true}, then no further processing
     * should be done for this key event.
     */
    public boolean filterKeypress(@NotNull org.gtk.gdk.Event event) {
        int RESULT;
        try {
            RESULT = (int) gtk_im_context_filter_keypress.invokeExact(handle(), event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_im_context_focus_in = Interop.downcallHandle(
        "gtk_im_context_focus_in",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Notify the input method that the widget to which this
     * input context corresponds has gained focus.
     * <p>
     * The input method may, for example, change the displayed
     * feedback to reflect this change.
     */
    public @NotNull void focusIn() {
        try {
            gtk_im_context_focus_in.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_im_context_focus_out = Interop.downcallHandle(
        "gtk_im_context_focus_out",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Notify the input method that the widget to which this
     * input context corresponds has lost focus.
     * <p>
     * The input method may, for example, change the displayed
     * feedback or reset the contexts state to reflect this change.
     */
    public @NotNull void focusOut() {
        try {
            gtk_im_context_focus_out.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_im_context_get_preedit_string = Interop.downcallHandle(
        "gtk_im_context_get_preedit_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieve the current preedit string for the input context,
     * and a list of attributes to apply to the string.
     * <p>
     * This string should be displayed inserted at the insertion point.
     */
    public @NotNull void getPreeditString(@NotNull Out<java.lang.String> str, @NotNull Out<org.pango.AttrList> attrs, @NotNull Out<Integer> cursorPos) {
        MemorySegment strPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment attrsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment cursorPosPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            gtk_im_context_get_preedit_string.invokeExact(handle(), (Addressable) strPOINTER.address(), (Addressable) attrsPOINTER.address(), (Addressable) cursorPosPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        str.set(strPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        attrs.set(new org.pango.AttrList(Refcounted.get(attrsPOINTER.get(ValueLayout.ADDRESS, 0), true)));
        cursorPos.set(cursorPosPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle gtk_im_context_get_surrounding_with_selection = Interop.downcallHandle(
        "gtk_im_context_get_surrounding_with_selection",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves context around the insertion point.
     * <p>
     * Input methods typically want context in order to constrain input
     * text based on existing text; this is important for languages such
     * as Thai where only some sequences of characters are allowed.
     * <p>
     * This function is implemented by emitting the
     * {@code Gtk.IMContext::retrieve-surrounding} signal on the input method;
     * in response to this signal, a widget should provide as much context as
     * is available, up to an entire paragraph, by calling
     * {@link IMContext#setSurroundingWithSelection}.
     * <p>
     * Note that there is no obligation for a widget to respond to the
     * {@code ::retrieve-surrounding} signal, so input methods must be prepared to
     * function without context.
     */
    public boolean getSurroundingWithSelection(@NotNull Out<java.lang.String> text, @NotNull Out<Integer> cursorIndex, @NotNull Out<Integer> anchorIndex) {
        MemorySegment textPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment cursorIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment anchorIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) gtk_im_context_get_surrounding_with_selection.invokeExact(handle(), (Addressable) textPOINTER.address(), (Addressable) cursorIndexPOINTER.address(), (Addressable) anchorIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        text.set(textPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        cursorIndex.set(cursorIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        anchorIndex.set(anchorIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_im_context_reset = Interop.downcallHandle(
        "gtk_im_context_reset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Notify the input method that a change such as a change in cursor
     * position has been made.
     * <p>
     * This will typically cause the input method to clear the preedit state.
     */
    public @NotNull void reset() {
        try {
            gtk_im_context_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_im_context_set_client_widget = Interop.downcallHandle(
        "gtk_im_context_set_client_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the client widget for the input context.
     * <p>
     * This is the {@code GtkWidget} holding the input focus. This widget is
     * used in order to correctly position status windows, and may
     * also be used for purposes internal to the input method.
     */
    public @NotNull void setClientWidget(@Nullable Widget widget) {
        try {
            gtk_im_context_set_client_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_im_context_set_cursor_location = Interop.downcallHandle(
        "gtk_im_context_set_cursor_location",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Notify the input method that a change in cursor
     * position has been made.
     * <p>
     * The location is relative to the client widget.
     */
    public @NotNull void setCursorLocation(@NotNull org.gtk.gdk.Rectangle area) {
        try {
            gtk_im_context_set_cursor_location.invokeExact(handle(), area.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_im_context_set_surrounding_with_selection = Interop.downcallHandle(
        "gtk_im_context_set_surrounding_with_selection",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets surrounding context around the insertion point and preedit
     * string. This function is expected to be called in response to the
     * {@code Gtk.IMContext::retrieve_surrounding} signal, and will likely
     * have no effect if called at other times.
     */
    public @NotNull void setSurroundingWithSelection(@NotNull java.lang.String text, @NotNull int len, @NotNull int cursorIndex, @NotNull int anchorIndex) {
        try {
            gtk_im_context_set_surrounding_with_selection.invokeExact(handle(), Interop.allocateNativeString(text), len, cursorIndex, anchorIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_im_context_set_use_preedit = Interop.downcallHandle(
        "gtk_im_context_set_use_preedit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the IM context should use the preedit string
     * to display feedback.
     * <p>
     * If {@code use_preedit} is {@code false} (default is {@code true}), then the IM context
     * may use some other method to display feedback, such as displaying
     * it in a child of the root window.
     */
    public @NotNull void setUsePreedit(@NotNull boolean usePreedit) {
        try {
            gtk_im_context_set_use_preedit.invokeExact(handle(), usePreedit ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CommitHandler {
        void signalReceived(IMContext source, @NotNull java.lang.String str);
    }
    
    /**
     * The ::commit signal is emitted when a complete input sequence
     * has been entered by the user.
     * <p>
     * If the commit comes after a preediting sequence, the
     * ::commit signal is emitted after ::preedit-end.
     * <p>
     * This can be a single character immediately after a key press or
     * the final result of preediting.
     */
    public SignalHandle onCommit(CommitHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("commit"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextCommit",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeleteSurroundingHandler {
        boolean signalReceived(IMContext source, @NotNull int offset, @NotNull int nChars);
    }
    
    /**
     * The ::delete-surrounding signal is emitted when the input method
     * needs to delete all or part of the context surrounding the cursor.
     */
    public SignalHandle onDeleteSurrounding(DeleteSurroundingHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("delete-surrounding"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextDeleteSurrounding",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreeditChangedHandler {
        void signalReceived(IMContext source);
    }
    
    /**
     * The ::preedit-changed signal is emitted whenever the preedit sequence
     * currently being entered has changed.
     * <p>
     * It is also emitted at the end of a preedit sequence, in which case
     * {@link IMContext#getPreeditString} returns the empty string.
     */
    public SignalHandle onPreeditChanged(PreeditChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preedit-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextPreeditChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preedit-end"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextPreeditEnd",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preedit-start"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextPreeditStart",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RetrieveSurroundingHandler {
        boolean signalReceived(IMContext source);
    }
    
    /**
     * The ::retrieve-surrounding signal is emitted when the input method
     * requires the context surrounding the cursor.
     * <p>
     * The callback should set the input method surrounding context by
     * calling the {@link IMContext#setSurrounding} method.
     */
    public SignalHandle onRetrieveSurrounding(RetrieveSurroundingHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("retrieve-surrounding"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextRetrieveSurrounding",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalIMContextCommit(MemoryAddress source, MemoryAddress str, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IMContext.CommitHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IMContext(Refcounted.get(source)), str.getUtf8String(0));
        }
        
        public static boolean signalIMContextDeleteSurrounding(MemoryAddress source, int offset, int nChars, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IMContext.DeleteSurroundingHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new IMContext(Refcounted.get(source)), offset, nChars);
        }
        
        public static void signalIMContextPreeditChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IMContext.PreeditChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IMContext(Refcounted.get(source)));
        }
        
        public static void signalIMContextPreeditEnd(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IMContext.PreeditEndHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IMContext(Refcounted.get(source)));
        }
        
        public static void signalIMContextPreeditStart(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IMContext.PreeditStartHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IMContext(Refcounted.get(source)));
        }
        
        public static boolean signalIMContextRetrieveSurrounding(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IMContext.RetrieveSurroundingHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new IMContext(Refcounted.get(source)));
        }
        
    }
}
