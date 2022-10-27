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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Label(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Label */
    public static Label castFrom(org.gtk.gobject.Object gobject) {
        return new Label(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String str) {
        java.util.Objects.requireNonNullElse(str, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_label_new.invokeExact(Interop.allocateNativeString(str)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new label with the given text inside it.
     * <p>
     * You can pass {@code null} to get an empty label widget.
     * @param str The text of the label
     */
    public Label(@Nullable java.lang.String str) {
        super(constructNew(str));
    }
    
    private static Refcounted constructNewWithMnemonic(@Nullable java.lang.String str) {
        java.util.Objects.requireNonNullElse(str, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_label_new_with_mnemonic.invokeExact(Interop.allocateNativeString(str)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
        return new Label(constructNewWithMnemonic(str));
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
        return new org.pango.AttrList(Refcounted.get(RESULT, false));
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
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the ellipsizing position of the label.
     * <p>
     * See {@link Label#setEllipsize}.
     * @return {@code PangoEllipsizeMode}
     */
    public @NotNull org.pango.EllipsizeMode getEllipsize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_ellipsize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.EllipsizeMode(RESULT);
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
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the justification of the label.
     * <p>
     * See {@link Label#setJustify}.
     * @return {@code GtkJustification}
     */
    public @NotNull org.gtk.gtk.Justification getJustify() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_justify.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Justification(RESULT);
    }
    
    /**
     * Fetches the text from a label.
     * <p>
     * The returned text includes any embedded underlines indicating
     * mnemonics and Pango markup. (See {@link Label#getText}).
     * @return the text of the label widget. This string is
     *   owned by the widget and must not be modified or freed.
     */
    public @NotNull java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
    public @NotNull org.pango.Layout getLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Layout(Refcounted.get(RESULT, false));
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
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_label_get_layout_offsets.invokeExact(handle(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_INT, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_INT, 0));
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
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns line wrap mode used by the label.
     * <p>
     * See {@link Label#setNaturalWrapMode}.
     * @return the natural line wrap mode
     */
    public @NotNull org.gtk.gtk.NaturalWrapMode getNaturalWrapMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_natural_wrap_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.NaturalWrapMode(RESULT);
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
        return RESULT != 0;
    }
    
    /**
     * Gets the selected range of characters in the label.
     * @param start return location for start of selection, as a character offset
     * @param end return location for end of selection, as a character offset
     * @return {@code true} if selection is non-empty
     */
    public boolean getSelectionBounds(Out<Integer> start, Out<Integer> end) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        MemorySegment startPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment endPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_selection_bounds.invokeExact(handle(), (Addressable) startPOINTER.address(), (Addressable) endPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        start.set(startPOINTER.get(ValueLayout.JAVA_INT, 0));
        end.set(endPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
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
        return RESULT != 0;
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
    public @NotNull java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_label_get_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
        return RESULT != 0;
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
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Returns line wrap mode used by the label.
     * <p>
     * See {@link Label#setWrapMode}.
     * @return the line wrap mode
     */
    public @NotNull org.pango.WrapMode getWrapMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_label_get_wrap_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.WrapMode(RESULT);
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
            DowncallHandles.gtk_label_select_region.invokeExact(handle(), startOffset, endOffset);
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
        java.util.Objects.requireNonNullElse(attrs, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_label_set_attributes.invokeExact(handle(), attrs.handle());
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
    public void setEllipsize(@NotNull org.pango.EllipsizeMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gtk_label_set_ellipsize.invokeExact(handle(), mode.getValue());
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
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_label_set_extra_menu.invokeExact(handle(), model.handle());
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
    public void setJustify(@NotNull org.gtk.gtk.Justification jtype) {
        java.util.Objects.requireNonNull(jtype, "Parameter 'jtype' must not be null");
        try {
            DowncallHandles.gtk_label_set_justify.invokeExact(handle(), jtype.getValue());
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
    public void setLabel(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        try {
            DowncallHandles.gtk_label_set_label.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            DowncallHandles.gtk_label_set_lines.invokeExact(handle(), lines);
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
    public void setMarkup(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        try {
            DowncallHandles.gtk_label_set_markup.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void setMarkupWithMnemonic(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        try {
            DowncallHandles.gtk_label_set_markup_with_mnemonic.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the desired maximum width in characters of {@code label} to {@code n_chars}.
     * @param nChars the new desired maximum width, in characters.
     */
    public void setMaxWidthChars(int nChars) {
        try {
            DowncallHandles.gtk_label_set_max_width_chars.invokeExact(handle(), nChars);
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
        java.util.Objects.requireNonNullElse(widget, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_label_set_mnemonic_widget.invokeExact(handle(), widget.handle());
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
    public void setNaturalWrapMode(@NotNull org.gtk.gtk.NaturalWrapMode wrapMode) {
        java.util.Objects.requireNonNull(wrapMode, "Parameter 'wrapMode' must not be null");
        try {
            DowncallHandles.gtk_label_set_natural_wrap_mode.invokeExact(handle(), wrapMode.getValue());
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
            DowncallHandles.gtk_label_set_selectable.invokeExact(handle(), setting ? 1 : 0);
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
            DowncallHandles.gtk_label_set_single_line_mode.invokeExact(handle(), singleLineMode ? 1 : 0);
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
    public void setText(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        try {
            DowncallHandles.gtk_label_set_text.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void setTextWithMnemonic(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        try {
            DowncallHandles.gtk_label_set_text_with_mnemonic.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            DowncallHandles.gtk_label_set_use_markup.invokeExact(handle(), setting ? 1 : 0);
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
            DowncallHandles.gtk_label_set_use_underline.invokeExact(handle(), setting ? 1 : 0);
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
            DowncallHandles.gtk_label_set_width_chars.invokeExact(handle(), nChars);
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
            DowncallHandles.gtk_label_set_wrap.invokeExact(handle(), wrap ? 1 : 0);
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
    public void setWrapMode(@NotNull org.pango.WrapMode wrapMode) {
        java.util.Objects.requireNonNull(wrapMode, "Parameter 'wrapMode' must not be null");
        try {
            DowncallHandles.gtk_label_set_wrap_mode.invokeExact(handle(), wrapMode.getValue());
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
            DowncallHandles.gtk_label_set_xalign.invokeExact(handle(), xalign);
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
            DowncallHandles.gtk_label_set_yalign.invokeExact(handle(), yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateCurrentLink {
        void signalReceived(Label source);
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
     */
    public Signal<Label.ActivateCurrentLink> onActivateCurrentLink(Label.ActivateCurrentLink handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-current-link"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Label.Callbacks.class, "signalLabelActivateCurrentLink",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Label.ActivateCurrentLink>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateLink {
        boolean signalReceived(Label source, @NotNull java.lang.String uri);
    }
    
    /**
     * Gets emitted to activate a URI.
     * <p>
     * Applications may connect to it to override the default behaviour,
     * which is to call gtk_show_uri().
     */
    public Signal<Label.ActivateLink> onActivateLink(Label.ActivateLink handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-link"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Label.Callbacks.class, "signalLabelActivateLink",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Label.ActivateLink>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CopyClipboard {
        void signalReceived(Label source);
    }
    
    /**
     * Gets emitted to copy the slection to the clipboard.
     * <p>
     * The ::copy-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is Ctrl-c.
     */
    public Signal<Label.CopyClipboard> onCopyClipboard(Label.CopyClipboard handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("copy-clipboard"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Label.Callbacks.class, "signalLabelCopyClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Label.CopyClipboard>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursor {
        void signalReceived(Label source, @NotNull org.gtk.gtk.MovementStep step, int count, boolean extendSelection);
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
     */
    public Signal<Label.MoveCursor> onMoveCursor(Label.MoveCursor handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Label.Callbacks.class, "signalLabelMoveCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Label.MoveCursor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_label_new = Interop.downcallHandle(
            "gtk_label_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_new_with_mnemonic = Interop.downcallHandle(
            "gtk_label_new_with_mnemonic",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_attributes = Interop.downcallHandle(
            "gtk_label_get_attributes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_current_uri = Interop.downcallHandle(
            "gtk_label_get_current_uri",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_ellipsize = Interop.downcallHandle(
            "gtk_label_get_ellipsize",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_extra_menu = Interop.downcallHandle(
            "gtk_label_get_extra_menu",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_justify = Interop.downcallHandle(
            "gtk_label_get_justify",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_label = Interop.downcallHandle(
            "gtk_label_get_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_layout = Interop.downcallHandle(
            "gtk_label_get_layout",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_layout_offsets = Interop.downcallHandle(
            "gtk_label_get_layout_offsets",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_lines = Interop.downcallHandle(
            "gtk_label_get_lines",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_max_width_chars = Interop.downcallHandle(
            "gtk_label_get_max_width_chars",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_mnemonic_keyval = Interop.downcallHandle(
            "gtk_label_get_mnemonic_keyval",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_mnemonic_widget = Interop.downcallHandle(
            "gtk_label_get_mnemonic_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_natural_wrap_mode = Interop.downcallHandle(
            "gtk_label_get_natural_wrap_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_selectable = Interop.downcallHandle(
            "gtk_label_get_selectable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_selection_bounds = Interop.downcallHandle(
            "gtk_label_get_selection_bounds",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_single_line_mode = Interop.downcallHandle(
            "gtk_label_get_single_line_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_text = Interop.downcallHandle(
            "gtk_label_get_text",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_use_markup = Interop.downcallHandle(
            "gtk_label_get_use_markup",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_use_underline = Interop.downcallHandle(
            "gtk_label_get_use_underline",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_width_chars = Interop.downcallHandle(
            "gtk_label_get_width_chars",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_wrap = Interop.downcallHandle(
            "gtk_label_get_wrap",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_wrap_mode = Interop.downcallHandle(
            "gtk_label_get_wrap_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_xalign = Interop.downcallHandle(
            "gtk_label_get_xalign",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_get_yalign = Interop.downcallHandle(
            "gtk_label_get_yalign",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_select_region = Interop.downcallHandle(
            "gtk_label_select_region",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_attributes = Interop.downcallHandle(
            "gtk_label_set_attributes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_set_ellipsize = Interop.downcallHandle(
            "gtk_label_set_ellipsize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_extra_menu = Interop.downcallHandle(
            "gtk_label_set_extra_menu",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_set_justify = Interop.downcallHandle(
            "gtk_label_set_justify",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_label = Interop.downcallHandle(
            "gtk_label_set_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_set_lines = Interop.downcallHandle(
            "gtk_label_set_lines",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_markup = Interop.downcallHandle(
            "gtk_label_set_markup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_set_markup_with_mnemonic = Interop.downcallHandle(
            "gtk_label_set_markup_with_mnemonic",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_set_max_width_chars = Interop.downcallHandle(
            "gtk_label_set_max_width_chars",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_mnemonic_widget = Interop.downcallHandle(
            "gtk_label_set_mnemonic_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_set_natural_wrap_mode = Interop.downcallHandle(
            "gtk_label_set_natural_wrap_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_selectable = Interop.downcallHandle(
            "gtk_label_set_selectable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_single_line_mode = Interop.downcallHandle(
            "gtk_label_set_single_line_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_text = Interop.downcallHandle(
            "gtk_label_set_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_set_text_with_mnemonic = Interop.downcallHandle(
            "gtk_label_set_text_with_mnemonic",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_label_set_use_markup = Interop.downcallHandle(
            "gtk_label_set_use_markup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_use_underline = Interop.downcallHandle(
            "gtk_label_set_use_underline",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_width_chars = Interop.downcallHandle(
            "gtk_label_set_width_chars",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_wrap = Interop.downcallHandle(
            "gtk_label_set_wrap",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_wrap_mode = Interop.downcallHandle(
            "gtk_label_set_wrap_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_label_set_xalign = Interop.downcallHandle(
            "gtk_label_set_xalign",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle gtk_label_set_yalign = Interop.downcallHandle(
            "gtk_label_set_yalign",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalLabelActivateCurrentLink(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Label.ActivateCurrentLink) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Label(Refcounted.get(source)));
        }
        
        public static boolean signalLabelActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Label.ActivateLink) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Label(Refcounted.get(source)), uri.getUtf8String(0));
        }
        
        public static void signalLabelCopyClipboard(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Label.CopyClipboard) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Label(Refcounted.get(source)));
        }
        
        public static void signalLabelMoveCursor(MemoryAddress source, int step, int count, int extendSelection, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Label.MoveCursor) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Label(Refcounted.get(source)), new org.gtk.gtk.MovementStep(step), count, extendSelection != 0);
        }
    }
}
