package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkText` widget is a single-line text entry widget.
 * 
 * `GtkText` is the common implementation of single-line text editing
 * that is shared between `GtkEntry`, `GtkPasswordEntry`, `GtkSpinButton`
 * and other widgets. In all of these, `GtkText` is used as the delegate
 * for the [iface@Gtk.Editable] implementation.
 * 
 * A fairly large set of key bindings are supported by default. If the
 * entered text is longer than the allocation of the widget, the widget
 * will scroll so that the cursor position is visible.
 * 
 * When using an entry for passwords and other sensitive information,
 * it can be put into “password mode” using [method@Gtk.Text.set_visibility].
 * In this mode, entered text is displayed using a “invisible” character.
 * By default, GTK picks the best invisible character that is available
 * in the current font, but it can be changed with
 * [method@Gtk.Text.set_invisible_char].
 * 
 * If you are looking to add icons or progress display in an entry, look
 * at `GtkEntry`. There other alternatives for more specialized use cases,
 * such as `GtkSearchEntry`.
 * 
 * If you need multi-line editable text, look at `GtkTextView`.
 * 
 * # CSS nodes
 * 
 * ```
 * text[.read-only]
 * ├── placeholder
 * ├── undershoot.left
 * ├── undershoot.right
 * ├── [selection]
 * ├── [block-cursor]
 * ╰── [window.popup]
 * ```
 * 
 * `GtkText` has a main node with the name text. Depending on the properties
 * of the widget, the .read-only style class may appear.
 * 
 * When the entry has a selection, it adds a subnode with the name selection.
 * 
 * When the entry is in overwrite mode, it adds a subnode with the name
 * block-cursor that determines how the block cursor is drawn.
 * 
 * The CSS node for a context menu is added as a subnode below text as well.
 * 
 * The undershoot nodes are used to draw the underflow indication when content
 * is scrolled out of view. These nodes get the .left and .right style classes
 * added depending on where the indication is drawn.
 * 
 * When touch is used and touch selection handles are shown, they are using
 * CSS nodes with name cursor-handle. They get the .top or .bottom style class
 * depending on where they are shown in relation to the selection. If there is
 * just a single handle for the text cursor, it gets the style class
 * .insertion-cursor.
 * 
 * # Accessibility
 * 
 * `GtkText` uses the %GTK_ACCESSIBLE_ROLE_NONE role, which causes it to be
 * skipped for accessibility. This is because `GtkText` is expected to be used
 * as a delegate for a `GtkEditable` implementation that will be represented
 * to accessibility.
 */
public class Text extends Widget implements Accessible, Buildable, ConstraintTarget, Editable {

    public Text(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Text */
    public static Text castFrom(org.gtk.gobject.Object gobject) {
        return new Text(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkText`.
     */
    public Text() {
        super(References.get(gtk_h.gtk_text_new(), false));
    }
    
    /**
     * Creates a new `GtkText` with the specified text buffer.
     */
    public static Text newWithBuffer(EntryBuffer buffer) {
        return new Text(References.get(gtk_h.gtk_text_new_with_buffer(buffer.handle()), false));
    }
    
    /**
     * Determine the positions of the strong and weak cursors if the
     * insertion point in the layout is at @position.
     * 
     * The position of each cursor is stored as a zero-width rectangle.
     * The strong cursor location is the location where characters of
     * the directionality equal to the base direction are inserted.
     * The weak cursor location is the location where characters of
     * the directionality opposite to the base direction are inserted.
     * 
     * The rectangle positions are in widget coordinates.
     */
    public void computeCursorExtents(long position, org.gtk.graphene.Rect strong, org.gtk.graphene.Rect weak) {
        gtk_h.gtk_text_compute_cursor_extents(handle(), position, strong.handle(), weak.handle());
    }
    
    /**
     * Returns whether pressing Enter will activate
     * the default widget for the window containing @self.
     * 
     * See [method@Gtk.Text.set_activates_default].
     */
    public boolean getActivatesDefault() {
        var RESULT = gtk_h.gtk_text_get_activates_default(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the attribute list that was set on the `GtkText`.
     * 
     * See [method@Gtk.Text.set_attributes].
     */
    public org.pango.AttrList getAttributes() {
        var RESULT = gtk_h.gtk_text_get_attributes(handle());
        return new org.pango.AttrList(References.get(RESULT, false));
    }
    
    /**
     * Get the `GtkEntryBuffer` object which holds the text for
     * this widget.
     */
    public EntryBuffer getBuffer() {
        var RESULT = gtk_h.gtk_text_get_buffer(handle());
        return new EntryBuffer(References.get(RESULT, false));
    }
    
    /**
     * Returns whether Emoji completion is enabled for this
     * `GtkText` widget.
     */
    public boolean getEnableEmojiCompletion() {
        var RESULT = gtk_h.gtk_text_get_enable_emoji_completion(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the menu model for extra items in the context menu.
     * 
     * See [method@Gtk.Text.set_extra_menu].
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        var RESULT = gtk_h.gtk_text_get_extra_menu(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Gets the input hints of the `GtkText`.
     */
    public int getInputHints() {
        var RESULT = gtk_h.gtk_text_get_input_hints(handle());
        return RESULT;
    }
    
    /**
     * Gets the input purpose of the `GtkText`.
     */
    public InputPurpose getInputPurpose() {
        var RESULT = gtk_h.gtk_text_get_input_purpose(handle());
        return InputPurpose.fromValue(RESULT);
    }
    
    /**
     * Retrieves the character displayed when visibility is set to false.
     * 
     * Note that GTK does not compute this value unless it needs it,
     * so the value returned by this function is not very useful unless
     * it has been explicitly set with [method@Gtk.Text.set_invisible_char].
     */
    public int getInvisibleChar() {
        var RESULT = gtk_h.gtk_text_get_invisible_char(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the maximum allowed length of the text in @self.
     * 
     * See [method@Gtk.Text.set_max_length].
     * 
     * This is equivalent to getting @self's `GtkEntryBuffer` and
     * calling [method@Gtk.EntryBuffer.get_max_length] on it.
     */
    public int getMaxLength() {
        var RESULT = gtk_h.gtk_text_get_max_length(handle());
        return RESULT;
    }
    
    /**
     * Gets whether text is overwritten when typing in the `GtkText`.
     * 
     * See [method@Gtk.Text.set_overwrite_mode].
     */
    public boolean getOverwriteMode() {
        var RESULT = gtk_h.gtk_text_get_overwrite_mode(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the text that will be displayed when
     * @self is empty and unfocused
     * 
     * If no placeholder text has been set, %NULL will be returned.
     */
    public java.lang.String getPlaceholderText() {
        var RESULT = gtk_h.gtk_text_get_placeholder_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the `GtkText` will grow and shrink
     * with the content.
     */
    public boolean getPropagateTextWidth() {
        var RESULT = gtk_h.gtk_text_get_propagate_text_width(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the tabstops that were set on the `GtkText`.
     * 
     * See [method@Gtk.Text.set_tabs].
     */
    public org.pango.TabArray getTabs() {
        var RESULT = gtk_h.gtk_text_get_tabs(handle());
        return new org.pango.TabArray(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the current length of the text in @self.
     * 
     * This is equivalent to getting @self's `GtkEntryBuffer`
     * and calling [method@Gtk.EntryBuffer.get_length] on it.
     */
    public short getTextLength() {
        var RESULT = gtk_h.gtk_text_get_text_length(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the `GtkText` will truncate multi-line text
     * that is pasted into the widget
     */
    public boolean getTruncateMultiline() {
        var RESULT = gtk_h.gtk_text_get_truncate_multiline(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves whether the text in @self is visible.
     */
    public boolean getVisibility() {
        var RESULT = gtk_h.gtk_text_get_visibility(handle());
        return (RESULT != 0);
    }
    
    /**
     * Causes @self to have keyboard focus.
     * 
     * It behaves like [method@Gtk.Widget.grab_focus],
     * except that it doesn't select the contents of @self.
     * You only want to call this on some special entries
     * which the user usually doesn't want to replace all text in,
     * such as search-as-you-type entries.
     */
    public boolean grabFocusWithoutSelecting() {
        var RESULT = gtk_h.gtk_text_grab_focus_without_selecting(handle());
        return (RESULT != 0);
    }
    
    /**
     * If @activates is %TRUE, pressing Enter will activate
     * the default widget for the window containing @self.
     * 
     * This usually means that the dialog containing the `GtkText`
     * will be closed, since the default widget is usually one of
     * the dialog buttons.
     */
    public void setActivatesDefault(boolean activates) {
        gtk_h.gtk_text_set_activates_default(handle(), activates ? 1 : 0);
    }
    
    /**
     * Sets attributes that are applied to the text.
     */
    public void setAttributes(org.pango.AttrList attrs) {
        gtk_h.gtk_text_set_attributes(handle(), attrs.handle());
    }
    
    /**
     * Set the `GtkEntryBuffer` object which holds the text for
     * this widget.
     */
    public void setBuffer(EntryBuffer buffer) {
        gtk_h.gtk_text_set_buffer(handle(), buffer.handle());
    }
    
    /**
     * Sets whether Emoji completion is enabled.
     * 
     * If it is, typing ':', followed by a recognized keyword,
     * will pop up a window with suggested Emojis matching the
     * keyword.
     */
    public void setEnableEmojiCompletion(boolean enableEmojiCompletion) {
        gtk_h.gtk_text_set_enable_emoji_completion(handle(), enableEmojiCompletion ? 1 : 0);
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for @self.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        gtk_h.gtk_text_set_extra_menu(handle(), model.handle());
    }
    
    /**
     * Sets input hints that allow input methods
     * to fine-tune their behaviour.
     */
    public void setInputHints(int hints) {
        gtk_h.gtk_text_set_input_hints(handle(), hints);
    }
    
    /**
     * Sets the input purpose of the `GtkText`.
     * 
     * This can be used by on-screen keyboards and other
     * input methods to adjust their behaviour.
     */
    public void setInputPurpose(InputPurpose purpose) {
        gtk_h.gtk_text_set_input_purpose(handle(), purpose.getValue());
    }
    
    /**
     * Sets the character to use when in “password mode”.
     * 
     * By default, GTK picks the best invisible char available in the
     * current font. If you set the invisible char to 0, then the user
     * will get no feedback at all; there will be no text on the screen
     * as they type.
     */
    public void setInvisibleChar(int ch) {
        gtk_h.gtk_text_set_invisible_char(handle(), ch);
    }
    
    /**
     * Sets the maximum allowed length of the contents of the widget.
     * 
     * If the current contents are longer than the given length, then
     * they will be truncated to fit.
     * 
     * This is equivalent to getting @self's `GtkEntryBuffer` and
     * calling [method@Gtk.EntryBuffer.set_max_length] on it.
     */
    public void setMaxLength(int length) {
        gtk_h.gtk_text_set_max_length(handle(), length);
    }
    
    /**
     * Sets whether the text is overwritten when typing
     * in the `GtkText`.
     */
    public void setOverwriteMode(boolean overwrite) {
        gtk_h.gtk_text_set_overwrite_mode(handle(), overwrite ? 1 : 0);
    }
    
    /**
     * Sets text to be displayed in @self when it is empty.
     * 
     * This can be used to give a visual hint of the expected
     * contents of the `GtkText`.
     */
    public void setPlaceholderText(java.lang.String text) {
        gtk_h.gtk_text_set_placeholder_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Sets whether the `GtkText` should grow and shrink with the content.
     */
    public void setPropagateTextWidth(boolean propagateTextWidth) {
        gtk_h.gtk_text_set_propagate_text_width(handle(), propagateTextWidth ? 1 : 0);
    }
    
    /**
     * Sets tabstops that are applied to the text.
     */
    public void setTabs(org.pango.TabArray tabs) {
        gtk_h.gtk_text_set_tabs(handle(), tabs.handle());
    }
    
    /**
     * Sets whether the `GtkText` should truncate multi-line text
     * that is pasted into the widget.
     */
    public void setTruncateMultiline(boolean truncateMultiline) {
        gtk_h.gtk_text_set_truncate_multiline(handle(), truncateMultiline ? 1 : 0);
    }
    
    /**
     * Sets whether the contents of the `GtkText` are visible or not.
     * 
     * When visibility is set to %FALSE, characters are displayed
     * as the invisible char, and will also appear that way when
     * the text in the widget is copied to the clipboard.
     * 
     * By default, GTK picks the best invisible character available
     * in the current font, but it can be changed with
     * [method@Gtk.Text.set_invisible_char].
     * 
     * Note that you probably want to set [property@Gtk.Text:input-purpose]
     * to %GTK_INPUT_PURPOSE_PASSWORD or %GTK_INPUT_PURPOSE_PIN to
     * inform input methods about the purpose of this self,
     * in addition to setting visibility to %FALSE.
     */
    public void setVisibility(boolean visible) {
        gtk_h.gtk_text_set_visibility(handle(), visible ? 1 : 0);
    }
    
    /**
     * Unsets the invisible char.
     * 
     * After calling this, the default invisible
     * char is used again.
     */
    public void unsetInvisibleChar() {
        gtk_h.gtk_text_unset_invisible_char(handle());
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted when the user hits the Enter key.
     * 
     * The default bindings for this signal are all forms
     * of the <kbd>Enter</kbd> key.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface BackspaceHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * <kbd>Backspace</kbd> and <kbd>Shift</kbd>-<kbd>Backspace</kbd>.
     */
    public void onBackspace(BackspaceHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBackspace", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("backspace").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CopyClipboardHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to copy the selection to the clipboard.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>-<kbd>c</kbd> and
     * <kbd>Ctrl</kbd>-<kbd>Insert</kbd>.
     */
    public void onCopyClipboard(CopyClipboardHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextCopyClipboard", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("copy-clipboard").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CutClipboardHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to cut the selection to the clipboard.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>-<kbd>x</kbd> and
     * <kbd>Shift</kbd>-<kbd>Delete</kbd>.
     */
    public void onCutClipboard(CutClipboardHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextCutClipboard", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cut-clipboard").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DeleteFromCursorHandler {
        void signalReceived(Text source, DeleteType type, int count);
    }
    
    /**
     * Emitted when the user initiates a text deletion.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * If the @type is %GTK_DELETE_CHARS, GTK deletes the selection
     * if there is one, otherwise it deletes the requested number
     * of characters.
     * 
     * The default bindings for this signal are <kbd>Delete</kbd>
     * for deleting a character and <kbd>Ctrl</kbd>-<kbd>Delete</kbd>
     * for deleting a word.
     */
    public void onDeleteFromCursor(DeleteFromCursorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextDeleteFromCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("delete-from-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertAtCursorHandler {
        void signalReceived(Text source, java.lang.String string);
    }
    
    /**
     * Emitted when the user initiates the insertion of a
     * fixed string at the cursor.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * This signal has no default bindings.
     */
    public void onInsertAtCursor(InsertAtCursorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextInsertAtCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("insert-at-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertEmojiHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to present the Emoji chooser for the widget.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>-<kbd>.</kbd> and
     * <kbd>Ctrl</kbd>-<kbd>;</kbd>
     */
    public void onInsertEmoji(InsertEmojiHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextInsertEmoji", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("insert-emoji").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        void signalReceived(Text source, MovementStep step, int count, boolean extend);
    }
    
    /**
     * Emitted when the user initiates a cursor movement.
     * 
     * If the cursor is not visible in @self, this signal causes
     * the viewport to be moved instead.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * 
     * The default bindings for this signal come in two variants,
     * the variant with the <kbd>Shift</kbd> modifier extends the
     * selection, the variant without it does not.
     * There are too many key combinations to list them all here.
     * 
     * - <kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd>
     *   move by individual characters/lines
     * - <kbd>Ctrl</kbd>-<kbd>→</kbd>, etc. move by words/paragraphs
     * - <kbd>Home</kbd>, <kbd>End</kbd> move to the ends of the buffer
     */
    public void onMoveCursor(MoveCursorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextMoveCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PasteClipboardHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to paste the contents of the clipboard.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * <kbd>Ctrl</kbd>-<kbd>v</kbd> and <kbd>Shift</kbd>-<kbd>Insert</kbd>.
     */
    public void onPasteClipboard(PasteClipboardHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextPasteClipboard", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("paste-clipboard").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PreeditChangedHandler {
        void signalReceived(Text source, java.lang.String preedit);
    }
    
    /**
     * Emitted when the preedit text changes.
     * 
     * If an input method is used, the typed text will not immediately
     * be committed to the buffer. So if you are interested in the text,
     * connect to this signal.
     */
    public void onPreeditChanged(PreeditChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextPreeditChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("preedit-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggleOverwriteHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to toggle the overwrite mode of the `GtkText`.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal is <kbd>Insert</kbd>.
     */
    public void onToggleOverwrite(ToggleOverwriteHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextToggleOverwrite", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggle-overwrite").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
