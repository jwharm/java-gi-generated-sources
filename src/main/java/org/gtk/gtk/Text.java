package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkText} widget is a single-line text entry widget.
 * <p>
 * {@code GtkText} is the common implementation of single-line text editing
 * that is shared between {@code GtkEntry}, {@code GtkPasswordEntry}, {@code GtkSpinButton}
 * and other widgets. In all of these, {@code GtkText} is used as the delegate
 * for the {@code Gtk.Editable} implementation.
 * <p>
 * A fairly large set of key bindings are supported by default. If the
 * entered text is longer than the allocation of the widget, the widget
 * will scroll so that the cursor position is visible.
 * <p>
 * When using an entry for passwords and other sensitive information,
 * it can be put into “password mode” using {@link Text#setVisibility}.
 * In this mode, entered text is displayed using a “invisible” character.
 * By default, GTK picks the best invisible character that is available
 * in the current font, but it can be changed with
 * {@link Text#setInvisibleChar}.
 * <p>
 * If you are looking to add icons or progress display in an entry, look
 * at {@code GtkEntry}. There other alternatives for more specialized use cases,
 * such as {@code GtkSearchEntry}.
 * <p>
 * If you need multi-line editable text, look at {@code GtkTextView}.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * text[.read-only]
 * ├── placeholder
 * ├── undershoot.left
 * ├── undershoot.right
 * ├── [selection]
 * ├── [block-cursor]
 * ╰── [window.popup]
 * }</pre>
 * <p>
 * {@code GtkText} has a main node with the name text. Depending on the properties
 * of the widget, the .read-only style class may appear.
 * <p>
 * When the entry has a selection, it adds a subnode with the name selection.
 * <p>
 * When the entry is in overwrite mode, it adds a subnode with the name
 * block-cursor that determines how the block cursor is drawn.
 * <p>
 * The CSS node for a context menu is added as a subnode below text as well.
 * <p>
 * The undershoot nodes are used to draw the underflow indication when content
 * is scrolled out of view. These nodes get the .left and .right style classes
 * added depending on where the indication is drawn.
 * <p>
 * When touch is used and touch selection handles are shown, they are using
 * CSS nodes with name cursor-handle. They get the .top or .bottom style class
 * depending on where they are shown in relation to the selection. If there is
 * just a single handle for the text cursor, it gets the style class
 * .insertion-cursor.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkText} uses the {@link AccessibleRole#NONE} role, which causes it to be
 * skipped for accessibility. This is because {@code GtkText} is expected to be used
 * as a delegate for a {@code GtkEditable} implementation that will be represented
 * to accessibility.
 */
public class Text extends Widget implements Accessible, Buildable, ConstraintTarget, Editable {

    public Text(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Text */
    public static Text castFrom(org.gtk.gobject.Object gobject) {
        return new Text(gobject.refcounted());
    }
    
    static final MethodHandle gtk_text_new = Interop.downcallHandle(
        "gtk_text_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_text_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkText}.
     */
    public Text() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_text_new_with_buffer = Interop.downcallHandle(
        "gtk_text_new_with_buffer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithBuffer(EntryBuffer buffer) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_text_new_with_buffer.invokeExact(buffer.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkText} with the specified text buffer.
     */
    public static Text newWithBuffer(EntryBuffer buffer) {
        return new Text(constructNewWithBuffer(buffer));
    }
    
    static final MethodHandle gtk_text_compute_cursor_extents = Interop.downcallHandle(
        "gtk_text_compute_cursor_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Determine the positions of the strong and weak cursors if the
     * insertion point in the layout is at {@code position}.
     * <p>
     * The position of each cursor is stored as a zero-width rectangle.
     * The strong cursor location is the location where characters of
     * the directionality equal to the base direction are inserted.
     * The weak cursor location is the location where characters of
     * the directionality opposite to the base direction are inserted.
     * <p>
     * The rectangle positions are in widget coordinates.
     */
    public void computeCursorExtents(long position, org.gtk.graphene.Rect strong, org.gtk.graphene.Rect weak) {
        try {
            gtk_text_compute_cursor_extents.invokeExact(handle(), position, strong.handle(), weak.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_activates_default = Interop.downcallHandle(
        "gtk_text_get_activates_default",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether pressing Enter will activate
     * the default widget for the window containing {@code self}.
     * <p>
     * See {@link Text#setActivatesDefault}.
     */
    public boolean getActivatesDefault() {
        try {
            var RESULT = (int) gtk_text_get_activates_default.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_attributes = Interop.downcallHandle(
        "gtk_text_get_attributes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the attribute list that was set on the {@code GtkText}.
     * <p>
     * See {@link Text#setAttributes}.
     */
    public org.pango.AttrList getAttributes() {
        try {
            var RESULT = (MemoryAddress) gtk_text_get_attributes.invokeExact(handle());
            return new org.pango.AttrList(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_buffer = Interop.downcallHandle(
        "gtk_text_get_buffer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     */
    public EntryBuffer getBuffer() {
        try {
            var RESULT = (MemoryAddress) gtk_text_get_buffer.invokeExact(handle());
            return new EntryBuffer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_enable_emoji_completion = Interop.downcallHandle(
        "gtk_text_get_enable_emoji_completion",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether Emoji completion is enabled for this
     * {@code GtkText} widget.
     */
    public boolean getEnableEmojiCompletion() {
        try {
            var RESULT = (int) gtk_text_get_enable_emoji_completion.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_extra_menu = Interop.downcallHandle(
        "gtk_text_get_extra_menu",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the menu model for extra items in the context menu.
     * <p>
     * See {@link Text#setExtraMenu}.
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        try {
            var RESULT = (MemoryAddress) gtk_text_get_extra_menu.invokeExact(handle());
            return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_input_hints = Interop.downcallHandle(
        "gtk_text_get_input_hints",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the input hints of the {@code GtkText}.
     */
    public InputHints getInputHints() {
        try {
            var RESULT = (int) gtk_text_get_input_hints.invokeExact(handle());
            return new InputHints(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_input_purpose = Interop.downcallHandle(
        "gtk_text_get_input_purpose",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the input purpose of the {@code GtkText}.
     */
    public InputPurpose getInputPurpose() {
        try {
            var RESULT = (int) gtk_text_get_input_purpose.invokeExact(handle());
            return new InputPurpose(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_invisible_char = Interop.downcallHandle(
        "gtk_text_get_invisible_char",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the character displayed when visibility is set to false.
     * <p>
     * Note that GTK does not compute this value unless it needs it,
     * so the value returned by this function is not very useful unless
     * it has been explicitly set with {@link Text#setInvisibleChar}.
     */
    public int getInvisibleChar() {
        try {
            var RESULT = (int) gtk_text_get_invisible_char.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_max_length = Interop.downcallHandle(
        "gtk_text_get_max_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the maximum allowed length of the text in {@code self}.
     * <p>
     * See {@link Text#setMaxLength}.
     * <p>
     * This is equivalent to getting {@code self}'s {@code GtkEntryBuffer} and
     * calling {@link EntryBuffer#getMaxLength} on it.
     */
    public int getMaxLength() {
        try {
            var RESULT = (int) gtk_text_get_max_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_overwrite_mode = Interop.downcallHandle(
        "gtk_text_get_overwrite_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether text is overwritten when typing in the {@code GtkText}.
     * <p>
     * See {@link Text#setOverwriteMode}.
     */
    public boolean getOverwriteMode() {
        try {
            var RESULT = (int) gtk_text_get_overwrite_mode.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_placeholder_text = Interop.downcallHandle(
        "gtk_text_get_placeholder_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the text that will be displayed when
     * {@code self} is empty and unfocused
     * <p>
     * If no placeholder text has been set, {@code null} will be returned.
     */
    public java.lang.String getPlaceholderText() {
        try {
            var RESULT = (MemoryAddress) gtk_text_get_placeholder_text.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_propagate_text_width = Interop.downcallHandle(
        "gtk_text_get_propagate_text_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code GtkText} will grow and shrink
     * with the content.
     */
    public boolean getPropagateTextWidth() {
        try {
            var RESULT = (int) gtk_text_get_propagate_text_width.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_tabs = Interop.downcallHandle(
        "gtk_text_get_tabs",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the tabstops that were set on the {@code GtkText}.
     * <p>
     * See {@link Text#setTabs}.
     */
    public org.pango.TabArray getTabs() {
        try {
            var RESULT = (MemoryAddress) gtk_text_get_tabs.invokeExact(handle());
            return new org.pango.TabArray(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_text_length = Interop.downcallHandle(
        "gtk_text_get_text_length",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the current length of the text in {@code self}.
     * <p>
     * This is equivalent to getting {@code self}'s {@code GtkEntryBuffer}
     * and calling {@link EntryBuffer#getLength} on it.
     */
    public short getTextLength() {
        try {
            var RESULT = (short) gtk_text_get_text_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_truncate_multiline = Interop.downcallHandle(
        "gtk_text_get_truncate_multiline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code GtkText} will truncate multi-line text
     * that is pasted into the widget
     */
    public boolean getTruncateMultiline() {
        try {
            var RESULT = (int) gtk_text_get_truncate_multiline.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_get_visibility = Interop.downcallHandle(
        "gtk_text_get_visibility",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the text in {@code self} is visible.
     */
    public boolean getVisibility() {
        try {
            var RESULT = (int) gtk_text_get_visibility.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_grab_focus_without_selecting = Interop.downcallHandle(
        "gtk_text_grab_focus_without_selecting",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Causes {@code self} to have keyboard focus.
     * <p>
     * It behaves like {@link Widget#grabFocus},
     * except that it doesn't select the contents of {@code self}.
     * You only want to call this on some special entries
     * which the user usually doesn't want to replace all text in,
     * such as search-as-you-type entries.
     */
    public boolean grabFocusWithoutSelecting() {
        try {
            var RESULT = (int) gtk_text_grab_focus_without_selecting.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_activates_default = Interop.downcallHandle(
        "gtk_text_set_activates_default",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code activates} is {@code true}, pressing Enter will activate
     * the default widget for the window containing {@code self}.
     * <p>
     * This usually means that the dialog containing the {@code GtkText}
     * will be closed, since the default widget is usually one of
     * the dialog buttons.
     */
    public void setActivatesDefault(boolean activates) {
        try {
            gtk_text_set_activates_default.invokeExact(handle(), activates ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_attributes = Interop.downcallHandle(
        "gtk_text_set_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets attributes that are applied to the text.
     */
    public void setAttributes(org.pango.AttrList attrs) {
        try {
            gtk_text_set_attributes.invokeExact(handle(), attrs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_buffer = Interop.downcallHandle(
        "gtk_text_set_buffer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     */
    public void setBuffer(EntryBuffer buffer) {
        try {
            gtk_text_set_buffer.invokeExact(handle(), buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_enable_emoji_completion = Interop.downcallHandle(
        "gtk_text_set_enable_emoji_completion",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether Emoji completion is enabled.
     * <p>
     * If it is, typing ':', followed by a recognized keyword,
     * will pop up a window with suggested Emojis matching the
     * keyword.
     */
    public void setEnableEmojiCompletion(boolean enableEmojiCompletion) {
        try {
            gtk_text_set_enable_emoji_completion.invokeExact(handle(), enableEmojiCompletion ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_extra_menu = Interop.downcallHandle(
        "gtk_text_set_extra_menu",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code self}.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        try {
            gtk_text_set_extra_menu.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_input_hints = Interop.downcallHandle(
        "gtk_text_set_input_hints",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets input hints that allow input methods
     * to fine-tune their behaviour.
     */
    public void setInputHints(InputHints hints) {
        try {
            gtk_text_set_input_hints.invokeExact(handle(), hints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_input_purpose = Interop.downcallHandle(
        "gtk_text_set_input_purpose",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the input purpose of the {@code GtkText}.
     * <p>
     * This can be used by on-screen keyboards and other
     * input methods to adjust their behaviour.
     */
    public void setInputPurpose(InputPurpose purpose) {
        try {
            gtk_text_set_input_purpose.invokeExact(handle(), purpose.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_invisible_char = Interop.downcallHandle(
        "gtk_text_set_invisible_char",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the character to use when in “password mode”.
     * <p>
     * By default, GTK picks the best invisible char available in the
     * current font. If you set the invisible char to 0, then the user
     * will get no feedback at all; there will be no text on the screen
     * as they type.
     */
    public void setInvisibleChar(int ch) {
        try {
            gtk_text_set_invisible_char.invokeExact(handle(), ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_max_length = Interop.downcallHandle(
        "gtk_text_set_max_length",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum allowed length of the contents of the widget.
     * <p>
     * If the current contents are longer than the given length, then
     * they will be truncated to fit.
     * <p>
     * This is equivalent to getting {@code self}'s {@code GtkEntryBuffer} and
     * calling {@link EntryBuffer#setMaxLength} on it.
     */
    public void setMaxLength(int length) {
        try {
            gtk_text_set_max_length.invokeExact(handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_overwrite_mode = Interop.downcallHandle(
        "gtk_text_set_overwrite_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the text is overwritten when typing
     * in the {@code GtkText}.
     */
    public void setOverwriteMode(boolean overwrite) {
        try {
            gtk_text_set_overwrite_mode.invokeExact(handle(), overwrite ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_placeholder_text = Interop.downcallHandle(
        "gtk_text_set_placeholder_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets text to be displayed in {@code self} when it is empty.
     * <p>
     * This can be used to give a visual hint of the expected
     * contents of the {@code GtkText}.
     */
    public void setPlaceholderText(java.lang.String text) {
        try {
            gtk_text_set_placeholder_text.invokeExact(handle(), Interop.allocateNativeString(text).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_propagate_text_width = Interop.downcallHandle(
        "gtk_text_set_propagate_text_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GtkText} should grow and shrink with the content.
     */
    public void setPropagateTextWidth(boolean propagateTextWidth) {
        try {
            gtk_text_set_propagate_text_width.invokeExact(handle(), propagateTextWidth ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_tabs = Interop.downcallHandle(
        "gtk_text_set_tabs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets tabstops that are applied to the text.
     */
    public void setTabs(org.pango.TabArray tabs) {
        try {
            gtk_text_set_tabs.invokeExact(handle(), tabs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_truncate_multiline = Interop.downcallHandle(
        "gtk_text_set_truncate_multiline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GtkText} should truncate multi-line text
     * that is pasted into the widget.
     */
    public void setTruncateMultiline(boolean truncateMultiline) {
        try {
            gtk_text_set_truncate_multiline.invokeExact(handle(), truncateMultiline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_set_visibility = Interop.downcallHandle(
        "gtk_text_set_visibility",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the contents of the {@code GtkText} are visible or not.
     * <p>
     * When visibility is set to {@code false}, characters are displayed
     * as the invisible char, and will also appear that way when
     * the text in the widget is copied to the clipboard.
     * <p>
     * By default, GTK picks the best invisible character available
     * in the current font, but it can be changed with
     * {@link Text#setInvisibleChar}.
     * <p>
     * Note that you probably want to set {@code Gtk.Text:input-purpose}
     * to {@link InputPurpose#PASSWORD} or {@link InputPurpose#PIN} to
     * inform input methods about the purpose of this self,
     * in addition to setting visibility to {@code false}.
     */
    public void setVisibility(boolean visible) {
        try {
            gtk_text_set_visibility.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_unset_invisible_char = Interop.downcallHandle(
        "gtk_text_unset_invisible_char",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unsets the invisible char.
     * <p>
     * After calling this, the default invisible
     * char is used again.
     */
    public void unsetInvisibleChar() {
        try {
            gtk_text_unset_invisible_char.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted when the user hits the Enter key.
     * <p>
     * The default bindings for this signal are all forms
     * of the &lt;kbd>Enter</kbd&gt; key.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextActivate",
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
    public interface BackspaceHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Backspace</kbd> and <kbd>Shift</kbd>-<kbd>Backspace</kbd&gt;.
     */
    public SignalHandle onBackspace(BackspaceHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("backspace").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextBackspace",
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
    public interface CopyClipboardHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to copy the selection to the clipboard.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Ctrl</kbd>-<kbd>c</kbd&gt; and
     * &lt;kbd>Ctrl</kbd>-<kbd>Insert</kbd&gt;.
     */
    public SignalHandle onCopyClipboard(CopyClipboardHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("copy-clipboard").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextCopyClipboard",
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
    public interface CutClipboardHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to cut the selection to the clipboard.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Ctrl</kbd>-<kbd>x</kbd&gt; and
     * &lt;kbd>Shift</kbd>-<kbd>Delete</kbd&gt;.
     */
    public SignalHandle onCutClipboard(CutClipboardHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cut-clipboard").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextCutClipboard",
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
    public interface DeleteFromCursorHandler {
        void signalReceived(Text source, DeleteType type, int count);
    }
    
    /**
     * Emitted when the user initiates a text deletion.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * If the {@code type} is {@link DeleteType#CHARS}, GTK deletes the selection
     * if there is one, otherwise it deletes the requested number
     * of characters.
     * <p>
     * The default bindings for this signal are &lt;kbd>Delete</kbd&gt;
     * for deleting a character and &lt;kbd>Ctrl</kbd>-<kbd>Delete</kbd&gt;
     * for deleting a word.
     */
    public SignalHandle onDeleteFromCursor(DeleteFromCursorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("delete-from-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextDeleteFromCursor",
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
    public interface InsertAtCursorHandler {
        void signalReceived(Text source, java.lang.String string);
    }
    
    /**
     * Emitted when the user initiates the insertion of a
     * fixed string at the cursor.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This signal has no default bindings.
     */
    public SignalHandle onInsertAtCursor(InsertAtCursorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-at-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextInsertAtCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertEmojiHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to present the Emoji chooser for the widget.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Ctrl</kbd>-<kbd>.</kbd&gt; and
     * &lt;kbd>Ctrl</kbd>-<kbd>;</kbd&gt;
     */
    public SignalHandle onInsertEmoji(InsertEmojiHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-emoji").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextInsertEmoji",
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
    public interface MoveCursorHandler {
        void signalReceived(Text source, MovementStep step, int count, boolean extend);
    }
    
    /**
     * Emitted when the user initiates a cursor movement.
     * <p>
     * If the cursor is not visible in {@code self}, this signal causes
     * the viewport to be moved instead.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * <p>
     * The default bindings for this signal come in two variants,
     * the variant with the &lt;kbd>Shift</kbd&gt; modifier extends the
     * selection, the variant without it does not.
     * There are too many key combinations to list them all here.
     * <p>
     * <ul>
     * <li>&lt;kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd&gt;
     *   move by individual characters/lines
     * <li>&lt;kbd>Ctrl</kbd>-<kbd>→</kbd&gt;, etc. move by words/paragraphs
     * <li>&lt;kbd>Home</kbd>, <kbd>End</kbd&gt; move to the ends of the buffer
     */
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextMoveCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PasteClipboardHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to paste the contents of the clipboard.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Ctrl</kbd>-<kbd>v</kbd> and <kbd>Shift</kbd>-<kbd>Insert</kbd&gt;.
     */
    public SignalHandle onPasteClipboard(PasteClipboardHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("paste-clipboard").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextPasteClipboard",
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
    public interface PreeditChangedHandler {
        void signalReceived(Text source, java.lang.String preedit);
    }
    
    /**
     * Emitted when the preedit text changes.
     * <p>
     * If an input method is used, the typed text will not immediately
     * be committed to the buffer. So if you are interested in the text,
     * connect to this signal.
     */
    public SignalHandle onPreeditChanged(PreeditChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preedit-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextPreeditChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleOverwriteHandler {
        void signalReceived(Text source);
    }
    
    /**
     * Emitted to toggle the overwrite mode of the {@code GtkText}.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal is &lt;kbd>Insert</kbd&gt;.
     */
    public SignalHandle onToggleOverwrite(ToggleOverwriteHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-overwrite").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Text.Callbacks.class, "signalTextToggleOverwrite",
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
    
    public static class Callbacks {
    
        public static void signalTextActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)));
        }
        
        public static void signalTextBackspace(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.BackspaceHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)));
        }
        
        public static void signalTextCopyClipboard(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.CopyClipboardHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)));
        }
        
        public static void signalTextCutClipboard(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.CutClipboardHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)));
        }
        
        public static void signalTextDeleteFromCursor(MemoryAddress source, int type, int count, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.DeleteFromCursorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)), new DeleteType(type), count);
        }
        
        public static void signalTextInsertAtCursor(MemoryAddress source, MemoryAddress string, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.InsertAtCursorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)), string.getUtf8String(0));
        }
        
        public static void signalTextInsertEmoji(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.InsertEmojiHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)));
        }
        
        public static void signalTextMoveCursor(MemoryAddress source, int step, int count, int extend, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.MoveCursorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)), new MovementStep(step), count, extend != 0);
        }
        
        public static void signalTextPasteClipboard(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.PasteClipboardHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)));
        }
        
        public static void signalTextPreeditChanged(MemoryAddress source, MemoryAddress preedit, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.PreeditChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)), preedit.getUtf8String(0));
        }
        
        public static void signalTextToggleOverwrite(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Text.ToggleOverwriteHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Text(Refcounted.get(source)));
        }
        
    }
}
