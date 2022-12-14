package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkText} uses the {@link AccessibleRole#NONE} role, which causes it to be
 * skipped for accessibility. This is because {@code GtkText} is expected to be used
 * as a delegate for a {@code GtkEditable} implementation that will be represented
 * to accessibility.
 */
public class Text extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Editable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkText";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Text proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Text(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Text> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Text(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkText}.
     */
    public Text() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithBuffer(org.gtk.gtk.EntryBuffer buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_new_with_buffer.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkText} with the specified text buffer.
     * @param buffer The buffer to use for the new {@code GtkText}.
     * @return a new {@code GtkText}
     */
    public static Text newWithBuffer(org.gtk.gtk.EntryBuffer buffer) {
        var RESULT = constructNewWithBuffer(buffer);
        var OBJECT = (org.gtk.gtk.Text) Interop.register(RESULT, org.gtk.gtk.Text.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
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
     * @param position the character position
     * @param strong location to store the strong cursor position
     * @param weak location to store the weak cursor position
     */
    public void computeCursorExtents(long position, @Nullable org.gtk.graphene.Rect strong, @Nullable org.gtk.graphene.Rect weak) {
        try {
            DowncallHandles.gtk_text_compute_cursor_extents.invokeExact(
                    handle(),
                    position,
                    (Addressable) (strong == null ? MemoryAddress.NULL : strong.handle()),
                    (Addressable) (weak == null ? MemoryAddress.NULL : weak.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether pressing Enter will activate
     * the default widget for the window containing {@code self}.
     * <p>
     * See {@link Text#setActivatesDefault}.
     * @return {@code true} if the {@code GtkText} will activate the default widget
     */
    public boolean getActivatesDefault() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_activates_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the attribute list that was set on the {@code GtkText}.
     * <p>
     * See {@link Text#setAttributes}.
     * @return the attribute list
     */
    public @Nullable org.pango.AttrList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_get_attributes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.AttrList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     * @return A {@code GtkEntryBuffer} object.
     */
    public org.gtk.gtk.EntryBuffer getBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_get_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.EntryBuffer) Interop.register(RESULT, org.gtk.gtk.EntryBuffer.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns whether Emoji completion is enabled for this
     * {@code GtkText} widget.
     * @return {@code true} if Emoji completion is enabled
     */
    public boolean getEnableEmojiCompletion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_enable_emoji_completion.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the menu model for extra items in the context menu.
     * <p>
     * See {@link Text#setExtraMenu}.
     * @return the menu model
     */
    public @Nullable org.gtk.gio.MenuModel getExtraMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_get_extra_menu.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.MenuModel) Interop.register(RESULT, org.gtk.gio.MenuModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the input hints of the {@code GtkText}.
     */
    public org.gtk.gtk.InputHints getInputHints() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_input_hints.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.InputHints(RESULT);
    }
    
    /**
     * Gets the input purpose of the {@code GtkText}.
     */
    public org.gtk.gtk.InputPurpose getInputPurpose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_input_purpose.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.InputPurpose.of(RESULT);
    }
    
    /**
     * Retrieves the character displayed when visibility is set to false.
     * <p>
     * Note that GTK does not compute this value unless it needs it,
     * so the value returned by this function is not very useful unless
     * it has been explicitly set with {@link Text#setInvisibleChar}.
     * @return the current invisible char, or 0, if {@code text} does not
     *   show invisible text at all.
     */
    public int getInvisibleChar() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_invisible_char.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the maximum allowed length of the text in {@code self}.
     * <p>
     * See {@link Text#setMaxLength}.
     * <p>
     * This is equivalent to getting {@code self}'s {@code GtkEntryBuffer} and
     * calling {@link EntryBuffer#getMaxLength} on it.
     * @return the maximum allowed number of characters
     *   in {@code GtkText}, or 0 if there is no maximum.
     */
    public int getMaxLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_max_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether text is overwritten when typing in the {@code GtkText}.
     * <p>
     * See {@link Text#setOverwriteMode}.
     * @return whether the text is overwritten when typing
     */
    public boolean getOverwriteMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_overwrite_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the text that will be displayed when
     * {@code self} is empty and unfocused
     * <p>
     * If no placeholder text has been set, {@code null} will be returned.
     * @return the placeholder text
     */
    public @Nullable java.lang.String getPlaceholderText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_get_placeholder_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns whether the {@code GtkText} will grow and shrink
     * with the content.
     * @return {@code true} if {@code self} will propagate the text width
     */
    public boolean getPropagateTextWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_propagate_text_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the tabstops that were set on the {@code GtkText}.
     * <p>
     * See {@link Text#setTabs}.
     * @return the tabstops
     */
    public @Nullable org.pango.TabArray getTabs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_get_tabs.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.TabArray.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the current length of the text in {@code self}.
     * <p>
     * This is equivalent to getting {@code self}'s {@code GtkEntryBuffer}
     * and calling {@link EntryBuffer#getLength} on it.
     * @return the current number of characters
     *   in {@code GtkText}, or 0 if there are none.
     */
    public short getTextLength() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gtk_text_get_text_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the {@code GtkText} will truncate multi-line text
     * that is pasted into the widget
     * @return {@code true} if {@code self} will truncate multi-line text
     */
    public boolean getTruncateMultiline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_truncate_multiline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves whether the text in {@code self} is visible.
     * @return {@code true} if the text is currently visible
     */
    public boolean getVisibility() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_get_visibility.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Causes {@code self} to have keyboard focus.
     * <p>
     * It behaves like {@link Widget#grabFocus},
     * except that it doesn't select the contents of {@code self}.
     * You only want to call this on some special entries
     * which the user usually doesn't want to replace all text in,
     * such as search-as-you-type entries.
     * @return {@code true} if focus is now inside {@code self}
     */
    public boolean grabFocusWithoutSelecting() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_grab_focus_without_selecting.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * If {@code activates} is {@code true}, pressing Enter will activate
     * the default widget for the window containing {@code self}.
     * <p>
     * This usually means that the dialog containing the {@code GtkText}
     * will be closed, since the default widget is usually one of
     * the dialog buttons.
     * @param activates {@code true} to activate window’s default widget on Enter keypress
     */
    public void setActivatesDefault(boolean activates) {
        try {
            DowncallHandles.gtk_text_set_activates_default.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(activates, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets attributes that are applied to the text.
     * @param attrs a {@code PangoAttrList}
     */
    public void setAttributes(@Nullable org.pango.AttrList attrs) {
        try {
            DowncallHandles.gtk_text_set_attributes.invokeExact(
                    handle(),
                    (Addressable) (attrs == null ? MemoryAddress.NULL : attrs.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     * @param buffer a {@code GtkEntryBuffer}
     */
    public void setBuffer(org.gtk.gtk.EntryBuffer buffer) {
        try {
            DowncallHandles.gtk_text_set_buffer.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether Emoji completion is enabled.
     * <p>
     * If it is, typing ':', followed by a recognized keyword,
     * will pop up a window with suggested Emojis matching the
     * keyword.
     * @param enableEmojiCompletion {@code true} to enable Emoji completion
     */
    public void setEnableEmojiCompletion(boolean enableEmojiCompletion) {
        try {
            DowncallHandles.gtk_text_set_enable_emoji_completion.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enableEmojiCompletion, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code self}.
     * @param model a {@code GMenuModel}
     */
    public void setExtraMenu(@Nullable org.gtk.gio.MenuModel model) {
        try {
            DowncallHandles.gtk_text_set_extra_menu.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets input hints that allow input methods
     * to fine-tune their behaviour.
     * @param hints the hints
     */
    public void setInputHints(org.gtk.gtk.InputHints hints) {
        try {
            DowncallHandles.gtk_text_set_input_hints.invokeExact(
                    handle(),
                    hints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the input purpose of the {@code GtkText}.
     * <p>
     * This can be used by on-screen keyboards and other
     * input methods to adjust their behaviour.
     * @param purpose the purpose
     */
    public void setInputPurpose(org.gtk.gtk.InputPurpose purpose) {
        try {
            DowncallHandles.gtk_text_set_input_purpose.invokeExact(
                    handle(),
                    purpose.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the character to use when in “password mode”.
     * <p>
     * By default, GTK picks the best invisible char available in the
     * current font. If you set the invisible char to 0, then the user
     * will get no feedback at all; there will be no text on the screen
     * as they type.
     * @param ch a Unicode character
     */
    public void setInvisibleChar(int ch) {
        try {
            DowncallHandles.gtk_text_set_invisible_char.invokeExact(
                    handle(),
                    ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum allowed length of the contents of the widget.
     * <p>
     * If the current contents are longer than the given length, then
     * they will be truncated to fit.
     * <p>
     * This is equivalent to getting {@code self}'s {@code GtkEntryBuffer} and
     * calling {@link EntryBuffer#setMaxLength} on it.
     * @param length the maximum length of the {@code GtkText}, or 0 for no maximum.
     *   (other than the maximum length of entries.) The value passed
     *   in will be clamped to the range 0-65536.
     */
    public void setMaxLength(int length) {
        try {
            DowncallHandles.gtk_text_set_max_length.invokeExact(
                    handle(),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the text is overwritten when typing
     * in the {@code GtkText}.
     * @param overwrite new value
     */
    public void setOverwriteMode(boolean overwrite) {
        try {
            DowncallHandles.gtk_text_set_overwrite_mode.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(overwrite, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets text to be displayed in {@code self} when it is empty.
     * <p>
     * This can be used to give a visual hint of the expected
     * contents of the {@code GtkText}.
     * @param text a string to be displayed when {@code self}
     *   is empty and unfocused
     */
    public void setPlaceholderText(@Nullable java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_text_set_placeholder_text.invokeExact(
                        handle(),
                        (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets whether the {@code GtkText} should grow and shrink with the content.
     * @param propagateTextWidth {@code true} to propagate the text width
     */
    public void setPropagateTextWidth(boolean propagateTextWidth) {
        try {
            DowncallHandles.gtk_text_set_propagate_text_width.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(propagateTextWidth, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets tabstops that are applied to the text.
     * @param tabs a {@code PangoTabArray}
     */
    public void setTabs(@Nullable org.pango.TabArray tabs) {
        try {
            DowncallHandles.gtk_text_set_tabs.invokeExact(
                    handle(),
                    (Addressable) (tabs == null ? MemoryAddress.NULL : tabs.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code GtkText} should truncate multi-line text
     * that is pasted into the widget.
     * @param truncateMultiline {@code true} to truncate multi-line text
     */
    public void setTruncateMultiline(boolean truncateMultiline) {
        try {
            DowncallHandles.gtk_text_set_truncate_multiline.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(truncateMultiline, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param visible {@code true} if the contents of the {@code GtkText} are displayed
     *   as plaintext
     */
    public void setVisibility(boolean visible) {
        try {
            DowncallHandles.gtk_text_set_visibility.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(visible, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unsets the invisible char.
     * <p>
     * After calling this, the default invisible
     * char is used again.
     */
    public void unsetInvisibleChar() {
        try {
            DowncallHandles.gtk_text_unset_invisible_char.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gtk_text_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Activate} callback.
     */
    @FunctionalInterface
    public interface Activate {
    
        /**
         * Emitted when the user hits the Enter key.
         * <p>
         * The default bindings for this signal are all forms
         * of the &lt;kbd&gt;Enter&lt;/kbd&gt; key.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Activate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the user hits the Enter key.
     * <p>
     * The default bindings for this signal are all forms
     * of the &lt;kbd&gt;Enter&lt;/kbd&gt; key.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.Activate> onActivate(Text.Activate handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Backspace} callback.
     */
    @FunctionalInterface
    public interface Backspace {
    
        /**
         * Emitted when the user asks for it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Backspace&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Backspace&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Backspace.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Backspace&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Backspace&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.Backspace> onBackspace(Text.Backspace handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("backspace", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code CopyClipboard} callback.
     */
    @FunctionalInterface
    public interface CopyClipboard {
    
        /**
         * Emitted to copy the selection to the clipboard.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;c&lt;/kbd&gt; and
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyClipboard.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to copy the selection to the clipboard.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;c&lt;/kbd&gt; and
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.CopyClipboard> onCopyClipboard(Text.CopyClipboard handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("copy-clipboard", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code CutClipboard} callback.
     */
    @FunctionalInterface
    public interface CutClipboard {
    
        /**
         * Emitted to cut the selection to the clipboard.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;x&lt;/kbd&gt; and
         * &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CutClipboard.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to cut the selection to the clipboard.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;x&lt;/kbd&gt; and
     * &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.CutClipboard> onCutClipboard(Text.CutClipboard handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cut-clipboard", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteFromCursor} callback.
     */
    @FunctionalInterface
    public interface DeleteFromCursor {
    
        /**
         * Emitted when the user initiates a text deletion.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * If the {@code type} is {@link DeleteType#CHARS}, GTK deletes the selection
         * if there is one, otherwise it deletes the requested number
         * of characters.
         * <p>
         * The default bindings for this signal are &lt;kbd&gt;Delete&lt;/kbd&gt;
         * for deleting a character and &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt;
         * for deleting a word.
         */
        void run(org.gtk.gtk.DeleteType type, int count);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText, int type, int count) {
            run(org.gtk.gtk.DeleteType.of(type), count);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteFromCursor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * The default bindings for this signal are &lt;kbd&gt;Delete&lt;/kbd&gt;
     * for deleting a character and &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt;
     * for deleting a word.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.DeleteFromCursor> onDeleteFromCursor(Text.DeleteFromCursor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("delete-from-cursor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertAtCursor} callback.
     */
    @FunctionalInterface
    public interface InsertAtCursor {
    
        /**
         * Emitted when the user initiates the insertion of a
         * fixed string at the cursor.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This signal has no default bindings.
         */
        void run(java.lang.String string);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText, MemoryAddress string) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(string, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertAtCursor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the user initiates the insertion of a
     * fixed string at the cursor.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This signal has no default bindings.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.InsertAtCursor> onInsertAtCursor(Text.InsertAtCursor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("insert-at-cursor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertEmoji} callback.
     */
    @FunctionalInterface
    public interface InsertEmoji {
    
        /**
         * Emitted to present the Emoji chooser for the widget.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;.&lt;/kbd&gt; and
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;;&lt;/kbd&gt;
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertEmoji.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to present the Emoji chooser for the widget.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;.&lt;/kbd&gt; and
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;;&lt;/kbd&gt;
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.InsertEmoji> onInsertEmoji(Text.InsertEmoji handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("insert-emoji", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveCursor} callback.
     */
    @FunctionalInterface
    public interface MoveCursor {
    
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
         * the variant with the &lt;kbd&gt;Shift&lt;/kbd&gt; modifier extends the
         * selection, the variant without it does not.
         * There are too many key combinations to list them all here.
         * <ul>
         * <li>&lt;kbd&gt;←&lt;/kbd&gt;, &lt;kbd&gt;→&lt;/kbd&gt;, &lt;kbd&gt;↑&lt;/kbd&gt;, &lt;kbd&gt;↓&lt;/kbd&gt;
         *   move by individual characters/lines
         * <li>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;→&lt;/kbd&gt;, etc. move by words/paragraphs
         * <li>&lt;kbd&gt;Home&lt;/kbd&gt;, &lt;kbd&gt;End&lt;/kbd&gt; move to the ends of the buffer
         * </ul>
         */
        void run(org.gtk.gtk.MovementStep step, int count, boolean extend);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText, int step, int count, int extend) {
            run(org.gtk.gtk.MovementStep.of(step), count, Marshal.integerToBoolean.marshal(extend, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveCursor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * the variant with the &lt;kbd&gt;Shift&lt;/kbd&gt; modifier extends the
     * selection, the variant without it does not.
     * There are too many key combinations to list them all here.
     * <ul>
     * <li>&lt;kbd&gt;←&lt;/kbd&gt;, &lt;kbd&gt;→&lt;/kbd&gt;, &lt;kbd&gt;↑&lt;/kbd&gt;, &lt;kbd&gt;↓&lt;/kbd&gt;
     *   move by individual characters/lines
     * <li>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;→&lt;/kbd&gt;, etc. move by words/paragraphs
     * <li>&lt;kbd&gt;Home&lt;/kbd&gt;, &lt;kbd&gt;End&lt;/kbd&gt; move to the ends of the buffer
     * </ul>
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.MoveCursor> onMoveCursor(Text.MoveCursor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-cursor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PasteClipboard} callback.
     */
    @FunctionalInterface
    public interface PasteClipboard {
    
        /**
         * Emitted to paste the contents of the clipboard.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;v&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PasteClipboard.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to paste the contents of the clipboard.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;v&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.PasteClipboard> onPasteClipboard(Text.PasteClipboard handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("paste-clipboard", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
         * Emitted when the preedit text changes.
         * <p>
         * If an input method is used, the typed text will not immediately
         * be committed to the buffer. So if you are interested in the text,
         * connect to this signal.
         */
        void run(java.lang.String preedit);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText, MemoryAddress preedit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(preedit, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
     * Emitted when the preedit text changes.
     * <p>
     * If an input method is used, the typed text will not immediately
     * be committed to the buffer. So if you are interested in the text,
     * connect to this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.PreeditChanged> onPreeditChanged(Text.PreeditChanged handler) {
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
     * Functional interface declaration of the {@code ToggleOverwrite} callback.
     */
    @FunctionalInterface
    public interface ToggleOverwrite {
    
        /**
         * Emitted to toggle the overwrite mode of the {@code GtkText}.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal is &lt;kbd&gt;Insert&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceText) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToggleOverwrite.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to toggle the overwrite mode of the {@code GtkText}.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal is &lt;kbd&gt;Insert&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Text.ToggleOverwrite> onToggleOverwrite(Text.ToggleOverwrite handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("toggle-overwrite", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Text.Builder} object constructs a {@link Text} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Text.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Text} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Text}.
         * @return A new instance of {@code Text} with the properties 
         *         that were set in the Builder object.
         */
        public Text build() {
            return (Text) org.gtk.gobject.GObject.newWithProperties(
                Text.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to activate the default widget when Enter is pressed.
         * @param activatesDefault The value for the {@code activates-default} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActivatesDefault(boolean activatesDefault) {
            names.add("activates-default");
            values.add(org.gtk.gobject.Value.create(activatesDefault));
            return this;
        }
        
        /**
         * A list of Pango attributes to apply to the text of the {@code GtkText}.
         * <p>
         * This is mainly useful to change the size or weight of the text.
         * <p>
         * The {@code PangoAttribute}'s {@code start_index} and {@code end_index} must refer to the
         * {@code GtkEntryBuffer} text, i.e. without the preedit string.
         * @param attributes The value for the {@code attributes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAttributes(org.pango.AttrList attributes) {
            names.add("attributes");
            values.add(org.gtk.gobject.Value.create(attributes));
            return this;
        }
        
        /**
         * The {@code GtkEntryBuffer} object which stores the text.
         * @param buffer The value for the {@code buffer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBuffer(org.gtk.gtk.EntryBuffer buffer) {
            names.add("buffer");
            values.add(org.gtk.gobject.Value.create(buffer));
            return this;
        }
        
        /**
         * Whether to suggest Emoji replacements.
         * @param enableEmojiCompletion The value for the {@code enable-emoji-completion} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnableEmojiCompletion(boolean enableEmojiCompletion) {
            names.add("enable-emoji-completion");
            values.add(org.gtk.gobject.Value.create(enableEmojiCompletion));
            return this;
        }
        
        /**
         * A menu model whose contents will be appended to
         * the context menu.
         * @param extraMenu The value for the {@code extra-menu} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExtraMenu(org.gtk.gio.MenuModel extraMenu) {
            names.add("extra-menu");
            values.add(org.gtk.gobject.Value.create(extraMenu));
            return this;
        }
        
        /**
         * Which IM (input method) module should be used for this self.
         * <p>
         * See {@link IMMulticontext}.
         * <p>
         * Setting this to a non-{@code null} value overrides the system-wide
         * IM module setting. See the {@code Gtk.Settings:gtk-im-module}
         * property.
         * @param imModule The value for the {@code im-module} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setImModule(java.lang.String imModule) {
            names.add("im-module");
            values.add(org.gtk.gobject.Value.create(imModule));
            return this;
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
         * The purpose of this text field.
         * <p>
         * This property can be used by on-screen keyboards and other input
         * methods to adjust their behaviour.
         * <p>
         * Note that setting the purpose to {@link InputPurpose#PASSWORD} or
         * {@link InputPurpose#PIN} is independent from setting
         * {@code Gtk.Text:visibility}.
         * @param inputPurpose The value for the {@code input-purpose} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputPurpose(org.gtk.gtk.InputPurpose inputPurpose) {
            names.add("input-purpose");
            values.add(org.gtk.gobject.Value.create(inputPurpose));
            return this;
        }
        
        /**
         * The character to used when masking contents (in “password mode”).
         * @param invisibleChar The value for the {@code invisible-char} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInvisibleChar(int invisibleChar) {
            names.add("invisible-char");
            values.add(org.gtk.gobject.Value.create(invisibleChar));
            return this;
        }
        
        /**
         * Whether the invisible char has been set for the {@code GtkText}.
         * @param invisibleCharSet The value for the {@code invisible-char-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInvisibleCharSet(boolean invisibleCharSet) {
            names.add("invisible-char-set");
            values.add(org.gtk.gobject.Value.create(invisibleCharSet));
            return this;
        }
        
        /**
         * Maximum number of characters that are allowed.
         * <p>
         * Zero indicates no limit.
         * @param maxLength The value for the {@code max-length} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxLength(int maxLength) {
            names.add("max-length");
            values.add(org.gtk.gobject.Value.create(maxLength));
            return this;
        }
        
        /**
         * If text is overwritten when typing in the {@code GtkText}.
         * @param overwriteMode The value for the {@code overwrite-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOverwriteMode(boolean overwriteMode) {
            names.add("overwrite-mode");
            values.add(org.gtk.gobject.Value.create(overwriteMode));
            return this;
        }
        
        /**
         * The text that will be displayed in the {@code GtkText} when it is empty
         * and unfocused.
         * @param placeholderText The value for the {@code placeholder-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPlaceholderText(java.lang.String placeholderText) {
            names.add("placeholder-text");
            values.add(org.gtk.gobject.Value.create(placeholderText));
            return this;
        }
        
        /**
         * Whether the widget should grow and shrink with the content.
         * @param propagateTextWidth The value for the {@code propagate-text-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPropagateTextWidth(boolean propagateTextWidth) {
            names.add("propagate-text-width");
            values.add(org.gtk.gobject.Value.create(propagateTextWidth));
            return this;
        }
        
        /**
         * Number of pixels scrolled of the screen to the left.
         * @param scrollOffset The value for the {@code scroll-offset} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScrollOffset(int scrollOffset) {
            names.add("scroll-offset");
            values.add(org.gtk.gobject.Value.create(scrollOffset));
            return this;
        }
        
        /**
         * A list of tabstops to apply to the text of the {@code GtkText}.
         * @param tabs The value for the {@code tabs} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTabs(org.pango.TabArray tabs) {
            names.add("tabs");
            values.add(org.gtk.gobject.Value.create(tabs));
            return this;
        }
        
        /**
         * When {@code true}, pasted multi-line text is truncated to the first line.
         * @param truncateMultiline The value for the {@code truncate-multiline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTruncateMultiline(boolean truncateMultiline) {
            names.add("truncate-multiline");
            values.add(org.gtk.gobject.Value.create(truncateMultiline));
            return this;
        }
        
        /**
         * If {@code false}, the text is masked with the “invisible char”.
         * @param visibility The value for the {@code visibility} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisibility(boolean visibility) {
            names.add("visibility");
            values.add(org.gtk.gobject.Value.create(visibility));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_new = Interop.downcallHandle(
                "gtk_text_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_new_with_buffer = Interop.downcallHandle(
                "gtk_text_new_with_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_compute_cursor_extents = Interop.downcallHandle(
                "gtk_text_compute_cursor_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_activates_default = Interop.downcallHandle(
                "gtk_text_get_activates_default",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_attributes = Interop.downcallHandle(
                "gtk_text_get_attributes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_buffer = Interop.downcallHandle(
                "gtk_text_get_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_enable_emoji_completion = Interop.downcallHandle(
                "gtk_text_get_enable_emoji_completion",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_extra_menu = Interop.downcallHandle(
                "gtk_text_get_extra_menu",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_input_hints = Interop.downcallHandle(
                "gtk_text_get_input_hints",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_input_purpose = Interop.downcallHandle(
                "gtk_text_get_input_purpose",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_invisible_char = Interop.downcallHandle(
                "gtk_text_get_invisible_char",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_max_length = Interop.downcallHandle(
                "gtk_text_get_max_length",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_overwrite_mode = Interop.downcallHandle(
                "gtk_text_get_overwrite_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_placeholder_text = Interop.downcallHandle(
                "gtk_text_get_placeholder_text",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_propagate_text_width = Interop.downcallHandle(
                "gtk_text_get_propagate_text_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_tabs = Interop.downcallHandle(
                "gtk_text_get_tabs",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_text_length = Interop.downcallHandle(
                "gtk_text_get_text_length",
                FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_truncate_multiline = Interop.downcallHandle(
                "gtk_text_get_truncate_multiline",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_visibility = Interop.downcallHandle(
                "gtk_text_get_visibility",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_grab_focus_without_selecting = Interop.downcallHandle(
                "gtk_text_grab_focus_without_selecting",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_set_activates_default = Interop.downcallHandle(
                "gtk_text_set_activates_default",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_set_attributes = Interop.downcallHandle(
                "gtk_text_set_attributes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_set_buffer = Interop.downcallHandle(
                "gtk_text_set_buffer",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_set_enable_emoji_completion = Interop.downcallHandle(
                "gtk_text_set_enable_emoji_completion",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_set_extra_menu = Interop.downcallHandle(
                "gtk_text_set_extra_menu",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_set_input_hints = Interop.downcallHandle(
                "gtk_text_set_input_hints",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_set_input_purpose = Interop.downcallHandle(
                "gtk_text_set_input_purpose",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_set_invisible_char = Interop.downcallHandle(
                "gtk_text_set_invisible_char",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_set_max_length = Interop.downcallHandle(
                "gtk_text_set_max_length",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_set_overwrite_mode = Interop.downcallHandle(
                "gtk_text_set_overwrite_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_set_placeholder_text = Interop.downcallHandle(
                "gtk_text_set_placeholder_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_set_propagate_text_width = Interop.downcallHandle(
                "gtk_text_set_propagate_text_width",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_set_tabs = Interop.downcallHandle(
                "gtk_text_set_tabs",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_set_truncate_multiline = Interop.downcallHandle(
                "gtk_text_set_truncate_multiline",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_set_visibility = Interop.downcallHandle(
                "gtk_text_set_visibility",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_unset_invisible_char = Interop.downcallHandle(
                "gtk_text_unset_invisible_char",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_get_type = Interop.downcallHandle(
                "gtk_text_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_text_get_type != null;
    }
}
