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
 * 
 * <h1>CSS nodes</h1>
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
 * 
 * <h1>GtkLabel as GtkBuildable</h1>
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
 * 
 * <h1>Accessibility</h1>
 * {@code GtkLabel} uses the {@link AccessibleRole#LABEL} role.
 * 
 * <h1>Mnemonics</h1>
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
 * 
 * <pre>{@code c
 * // Pressing Alt+H will activate this button
 * GtkWidget *button = gtk_button_new ();
 * GtkWidget *label = gtk_label_new_with_mnemonic ("_Hello");
 * gtk_button_set_child (GTK_BUTTON (button), label);
 * }</pre>
 * <p>
 * There’s a convenience function to create buttons with a mnemonic label
 * already inside:
 * 
 * <pre>{@code c
 * // Pressing Alt+H will activate this button
 * GtkWidget *button = gtk_button_new_with_mnemonic ("_Hello");
 * }</pre>
 * <p>
 * To create a mnemonic for a widget alongside the label, such as a
 * {@link Entry}, you have to point the label at the entry with
 * {@link Label#setMnemonicWidget}:
 * 
 * <pre>{@code c
 * // Pressing Alt+H will focus the entry
 * GtkWidget *entry = gtk_entry_new ();
 * GtkWidget *label = gtk_label_new_with_mnemonic ("_Hello");
 * gtk_label_set_mnemonic_widget (GTK_LABEL (label), entry);
 * }</pre>
 * 
 * <h1>Markup (styled text)</h1>
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
 * tags, {@link Pango#parseMarkup})
 * <p>
 * The markup passed to gtk_label_set_markup() must be valid; for example,
 * literal &lt;, &gt; and & characters must be escaped as &lt;, &gt;, and &amp;.
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
 * 
 * <h1>Selectable labels</h1>
 * Labels can be made selectable with {@link Label#setSelectable}.
 * Selectable labels allow the user to copy the label contents to
 * the clipboard. Only labels that contain useful-to-copy information
 * — such as error messages — should be made selectable.
 * 
 * <h1>Text layout</h1>
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
 * The {@code Gtk.Label:max-width-chars}
 * properties can be used to control the size allocation of ellipsized or
 * wrapped labels. For ellipsizing labels, if either is specified (and less
 * than the actual text size), it is used as the minimum width, and the actual
 * text size is used as the natural width of the label. For wrapping labels,
 * width-chars is used as the minimum width, if specified, and max-width-chars
 * is used as the natural width. Even if max-width-chars specified, wrapping
 * labels will be rewrapped to use all of the available width.
 * 
 * <h1>Links</h1>
 * GTK supports markup for clickable hyperlinks in addition to regular Pango
 * markup. The markup for links is borrowed from HTML, using the {@code <a>} with
 * “href“, “title“ and “class“ attributes. GTK renders links similar to the
 * way they appear in web browsers, with colored, underlined text. The “title“
 * attribute is displayed as a tooltip on the link. The “class“ attribute is
 * used as style class on the CSS node for the link.
 * <p>
 * An example looks like this:
 * 
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
public class Label extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Label(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Label */
    public static Label castFrom(org.gtk.gobject.Object gobject) {
        return new Label(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_label_new = Interop.downcallHandle(
        "gtk_label_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.String str) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_label_new.invokeExact(Interop.allocateNativeString(str)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new label with the given text inside it.
     * <p>
     * You can pass {@code null} to get an empty label widget.
     */
    public Label(@Nullable java.lang.String str) {
        super(constructNew(str));
    }
    
    private static final MethodHandle gtk_label_new_with_mnemonic = Interop.downcallHandle(
        "gtk_label_new_with_mnemonic",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithMnemonic(@Nullable java.lang.String str) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_label_new_with_mnemonic.invokeExact(Interop.allocateNativeString(str)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     */
    public static Label newWithMnemonic(@Nullable java.lang.String str) {
        return new Label(constructNewWithMnemonic(str));
    }
    
    private static final MethodHandle gtk_label_get_attributes = Interop.downcallHandle(
        "gtk_label_get_attributes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the labels attribute list.
     * <p>
     * This is the {@code Pango.AttrList} that was set on the label using
     * {@link Label#setAttributes}, if any. This function does not
     * reflect attributes that come from the labels markup (see
     * {@link Label#setMarkup}). If you want to get the effective
     * attributes for the label, use
     * {@code pango_layout_get_attribute (gtk_label_get_layout (self))}.
     */
    public @Nullable org.pango.AttrList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_label_get_attributes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrList(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_label_get_current_uri = Interop.downcallHandle(
        "gtk_label_get_current_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the URI for the currently active link in the label.
     * <p>
     * The active link is the one under the mouse pointer or, in a
     * selectable label, the link in which the text cursor is currently
     * positioned.
     * <p>
     * This function is intended for use in a {@code Gtk.Label::activate-link}
     * handler or for use in a {@code Gtk.Widget::query-tooltip} handler.
     */
    public @Nullable java.lang.String getCurrentUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_label_get_current_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_label_get_ellipsize = Interop.downcallHandle(
        "gtk_label_get_ellipsize",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the ellipsizing position of the label.
     * <p>
     * See {@link Label#setEllipsize}.
     */
    public @NotNull org.pango.EllipsizeMode getEllipsize() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_ellipsize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.EllipsizeMode(RESULT);
    }
    
    private static final MethodHandle gtk_label_get_extra_menu = Interop.downcallHandle(
        "gtk_label_get_extra_menu",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the extra menu model of {@code label}.
     * <p>
     * See {@link Label#setExtraMenu}.
     */
    public @Nullable org.gtk.gio.MenuModel getExtraMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_label_get_extra_menu.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_label_get_justify = Interop.downcallHandle(
        "gtk_label_get_justify",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the justification of the label.
     * <p>
     * See {@link Label#setJustify}.
     */
    public @NotNull Justification getJustify() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_justify.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Justification(RESULT);
    }
    
    private static final MethodHandle gtk_label_get_label = Interop.downcallHandle(
        "gtk_label_get_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the text from a label.
     * <p>
     * The returned text includes any embedded underlines indicating
     * mnemonics and Pango markup. (See {@link Label#getText}).
     */
    public @NotNull java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_label_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_label_get_layout = Interop.downcallHandle(
        "gtk_label_get_layout",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code PangoLayout} used to display the label.
     * <p>
     * The layout is useful to e.g. convert text positions to pixel
     * positions, in combination with {@link Label#getLayoutOffsets}.
     * The returned layout is owned by the {@code label} so need not be
     * freed by the caller. The {@code label} is free to recreate its layout
     * at any time, so it should be considered read-only.
     */
    public @NotNull org.pango.Layout getLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_label_get_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Layout(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_label_get_layout_offsets = Interop.downcallHandle(
        "gtk_label_get_layout_offsets",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the coordinates where the label will draw its {@code PangoLayout}.
     * <p>
     * The coordinates are useful to convert mouse events into coordinates
     * inside the {@link org.pango.Layout}, e.g. to take some action if some part
     * of the label is clicked. Remember when using the {@link org.pango.Layout}
     * functions you need to convert to and from pixels using PANGO_PIXELS()
     * or {@code Pango.SCALE}.
     */
    public @NotNull void getLayoutOffsets(@NotNull Out<Integer> x, @NotNull Out<Integer> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            gtk_label_get_layout_offsets.invokeExact(handle(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_INT, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle gtk_label_get_lines = Interop.downcallHandle(
        "gtk_label_get_lines",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of lines to which an ellipsized, wrapping
     * label should be limited.
     * <p>
     * See {@link Label#setLines}.
     */
    public int getLines() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_lines.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_label_get_max_width_chars = Interop.downcallHandle(
        "gtk_label_get_max_width_chars",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the desired maximum width of {@code label}, in characters.
     * <p>
     * See {@link Label#setWidthChars}.
     */
    public int getMaxWidthChars() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_max_width_chars.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_label_get_mnemonic_keyval = Interop.downcallHandle(
        "gtk_label_get_mnemonic_keyval",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Return the mnemonic accelerator.
     * <p>
     * If the label has been set so that it has a mnemonic key this function
     * returns the keyval used for the mnemonic accelerator. If there is no
     * mnemonic set up it returns {@code GDK_KEY_VoidSymbol}.
     */
    public int getMnemonicKeyval() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_mnemonic_keyval.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_label_get_mnemonic_widget = Interop.downcallHandle(
        "gtk_label_get_mnemonic_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the target of the mnemonic (keyboard shortcut) of this
     * label.
     * <p>
     * See {@link Label#setMnemonicWidget}.
     */
    public @Nullable Widget getMnemonicWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_label_get_mnemonic_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_label_get_natural_wrap_mode = Interop.downcallHandle(
        "gtk_label_get_natural_wrap_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns line wrap mode used by the label.
     * <p>
     * See {@link Label#setNaturalWrapMode}.
     */
    public @NotNull NaturalWrapMode getNaturalWrapMode() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_natural_wrap_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new NaturalWrapMode(RESULT);
    }
    
    private static final MethodHandle gtk_label_get_selectable = Interop.downcallHandle(
        "gtk_label_get_selectable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the label is selectable.
     */
    public boolean getSelectable() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_selectable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_label_get_selection_bounds = Interop.downcallHandle(
        "gtk_label_get_selection_bounds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the selected range of characters in the label.
     */
    public boolean getSelectionBounds(@NotNull Out<Integer> start, @NotNull Out<Integer> end) {
        MemorySegment startPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment endPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_selection_bounds.invokeExact(handle(), (Addressable) startPOINTER.address(), (Addressable) endPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        start.set(startPOINTER.get(ValueLayout.JAVA_INT, 0));
        end.set(endPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_label_get_single_line_mode = Interop.downcallHandle(
        "gtk_label_get_single_line_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the label is in single line mode.
     */
    public boolean getSingleLineMode() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_single_line_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_label_get_text = Interop.downcallHandle(
        "gtk_label_get_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the text from a label.
     * <p>
     * The returned text is as it appears on screen. This does not include
     * any embedded underlines indicating mnemonics or Pango markup. (See
     * {@link Label#getLabel})
     */
    public @NotNull java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_label_get_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_label_get_use_markup = Interop.downcallHandle(
        "gtk_label_get_use_markup",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the label’s text is interpreted as Pango markup.
     * <p>
     * See {@link Label#setUseMarkup}.
     */
    public boolean getUseMarkup() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_use_markup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_label_get_use_underline = Interop.downcallHandle(
        "gtk_label_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether an embedded underlines in the label indicate mnemonics.
     * <p>
     * See {@link Label#setUseUnderline}.
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_label_get_width_chars = Interop.downcallHandle(
        "gtk_label_get_width_chars",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the desired width of {@code label}, in characters.
     * <p>
     * See {@link Label#setWidthChars}.
     */
    public int getWidthChars() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_width_chars.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_label_get_wrap = Interop.downcallHandle(
        "gtk_label_get_wrap",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether lines in the label are automatically wrapped.
     * <p>
     * See {@link Label#setWrap}.
     */
    public boolean getWrap() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_wrap.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_label_get_wrap_mode = Interop.downcallHandle(
        "gtk_label_get_wrap_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns line wrap mode used by the label.
     * <p>
     * See {@link Label#setWrapMode}.
     */
    public @NotNull org.pango.WrapMode getWrapMode() {
        int RESULT;
        try {
            RESULT = (int) gtk_label_get_wrap_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.WrapMode(RESULT);
    }
    
    private static final MethodHandle gtk_label_get_xalign = Interop.downcallHandle(
        "gtk_label_get_xalign",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code xalign} of the label.
     * <p>
     * See the {@code Gtk.Label:xalign} property.
     */
    public float getXalign() {
        float RESULT;
        try {
            RESULT = (float) gtk_label_get_xalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_label_get_yalign = Interop.downcallHandle(
        "gtk_label_get_yalign",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code yalign} of the label.
     * <p>
     * See the {@code Gtk.Label:yalign} property.
     */
    public float getYalign() {
        float RESULT;
        try {
            RESULT = (float) gtk_label_get_yalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_label_select_region = Interop.downcallHandle(
        "gtk_label_select_region",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Selects a range of characters in the label, if the label is selectable.
     * <p>
     * See {@link Label#setSelectable}. If the label is not selectable,
     * this function has no effect. If {@code start_offset} or
     * {@code end_offset} are -1, then the end of the label will be substituted.
     */
    public @NotNull void selectRegion(@NotNull int startOffset, @NotNull int endOffset) {
        try {
            gtk_label_select_region.invokeExact(handle(), startOffset, endOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_attributes = Interop.downcallHandle(
        "gtk_label_set_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Apply attributes to the label text.
     * <p>
     * The attributes set with this function will be applied and merged with
     * any other attributes previously effected by way of the
     * {@code Gtk.Label:use-markup}
     * properties. While it is not recommended to mix markup strings with
     * manually set attributes, if you must; know that the attributes will
     * be applied to the label after the markup string is parsed.
     */
    public @NotNull void setAttributes(@Nullable org.pango.AttrList attrs) {
        try {
            gtk_label_set_attributes.invokeExact(handle(), attrs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_ellipsize = Interop.downcallHandle(
        "gtk_label_set_ellipsize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the mode used to ellipsizei the text.
     * <p>
     * The text will be ellipsized if there is not enough space
     * to render the entire string.
     */
    public @NotNull void setEllipsize(@NotNull org.pango.EllipsizeMode mode) {
        try {
            gtk_label_set_ellipsize.invokeExact(handle(), mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_extra_menu = Interop.downcallHandle(
        "gtk_label_set_extra_menu",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code label}.
     */
    public @NotNull void setExtraMenu(@Nullable org.gtk.gio.MenuModel model) {
        try {
            gtk_label_set_extra_menu.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_justify = Interop.downcallHandle(
        "gtk_label_set_justify",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the alignment of the lines in the text of the label relative to
     * each other.
     * <p>
     * {@link Justification#LEFT} is the default value when the widget is first created
     * with {@link Label#Label}. If you instead want to set the alignment of
     * the label as a whole, use {@link Widget#setHalign} instead.
     * {@link Label#setJustify} has no effect on labels containing
     * only a single line.
     */
    public @NotNull void setJustify(@NotNull Justification jtype) {
        try {
            gtk_label_set_justify.invokeExact(handle(), jtype.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_label = Interop.downcallHandle(
        "gtk_label_set_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text of the label.
     * <p>
     * The label is interpreted as including embedded underlines and/or Pango
     * markup depending on the values of the {@code Gtk.Label:use-underline}
     * and {@code Gtk.Label:use-markup} properties.
     */
    public @NotNull void setLabel(@NotNull java.lang.String str) {
        try {
            gtk_label_set_label.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_lines = Interop.downcallHandle(
        "gtk_label_set_lines",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of lines to which an ellipsized, wrapping label
     * should be limited.
     * <p>
     * This has no effect if the label is not wrapping or ellipsized.
     * Set this to -1 if you don’t want to limit the number of lines.
     */
    public @NotNull void setLines(@NotNull int lines) {
        try {
            gtk_label_set_lines.invokeExact(handle(), lines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_markup = Interop.downcallHandle(
        "gtk_label_set_markup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the labels text and attributes from markup.
     * <p>
     * The string must be marked up with Pango markup
     * (see {@link Pango#parseMarkup}).
     * <p>
     * If the {@code str} is external data, you may need to escape it
     * with g_markup_escape_text() or g_markup_printf_escaped():
     * 
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
     */
    public @NotNull void setMarkup(@NotNull java.lang.String str) {
        try {
            gtk_label_set_markup.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_markup_with_mnemonic = Interop.downcallHandle(
        "gtk_label_set_markup_with_mnemonic",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the labels text, attributes and mnemonic from markup.
     * <p>
     * Parses {@code str} which is marked up with Pango markup (see {@link Pango#parseMarkup}),
     * setting the label’s text and attribute list based on the parse results.
     * If characters in {@code str} are preceded by an underscore, they are underlined
     * indicating that they represent a keyboard accelerator called a mnemonic.
     * <p>
     * The mnemonic key can be used to activate another widget, chosen
     * automatically, or explicitly using {@link Label#setMnemonicWidget}.
     */
    public @NotNull void setMarkupWithMnemonic(@NotNull java.lang.String str) {
        try {
            gtk_label_set_markup_with_mnemonic.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_max_width_chars = Interop.downcallHandle(
        "gtk_label_set_max_width_chars",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the desired maximum width in characters of {@code label} to {@code n_chars}.
     */
    public @NotNull void setMaxWidthChars(@NotNull int nChars) {
        try {
            gtk_label_set_max_width_chars.invokeExact(handle(), nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_mnemonic_widget = Interop.downcallHandle(
        "gtk_label_set_mnemonic_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void setMnemonicWidget(@Nullable Widget widget) {
        try {
            gtk_label_set_mnemonic_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_natural_wrap_mode = Interop.downcallHandle(
        "gtk_label_set_natural_wrap_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Select the line wrapping for the natural size request.
     * <p>
     * This only affects the natural size requested, for the actual wrapping used,
     * see the {@code Gtk.Label:wrap-mode} property.
     */
    public @NotNull void setNaturalWrapMode(@NotNull NaturalWrapMode wrapMode) {
        try {
            gtk_label_set_natural_wrap_mode.invokeExact(handle(), wrapMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_selectable = Interop.downcallHandle(
        "gtk_label_set_selectable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Makes text in the label selectable.
     * <p>
     * Selectable labels allow the user to select text from the label,
     * for copy-and-paste.
     */
    public @NotNull void setSelectable(@NotNull boolean setting) {
        try {
            gtk_label_set_selectable.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_single_line_mode = Interop.downcallHandle(
        "gtk_label_set_single_line_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the label is in single line mode.
     */
    public @NotNull void setSingleLineMode(@NotNull boolean singleLineMode) {
        try {
            gtk_label_set_single_line_mode.invokeExact(handle(), singleLineMode ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_text = Interop.downcallHandle(
        "gtk_label_set_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void setText(@NotNull java.lang.String str) {
        try {
            gtk_label_set_text.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_text_with_mnemonic = Interop.downcallHandle(
        "gtk_label_set_text_with_mnemonic",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the label’s text from the string {@code str}.
     * <p>
     * If characters in {@code str} are preceded by an underscore, they are underlined
     * indicating that they represent a keyboard accelerator called a mnemonic.
     * The mnemonic key can be used to activate another widget, chosen
     * automatically, or explicitly using {@link Label#setMnemonicWidget}.
     */
    public @NotNull void setTextWithMnemonic(@NotNull java.lang.String str) {
        try {
            gtk_label_set_text_with_mnemonic.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_use_markup = Interop.downcallHandle(
        "gtk_label_set_use_markup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the text of the label contains markup.
     * <p>
     * See {@link Label#setMarkup}.
     */
    public @NotNull void setUseMarkup(@NotNull boolean setting) {
        try {
            gtk_label_set_use_markup.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_use_underline = Interop.downcallHandle(
        "gtk_label_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether underlines in the text indicate mnemonics.
     */
    public @NotNull void setUseUnderline(@NotNull boolean setting) {
        try {
            gtk_label_set_use_underline.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_width_chars = Interop.downcallHandle(
        "gtk_label_set_width_chars",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the desired width in characters of {@code label} to {@code n_chars}.
     */
    public @NotNull void setWidthChars(@NotNull int nChars) {
        try {
            gtk_label_set_width_chars.invokeExact(handle(), nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_wrap = Interop.downcallHandle(
        "gtk_label_set_wrap",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void setWrap(@NotNull boolean wrap) {
        try {
            gtk_label_set_wrap.invokeExact(handle(), wrap ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_wrap_mode = Interop.downcallHandle(
        "gtk_label_set_wrap_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Controls how line wrapping is done.
     * <p>
     * This only affects the label if line wrapping is on. (See
     * {@link Label#setWrap}) The default is {@link org.pango.WrapMode#WORD}
     * which means wrap on word boundaries.
     * <p>
     * For sizing behavior, also consider the {@code Gtk.Label:natural-wrap-mode}
     * property.
     */
    public @NotNull void setWrapMode(@NotNull org.pango.WrapMode wrapMode) {
        try {
            gtk_label_set_wrap_mode.invokeExact(handle(), wrapMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_xalign = Interop.downcallHandle(
        "gtk_label_set_xalign",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the {@code xalign} of the label.
     * <p>
     * See the {@code Gtk.Label:xalign} property.
     */
    public @NotNull void setXalign(@NotNull float xalign) {
        try {
            gtk_label_set_xalign.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_label_set_yalign = Interop.downcallHandle(
        "gtk_label_set_yalign",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the {@code yalign} of the label.
     * <p>
     * See the {@code Gtk.Label:yalign} property.
     */
    public @NotNull void setYalign(@NotNull float yalign) {
        try {
            gtk_label_set_yalign.invokeExact(handle(), yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateCurrentLinkHandler {
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
    public SignalHandle onActivateCurrentLink(ActivateCurrentLinkHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-current-link"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Label.Callbacks.class, "signalLabelActivateCurrentLink",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateLinkHandler {
        boolean signalReceived(Label source, @NotNull java.lang.String uri);
    }
    
    /**
     * Gets emitted to activate a URI.
     * <p>
     * Applications may connect to it to override the default behaviour,
     * which is to call gtk_show_uri().
     */
    public SignalHandle onActivateLink(ActivateLinkHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-link"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Label.Callbacks.class, "signalLabelActivateLink",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CopyClipboardHandler {
        void signalReceived(Label source);
    }
    
    /**
     * Gets emitted to copy the slection to the clipboard.
     * <p>
     * The ::copy-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is Ctrl-c.
     */
    public SignalHandle onCopyClipboard(CopyClipboardHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("copy-clipboard"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Label.Callbacks.class, "signalLabelCopyClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        void signalReceived(Label source, @NotNull MovementStep step, @NotNull int count, @NotNull boolean extendSelection);
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
     */
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Label.Callbacks.class, "signalLabelMoveCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalLabelActivateCurrentLink(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Label.ActivateCurrentLinkHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Label(Refcounted.get(source)));
        }
        
        public static boolean signalLabelActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Label.ActivateLinkHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Label(Refcounted.get(source)), uri.getUtf8String(0));
        }
        
        public static void signalLabelCopyClipboard(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Label.CopyClipboardHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Label(Refcounted.get(source)));
        }
        
        public static void signalLabelMoveCursor(MemoryAddress source, int step, int count, int extendSelection, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Label.MoveCursorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Label(Refcounted.get(source)), new MovementStep(step), count, extendSelection != 0);
        }
        
    }
}
