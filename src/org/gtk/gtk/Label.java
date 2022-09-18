package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkLabel</code> widget displays a small amount of text.
 * <p>
 * As the name implies, most labels are used to label another widget
 * such as a {@link [class@Button]}.
 * <p>
 * !{@link [An example GtkLabel]}(label.png)
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * label
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [selection]}
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [link]}
 * &<code>#9482</code> 
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  {@link [link]}
 * </pre>
 * <p><code>GtkLabel</code> has a single CSS node with the name label. A wide variety
 * of style classes may be applied to labels, such as .title, .subtitle,
 * .dim-label, etc. In the <code>GtkShortcutsWindow</code>, labels are used with the
 * .keycap style class.
 * <p>
 * If the label has a selection, it gets a subnode with name selection.
 * <p>
 * If the label has links, there is one subnode per link. These subnodes
 * carry the link or visited state depending on whether they have been
 * visited. In this case, label node also gets a .link style class.
 * <p>
 * <h1>GtkLabel as GtkBuildable</h1>
 * <p>
 * The GtkLabel implementation of the GtkBuildable interface supports a
 * custom &<code>#60</code> attributes&<code>#62</code>  element, which supports any number of &<code>#60</code> attribute&<code>#62</code> 
 * elements. The &<code>#60</code> attribute&<code>#62</code>  element has attributes named &<code>#8220</code> name&<code>#8220</code> , &<code>#8220</code> value&<code>#8220</code> ,
 * &<code>#8220</code> start&<code>#8220</code>  and &<code>#8220</code> end&<code>#8220</code>  and allows you to specify {@link [struct@Pango.Attribute] (ref=struct)}
 * values for this label.
 * <p>
 * An example of a UI definition fragment specifying Pango attributes:<pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkLabel&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> attributes&<code>#62</code> 
 *     &<code>#60</code> attribute name=&<code>#34</code> weight&<code>#34</code>  value=&<code>#34</code> PANGO_WEIGHT_BOLD&<code>#34</code> /&<code>#62</code> 
 *     &<code>#60</code> attribute name=&<code>#34</code> background&<code>#34</code>  value=&<code>#34</code> red&<code>#34</code>  start=&<code>#34</code> 5&<code>#34</code>  end=&<code>#34</code> 10&<code>#34</code> /&<code>#62</code> 
 *   &<code>#60</code> /attributes&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * The start and end attributes specify the range of characters to which the
 * Pango attribute applies. If start and end are not specified, the attribute is
 * applied to the whole text. Note that specifying ranges does not make much
 * sense with translatable attributes. Use markup embedded in the translatable
 * content instead.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkLabel</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#LABEL</code>  role.
 * <p>
 * <h1>Mnemonics</h1>
 * <p>
 * Labels may contain &<code>#8220</code> mnemonics&<code>#8221</code> . Mnemonics are underlined characters in the
 * label, used for keyboard navigation. Mnemonics are created by providing a
 * string with an underscore before the mnemonic character, such as <code>&<code>#34</code> _File&<code>#34</code> </code>,
 * to the functions {@link [ctor@Gtk.Label.new_with_mnemonic] (ref=ctor)} or
 * {@link org.gtk.gtk.Label<code>#setTextWithMnemonic</code> .
 * <p>
 * Mnemonics automatically activate any activatable widget the label is
 * inside, such as a {@link org.gtk.gtk.Button}; if the label is not inside the
 * mnemonic&<code>#8217</code> s target widget, you have to tell the label about the target
 * using {@link org.gtk.gtk.Label}. Here&<code>#8217</code> s a simple example where
 * the label is inside a button:
 * <p><pre>c
 * // Pressing Alt+H will activate this button
 * GtkWidget *button = gtk_button_new ();
 * GtkWidget *label = gtk_label_new_with_mnemonic (&<code>#34</code> _Hello&<code>#34</code> );
 * gtk_button_set_child (GTK_BUTTON (button), label);
 * </pre>
 * <p>
 * There&<code>#8217</code> s a convenience function to create buttons with a mnemonic label
 * already inside:
 * <p><pre>c
 * // Pressing Alt+H will activate this button
 * GtkWidget *button = gtk_button_new_with_mnemonic (&<code>#34</code> _Hello&<code>#34</code> );
 * </pre>
 * <p>
 * To create a mnemonic for a widget alongside the label, such as a
 * {@link org.gtk.gtk.Entry}, you have to point the label at the entry with
 * {@link org.gtk.gtk.Label<code>#setMnemonicWidget</code> :
 * <p><pre>c
 * // Pressing Alt+H will focus the entry
 * GtkWidget *entry = gtk_entry_new ();
 * GtkWidget *label = gtk_label_new_with_mnemonic (&<code>#34</code> _Hello&<code>#34</code> );
 * gtk_label_set_mnemonic_widget (GTK_LABEL (label), entry);
 * </pre>
 * <p>
 * <h1>Markup (styled text)</h1>
 * <p>
 * To make it easy to format text in a label (changing colors,
 * fonts, etc.), label text can be provided in a simple
 * markup format:
 * <p>
 * Here&<code>#8217</code> s how to create a label with a small font:<pre>c
 * GtkWidget *label = gtk_label_new (NULL);
 * gtk_label_set_markup (GTK_LABEL (label), &<code>#34</code> &<code>#60</code> small&<code>#62</code> Small text&<code>#60</code> /small&<code>#62</code> &<code>#34</code> );
 * </pre>
 * <p>
 * (See the Pango manual for complete documentation] of available
 * tags, {@link Pango<code>#parseMarkup</code> )
 * <p>
 * The markup passed to gtk_label_set_markup() must be valid; for example,
 * literal &<code>#60</code> , &<code>#62</code>  and &<code>#38</code>  characters must be escaped as &<code>#38</code> lt;, &<code>#38</code> gt;, and &<code>#38</code> amp;.
 * If you pass text obtained from the user, file, or a network to
 * {@link org.gtk.gtk.Label<code>#setMarkup</code> , you&<code>#8217</code> ll want to escape it with
 * g_markup_escape_text() or g_markup_printf_escaped().
 * <p>
 * Markup strings are just a convenient way to set the {@link [struct@Pango.AttrList] (ref=struct)}
 * on a label; {@link org.gtk.gtk.Label<code>#setAttributes</code>  may be a simpler way to set
 * attributes in some cases. Be careful though; {@link [struct@Pango.AttrList] (ref=struct)} tends
 * to cause internationalization problems, unless you&<code>#8217</code> re applying attributes
 * to the entire string (i.e. unless you set the range of each attribute
 * to {@link [0, <code>G_MAXINT</code> ). The reason is that specifying the start_index and
 * end_index for a [struct@Pango.Attribute] (ref=0, <code>G_MAXINT</code> ). The reason is that specifying the start_index and
 * end_index for a [struct)} requires knowledge of the exact
 * string being displayed, so translations will cause problems.
 * <p>
 * <h1>Selectable labels</h1>
 * <p>
 * Labels can be made selectable with {@link org.gtk.gtk.Label<code>#setSelectable</code> .
 * Selectable labels allow the user to copy the label contents to
 * the clipboard. Only labels that contain useful-to-copy information
 * &<code>#8212</code>  such as error messages &<code>#8212</code>  should be made selectable.
 * <p>
 * <h1>Text layout</h1>
 * <p>
 * A label can contain any number of paragraphs, but will have
 * performance problems if it contains more than a small number.
 * Paragraphs are separated by newlines or other paragraph separators
 * understood by Pango.
 * <p>
 * Labels can automatically wrap text if you call {@link org.gtk.gtk.Label<code>#setWrap</code> .
 * <p>
 * {@link org.gtk.gtk.Label<code>#setJustify</code>  sets how the lines in a label align
 * with one another. If you want to set how the label as a whole aligns
 * in its available space, see the {@link [property@Gtk.Widget:halign] (ref=property)} and
 * {@link [property@Gtk.Widget:valign] (ref=property)} properties.
 * <p>
 * The {@link [property@Gtk.Label:width-chars] (ref=property)} and {@link [property@Gtk.Label:max-width-chars] (ref=property)}
 * properties can be used to control the size allocation of ellipsized or
 * wrapped labels. For ellipsizing labels, if either is specified (and less
 * than the actual text size), it is used as the minimum width, and the actual
 * text size is used as the natural width of the label. For wrapping labels,
 * width-chars is used as the minimum width, if specified, and max-width-chars
 * is used as the natural width. Even if max-width-chars specified, wrapping
 * labels will be rewrapped to use all of the available width.
 * <p>
 * <h1>Links</h1>
 * <p>
 * GTK supports markup for clickable hyperlinks in addition to regular Pango
 * markup. The markup for links is borrowed from HTML, using the <code>&<code>#60</code> a&<code>#62</code> </code> with
 * &<code>#8220</code> href&<code>#8220</code> , &<code>#8220</code> title&<code>#8220</code>  and &<code>#8220</code> class&<code>#8220</code>  attributes. GTK renders links similar to the
 * way they appear in web browsers, with colored, underlined text. The &<code>#8220</code> title&<code>#8220</code> 
 * attribute is displayed as a tooltip on the link. The &<code>#8220</code> class&<code>#8220</code>  attribute is
 * used as style class on the CSS node for the link.
 * <p>
 * An example looks like this:
 * <p><pre>c
 * const char *text =
 * &<code>#34</code> Go to the&<code>#34</code> 
 * &<code>#34</code> &<code>#60</code> a href=\\&<code>#34</code> http://www.gtk.org title=\\&<code>#34</code> &<code>#38</code> lt;i&<code>#38</code> gt;Our&<code>#38</code> lt;/i&<code>#38</code> gt; website\\&<code>#34</code> &<code>#62</code> &<code>#34</code> 
 * &<code>#34</code> GTK website&<code>#60</code> /a&<code>#62</code>  for more...&<code>#34</code> ;
 * GtkWidget *label = gtk_label_new (NULL);
 * gtk_label_set_markup (GTK_LABEL (label), text);
 * </pre>
 * 
 * It is possible to implement custom handling for links and their tooltips
 * with the {@link [signal@Gtk.Label::activate-link] (ref=signal)} signal and the
 * {@link org.gtk.gtk.Label<code>#getCurrentUri</code>  function.
 */
public class Label extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Label(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Label */
    public static Label castFrom(org.gtk.gobject.Object gobject) {
        return new Label(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String str) {
        Reference RESULT = References.get(gtk_h.gtk_label_new(Interop.allocateNativeString(str).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new label with the given text inside it.
     * 
     * You can pass <code>null</code> to get an empty label widget.
     */
    public Label(java.lang.String str) {
        super(constructNew(str));
    }
    
    private static Reference constructNewWithMnemonic(java.lang.String str) {
        Reference RESULT = References.get(gtk_h.gtk_label_new_with_mnemonic(Interop.allocateNativeString(str).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkLabel</code>, containing the text in @str.
     * <p>
     * If characters in @str are preceded by an underscore, they are
     * underlined. If you need a literal underscore character in a label, use
     * &<code>#39</code> __&<code>#39</code>  (two underscores). The first underlined character represents a
     * keyboard accelerator called a mnemonic. The mnemonic key can be used
     * to activate another widget, chosen automatically, or explicitly using
     * {@link org.gtk.gtk.Label<code>#setMnemonicWidget</code> .
     * <p>
     * If {@link org.gtk.gtk.Label<code>#setMnemonicWidget</code>  is not called, then the first
     * activatable ancestor of the <code>GtkLabel</code> will be chosen as the mnemonic
     * widget. For instance, if the label is inside a button or menu item,
     * the button or menu item will automatically become the mnemonic widget
     * and be activated by the mnemonic.
     */
    public static Label newWithMnemonic(java.lang.String str) {
        return new Label(constructNewWithMnemonic(str));
    }
    
    /**
     * Gets the labels attribute list.
     * <p>
     * This is the {@link [struct@Pango.AttrList] (ref=struct)} that was set on the label using
     * {@link org.gtk.gtk.Label<code>#setAttributes</code> , if any. This function does not
     * reflect attributes that come from the labels markup (see
     * {@link org.gtk.gtk.Label<code>#setMarkup</code> ). If you want to get the effective
     * attributes for the label, use<code>pango_layout_get_attribute (gtk_label_get_layout (self))</code>.
     */
    public org.pango.AttrList getAttributes() {
        var RESULT = gtk_h.gtk_label_get_attributes(handle());
        return new org.pango.AttrList(References.get(RESULT, false));
    }
    
    /**
     * Returns the URI for the currently active link in the label.
     * 
     * The active link is the one under the mouse pointer or, in a
     * selectable label, the link in which the text cursor is currently
     * positioned.
     * 
     * This function is intended for use in a {@link [signal@Gtk.Label::activate-link] (ref=signal)}
     * handler or for use in a {@link [signal@Gtk.Widget::query-tooltip] (ref=signal)} handler.
     */
    public java.lang.String getCurrentUri() {
        var RESULT = gtk_h.gtk_label_get_current_uri(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the ellipsizing position of the label.
     * 
     * See {@link org.gtk.gtk.Label<code>#setEllipsize</code> .
     */
    public org.pango.EllipsizeMode getEllipsize() {
        var RESULT = gtk_h.gtk_label_get_ellipsize(handle());
        return org.pango.EllipsizeMode.fromValue(RESULT);
    }
    
    /**
     * Gets the extra menu model of @label.
     * 
     * See {@link org.gtk.gtk.Label<code>#setExtraMenu</code> .
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        var RESULT = gtk_h.gtk_label_get_extra_menu(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Returns the justification of the label.
     * 
     * See {@link org.gtk.gtk.Label<code>#setJustify</code> .
     */
    public Justification getJustify() {
        var RESULT = gtk_h.gtk_label_get_justify(handle());
        return Justification.fromValue(RESULT);
    }
    
    /**
     * Fetches the text from a label.
     * 
     * The returned text includes any embedded underlines indicating
     * mnemonics and Pango markup. (See {@link org.gtk.gtk.Label<code>#getText</code> ).
     */
    public java.lang.String getLabel() {
        var RESULT = gtk_h.gtk_label_get_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the <code>PangoLayout</code> used to display the label.
     * 
     * The layout is useful to e.g. convert text positions to pixel
     * positions, in combination with {@link org.gtk.gtk.Label<code>#getLayoutOffsets</code> .
     * The returned layout is owned by the @label so need not be
     * freed by the caller. The @label is free to recreate its layout
     * at any time, so it should be considered read-only.
     */
    public org.pango.Layout getLayout() {
        var RESULT = gtk_h.gtk_label_get_layout(handle());
        return new org.pango.Layout(References.get(RESULT, false));
    }
    
    /**
     * Gets the number of lines to which an ellipsized, wrapping
     * label should be limited.
     * 
     * See {@link org.gtk.gtk.Label<code>#setLines</code> .
     */
    public int getLines() {
        var RESULT = gtk_h.gtk_label_get_lines(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the desired maximum width of @label, in characters.
     * 
     * See {@link org.gtk.gtk.Label<code>#setWidthChars</code> .
     */
    public int getMaxWidthChars() {
        var RESULT = gtk_h.gtk_label_get_max_width_chars(handle());
        return RESULT;
    }
    
    /**
     * Return the mnemonic accelerator.
     * <p>
     * If the label has been set so that it has a mnemonic key this function
     * returns the keyval used for the mnemonic accelerator. If there is no
     * mnemonic set up it returns <code>GDK_KEY_VoidSymbol</code>.
     */
    public int getMnemonicKeyval() {
        var RESULT = gtk_h.gtk_label_get_mnemonic_keyval(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the target of the mnemonic (keyboard shortcut) of this
     * label.
     * 
     * See {@link org.gtk.gtk.Label<code>#setMnemonicWidget</code> .
     */
    public Widget getMnemonicWidget() {
        var RESULT = gtk_h.gtk_label_get_mnemonic_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns line wrap mode used by the label.
     * 
     * See {@link org.gtk.gtk.Label<code>#setNaturalWrapMode</code> .
     */
    public NaturalWrapMode getNaturalWrapMode() {
        var RESULT = gtk_h.gtk_label_get_natural_wrap_mode(handle());
        return NaturalWrapMode.fromValue(RESULT);
    }
    
    /**
     * Returns whether the label is selectable.
     */
    public boolean getSelectable() {
        var RESULT = gtk_h.gtk_label_get_selectable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the label is in single line mode.
     */
    public boolean getSingleLineMode() {
        var RESULT = gtk_h.gtk_label_get_single_line_mode(handle());
        return (RESULT != 0);
    }
    
    /**
     * Fetches the text from a label.
     * 
     * The returned text is as it appears on screen. This does not include
     * any embedded underlines indicating mnemonics or Pango markup. (See
     * {@link org.gtk.gtk.Label<code>#getLabel</code> )
     */
    public java.lang.String getText() {
        var RESULT = gtk_h.gtk_label_get_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the label&<code>#8217</code> s text is interpreted as Pango markup.
     * 
     * See {@link org.gtk.gtk.Label<code>#setUseMarkup</code> .
     */
    public boolean getUseMarkup() {
        var RESULT = gtk_h.gtk_label_get_use_markup(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether an embedded underlines in the label indicate mnemonics.
     * 
     * See {@link org.gtk.gtk.Label<code>#setUseUnderline</code> .
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.gtk_label_get_use_underline(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the desired width of @label, in characters.
     * 
     * See {@link org.gtk.gtk.Label<code>#setWidthChars</code> .
     */
    public int getWidthChars() {
        var RESULT = gtk_h.gtk_label_get_width_chars(handle());
        return RESULT;
    }
    
    /**
     * Returns whether lines in the label are automatically wrapped.
     * 
     * See {@link org.gtk.gtk.Label<code>#setWrap</code> .
     */
    public boolean getWrap() {
        var RESULT = gtk_h.gtk_label_get_wrap(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns line wrap mode used by the label.
     * 
     * See {@link org.gtk.gtk.Label<code>#setWrapMode</code> .
     */
    public org.pango.WrapMode getWrapMode() {
        var RESULT = gtk_h.gtk_label_get_wrap_mode(handle());
        return org.pango.WrapMode.fromValue(RESULT);
    }
    
    /**
     * Gets the <code>xalign</code> of the label.
     * 
     * See the {@link [property@Gtk.Label:xalign] (ref=property)} property.
     */
    public float getXalign() {
        var RESULT = gtk_h.gtk_label_get_xalign(handle());
        return RESULT;
    }
    
    /**
     * Gets the <code>yalign</code> of the label.
     * 
     * See the {@link [property@Gtk.Label:yalign] (ref=property)} property.
     */
    public float getYalign() {
        var RESULT = gtk_h.gtk_label_get_yalign(handle());
        return RESULT;
    }
    
    /**
     * Selects a range of characters in the label, if the label is selectable.
     * 
     * See {@link org.gtk.gtk.Label<code>#setSelectable</code> . If the label is not selectable,
     * this function has no effect. If @start_offset or
     * @end_offset are -1, then the end of the label will be substituted.
     */
    public void selectRegion(int startOffset, int endOffset) {
        gtk_h.gtk_label_select_region(handle(), startOffset, endOffset);
    }
    
    /**
     * Apply attributes to the label text.
     * 
     * The attributes set with this function will be applied and merged with
     * any other attributes previously effected by way of the
     * {@link [property@Gtk.Label:use-underline] (ref=property)} or {@link [property@Gtk.Label:use-markup] (ref=property)}
     * properties. While it is not recommended to mix markup strings with
     * manually set attributes, if you must; know that the attributes will
     * be applied to the label after the markup string is parsed.
     */
    public void setAttributes(org.pango.AttrList attrs) {
        gtk_h.gtk_label_set_attributes(handle(), attrs.handle());
    }
    
    /**
     * Sets the mode used to ellipsizei the text.
     * 
     * The text will be ellipsized if there is not enough space
     * to render the entire string.
     */
    public void setEllipsize(org.pango.EllipsizeMode mode) {
        gtk_h.gtk_label_set_ellipsize(handle(), mode.getValue());
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for @label.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        gtk_h.gtk_label_set_extra_menu(handle(), model.handle());
    }
    
    /**
     * Sets the alignment of the lines in the text of the label relative to
     * each other.
     * 
     * {@link org.gtk.gtk.Justification<code>#LEFT</code>  is the default value when the widget is first created
     * with {@link [ctor@Gtk.Label.new] (ref=ctor)}. If you instead want to set the alignment of
     * the label as a whole, use {@link org.gtk.gtk.Widget<code>#setHalign</code>  instead.
     * {@link org.gtk.gtk.Label<code>#setJustify</code>  has no effect on labels containing
     * only a single line.
     */
    public void setJustify(Justification jtype) {
        gtk_h.gtk_label_set_justify(handle(), jtype.getValue());
    }
    
    /**
     * Sets the text of the label.
     * 
     * The label is interpreted as including embedded underlines and/or Pango
     * markup depending on the values of the {@link [property@Gtk.Label:use-underline] (ref=property)}
     * and {@link [property@Gtk.Label:use-markup] (ref=property)} properties.
     */
    public void setLabel(java.lang.String str) {
        gtk_h.gtk_label_set_label(handle(), Interop.allocateNativeString(str).handle());
    }
    
    /**
     * Sets the number of lines to which an ellipsized, wrapping label
     * should be limited.
     * 
     * This has no effect if the label is not wrapping or ellipsized.
     * Set this to -1 if you don&<code>#8217</code> t want to limit the number of lines.
     */
    public void setLines(int lines) {
        gtk_h.gtk_label_set_lines(handle(), lines);
    }
    
    /**
     * Sets the labels text and attributes from markup.
     * <p>
     * The string must be marked up with Pango markup
     * (see {@link Pango<code>#parseMarkup</code> ).
     * <p>
     * If the @str is external data, you may need to escape it
     * with g_markup_escape_text() or g_markup_printf_escaped():
     * <p><pre>c
     * GtkWidget *self = gtk_label_new (NULL);
     * const char *str = &<code>#34</code> ...&<code>#34</code> ;
     * const char *format = &<code>#34</code> &<code>#60</code> span style=\\&<code>#34</code> italic\\&<code>#34</code> &<code>#62</code> \\<code>s</code> <code>#60</code> /span&<code>#62</code> &<code>#34</code> ;
     * char *markup;
     * 
     * markup = g_markup_printf_escaped (format, str);
     * gtk_label_set_markup (GTK_LABEL (self), markup);
     * g_free (markup);
     * </pre>
     * 
     * This function will set the {@link [property@Gtk.Label:use-markup] (ref=property)} property
     * to <code>true</code> as a side effect.
     * 
     * If you set the label contents using the {@link [property@Gtk.Label:label] (ref=property)}
     * property you should also ensure that you set the
     * {@link [property@Gtk.Label:use-markup] (ref=property)} property accordingly.
     * 
     * See also: {@link org.gtk.gtk.Label<code>#setText</code>
     */
    public void setMarkup(java.lang.String str) {
        gtk_h.gtk_label_set_markup(handle(), Interop.allocateNativeString(str).handle());
    }
    
    /**
     * Sets the labels text, attributes and mnemonic from markup.
     * 
     * Parses @str which is marked up with Pango markup (see {@link Pango<code>#parseMarkup</code> ),
     * setting the label&<code>#8217</code> s text and attribute list based on the parse results.
     * If characters in @str are preceded by an underscore, they are underlined
     * indicating that they represent a keyboard accelerator called a mnemonic.
     * 
     * The mnemonic key can be used to activate another widget, chosen
     * automatically, or explicitly using {@link org.gtk.gtk.Label<code>#setMnemonicWidget</code> .
     */
    public void setMarkupWithMnemonic(java.lang.String str) {
        gtk_h.gtk_label_set_markup_with_mnemonic(handle(), Interop.allocateNativeString(str).handle());
    }
    
    /**
     * Sets the desired maximum width in characters of @label to @n_chars.
     */
    public void setMaxWidthChars(int nChars) {
        gtk_h.gtk_label_set_max_width_chars(handle(), nChars);
    }
    
    /**
     * Associate the label with its mnemonic target.
     * 
     * If the label has been set so that it has a mnemonic key (using
     * i.e. {@link org.gtk.gtk.Label<code>#setMarkupWithMnemonic</code> ,
     * {@link org.gtk.gtk.Label<code>#setTextWithMnemonic</code> ,
     * {@link [ctor@Gtk.Label.new_with_mnemonic] (ref=ctor)}
     * or the {@link [property@Gtk.Label:use_underline] (ref=property)} property) the label can be
     * associated with a widget that is the target of the mnemonic. When the
     * label is inside a widget (like a {@link org.gtk.gtk.Button} or a
     * {@link org.gtk.gtk.Notebook} tab) it is automatically associated with the correct
     * widget, but sometimes (i.e. when the target is a {@link org.gtk.gtk.Entry} next to
     * the label) you need to set it explicitly using this function.
     * 
     * The target widget will be accelerated by emitting the
     * {@link [signal@GtkWidget::mnemonic-activate] (ref=signal)} signal on it. The default handler for
     * this signal will activate the widget if there are no mnemonic collisions
     * and toggle focus between the colliding widgets otherwise.
     */
    public void setMnemonicWidget(Widget widget) {
        gtk_h.gtk_label_set_mnemonic_widget(handle(), widget.handle());
    }
    
    /**
     * Select the line wrapping for the natural size request.
     * 
     * This only affects the natural size requested, for the actual wrapping used,
     * see the {@link [property@Gtk.Label:wrap-mode] (ref=property)} property.
     */
    public void setNaturalWrapMode(NaturalWrapMode wrapMode) {
        gtk_h.gtk_label_set_natural_wrap_mode(handle(), wrapMode.getValue());
    }
    
    /**
     * Makes text in the label selectable.
     * 
     * Selectable labels allow the user to select text from the label,
     * for copy-and-paste.
     */
    public void setSelectable(boolean setting) {
        gtk_h.gtk_label_set_selectable(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the label is in single line mode.
     */
    public void setSingleLineMode(boolean singleLineMode) {
        gtk_h.gtk_label_set_single_line_mode(handle(), singleLineMode ? 1 : 0);
    }
    
    /**
     * Sets the text within the <code>GtkLabel</code> widget.
     * 
     * It overwrites any text that was there before.
     * 
     * This function will clear any previously set mnemonic accelerators,
     * and set the {@link [property@Gtk.Label:use-underline property] (ref=property)} to <code>false</code> as
     * a side effect.
     * 
     * This function will set the {@link [property@Gtk.Label:use-markup] (ref=property)} property
     * to <code>false</code> as a side effect.
     * 
     * See also: {@link org.gtk.gtk.Label<code>#setMarkup</code>
     */
    public void setText(java.lang.String str) {
        gtk_h.gtk_label_set_text(handle(), Interop.allocateNativeString(str).handle());
    }
    
    /**
     * Sets the label&<code>#8217</code> s text from the string @str.
     * 
     * If characters in @str are preceded by an underscore, they are underlined
     * indicating that they represent a keyboard accelerator called a mnemonic.
     * The mnemonic key can be used to activate another widget, chosen
     * automatically, or explicitly using {@link org.gtk.gtk.Label<code>#setMnemonicWidget</code> .
     */
    public void setTextWithMnemonic(java.lang.String str) {
        gtk_h.gtk_label_set_text_with_mnemonic(handle(), Interop.allocateNativeString(str).handle());
    }
    
    /**
     * Sets whether the text of the label contains markup.
     * 
     * See {@link org.gtk.gtk.Label<code>#setMarkup</code> .
     */
    public void setUseMarkup(boolean setting) {
        gtk_h.gtk_label_set_use_markup(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether underlines in the text indicate mnemonics.
     */
    public void setUseUnderline(boolean setting) {
        gtk_h.gtk_label_set_use_underline(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the desired width in characters of @label to @n_chars.
     */
    public void setWidthChars(int nChars) {
        gtk_h.gtk_label_set_width_chars(handle(), nChars);
    }
    
    /**
     * Toggles line wrapping within the <code>GtkLabel</code> widget.
     * 
     * <code>true</code> makes it break lines if text exceeds the widget&<code>#8217</code> s size.
     * <code>false</code> lets the text get cut off by the edge of the widget if
     * it exceeds the widget size.
     * 
     * Note that setting line wrapping to <code>true</code> does not make the label
     * wrap at its parent container&<code>#8217</code> s width, because GTK widgets
     * conceptually can&<code>#8217</code> t make their requisition depend on the parent
     * container&<code>#8217</code> s size. For a label that wraps at a specific position,
     * set the label&<code>#8217</code> s width using {@link org.gtk.gtk.Widget<code>#setSizeRequest</code> .
     */
    public void setWrap(boolean wrap) {
        gtk_h.gtk_label_set_wrap(handle(), wrap ? 1 : 0);
    }
    
    /**
     * Controls how line wrapping is done.
     * 
     * This only affects the label if line wrapping is on. (See
     * {@link org.gtk.gtk.Label<code>#setWrap</code> ) The default is {@link org.pango.WrapMode<code>#WORD</code>  which means wrap on word boundaries.
     * 
     * For sizing behavior, also consider the {@link [property@Gtk.Label:natural-wrap-mode] (ref=property)}
     * property.
     */
    public void setWrapMode(org.pango.WrapMode wrapMode) {
        gtk_h.gtk_label_set_wrap_mode(handle(), wrapMode.getValue());
    }
    
    /**
     * Sets the <code>xalign</code> of the label.
     * 
     * See the {@link [property@Gtk.Label:xalign] (ref=property)} property.
     */
    public void setXalign(float xalign) {
        gtk_h.gtk_label_set_xalign(handle(), xalign);
    }
    
    /**
     * Sets the <code>yalign</code> of the label.
     * 
     * See the {@link [property@Gtk.Label:yalign] (ref=property)} property.
     */
    public void setYalign(float yalign) {
        gtk_h.gtk_label_set_yalign(handle(), yalign);
    }
    
    @FunctionalInterface
    public interface ActivateCurrentLinkHandler {
        void signalReceived(Label source);
    }
    
    /**
     * Gets emitted when the user activates a link in the label.
     * 
     * The ::activate-current-link is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * Applications may also emit the signal with g_signal_emit_by_name()
     * if they need to control activation of URIs programmatically.
     * 
     * The default bindings for this signal are all forms of the Enter key.
     */
    public SignalHandle onActivateCurrentLink(ActivateCurrentLinkHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalLabelActivateCurrentLink", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate-current-link").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ActivateLinkHandler {
        boolean signalReceived(Label source, java.lang.String uri);
    }
    
    /**
     * Gets emitted to activate a URI.
     * 
     * Applications may connect to it to override the default behaviour,
     * which is to call gtk_show_uri().
     */
    public SignalHandle onActivateLink(ActivateLinkHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalLabelActivateLink", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate-link").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CopyClipboardHandler {
        void signalReceived(Label source);
    }
    
    /**
     * Gets emitted to copy the slection to the clipboard.
     * 
     * The ::copy-clipboard signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding for this signal is Ctrl-c.
     */
    public SignalHandle onCopyClipboard(CopyClipboardHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalLabelCopyClipboard", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("copy-clipboard").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        void signalReceived(Label source, MovementStep step, int count, boolean extendSelection);
    }
    
    /**
     * Gets emitted when the user initiates a cursor movement.
     * 
     * The ::move-cursor signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * If the cursor is not visible in @entry, this signal causes the viewport to
     * be moved instead.
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * 
     * The default bindings for this signal come in two variants,
     * the variant with the Shift modifier extends the selection,
     * the variant without the Shift modifier does not.
     * There are too many key combinations to list them all here.
     * - Arrow keys move by individual characters/lines
     * - Ctrl-arrow key combinations move by words/paragraphs
     * - Home/End keys move to the ends of the buffer
     */
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalLabelMoveCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
