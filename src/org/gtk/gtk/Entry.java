package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public Entry(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Entry */
    public static Entry castFrom(org.gtk.gobject.Object gobject) {
        return new Entry(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_entry_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new entry.
     */
    public Entry() {
        super(constructNew());
    }
    
    private static Reference constructNewWithBuffer(EntryBuffer buffer) {
        Reference RESULT = References.get(gtk_h.gtk_entry_new_with_buffer(buffer.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new entry with the specified text buffer.
     */
    public static Entry newWithBuffer(EntryBuffer buffer) {
        return new Entry(constructNewWithBuffer(buffer));
    }
    
    /**
     * Retrieves the value set by gtk_entry_set_activates_default().
     */
    public boolean getActivatesDefault() {
        var RESULT = gtk_h.gtk_entry_get_activates_default(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the value set by gtk_entry_set_alignment().
     * <p>
     * See also: {@code Gtk.Editable:xalign}
     */
    public float getAlignment() {
        var RESULT = gtk_h.gtk_entry_get_alignment(handle());
        return RESULT;
    }
    
    /**
     * Gets the attribute list of the {@code GtkEntry}.
     * <p>
     * See {@link Entry#setAttributes}.
     */
    public org.pango.AttrList getAttributes() {
        var RESULT = gtk_h.gtk_entry_get_attributes(handle());
        return new org.pango.AttrList(References.get(RESULT, false));
    }
    
    /**
     * Get the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     */
    public EntryBuffer getBuffer() {
        var RESULT = gtk_h.gtk_entry_get_buffer(handle());
        return new EntryBuffer(References.get(RESULT, false));
    }
    
    /**
     * Returns the auxiliary completion object currently
     * in use by {@code entry}.
     */
    public EntryCompletion getCompletion() {
        var RESULT = gtk_h.gtk_entry_get_completion(handle());
        return new EntryCompletion(References.get(RESULT, false));
    }
    
    /**
     * Returns the index of the icon which is the source of the
     * current  DND operation, or -1.
     */
    public int getCurrentIconDragSource() {
        var RESULT = gtk_h.gtk_entry_get_current_icon_drag_source(handle());
        return RESULT;
    }
    
    /**
     * Gets the menu model set with gtk_entry_set_extra_menu().
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        var RESULT = gtk_h.gtk_entry_get_extra_menu(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Gets the value set by gtk_entry_set_has_frame().
     */
    public boolean getHasFrame() {
        var RESULT = gtk_h.gtk_entry_get_has_frame(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the icon is activatable.
     */
    public boolean getIconActivatable(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_activatable(handle(), iconPos.getValue());
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
     */
    public void getIconArea(EntryIconPosition iconPos, org.gtk.gdk.Rectangle iconArea) {
        gtk_h.gtk_entry_get_icon_area(handle(), iconPos.getValue(), iconArea.handle());
    }
    
    /**
     * Finds the icon at the given position and return its index.
     * <p>
     * The position’s coordinates are relative to the {@code entry}’s
     * top left corner. If @x, @y doesn’t lie inside an icon,
     * -1 is returned. This function is intended for use in a
     *  {@code Gtk.Widget::query-tooltip} signal handler.
     */
    public int getIconAtPos(int x, int y) {
        var RESULT = gtk_h.gtk_entry_get_icon_at_pos(handle(), x, y);
        return RESULT;
    }
    
    /**
     * Retrieves the {@code GIcon} used for the icon.
     * <p>
     * {@code null} will be returned if there is no icon or if the icon was
     * set by some other method (e.g., by {@code GdkPaintable} or icon name).
     */
    public org.gtk.gio.Icon getIconGicon(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_gicon(handle(), iconPos.getValue());
        return new org.gtk.gio.Icon.IconImpl(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the icon name used for the icon.
     * <p>
     * {@code null} is returned if there is no icon or if the icon was set
     * by some other method (e.g., by {@code GdkPaintable} or gicon).
     */
    public java.lang.String getIconName(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_name(handle(), iconPos.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the {@code GdkPaintable} used for the icon.
     * <p>
     * If no {@code GdkPaintable} was used for the icon, {@code null} is returned.
     */
    public org.gtk.gdk.Paintable getIconPaintable(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_paintable(handle(), iconPos.getValue());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the icon appears sensitive or insensitive.
     */
    public boolean getIconSensitive(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_sensitive(handle(), iconPos.getValue());
        return RESULT != 0;
    }
    
    /**
     * Gets the type of representation being used by the icon
     * to store image data.
     * <p>
     * If the icon has no image data, the return value will
     * be {@link ImageType#EMPTY}.
     */
    public ImageType getIconStorageType(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_storage_type(handle(), iconPos.getValue());
        return new ImageType(RESULT);
    }
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in {@code entry}.
     */
    public java.lang.String getIconTooltipMarkup(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_tooltip_markup(handle(), iconPos.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in {@code entry}.
     */
    public java.lang.String getIconTooltipText(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_tooltip_text(handle(), iconPos.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the input hints of this {@code GtkEntry}.
     */
    public InputHints getInputHints() {
        var RESULT = gtk_h.gtk_entry_get_input_hints(handle());
        return new InputHints(RESULT);
    }
    
    /**
     * Gets the input purpose of the {@code GtkEntry}.
     */
    public InputPurpose getInputPurpose() {
        var RESULT = gtk_h.gtk_entry_get_input_purpose(handle());
        return new InputPurpose(RESULT);
    }
    
    /**
     * Retrieves the character displayed in place of the actual text
     * in “password mode”.
     */
    public int getInvisibleChar() {
        var RESULT = gtk_h.gtk_entry_get_invisible_char(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the maximum allowed length of the text in {@code entry}.
     * <p>
     * See {@link Entry#setMaxLength}.
     */
    public int getMaxLength() {
        var RESULT = gtk_h.gtk_entry_get_max_length(handle());
        return RESULT;
    }
    
    /**
     * Gets whether the {@code GtkEntry} is in overwrite mode.
     */
    public boolean getOverwriteMode() {
        var RESULT = gtk_h.gtk_entry_get_overwrite_mode(handle());
        return RESULT != 0;
    }
    
    /**
     * Retrieves the text that will be displayed when {@code entry}
     * is empty and unfocused
     */
    public java.lang.String getPlaceholderText() {
        var RESULT = gtk_h.gtk_entry_get_placeholder_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the current fraction of the task that’s been completed.
     * <p>
     * See {@link Entry#setProgressFraction}.
     */
    public double getProgressFraction() {
        var RESULT = gtk_h.gtk_entry_get_progress_fraction(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the pulse step set with
     * gtk_entry_set_progress_pulse_step().
     */
    public double getProgressPulseStep() {
        var RESULT = gtk_h.gtk_entry_get_progress_pulse_step(handle());
        return RESULT;
    }
    
    /**
     * Gets the tabstops of the `GtkEntry.
     * <p>
     * See {@link Entry#setTabs}.
     */
    public org.pango.TabArray getTabs() {
        var RESULT = gtk_h.gtk_entry_get_tabs(handle());
        return new org.pango.TabArray(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the current length of the text in {@code entry}.
     * <p>
     * This is equivalent to getting {@code entry}'s {@code GtkEntryBuffer}
     * and calling {@link EntryBuffer#getLength} on it.
     */
    public short getTextLength() {
        var RESULT = gtk_h.gtk_entry_get_text_length(handle());
        return RESULT;
    }
    
    /**
     * Retrieves whether the text in {@code entry} is visible.
     * <p>
     * See {@link Entry#setVisibility}.
     */
    public boolean getVisibility() {
        var RESULT = gtk_h.gtk_entry_get_visibility(handle());
        return RESULT != 0;
    }
    
    /**
     * Causes {@code entry} to have keyboard focus.
     * <p>
     * It behaves like {@link Widget#grabFocus}, except that it doesn't
     * select the contents of the entry. You only want to call this on some
     * special entries which the user usually doesn't want to replace all text
     * in, such as search-as-you-type entries.
     */
    public boolean grabFocusWithoutSelecting() {
        var RESULT = gtk_h.gtk_entry_grab_focus_without_selecting(handle());
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
        gtk_h.gtk_entry_progress_pulse(handle());
    }
    
    /**
     * Reset the input method context of the entry if needed.
     * <p>
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public void resetImContext() {
        gtk_h.gtk_entry_reset_im_context(handle());
    }
    
    /**
     * Sets whether pressing Enter in the {@code entry} will activate the default
     * widget for the window containing the entry.
     * <p>
     * This usually means that the dialog containing the entry will be closed,
     * since the default widget is usually one of the dialog buttons.
     */
    public void setActivatesDefault(boolean setting) {
        gtk_h.gtk_entry_set_activates_default(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the alignment for the contents of the entry.
     * <p>
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the entry.
     * <p>
     * See also: {@code Gtk.Editable:xalign}
     */
    public void setAlignment(float xalign) {
        gtk_h.gtk_entry_set_alignment(handle(), xalign);
    }
    
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
        gtk_h.gtk_entry_set_attributes(handle(), attrs.handle());
    }
    
    /**
     * Set the {@code GtkEntryBuffer} object which holds the text for
     * this widget.
     */
    public void setBuffer(EntryBuffer buffer) {
        gtk_h.gtk_entry_set_buffer(handle(), buffer.handle());
    }
    
    /**
     * Sets {@code completion} to be the auxiliary completion object
     * to use with {@code entry}.
     * <p>
     * All further configuration of the completion mechanism is
     * done on {@code completion} using the {@code GtkEntryCompletion} API.
     * Completion is disabled if {@code completion} is set to {@code null}.
     */
    public void setCompletion(EntryCompletion completion) {
        gtk_h.gtk_entry_set_completion(handle(), completion.handle());
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code entry}.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        gtk_h.gtk_entry_set_extra_menu(handle(), model.handle());
    }
    
    /**
     * Sets whether the entry has a beveled frame around it.
     */
    public void setHasFrame(boolean setting) {
        gtk_h.gtk_entry_set_has_frame(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the icon is activatable.
     */
    public void setIconActivatable(EntryIconPosition iconPos, boolean activatable) {
        gtk_h.gtk_entry_set_icon_activatable(handle(), iconPos.getValue(), activatable ? 1 : 0);
    }
    
    /**
     * Sets up the icon at the given position as drag source.
     * <p>
     * This makes it so that GTK will start a drag
     * operation when the user clicks and drags the icon.
     */
    public void setIconDragSource(EntryIconPosition iconPos, org.gtk.gdk.ContentProvider provider, org.gtk.gdk.DragAction actions) {
        gtk_h.gtk_entry_set_icon_drag_source(handle(), iconPos.getValue(), provider.handle(), actions.getValue());
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
     */
    public void setIconFromGicon(EntryIconPosition iconPos, org.gtk.gio.Icon icon) {
        gtk_h.gtk_entry_set_icon_from_gicon(handle(), iconPos.getValue(), icon.handle());
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
     */
    public void setIconFromIconName(EntryIconPosition iconPos, java.lang.String iconName) {
        gtk_h.gtk_entry_set_icon_from_icon_name(handle(), iconPos.getValue(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the icon shown in the specified position using a {@code GdkPaintable}.
     * <p>
     * If {@code paintable} is {@code null}, no icon will be shown in the specified position.
     */
    public void setIconFromPaintable(EntryIconPosition iconPos, org.gtk.gdk.Paintable paintable) {
        gtk_h.gtk_entry_set_icon_from_paintable(handle(), iconPos.getValue(), paintable.handle());
    }
    
    /**
     * Sets the sensitivity for the specified icon.
     */
    public void setIconSensitive(EntryIconPosition iconPos, boolean sensitive) {
        gtk_h.gtk_entry_set_icon_sensitive(handle(), iconPos.getValue(), sensitive ? 1 : 0);
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
     */
    public void setIconTooltipMarkup(EntryIconPosition iconPos, java.lang.String tooltip) {
        gtk_h.gtk_entry_set_icon_tooltip_markup(handle(), iconPos.getValue(), Interop.allocateNativeString(tooltip).handle());
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
     */
    public void setIconTooltipText(EntryIconPosition iconPos, java.lang.String tooltip) {
        gtk_h.gtk_entry_set_icon_tooltip_text(handle(), iconPos.getValue(), Interop.allocateNativeString(tooltip).handle());
    }
    
    /**
     * Set additional hints which allow input methods to
     * fine-tune their behavior.
     */
    public void setInputHints(InputHints hints) {
        gtk_h.gtk_entry_set_input_hints(handle(), hints.getValue());
    }
    
    /**
     * Sets the input purpose which can be used by input methods
     * to adjust their behavior.
     */
    public void setInputPurpose(InputPurpose purpose) {
        gtk_h.gtk_entry_set_input_purpose(handle(), purpose.getValue());
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
     */
    public void setInvisibleChar(int ch) {
        gtk_h.gtk_entry_set_invisible_char(handle(), ch);
    }
    
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
        gtk_h.gtk_entry_set_max_length(handle(), max);
    }
    
    /**
     * Sets whether the text is overwritten when typing in the {@code GtkEntry}.
     */
    public void setOverwriteMode(boolean overwrite) {
        gtk_h.gtk_entry_set_overwrite_mode(handle(), overwrite ? 1 : 0);
    }
    
    /**
     * Sets text to be displayed in {@code entry} when it is empty.
     * <p>
     * This can be used to give a visual hint of the expected
     * contents of the {@code GtkEntry}.
     */
    public void setPlaceholderText(java.lang.String text) {
        gtk_h.gtk_entry_set_placeholder_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Causes the entry’s progress indicator to “fill in” the given
     * fraction of the bar.
     * <p>
     * The fraction should be between 0.0 and 1.0, inclusive.
     */
    public void setProgressFraction(double fraction) {
        gtk_h.gtk_entry_set_progress_fraction(handle(), fraction);
    }
    
    /**
     * Sets the fraction of total entry width to move the progress
     * bouncing block for each pulse.
     * <p>
     * Use {@link Entry#progressPulse} to pulse
     * the progress.
     */
    public void setProgressPulseStep(double fraction) {
        gtk_h.gtk_entry_set_progress_pulse_step(handle(), fraction);
    }
    
    /**
     * Sets a {@code PangoTabArray}.
     * <p>
     * The tabstops in the array are applied to the entry text.
     */
    public void setTabs(org.pango.TabArray tabs) {
        gtk_h.gtk_entry_set_tabs(handle(), tabs.handle());
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
     */
    public void setVisibility(boolean visible) {
        gtk_h.gtk_entry_set_visibility(handle(), visible ? 1 : 0);
    }
    
    /**
     * Unsets the invisible char, so that the default invisible char
     * is used again. See {@link Entry#setInvisibleChar}.
     */
    public void unsetInvisibleChar() {
        gtk_h.gtk_entry_unset_invisible_char(handle());
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Entry.Callbacks.class, "signalEntryActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onIconPress(IconPressHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("icon-press").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Entry.Callbacks.class, "signalEntryIconPress",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onIconRelease(IconReleaseHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("icon-release").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Entry.Callbacks.class, "signalEntryIconRelease",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalEntryActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Entry.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Entry(References.get(source)));
        }
        
        public static void signalEntryIconPress(MemoryAddress source, int iconPos, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Entry.IconPressHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Entry(References.get(source)), new EntryIconPosition(iconPos));
        }
        
        public static void signalEntryIconRelease(MemoryAddress source, int iconPos, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Entry.IconReleaseHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Entry(References.get(source)), new EntryIconPosition(iconPos));
        }
        
    }
}
