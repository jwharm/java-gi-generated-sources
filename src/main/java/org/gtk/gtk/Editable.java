package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h2>Forcing entry to uppercase.</h2>
 * <p>
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
 * <h2>Implementing GtkEditable</h2>
 * <p>
 * The most likely scenario for implementing {@code GtkEditable} on your own widget
 * is that you will embed a {@code GtkText} inside a complex widget, and want to
 * delegate the editable functionality to that text widget. {@code GtkEditable}
 * provides some utility functions to make this easy.
 * <p>
 * In your class_init function, call {@link Gtk#Editable},
 * passing the first available property ID:
 * <p>
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
 * <p>
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
 * <p>
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
 * <p>
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
 * Finally, use {@link Gtk#Editable} in your {@code set_property}
 * function (and similar for {@code get_property}), to set the editable properties:
 * <p>
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

    static final MethodHandle gtk_editable_delete_selection = Interop.downcallHandle(
        "gtk_editable_delete_selection",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Deletes the currently selected text of the editable.
     * <p>
     * This call doesn’t do anything if there is no selected text.
     */
    public default void deleteSelection() {
        try {
            gtk_editable_delete_selection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_delete_text = Interop.downcallHandle(
        "gtk_editable_delete_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Deletes a sequence of characters.
     * <p>
     * The characters that are deleted are those characters at positions
     * from {@code start_pos} up to, but not including {@code end_pos}. If {@code end_pos} is
     * negative, then the characters deleted are those from {@code start_pos} to
     * the end of the text.
     * <p>
     * Note that the positions are specified in characters, not bytes.
     */
    public default void deleteText(int startPos, int endPos) {
        try {
            gtk_editable_delete_text.invokeExact(handle(), startPos, endPos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_finish_delegate = Interop.downcallHandle(
        "gtk_editable_finish_delegate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the setup done by {@link Editable#initDelegate}.
     * <p>
     * This is a helper function that should be called from dispose,
     * before removing the delegate object.
     */
    public default void finishDelegate() {
        try {
            gtk_editable_finish_delegate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_alignment = Interop.downcallHandle(
        "gtk_editable_get_alignment",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the alignment of the editable.
     */
    public default float getAlignment() {
        try {
            var RESULT = (float) gtk_editable_get_alignment.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_chars = Interop.downcallHandle(
        "gtk_editable_get_chars",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves a sequence of characters.
     * <p>
     * The characters that are retrieved are those characters at positions
     * from {@code start_pos} up to, but not including {@code end_pos}. If {@code end_pos} is negative,
     * then the characters retrieved are those characters from {@code start_pos} to
     * the end of the text.
     * <p>
     * Note that positions are specified in characters, not bytes.
     */
    public default java.lang.String getChars(int startPos, int endPos) {
        try {
            var RESULT = (MemoryAddress) gtk_editable_get_chars.invokeExact(handle(), startPos, endPos);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_delegate = Interop.downcallHandle(
        "gtk_editable_get_delegate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkEditable} that {@code editable} is delegating its
     * implementation to.
     * <p>
     * Typically, the delegate is a {@link Text} widget.
     */
    public default Editable getDelegate() {
        try {
            var RESULT = (MemoryAddress) gtk_editable_get_delegate.invokeExact(handle());
            return new Editable.EditableImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_editable = Interop.downcallHandle(
        "gtk_editable_get_editable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether {@code editable} is editable.
     */
    public default boolean getEditable() {
        try {
            var RESULT = (int) gtk_editable_get_editable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_enable_undo = Interop.downcallHandle(
        "gtk_editable_get_enable_undo",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets if undo/redo actions are enabled for {@code editable}
     */
    public default boolean getEnableUndo() {
        try {
            var RESULT = (int) gtk_editable_get_enable_undo.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_max_width_chars = Interop.downcallHandle(
        "gtk_editable_get_max_width_chars",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the desired maximum width of {@code editable}, in characters.
     */
    public default int getMaxWidthChars() {
        try {
            var RESULT = (int) gtk_editable_get_max_width_chars.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_position = Interop.downcallHandle(
        "gtk_editable_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the current position of the cursor relative
     * to the start of the content of the editable.
     * <p>
     * Note that this position is in characters, not in bytes.
     */
    public default int getPosition() {
        try {
            var RESULT = (int) gtk_editable_get_position.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_selection_bounds = Interop.downcallHandle(
        "gtk_editable_get_selection_bounds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the selection bound of the editable.
     * <p>
     * {@code start_pos} will be filled with the start of the selection and
     * {@code end_pos} with end. If no text was selected both will be identical
     * and {@code false} will be returned.
     * <p>
     * Note that positions are specified in characters, not bytes.
     */
    public default boolean getSelectionBounds(PointerInteger startPos, PointerInteger endPos) {
        try {
            var RESULT = (int) gtk_editable_get_selection_bounds.invokeExact(handle(), startPos.handle(), endPos.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_text = Interop.downcallHandle(
        "gtk_editable_get_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the contents of {@code editable}.
     * <p>
     * The returned string is owned by GTK and must not be modified or freed.
     */
    public default java.lang.String getText() {
        try {
            var RESULT = (MemoryAddress) gtk_editable_get_text.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_get_width_chars = Interop.downcallHandle(
        "gtk_editable_get_width_chars",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of characters of space reserved
     * for the contents of the editable.
     */
    public default int getWidthChars() {
        try {
            var RESULT = (int) gtk_editable_get_width_chars.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_init_delegate = Interop.downcallHandle(
        "gtk_editable_init_delegate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Sets up a delegate for {@code GtkEditable}.
     * <p>
     * This is assuming that the get_delegate vfunc in the {@code GtkEditable}
     * interface has been set up for the {@code editable}'s type.
     * <p>
     * This is a helper function that should be called in instance init,
     * after creating the delegate object.
     */
    public default void initDelegate() {
        try {
            gtk_editable_init_delegate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_insert_text = Interop.downcallHandle(
        "gtk_editable_insert_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code length} bytes of {@code text} into the contents of the
     * widget, at position {@code position}.
     * <p>
     * Note that the position is in characters, not in bytes.
     * The function updates {@code position} to point after the newly
     * inserted text.
     */
    public default void insertText(java.lang.String text, int length, PointerInteger position) {
        try {
            gtk_editable_insert_text.invokeExact(handle(), Interop.allocateNativeString(text).handle(), length, position.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_select_region = Interop.downcallHandle(
        "gtk_editable_select_region",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Selects a region of text.
     * <p>
     * The characters that are selected are those characters at positions
     * from {@code start_pos} up to, but not including {@code end_pos}. If {@code end_pos} is
     * negative, then the characters selected are those characters from
     * {@code start_pos} to  the end of the text.
     * <p>
     * Note that positions are specified in characters, not bytes.
     */
    public default void selectRegion(int startPos, int endPos) {
        try {
            gtk_editable_select_region.invokeExact(handle(), startPos, endPos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_set_alignment = Interop.downcallHandle(
        "gtk_editable_set_alignment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the alignment for the contents of the editable.
     * <p>
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the editable.
     */
    public default void setAlignment(float xalign) {
        try {
            gtk_editable_set_alignment.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_set_editable = Interop.downcallHandle(
        "gtk_editable_set_editable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if the user can edit the text in the editable widget.
     */
    public default void setEditable(boolean isEditable) {
        try {
            gtk_editable_set_editable.invokeExact(handle(), isEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_set_enable_undo = Interop.downcallHandle(
        "gtk_editable_set_enable_undo",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If enabled, changes to {@code editable} will be saved for undo/redo
     * actions.
     * <p>
     * This results in an additional copy of text changes and are not
     * stored in secure memory. As such, undo is forcefully disabled
     * when {@code Gtk.Text:visibility} is set to {@code false}.
     */
    public default void setEnableUndo(boolean enableUndo) {
        try {
            gtk_editable_set_enable_undo.invokeExact(handle(), enableUndo ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_set_max_width_chars = Interop.downcallHandle(
        "gtk_editable_set_max_width_chars",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the desired maximum width in characters of {@code editable}.
     */
    public default void setMaxWidthChars(int nChars) {
        try {
            gtk_editable_set_max_width_chars.invokeExact(handle(), nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_set_position = Interop.downcallHandle(
        "gtk_editable_set_position",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the cursor position in the editable to the given value.
     * <p>
     * The cursor is displayed before the character with the given (base 0)
     * index in the contents of the editable. The value must be less than
     * or equal to the number of characters in the editable. A value of -1
     * indicates that the position should be set after the last character
     * of the editable. Note that {@code position} is in characters, not in bytes.
     */
    public default void setPosition(int position) {
        try {
            gtk_editable_set_position.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_set_text = Interop.downcallHandle(
        "gtk_editable_set_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text in the editable to the given value.
     * <p>
     * This is replacing the current contents.
     */
    public default void setText(java.lang.String text) {
        try {
            gtk_editable_set_text.invokeExact(handle(), Interop.allocateNativeString(text).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_set_width_chars = Interop.downcallHandle(
        "gtk_editable_set_width_chars",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Changes the size request of the editable to be about the
     * right size for {@code n_chars} characters.
     * <p>
     * Note that it changes the size request, the size can still
     * be affected by how you pack the widget into containers.
     * If {@code n_chars} is -1, the size reverts to the default size.
     */
    public default void setWidthChars(int nChars) {
        try {
            gtk_editable_set_width_chars.invokeExact(handle(), nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_delegate_get_property = Interop.downcallHandle(
        "gtk_editable_delegate_get_property",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a property of the {@code GtkEditable} delegate for {@code object}.
     * <p>
     * This is helper function that should be called in the {@code get_property}
     * function of your {@code GtkEditable} implementation, before handling your
     * own properties.
     */
    public static boolean delegateGetProperty(org.gtk.gobject.Object object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
        try {
            var RESULT = (int) gtk_editable_delegate_get_property.invokeExact(object.handle(), propId, value.handle(), pspec.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_delegate_set_property = Interop.downcallHandle(
        "gtk_editable_delegate_set_property",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a property on the {@code GtkEditable} delegate for {@code object}.
     * <p>
     * This is a helper function that should be called in the {@code set_property}
     * function of your {@code GtkEditable} implementation, before handling your
     * own properties.
     */
    public static boolean delegateSetProperty(org.gtk.gobject.Object object, int propId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec) {
        try {
            var RESULT = (int) gtk_editable_delegate_set_property.invokeExact(object.handle(), propId, value.handle(), pspec.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_editable_install_properties = Interop.downcallHandle(
        "gtk_editable_install_properties",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     * functions, you can either use {@link Gtk#Editable}
     * and {@link Gtk#Editable} (if you are using
     * a delegate), or remember the {@code first_prop} offset and add it to the
     * values in the {@code Gtk.EditableProperties} enumeration to get the
     * property IDs for these properties.
     */
    public static int installProperties(org.gtk.gobject.ObjectClass objectClass, int firstProp) {
        try {
            var RESULT = (int) gtk_editable_install_properties.invokeExact(objectClass.handle(), firstProp);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Editable source);
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
     */
    public default SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Editable.Callbacks.class, "signalEditableChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeleteTextHandler {
        void signalReceived(Editable source, int startPos, int endPos);
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
     */
    public default SignalHandle onDeleteText(DeleteTextHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("delete-text").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Editable.Callbacks.class, "signalEditableDeleteText",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertTextHandler {
        void signalReceived(Editable source, java.lang.String text, int length, int position);
    }
    
    /**
     * Emitted when text is inserted into the widget by the user.
     * <p>
     * The default handler for this signal will normally be responsible
     * for inserting the text, so by connecting to this signal and then
     * stopping the signal with g_signal_stop_emission(), it is possible
     * to modify the inserted text, or prevent it from being inserted entirely.
     */
    public default SignalHandle onInsertText(InsertTextHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-text").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Editable.Callbacks.class, "signalEditableInsertText",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalEditableChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Editable.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Editable.EditableImpl(Refcounted.get(source)));
        }
        
        public static void signalEditableDeleteText(MemoryAddress source, int startPos, int endPos, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Editable.DeleteTextHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Editable.EditableImpl(Refcounted.get(source)), startPos, endPos);
        }
        
        public static void signalEditableInsertText(MemoryAddress source, MemoryAddress text, int length, int position, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Editable.InsertTextHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Editable.EditableImpl(Refcounted.get(source)), text.getUtf8String(0), length, position);
        }
        
    }
    
    class EditableImpl extends org.gtk.gobject.Object implements Editable {
        public EditableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}