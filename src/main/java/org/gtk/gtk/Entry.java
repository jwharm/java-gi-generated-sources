package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkEntry} is a single line text entry widget.
 * <p>
 * <img src="./doc-files/entry.png" alt="An example GtkEntry">
 * <p>
 * A fairly large set of key bindings are supported by default. If the
 * entered text is longer than the allocation of the widget, the widget
 * will scroll so that the cursor position is visible.
 * <p>
 * When using an entry for passwords and other sensitive information, it
 * can be put into “password mode” using {@link Entry#setVisibility}.
 * In this mode, entered text is displayed using a “invisible” character.
 * By default, GTK picks the best invisible character that is available
 * in the current font, but it can be changed with
 * {@link Entry#setInvisibleChar}.
 * <p>
 * {@code GtkEntry} has the ability to display progress or activity
 * information behind the text. To make an entry display such information,
 * use {@link Entry#setProgressFraction} or
 * {@link Entry#setProgressPulseStep}.
 * <p>
 * Additionally, {@code GtkEntry} can show icons at either side of the entry.
 * These icons can be activatable by clicking, can be set up as drag source
 * and can have tooltips. To add an icon, use
 * {@link Entry#setIconFromGicon} or one of the various other functions
 * that set an icon from an icon name or a paintable. To trigger an action when
 * the user clicks an icon, connect to the {@code Gtk.Entry::icon-press} signal.
 * To allow DND operations from an icon, use
 * {@link Entry#setIconDragSource}. To set a tooltip on an icon, use
 * {@link Entry#setIconTooltipText} or the corresponding function
 * for markup.
 * <p>
 * Note that functionality or information that is only available by clicking
 * on an icon in an entry may not be accessible at all to users which are not
 * able to use a mouse or other pointing device. It is therefore recommended
 * that any such functionality should also be available by other means, e.g.
 * via the context menu of the entry.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * entry[.flat][.warning][.error]
 * ├── text[.readonly]
 * ├── image.left
 * ├── image.right
 * ╰── [progress[.pulse]]
 * }</pre>
 * <p>
 * {@code GtkEntry} has a main node with the name entry. Depending on the properties
 * of the entry, the style classes .read-only and .flat may appear. The style
 * classes .warning and .error may also be used with entries.
 * <p>
 * When the entry shows icons, it adds subnodes with the name image and the
 * style class .left or .right, depending on where the icon appears.
 * <p>
 * When the entry shows progress, it adds a subnode with the name progress.
 * The node has the style class .pulse when the shown progress is pulsing.
 * <p>
 * For all the subnodes added to the text node in various situations,
 * see {@link Text}.
 * <p>
 * <h1>GtkEntry as GtkBuildable</h1>
 * <p>
 * The {@code GtkEntry} implementation of the {@code GtkBuildable} interface supports a
 * custom &lt;attributes> element, which supports any number of <attribute&gt;
 * elements. The &lt;attribute&gt; element has attributes named “name“, “value“,
 * “start“ and “end“ and allows you to specify {@code PangoAttribute} values for
 * this label.
 * <p>
 * An example of a UI definition fragment specifying Pango attributes:
 * <pre>{@code xml
 * <object class="GtkEntry">
 *   <attributes>
 *     <attribute name="weight" value="PANGO_WEIGHT_BOLD"/>
 *     <attribute name="background" value="red" start="5" end="10"/>
 *   </attributes>
 * </object>
 * }</pre>
 * <p>
 * The start and end attributes specify the range of characters to which the
 * Pango attribute applies. If start and end are not specified, the attribute
 * is applied to the whole text. Note that specifying ranges does not make much
 * sense with translatable attributes. Use markup embedded in the translatable
 * content instead.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkEntry} uses the {@link AccessibleRole#TEXT_BOX} role.
 */
public class Entry extends Widget implements Accessible, Buildable, CellEditable, ConstraintTarget, Editable {

    public Entry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Entry */
    public static Entry castFrom(org.gtk.gobject.Object gobject) {
        return new Entry(gobject.refcounted());
    }
    
    static final MethodHandle gtk_entry_new = Interop.downcallHandle(
        "gtk_entry_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_entry_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new entry.
     */
    public Entry() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_entry_new_with_buffer = Interop.downcallHandle(
        "gtk_entry_new_with_buffer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithBuffer(EntryBuffer buffer) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_entry_new_with_buffer.invokeExact(buffer.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new entry with the specified text buffer.
     */
    public static Entry newWithBuffer(EntryBuffer buffer) {
        return new Entry(constructNewWithBuffer(buffer));
    }
    
    static final MethodHandle gtk_entry_get_activates_default = Interop.downcallHandle(
        "gtk_entry_get_activates_default",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the value set by gtk_entry_set_activates_default().
     */
    public boolean getActivatesDefault() {
        try {
            var RESULT = (int) gtk_entry_get_activates_default.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_alignment = Interop.downcallHandle(
        "gtk_entry_get_alignment",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value set by gtk_entry_set_alignment().
     * <p>
     * See also: {@code Gtk.Editable:xalign}
     */
    public float getAlignment() {
        try {
            var RESULT = (float) gtk_entry_get_alignment.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_attributes = Interop.downcallHandle(
        "gtk_entry_get_attributes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the attribute list of the {@code GtkEntry}.
     * <p>
     * See {@link Entry#setAttributes}.
     */
    public org.pango.AttrList getAttributes() {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_attributes.invokeExact(handle());
            return new org.pango.AttrList(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_buffer = Interop.downcallHandle(
        "gtk_entry_get_buffer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     */
    public EntryBuffer getBuffer() {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_buffer.invokeExact(handle());
            return new EntryBuffer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_completion = Interop.downcallHandle(
        "gtk_entry_get_completion",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the auxiliary completion object currently
     * in use by {@code entry}.
     */
    public EntryCompletion getCompletion() {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_completion.invokeExact(handle());
            return new EntryCompletion(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_current_icon_drag_source = Interop.downcallHandle(
        "gtk_entry_get_current_icon_drag_source",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the index of the icon which is the source of the
     * current  DND operation, or -1.
     */
    public int getCurrentIconDragSource() {
        try {
            var RESULT = (int) gtk_entry_get_current_icon_drag_source.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_extra_menu = Interop.downcallHandle(
        "gtk_entry_get_extra_menu",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the menu model set with gtk_entry_set_extra_menu().
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_extra_menu.invokeExact(handle());
            return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_has_frame = Interop.downcallHandle(
        "gtk_entry_get_has_frame",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value set by gtk_entry_set_has_frame().
     */
    public boolean getHasFrame() {
        try {
            var RESULT = (int) gtk_entry_get_has_frame.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_activatable = Interop.downcallHandle(
        "gtk_entry_get_icon_activatable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns whether the icon is activatable.
     */
    public boolean getIconActivatable(EntryIconPosition iconPos) {
        try {
            var RESULT = (int) gtk_entry_get_icon_activatable.invokeExact(handle(), iconPos.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_area = Interop.downcallHandle(
        "gtk_entry_get_icon_area",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the area where entry’s icon at {@code icon_pos} is drawn.
     * <p>
     * This function is useful when drawing something to the
     * entry in a draw callback.
     * <p>
     * If the entry is not realized or has no icon at the given
     * position, {@code icon_area} is filled with zeros. Otherwise,
     * {@code icon_area} will be filled with the icon's allocation,
     * relative to {@code entry}'s allocation.
     */
    public void getIconArea(EntryIconPosition iconPos, org.gtk.gdk.Rectangle iconArea) {
        try {
            gtk_entry_get_icon_area.invokeExact(handle(), iconPos.getValue(), iconArea.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_at_pos = Interop.downcallHandle(
        "gtk_entry_get_icon_at_pos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Finds the icon at the given position and return its index.
     * <p>
     * The position’s coordinates are relative to the {@code entry}’s
     * top left corner. If @x, @y doesn’t lie inside an icon,
     * -1 is returned. This function is intended for use in a
     *  {@code Gtk.Widget::query-tooltip} signal handler.
     */
    public int getIconAtPos(int x, int y) {
        try {
            var RESULT = (int) gtk_entry_get_icon_at_pos.invokeExact(handle(), x, y);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_gicon = Interop.downcallHandle(
        "gtk_entry_get_icon_gicon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the {@code GIcon} used for the icon.
     * <p>
     * {@code null} will be returned if there is no icon or if the icon was
     * set by some other method (e.g., by {@code GdkPaintable} or icon name).
     */
    public org.gtk.gio.Icon getIconGicon(EntryIconPosition iconPos) {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_icon_gicon.invokeExact(handle(), iconPos.getValue());
            return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_name = Interop.downcallHandle(
        "gtk_entry_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the icon name used for the icon.
     * <p>
     * {@code null} is returned if there is no icon or if the icon was set
     * by some other method (e.g., by {@code GdkPaintable} or gicon).
     */
    public java.lang.String getIconName(EntryIconPosition iconPos) {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_icon_name.invokeExact(handle(), iconPos.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_paintable = Interop.downcallHandle(
        "gtk_entry_get_icon_paintable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the {@code GdkPaintable} used for the icon.
     * <p>
     * If no {@code GdkPaintable} was used for the icon, {@code null} is returned.
     */
    public org.gtk.gdk.Paintable getIconPaintable(EntryIconPosition iconPos) {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_icon_paintable.invokeExact(handle(), iconPos.getValue());
            return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_sensitive = Interop.downcallHandle(
        "gtk_entry_get_icon_sensitive",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns whether the icon appears sensitive or insensitive.
     */
    public boolean getIconSensitive(EntryIconPosition iconPos) {
        try {
            var RESULT = (int) gtk_entry_get_icon_sensitive.invokeExact(handle(), iconPos.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_storage_type = Interop.downcallHandle(
        "gtk_entry_get_icon_storage_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the type of representation being used by the icon
     * to store image data.
     * <p>
     * If the icon has no image data, the return value will
     * be {@link ImageType#EMPTY}.
     */
    public ImageType getIconStorageType(EntryIconPosition iconPos) {
        try {
            var RESULT = (int) gtk_entry_get_icon_storage_type.invokeExact(handle(), iconPos.getValue());
            return new ImageType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_tooltip_markup = Interop.downcallHandle(
        "gtk_entry_get_icon_tooltip_markup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in {@code entry}.
     */
    public java.lang.String getIconTooltipMarkup(EntryIconPosition iconPos) {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_icon_tooltip_markup.invokeExact(handle(), iconPos.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_icon_tooltip_text = Interop.downcallHandle(
        "gtk_entry_get_icon_tooltip_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in {@code entry}.
     */
    public java.lang.String getIconTooltipText(EntryIconPosition iconPos) {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_icon_tooltip_text.invokeExact(handle(), iconPos.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_input_hints = Interop.downcallHandle(
        "gtk_entry_get_input_hints",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the input hints of this {@code GtkEntry}.
     */
    public InputHints getInputHints() {
        try {
            var RESULT = (int) gtk_entry_get_input_hints.invokeExact(handle());
            return new InputHints(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_input_purpose = Interop.downcallHandle(
        "gtk_entry_get_input_purpose",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the input purpose of the {@code GtkEntry}.
     */
    public InputPurpose getInputPurpose() {
        try {
            var RESULT = (int) gtk_entry_get_input_purpose.invokeExact(handle());
            return new InputPurpose(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_invisible_char = Interop.downcallHandle(
        "gtk_entry_get_invisible_char",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the character displayed in place of the actual text
     * in “password mode”.
     */
    public int getInvisibleChar() {
        try {
            var RESULT = (int) gtk_entry_get_invisible_char.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_max_length = Interop.downcallHandle(
        "gtk_entry_get_max_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the maximum allowed length of the text in {@code entry}.
     * <p>
     * See {@link Entry#setMaxLength}.
     */
    public int getMaxLength() {
        try {
            var RESULT = (int) gtk_entry_get_max_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_overwrite_mode = Interop.downcallHandle(
        "gtk_entry_get_overwrite_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the {@code GtkEntry} is in overwrite mode.
     */
    public boolean getOverwriteMode() {
        try {
            var RESULT = (int) gtk_entry_get_overwrite_mode.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_placeholder_text = Interop.downcallHandle(
        "gtk_entry_get_placeholder_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the text that will be displayed when {@code entry}
     * is empty and unfocused
     */
    public java.lang.String getPlaceholderText() {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_placeholder_text.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_progress_fraction = Interop.downcallHandle(
        "gtk_entry_get_progress_fraction",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current fraction of the task that’s been completed.
     * <p>
     * See {@link Entry#setProgressFraction}.
     */
    public double getProgressFraction() {
        try {
            var RESULT = (double) gtk_entry_get_progress_fraction.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_progress_pulse_step = Interop.downcallHandle(
        "gtk_entry_get_progress_pulse_step",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the pulse step set with
     * gtk_entry_set_progress_pulse_step().
     */
    public double getProgressPulseStep() {
        try {
            var RESULT = (double) gtk_entry_get_progress_pulse_step.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_tabs = Interop.downcallHandle(
        "gtk_entry_get_tabs",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the tabstops of the `GtkEntry.
     * <p>
     * See {@link Entry#setTabs}.
     */
    public org.pango.TabArray getTabs() {
        try {
            var RESULT = (MemoryAddress) gtk_entry_get_tabs.invokeExact(handle());
            return new org.pango.TabArray(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_text_length = Interop.downcallHandle(
        "gtk_entry_get_text_length",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the current length of the text in {@code entry}.
     * <p>
     * This is equivalent to getting {@code entry}'s {@code GtkEntryBuffer}
     * and calling {@link EntryBuffer#getLength} on it.
     */
    public short getTextLength() {
        try {
            var RESULT = (short) gtk_entry_get_text_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_get_visibility = Interop.downcallHandle(
        "gtk_entry_get_visibility",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the text in {@code entry} is visible.
     * <p>
     * See {@link Entry#setVisibility}.
     */
    public boolean getVisibility() {
        try {
            var RESULT = (int) gtk_entry_get_visibility.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_grab_focus_without_selecting = Interop.downcallHandle(
        "gtk_entry_grab_focus_without_selecting",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Causes {@code entry} to have keyboard focus.
     * <p>
     * It behaves like {@link Widget#grabFocus}, except that it doesn't
     * select the contents of the entry. You only want to call this on some
     * special entries which the user usually doesn't want to replace all text
     * in, such as search-as-you-type entries.
     */
    public boolean grabFocusWithoutSelecting() {
        try {
            var RESULT = (int) gtk_entry_grab_focus_without_selecting.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_progress_pulse = Interop.downcallHandle(
        "gtk_entry_progress_pulse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Indicates that some progress is made, but you don’t
     * know how much.
     * <p>
     * Causes the entry’s progress indicator to enter “activity
     * mode”, where a block bounces back and forth. Each call to
     * gtk_entry_progress_pulse() causes the block to move by a
     * little bit (the amount of movement per pulse is determined
     * by {@link Entry#setProgressPulseStep}).
     */
    public void progressPulse() {
        try {
            gtk_entry_progress_pulse.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_reset_im_context = Interop.downcallHandle(
        "gtk_entry_reset_im_context",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reset the input method context of the entry if needed.
     * <p>
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public void resetImContext() {
        try {
            gtk_entry_reset_im_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_activates_default = Interop.downcallHandle(
        "gtk_entry_set_activates_default",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether pressing Enter in the {@code entry} will activate the default
     * widget for the window containing the entry.
     * <p>
     * This usually means that the dialog containing the entry will be closed,
     * since the default widget is usually one of the dialog buttons.
     */
    public void setActivatesDefault(boolean setting) {
        try {
            gtk_entry_set_activates_default.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_alignment = Interop.downcallHandle(
        "gtk_entry_set_alignment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the alignment for the contents of the entry.
     * <p>
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the entry.
     * <p>
     * See also: {@code Gtk.Editable:xalign}
     */
    public void setAlignment(float xalign) {
        try {
            gtk_entry_set_alignment.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_attributes = Interop.downcallHandle(
        "gtk_entry_set_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@code PangoAttrList}.
     * <p>
     * The attributes in the list are applied to the entry text.
     * <p>
     * Since the attributes will be applies to text that changes
     * as the user types, it makes most sense to use attributes
     * with unlimited extent.
     */
    public void setAttributes(org.pango.AttrList attrs) {
        try {
            gtk_entry_set_attributes.invokeExact(handle(), attrs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_buffer = Interop.downcallHandle(
        "gtk_entry_set_buffer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     */
    public void setBuffer(EntryBuffer buffer) {
        try {
            gtk_entry_set_buffer.invokeExact(handle(), buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_completion = Interop.downcallHandle(
        "gtk_entry_set_completion",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code completion} to be the auxiliary completion object
     * to use with {@code entry}.
     * <p>
     * All further configuration of the completion mechanism is
     * done on {@code completion} using the {@code GtkEntryCompletion} API.
     * Completion is disabled if {@code completion} is set to {@code null}.
     */
    public void setCompletion(EntryCompletion completion) {
        try {
            gtk_entry_set_completion.invokeExact(handle(), completion.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_extra_menu = Interop.downcallHandle(
        "gtk_entry_set_extra_menu",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code entry}.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        try {
            gtk_entry_set_extra_menu.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_has_frame = Interop.downcallHandle(
        "gtk_entry_set_has_frame",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the entry has a beveled frame around it.
     */
    public void setHasFrame(boolean setting) {
        try {
            gtk_entry_set_has_frame.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_icon_activatable = Interop.downcallHandle(
        "gtk_entry_set_icon_activatable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the icon is activatable.
     */
    public void setIconActivatable(EntryIconPosition iconPos, boolean activatable) {
        try {
            gtk_entry_set_icon_activatable.invokeExact(handle(), iconPos.getValue(), activatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_icon_drag_source = Interop.downcallHandle(
        "gtk_entry_set_icon_drag_source",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets up the icon at the given position as drag source.
     * <p>
     * This makes it so that GTK will start a drag
     * operation when the user clicks and drags the icon.
     */
    public void setIconDragSource(EntryIconPosition iconPos, org.gtk.gdk.ContentProvider provider, org.gtk.gdk.DragAction actions) {
        try {
            gtk_entry_set_icon_drag_source.invokeExact(handle(), iconPos.getValue(), provider.handle(), actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_icon_from_gicon = Interop.downcallHandle(
        "gtk_entry_set_icon_from_gicon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     * <p>
     * If the icon isn’t known, a “broken image” icon will be
     * displayed instead.
     * <p>
     * If {@code icon} is {@code null}, no icon will be shown in the
     * specified position.
     */
    public void setIconFromGicon(EntryIconPosition iconPos, org.gtk.gio.Icon icon) {
        try {
            gtk_entry_set_icon_from_gicon.invokeExact(handle(), iconPos.getValue(), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_icon_from_icon_name = Interop.downcallHandle(
        "gtk_entry_set_icon_from_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead.
     * <p>
     * If {@code icon_name} is {@code null}, no icon will be shown in the
     * specified position.
     */
    public void setIconFromIconName(EntryIconPosition iconPos, java.lang.String iconName) {
        try {
            gtk_entry_set_icon_from_icon_name.invokeExact(handle(), iconPos.getValue(), Interop.allocateNativeString(iconName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_icon_from_paintable = Interop.downcallHandle(
        "gtk_entry_set_icon_from_paintable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon shown in the specified position using a {@code GdkPaintable}.
     * <p>
     * If {@code paintable} is {@code null}, no icon will be shown in the specified position.
     */
    public void setIconFromPaintable(EntryIconPosition iconPos, org.gtk.gdk.Paintable paintable) {
        try {
            gtk_entry_set_icon_from_paintable.invokeExact(handle(), iconPos.getValue(), paintable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_icon_sensitive = Interop.downcallHandle(
        "gtk_entry_set_icon_sensitive",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the sensitivity for the specified icon.
     */
    public void setIconSensitive(EntryIconPosition iconPos, boolean sensitive) {
        try {
            gtk_entry_set_icon_sensitive.invokeExact(handle(), iconPos.getValue(), sensitive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_icon_tooltip_markup = Interop.downcallHandle(
        "gtk_entry_set_icon_tooltip_markup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code tooltip} as the contents of the tooltip for the icon at
     * the specified position.
     * <p>
     * {@code tooltip} is assumed to be marked up with Pango Markup.
     * <p>
     * Use {@code null} for {@code tooltip} to remove an existing tooltip.
     * <p>
     * See also {@link Widget#setTooltipMarkup} and
     * {@link Entry#setIconTooltipText}.
     */
    public void setIconTooltipMarkup(EntryIconPosition iconPos, java.lang.String tooltip) {
        try {
            gtk_entry_set_icon_tooltip_markup.invokeExact(handle(), iconPos.getValue(), Interop.allocateNativeString(tooltip).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_icon_tooltip_text = Interop.downcallHandle(
        "gtk_entry_set_icon_tooltip_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code tooltip} as the contents of the tooltip for the icon
     * at the specified position.
     * <p>
     * Use {@code null} for {@code tooltip} to remove an existing tooltip.
     * <p>
     * See also {@link Widget#setTooltipText} and
     * {@link Entry#setIconTooltipMarkup}.
     * <p>
     * If you unset the widget tooltip via
     * {@link Widget#setTooltipText} or
     * {@link Widget#setTooltipMarkup}, this sets
     * {@code Gtk.Widget:has-tooltip} to {@code false}, which suppresses
     * icon tooltips too. You can resolve this by then calling
     * {@link Widget#setHasTooltip} to set
     * {@code Gtk.Widget:has-tooltip} back to {@code true}, or
     * setting at least one non-empty tooltip on any icon
     * achieves the same result.
     */
    public void setIconTooltipText(EntryIconPosition iconPos, java.lang.String tooltip) {
        try {
            gtk_entry_set_icon_tooltip_text.invokeExact(handle(), iconPos.getValue(), Interop.allocateNativeString(tooltip).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_input_hints = Interop.downcallHandle(
        "gtk_entry_set_input_hints",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set additional hints which allow input methods to
     * fine-tune their behavior.
     */
    public void setInputHints(InputHints hints) {
        try {
            gtk_entry_set_input_hints.invokeExact(handle(), hints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_input_purpose = Interop.downcallHandle(
        "gtk_entry_set_input_purpose",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the input purpose which can be used by input methods
     * to adjust their behavior.
     */
    public void setInputPurpose(InputPurpose purpose) {
        try {
            gtk_entry_set_input_purpose.invokeExact(handle(), purpose.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_invisible_char = Interop.downcallHandle(
        "gtk_entry_set_invisible_char",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the character to use in place of the actual text
     * in “password mode”.
     * <p>
     * See {@link Entry#setVisibility} for how to enable
     * “password mode”.
     * <p>
     * By default, GTK picks the best invisible char available in
     * the current font. If you set the invisible char to 0, then
     * the user will get no feedback at all; there will be no text
     * on the screen as they type.
     */
    public void setInvisibleChar(int ch) {
        try {
            gtk_entry_set_invisible_char.invokeExact(handle(), ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_max_length = Interop.downcallHandle(
        "gtk_entry_set_max_length",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum allowed length of the contents of the widget.
     * <p>
     * If the current contents are longer than the given length, then
     * they will be truncated to fit. The length is is in characters.
     * <p>
     * This is equivalent to getting {@code entry}'s {@code GtkEntryBuffer} and
     * calling {@link EntryBuffer#setMaxLength} on it.
     */
    public void setMaxLength(int max) {
        try {
            gtk_entry_set_max_length.invokeExact(handle(), max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_overwrite_mode = Interop.downcallHandle(
        "gtk_entry_set_overwrite_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the text is overwritten when typing in the {@code GtkEntry}.
     */
    public void setOverwriteMode(boolean overwrite) {
        try {
            gtk_entry_set_overwrite_mode.invokeExact(handle(), overwrite ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_placeholder_text = Interop.downcallHandle(
        "gtk_entry_set_placeholder_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets text to be displayed in {@code entry} when it is empty.
     * <p>
     * This can be used to give a visual hint of the expected
     * contents of the {@code GtkEntry}.
     */
    public void setPlaceholderText(java.lang.String text) {
        try {
            gtk_entry_set_placeholder_text.invokeExact(handle(), Interop.allocateNativeString(text).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_progress_fraction = Interop.downcallHandle(
        "gtk_entry_set_progress_fraction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Causes the entry’s progress indicator to “fill in” the given
     * fraction of the bar.
     * <p>
     * The fraction should be between 0.0 and 1.0, inclusive.
     */
    public void setProgressFraction(double fraction) {
        try {
            gtk_entry_set_progress_fraction.invokeExact(handle(), fraction);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_progress_pulse_step = Interop.downcallHandle(
        "gtk_entry_set_progress_pulse_step",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the fraction of total entry width to move the progress
     * bouncing block for each pulse.
     * <p>
     * Use {@link Entry#progressPulse} to pulse
     * the progress.
     */
    public void setProgressPulseStep(double fraction) {
        try {
            gtk_entry_set_progress_pulse_step.invokeExact(handle(), fraction);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_tabs = Interop.downcallHandle(
        "gtk_entry_set_tabs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@code PangoTabArray}.
     * <p>
     * The tabstops in the array are applied to the entry text.
     */
    public void setTabs(org.pango.TabArray tabs) {
        try {
            gtk_entry_set_tabs.invokeExact(handle(), tabs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_set_visibility = Interop.downcallHandle(
        "gtk_entry_set_visibility",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the contents of the entry are visible or not.
     * <p>
     * When visibility is set to {@code false}, characters are displayed
     * as the invisible char, and will also appear that way when
     * the text in the entry widget is copied elsewhere.
     * <p>
     * By default, GTK picks the best invisible character available
     * in the current font, but it can be changed with
     * {@link Entry#setInvisibleChar}.
     * <p>
     * Note that you probably want to set {@code Gtk.Entry:input-purpose}
     * to {@link InputPurpose#PASSWORD} or {@link InputPurpose#PIN} to
     * inform input methods about the purpose of this entry,
     * in addition to setting visibility to {@code false}.
     */
    public void setVisibility(boolean visible) {
        try {
            gtk_entry_set_visibility.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_entry_unset_invisible_char = Interop.downcallHandle(
        "gtk_entry_unset_invisible_char",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unsets the invisible char, so that the default invisible char
     * is used again. See {@link Entry#setInvisibleChar}.
     */
    public void unsetInvisibleChar() {
        try {
            gtk_entry_unset_invisible_char.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Entry source);
    }
    
    /**
     * Emitted when the entry is activated.
     * <p>
     * The keybindings for this signal are all forms of the Enter key.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Entry.Callbacks.class, "signalEntryActivate",
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
    public interface IconPressHandler {
        void signalReceived(Entry source, EntryIconPosition iconPos);
    }
    
    /**
     * Emitted when an activatable icon is clicked.
     */
    public SignalHandle onIconPress(IconPressHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("icon-press").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Entry.Callbacks.class, "signalEntryIconPress",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface IconReleaseHandler {
        void signalReceived(Entry source, EntryIconPosition iconPos);
    }
    
    /**
     * Emitted on the button release from a mouse click
     * over an activatable icon.
     */
    public SignalHandle onIconRelease(IconReleaseHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("icon-release").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Entry.Callbacks.class, "signalEntryIconRelease",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalEntryActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Entry.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Entry(Refcounted.get(source)));
        }
        
        public static void signalEntryIconPress(MemoryAddress source, int iconPos, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Entry.IconPressHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Entry(Refcounted.get(source)), new EntryIconPosition(iconPos));
        }
        
        public static void signalEntryIconRelease(MemoryAddress source, int iconPos, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Entry.IconReleaseHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Entry(Refcounted.get(source)), new EntryIconPosition(iconPos));
        }
        
    }
}
