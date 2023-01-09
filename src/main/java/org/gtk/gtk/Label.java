package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkLabel} widget displays a small amount of text.
 * <p>
 * As the name implies, most labels are used to label another widget
 * such as a {@link Button}.
 * <p>
 * <img src="./doc-files/label.png" alt="An example GtkLabel">
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * label
 * ├── [selection]
 * ├── [link]
 * ┊
 * ╰── [link]
 * }</pre>
 * <p>
 * {@code GtkLabel} has a single CSS node with the name label. A wide variety
 * of style classes may be applied to labels, such as .title, .subtitle,
 * .dim-label, etc. In the {@code GtkShortcutsWindow}, labels are used with the
 * .keycap style class.
 * <p>
 * If the label has a selection, it gets a subnode with name selection.
 * <p>
 * If the label has links, there is one subnode per link. These subnodes
 * carry the link or visited state depending on whether they have been
 * visited. In this case, label node also gets a .link style class.
 * <p>
 * <strong>GtkLabel as GtkBuildable</strong><br/>
 * The GtkLabel implementation of the GtkBuildable interface supports a
 * custom &lt;attributes&gt; element, which supports any number of &lt;attribute&gt;
 * elements. The &lt;attribute&gt; element has attributes named “name“, “value“,
 * “start“ and “end“ and allows you to specify {@code Pango.Attribute}
 * values for this label.
 * <p>
 * An example of a UI definition fragment specifying Pango attributes:
 * <pre>{@code xml
 * <object class="GtkLabel">
 *   <attributes>
 *     <attribute name="weight" value="PANGO_WEIGHT_BOLD"/>
 *     <attribute name="background" value="red" start="5" end="10"/>
 *   </attributes>
 * </object>
 * }</pre>
 * <p>
 * The start and end attributes specify the range of characters to which the
 * Pango attribute applies. If start and end are not specified, the attribute is
 * applied to the whole text. Note that specifying ranges does not make much
 * sense with translatable attributes. Use markup embedded in the translatable
 * content instead.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkLabel} uses the {@link AccessibleRole#LABEL} role.
 * <p>
 * <strong>Mnemonics</strong><br/>
 * Labels may contain “mnemonics”. Mnemonics are underlined characters in the
 * label, used for keyboard navigation. Mnemonics are created by providing a
 * string with an underscore before the mnemonic character, such as {@code "_File"},
 * to the functions {@link Label#newWithMnemonic} or
 * {@link Label#setTextWithMnemonic}.
 * <p>
 * Mnemonics automatically activate any activatable widget the label is
 * inside, such as a {@link Button}; if the label is not inside the
 * mnemonic’s target widget, you have to tell the label about the target
 * using {@link Label}. Here’s a simple example where
 * the label is inside a button:
 * <pre>{@code c
 * // Pressing Alt+H will activate this button
 * GtkWidget *button = gtk_button_new ();
 * GtkWidget *label = gtk_label_new_with_mnemonic ("_Hello");
 * gtk_button_set_child (GTK_BUTTON (button), label);
 * }</pre>
 * <p>
 * There’s a convenience function to create buttons with a mnemonic label
 * already inside:
 * <pre>{@code c
 * // Pressing Alt+H will activate this button
 * GtkWidget *button = gtk_button_new_with_mnemonic ("_Hello");
 * }</pre>
 * <p>
 * To create a mnemonic for a widget alongside the label, such as a
 * {@link Entry}, you have to point the label at the entry with
 * {@link Label#setMnemonicWidget}:
 * <pre>{@code c
 * // Pressing Alt+H will focus the entry
 * GtkWidget *entry = gtk_entry_new ();
 * GtkWidget *label = gtk_label_new_with_mnemonic ("_Hello");
 * gtk_label_set_mnemonic_widget (GTK_LABEL (label), entry);
 * }</pre>
 * <p>
 * <strong>Markup (styled text)</strong><br/>
 * To make it easy to format text in a label (changing colors,
 * fonts, etc.), label text can be provided in a simple
 * markup format:
 * <p>
 * Here’s how to create a label with a small font:
 * <pre>{@code c
 * GtkWidget *label = gtk_label_new (NULL);
 * gtk_label_set_markup (GTK_LABEL (label), "<small>Small text</small>");
 * }</pre>
 * <p>
 * (See the Pango manual for complete documentation] of available
 * tags, {@link org.pango.Pango#parseMarkup})
 * <p>
 * The markup passed to gtk_label_set_markup() must be valid; for example,
 * literal &lt;, &gt; and &amp; characters must be escaped as &amp;lt;, &amp;gt;, and &amp;amp;.
 * If you pass text obtained from the user, file, or a network to
 * {@link Label#setMarkup}, you’ll want to escape it with
 * g_markup_escape_text() or g_markup_printf_escaped().
 * <p>
 * Markup strings are just a convenient way to set the {@code Pango.AttrList}
 * on a label; {@link Label#setAttributes} may be a simpler way to set
 * attributes in some cases. Be careful though; {@code Pango.AttrList} tends
 * to cause internationalization problems, unless you’re applying attributes
 * to the entire string (i.e. unless you set the range of each attribute
 * to [0, {@code G_MAXINT})). The reason is that specifying the start_index and
 * end_index for a {@code Pango.Attribute} requires knowledge of the exact
 * string being displayed, so translations will cause problems.
 * <p>
 * <strong>Selectable labels</strong><br/>
 * Labels can be made selectable with {@link Label#setSelectable}.
 * Selectable labels allow the user to copy the label contents to
 * the clipboard. Only labels that contain useful-to-copy information
 * — such as error messages — should be made selectable.
 * <p>
 * <strong>Text layout</strong><br/>
 * A label can contain any number of paragraphs, but will have
 * performance problems if it contains more than a small number.
 * Paragraphs are separated by newlines or other paragraph separators
 * understood by Pango.
 * <p>
 * Labels can automatically wrap text if you call {@link Label#setWrap}.
 * <p>
 * {@link Label#setJustify} sets how the lines in a label align
 * with one another. If you want to set how the label as a whole aligns
 * in its available space, see the {@code Gtk.Widget:halign} and
 * {@code Gtk.Widget:valign} properties.
 * <p>
 * The {@code Gtk.Label:width-chars} and {@code Gtk.Label:max-width-chars}
 * properties can be used to control the size allocation of ellipsized or
 * wrapped labels. For ellipsizing labels, if either is specified (and less
 * than the actual text size), it is used as the minimum width, and the actual
 * text size is used as the natural width of the label. For wrapping labels,
 * width-chars is used as the minimum width, if specified, and max-width-chars
 * is used as the natural width. Even if max-width-chars specified, wrapping
 * labels will be rewrapped to use all of the available width.
 * <p>
 * <strong>Links</strong><br/>
 * GTK supports markup for clickable hyperlinks in addition to regular Pango
 * markup. The markup for links is borrowed from HTML, using the {@code <a>} with
 * “href“, “title“ and “class“ attributes. GTK renders links similar to the
 * way they appear in web browsers, with colored, underlined text. The “title“
 * attribute is displayed as a tooltip on the link. The “class“ attribute is
 * used as style class on the CSS node for the link.
 * <p>
 * An example looks like this:
 * <pre>{@code c
 * const char *text =
 * "Go to the"
 * "<a href=\\"http://www.gtk.org title=\\"&lt;i&gt;Our&lt;/i&gt; website\\">"
 * "GTK website</a> for more...";
 * GtkWidget *label = gtk_label_new (NULL);
 * gtk_label_set_markup (GTK_LABEL (label), text);
 * }</pre>
 * <p>
 * It is possible to implement custom handling for links and their tooltips
 * with the {@code Gtk.Label::activate-link} signal and the
 * {@link Label#getCurrentUri} function.
 */
public class Label extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkLabel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Label proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Label(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Label> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Label(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_label_new.invokeExact((Addressable) (str == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(str, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new label with the given text inside it.
     * <p>
     * You can pass {@code null} to get an empty label widget.
     * @param str The text of the label
     */
    public Label(@Nullable java.lang.String str) {
        super(constructNew(str));
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithMnemonic(@Nullable java.lang.String str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_label_new_with_mnemonic.invokeExact((Addressable) (str == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(str, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkLabel}, containing the text in {@code str}.
     * <p>
     * If characters in {@code str} are preceded by an underscore, they are
     * underlined. If you need a literal underscore character in a label, use
     * '__' (two underscores). The first underlined character represents a
     * keyboard accelerator called a mnemonic. The mnemonic key can be used
     * to activate another widget, chosen automatically, or explicitly using
     * {@link Label#setMnemonicWidget}.
     * <p>
     * If {@link Label#setMnemonicWidget} is not called, then the first
     * activatable ancestor of the {@code GtkLabel} will be chosen as the mnemonic
     * widget. For instance, if the label is inside a button or menu item,
     * the button or menu item will automatically become the mnemonic widget
     * and be activated by the mnemonic.
     * @param str The text of the label, with an underscore in front of the
     *   mnemonic character
     * @return the new {@code GtkLabel}
     */
    public static Label newWithMnemonic(@Nullable java.lang.String str) {
        var RESULT = constructNewWithMnemonic(str);
        var OBJECT = (org.gtk.gtk.Label) Interop.register(RESULT, org.gtk.gtk.Label.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the labels attribute list.
     * <p>
     * This is the {@code Pango.AttrList} that was set on the label using
     * {@link Label#setAttributes}, if any. This function does not
     * reflect attributes that come from the labels markup (see
     * {@link Label#setMarkup}). If you want to get the effective
     * attributes for the label, use
     * {@code pango_layout_get_attribute (gtk_label_get_layout (self))}.
     * @return the attribute list
     */
    public @Nullable org.pango.AttrList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_attributes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.AttrList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the URI for the currently active link in the label.
     * <p>
     * The active link is the one under the mouse pointer or, in a
     * selectable label, the link in which the text cursor is currently
     * positioned.
     * <p>
     * This function is intended for use in a {@code Gtk.Label::activate-link}
     * handler or for use in a {@code Gtk.Widget::query-tooltip} handler.
     * @return the currently active URI
     */
    public @Nullable java.lang.String getCurrentUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_current_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the ellipsizing position of the label.
     * <p>
     * See {@link Label#setEllipsize}.
     * @return {@code PangoEllipsizeMode}
     */
    public org.pango.EllipsizeMode getEllipsize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_ellipsize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.EllipsizeMode.of(RESULT);
    }
    
    /**
     * Gets the extra menu model of {@code label}.
     * <p>
     * See {@link Label#setExtraMenu}.
     * @return the menu model
     */
    public @Nullable org.gtk.gio.MenuModel getExtraMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_extra_menu.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.MenuModel) Interop.register(RESULT, org.gtk.gio.MenuModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the justification of the label.
     * <p>
     * See {@link Label#setJustify}.
     * @return {@code GtkJustification}
     */
    public org.gtk.gtk.Justification getJustify() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_justify.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Justification.of(RESULT);
    }
    
    /**
     * Fetches the text from a label.
     * <p>
     * The returned text includes any embedded underlines indicating
     * mnemonics and Pango markup. (See {@link Label#getText}).
     * @return the text of the label widget. This string is
     *   owned by the widget and must not be modified or freed.
     */
    public java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the {@code PangoLayout} used to display the label.
     * <p>
     * The layout is useful to e.g. convert text positions to pixel
     * positions, in combination with {@link Label#getLayoutOffsets}.
     * The returned layout is owned by the {@code label} so need not be
     * freed by the caller. The {@code label} is free to recreate its layout
     * at any time, so it should be considered read-only.
     * @return the {@link org.pango.Layout} for this label
     */
    public org.pango.Layout getLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Layout) Interop.register(RESULT, org.pango.Layout.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Obtains the coordinates where the label will draw its {@code PangoLayout}.
     * <p>
     * The coordinates are useful to convert mouse events into coordinates
     * inside the {@link org.pango.Layout}, e.g. to take some action if some part
     * of the label is clicked. Remember when using the {@link org.pango.Layout}
     * functions you need to convert to and from pixels using PANGO_PIXELS()
     * or {@code Pango.SCALE}.
     * @param x location to store X offset of layout
     * @param y location to store Y offset of layout
     */
    public void getLayoutOffsets(Out<Integer> x, Out<Integer> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_label_get_layout_offsets.invokeExact(
                        handle(),
                        (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                        (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Gets the number of lines to which an ellipsized, wrapping
     * label should be limited.
     * <p>
     * See {@link Label#setLines}.
     * @return The number of lines
     */
    public int getLines() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_lines.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the desired maximum width of {@code label}, in characters.
     * <p>
     * See {@link Label#setWidthChars}.
     * @return the maximum width of the label in characters.
     */
    public int getMaxWidthChars() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_max_width_chars.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Return the mnemonic accelerator.
     * <p>
     * If the label has been set so that it has a mnemonic key this function
     * returns the keyval used for the mnemonic accelerator. If there is no
     * mnemonic set up it returns {@code GDK_KEY_VoidSymbol}.
     * @return GDK keyval usable for accelerators, or {@code GDK_KEY_VoidSymbol}
     */
    public int getMnemonicKeyval() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_mnemonic_keyval.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the target of the mnemonic (keyboard shortcut) of this
     * label.
     * <p>
     * See {@link Label#setMnemonicWidget}.
     * @return the target of the label’s mnemonic,
     *   or {@code null} if none has been set and the default algorithm will be used.
     */
    public @Nullable org.gtk.gtk.Widget getMnemonicWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_mnemonic_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns line wrap mode used by the label.
     * <p>
     * See {@link Label#setNaturalWrapMode}.
     * @return the natural line wrap mode
     */
    public org.gtk.gtk.NaturalWrapMode getNaturalWrapMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_natural_wrap_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.NaturalWrapMode.of(RESULT);
    }
    
    /**
     * Returns whether the label is selectable.
     * @return {@code true} if the user can copy text from the label
     */
    public boolean getSelectable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_selectable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the selected range of characters in the label.
     * @param start return location for start of selection, as a character offset
     * @param end return location for end of selection, as a character offset
     * @return {@code true} if selection is non-empty
     */
    public boolean getSelectionBounds(Out<Integer> start, Out<Integer> end) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment startPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment endPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_label_get_selection_bounds.invokeExact(
                        handle(),
                        (Addressable) (start == null ? MemoryAddress.NULL : (Addressable) startPOINTER.address()),
                        (Addressable) (end == null ? MemoryAddress.NULL : (Addressable) endPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (start != null) start.set(startPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (end != null) end.set(endPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Returns whether the label is in single line mode.
     * @return {@code true} when the label is in single line mode.
     */
    public boolean getSingleLineMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_single_line_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the tabs for {@code self}.
     * <p>
     * The returned array will be {@code null} if “standard” (8-space) tabs are used.
     * Free the return value with {@link org.pango.TabArray#free}.
     * @return copy of default tab array,
     *   or {@code null} if standard tabs are used; must be freed with
     *   {@link org.pango.TabArray#free}.
     */
    public @Nullable org.pango.TabArray getTabs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_tabs.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.TabArray.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Fetches the text from a label.
     * <p>
     * The returned text is as it appears on screen. This does not include
     * any embedded underlines indicating mnemonics or Pango markup. (See
     * {@link Label#getLabel})
     * @return the text in the label widget. This is the internal
     *   string used by the label, and must not be modified.
     */
    public java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns whether the label’s text is interpreted as Pango markup.
     * <p>
     * See {@link Label#setUseMarkup}.
     * @return {@code true} if the label’s text will be parsed for markup.
     */
    public boolean getUseMarkup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_use_markup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether an embedded underlines in the label indicate mnemonics.
     * <p>
     * See {@link Label#setUseUnderline}.
     * @return {@code true} whether an embedded underline in the label indicates
     *   the mnemonic accelerator keys.
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the desired width of {@code label}, in characters.
     * <p>
     * See {@link Label#setWidthChars}.
     * @return the width of the label in characters.
     */
    public int getWidthChars() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_width_chars.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether lines in the label are automatically wrapped.
     * <p>
     * See {@link Label#setWrap}.
     * @return {@code true} if the lines of the label are automatically wrapped.
     */
    public boolean getWrap() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_wrap.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns line wrap mode used by the label.
     * <p>
     * See {@link Label#setWrapMode}.
     * @return the line wrap mode
     */
    public org.pango.WrapMode getWrapMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_wrap_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.WrapMode.of(RESULT);
    }
    
    /**
     * Gets the {@code xalign} of the label.
     * <p>
     * See the {@code Gtk.Label:xalign} property.
     * @return the xalign property
     */
    public float getXalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_label_get_xalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code yalign} of the label.
     * <p>
     * See the {@code Gtk.Label:yalign} property.
     * @return the yalign property
     */
    public float getYalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_label_get_yalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Selects a range of characters in the label, if the label is selectable.
     * <p>
     * See {@link Label#setSelectable}. If the label is not selectable,
     * this function has no effect. If {@code start_offset} or
     * {@code end_offset} are -1, then the end of the label will be substituted.
     * @param startOffset start offset (in characters not bytes)
     * @param endOffset end offset (in characters not bytes)
     */
    public void selectRegion(int startOffset, int endOffset) {
        try {
            DowncallHandles.gtk_label_select_region.invokeExact(
                    handle(),
                    startOffset,
                    endOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Apply attributes to the label text.
     * <p>
     * The attributes set with this function will be applied and merged with
     * any other attributes previously effected by way of the
     * {@code Gtk.Label:use-underline} or {@code Gtk.Label:use-markup}
     * properties. While it is not recommended to mix markup strings with
     * manually set attributes, if you must; know that the attributes will
     * be applied to the label after the markup string is parsed.
     * @param attrs a {@code Pango.AttrList}
     */
    public void setAttributes(@Nullable org.pango.AttrList attrs) {
        try {
            DowncallHandles.gtk_label_set_attributes.invokeExact(
                    handle(),
                    (Addressable) (attrs == null ? MemoryAddress.NULL : attrs.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mode used to ellipsizei the text.
     * <p>
     * The text will be ellipsized if there is not enough space
     * to render the entire string.
     * @param mode a {@code PangoEllipsizeMode}
     */
    public void setEllipsize(org.pango.EllipsizeMode mode) {
        try {
            DowncallHandles.gtk_label_set_ellipsize.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code label}.
     * @param model a {@code GMenuModel}
     */
    public void setExtraMenu(@Nullable org.gtk.gio.MenuModel model) {
        try {
            DowncallHandles.gtk_label_set_extra_menu.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the alignment of the lines in the text of the label relative to
     * each other.
     * <p>
     * {@link Justification#LEFT} is the default value when the widget is first created
     * with {@link Label#Label}. If you instead want to set the alignment of
     * the label as a whole, use {@link Widget#setHalign} instead.
     * {@link Label#setJustify} has no effect on labels containing
     * only a single line.
     * @param jtype a {@code GtkJustification}
     */
    public void setJustify(org.gtk.gtk.Justification jtype) {
        try {
            DowncallHandles.gtk_label_set_justify.invokeExact(
                    handle(),
                    jtype.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text of the label.
     * <p>
     * The label is interpreted as including embedded underlines and/or Pango
     * markup depending on the values of the {@code Gtk.Label:use-underline}
     * and {@code Gtk.Label:use-markup} properties.
     * @param str the new text to set for the label
     */
    public void setLabel(java.lang.String str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_label_set_label.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(str, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the number of lines to which an ellipsized, wrapping label
     * should be limited.
     * <p>
     * This has no effect if the label is not wrapping or ellipsized.
     * Set this to -1 if you don’t want to limit the number of lines.
     * @param lines the desired number of lines, or -1
     */
    public void setLines(int lines) {
        try {
            DowncallHandles.gtk_label_set_lines.invokeExact(
                    handle(),
                    lines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the labels text and attributes from markup.
     * <p>
     * The string must be marked up with Pango markup
     * (see {@link org.pango.Pango#parseMarkup}).
     * <p>
     * If the {@code str} is external data, you may need to escape it
     * with g_markup_escape_text() or g_markup_printf_escaped():
     * <pre>{@code c
     * GtkWidget *self = gtk_label_new (NULL);
     * const char *str = "...";
     * const char *format = "<span style=\\"italic\\">\\%s</span>";
     * char *markup;
     * 
     * markup = g_markup_printf_escaped (format, str);
     * gtk_label_set_markup (GTK_LABEL (self), markup);
     * g_free (markup);
     * }</pre>
     * <p>
     * This function will set the {@code Gtk.Label:use-markup} property
     * to {@code true} as a side effect.
     * <p>
     * If you set the label contents using the {@code Gtk.Label:label}
     * property you should also ensure that you set the
     * {@code Gtk.Label:use-markup} property accordingly.
     * <p>
     * See also: {@link Label#setText}
     * @param str a markup string
     */
    public void setMarkup(java.lang.String str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_label_set_markup.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(str, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the labels text, attributes and mnemonic from markup.
     * <p>
     * Parses {@code str} which is marked up with Pango markup (see {@link org.pango.Pango#parseMarkup}),
     * setting the label’s text and attribute list based on the parse results.
     * If characters in {@code str} are preceded by an underscore, they are underlined
     * indicating that they represent a keyboard accelerator called a mnemonic.
     * <p>
     * The mnemonic key can be used to activate another widget, chosen
     * automatically, or explicitly using {@link Label#setMnemonicWidget}.
     * @param str a markup string
     */
    public void setMarkupWithMnemonic(java.lang.String str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_label_set_markup_with_mnemonic.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(str, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the desired maximum width in characters of {@code label} to {@code n_chars}.
     * @param nChars the new desired maximum width, in characters.
     */
    public void setMaxWidthChars(int nChars) {
        try {
            DowncallHandles.gtk_label_set_max_width_chars.invokeExact(
                    handle(),
                    nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Associate the label with its mnemonic target.
     * <p>
     * If the label has been set so that it has a mnemonic key (using
     * i.e. {@link Label#setMarkupWithMnemonic},
     * {@link Label#setTextWithMnemonic},
     * {@link Label#newWithMnemonic}
     * or the {@code Gtk.Label:use_underline} property) the label can be
     * associated with a widget that is the target of the mnemonic. When the
     * label is inside a widget (like a {@link Button} or a
     * {@link Notebook} tab) it is automatically associated with the correct
     * widget, but sometimes (i.e. when the target is a {@link Entry} next to
     * the label) you need to set it explicitly using this function.
     * <p>
     * The target widget will be accelerated by emitting the
     * {@code GtkWidget::mnemonic-activate} signal on it. The default handler for
     * this signal will activate the widget if there are no mnemonic collisions
     * and toggle focus between the colliding widgets otherwise.
     * @param widget the target {@code GtkWidget}, or {@code null} to unset
     */
    public void setMnemonicWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_label_set_mnemonic_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Select the line wrapping for the natural size request.
     * <p>
     * This only affects the natural size requested, for the actual wrapping used,
     * see the {@code Gtk.Label:wrap-mode} property.
     * @param wrapMode the line wrapping mode
     */
    public void setNaturalWrapMode(org.gtk.gtk.NaturalWrapMode wrapMode) {
        try {
            DowncallHandles.gtk_label_set_natural_wrap_mode.invokeExact(
                    handle(),
                    wrapMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes text in the label selectable.
     * <p>
     * Selectable labels allow the user to select text from the label,
     * for copy-and-paste.
     * @param setting {@code true} to allow selecting text in the label
     */
    public void setSelectable(boolean setting) {
        try {
            DowncallHandles.gtk_label_set_selectable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the label is in single line mode.
     * @param singleLineMode {@code true} if the label should be in single line mode
     */
    public void setSingleLineMode(boolean singleLineMode) {
        try {
            DowncallHandles.gtk_label_set_single_line_mode.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(singleLineMode, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default tab stops for paragraphs in {@code self}.
     * @param tabs tabs as a {@code PangoTabArray}
     */
    public void setTabs(@Nullable org.pango.TabArray tabs) {
        try {
            DowncallHandles.gtk_label_set_tabs.invokeExact(
                    handle(),
                    (Addressable) (tabs == null ? MemoryAddress.NULL : tabs.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text within the {@code GtkLabel} widget.
     * <p>
     * It overwrites any text that was there before.
     * <p>
     * This function will clear any previously set mnemonic accelerators,
     * and set the {@code Gtk.Label:use-underline property} to {@code false} as
     * a side effect.
     * <p>
     * This function will set the {@code Gtk.Label:use-markup} property
     * to {@code false} as a side effect.
     * <p>
     * See also: {@link Label#setMarkup}
     * @param str The text you want to set
     */
    public void setText(java.lang.String str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_label_set_text.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(str, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the label’s text from the string {@code str}.
     * <p>
     * If characters in {@code str} are preceded by an underscore, they are underlined
     * indicating that they represent a keyboard accelerator called a mnemonic.
     * The mnemonic key can be used to activate another widget, chosen
     * automatically, or explicitly using {@link Label#setMnemonicWidget}.
     * @param str a string
     */
    public void setTextWithMnemonic(java.lang.String str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_label_set_text_with_mnemonic.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(str, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets whether the text of the label contains markup.
     * <p>
     * See {@link Label#setMarkup}.
     * @param setting {@code true} if the label’s text should be parsed for markup.
     */
    public void setUseMarkup(boolean setting) {
        try {
            DowncallHandles.gtk_label_set_use_markup.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether underlines in the text indicate mnemonics.
     * @param setting {@code true} if underlines in the text indicate mnemonics
     */
    public void setUseUnderline(boolean setting) {
        try {
            DowncallHandles.gtk_label_set_use_underline.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the desired width in characters of {@code label} to {@code n_chars}.
     * @param nChars the new desired width, in characters.
     */
    public void setWidthChars(int nChars) {
        try {
            DowncallHandles.gtk_label_set_width_chars.invokeExact(
                    handle(),
                    nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Toggles line wrapping within the {@code GtkLabel} widget.
     * <p>
     * {@code true} makes it break lines if text exceeds the widget’s size.
     * {@code false} lets the text get cut off by the edge of the widget if
     * it exceeds the widget size.
     * <p>
     * Note that setting line wrapping to {@code true} does not make the label
     * wrap at its parent container’s width, because GTK widgets
     * conceptually can’t make their requisition depend on the parent
     * container’s size. For a label that wraps at a specific position,
     * set the label’s width using {@link Widget#setSizeRequest}.
     * @param wrap the setting
     */
    public void setWrap(boolean wrap) {
        try {
            DowncallHandles.gtk_label_set_wrap.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(wrap, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Controls how line wrapping is done.
     * <p>
     * This only affects the label if line wrapping is on. (See
     * {@link Label#setWrap}) The default is {@link org.pango.WrapMode#WORD}
     * which means wrap on word boundaries.
     * <p>
     * For sizing behavior, also consider the {@code Gtk.Label:natural-wrap-mode}
     * property.
     * @param wrapMode the line wrapping mode
     */
    public void setWrapMode(org.pango.WrapMode wrapMode) {
        try {
            DowncallHandles.gtk_label_set_wrap_mode.invokeExact(
                    handle(),
                    wrapMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code xalign} of the label.
     * <p>
     * See the {@code Gtk.Label:xalign} property.
     * @param xalign the new xalign value, between 0 and 1
     */
    public void setXalign(float xalign) {
        try {
            DowncallHandles.gtk_label_set_xalign.invokeExact(
                    handle(),
                    xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code yalign} of the label.
     * <p>
     * See the {@code Gtk.Label:yalign} property.
     * @param yalign the new yalign value, between 0 and 1
     */
    public void setYalign(float yalign) {
        try {
            DowncallHandles.gtk_label_set_yalign.invokeExact(
                    handle(),
                    yalign);
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
            RESULT = (long) DowncallHandles.gtk_label_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ActivateCurrentLink} callback.
     */
    @FunctionalInterface
    public interface ActivateCurrentLink {
    
        /**
         * Gets emitted when the user activates a link in the label.
         * <p>
         * The ::activate-current-link is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * Applications may also emit the signal with g_signal_emit_by_name()
         * if they need to control activation of URIs programmatically.
         * <p>
         * The default bindings for this signal are all forms of the Enter key.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceLabel) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateCurrentLink.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted when the user activates a link in the label.
     * <p>
     * The ::activate-current-link is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * Applications may also emit the signal with g_signal_emit_by_name()
     * if they need to control activation of URIs programmatically.
     * <p>
     * The default bindings for this signal are all forms of the Enter key.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Label.ActivateCurrentLink> onActivateCurrentLink(Label.ActivateCurrentLink handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate-current-link", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateLink} callback.
     */
    @FunctionalInterface
    public interface ActivateLink {
    
        /**
         * Gets emitted to activate a URI.
         * <p>
         * Applications may connect to it to override the default behaviour,
         * which is to call gtk_show_uri().
         */
        boolean run(java.lang.String uri);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceLabel, MemoryAddress uri) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(Marshal.addressToString.marshal(uri, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateLink.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted to activate a URI.
     * <p>
     * Applications may connect to it to override the default behaviour,
     * which is to call gtk_show_uri().
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Label.ActivateLink> onActivateLink(Label.ActivateLink handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate-link", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
         * Gets emitted to copy the slection to the clipboard.
         * <p>
         * The ::copy-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is Ctrl-c.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceLabel) {
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
     * Gets emitted to copy the slection to the clipboard.
     * <p>
     * The ::copy-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is Ctrl-c.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Label.CopyClipboard> onCopyClipboard(Label.CopyClipboard handler) {
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
     * Functional interface declaration of the {@code MoveCursor} callback.
     */
    @FunctionalInterface
    public interface MoveCursor {
    
        /**
         * Gets emitted when the user initiates a cursor movement.
         * <p>
         * The ::move-cursor signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * If the cursor is not visible in {@code entry}, this signal causes the viewport to
         * be moved instead.
         * <p>
         * Applications should not connect to it, but may emit it with
         * g_signal_emit_by_name() if they need to control the cursor
         * programmatically.
         * <p>
         * The default bindings for this signal come in two variants,
         * the variant with the Shift modifier extends the selection,
         * the variant without the Shift modifier does not.
         * There are too many key combinations to list them all here.
         * <ul>
         * <li>Arrow keys move by individual characters/lines
         * <li>Ctrl-arrow key combinations move by words/paragraphs
         * <li>Home/End keys move to the ends of the buffer
         * </ul>
         */
        void run(org.gtk.gtk.MovementStep step, int count, boolean extendSelection);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceLabel, int step, int count, int extendSelection) {
            run(org.gtk.gtk.MovementStep.of(step), count, Marshal.integerToBoolean.marshal(extendSelection, null).booleanValue());
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
     * Gets emitted when the user initiates a cursor movement.
     * <p>
     * The ::move-cursor signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * If the cursor is not visible in {@code entry}, this signal causes the viewport to
     * be moved instead.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * <p>
     * The default bindings for this signal come in two variants,
     * the variant with the Shift modifier extends the selection,
     * the variant without the Shift modifier does not.
     * There are too many key combinations to list them all here.
     * <ul>
     * <li>Arrow keys move by individual characters/lines
     * <li>Ctrl-arrow key combinations move by words/paragraphs
     * <li>Home/End keys move to the ends of the buffer
     * </ul>
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Label.MoveCursor> onMoveCursor(Label.MoveCursor handler) {
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
     * A {@link Label.Builder} object constructs a {@link Label} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Label.Builder#build()}. 
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
         * Finish building the {@link Label} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Label}.
         * @return A new instance of {@code Label} with the properties 
         *         that were set in the Builder object.
         */
        public Label build() {
            return (Label) org.gtk.gobject.GObject.newWithProperties(
                Label.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * A list of style attributes to apply to the text of the label.
         * @param attributes The value for the {@code attributes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAttributes(org.pango.AttrList attributes) {
            names.add("attributes");
            values.add(org.gtk.gobject.Value.create(attributes));
            return this;
        }
        
        /**
         * The preferred place to ellipsize the string, if the label does
         * not have enough room to display the entire string.
         * <p>
         * Note that setting this property to a value other than
         * {@link org.pango.EllipsizeMode#NONE} has the side-effect that the label requests
         * only enough space to display the ellipsis "...". In particular, this
         * means that ellipsizing labels do not work well in notebook tabs, unless
         * the {@code Gtk.NotebookPage:tab-expand} child property is set to {@code true}.
         * Other ways to set a label's width are {@link Widget#setSizeRequest}
         * and {@link Label#setWidthChars}.
         * @param ellipsize The value for the {@code ellipsize} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEllipsize(org.pango.EllipsizeMode ellipsize) {
            names.add("ellipsize");
            values.add(org.gtk.gobject.Value.create(ellipsize));
            return this;
        }
        
        /**
         * A menu model whose contents will be appended to the context menu.
         * @param extraMenu The value for the {@code extra-menu} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExtraMenu(org.gtk.gio.MenuModel extraMenu) {
            names.add("extra-menu");
            values.add(org.gtk.gobject.Value.create(extraMenu));
            return this;
        }
        
        /**
         * The alignment of the lines in the text of the label, relative to each other.
         * <p>
         * This does <em>not</em> affect the alignment of the label within its allocation.
         * See {@code Gtk.Label:xalign} for that.
         * @param justify The value for the {@code justify} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setJustify(org.gtk.gtk.Justification justify) {
            names.add("justify");
            values.add(org.gtk.gobject.Value.create(justify));
            return this;
        }
        
        /**
         * The contents of the label.
         * <p>
         * If the string contains Pango markup (see {@link org.pango.Pango#parseMarkup}),
         * you will have to set the {@code Gtk.Label:use-markup} property to
         * {@code true} in order for the label to display the markup attributes. See also
         * {@link Label#setMarkup} for a convenience function that sets both
         * this property and the {@code Gtk.Label:use-markup} property at the
         * same time.
         * <p>
         * If the string contains underlines acting as mnemonics, you will have to
         * set the {@code Gtk.Label:use-underline} property to {@code true} in order
         * for the label to display them.
         * @param label The value for the {@code label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        /**
         * The number of lines to which an ellipsized, wrapping label
         * should be limited.
         * <p>
         * This property has no effect if the label is not wrapping or ellipsized.
         * Set this property to -1 if you don't want to limit the number of lines.
         * @param lines The value for the {@code lines} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLines(int lines) {
            names.add("lines");
            values.add(org.gtk.gobject.Value.create(lines));
            return this;
        }
        
        /**
         * The desired maximum width of the label, in characters.
         * <p>
         * If this property is set to -1, the width will be calculated automatically.
         * <p>
         * See the section on <a href="class.Label.html#text-layout">text layout</a> for details of how
         * {@code Gtk.Label:width-chars} and {@code Gtk.Label:max-width-chars}
         * determine the width of ellipsized and wrapped labels.
         * @param maxWidthChars The value for the {@code max-width-chars} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxWidthChars(int maxWidthChars) {
            names.add("max-width-chars");
            values.add(org.gtk.gobject.Value.create(maxWidthChars));
            return this;
        }
        
        /**
         * The mnemonic accelerator key for the label.
         * @param mnemonicKeyval The value for the {@code mnemonic-keyval} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMnemonicKeyval(int mnemonicKeyval) {
            names.add("mnemonic-keyval");
            values.add(org.gtk.gobject.Value.create(mnemonicKeyval));
            return this;
        }
        
        /**
         * The widget to be activated when the labels mnemonic key is pressed.
         * @param mnemonicWidget The value for the {@code mnemonic-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMnemonicWidget(org.gtk.gtk.Widget mnemonicWidget) {
            names.add("mnemonic-widget");
            values.add(org.gtk.gobject.Value.create(mnemonicWidget));
            return this;
        }
        
        /**
         * Select the line wrapping for the natural size request.
         * <p>
         * This only affects the natural size requested. For the actual wrapping used,
         * see the {@code Gtk.Label:wrap-mode} property.
         * <p>
         * The default is {@link NaturalWrapMode#INHERIT}, which inherits the behavior of the
         * {@code Gtk.Label:wrap-mode} property.
         * @param naturalWrapMode The value for the {@code natural-wrap-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNaturalWrapMode(org.gtk.gtk.NaturalWrapMode naturalWrapMode) {
            names.add("natural-wrap-mode");
            values.add(org.gtk.gobject.Value.create(naturalWrapMode));
            return this;
        }
        
        /**
         * Whether the label text can be selected with the mouse.
         * @param selectable The value for the {@code selectable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelectable(boolean selectable) {
            names.add("selectable");
            values.add(org.gtk.gobject.Value.create(selectable));
            return this;
        }
        
        /**
         * Whether the label is in single line mode.
         * <p>
         * In single line mode, the height of the label does not depend on the
         * actual text, it is always set to ascent + descent of the font. This
         * can be an advantage in situations where resizing the label because
         * of text changes would be distracting, e.g. in a statusbar.
         * @param singleLineMode The value for the {@code single-line-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSingleLineMode(boolean singleLineMode) {
            names.add("single-line-mode");
            values.add(org.gtk.gobject.Value.create(singleLineMode));
            return this;
        }
        
        /**
         * Custom tabs for this label.
         * @param tabs The value for the {@code tabs} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTabs(org.pango.TabArray tabs) {
            names.add("tabs");
            values.add(org.gtk.gobject.Value.create(tabs));
            return this;
        }
        
        /**
         * {@code true} if the text of the label includes Pango markup.
         * <p>
         * See {@link org.pango.Pango#parseMarkup}.
         * @param useMarkup The value for the {@code use-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseMarkup(boolean useMarkup) {
            names.add("use-markup");
            values.add(org.gtk.gobject.Value.create(useMarkup));
            return this;
        }
        
        /**
         * {@code true} if the text of the label indicates a mnemonic with _.
         * @param useUnderline The value for the {@code use-underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseUnderline(boolean useUnderline) {
            names.add("use-underline");
            values.add(org.gtk.gobject.Value.create(useUnderline));
            return this;
        }
        
        /**
         * The desired width of the label, in characters.
         * <p>
         * If this property is set to -1, the width will be calculated automatically.
         * <p>
         * See the section on <a href="class.Label.html#text-layout">text layout</a> for details of how
         * {@code Gtk.Label:width-chars} and {@code Gtk.Label:max-width-chars}
         * determine the width of ellipsized and wrapped labels.
         * @param widthChars The value for the {@code width-chars} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidthChars(int widthChars) {
            names.add("width-chars");
            values.add(org.gtk.gobject.Value.create(widthChars));
            return this;
        }
        
        /**
         * {@code true} if the label text will wrap if it gets too wide.
         * @param wrap The value for the {@code wrap} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWrap(boolean wrap) {
            names.add("wrap");
            values.add(org.gtk.gobject.Value.create(wrap));
            return this;
        }
        
        /**
         * Controls how the line wrapping is done.
         * <p>
         * This only affects the formatting if line wrapping is on (see the
         * {@code Gtk.Label:wrap} property). The default is {@link org.pango.WrapMode#WORD},
         * which means wrap on word boundaries.
         * <p>
         * For sizing behavior, also consider the {@code Gtk.Label:natural-wrap-mode}
         * property.
         * @param wrapMode The value for the {@code wrap-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWrapMode(org.pango.WrapMode wrapMode) {
            names.add("wrap-mode");
            values.add(org.gtk.gobject.Value.create(wrapMode));
            return this;
        }
        
        /**
         * The horizontal alignment of the label text inside its size allocation.
         * <p>
         * Compare this to {@code Gtk.Widget:halign}, which determines how the
         * labels size allocation is positioned in the space available for the label.
         * @param xalign The value for the {@code xalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setXalign(float xalign) {
            names.add("xalign");
            values.add(org.gtk.gobject.Value.create(xalign));
            return this;
        }
        
        /**
         * The vertical alignment of the label text inside its size allocation.
         * <p>
         * Compare this to {@code Gtk.Widget:valign}, which determines how the
         * labels size allocation is positioned in the space available for the label.
         * @param yalign The value for the {@code yalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setYalign(float yalign) {
            names.add("yalign");
            values.add(org.gtk.gobject.Value.create(yalign));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_label_new = Interop.downcallHandle(
                "gtk_label_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_new_with_mnemonic = Interop.downcallHandle(
                "gtk_label_new_with_mnemonic",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_attributes = Interop.downcallHandle(
                "gtk_label_get_attributes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_current_uri = Interop.downcallHandle(
                "gtk_label_get_current_uri",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_ellipsize = Interop.downcallHandle(
                "gtk_label_get_ellipsize",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_extra_menu = Interop.downcallHandle(
                "gtk_label_get_extra_menu",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_justify = Interop.downcallHandle(
                "gtk_label_get_justify",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_label = Interop.downcallHandle(
                "gtk_label_get_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_layout = Interop.downcallHandle(
                "gtk_label_get_layout",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_layout_offsets = Interop.downcallHandle(
                "gtk_label_get_layout_offsets",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_lines = Interop.downcallHandle(
                "gtk_label_get_lines",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_max_width_chars = Interop.downcallHandle(
                "gtk_label_get_max_width_chars",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_mnemonic_keyval = Interop.downcallHandle(
                "gtk_label_get_mnemonic_keyval",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_mnemonic_widget = Interop.downcallHandle(
                "gtk_label_get_mnemonic_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_natural_wrap_mode = Interop.downcallHandle(
                "gtk_label_get_natural_wrap_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_selectable = Interop.downcallHandle(
                "gtk_label_get_selectable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_selection_bounds = Interop.downcallHandle(
                "gtk_label_get_selection_bounds",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_single_line_mode = Interop.downcallHandle(
                "gtk_label_get_single_line_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_tabs = Interop.downcallHandle(
                "gtk_label_get_tabs",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_text = Interop.downcallHandle(
                "gtk_label_get_text",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_use_markup = Interop.downcallHandle(
                "gtk_label_get_use_markup",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_use_underline = Interop.downcallHandle(
                "gtk_label_get_use_underline",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_width_chars = Interop.downcallHandle(
                "gtk_label_get_width_chars",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_wrap = Interop.downcallHandle(
                "gtk_label_get_wrap",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_wrap_mode = Interop.downcallHandle(
                "gtk_label_get_wrap_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_xalign = Interop.downcallHandle(
                "gtk_label_get_xalign",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_get_yalign = Interop.downcallHandle(
                "gtk_label_get_yalign",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_select_region = Interop.downcallHandle(
                "gtk_label_select_region",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_attributes = Interop.downcallHandle(
                "gtk_label_set_attributes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_set_ellipsize = Interop.downcallHandle(
                "gtk_label_set_ellipsize",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_extra_menu = Interop.downcallHandle(
                "gtk_label_set_extra_menu",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_set_justify = Interop.downcallHandle(
                "gtk_label_set_justify",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_label = Interop.downcallHandle(
                "gtk_label_set_label",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_set_lines = Interop.downcallHandle(
                "gtk_label_set_lines",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_markup = Interop.downcallHandle(
                "gtk_label_set_markup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_set_markup_with_mnemonic = Interop.downcallHandle(
                "gtk_label_set_markup_with_mnemonic",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_set_max_width_chars = Interop.downcallHandle(
                "gtk_label_set_max_width_chars",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_mnemonic_widget = Interop.downcallHandle(
                "gtk_label_set_mnemonic_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_set_natural_wrap_mode = Interop.downcallHandle(
                "gtk_label_set_natural_wrap_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_selectable = Interop.downcallHandle(
                "gtk_label_set_selectable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_single_line_mode = Interop.downcallHandle(
                "gtk_label_set_single_line_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_tabs = Interop.downcallHandle(
                "gtk_label_set_tabs",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_set_text = Interop.downcallHandle(
                "gtk_label_set_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_set_text_with_mnemonic = Interop.downcallHandle(
                "gtk_label_set_text_with_mnemonic",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_label_set_use_markup = Interop.downcallHandle(
                "gtk_label_set_use_markup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_use_underline = Interop.downcallHandle(
                "gtk_label_set_use_underline",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_width_chars = Interop.downcallHandle(
                "gtk_label_set_width_chars",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_wrap = Interop.downcallHandle(
                "gtk_label_set_wrap",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_wrap_mode = Interop.downcallHandle(
                "gtk_label_set_wrap_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_label_set_xalign = Interop.downcallHandle(
                "gtk_label_set_xalign",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_label_set_yalign = Interop.downcallHandle(
                "gtk_label_set_yalign",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_label_get_type = Interop.downcallHandle(
                "gtk_label_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_label_get_type != null;
    }
}
