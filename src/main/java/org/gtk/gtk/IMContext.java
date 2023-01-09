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
public class IMContext extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIMContext";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a IMContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IMContext(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IMContext> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IMContext(input);
    
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean filterKey(boolean press, org.gtk.gdk.Surface surface, org.gtk.gdk.Device device, int time, int keycode, org.gtk.gdk.ModifierType state, int group) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_im_context_filter_key.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(press, null).intValue(),
                    surface.handle(),
                    device.handle(),
                    time,
                    keycode,
                    state.getValue(),
                    group);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean filterKeypress(org.gtk.gdk.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_im_context_filter_keypress.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            DowncallHandles.gtk_im_context_focus_in.invokeExact(handle());
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
            DowncallHandles.gtk_im_context_focus_out.invokeExact(handle());
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
    public void getPreeditString(Out<java.lang.String> str, Out<org.pango.AttrList> attrs, Out<Integer> cursorPos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment strPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment attrsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment cursorPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_im_context_get_preedit_string.invokeExact(
                        handle(),
                        (Addressable) strPOINTER.address(),
                        (Addressable) attrsPOINTER.address(),
                        (Addressable) cursorPosPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    str.set(Marshal.addressToString.marshal(strPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    attrs.set(org.pango.AttrList.fromAddress.marshal(attrsPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    cursorPos.set(cursorPosPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
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
    public boolean getSurrounding(Out<java.lang.String> text, Out<Integer> cursorIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment textPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment cursorIndexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_im_context_get_surrounding.invokeExact(
                        handle(),
                        (Addressable) textPOINTER.address(),
                        (Addressable) cursorIndexPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    text.set(Marshal.addressToString.marshal(textPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    cursorIndex.set(cursorIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean getSurroundingWithSelection(Out<java.lang.String> text, Out<Integer> cursorIndex, Out<Integer> anchorIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment textPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment cursorIndexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment anchorIndexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
                    text.set(Marshal.addressToString.marshal(textPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    cursorIndex.set(cursorIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
                    anchorIndex.set(anchorIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Notify the input method that a change such as a change in cursor
     * position has been made.
     * <p>
     * This will typically cause the input method to clear the preedit state.
     */
    public void reset() {
        try {
            DowncallHandles.gtk_im_context_reset.invokeExact(handle());
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
    public void setCursorLocation(org.gtk.gdk.Rectangle area) {
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
    public void setSurrounding(java.lang.String text, int len, int cursorIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_im_context_set_surrounding.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE),
                        len,
                        cursorIndex);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void setSurroundingWithSelection(java.lang.String text, int len, int cursorIndex, int anchorIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_im_context_set_surrounding_with_selection.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE),
                        len,
                        cursorIndex,
                        anchorIndex);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
                    Marshal.booleanToInteger.marshal(usePreedit, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_im_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Commit} callback.
     */
    @FunctionalInterface
    public interface Commit {
    
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
        void run(java.lang.String str);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceIMContext, MemoryAddress str) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(str, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Commit.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("commit", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteSurrounding} callback.
     */
    @FunctionalInterface
    public interface DeleteSurrounding {
    
        /**
         * The ::delete-surrounding signal is emitted when the input method
         * needs to delete all or part of the context surrounding the cursor.
         */
        boolean run(int offset, int nChars);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceIMContext, int offset, int nChars) {
            var RESULT = run(offset, nChars);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteSurrounding.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * The ::delete-surrounding signal is emitted when the input method
     * needs to delete all or part of the context surrounding the cursor.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IMContext.DeleteSurrounding> onDeleteSurrounding(IMContext.DeleteSurrounding handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("delete-surrounding", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PreeditChanged} callback.
     */
    @FunctionalInterface
    public interface PreeditChanged {
    
        /**
         * The ::preedit-changed signal is emitted whenever the preedit sequence
         * currently being entered has changed.
         * <p>
         * It is also emitted at the end of a preedit sequence, in which case
         * {@link IMContext#getPreeditString} returns the empty string.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceIMContext) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PreeditChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("preedit-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PreeditEnd} callback.
     */
    @FunctionalInterface
    public interface PreeditEnd {
    
        /**
         * The ::preedit-end signal is emitted when a preediting sequence
         * has been completed or canceled.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceIMContext) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PreeditEnd.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * The ::preedit-end signal is emitted when a preediting sequence
     * has been completed or canceled.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IMContext.PreeditEnd> onPreeditEnd(IMContext.PreeditEnd handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("preedit-end", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PreeditStart} callback.
     */
    @FunctionalInterface
    public interface PreeditStart {
    
        /**
         * The ::preedit-start signal is emitted when a new preediting sequence
         * starts.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceIMContext) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PreeditStart.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * The ::preedit-start signal is emitted when a new preediting sequence
     * starts.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IMContext.PreeditStart> onPreeditStart(IMContext.PreeditStart handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("preedit-start", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code RetrieveSurrounding} callback.
     */
    @FunctionalInterface
    public interface RetrieveSurrounding {
    
        /**
         * The ::retrieve-surrounding signal is emitted when the input method
         * requires the context surrounding the cursor.
         * <p>
         * The callback should set the input method surrounding context by
         * calling the {@link IMContext#setSurrounding} method.
         */
        boolean run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceIMContext) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RetrieveSurrounding.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("retrieve-surrounding", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link IMContext.Builder} object constructs a {@link IMContext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link IMContext.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link IMContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IMContext}.
         * @return A new instance of {@code IMContext} with the properties 
         *         that were set in the Builder object.
         */
        public IMContext build() {
            return (IMContext) org.gtk.gobject.GObject.newWithProperties(
                IMContext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Additional hints that allow input methods to fine-tune
         * their behaviour.
         * @param inputHints The value for the {@code input-hints} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputHints(org.gtk.gtk.InputHints inputHints) {
            names.add("input-hints");
            values.add(org.gtk.gobject.Value.create(inputHints));
            return this;
        }
        
        /**
         * The purpose of the text field that the `GtkIMContext is connected to.
         * <p>
         * This property can be used by on-screen keyboards and other input
         * methods to adjust their behaviour.
         * @param inputPurpose The value for the {@code input-purpose} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputPurpose(org.gtk.gtk.InputPurpose inputPurpose) {
            names.add("input-purpose");
            values.add(org.gtk.gobject.Value.create(inputPurpose));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_im_context_delete_surrounding = Interop.downcallHandle(
                "gtk_im_context_delete_surrounding",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_im_context_filter_key = Interop.downcallHandle(
                "gtk_im_context_filter_key",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_im_context_filter_keypress = Interop.downcallHandle(
                "gtk_im_context_filter_keypress",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_focus_in = Interop.downcallHandle(
                "gtk_im_context_focus_in",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_focus_out = Interop.downcallHandle(
                "gtk_im_context_focus_out",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_get_preedit_string = Interop.downcallHandle(
                "gtk_im_context_get_preedit_string",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_get_surrounding = Interop.downcallHandle(
                "gtk_im_context_get_surrounding",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_get_surrounding_with_selection = Interop.downcallHandle(
                "gtk_im_context_get_surrounding_with_selection",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_reset = Interop.downcallHandle(
                "gtk_im_context_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_set_client_widget = Interop.downcallHandle(
                "gtk_im_context_set_client_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_set_cursor_location = Interop.downcallHandle(
                "gtk_im_context_set_cursor_location",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_set_surrounding = Interop.downcallHandle(
                "gtk_im_context_set_surrounding",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_im_context_set_surrounding_with_selection = Interop.downcallHandle(
                "gtk_im_context_set_surrounding_with_selection",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_im_context_set_use_preedit = Interop.downcallHandle(
                "gtk_im_context_set_use_preedit",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_im_context_get_type = Interop.downcallHandle(
                "gtk_im_context_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_im_context_get_type != null;
    }
}
