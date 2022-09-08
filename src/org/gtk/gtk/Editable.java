package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkEditable` is an interface for text editing widgets.
 * 
 * Typical examples of editable widgets are [class@Gtk.Entry] and
 * [class@Gtk.SpinButton]. It contains functions for generically manipulating
 * an editable widget, a large number of action signals used for key bindings,
 * and several signals that an application can connect to modify the behavior
 * of a widget.
 * 
 * As an example of the latter usage, by connecting the following handler to
 * [signal@Gtk.Editable::insert-text], an application can convert all entry
 * into a widget into uppercase.
 * 
 * ## Forcing entry to uppercase.
 * 
 * ```c
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
 * ```
 * 
 * ## Implementing GtkEditable
 * 
 * The most likely scenario for implementing `GtkEditable` on your own widget
 * is that you will embed a `GtkText` inside a complex widget, and want to
 * delegate the editable functionality to that text widget. `GtkEditable`
 * provides some utility functions to make this easy.
 * 
 * In your class_init function, call [func@Gtk.Editable.install_properties],
 * passing the first available property ID:
 * 
 * ```c
 * static void
 * my_class_init (MyClass *class)
 * {
 *   ...
 *   g_object_class_install_properties (object_class, NUM_PROPERTIES, props);
 *   gtk_editable_install_properties (object_clas, NUM_PROPERTIES);
 *   ...
 * }
 * ```
 * 
 * In your interface_init function for the `GtkEditable` interface, provide
 * an implementation for the get_delegate vfunc that returns your text widget:
 * 
 * ```c
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
 * ```
 * 
 * You don't need to provide any other vfuncs. The default implementations
 * work by forwarding to the delegate that the GtkEditableInterface.get_delegate()
 * vfunc returns.
 * 
 * In your instance_init function, create your text widget, and then call
 * [method@Gtk.Editable.init_delegate]:
 * 
 * ```c
 * static void
 * my_widget_init (MyWidget *self)
 * {
 *   ...
 *   self->text_widget = gtk_text_new ();
 *   gtk_editable_init_delegate (GTK_EDITABLE (self));
 *   ...
 * }
 * ```
 * 
 * In your dispose function, call [method@Gtk.Editable.finish_delegate] before
 * destroying your text widget:
 * 
 * ```c
 * static void
 * my_widget_dispose (GObject *object)
 * {
 *   ...
 *   gtk_editable_finish_delegate (GTK_EDITABLE (self));
 *   g_clear_pointer (&self->text_widget, gtk_widget_unparent);
 *   ...
 * }
 * ```
 * 
 * Finally, use [func@Gtk.Editable.delegate_set_property] in your `set_property`
 * function (and similar for `get_property`), to set the editable properties:
 * 
 * ```c
 *   ...
 *   if (gtk_editable_delegate_set_property (object, prop_id, value, pspec))
 *     return;
 * 
 *   switch (prop_id)
 *   ...
 * ```
 * 
 * It is important to note that if you create a `GtkEditable` that uses
 * a delegate, the low level [signal@Gtk.Editable::insert-text] and
 * [signal@Gtk.Editable::delete-text] signals will be propagated from the
 * "wrapper" editable to the delegate, but they will not be propagated from
 * the delegate to the "wrapper" editable, as they would cause an infinite
 * recursion. If you wish to connect to the [signal@Gtk.Editable::insert-text]
 * and [signal@Gtk.Editable::delete-text] signals, you will need to connect
 * to them on the delegate obtained via [method@Gtk.Editable.get_delegate].
 */
public interface Editable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Deletes the currently selected text of the editable.
     * 
     * This call doesn’t do anything if there is no selected text.
     */
    public default void deleteSelection() {
        gtk_h.gtk_editable_delete_selection(handle());
    }
    
    /**
     * Deletes a sequence of characters.
     * 
     * The characters that are deleted are those characters at positions
     * from @start_pos up to, but not including @end_pos. If @end_pos is
     * negative, then the characters deleted are those from @start_pos to
     * the end of the text.
     * 
     * Note that the positions are specified in characters, not bytes.
     */
    public default void deleteText(int startPos, int endPos) {
        gtk_h.gtk_editable_delete_text(handle(), startPos, endPos);
    }
    
    /**
     * Undoes the setup done by [method@Gtk.Editable.init_delegate].
     * 
     * This is a helper function that should be called from dispose,
     * before removing the delegate object.
     */
    public default void finishDelegate() {
        gtk_h.gtk_editable_finish_delegate(handle());
    }
    
    /**
     * Gets the alignment of the editable.
     */
    public default float getAlignment() {
        var RESULT = gtk_h.gtk_editable_get_alignment(handle());
        return RESULT;
    }
    
    /**
     * Retrieves a sequence of characters.
     * 
     * The characters that are retrieved are those characters at positions
     * from @start_pos up to, but not including @end_pos. If @end_pos is negative,
     * then the characters retrieved are those characters from @start_pos to
     * the end of the text.
     * 
     * Note that positions are specified in characters, not bytes.
     */
    public default java.lang.String getChars(int startPos, int endPos) {
        var RESULT = gtk_h.gtk_editable_get_chars(handle(), startPos, endPos);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the `GtkEditable` that @editable is delegating its
     * implementation to.
     * 
     * Typically, the delegate is a [class@Gtk.Text] widget.
     */
    public default Editable getDelegate() {
        var RESULT = gtk_h.gtk_editable_get_delegate(handle());
        return new Editable.EditableImpl(References.get(RESULT, false));
    }
    
    /**
     * Retrieves whether @editable is editable.
     */
    public default boolean getEditable() {
        var RESULT = gtk_h.gtk_editable_get_editable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets if undo/redo actions are enabled for @editable
     */
    public default boolean getEnableUndo() {
        var RESULT = gtk_h.gtk_editable_get_enable_undo(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the desired maximum width of @editable, in characters.
     */
    public default int getMaxWidthChars() {
        var RESULT = gtk_h.gtk_editable_get_max_width_chars(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the current position of the cursor relative
     * to the start of the content of the editable.
     * 
     * Note that this position is in characters, not in bytes.
     */
    public default int getPosition() {
        var RESULT = gtk_h.gtk_editable_get_position(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the contents of @editable.
     * 
     * The returned string is owned by GTK and must not be modified or freed.
     */
    public default java.lang.String getText() {
        var RESULT = gtk_h.gtk_editable_get_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the number of characters of space reserved
     * for the contents of the editable.
     */
    public default int getWidthChars() {
        var RESULT = gtk_h.gtk_editable_get_width_chars(handle());
        return RESULT;
    }
    
    /**
     * Sets up a delegate for `GtkEditable`.
     * 
     * This is assuming that the get_delegate vfunc in the `GtkEditable`
     * interface has been set up for the @editable's type.
     * 
     * This is a helper function that should be called in instance init,
     * after creating the delegate object.
     */
    public default void initDelegate() {
        gtk_h.gtk_editable_init_delegate(handle());
    }
    
    /**
     * Selects a region of text.
     * 
     * The characters that are selected are those characters at positions
     * from @start_pos up to, but not including @end_pos. If @end_pos is
     * negative, then the characters selected are those characters from
     * @start_pos to  the end of the text.
     * 
     * Note that positions are specified in characters, not bytes.
     */
    public default void selectRegion(int startPos, int endPos) {
        gtk_h.gtk_editable_select_region(handle(), startPos, endPos);
    }
    
    /**
     * Sets the alignment for the contents of the editable.
     * 
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the editable.
     */
    public default void setAlignment(float xalign) {
        gtk_h.gtk_editable_set_alignment(handle(), xalign);
    }
    
    /**
     * Determines if the user can edit the text in the editable widget.
     */
    public default void setEditable(boolean isEditable) {
        gtk_h.gtk_editable_set_editable(handle(), isEditable ? 1 : 0);
    }
    
    /**
     * If enabled, changes to @editable will be saved for undo/redo
     * actions.
     * 
     * This results in an additional copy of text changes and are not
     * stored in secure memory. As such, undo is forcefully disabled
     * when [property@Gtk.Text:visibility] is set to %FALSE.
     */
    public default void setEnableUndo(boolean enableUndo) {
        gtk_h.gtk_editable_set_enable_undo(handle(), enableUndo ? 1 : 0);
    }
    
    /**
     * Sets the desired maximum width in characters of @editable.
     */
    public default void setMaxWidthChars(int nChars) {
        gtk_h.gtk_editable_set_max_width_chars(handle(), nChars);
    }
    
    /**
     * Sets the cursor position in the editable to the given value.
     * 
     * The cursor is displayed before the character with the given (base 0)
     * index in the contents of the editable. The value must be less than
     * or equal to the number of characters in the editable. A value of -1
     * indicates that the position should be set after the last character
     * of the editable. Note that @position is in characters, not in bytes.
     */
    public default void setPosition(int position) {
        gtk_h.gtk_editable_set_position(handle(), position);
    }
    
    /**
     * Sets the text in the editable to the given value.
     * 
     * This is replacing the current contents.
     */
    public default void setText(java.lang.String text) {
        gtk_h.gtk_editable_set_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Changes the size request of the editable to be about the
     * right size for @n_chars characters.
     * 
     * Note that it changes the size request, the size can still
     * be affected by how you pack the widget into containers.
     * If @n_chars is -1, the size reverts to the default size.
     */
    public default void setWidthChars(int nChars) {
        gtk_h.gtk_editable_set_width_chars(handle(), nChars);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Editable source);
    }
    
    /**
     * Emitted at the end of a single user-visible operation on the
     * contents.
     * 
     * E.g., a paste operation that replaces the contents of the
     * selection will cause only one signal emission (even though it
     * is implemented by first deleting the selection, then inserting
     * the new content, and may cause multiple ::notify::text signals
     * to be emitted).
     */
    public default void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEditableChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DeleteTextHandler {
        void signalReceived(Editable source, int startPos, int endPos);
    }
    
    /**
     * Emitted when text is deleted from the widget by the user.
     * 
     * The default handler for this signal will normally be responsible for
     * deleting the text, so by connecting to this signal and then stopping
     * the signal with g_signal_stop_emission(), it is possible to modify the
     * range of deleted text, or prevent it from being deleted entirely.
     * 
     * The @start_pos and @end_pos parameters are interpreted as for
     * [method@Gtk.Editable.delete_text].
     */
    public default void onDeleteText(DeleteTextHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEditableDeleteText", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("delete-text").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertTextHandler {
        void signalReceived(Editable source, java.lang.String text, int length, int position);
    }
    
    /**
     * Emitted when text is inserted into the widget by the user.
     * 
     * The default handler for this signal will normally be responsible
     * for inserting the text, so by connecting to this signal and then
     * stopping the signal with g_signal_stop_emission(), it is possible
     * to modify the inserted text, or prevent it from being inserted entirely.
     */
    public default void onInsertText(InsertTextHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEditableInsertText", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("insert-text").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class EditableImpl extends org.gtk.gobject.Object implements Editable {
        public EditableImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
