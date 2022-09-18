package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkEntry</code> is a single line text entry widget.
 * <p>
 * !{@link [An example GtkEntry]}(entry.png)
 * <p>
 * A fairly large set of key bindings are supported by default. If the
 * entered text is longer than the allocation of the widget, the widget
 * will scroll so that the cursor position is visible.
 * <p>
 * When using an entry for passwords and other sensitive information, it
 * can be put into &<code>#8220</code> password mode&<code>#8221</code>  using {@link org.gtk.gtk.Entry<code>#setVisibility</code> .
 * In this mode, entered text is displayed using a &<code>#8220</code> invisible&<code>#8221</code>  character.
 * By default, GTK picks the best invisible character that is available
 * in the current font, but it can be changed with
 * {@link org.gtk.gtk.Entry<code>#setInvisibleChar</code> .
 * <p><code>GtkEntry</code> has the ability to display progress or activity
 * information behind the text. To make an entry display such information,
 * use {@link org.gtk.gtk.Entry<code>#setProgressFraction</code>  or
 * {@link org.gtk.gtk.Entry<code>#setProgressPulseStep</code> .
 * <p>
 * Additionally, <code>GtkEntry</code> can show icons at either side of the entry.
 * These icons can be activatable by clicking, can be set up as drag source
 * and can have tooltips. To add an icon, use
 * {@link org.gtk.gtk.Entry<code>#setIconFromGicon</code>  or one of the various other functions
 * that set an icon from an icon name or a paintable. To trigger an action when
 * the user clicks an icon, connect to the {@link [signal@Gtk.Entry::icon-press] (ref=signal)} signal.
 * To allow DND operations from an icon, use
 * {@link org.gtk.gtk.Entry<code>#setIconDragSource</code> . To set a tooltip on an icon, use
 * {@link org.gtk.gtk.Entry<code>#setIconTooltipText</code>  or the corresponding function
 * for markup.
 * <p>
 * Note that functionality or information that is only available by clicking
 * on an icon in an entry may not be accessible at all to users which are not
 * able to use a mouse or other pointing device. It is therefore recommended
 * that any such functionality should also be available by other means, e.g.
 * via the context menu of the entry.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * entry{@link [.flat]}{@link [.warning]}{@link [.error]}
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  text{@link [.readonly]}
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  image.left
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  image.right
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  {@link [progress[.pulse]}]
 * </pre>
 * <p><code>GtkEntry</code> has a main node with the name entry. Depending on the properties
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
 * see {@link org.gtk.gtk.Text}.
 * <p>
 * <h1>GtkEntry as GtkBuildable</h1>
 * <p>
 * The <code>GtkEntry</code> implementation of the <code>GtkBuildable</code> interface supports a
 * custom &<code>#60</code> attributes&<code>#62</code>  element, which supports any number of &<code>#60</code> attribute&<code>#62</code> 
 * elements. The &<code>#60</code> attribute&<code>#62</code>  element has attributes named &<code>#8220</code> name&<code>#8220</code> , &<code>#8220</code> value&<code>#8220</code> ,
 * &<code>#8220</code> start&<code>#8220</code>  and &<code>#8220</code> end&<code>#8220</code>  and allows you to specify <code>PangoAttribute</code> values for
 * this label.
 * <p>
 * An example of a UI definition fragment specifying Pango attributes:<pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkEntry&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> attributes&<code>#62</code> 
 *     &<code>#60</code> attribute name=&<code>#34</code> weight&<code>#34</code>  value=&<code>#34</code> PANGO_WEIGHT_BOLD&<code>#34</code> /&<code>#62</code> 
 *     &<code>#60</code> attribute name=&<code>#34</code> background&<code>#34</code>  value=&<code>#34</code> red&<code>#34</code>  start=&<code>#34</code> 5&<code>#34</code>  end=&<code>#34</code> 10&<code>#34</code> /&<code>#62</code> 
 *   &<code>#60</code> /attributes&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * The start and end attributes specify the range of characters to which the
 * Pango attribute applies. If start and end are not specified, the attribute
 * is applied to the whole text. Note that specifying ranges does not make much
 * sense with translatable attributes. Use markup embedded in the translatable
 * content instead.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkEntry</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#TEXT_BOX</code>  role.
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
        return (RESULT != 0);
    }
    
    /**
     * Gets the value set by gtk_entry_set_alignment().
     * 
     * See also: {@link [property@Gtk.Editable:xalign] (ref=property)}
     */
    public float getAlignment() {
        var RESULT = gtk_h.gtk_entry_get_alignment(handle());
        return RESULT;
    }
    
    /**
     * Gets the attribute list of the <code>GtkEntry</code>.
     * 
     * See {@link org.gtk.gtk.Entry<code>#setAttributes</code> .
     */
    public org.pango.AttrList getAttributes() {
        var RESULT = gtk_h.gtk_entry_get_attributes(handle());
        return new org.pango.AttrList(References.get(RESULT, false));
    }
    
    /**
     * Get the <code>GtkEntryBuffer</code> object which holds the text for
     * this widget.
     */
    public EntryBuffer getBuffer() {
        var RESULT = gtk_h.gtk_entry_get_buffer(handle());
        return new EntryBuffer(References.get(RESULT, false));
    }
    
    /**
     * Returns the auxiliary completion object currently
     * in use by @entry.
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
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the icon is activatable.
     */
    public boolean getIconActivatable(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_activatable(handle(), iconPos.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Gets the area where entry&<code>#8217</code> s icon at @icon_pos is drawn.
     * 
     * This function is useful when drawing something to the
     * entry in a draw callback.
     * 
     * If the entry is not realized or has no icon at the given
     * position, @icon_area is filled with zeros. Otherwise,
     * @icon_area will be filled with the icon&<code>#39</code> s allocation,
     * relative to @entry&<code>#39</code> s allocation.
     */
    public void getIconArea(EntryIconPosition iconPos, org.gtk.gdk.Rectangle iconArea) {
        gtk_h.gtk_entry_get_icon_area(handle(), iconPos.getValue(), iconArea.handle());
    }
    
    /**
     * Finds the icon at the given position and return its index.
     * 
     * The position&<code>#8217</code> s coordinates are relative to the @entry&<code>#8217</code> s
     * top left corner. If @x, @y doesn&<code>#8217</code> t lie inside an icon,
     * -1 is returned. This function is intended for use in a
     *  {@link [signal@Gtk.Widget::query-tooltip] (ref=signal)} signal handler.
     */
    public int getIconAtPos(int x, int y) {
        var RESULT = gtk_h.gtk_entry_get_icon_at_pos(handle(), x, y);
        return RESULT;
    }
    
    /**
     * Retrieves the <code>GIcon</code> used for the icon.
     * <p>
     * <code>null</code> will be returned if there is no icon or if the icon was
     * set by some other method (e.g., by <code>GdkPaintable</code> or icon name).
     */
    public org.gtk.gio.Icon getIconGicon(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_gicon(handle(), iconPos.getValue());
        return new org.gtk.gio.Icon.IconImpl(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the icon name used for the icon.
     * <p>
     * <code>null</code> is returned if there is no icon or if the icon was set
     * by some other method (e.g., by <code>GdkPaintable</code> or gicon).
     */
    public java.lang.String getIconName(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_name(handle(), iconPos.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the <code>GdkPaintable</code> used for the icon.
     * <p>
     * If no <code>GdkPaintable</code> was used for the icon, <code>null</code> is returned.
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
        return (RESULT != 0);
    }
    
    /**
     * Gets the type of representation being used by the icon
     * to store image data.
     * 
     * If the icon has no image data, the return value will
     * be {@link org.gtk.gtk.ImageType<code>#EMPTY</code>
     */
    public ImageType getIconStorageType(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_storage_type(handle(), iconPos.getValue());
        return ImageType.fromValue(RESULT);
    }
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in @entry.
     */
    public java.lang.String getIconTooltipMarkup(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_tooltip_markup(handle(), iconPos.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the contents of the tooltip on the icon at the specified
     * position in @entry.
     */
    public java.lang.String getIconTooltipText(EntryIconPosition iconPos) {
        var RESULT = gtk_h.gtk_entry_get_icon_tooltip_text(handle(), iconPos.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the input hints of this <code>GtkEntry</code>.
     */
    public int getInputHints() {
        var RESULT = gtk_h.gtk_entry_get_input_hints(handle());
        return RESULT;
    }
    
    /**
     * Gets the input purpose of the <code>GtkEntry</code>.
     */
    public InputPurpose getInputPurpose() {
        var RESULT = gtk_h.gtk_entry_get_input_purpose(handle());
        return InputPurpose.fromValue(RESULT);
    }
    
    /**
     * Retrieves the character displayed in place of the actual text
     * in &<code>#8220</code> password mode&<code>#8221</code> .
     */
    public int getInvisibleChar() {
        var RESULT = gtk_h.gtk_entry_get_invisible_char(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the maximum allowed length of the text in @entry.
     * 
     * See {@link org.gtk.gtk.Entry<code>#setMaxLength</code> .
     */
    public int getMaxLength() {
        var RESULT = gtk_h.gtk_entry_get_max_length(handle());
        return RESULT;
    }
    
    /**
     * Gets whether the <code>GtkEntry</code> is in overwrite mode.
     */
    public boolean getOverwriteMode() {
        var RESULT = gtk_h.gtk_entry_get_overwrite_mode(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the text that will be displayed when @entry
     * is empty and unfocused
     */
    public java.lang.String getPlaceholderText() {
        var RESULT = gtk_h.gtk_entry_get_placeholder_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the current fraction of the task that&<code>#8217</code> s been completed.
     * 
     * See {@link org.gtk.gtk.Entry<code>#setProgressFraction</code> .
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
     * Gets the tabstops of the <code>GtkEntry.
     * 
     * See {@link org.gtk.gtk.Entry<code>#setTabs</code> .
     */
    public org.pango.TabArray getTabs() {
        var RESULT = gtk_h.gtk_entry_get_tabs(handle());
        return new org.pango.TabArray(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the current length of the text in @entry.
     * <p>
     * This is equivalent to getting @entry&<code>#39</code> s <code>GtkEntryBuffer</code>
     * and calling {@link org.gtk.gtk.EntryBuffer<code>#getLength</code>  on it.
     */
    public short getTextLength() {
        var RESULT = gtk_h.gtk_entry_get_text_length(handle());
        return RESULT;
    }
    
    /**
     * Retrieves whether the text in @entry is visible.
     * 
     * See {@link org.gtk.gtk.Entry<code>#setVisibility</code> .
     */
    public boolean getVisibility() {
        var RESULT = gtk_h.gtk_entry_get_visibility(handle());
        return (RESULT != 0);
    }
    
    /**
     * Causes @entry to have keyboard focus.
     * 
     * It behaves like {@link org.gtk.gtk.Widget<code>#grabFocus</code> , except that it doesn&<code>#39</code> t
     * select the contents of the entry. You only want to call this on some
     * special entries which the user usually doesn&<code>#39</code> t want to replace all text
     * in, such as search-as-you-type entries.
     */
    public boolean grabFocusWithoutSelecting() {
        var RESULT = gtk_h.gtk_entry_grab_focus_without_selecting(handle());
        return (RESULT != 0);
    }
    
    /**
     * Indicates that some progress is made, but you don&<code>#8217</code> t
     * know how much.
     * 
     * Causes the entry&<code>#8217</code> s progress indicator to enter &<code>#8220</code> activity
     * mode&<code>#8221</code> , where a block bounces back and forth. Each call to
     * gtk_entry_progress_pulse() causes the block to move by a
     * little bit (the amount of movement per pulse is determined
     * by {@link org.gtk.gtk.Entry<code>#setProgressPulseStep</code> ).
     */
    public void progressPulse() {
        gtk_h.gtk_entry_progress_pulse(handle());
    }
    
    /**
     * Reset the input method context of the entry if needed.
     * 
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public void resetImContext() {
        gtk_h.gtk_entry_reset_im_context(handle());
    }
    
    /**
     * Sets whether pressing Enter in the @entry will activate the default
     * widget for the window containing the entry.
     * 
     * This usually means that the dialog containing the entry will be closed,
     * since the default widget is usually one of the dialog buttons.
     */
    public void setActivatesDefault(boolean setting) {
        gtk_h.gtk_entry_set_activates_default(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the alignment for the contents of the entry.
     * 
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the entry.
     * 
     * See also: {@link [property@Gtk.Editable:xalign] (ref=property)}
     */
    public void setAlignment(float xalign) {
        gtk_h.gtk_entry_set_alignment(handle(), xalign);
    }
    
    /**
     * Sets a <code>PangoAttrList</code>.
     * 
     * The attributes in the list are applied to the entry text.
     * 
     * Since the attributes will be applies to text that changes
     * as the user types, it makes most sense to use attributes
     * with unlimited extent.
     */
    public void setAttributes(org.pango.AttrList attrs) {
        gtk_h.gtk_entry_set_attributes(handle(), attrs.handle());
    }
    
    /**
     * Set the <code>GtkEntryBuffer</code> object which holds the text for
     * this widget.
     */
    public void setBuffer(EntryBuffer buffer) {
        gtk_h.gtk_entry_set_buffer(handle(), buffer.handle());
    }
    
    /**
     * Sets @completion to be the auxiliary completion object
     * to use with @entry.
     * <p>
     * All further configuration of the completion mechanism is
     * done on @completion using the <code>GtkEntryCompletion</code> API.
     * Completion is disabled if @completion is set to <code>null</code>
     */
    public void setCompletion(EntryCompletion completion) {
        gtk_h.gtk_entry_set_completion(handle(), completion.handle());
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for @entry.
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
     * 
     * This makes it so that GTK will start a drag
     * operation when the user clicks and drags the icon.
     */
    public void setIconDragSource(EntryIconPosition iconPos, org.gtk.gdk.ContentProvider provider, int actions) {
        gtk_h.gtk_entry_set_icon_drag_source(handle(), iconPos.getValue(), provider.handle(), actions);
    }
    
    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     * 
     * If the icon isn&<code>#8217</code> t known, a &<code>#8220</code> broken image&<code>#8221</code>  icon will be
     * displayed instead.
     * 
     * If @icon is <code>null</code>  no icon will be shown in the
     * specified position.
     */
    public void setIconFromGicon(EntryIconPosition iconPos, org.gtk.gio.Icon icon) {
        gtk_h.gtk_entry_set_icon_from_gicon(handle(), iconPos.getValue(), icon.handle());
    }
    
    /**
     * Sets the icon shown in the entry at the specified position
     * from the current icon theme.
     * 
     * If the icon name isn&<code>#8217</code> t known, a &<code>#8220</code> broken image&<code>#8221</code>  icon will be
     * displayed instead.
     * 
     * If @icon_name is <code>null</code>  no icon will be shown in the
     * specified position.
     */
    public void setIconFromIconName(EntryIconPosition iconPos, java.lang.String iconName) {
        gtk_h.gtk_entry_set_icon_from_icon_name(handle(), iconPos.getValue(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the icon shown in the specified position using a <code>GdkPaintable</code>.
     * 
     * If @paintable is <code>null</code>  no icon will be shown in the specified position.
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
     * Sets @tooltip as the contents of the tooltip for the icon at
     * the specified position.
     * 
     * @tooltip is assumed to be marked up with Pango Markup.
     * 
     * Use <code>null</code> for @tooltip to remove an existing tooltip.
     * 
     * See also {@link org.gtk.gtk.Widget<code>#setTooltipMarkup</code>  and
     * {@link org.gtk.gtk.Entry<code>#setIconTooltipText</code> .
     */
    public void setIconTooltipMarkup(EntryIconPosition iconPos, java.lang.String tooltip) {
        gtk_h.gtk_entry_set_icon_tooltip_markup(handle(), iconPos.getValue(), Interop.allocateNativeString(tooltip).handle());
    }
    
    /**
     * Sets @tooltip as the contents of the tooltip for the icon
     * at the specified position.
     * 
     * Use <code>null</code> for @tooltip to remove an existing tooltip.
     * 
     * See also {@link org.gtk.gtk.Widget<code>#setTooltipText</code>  and
     * {@link org.gtk.gtk.Entry<code>#setIconTooltipMarkup</code> .
     * 
     * If you unset the widget tooltip via
     * {@link org.gtk.gtk.Widget<code>#setTooltipText</code>  or
     * {@link org.gtk.gtk.Widget<code>#setTooltipMarkup</code> , this sets
     * {@link [property@Gtk.Widget:has-tooltip] (ref=property)} to <code>false</code>  which suppresses
     * icon tooltips too. You can resolve this by then calling
     * {@link org.gtk.gtk.Widget<code>#setHasTooltip</code>  to set
     * {@link [property@Gtk.Widget:has-tooltip] (ref=property)} back to <code>true</code>  or
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
    public void setInputHints(int hints) {
        gtk_h.gtk_entry_set_input_hints(handle(), hints);
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
     * in &<code>#8220</code> password mode&<code>#8221</code> .
     * 
     * See {@link org.gtk.gtk.Entry<code>#setVisibility</code>  for how to enable
     * &<code>#8220</code> password mode&<code>#8221</code> .
     * 
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
     * This is equivalent to getting @entry&<code>#39</code> s <code>GtkEntryBuffer</code> and
     * calling {@link org.gtk.gtk.EntryBuffer<code>#setMaxLength</code>  on it.
     */
    public void setMaxLength(int max) {
        gtk_h.gtk_entry_set_max_length(handle(), max);
    }
    
    /**
     * Sets whether the text is overwritten when typing in the <code>GtkEntry</code>.
     */
    public void setOverwriteMode(boolean overwrite) {
        gtk_h.gtk_entry_set_overwrite_mode(handle(), overwrite ? 1 : 0);
    }
    
    /**
     * Sets text to be displayed in @entry when it is empty.
     * <p>
     * This can be used to give a visual hint of the expected
     * contents of the <code>GtkEntry</code>.
     */
    public void setPlaceholderText(java.lang.String text) {
        gtk_h.gtk_entry_set_placeholder_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Causes the entry&<code>#8217</code> s progress indicator to &<code>#8220</code> fill in&<code>#8221</code>  the given
     * fraction of the bar.
     * 
     * The fraction should be between 0.0 and 1.0, inclusive.
     */
    public void setProgressFraction(double fraction) {
        gtk_h.gtk_entry_set_progress_fraction(handle(), fraction);
    }
    
    /**
     * Sets the fraction of total entry width to move the progress
     * bouncing block for each pulse.
     * 
     * Use {@link org.gtk.gtk.Entry<code>#progressPulse</code>  to pulse
     * the progress.
     */
    public void setProgressPulseStep(double fraction) {
        gtk_h.gtk_entry_set_progress_pulse_step(handle(), fraction);
    }
    
    /**
     * Sets a <code>PangoTabArray</code>.
     * 
     * The tabstops in the array are applied to the entry text.
     */
    public void setTabs(org.pango.TabArray tabs) {
        gtk_h.gtk_entry_set_tabs(handle(), tabs.handle());
    }
    
    /**
     * Sets whether the contents of the entry are visible or not.
     * 
     * When visibility is set to <code>false</code>  characters are displayed
     * as the invisible char, and will also appear that way when
     * the text in the entry widget is copied elsewhere.
     * 
     * By default, GTK picks the best invisible character available
     * in the current font, but it can be changed with
     * {@link org.gtk.gtk.Entry<code>#setInvisibleChar</code> .
     * 
     * Note that you probably want to set {@link [property@Gtk.Entry:input-purpose] (ref=property)}
     * to {@link org.gtk.gtk.InputPurpose<code>#PASSWORD</code>  or {@link org.gtk.gtk.InputPurpose<code>#PIN</code>  to
     * inform input methods about the purpose of this entry,
     * in addition to setting visibility to <code>false</code>
     */
    public void setVisibility(boolean visible) {
        gtk_h.gtk_entry_set_visibility(handle(), visible ? 1 : 0);
    }
    
    /**
     * Unsets the invisible char, so that the default invisible char
     * is used again. See {@link org.gtk.gtk.Entry<code>#setInvisibleChar</code> .
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
     * 
     * The keybindings for this signal are all forms of the Enter key.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onIconPress(IconPressHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryIconPress", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("icon-press").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onIconRelease(IconReleaseHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryIconRelease", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("icon-release").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
