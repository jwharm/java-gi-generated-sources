package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
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
 * <strong>GtkEntry as GtkBuildable</strong><br/>
 * The {@code GtkEntry} implementation of the {@code GtkBuildable} interface supports a
 * custom &lt;attributes&gt; element, which supports any number of &lt;attribute&gt;
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkEntry} uses the {@link AccessibleRole#TEXT_BOX} role.
 */
public class Entry extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.CellEditable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Editable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEntry";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
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
     * Create a Entry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Entry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Entry if its GType is a (or inherits from) "GtkEntry".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Entry} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEntry", a ClassCastException will be thrown.
     */
    public static Entry castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Entry.getType())) {
            return new Entry(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEntry");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new entry.
     */
    public Entry() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewWithBuffer(@NotNull org.gtk.gtk.EntryBuffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_new_with_buffer.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new entry with the specified text buffer.
     * @param buffer The buffer to use for the new {@code GtkEntry}.
     * @return a new {@code GtkEntry}
     */
    public static Entry newWithBuffer(@NotNull org.gtk.gtk.EntryBuffer buffer) {
        return new Entry(constructNewWithBuffer(buffer), Ownership.NONE);
    }
    
    /**
     * Retrieves the value set by gtk_entry_set_activates_default().
     * @return {@code true} if the entry will activate the default widget
     */
    public boolean getActivatesDefault() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_activates_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value set by gtk_entry_set_alignment().
     * <p>
     * See also: {@code Gtk.Editable:xalign}
     * @return the alignment
     */
    public float getAlignment() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_entry_get_alignment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the attribute list of the {@code GtkEntry}.
     * <p>
     * See {@link Entry#setAttributes}.
     * @return the attribute list
     */
    public @Nullable org.pango.AttrList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_attributes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrList(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     * @return A {@code GtkEntryBuffer} object.
     */
    public @NotNull org.gtk.gtk.EntryBuffer getBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.EntryBuffer(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the auxiliary completion object currently
     * in use by {@code entry}.
     * @return The auxiliary
     *   completion object currently in use by {@code entry}
     */
    public @Nullable org.gtk.gtk.EntryCompletion getCompletion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_completion.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.EntryCompletion(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the index of the icon which is the source of the
     * current  DND operation, or -1.
     * @return index of the icon which is the source of the
     *   current DND operation, or -1.
     */
    public int getCurrentIconDragSource() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_current_icon_drag_source.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the menu model set with gtk_entry_set_extra_menu().
     * @return the menu model
     */
    public @Nullable org.gtk.gio.MenuModel getExtraMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_extra_menu.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the value set by gtk_entry_set_has_frame().
     * @return whether the entry has a beveled frame
     */
    public boolean getHasFrame() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_has_frame.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the icon is activatable.
     * @param iconPos Icon position
     * @return {@code true} if the icon is activatable.
     */
    public boolean getIconActivatable(@NotNull org.gtk.gtk.EntryIconPosition iconPos) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_icon_activatable.invokeExact(
                    handle(),
                    iconPos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param iconPos Icon position
     * @param iconArea Return location for the icon’s area
     */
    public void getIconArea(@NotNull org.gtk.gtk.EntryIconPosition iconPos, @NotNull org.gtk.gdk.Rectangle iconArea) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        java.util.Objects.requireNonNull(iconArea, "Parameter 'iconArea' must not be null");
        try {
            DowncallHandles.gtk_entry_get_icon_area.invokeExact(
                    handle(),
                    iconPos.getValue(),
                    iconArea.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finds the icon at the given position and return its index.
     * <p>
     * The position’s coordinates are relative to the {@code entry}’s
     * top left corner. If {@code x}, {@code y} doesn’t lie inside an icon,
     * -1 is returned. This function is intended for use in a
     *  {@code Gtk.Widget::query-tooltip} signal handler.
     * @param x the x coordinate of the position to find, relative to {@code entry}
     * @param y the y coordinate of the position to find, relative to {@code entry}
     * @return the index of the icon at the given position, or -1
     */
    public int getIconAtPos(int x, int y) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_icon_at_pos.invokeExact(
                    handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the {@code GIcon} used for the icon.
     * <p>
     * {@code null} will be returned if there is no icon or if the icon was
     * set by some other method (e.g., by {@code GdkPaintable} or icon name).
     * @param iconPos Icon position
     * @return A {@code GIcon}
     */
    public @Nullable org.gtk.gio.Icon getIconGicon(@NotNull org.gtk.gtk.EntryIconPosition iconPos) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_icon_gicon.invokeExact(
                    handle(),
                    iconPos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the icon name used for the icon.
     * <p>
     * {@code null} is returned if there is no icon or if the icon was set
     * by some other method (e.g., by {@code GdkPaintable} or gicon).
     * @param iconPos Icon position
     * @return An icon name
     */
    public @Nullable java.lang.String getIconName(@NotNull org.gtk.gtk.EntryIconPosition iconPos) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_icon_name.invokeExact(
                    handle(),
                    iconPos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the {@code GdkPaintable} used for the icon.
     * <p>
     * If no {@code GdkPaintable} was used for the icon, {@code null} is returned.
     * @param iconPos Icon position
     * @return A {@code GdkPaintable}
     *   if no icon is set for this position or the icon set is not
     *   a {@code GdkPaintable}.
     */
    public @Nullable org.gtk.gdk.Paintable getIconPaintable(@NotNull org.gtk.gtk.EntryIconPosition iconPos) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_icon_paintable.invokeExact(
                    handle(),
                    iconPos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the icon appears sensitive or insensitive.
     * @param iconPos Icon position
     * @return {@code true} if the icon is sensitive.
     */
    public boolean getIconSensitive(@NotNull org.gtk.gtk.EntryIconPosition iconPos) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_icon_sensitive.invokeExact(
                    handle(),
                    iconPos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the type of representation being used by the icon
     * to store image data.
     * <p>
     * If the icon has no image data, the return value will
     * be {@link ImageType#EMPTY}.
     * @param iconPos Icon position
     * @return image representation being used
     */
    public @NotNull org.gtk.gtk.ImageType getIconStorageType(@NotNull org.gtk.gtk.EntryIconPosition iconPos) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_icon_storage_type.invokeExact(
                    handle(),
                    iconPos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ImageType(RESULT);
    }
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in {@code entry}.
     * @param iconPos the icon position
     * @return the tooltip text
     */
    public @Nullable java.lang.String getIconTooltipMarkup(@NotNull org.gtk.gtk.EntryIconPosition iconPos) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_icon_tooltip_markup.invokeExact(
                    handle(),
                    iconPos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in {@code entry}.
     * @param iconPos the icon position
     * @return the tooltip text
     */
    public @Nullable java.lang.String getIconTooltipText(@NotNull org.gtk.gtk.EntryIconPosition iconPos) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_icon_tooltip_text.invokeExact(
                    handle(),
                    iconPos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the input hints of this {@code GtkEntry}.
     * @return the input hints
     */
    public @NotNull org.gtk.gtk.InputHints getInputHints() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_input_hints.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.InputHints(RESULT);
    }
    
    /**
     * Gets the input purpose of the {@code GtkEntry}.
     * @return the input purpose
     */
    public @NotNull org.gtk.gtk.InputPurpose getInputPurpose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_input_purpose.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.InputPurpose(RESULT);
    }
    
    /**
     * Retrieves the character displayed in place of the actual text
     * in “password mode”.
     * @return the current invisible char, or 0, if the entry does not
     *   show invisible text at all.
     */
    public int getInvisibleChar() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_invisible_char.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the maximum allowed length of the text in {@code entry}.
     * <p>
     * See {@link Entry#setMaxLength}.
     * @return the maximum allowed number of characters
     *   in {@code GtkEntry}, or 0 if there is no maximum.
     */
    public int getMaxLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_max_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether the {@code GtkEntry} is in overwrite mode.
     * @return whether the text is overwritten when typing.
     */
    public boolean getOverwriteMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_overwrite_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the text that will be displayed when {@code entry}
     * is empty and unfocused
     * @return a pointer to the
     *   placeholder text as a string. This string points to
     *   internally allocated storage in the widget and must
     *   not be freed, modified or stored. If no placeholder
     *   text has been set, {@code null} will be returned.
     */
    public @Nullable java.lang.String getPlaceholderText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_placeholder_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the current fraction of the task that’s been completed.
     * <p>
     * See {@link Entry#setProgressFraction}.
     * @return a fraction from 0.0 to 1.0
     */
    public double getProgressFraction() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_entry_get_progress_fraction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the pulse step set with
     * gtk_entry_set_progress_pulse_step().
     * @return a fraction from 0.0 to 1.0
     */
    public double getProgressPulseStep() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_entry_get_progress_pulse_step.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the tabstops of the `GtkEntry.
     * <p>
     * See {@link Entry#setTabs}.
     * @return the tabstops
     */
    public @Nullable org.pango.TabArray getTabs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_get_tabs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.TabArray(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the current length of the text in {@code entry}.
     * <p>
     * This is equivalent to getting {@code entry}'s {@code GtkEntryBuffer}
     * and calling {@link EntryBuffer#getLength} on it.
     * @return the current number of characters
     *   in {@code GtkEntry}, or 0 if there are none.
     */
    public short getTextLength() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gtk_entry_get_text_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves whether the text in {@code entry} is visible.
     * <p>
     * See {@link Entry#setVisibility}.
     * @return {@code true} if the text is currently visible
     */
    public boolean getVisibility() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_get_visibility.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Causes {@code entry} to have keyboard focus.
     * <p>
     * It behaves like {@link Widget#grabFocus}, except that it doesn't
     * select the contents of the entry. You only want to call this on some
     * special entries which the user usually doesn't want to replace all text
     * in, such as search-as-you-type entries.
     * @return {@code true} if focus is now inside {@code self}
     */
    public boolean grabFocusWithoutSelecting() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_grab_focus_without_selecting.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
            DowncallHandles.gtk_entry_progress_pulse.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reset the input method context of the entry if needed.
     * <p>
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public void resetImContext() {
        try {
            DowncallHandles.gtk_entry_reset_im_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether pressing Enter in the {@code entry} will activate the default
     * widget for the window containing the entry.
     * <p>
     * This usually means that the dialog containing the entry will be closed,
     * since the default widget is usually one of the dialog buttons.
     * @param setting {@code true} to activate window’s default widget on Enter keypress
     */
    public void setActivatesDefault(boolean setting) {
        try {
            DowncallHandles.gtk_entry_set_activates_default.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the alignment for the contents of the entry.
     * <p>
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the entry.
     * <p>
     * See also: {@code Gtk.Editable:xalign}
     * @param xalign The horizontal alignment, from 0 (left) to 1 (right).
     *   Reversed for RTL layouts
     */
    public void setAlignment(float xalign) {
        try {
            DowncallHandles.gtk_entry_set_alignment.invokeExact(
                    handle(),
                    xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code PangoAttrList}.
     * <p>
     * The attributes in the list are applied to the entry text.
     * <p>
     * Since the attributes will be applies to text that changes
     * as the user types, it makes most sense to use attributes
     * with unlimited extent.
     * @param attrs a {@code PangoAttrList}
     */
    public void setAttributes(@NotNull org.pango.AttrList attrs) {
        java.util.Objects.requireNonNull(attrs, "Parameter 'attrs' must not be null");
        try {
            DowncallHandles.gtk_entry_set_attributes.invokeExact(
                    handle(),
                    attrs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     * @param buffer a {@code GtkEntryBuffer}
     */
    public void setBuffer(@NotNull org.gtk.gtk.EntryBuffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        try {
            DowncallHandles.gtk_entry_set_buffer.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code completion} to be the auxiliary completion object
     * to use with {@code entry}.
     * <p>
     * All further configuration of the completion mechanism is
     * done on {@code completion} using the {@code GtkEntryCompletion} API.
     * Completion is disabled if {@code completion} is set to {@code null}.
     * @param completion The {@code GtkEntryCompletion}
     */
    public void setCompletion(@Nullable org.gtk.gtk.EntryCompletion completion) {
        try {
            DowncallHandles.gtk_entry_set_completion.invokeExact(
                    handle(),
                    (Addressable) (completion == null ? MemoryAddress.NULL : completion.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code entry}.
     * @param model a {@code GMenuModel}
     */
    public void setExtraMenu(@Nullable org.gtk.gio.MenuModel model) {
        try {
            DowncallHandles.gtk_entry_set_extra_menu.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the entry has a beveled frame around it.
     * @param setting new value
     */
    public void setHasFrame(boolean setting) {
        try {
            DowncallHandles.gtk_entry_set_has_frame.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the icon is activatable.
     * @param iconPos Icon position
     * @param activatable {@code true} if the icon should be activatable
     */
    public void setIconActivatable(@NotNull org.gtk.gtk.EntryIconPosition iconPos, boolean activatable) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        try {
            DowncallHandles.gtk_entry_set_icon_activatable.invokeExact(
                    handle(),
                    iconPos.getValue(),
                    activatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets up the icon at the given position as drag source.
     * <p>
     * This makes it so that GTK will start a drag
     * operation when the user clicks and drags the icon.
     * @param iconPos icon position
     * @param provider a {@code GdkContentProvider}
     * @param actions a bitmask of the allowed drag actions
     */
    public void setIconDragSource(@NotNull org.gtk.gtk.EntryIconPosition iconPos, @NotNull org.gtk.gdk.ContentProvider provider, @NotNull org.gtk.gdk.DragAction actions) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        java.util.Objects.requireNonNull(provider, "Parameter 'provider' must not be null");
        java.util.Objects.requireNonNull(actions, "Parameter 'actions' must not be null");
        try {
            DowncallHandles.gtk_entry_set_icon_drag_source.invokeExact(
                    handle(),
                    iconPos.getValue(),
                    provider.handle(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     * <p>
     * If the icon isn’t known, a “broken image” icon will be
     * displayed instead.
     * <p>
     * If {@code icon} is {@code null}, no icon will be shown in the
     * specified position.
     * @param iconPos The position at which to set the icon
     * @param icon The icon to set
     */
    public void setIconFromGicon(@NotNull org.gtk.gtk.EntryIconPosition iconPos, @Nullable org.gtk.gio.Icon icon) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        try {
            DowncallHandles.gtk_entry_set_icon_from_gicon.invokeExact(
                    handle(),
                    iconPos.getValue(),
                    (Addressable) (icon == null ? MemoryAddress.NULL : icon.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead.
     * <p>
     * If {@code icon_name} is {@code null}, no icon will be shown in the
     * specified position.
     * @param iconPos The position at which to set the icon
     * @param iconName An icon name
     */
    public void setIconFromIconName(@NotNull org.gtk.gtk.EntryIconPosition iconPos, @Nullable java.lang.String iconName) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        try {
            DowncallHandles.gtk_entry_set_icon_from_icon_name.invokeExact(
                    handle(),
                    iconPos.getValue(),
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Interop.allocateNativeString(iconName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon shown in the specified position using a {@code GdkPaintable}.
     * <p>
     * If {@code paintable} is {@code null}, no icon will be shown in the specified position.
     * @param iconPos Icon position
     * @param paintable A {@code GdkPaintable}
     */
    public void setIconFromPaintable(@NotNull org.gtk.gtk.EntryIconPosition iconPos, @Nullable org.gtk.gdk.Paintable paintable) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        try {
            DowncallHandles.gtk_entry_set_icon_from_paintable.invokeExact(
                    handle(),
                    iconPos.getValue(),
                    (Addressable) (paintable == null ? MemoryAddress.NULL : paintable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the sensitivity for the specified icon.
     * @param iconPos Icon position
     * @param sensitive Specifies whether the icon should appear
     *   sensitive or insensitive
     */
    public void setIconSensitive(@NotNull org.gtk.gtk.EntryIconPosition iconPos, boolean sensitive) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        try {
            DowncallHandles.gtk_entry_set_icon_sensitive.invokeExact(
                    handle(),
                    iconPos.getValue(),
                    sensitive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param iconPos the icon position
     * @param tooltip the contents of the tooltip for the icon
     */
    public void setIconTooltipMarkup(@NotNull org.gtk.gtk.EntryIconPosition iconPos, @Nullable java.lang.String tooltip) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        try {
            DowncallHandles.gtk_entry_set_icon_tooltip_markup.invokeExact(
                    handle(),
                    iconPos.getValue(),
                    (Addressable) (tooltip == null ? MemoryAddress.NULL : Interop.allocateNativeString(tooltip)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param iconPos the icon position
     * @param tooltip the contents of the tooltip for the icon
     */
    public void setIconTooltipText(@NotNull org.gtk.gtk.EntryIconPosition iconPos, @Nullable java.lang.String tooltip) {
        java.util.Objects.requireNonNull(iconPos, "Parameter 'iconPos' must not be null");
        try {
            DowncallHandles.gtk_entry_set_icon_tooltip_text.invokeExact(
                    handle(),
                    iconPos.getValue(),
                    (Addressable) (tooltip == null ? MemoryAddress.NULL : Interop.allocateNativeString(tooltip)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set additional hints which allow input methods to
     * fine-tune their behavior.
     * @param hints the hints
     */
    public void setInputHints(@NotNull org.gtk.gtk.InputHints hints) {
        java.util.Objects.requireNonNull(hints, "Parameter 'hints' must not be null");
        try {
            DowncallHandles.gtk_entry_set_input_hints.invokeExact(
                    handle(),
                    hints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the input purpose which can be used by input methods
     * to adjust their behavior.
     * @param purpose the purpose
     */
    public void setInputPurpose(@NotNull org.gtk.gtk.InputPurpose purpose) {
        java.util.Objects.requireNonNull(purpose, "Parameter 'purpose' must not be null");
        try {
            DowncallHandles.gtk_entry_set_input_purpose.invokeExact(
                    handle(),
                    purpose.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param ch a Unicode character
     */
    public void setInvisibleChar(int ch) {
        try {
            DowncallHandles.gtk_entry_set_invisible_char.invokeExact(
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
     * they will be truncated to fit. The length is is in characters.
     * <p>
     * This is equivalent to getting {@code entry}'s {@code GtkEntryBuffer} and
     * calling {@link EntryBuffer#setMaxLength} on it.
     * @param max the maximum length of the entry, or 0 for no maximum.
     *   (other than the maximum length of entries.) The value passed in will
     *   be clamped to the range 0-65536.
     */
    public void setMaxLength(int max) {
        try {
            DowncallHandles.gtk_entry_set_max_length.invokeExact(
                    handle(),
                    max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the text is overwritten when typing in the {@code GtkEntry}.
     * @param overwrite new value
     */
    public void setOverwriteMode(boolean overwrite) {
        try {
            DowncallHandles.gtk_entry_set_overwrite_mode.invokeExact(
                    handle(),
                    overwrite ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets text to be displayed in {@code entry} when it is empty.
     * <p>
     * This can be used to give a visual hint of the expected
     * contents of the {@code GtkEntry}.
     * @param text a string to be displayed when {@code entry} is empty and unfocused
     */
    public void setPlaceholderText(@Nullable java.lang.String text) {
        try {
            DowncallHandles.gtk_entry_set_placeholder_text.invokeExact(
                    handle(),
                    (Addressable) (text == null ? MemoryAddress.NULL : Interop.allocateNativeString(text)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Causes the entry’s progress indicator to “fill in” the given
     * fraction of the bar.
     * <p>
     * The fraction should be between 0.0 and 1.0, inclusive.
     * @param fraction fraction of the task that’s been completed
     */
    public void setProgressFraction(double fraction) {
        try {
            DowncallHandles.gtk_entry_set_progress_fraction.invokeExact(
                    handle(),
                    fraction);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the fraction of total entry width to move the progress
     * bouncing block for each pulse.
     * <p>
     * Use {@link Entry#progressPulse} to pulse
     * the progress.
     * @param fraction fraction between 0.0 and 1.0
     */
    public void setProgressPulseStep(double fraction) {
        try {
            DowncallHandles.gtk_entry_set_progress_pulse_step.invokeExact(
                    handle(),
                    fraction);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code PangoTabArray}.
     * <p>
     * The tabstops in the array are applied to the entry text.
     * @param tabs a {@code PangoTabArray}
     */
    public void setTabs(@Nullable org.pango.TabArray tabs) {
        try {
            DowncallHandles.gtk_entry_set_tabs.invokeExact(
                    handle(),
                    (Addressable) (tabs == null ? MemoryAddress.NULL : tabs.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param visible {@code true} if the contents of the entry are displayed as plaintext
     */
    public void setVisibility(boolean visible) {
        try {
            DowncallHandles.gtk_entry_set_visibility.invokeExact(
                    handle(),
                    visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unsets the invisible char, so that the default invisible char
     * is used again. See {@link Entry#setInvisibleChar}.
     */
    public void unsetInvisibleChar() {
        try {
            DowncallHandles.gtk_entry_unset_invisible_char.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_entry_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(Entry source);
    }
    
    /**
     * Emitted when the entry is activated.
     * <p>
     * The keybindings for this signal are all forms of the Enter key.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Entry.Activate> onActivate(Entry.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Entry.Callbacks.class, "signalEntryActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Entry.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface IconPress {
        void signalReceived(Entry source, @NotNull org.gtk.gtk.EntryIconPosition iconPos);
    }
    
    /**
     * Emitted when an activatable icon is clicked.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Entry.IconPress> onIconPress(Entry.IconPress handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("icon-press"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Entry.Callbacks.class, "signalEntryIconPress",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Entry.IconPress>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface IconRelease {
        void signalReceived(Entry source, @NotNull org.gtk.gtk.EntryIconPosition iconPos);
    }
    
    /**
     * Emitted on the button release from a mouse click
     * over an activatable icon.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Entry.IconRelease> onIconRelease(Entry.IconRelease handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("icon-release"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Entry.Callbacks.class, "signalEntryIconRelease",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Entry.IconRelease>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Entry.Build} object constructs a {@link Entry} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Entry} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Entry} using {@link Entry#castFrom}.
         * @return A new instance of {@code Entry} with the properties 
         *         that were set in the Build object.
         */
        public Entry construct() {
            return Entry.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Entry.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether to activate the default widget when Enter is pressed.
         * @param activatesDefault The value for the {@code activates-default} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setActivatesDefault(boolean activatesDefault) {
            names.add("activates-default");
            values.add(org.gtk.gobject.Value.create(activatesDefault));
            return this;
        }
        
        /**
         * A list of Pango attributes to apply to the text of the entry.
         * <p>
         * This is mainly useful to change the size or weight of the text.
         * <p>
         * The {@code PangoAttribute}'s {@code start_index} and {@code end_index} must refer to the
         * {@link EntryBuffer} text, i.e. without the preedit string.
         * @param attributes The value for the {@code attributes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAttributes(org.pango.AttrList attributes) {
            names.add("attributes");
            values.add(org.gtk.gobject.Value.create(attributes));
            return this;
        }
        
        /**
         * The buffer object which actually stores the text.
         * @param buffer The value for the {@code buffer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBuffer(org.gtk.gtk.EntryBuffer buffer) {
            names.add("buffer");
            values.add(org.gtk.gobject.Value.create(buffer));
            return this;
        }
        
        /**
         * The auxiliary completion object to use with the entry.
         * @param completion The value for the {@code completion} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCompletion(org.gtk.gtk.EntryCompletion completion) {
            names.add("completion");
            values.add(org.gtk.gobject.Value.create(completion));
            return this;
        }
        
        /**
         * Whether to suggest Emoji replacements for :-delimited names
         * like {@code :heart:}.
         * @param enableEmojiCompletion The value for the {@code enable-emoji-completion} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEnableEmojiCompletion(boolean enableEmojiCompletion) {
            names.add("enable-emoji-completion");
            values.add(org.gtk.gobject.Value.create(enableEmojiCompletion));
            return this;
        }
        
        /**
         * A menu model whose contents will be appended to the context menu.
         * @param extraMenu The value for the {@code extra-menu} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setExtraMenu(org.gtk.gio.MenuModel extraMenu) {
            names.add("extra-menu");
            values.add(org.gtk.gobject.Value.create(extraMenu));
            return this;
        }
        
        /**
         * Whehter the entry should draw a frame.
         * @param hasFrame The value for the {@code has-frame} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHasFrame(boolean hasFrame) {
            names.add("has-frame");
            values.add(org.gtk.gobject.Value.create(hasFrame));
            return this;
        }
        
        /**
         * Which IM (input method) module should be used for this entry.
         * <p>
         * See {@link IMContext}.
         * <p>
         * Setting this to a non-{@code null} value overrides the system-wide IM
         * module setting. See the GtkSettings {@code Gtk.Settings:gtk-im-module}
         * property.
         * @param imModule The value for the {@code im-module} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setImModule(java.lang.String imModule) {
            names.add("im-module");
            values.add(org.gtk.gobject.Value.create(imModule));
            return this;
        }
        
        /**
         * Additional hints that allow input methods to fine-tune their behavior.
         * <p>
         * Also see {@code Gtk.Entry:input-purpose}
         * @param inputHints The value for the {@code input-hints} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInputHints(org.gtk.gtk.InputHints inputHints) {
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
         * {@code Gtk.Entry:visibility}.
         * @param inputPurpose The value for the {@code input-purpose} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInputPurpose(org.gtk.gtk.InputPurpose inputPurpose) {
            names.add("input-purpose");
            values.add(org.gtk.gobject.Value.create(inputPurpose));
            return this;
        }
        
        /**
         * The character to use when masking entry contents (“password mode”).
         * @param invisibleChar The value for the {@code invisible-char} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInvisibleChar(int invisibleChar) {
            names.add("invisible-char");
            values.add(org.gtk.gobject.Value.create(invisibleChar));
            return this;
        }
        
        /**
         * Whether the invisible char has been set for the {@code GtkEntry}.
         * @param invisibleCharSet The value for the {@code invisible-char-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInvisibleCharSet(boolean invisibleCharSet) {
            names.add("invisible-char-set");
            values.add(org.gtk.gobject.Value.create(invisibleCharSet));
            return this;
        }
        
        /**
         * Maximum number of characters for this entry.
         * @param maxLength The value for the {@code max-length} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxLength(int maxLength) {
            names.add("max-length");
            values.add(org.gtk.gobject.Value.create(maxLength));
            return this;
        }
        
        /**
         * If text is overwritten when typing in the {@code GtkEntry}.
         * @param overwriteMode The value for the {@code overwrite-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOverwriteMode(boolean overwriteMode) {
            names.add("overwrite-mode");
            values.add(org.gtk.gobject.Value.create(overwriteMode));
            return this;
        }
        
        /**
         * The text that will be displayed in the {@code GtkEntry} when it is empty
         * and unfocused.
         * @param placeholderText The value for the {@code placeholder-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPlaceholderText(java.lang.String placeholderText) {
            names.add("placeholder-text");
            values.add(org.gtk.gobject.Value.create(placeholderText));
            return this;
        }
        
        /**
         * Whether the primary icon is activatable.
         * <p>
         * GTK emits the {@code Gtk.Entry::icon-press} and
         * {@code Gtk.Entry::icon-release} signals only on sensitive,
         * activatable icons.
         * <p>
         * Sensitive, but non-activatable icons can be used for purely
         * informational purposes.
         * @param primaryIconActivatable The value for the {@code primary-icon-activatable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaryIconActivatable(boolean primaryIconActivatable) {
            names.add("primary-icon-activatable");
            values.add(org.gtk.gobject.Value.create(primaryIconActivatable));
            return this;
        }
        
        /**
         * The {@code GIcon} to use for the primary icon for the entry.
         * @param primaryIconGicon The value for the {@code primary-icon-gicon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaryIconGicon(org.gtk.gio.Icon primaryIconGicon) {
            names.add("primary-icon-gicon");
            values.add(org.gtk.gobject.Value.create(primaryIconGicon));
            return this;
        }
        
        /**
         * The icon name to use for the primary icon for the entry.
         * @param primaryIconName The value for the {@code primary-icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaryIconName(java.lang.String primaryIconName) {
            names.add("primary-icon-name");
            values.add(org.gtk.gobject.Value.create(primaryIconName));
            return this;
        }
        
        /**
         * A {@code GdkPaintable} to use as the primary icon for the entry.
         * @param primaryIconPaintable The value for the {@code primary-icon-paintable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaryIconPaintable(org.gtk.gdk.Paintable primaryIconPaintable) {
            names.add("primary-icon-paintable");
            values.add(org.gtk.gobject.Value.create(primaryIconPaintable));
            return this;
        }
        
        /**
         * Whether the primary icon is sensitive.
         * <p>
         * An insensitive icon appears grayed out. GTK does not emit the
         * {@code Gtk.Entry::icon-press} and {@code Gtk.Entry::icon-release}
         * signals and does not allow DND from insensitive icons.
         * <p>
         * An icon should be set insensitive if the action that would trigger
         * when clicked is currently not available.
         * @param primaryIconSensitive The value for the {@code primary-icon-sensitive} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaryIconSensitive(boolean primaryIconSensitive) {
            names.add("primary-icon-sensitive");
            values.add(org.gtk.gobject.Value.create(primaryIconSensitive));
            return this;
        }
        
        /**
         * The representation which is used for the primary icon of the entry.
         * @param primaryIconStorageType The value for the {@code primary-icon-storage-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaryIconStorageType(org.gtk.gtk.ImageType primaryIconStorageType) {
            names.add("primary-icon-storage-type");
            values.add(org.gtk.gobject.Value.create(primaryIconStorageType));
            return this;
        }
        
        /**
         * The contents of the tooltip on the primary icon, with markup.
         * <p>
         * Also see {@link Entry#setIconTooltipMarkup}.
         * @param primaryIconTooltipMarkup The value for the {@code primary-icon-tooltip-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaryIconTooltipMarkup(java.lang.String primaryIconTooltipMarkup) {
            names.add("primary-icon-tooltip-markup");
            values.add(org.gtk.gobject.Value.create(primaryIconTooltipMarkup));
            return this;
        }
        
        /**
         * The contents of the tooltip on the primary icon.
         * <p>
         * Also see {@link Entry#setIconTooltipText}.
         * @param primaryIconTooltipText The value for the {@code primary-icon-tooltip-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaryIconTooltipText(java.lang.String primaryIconTooltipText) {
            names.add("primary-icon-tooltip-text");
            values.add(org.gtk.gobject.Value.create(primaryIconTooltipText));
            return this;
        }
        
        /**
         * The current fraction of the task that's been completed.
         * @param progressFraction The value for the {@code progress-fraction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProgressFraction(double progressFraction) {
            names.add("progress-fraction");
            values.add(org.gtk.gobject.Value.create(progressFraction));
            return this;
        }
        
        /**
         * The fraction of total entry width to move the progress
         * bouncing block for each pulse.
         * <p>
         * See {@link Entry#progressPulse}.
         * @param progressPulseStep The value for the {@code progress-pulse-step} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProgressPulseStep(double progressPulseStep) {
            names.add("progress-pulse-step");
            values.add(org.gtk.gobject.Value.create(progressPulseStep));
            return this;
        }
        
        /**
         * Number of pixels of the entry scrolled off the screen to the left.
         * @param scrollOffset The value for the {@code scroll-offset} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScrollOffset(int scrollOffset) {
            names.add("scroll-offset");
            values.add(org.gtk.gobject.Value.create(scrollOffset));
            return this;
        }
        
        /**
         * Whether the secondary icon is activatable.
         * <p>
         * GTK emits the {@code Gtk.Entry::icon-press} and
         * {@code Gtk.Entry::icon-release} signals only on sensitive,
         * activatable icons.
         * <p>
         * Sensitive, but non-activatable icons can be used for purely
         * informational purposes.
         * @param secondaryIconActivatable The value for the {@code secondary-icon-activatable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSecondaryIconActivatable(boolean secondaryIconActivatable) {
            names.add("secondary-icon-activatable");
            values.add(org.gtk.gobject.Value.create(secondaryIconActivatable));
            return this;
        }
        
        /**
         * The {@code GIcon} to use for the secondary icon for the entry.
         * @param secondaryIconGicon The value for the {@code secondary-icon-gicon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSecondaryIconGicon(org.gtk.gio.Icon secondaryIconGicon) {
            names.add("secondary-icon-gicon");
            values.add(org.gtk.gobject.Value.create(secondaryIconGicon));
            return this;
        }
        
        /**
         * The icon name to use for the secondary icon for the entry.
         * @param secondaryIconName The value for the {@code secondary-icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSecondaryIconName(java.lang.String secondaryIconName) {
            names.add("secondary-icon-name");
            values.add(org.gtk.gobject.Value.create(secondaryIconName));
            return this;
        }
        
        /**
         * A {@code GdkPaintable} to use as the secondary icon for the entry.
         * @param secondaryIconPaintable The value for the {@code secondary-icon-paintable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSecondaryIconPaintable(org.gtk.gdk.Paintable secondaryIconPaintable) {
            names.add("secondary-icon-paintable");
            values.add(org.gtk.gobject.Value.create(secondaryIconPaintable));
            return this;
        }
        
        /**
         * Whether the secondary icon is sensitive.
         * <p>
         * An insensitive icon appears grayed out. GTK does not emit the
         * {@code Gtk.Entry::icon-press[ and [signal@Gtk.Entry::icon-release}
         * signals and does not allow DND from insensitive icons.
         * <p>
         * An icon should be set insensitive if the action that would trigger
         * when clicked is currently not available.
         * @param secondaryIconSensitive The value for the {@code secondary-icon-sensitive} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSecondaryIconSensitive(boolean secondaryIconSensitive) {
            names.add("secondary-icon-sensitive");
            values.add(org.gtk.gobject.Value.create(secondaryIconSensitive));
            return this;
        }
        
        /**
         * The representation which is used for the secondary icon of the entry.
         * @param secondaryIconStorageType The value for the {@code secondary-icon-storage-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSecondaryIconStorageType(org.gtk.gtk.ImageType secondaryIconStorageType) {
            names.add("secondary-icon-storage-type");
            values.add(org.gtk.gobject.Value.create(secondaryIconStorageType));
            return this;
        }
        
        /**
         * The contents of the tooltip on the secondary icon, with markup.
         * <p>
         * Also see {@link Entry#setIconTooltipMarkup}.
         * @param secondaryIconTooltipMarkup The value for the {@code secondary-icon-tooltip-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSecondaryIconTooltipMarkup(java.lang.String secondaryIconTooltipMarkup) {
            names.add("secondary-icon-tooltip-markup");
            values.add(org.gtk.gobject.Value.create(secondaryIconTooltipMarkup));
            return this;
        }
        
        /**
         * The contents of the tooltip on the secondary icon.
         * <p>
         * Also see {@link Entry#setIconTooltipText}.
         * @param secondaryIconTooltipText The value for the {@code secondary-icon-tooltip-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSecondaryIconTooltipText(java.lang.String secondaryIconTooltipText) {
            names.add("secondary-icon-tooltip-text");
            values.add(org.gtk.gobject.Value.create(secondaryIconTooltipText));
            return this;
        }
        
        public Build setShowEmojiIcon(boolean showEmojiIcon) {
            names.add("show-emoji-icon");
            values.add(org.gtk.gobject.Value.create(showEmojiIcon));
            return this;
        }
        
        public Build setTabs(org.pango.TabArray tabs) {
            names.add("tabs");
            values.add(org.gtk.gobject.Value.create(tabs));
            return this;
        }
        
        /**
         * The length of the text in the {@code GtkEntry}.
         * @param textLength The value for the {@code text-length} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTextLength(int textLength) {
            names.add("text-length");
            values.add(org.gtk.gobject.Value.create(textLength));
            return this;
        }
        
        /**
         * When {@code true}, pasted multi-line text is truncated to the first line.
         * @param truncateMultiline The value for the {@code truncate-multiline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTruncateMultiline(boolean truncateMultiline) {
            names.add("truncate-multiline");
            values.add(org.gtk.gobject.Value.create(truncateMultiline));
            return this;
        }
        
        /**
         * Whether the entry should show the “invisible char” instead of the
         * actual text (“password mode”).
         * @param visibility The value for the {@code visibility} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVisibility(boolean visibility) {
            names.add("visibility");
            values.add(org.gtk.gobject.Value.create(visibility));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_entry_new = Interop.downcallHandle(
            "gtk_entry_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_new_with_buffer = Interop.downcallHandle(
            "gtk_entry_new_with_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_activates_default = Interop.downcallHandle(
            "gtk_entry_get_activates_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_alignment = Interop.downcallHandle(
            "gtk_entry_get_alignment",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_attributes = Interop.downcallHandle(
            "gtk_entry_get_attributes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_buffer = Interop.downcallHandle(
            "gtk_entry_get_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_completion = Interop.downcallHandle(
            "gtk_entry_get_completion",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_current_icon_drag_source = Interop.downcallHandle(
            "gtk_entry_get_current_icon_drag_source",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_extra_menu = Interop.downcallHandle(
            "gtk_entry_get_extra_menu",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_has_frame = Interop.downcallHandle(
            "gtk_entry_get_has_frame",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_activatable = Interop.downcallHandle(
            "gtk_entry_get_icon_activatable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_area = Interop.downcallHandle(
            "gtk_entry_get_icon_area",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_at_pos = Interop.downcallHandle(
            "gtk_entry_get_icon_at_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_gicon = Interop.downcallHandle(
            "gtk_entry_get_icon_gicon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_name = Interop.downcallHandle(
            "gtk_entry_get_icon_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_paintable = Interop.downcallHandle(
            "gtk_entry_get_icon_paintable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_sensitive = Interop.downcallHandle(
            "gtk_entry_get_icon_sensitive",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_storage_type = Interop.downcallHandle(
            "gtk_entry_get_icon_storage_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_tooltip_markup = Interop.downcallHandle(
            "gtk_entry_get_icon_tooltip_markup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_get_icon_tooltip_text = Interop.downcallHandle(
            "gtk_entry_get_icon_tooltip_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_get_input_hints = Interop.downcallHandle(
            "gtk_entry_get_input_hints",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_input_purpose = Interop.downcallHandle(
            "gtk_entry_get_input_purpose",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_invisible_char = Interop.downcallHandle(
            "gtk_entry_get_invisible_char",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_max_length = Interop.downcallHandle(
            "gtk_entry_get_max_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_overwrite_mode = Interop.downcallHandle(
            "gtk_entry_get_overwrite_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_placeholder_text = Interop.downcallHandle(
            "gtk_entry_get_placeholder_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_progress_fraction = Interop.downcallHandle(
            "gtk_entry_get_progress_fraction",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_progress_pulse_step = Interop.downcallHandle(
            "gtk_entry_get_progress_pulse_step",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_tabs = Interop.downcallHandle(
            "gtk_entry_get_tabs",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_text_length = Interop.downcallHandle(
            "gtk_entry_get_text_length",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_visibility = Interop.downcallHandle(
            "gtk_entry_get_visibility",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_grab_focus_without_selecting = Interop.downcallHandle(
            "gtk_entry_grab_focus_without_selecting",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_progress_pulse = Interop.downcallHandle(
            "gtk_entry_progress_pulse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_reset_im_context = Interop.downcallHandle(
            "gtk_entry_reset_im_context",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_activates_default = Interop.downcallHandle(
            "gtk_entry_set_activates_default",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_alignment = Interop.downcallHandle(
            "gtk_entry_set_alignment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_attributes = Interop.downcallHandle(
            "gtk_entry_set_attributes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_buffer = Interop.downcallHandle(
            "gtk_entry_set_buffer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_completion = Interop.downcallHandle(
            "gtk_entry_set_completion",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_extra_menu = Interop.downcallHandle(
            "gtk_entry_set_extra_menu",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_has_frame = Interop.downcallHandle(
            "gtk_entry_set_has_frame",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_icon_activatable = Interop.downcallHandle(
            "gtk_entry_set_icon_activatable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_icon_drag_source = Interop.downcallHandle(
            "gtk_entry_set_icon_drag_source",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_icon_from_gicon = Interop.downcallHandle(
            "gtk_entry_set_icon_from_gicon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_icon_from_icon_name = Interop.downcallHandle(
            "gtk_entry_set_icon_from_icon_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_icon_from_paintable = Interop.downcallHandle(
            "gtk_entry_set_icon_from_paintable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_icon_sensitive = Interop.downcallHandle(
            "gtk_entry_set_icon_sensitive",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_icon_tooltip_markup = Interop.downcallHandle(
            "gtk_entry_set_icon_tooltip_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_icon_tooltip_text = Interop.downcallHandle(
            "gtk_entry_set_icon_tooltip_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_input_hints = Interop.downcallHandle(
            "gtk_entry_set_input_hints",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_input_purpose = Interop.downcallHandle(
            "gtk_entry_set_input_purpose",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_invisible_char = Interop.downcallHandle(
            "gtk_entry_set_invisible_char",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_max_length = Interop.downcallHandle(
            "gtk_entry_set_max_length",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_overwrite_mode = Interop.downcallHandle(
            "gtk_entry_set_overwrite_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_set_placeholder_text = Interop.downcallHandle(
            "gtk_entry_set_placeholder_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_progress_fraction = Interop.downcallHandle(
            "gtk_entry_set_progress_fraction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_entry_set_progress_pulse_step = Interop.downcallHandle(
            "gtk_entry_set_progress_pulse_step",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_entry_set_tabs = Interop.downcallHandle(
            "gtk_entry_set_tabs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_set_visibility = Interop.downcallHandle(
            "gtk_entry_set_visibility",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_unset_invisible_char = Interop.downcallHandle(
            "gtk_entry_unset_invisible_char",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_get_type = Interop.downcallHandle(
            "gtk_entry_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalEntryActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Entry.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Entry(source, Ownership.NONE));
        }
        
        public static void signalEntryIconPress(MemoryAddress source, int iconPos, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Entry.IconPress) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Entry(source, Ownership.NONE), new org.gtk.gtk.EntryIconPosition(iconPos));
        }
        
        public static void signalEntryIconRelease(MemoryAddress source, int iconPos, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Entry.IconRelease) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Entry(source, Ownership.NONE), new org.gtk.gtk.EntryIconPosition(iconPos));
        }
    }
}
