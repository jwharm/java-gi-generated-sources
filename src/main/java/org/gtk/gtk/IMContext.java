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
 * outputting the composed result. This is called <em>preediting</em>, and an input
 * method may provide feedback about this process by displaying the intermediate
 * composition states as preedit text. To do so, the {@code GtkIMContext} will emit
 * {@code Gtk.IMContext::preedit-start}, {@code Gtk.IMContext::preedit-changed}
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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIMContext";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a IMContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IMContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to IMContext if its GType is a (or inherits from) "GtkIMContext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code IMContext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkIMContext", a ClassCastException will be thrown.
     */
    public static IMContext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkIMContext"))) {
            return new IMContext(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkIMContext");
        }
    }
    
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
     * @param offset offset from cursor position in chars;
     *    a negative value means start before the cursor.
     * @param nChars number of characters to delete.
     * @return {@code true} if the signal was handled.
     */
    public boolean deleteSurrounding(int offset, int nChars) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_im_context_delete_surrounding.invokeExact(
                    handle(),
                    offset,
                    nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Allow an input method to forward key press and release events
     * to another input method without necessarily having a {@code GdkEvent}
     * available.
     * @param press whether to forward a key press or release event
     * @param surface the surface the event is for
     * @param device the device that the event is for
     * @param time the timestamp for the event
     * @param keycode the keycode for the event
     * @param state modifier state for the event
     * @param group the active keyboard group for the event
     * @return {@code true} if the input method handled the key event.
     */
    public boolean filterKey(boolean press, @NotNull org.gtk.gdk.Surface surface, @NotNull org.gtk.gdk.Device device, int time, int keycode, @NotNull org.gtk.gdk.ModifierType state, int group) {
        java.util.Objects.requireNonNull(surface, "Parameter 'surface' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_im_context_filter_key.invokeExact(
                    handle(),
                    press ? 1 : 0,
                    surface.handle(),
                    device.handle(),
                    time,
                    keycode,
                    state.getValue(),
                    group);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Allow an input method to internally handle key press and release
     * events.
     * <p>
     * If this function returns {@code true}, then no further processing
     * should be done for this key event.
     * @param event the key event
     * @return {@code true} if the input method handled the key event.
     */
    public boolean filterKeypress(@NotNull org.gtk.gdk.Event event) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_im_context_filter_keypress.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Notify the input method that the widget to which this
     * input context corresponds has gained focus.
     * <p>
     * The input method may, for example, change the displayed
     * feedback to reflect this change.
     */
    public void focusIn() {
        try {
            DowncallHandles.gtk_im_context_focus_in.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Notify the input method that the widget to which this
     * input context corresponds has lost focus.
     * <p>
     * The input method may, for example, change the displayed
     * feedback or reset the contexts state to reflect this change.
     */
    public void focusOut() {
        try {
            DowncallHandles.gtk_im_context_focus_out.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieve the current preedit string for the input context,
     * and a list of attributes to apply to the string.
     * <p>
     * This string should be displayed inserted at the insertion point.
     * @param str location to store the retrieved
     *   string. The string retrieved must be freed with g_free().
     * @param attrs location to store the retrieved
     *   attribute list. When you are done with this list, you
     *   must unreference it with {@link org.pango.AttrList#unref}.
     * @param cursorPos location to store position of cursor
     *   (in characters) within the preedit string.
     */
    public void getPreeditString(@NotNull Out<java.lang.String> str, @NotNull PointerProxy<org.pango.AttrList> attrs, Out<Integer> cursorPos) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        java.util.Objects.requireNonNull(attrs, "Parameter 'attrs' must not be null");
        java.util.Objects.requireNonNull(cursorPos, "Parameter 'cursorPos' must not be null");
        MemorySegment strPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment cursorPosPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_im_context_get_preedit_string.invokeExact(
                    handle(),
                    (Addressable) strPOINTER.address(),
                    attrs.handle(),
                    (Addressable) cursorPosPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        str.set(Interop.getStringFrom(strPOINTER.get(ValueLayout.ADDRESS, 0)));
        cursorPos.set(cursorPosPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Retrieves context around the insertion point.
     * <p>
     * Input methods typically want context in order to constrain input text
     * based on existing text; this is important for languages such as Thai
     * where only some sequences of characters are allowed.
     * <p>
     * This function is implemented by emitting the
     * {@code Gtk.IMContext::retrieve-surrounding} signal on the input method;
     * in response to this signal, a widget should provide as much context as
     * is available, up to an entire paragraph, by calling
     * {@link IMContext#setSurrounding}.
     * <p>
     * Note that there is no obligation for a widget to respond to the
     * {@code ::retrieve-surrounding} signal, so input methods must be prepared to
     * function without context.
     * @param text location to store a UTF-8 encoded
     *   string of text holding context around the insertion point.
     *   If the function returns {@code true}, then you must free the result
     *   stored in this location with g_free().
     * @param cursorIndex location to store byte index of the insertion
     *   cursor within {@code text}.
     * @return {@code TRUE} if surrounding text was provided; in this case
     *    you must free the result stored in {@code text}.
     * @deprecated Use {@link IMContext#getSurroundingWithSelection} instead.
     */
    @Deprecated
    public boolean getSurrounding(@NotNull Out<java.lang.String> text, Out<Integer> cursorIndex) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(cursorIndex, "Parameter 'cursorIndex' must not be null");
        MemorySegment textPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment cursorIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_im_context_get_surrounding.invokeExact(
                    handle(),
                    (Addressable) textPOINTER.address(),
                    (Addressable) cursorIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        text.set(Interop.getStringFrom(textPOINTER.get(ValueLayout.ADDRESS, 0)));
        cursorIndex.set(cursorIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
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
     * @param text location to store a UTF-8 encoded
     *   string of text holding context around the insertion point.
     *   If the function returns {@code true}, then you must free the result
     *   stored in this location with g_free().
     * @param cursorIndex location to store byte index of the insertion
     *   cursor within {@code text}.
     * @param anchorIndex location to store byte index of the selection
     *   bound within {@code text}
     * @return {@code TRUE} if surrounding text was provided; in this case
     *   you must free the result stored in {@code text}.
     */
    public boolean getSurroundingWithSelection(@NotNull Out<java.lang.String> text, Out<Integer> cursorIndex, Out<Integer> anchorIndex) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(cursorIndex, "Parameter 'cursorIndex' must not be null");
        java.util.Objects.requireNonNull(anchorIndex, "Parameter 'anchorIndex' must not be null");
        MemorySegment textPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment cursorIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment anchorIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_im_context_get_surrounding_with_selection.invokeExact(
                    handle(),
                    (Addressable) textPOINTER.address(),
                    (Addressable) cursorIndexPOINTER.address(),
                    (Addressable) anchorIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        text.set(Interop.getStringFrom(textPOINTER.get(ValueLayout.ADDRESS, 0)));
        cursorIndex.set(cursorIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        anchorIndex.set(anchorIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Notify the input method that a change such as a change in cursor
     * position has been made.
     * <p>
     * This will typically cause the input method to clear the preedit state.
     */
    public void reset() {
        try {
            DowncallHandles.gtk_im_context_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the client widget for the input context.
     * <p>
     * This is the {@code GtkWidget} holding the input focus. This widget is
     * used in order to correctly position status windows, and may
     * also be used for purposes internal to the input method.
     * @param widget the client widget. This may be {@code null} to indicate
     *   that the previous client widget no longer exists.
     */
    public void setClientWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_im_context_set_client_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Notify the input method that a change in cursor
     * position has been made.
     * <p>
     * The location is relative to the client widget.
     * @param area new location
     */
    public void setCursorLocation(@NotNull org.gtk.gdk.Rectangle area) {
        java.util.Objects.requireNonNull(area, "Parameter 'area' must not be null");
        try {
            DowncallHandles.gtk_im_context_set_cursor_location.invokeExact(
                    handle(),
                    area.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets surrounding context around the insertion point and preedit
     * string.
     * <p>
     * This function is expected to be called in response to the
     * {@code Gtk.IMContext::retrieve-surrounding} signal, and will
     * likely have no effect if called at other times.
     * @param text text surrounding the insertion point, as UTF-8.
     *   the preedit string should not be included within {@code text}
     * @param len the length of {@code text}, or -1 if {@code text} is nul-terminated
     * @param cursorIndex the byte index of the insertion cursor within {@code text}.
     * @deprecated Use {@link IMContext#setSurroundingWithSelection} instead
     */
    @Deprecated
    public void setSurrounding(@NotNull java.lang.String text, int len, int cursorIndex) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.gtk_im_context_set_surrounding.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    len,
                    cursorIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets surrounding context around the insertion point and preedit
     * string. This function is expected to be called in response to the
     * {@code Gtk.IMContext::retrieve_surrounding} signal, and will likely
     * have no effect if called at other times.
     * @param text text surrounding the insertion point, as UTF-8.
     *   the preedit string should not be included within {@code text}
     * @param len the length of {@code text}, or -1 if {@code text} is nul-terminated
     * @param cursorIndex the byte index of the insertion cursor within {@code text}
     * @param anchorIndex the byte index of the selection bound within {@code text}
     */
    public void setSurroundingWithSelection(@NotNull java.lang.String text, int len, int cursorIndex, int anchorIndex) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.gtk_im_context_set_surrounding_with_selection.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    len,
                    cursorIndex,
                    anchorIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the IM context should use the preedit string
     * to display feedback.
     * <p>
     * If {@code use_preedit} is {@code false} (default is {@code true}), then the IM context
     * may use some other method to display feedback, such as displaying
     * it in a child of the root window.
     * @param usePreedit whether the IM context should use the preedit string.
     */
    public void setUsePreedit(boolean usePreedit) {
        try {
            DowncallHandles.gtk_im_context_set_use_preedit.invokeExact(
                    handle(),
                    usePreedit ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Commit {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IMContext.Commit> onCommit(IMContext.Commit handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("commit"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextCommit",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IMContext.Commit>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeleteSurrounding {
        boolean signalReceived(IMContext source, int offset, int nChars);
    }
    
    /**
     * The ::delete-surrounding signal is emitted when the input method
     * needs to delete all or part of the context surrounding the cursor.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IMContext.DeleteSurrounding> onDeleteSurrounding(IMContext.DeleteSurrounding handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("delete-surrounding"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextDeleteSurrounding",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IMContext.DeleteSurrounding>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreeditChanged {
        void signalReceived(IMContext source);
    }
    
    /**
     * The ::preedit-changed signal is emitted whenever the preedit sequence
     * currently being entered has changed.
     * <p>
     * It is also emitted at the end of a preedit sequence, in which case
     * {@link IMContext#getPreeditString} returns the empty string.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IMContext.PreeditChanged> onPreeditChanged(IMContext.PreeditChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preedit-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextPreeditChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IMContext.PreeditChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreeditEnd {
        void signalReceived(IMContext source);
    }
    
    /**
     * The ::preedit-end signal is emitted when a preediting sequence
     * has been completed or canceled.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IMContext.PreeditEnd> onPreeditEnd(IMContext.PreeditEnd handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preedit-end"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextPreeditEnd",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IMContext.PreeditEnd>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreeditStart {
        void signalReceived(IMContext source);
    }
    
    /**
     * The ::preedit-start signal is emitted when a new preediting sequence
     * starts.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IMContext.PreeditStart> onPreeditStart(IMContext.PreeditStart handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preedit-start"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextPreeditStart",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IMContext.PreeditStart>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RetrieveSurrounding {
        boolean signalReceived(IMContext source);
    }
    
    /**
     * The ::retrieve-surrounding signal is emitted when the input method
     * requires the context surrounding the cursor.
     * <p>
     * The callback should set the input method surrounding context by
     * calling the {@link IMContext#setSurrounding} method.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IMContext.RetrieveSurrounding> onRetrieveSurrounding(IMContext.RetrieveSurrounding handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("retrieve-surrounding"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IMContext.Callbacks.class, "signalIMContextRetrieveSurrounding",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IMContext.RetrieveSurrounding>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_im_context_delete_surrounding = Interop.downcallHandle(
            "gtk_im_context_delete_surrounding",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_im_context_filter_key = Interop.downcallHandle(
            "gtk_im_context_filter_key",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_im_context_filter_keypress = Interop.downcallHandle(
            "gtk_im_context_filter_keypress",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_im_context_focus_in = Interop.downcallHandle(
            "gtk_im_context_focus_in",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_im_context_focus_out = Interop.downcallHandle(
            "gtk_im_context_focus_out",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_im_context_get_preedit_string = Interop.downcallHandle(
            "gtk_im_context_get_preedit_string",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_im_context_get_surrounding = Interop.downcallHandle(
            "gtk_im_context_get_surrounding",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_im_context_get_surrounding_with_selection = Interop.downcallHandle(
            "gtk_im_context_get_surrounding_with_selection",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_im_context_reset = Interop.downcallHandle(
            "gtk_im_context_reset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_im_context_set_client_widget = Interop.downcallHandle(
            "gtk_im_context_set_client_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_im_context_set_cursor_location = Interop.downcallHandle(
            "gtk_im_context_set_cursor_location",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_im_context_set_surrounding = Interop.downcallHandle(
            "gtk_im_context_set_surrounding",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_im_context_set_surrounding_with_selection = Interop.downcallHandle(
            "gtk_im_context_set_surrounding_with_selection",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_im_context_set_use_preedit = Interop.downcallHandle(
            "gtk_im_context_set_use_preedit",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalIMContextCommit(MemoryAddress source, MemoryAddress str, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (IMContext.Commit) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IMContext(source, Ownership.UNKNOWN), Interop.getStringFrom(str));
        }
        
        public static boolean signalIMContextDeleteSurrounding(MemoryAddress source, int offset, int nChars, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (IMContext.DeleteSurrounding) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new IMContext(source, Ownership.UNKNOWN), offset, nChars);
        }
        
        public static void signalIMContextPreeditChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (IMContext.PreeditChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IMContext(source, Ownership.UNKNOWN));
        }
        
        public static void signalIMContextPreeditEnd(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (IMContext.PreeditEnd) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IMContext(source, Ownership.UNKNOWN));
        }
        
        public static void signalIMContextPreeditStart(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (IMContext.PreeditStart) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IMContext(source, Ownership.UNKNOWN));
        }
        
        public static boolean signalIMContextRetrieveSurrounding(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (IMContext.RetrieveSurrounding) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new IMContext(source, Ownership.UNKNOWN));
        }
    }
}
