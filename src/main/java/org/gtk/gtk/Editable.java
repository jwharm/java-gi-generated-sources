package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEditable} is an interface for text editing widgets.
 * <p>
 * Typical examples of editable widgets are {@link Entry} and
 * {@link SpinButton}. It contains functions for generically manipulating
 * an editable widget, a large number of action signals used for key bindings,
 * and several signals that an application can connect to modify the behavior
 * of a widget.
 * <p>
 * As an example of the latter usage, by connecting the following handler to
 * {@code Gtk.Editable::insert-text}, an application can convert all entry
 * into a widget into uppercase.
 * <p>
 * <strong>Forcing entry to uppercase.</strong><br/>
 * <pre>{@code c
 * #include <ctype.h>
 * 
 * void
 * insert_text_handler (GtkEditable *editable,
 *                      const char  *text,
 *                      int          length,
 *                      int         *position,
 *                      gpointer     data)
 * {
 *   char *result = g_utf8_strup (text, length);
 * 
 *   g_signal_handlers_block_by_func (editable,
 *                                (gpointer) insert_text_handler, data);
 *   gtk_editable_insert_text (editable, result, length, position);
 *   g_signal_handlers_unblock_by_func (editable,
 *                                      (gpointer) insert_text_handler, data);
 * 
 *   g_signal_stop_emission_by_name (editable, "insert_text");
 * 
 *   g_free (result);
 * }
 * }</pre>
 * <p>
 * <strong>Implementing GtkEditable</strong><br/>
 * The most likely scenario for implementing {@code GtkEditable} on your own widget
 * is that you will embed a {@code GtkText} inside a complex widget, and want to
 * delegate the editable functionality to that text widget. {@code GtkEditable}
 * provides some utility functions to make this easy.
 * <p>
 * In your class_init function, call {@link Editable#installProperties},
 * passing the first available property ID:
 * <pre>{@code c
 * static void
 * my_class_init (MyClass *class)
 * {
 *   ...
 *   g_object_class_install_properties (object_class, NUM_PROPERTIES, props);
 *   gtk_editable_install_properties (object_clas, NUM_PROPERTIES);
 *   ...
 * }
 * }</pre>
 * <p>
 * In your interface_init function for the {@code GtkEditable} interface, provide
 * an implementation for the get_delegate vfunc that returns your text widget:
 * <pre>{@code c
 * GtkEditable *
 * get_editable_delegate (GtkEditable *editable)
 * {
 *   return GTK_EDITABLE (MY_WIDGET (editable)->text_widget);
 * }
 * 
 * static void
 * my_editable_init (GtkEditableInterface *iface)
 * {
 *   iface->get_delegate = get_editable_delegate;
 * }
 * }</pre>
 * <p>
 * You don't need to provide any other vfuncs. The default implementations
 * work by forwarding to the delegate that the GtkEditableInterface.get_delegate()
 * vfunc returns.
 * <p>
 * In your instance_init function, create your text widget, and then call
 * {@link Editable#initDelegate}:
 * <pre>{@code c
 * static void
 * my_widget_init (MyWidget *self)
 * {
 *   ...
 *   self->text_widget = gtk_text_new ();
 *   gtk_editable_init_delegate (GTK_EDITABLE (self));
 *   ...
 * }
 * }</pre>
 * <p>
 * In your dispose function, call {@link Editable#finishDelegate} before
 * destroying your text widget:
 * <pre>{@code c
 * static void
 * my_widget_dispose (GObject *object)
 * {
 *   ...
 *   gtk_editable_finish_delegate (GTK_EDITABLE (self));
 *   g_clear_pointer (&self->text_widget, gtk_widget_unparent);
 *   ...
 * }
 * }</pre>
 * <p>
 * Finally, use {@link Editable#delegateSetProperty} in your {@code set_property}
 * function (and similar for {@code get_property}), to set the editable properties:
 * <pre>{@code c
 *   ...
 *   if (gtk_editable_delegate_set_property (object, prop_id, value, pspec))
 *     return;
 * 
 *   switch (prop_id)
 *   ...
 * }</pre>
 * <p>
 * It is important to note that if you create a {@code GtkEditable} that uses
 * a delegate, the low level {@code Gtk.Editable::insert-text} and
 * {@code Gtk.Editable::delete-text} signals will be propagated from the
 * "wrapper" editable to the delegate, but they will not be propagated from
 * the delegate to the "wrapper" editable, as they would cause an infinite
 * recursion. If you wish to connect to the {@code Gtk.Editable::insert-text}
 * and {@code Gtk.Editable::delete-text} signals, you will need to connect
 * to them on the delegate obtained via {@link Editable#getDelegate}.
 */
public interface Editable extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EditableImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EditableImpl(input);
    
    /**
     * Deletes the currently selected text of the editable.
     * <p>
     * This call doesn’t do anything if there is no selected text.
     */
    default void deleteSelection() {
        try {
            DowncallHandles.gtk_editable_delete_selection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deletes a sequence of characters.
     * <p>
     * The characters that are deleted are those characters at positions
     * from {@code start_pos} up to, but not including {@code end_pos}. If {@code end_pos} is
     * negative, then the characters deleted are those from {@code start_pos} to
     * the end of the text.
     * <p>
     * Note that the positions are specified in characters, not bytes.
     * @param startPos start position
     * @param endPos end position
     */
    default void deleteText(int startPos, int endPos) {
        try {
            DowncallHandles.gtk_editable_delete_text.invokeExact(
                    handle(),
                    startPos,
                    endPos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Undoes the setup done by {@link Editable#initDelegate}.
     * <p>
     * This is a helper function that should be called from dispose,
     * before removing the delegate object.
     */
    default void finishDelegate() {
        try {
            DowncallHandles.gtk_editable_finish_delegate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the alignment of the editable.
     * @return the alignment
     */
    default float getAlignment() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_editable_get_alignment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves a sequence of characters.
     * <p>
     * The characters that are retrieved are those characters at positions
     * from {@code start_pos} up to, but not including {@code end_pos}. If {@code end_pos} is negative,
     * then the characters retrieved are those characters from {@code start_pos} to
     * the end of the text.
     * <p>
     * Note that positions are specified in characters, not bytes.
     * @param startPos start of text
     * @param endPos end of text
     * @return a pointer to the contents of the widget as a
     *   string. This string is allocated by the {@code GtkEditable} implementation
     *   and should be freed by the caller.
     */
    default java.lang.String getChars(int startPos, int endPos) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_editable_get_chars.invokeExact(
                    handle(),
                    startPos,
                    endPos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the {@code GtkEditable} that {@code editable} is delegating its
     * implementation to.
     * <p>
     * Typically, the delegate is a {@link Text} widget.
     * @return the delegate {@code GtkEditable}
     */
    default @Nullable org.gtk.gtk.Editable getDelegate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_editable_get_delegate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Editable) Interop.register(RESULT, org.gtk.gtk.Editable.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves whether {@code editable} is editable.
     * @return {@code true} if {@code editable} is editable.
     */
    default boolean getEditable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_editable_get_editable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets if undo/redo actions are enabled for {@code editable}
     * @return {@code true} if undo is enabled
     */
    default boolean getEnableUndo() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_editable_get_enable_undo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the desired maximum width of {@code editable}, in characters.
     * @return the maximum width of the entry, in characters
     */
    default int getMaxWidthChars() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_editable_get_max_width_chars.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the current position of the cursor relative
     * to the start of the content of the editable.
     * <p>
     * Note that this position is in characters, not in bytes.
     * @return the cursor position
     */
    default int getPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_editable_get_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the selection bound of the editable.
     * <p>
     * {@code start_pos} will be filled with the start of the selection and
     * {@code end_pos} with end. If no text was selected both will be identical
     * and {@code false} will be returned.
     * <p>
     * Note that positions are specified in characters, not bytes.
     * @param startPos location to store the starting position
     * @param endPos location to store the end position
     * @return {@code true} if there is a non-empty selection, {@code false} otherwise
     */
    default boolean getSelectionBounds(Out<Integer> startPos, Out<Integer> endPos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment startPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment endPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_editable_get_selection_bounds.invokeExact(
                        handle(),
                        (Addressable) (startPos == null ? MemoryAddress.NULL : (Addressable) startPosPOINTER.address()),
                        (Addressable) (endPos == null ? MemoryAddress.NULL : (Addressable) endPosPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (startPos != null) startPos.set(startPosPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (endPos != null) endPos.set(endPosPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Retrieves the contents of {@code editable}.
     * <p>
     * The returned string is owned by GTK and must not be modified or freed.
     * @return a pointer to the contents of the editable
     */
    default java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_editable_get_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the number of characters of space reserved
     * for the contents of the editable.
     * @return number of chars to request space for, or negative if unset
     */
    default int getWidthChars() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_editable_get_width_chars.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets up a delegate for {@code GtkEditable}.
     * <p>
     * This is assuming that the get_delegate vfunc in the {@code GtkEditable}
     * interface has been set up for the {@code editable}'s type.
     * <p>
     * This is a helper function that should be called in instance init,
     * after creating the delegate object.
     */
    default void initDelegate() {
        try {
            DowncallHandles.gtk_editable_init_delegate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code length} bytes of {@code text} into the contents of the
     * widget, at position {@code position}.
     * <p>
     * Note that the position is in characters, not in bytes.
     * The function updates {@code position} to point after the newly
     * inserted text.
     * @param text the text to append
     * @param length the length of the text in bytes, or -1
     * @param position location of the position text will be inserted at
     */
    default void insertText(java.lang.String text, int length, Out<Integer> position) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment positionPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_editable_insert_text.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE),
                        length,
                        (Addressable) positionPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    position.set(positionPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Selects a region of text.
     * <p>
     * The characters that are selected are those characters at positions
     * from {@code start_pos} up to, but not including {@code end_pos}. If {@code end_pos} is
     * negative, then the characters selected are those characters from
     * {@code start_pos} to  the end of the text.
     * <p>
     * Note that positions are specified in characters, not bytes.
     * @param startPos start of region
     * @param endPos end of region
     */
    default void selectRegion(int startPos, int endPos) {
        try {
            DowncallHandles.gtk_editable_select_region.invokeExact(
                    handle(),
                    startPos,
                    endPos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the alignment for the contents of the editable.
     * <p>
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the editable.
     * @param xalign The horizontal alignment, from 0 (left) to 1 (right).
     *   Reversed for RTL layouts
     */
    default void setAlignment(float xalign) {
        try {
            DowncallHandles.gtk_editable_set_alignment.invokeExact(
                    handle(),
                    xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines if the user can edit the text in the editable widget.
     * @param isEditable {@code true} if the user is allowed to edit the text
     *   in the widget
     */
    default void setEditable(boolean isEditable) {
        try {
            DowncallHandles.gtk_editable_set_editable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(isEditable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If enabled, changes to {@code editable} will be saved for undo/redo
     * actions.
     * <p>
     * This results in an additional copy of text changes and are not
     * stored in secure memory. As such, undo is forcefully disabled
     * when {@code Gtk.Text:visibility} is set to {@code false}.
     * @param enableUndo if undo/redo should be enabled
     */
    default void setEnableUndo(boolean enableUndo) {
        try {
            DowncallHandles.gtk_editable_set_enable_undo.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enableUndo, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the desired maximum width in characters of {@code editable}.
     * @param nChars the new desired maximum width, in characters
     */
    default void setMaxWidthChars(int nChars) {
        try {
            DowncallHandles.gtk_editable_set_max_width_chars.invokeExact(
                    handle(),
                    nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the cursor position in the editable to the given value.
     * <p>
     * The cursor is displayed before the character with the given (base 0)
     * index in the contents of the editable. The value must be less than
     * or equal to the number of characters in the editable. A value of -1
     * indicates that the position should be set after the last character
     * of the editable. Note that {@code position} is in characters, not in bytes.
     * @param position the position of the cursor
     */
    default void setPosition(int position) {
        try {
            DowncallHandles.gtk_editable_set_position.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text in the editable to the given value.
     * <p>
     * This is replacing the current contents.
     * @param text the text to set
     */
    default void setText(java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_editable_set_text.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Changes the size request of the editable to be about the
     * right size for {@code n_chars} characters.
     * <p>
     * Note that it changes the size request, the size can still
     * be affected by how you pack the widget into containers.
     * If {@code n_chars} is -1, the size reverts to the default size.
     * @param nChars width in chars
     */
    default void setWidthChars(int nChars) {
        try {
            DowncallHandles.gtk_editable_set_width_chars.invokeExact(
                    handle(),
                    nChars);
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
            RESULT = (long) DowncallHandles.gtk_editable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets a property of the {@code GtkEditable} delegate for {@code object}.
     * <p>
     * This is helper function that should be called in the {@code get_property}
     * function of your {@code GtkEditable} implementation, before handling your
     * own properties.
     * @param object a {@code GObject}
     * @param propId a property ID
     * @param value value to set
     * @param pspec the {@code GParamSpec} for the property
     * @return {@code true} if the property was found
     */
    public static boolean delegateGetProperty(org.gtk.gobject.GObject object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_editable_delegate_get_property.invokeExact(
                    object.handle(),
                    propId,
                    value.handle(),
                    pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets a property on the {@code GtkEditable} delegate for {@code object}.
     * <p>
     * This is a helper function that should be called in the {@code set_property}
     * function of your {@code GtkEditable} implementation, before handling your
     * own properties.
     * @param object a {@code GObject}
     * @param propId a property ID
     * @param value value to set
     * @param pspec the {@code GParamSpec} for the property
     * @return {@code true} if the property was found
     */
    public static boolean delegateSetProperty(org.gtk.gobject.GObject object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_editable_delegate_set_property.invokeExact(
                    object.handle(),
                    propId,
                    value.handle(),
                    pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Overrides the {@code GtkEditable} properties for {@code class}.
     * <p>
     * This is a helper function that should be called in class_init,
     * after installing your own properties.
     * <p>
     * Note that your class must have "text", "cursor-position",
     * "selection-bound", "editable", "width-chars", "max-width-chars",
     * "xalign" and "enable-undo" properties for this function to work.
     * <p>
     * To handle the properties in your set_property and get_property
     * functions, you can either use {@link Editable#delegateSetProperty}
     * and {@link Editable#delegateGetProperty} (if you are using
     * a delegate), or remember the {@code first_prop} offset and add it to the
     * values in the {@code Gtk.EditableProperties} enumeration to get the
     * property IDs for these properties.
     * @param objectClass a {@code GObjectClass}
     * @param firstProp property ID to use for the first property
     * @return the number of properties that were installed
     */
    public static int installProperties(org.gtk.gobject.ObjectClass objectClass, int firstProp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_editable_install_properties.invokeExact(
                    objectClass.handle(),
                    firstProp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
        /**
         * Emitted at the end of a single user-visible operation on the
         * contents.
         * <p>
         * E.g., a paste operation that replaces the contents of the
         * selection will cause only one signal emission (even though it
         * is implemented by first deleting the selection, then inserting
         * the new content, and may cause multiple ::notify::text signals
         * to be emitted).
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEditable) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Changed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted at the end of a single user-visible operation on the
     * contents.
     * <p>
     * E.g., a paste operation that replaces the contents of the
     * selection will cause only one signal emission (even though it
     * is implemented by first deleting the selection, then inserting
     * the new content, and may cause multiple ::notify::text signals
     * to be emitted).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Editable.Changed> onChanged(Editable.Changed handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteText} callback.
     */
    @FunctionalInterface
    public interface DeleteText {
    
        /**
         * Emitted when text is deleted from the widget by the user.
         * <p>
         * The default handler for this signal will normally be responsible for
         * deleting the text, so by connecting to this signal and then stopping
         * the signal with g_signal_stop_emission(), it is possible to modify the
         * range of deleted text, or prevent it from being deleted entirely.
         * <p>
         * The {@code start_pos} and {@code end_pos} parameters are interpreted as for
         * {@link Editable#deleteText}.
         */
        void run(int startPos, int endPos);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEditable, int startPos, int endPos) {
            run(startPos, endPos);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteText.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when text is deleted from the widget by the user.
     * <p>
     * The default handler for this signal will normally be responsible for
     * deleting the text, so by connecting to this signal and then stopping
     * the signal with g_signal_stop_emission(), it is possible to modify the
     * range of deleted text, or prevent it from being deleted entirely.
     * <p>
     * The {@code start_pos} and {@code end_pos} parameters are interpreted as for
     * {@link Editable#deleteText}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Editable.DeleteText> onDeleteText(Editable.DeleteText handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("delete-text", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertText} callback.
     */
    @FunctionalInterface
    public interface InsertText {
    
        /**
         * Emitted when text is inserted into the widget by the user.
         * <p>
         * The default handler for this signal will normally be responsible
         * for inserting the text, so by connecting to this signal and then
         * stopping the signal with g_signal_stop_emission(), it is possible
         * to modify the inserted text, or prevent it from being inserted entirely.
         */
        void run(java.lang.String text, int length, Out<Integer> position);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEditable, MemoryAddress text, int length, MemoryAddress position) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> positionOUT = new Out<>(position.get(Interop.valueLayout.C_INT, 0));
                run(Marshal.addressToString.marshal(text, null), length, positionOUT);
                position.set(Interop.valueLayout.C_INT, 0, positionOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertText.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when text is inserted into the widget by the user.
     * <p>
     * The default handler for this signal will normally be responsible
     * for inserting the text, so by connecting to this signal and then
     * stopping the signal with g_signal_stop_emission(), it is possible
     * to modify the inserted text, or prevent it from being inserted entirely.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Editable.InsertText> onInsertText(Editable.InsertText handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("insert-text", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_delete_selection = Interop.downcallHandle(
                "gtk_editable_delete_selection",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_delete_text = Interop.downcallHandle(
                "gtk_editable_delete_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_finish_delegate = Interop.downcallHandle(
                "gtk_editable_finish_delegate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_alignment = Interop.downcallHandle(
                "gtk_editable_get_alignment",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_chars = Interop.downcallHandle(
                "gtk_editable_get_chars",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_delegate = Interop.downcallHandle(
                "gtk_editable_get_delegate",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_editable = Interop.downcallHandle(
                "gtk_editable_get_editable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_enable_undo = Interop.downcallHandle(
                "gtk_editable_get_enable_undo",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_max_width_chars = Interop.downcallHandle(
                "gtk_editable_get_max_width_chars",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_position = Interop.downcallHandle(
                "gtk_editable_get_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_selection_bounds = Interop.downcallHandle(
                "gtk_editable_get_selection_bounds",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_text = Interop.downcallHandle(
                "gtk_editable_get_text",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_width_chars = Interop.downcallHandle(
                "gtk_editable_get_width_chars",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_init_delegate = Interop.downcallHandle(
                "gtk_editable_init_delegate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_insert_text = Interop.downcallHandle(
                "gtk_editable_insert_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_select_region = Interop.downcallHandle(
                "gtk_editable_select_region",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_set_alignment = Interop.downcallHandle(
                "gtk_editable_set_alignment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_set_editable = Interop.downcallHandle(
                "gtk_editable_set_editable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_set_enable_undo = Interop.downcallHandle(
                "gtk_editable_set_enable_undo",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_set_max_width_chars = Interop.downcallHandle(
                "gtk_editable_set_max_width_chars",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_set_position = Interop.downcallHandle(
                "gtk_editable_set_position",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_set_text = Interop.downcallHandle(
                "gtk_editable_set_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_set_width_chars = Interop.downcallHandle(
                "gtk_editable_set_width_chars",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_get_type = Interop.downcallHandle(
                "gtk_editable_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_delegate_get_property = Interop.downcallHandle(
                "gtk_editable_delegate_get_property",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_delegate_set_property = Interop.downcallHandle(
                "gtk_editable_delegate_set_property",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_editable_install_properties = Interop.downcallHandle(
                "gtk_editable_install_properties",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * The EditableImpl type represents a native instance of the Editable interface.
     */
    class EditableImpl extends org.gtk.gobject.GObject implements Editable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Editable for the provided memory address.
         * @param address the memory address of the instance
         */
        public EditableImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_editable_get_type != null;
    }
}
