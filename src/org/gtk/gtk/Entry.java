package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkEntry` is a single line text entry widget.
 * 
 * ![An example GtkEntry](entry.png)
 * 
 * A fairly large set of key bindings are supported by default. If the
 * entered text is longer than the allocation of the widget, the widget
 * will scroll so that the cursor position is visible.
 * 
 * When using an entry for passwords and other sensitive information, it
 * can be put into “password mode” using [method@Gtk.Entry.set_visibility].
 * In this mode, entered text is displayed using a “invisible” character.
 * By default, GTK picks the best invisible character that is available
 * in the current font, but it can be changed with
 * [method@Gtk.Entry.set_invisible_char].
 * 
 * `GtkEntry` has the ability to display progress or activity
 * information behind the text. To make an entry display such information,
 * use [method@Gtk.Entry.set_progress_fraction] or
 * [method@Gtk.Entry.set_progress_pulse_step].
 * 
 * Additionally, `GtkEntry` can show icons at either side of the entry.
 * These icons can be activatable by clicking, can be set up as drag source
 * and can have tooltips. To add an icon, use
 * [method@Gtk.Entry.set_icon_from_gicon] or one of the various other functions
 * that set an icon from an icon name or a paintable. To trigger an action when
 * the user clicks an icon, connect to the [signal@Gtk.Entry::icon-press] signal.
 * To allow DND operations from an icon, use
 * [method@Gtk.Entry.set_icon_drag_source]. To set a tooltip on an icon, use
 * [method@Gtk.Entry.set_icon_tooltip_text] or the corresponding function
 * for markup.
 * 
 * Note that functionality or information that is only available by clicking
 * on an icon in an entry may not be accessible at all to users which are not
 * able to use a mouse or other pointing device. It is therefore recommended
 * that any such functionality should also be available by other means, e.g.
 * via the context menu of the entry.
 * 
 * # CSS nodes
 * 
 * ```
 * entry[.flat][.warning][.error]
 * ├── text[.readonly]
 * ├── image.left
 * ├── image.right
 * ╰── [progress[.pulse]]
 * ```
 * 
 * `GtkEntry` has a main node with the name entry. Depending on the properties
 * of the entry, the style classes .read-only and .flat may appear. The style
 * classes .warning and .error may also be used with entries.
 * 
 * When the entry shows icons, it adds subnodes with the name image and the
 * style class .left or .right, depending on where the icon appears.
 * 
 * When the entry shows progress, it adds a subnode with the name progress.
 * The node has the style class .pulse when the shown progress is pulsing.
 * 
 * For all the subnodes added to the text node in various situations,
 * see [class@Gtk.Text].
 * 
 * # GtkEntry as GtkBuildable
 * 
 * The `GtkEntry` implementation of the `GtkBuildable` interface supports a
 * custom <attributes> element, which supports any number of <attribute>
 * elements. The <attribute> element has attributes named “name“, “value“,
 * “start“ and “end“ and allows you to specify `PangoAttribute` values for
 * this label.
 * 
 * An example of a UI definition fragment specifying Pango attributes:
 * ```xml
 * <object class="GtkEntry">
 *   <attributes>
 *     <attribute name="weight" value="PANGO_WEIGHT_BOLD"/>
 *     <attribute name="background" value="red" start="5" end="10"/>
 *   </attributes>
 * </object>
 * ```
 * 
 * The start and end attributes specify the range of characters to which the
 * Pango attribute applies. If start and end are not specified, the attribute
 * is applied to the whole text. Note that specifying ranges does not make much
 * sense with translatable attributes. Use markup embedded in the translatable
 * content instead.
 * 
 * # Accessibility
 * 
 * `GtkEntry` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
 */
public class Entry extends Widget implements Accessible, Buildable, CellEditable, ConstraintTarget, Editable {

    public Entry(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Entry */
    public static Entry castFrom(org.gtk.gobject.Object gobject) {
        return new Entry(gobject.getProxy());
    }
    
    /**
     * Creates a new entry.
     */
    public Entry() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_new(), false));
    }
    
    /**
     * Creates a new entry with the specified text buffer.
     */
    public Entry(EntryBuffer buffer) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_new_with_buffer(buffer.HANDLE()), false));
    }
    
    /**
     * Retrieves the value set by gtk_entry_set_activates_default().
     */
    public boolean getActivatesDefault() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_activates_default(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value set by gtk_entry_set_alignment().
     * 
     * See also: [property@Gtk.Editable:xalign]
     */
    public float getAlignment() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_alignment(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the attribute list of the `GtkEntry`.
     * 
     * See [method@Gtk.Entry.set_attributes].
     */
    public org.pango.AttrList getAttributes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_attributes(HANDLE());
        return new org.pango.AttrList(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Get the `GtkEntryBuffer` object which holds the text for
     * this widget.
     */
    public EntryBuffer getBuffer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_buffer(HANDLE());
        return new EntryBuffer(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the auxiliary completion object currently
     * in use by @entry.
     */
    public EntryCompletion getCompletion() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_completion(HANDLE());
        return new EntryCompletion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the index of the icon which is the source of the
     * current  DND operation, or -1.
     */
    public int getCurrentIconDragSource() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_current_icon_drag_source(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the menu model set with gtk_entry_set_extra_menu().
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_extra_menu(HANDLE());
        return new org.gtk.gio.MenuModel(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the value set by gtk_entry_set_has_frame().
     */
    public boolean getHasFrame() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_has_frame(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the icon is activatable.
     */
    public boolean getIconActivatable(EntryIconPosition iconPos) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_activatable(HANDLE(), iconPos.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Gets the area where entry’s icon at @icon_pos is drawn.
     * 
     * This function is useful when drawing something to the
     * entry in a draw callback.
     * 
     * If the entry is not realized or has no icon at the given
     * position, @icon_area is filled with zeros. Otherwise,
     * @icon_area will be filled with the icon's allocation,
     * relative to @entry's allocation.
     */
    public void getIconArea(EntryIconPosition iconPos, org.gtk.gdk.Rectangle iconArea) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_area(HANDLE(), iconPos.getValue(), iconArea.HANDLE());
    }
    
    /**
     * Finds the icon at the given position and return its index.
     * 
     * The position’s coordinates are relative to the @entry’s
     * top left corner. If @x, @y doesn’t lie inside an icon,
     * -1 is returned. This function is intended for use in a
     *  [signal@Gtk.Widget::query-tooltip] signal handler.
     */
    public int getIconAtPos(int x, int y) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_at_pos(HANDLE(), x, y);
        return RESULT;
    }
    
    /**
     * Retrieves the `GIcon` used for the icon.
     * 
     * %NULL will be returned if there is no icon or if the icon was
     * set by some other method (e.g., by `GdkPaintable` or icon name).
     */
    public org.gtk.gio.Icon getIconGicon(EntryIconPosition iconPos) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_gicon(HANDLE(), iconPos.getValue());
        return new org.gtk.gio.Icon.IconImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Retrieves the icon name used for the icon.
     * 
     * %NULL is returned if there is no icon or if the icon was set
     * by some other method (e.g., by `GdkPaintable` or gicon).
     */
    public java.lang.String getIconName(EntryIconPosition iconPos) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_name(HANDLE(), iconPos.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the `GdkPaintable` used for the icon.
     * 
     * If no `GdkPaintable` was used for the icon, %NULL is returned.
     */
    public org.gtk.gdk.Paintable getIconPaintable(EntryIconPosition iconPos) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_paintable(HANDLE(), iconPos.getValue());
        return new org.gtk.gdk.Paintable.PaintableImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns whether the icon appears sensitive or insensitive.
     */
    public boolean getIconSensitive(EntryIconPosition iconPos) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_sensitive(HANDLE(), iconPos.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Gets the type of representation being used by the icon
     * to store image data.
     * 
     * If the icon has no image data, the return value will
     * be %GTK_IMAGE_EMPTY.
     */
    public ImageType getIconStorageType(EntryIconPosition iconPos) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_storage_type(HANDLE(), iconPos.getValue());
        return ImageType.fromValue(RESULT);
    }
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in @entry.
     */
    public java.lang.String getIconTooltipMarkup(EntryIconPosition iconPos) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_tooltip_markup(HANDLE(), iconPos.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in @entry.
     */
    public java.lang.String getIconTooltipText(EntryIconPosition iconPos) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_icon_tooltip_text(HANDLE(), iconPos.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the input hints of this `GtkEntry`.
     */
    public int getInputHints() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_input_hints(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the input purpose of the `GtkEntry`.
     */
    public InputPurpose getInputPurpose() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_input_purpose(HANDLE());
        return InputPurpose.fromValue(RESULT);
    }
    
    /**
     * Retrieves the character displayed in place of the actual text
     * in “password mode”.
     */
    public int getInvisibleChar() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_invisible_char(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the maximum allowed length of the text in @entry.
     * 
     * See [method@Gtk.Entry.set_max_length].
     */
    public int getMaxLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_max_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets whether the `GtkEntry` is in overwrite mode.
     */
    public boolean getOverwriteMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_overwrite_mode(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the text that will be displayed when @entry
     * is empty and unfocused
     */
    public java.lang.String getPlaceholderText() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_placeholder_text(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the current fraction of the task that’s been completed.
     * 
     * See [method@Gtk.Entry.set_progress_fraction].
     */
    public double getProgressFraction() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_progress_fraction(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the pulse step set with
     * gtk_entry_set_progress_pulse_step().
     */
    public double getProgressPulseStep() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_progress_pulse_step(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the tabstops of the `GtkEntry.
     * 
     * See [method@Gtk.Entry.set_tabs].
     */
    public org.pango.TabArray getTabs() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_tabs(HANDLE());
        return new org.pango.TabArray(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Retrieves the current length of the text in @entry.
     * 
     * This is equivalent to getting @entry's `GtkEntryBuffer`
     * and calling [method@Gtk.EntryBuffer.get_length] on it.
     */
    public short getTextLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_text_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves whether the text in @entry is visible.
     * 
     * See [method@Gtk.Entry.set_visibility].
     */
    public boolean getVisibility() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_get_visibility(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Causes @entry to have keyboard focus.
     * 
     * It behaves like [method@Gtk.Widget.grab_focus], except that it doesn't
     * select the contents of the entry. You only want to call this on some
     * special entries which the user usually doesn't want to replace all text
     * in, such as search-as-you-type entries.
     */
    public boolean grabFocusWithoutSelecting() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_grab_focus_without_selecting(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Indicates that some progress is made, but you don’t
     * know how much.
     * 
     * Causes the entry’s progress indicator to enter “activity
     * mode”, where a block bounces back and forth. Each call to
     * gtk_entry_progress_pulse() causes the block to move by a
     * little bit (the amount of movement per pulse is determined
     * by [method@Gtk.Entry.set_progress_pulse_step]).
     */
    public void progressPulse() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_progress_pulse(HANDLE());
    }
    
    /**
     * Reset the input method context of the entry if needed.
     * 
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public void resetImContext() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_reset_im_context(HANDLE());
    }
    
    /**
     * Sets whether pressing Enter in the @entry will activate the default
     * widget for the window containing the entry.
     * 
     * This usually means that the dialog containing the entry will be closed,
     * since the default widget is usually one of the dialog buttons.
     */
    public void setActivatesDefault(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_activates_default(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets the alignment for the contents of the entry.
     * 
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the entry.
     * 
     * See also: [property@Gtk.Editable:xalign]
     */
    public void setAlignment(float xalign) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_alignment(HANDLE(), xalign);
    }
    
    /**
     * Sets a `PangoAttrList`.
     * 
     * The attributes in the list are applied to the entry text.
     * 
     * Since the attributes will be applies to text that changes
     * as the user types, it makes most sense to use attributes
     * with unlimited extent.
     */
    public void setAttributes(org.pango.AttrList attrs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_attributes(HANDLE(), attrs.HANDLE());
    }
    
    /**
     * Set the `GtkEntryBuffer` object which holds the text for
     * this widget.
     */
    public void setBuffer(EntryBuffer buffer) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_buffer(HANDLE(), buffer.HANDLE());
    }
    
    /**
     * Sets @completion to be the auxiliary completion object
     * to use with @entry.
     * 
     * All further configuration of the completion mechanism is
     * done on @completion using the `GtkEntryCompletion` API.
     * Completion is disabled if @completion is set to %NULL.
     */
    public void setCompletion(EntryCompletion completion) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_completion(HANDLE(), completion.HANDLE());
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for @entry.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_extra_menu(HANDLE(), model.HANDLE());
    }
    
    /**
     * Sets whether the entry has a beveled frame around it.
     */
    public void setHasFrame(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_has_frame(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the icon is activatable.
     */
    public void setIconActivatable(EntryIconPosition iconPos, boolean activatable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_icon_activatable(HANDLE(), iconPos.getValue(), activatable ? 1 : 0);
    }
    
    /**
     * Sets up the icon at the given position as drag source.
     * 
     * This makes it so that GTK will start a drag
     * operation when the user clicks and drags the icon.
     */
    public void setIconDragSource(EntryIconPosition iconPos, org.gtk.gdk.ContentProvider provider, int actions) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_icon_drag_source(HANDLE(), iconPos.getValue(), provider.HANDLE(), actions);
    }
    
    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     * 
     * If the icon isn’t known, a “broken image” icon will be
     * displayed instead.
     * 
     * If @icon is %NULL, no icon will be shown in the
     * specified position.
     */
    public void setIconFromGicon(EntryIconPosition iconPos, org.gtk.gio.Icon icon) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_icon_from_gicon(HANDLE(), iconPos.getValue(), icon.HANDLE());
    }
    
    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     * 
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead.
     * 
     * If @icon_name is %NULL, no icon will be shown in the
     * specified position.
     */
    public void setIconFromIconName(EntryIconPosition iconPos, java.lang.String iconName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_icon_from_icon_name(HANDLE(), iconPos.getValue(), Interop.getAllocator().allocateUtf8String(iconName));
    }
    
    /**
     * Sets the icon shown in the specified position using a `GdkPaintable`.
     * 
     * If @paintable is %NULL, no icon will be shown in the specified position.
     */
    public void setIconFromPaintable(EntryIconPosition iconPos, org.gtk.gdk.Paintable paintable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_icon_from_paintable(HANDLE(), iconPos.getValue(), paintable.HANDLE());
    }
    
    /**
     * Sets the sensitivity for the specified icon.
     */
    public void setIconSensitive(EntryIconPosition iconPos, boolean sensitive) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_icon_sensitive(HANDLE(), iconPos.getValue(), sensitive ? 1 : 0);
    }
    
    /**
     * Sets @tooltip as the contents of the tooltip for the icon at
     * the specified position.
     * 
     * @tooltip is assumed to be marked up with Pango Markup.
     * 
     * Use %NULL for @tooltip to remove an existing tooltip.
     * 
     * See also [method@Gtk.Widget.set_tooltip_markup] and
     * [method@Gtk.Entry.set_icon_tooltip_text].
     */
    public void setIconTooltipMarkup(EntryIconPosition iconPos, java.lang.String tooltip) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_icon_tooltip_markup(HANDLE(), iconPos.getValue(), Interop.getAllocator().allocateUtf8String(tooltip));
    }
    
    /**
     * Sets @tooltip as the contents of the tooltip for the icon
     * at the specified position.
     * 
     * Use %NULL for @tooltip to remove an existing tooltip.
     * 
     * See also [method@Gtk.Widget.set_tooltip_text] and
     * [method@Gtk.Entry.set_icon_tooltip_markup].
     * 
     * If you unset the widget tooltip via
     * [method@Gtk.Widget.set_tooltip_text] or
     * [method@Gtk.Widget.set_tooltip_markup], this sets
     * [property@Gtk.Widget:has-tooltip] to %FALSE, which suppresses
     * icon tooltips too. You can resolve this by then calling
     * [method@Gtk.Widget.set_has_tooltip] to set
     * [property@Gtk.Widget:has-tooltip] back to %TRUE, or
     * setting at least one non-empty tooltip on any icon
     * achieves the same result.
     */
    public void setIconTooltipText(EntryIconPosition iconPos, java.lang.String tooltip) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_icon_tooltip_text(HANDLE(), iconPos.getValue(), Interop.getAllocator().allocateUtf8String(tooltip));
    }
    
    /**
     * Set additional hints which allow input methods to
     * fine-tune their behavior.
     */
    public void setInputHints(int hints) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_input_hints(HANDLE(), hints);
    }
    
    /**
     * Sets the input purpose which can be used by input methods
     * to adjust their behavior.
     */
    public void setInputPurpose(InputPurpose purpose) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_input_purpose(HANDLE(), purpose.getValue());
    }
    
    /**
     * Sets the character to use in place of the actual text
     * in “password mode”.
     * 
     * See [method@Gtk.Entry.set_visibility] for how to enable
     * “password mode”.
     * 
     * By default, GTK picks the best invisible char available in
     * the current font. If you set the invisible char to 0, then
     * the user will get no feedback at all; there will be no text
     * on the screen as they type.
     */
    public void setInvisibleChar(int ch) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_invisible_char(HANDLE(), ch);
    }
    
    /**
     * Sets the maximum allowed length of the contents of the widget.
     * 
     * If the current contents are longer than the given length, then
     * they will be truncated to fit. The length is is in characters.
     * 
     * This is equivalent to getting @entry's `GtkEntryBuffer` and
     * calling [method@Gtk.EntryBuffer.set_max_length] on it.
     */
    public void setMaxLength(int max) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_max_length(HANDLE(), max);
    }
    
    /**
     * Sets whether the text is overwritten when typing in the `GtkEntry`.
     */
    public void setOverwriteMode(boolean overwrite) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_overwrite_mode(HANDLE(), overwrite ? 1 : 0);
    }
    
    /**
     * Sets text to be displayed in @entry when it is empty.
     * 
     * This can be used to give a visual hint of the expected
     * contents of the `GtkEntry`.
     */
    public void setPlaceholderText(java.lang.String text) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_placeholder_text(HANDLE(), Interop.getAllocator().allocateUtf8String(text));
    }
    
    /**
     * Causes the entry’s progress indicator to “fill in” the given
     * fraction of the bar.
     * 
     * The fraction should be between 0.0 and 1.0, inclusive.
     */
    public void setProgressFraction(double fraction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_progress_fraction(HANDLE(), fraction);
    }
    
    /**
     * Sets the fraction of total entry width to move the progress
     * bouncing block for each pulse.
     * 
     * Use [method@Gtk.Entry.progress_pulse] to pulse
     * the progress.
     */
    public void setProgressPulseStep(double fraction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_progress_pulse_step(HANDLE(), fraction);
    }
    
    /**
     * Sets a `PangoTabArray`.
     * 
     * The tabstops in the array are applied to the entry text.
     */
    public void setTabs(org.pango.TabArray tabs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_tabs(HANDLE(), tabs.HANDLE());
    }
    
    /**
     * Sets whether the contents of the entry are visible or not.
     * 
     * When visibility is set to %FALSE, characters are displayed
     * as the invisible char, and will also appear that way when
     * the text in the entry widget is copied elsewhere.
     * 
     * By default, GTK picks the best invisible character available
     * in the current font, but it can be changed with
     * [method@Gtk.Entry.set_invisible_char].
     * 
     * Note that you probably want to set [property@Gtk.Entry:input-purpose]
     * to %GTK_INPUT_PURPOSE_PASSWORD or %GTK_INPUT_PURPOSE_PIN to
     * inform input methods about the purpose of this entry,
     * in addition to setting visibility to %FALSE.
     */
    public void setVisibility(boolean visible) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_set_visibility(HANDLE(), visible ? 1 : 0);
    }
    
    /**
     * Unsets the invisible char, so that the default invisible char
     * is used again. See [method@Gtk.Entry.set_invisible_char].
     */
    public void unsetInvisibleChar() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_unset_invisible_char(HANDLE());
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Entry source);
    }
    
    /**
     * Emitted when the entry is activated.
     * 
     * The keybindings for this signal are all forms of the Enter key.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface IconPressHandler {
        void signalReceived(Entry source, EntryIconPosition iconPos);
    }
    
    /**
     * Emitted when an activatable icon is clicked.
     */
    public void onIconPress(IconPressHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryIconPress", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("icon-press"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
    public void onIconRelease(IconReleaseHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryIconRelease", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("icon-release"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
