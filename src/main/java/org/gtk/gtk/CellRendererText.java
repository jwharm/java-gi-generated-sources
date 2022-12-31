package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders text in a cell
 * <p>
 * A {@code GtkCellRendererText} renders a given text in its cell, using the font, color and
 * style information provided by its properties. The text will be ellipsized if it is
 * too long and the {@code GtkCellRendererText:ellipsize} property allows it.
 * <p>
 * If the {@code GtkCellRenderer:mode} is {@link CellRendererMode#EDITABLE},
 * the {@code GtkCellRendererText} allows to edit its text using an entry.
 */
public class CellRendererText extends org.gtk.gtk.CellRenderer {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererText";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.CellRenderer.getMemoryLayout().withName("parent")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a CellRendererText proxy instance for the provided memory address.
     * <p>
     * Because CellRendererText is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellRendererText(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRendererText> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererText(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_text_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererText}. Adjust how text is drawn using
     * object properties. Object properties can be
     * set globally (with g_object_set()). Also, with {@code GtkTreeViewColumn},
     * you can bind a property to a value in a {@code GtkTreeModel}. For example,
     * you can bind the “text” property on the cell renderer to a string
     * value in the model, thus rendering a different string in each row
     * of the {@code GtkTreeView}.
     */
    public CellRendererText() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Sets the height of a renderer to explicitly be determined by the “font” and
     * “y_pad” property set on it.  Further changes in these properties do not
     * affect the height, so they must be accompanied by a subsequent call to this
     * function.  Using this function is inflexible, and should really only be used
     * if calculating the size of a cell is too slow (ie, a massive number of cells
     * displayed).  If {@code number_of_rows} is -1, then the fixed height is unset, and
     * the height is determined by the properties again.
     * @param numberOfRows Number of rows of text each cell renderer is allocated, or -1
     */
    public void setFixedHeightFromFont(int numberOfRows) {
        try {
            DowncallHandles.gtk_cell_renderer_text_set_fixed_height_from_font.invokeExact(
                    handle(),
                    numberOfRows);
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
            RESULT = (long) DowncallHandles.gtk_cell_renderer_text_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Edited {
        void run(java.lang.String path, java.lang.String newText);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceCellRendererText, MemoryAddress path, MemoryAddress newText) {
            run(Marshal.addressToString.marshal(path, null), Marshal.addressToString.marshal(newText, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Edited.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * This signal is emitted after {@code renderer} has been edited.
     * <p>
     * It is the responsibility of the application to update the model
     * and store {@code new_text} at the position indicated by {@code path}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellRendererText.Edited> onEdited(CellRendererText.Edited handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("edited"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link CellRendererText.Builder} object constructs a {@link CellRendererText} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellRendererText.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.CellRenderer.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellRendererText} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererText}.
         * @return A new instance of {@code CellRendererText} with the properties 
         *         that were set in the Builder object.
         */
        public CellRendererText build() {
            return (CellRendererText) org.gtk.gobject.GObject.newWithProperties(
                CellRendererText.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAlignSet(boolean alignSet) {
            names.add("align-set");
            values.add(org.gtk.gobject.Value.create(alignSet));
            return this;
        }
        
        /**
         * Specifies how to align the lines of text with respect to each other.
         * <p>
         * Note that this property describes how to align the lines of text in
         * case there are several of them. The "xalign" property of {@code GtkCellRenderer},
         * on the other hand, sets the horizontal alignment of the whole text.
         * @param alignment The value for the {@code alignment} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAlignment(org.pango.Alignment alignment) {
            names.add("alignment");
            values.add(org.gtk.gobject.Value.create(alignment));
            return this;
        }
        
        public Builder setAttributes(org.pango.AttrList attributes) {
            names.add("attributes");
            values.add(org.gtk.gobject.Value.create(attributes));
            return this;
        }
        
        public Builder setBackground(java.lang.String background) {
            names.add("background");
            values.add(org.gtk.gobject.Value.create(background));
            return this;
        }
        
        /**
         * Background color as a {@code GdkRGBA}
         * @param backgroundRgba The value for the {@code background-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBackgroundRgba(org.gtk.gdk.RGBA backgroundRgba) {
            names.add("background-rgba");
            values.add(org.gtk.gobject.Value.create(backgroundRgba));
            return this;
        }
        
        public Builder setBackgroundSet(boolean backgroundSet) {
            names.add("background-set");
            values.add(org.gtk.gobject.Value.create(backgroundSet));
            return this;
        }
        
        public Builder setEditable(boolean editable) {
            names.add("editable");
            values.add(org.gtk.gobject.Value.create(editable));
            return this;
        }
        
        public Builder setEditableSet(boolean editableSet) {
            names.add("editable-set");
            values.add(org.gtk.gobject.Value.create(editableSet));
            return this;
        }
        
        /**
         * Specifies the preferred place to ellipsize the string, if the cell renderer
         * does not have enough room to display the entire string. Setting it to
         * {@link org.pango.EllipsizeMode#NONE} turns off ellipsizing. See the wrap-width property
         * for another way of making the text fit into a given width.
         * @param ellipsize The value for the {@code ellipsize} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEllipsize(org.pango.EllipsizeMode ellipsize) {
            names.add("ellipsize");
            values.add(org.gtk.gobject.Value.create(ellipsize));
            return this;
        }
        
        public Builder setEllipsizeSet(boolean ellipsizeSet) {
            names.add("ellipsize-set");
            values.add(org.gtk.gobject.Value.create(ellipsizeSet));
            return this;
        }
        
        public Builder setFamily(java.lang.String family) {
            names.add("family");
            values.add(org.gtk.gobject.Value.create(family));
            return this;
        }
        
        public Builder setFamilySet(boolean familySet) {
            names.add("family-set");
            values.add(org.gtk.gobject.Value.create(familySet));
            return this;
        }
        
        public Builder setFont(java.lang.String font) {
            names.add("font");
            values.add(org.gtk.gobject.Value.create(font));
            return this;
        }
        
        public Builder setFontDesc(org.pango.FontDescription fontDesc) {
            names.add("font-desc");
            values.add(org.gtk.gobject.Value.create(fontDesc));
            return this;
        }
        
        public Builder setForeground(java.lang.String foreground) {
            names.add("foreground");
            values.add(org.gtk.gobject.Value.create(foreground));
            return this;
        }
        
        /**
         * Foreground color as a {@code GdkRGBA}
         * @param foregroundRgba The value for the {@code foreground-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setForegroundRgba(org.gtk.gdk.RGBA foregroundRgba) {
            names.add("foreground-rgba");
            values.add(org.gtk.gobject.Value.create(foregroundRgba));
            return this;
        }
        
        public Builder setForegroundSet(boolean foregroundSet) {
            names.add("foreground-set");
            values.add(org.gtk.gobject.Value.create(foregroundSet));
            return this;
        }
        
        public Builder setLanguage(java.lang.String language) {
            names.add("language");
            values.add(org.gtk.gobject.Value.create(language));
            return this;
        }
        
        public Builder setLanguageSet(boolean languageSet) {
            names.add("language-set");
            values.add(org.gtk.gobject.Value.create(languageSet));
            return this;
        }
        
        public Builder setMarkup(java.lang.String markup) {
            names.add("markup");
            values.add(org.gtk.gobject.Value.create(markup));
            return this;
        }
        
        /**
         * The desired maximum width of the cell, in characters. If this property
         * is set to -1, the width will be calculated automatically.
         * <p>
         * For cell renderers that ellipsize or wrap text; this property
         * controls the maximum reported width of the cell. The
         * cell should not receive any greater allocation unless it is
         * set to expand in its {@code GtkCellLayout} and all of the cell's siblings
         * have received their natural width.
         * @param maxWidthChars The value for the {@code max-width-chars} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxWidthChars(int maxWidthChars) {
            names.add("max-width-chars");
            values.add(org.gtk.gobject.Value.create(maxWidthChars));
            return this;
        }
        
        /**
         * The text that will be displayed in the {@code GtkCellRenderer} if
         * {@code GtkCellRendererText:editable} is {@code true} and the cell is empty.
         * @param placeholderText The value for the {@code placeholder-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPlaceholderText(java.lang.String placeholderText) {
            names.add("placeholder-text");
            values.add(org.gtk.gobject.Value.create(placeholderText));
            return this;
        }
        
        public Builder setRise(int rise) {
            names.add("rise");
            values.add(org.gtk.gobject.Value.create(rise));
            return this;
        }
        
        public Builder setRiseSet(boolean riseSet) {
            names.add("rise-set");
            values.add(org.gtk.gobject.Value.create(riseSet));
            return this;
        }
        
        public Builder setScale(double scale) {
            names.add("scale");
            values.add(org.gtk.gobject.Value.create(scale));
            return this;
        }
        
        public Builder setScaleSet(boolean scaleSet) {
            names.add("scale-set");
            values.add(org.gtk.gobject.Value.create(scaleSet));
            return this;
        }
        
        public Builder setSingleParagraphMode(boolean singleParagraphMode) {
            names.add("single-paragraph-mode");
            values.add(org.gtk.gobject.Value.create(singleParagraphMode));
            return this;
        }
        
        public Builder setSize(int size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
        
        public Builder setSizePoints(double sizePoints) {
            names.add("size-points");
            values.add(org.gtk.gobject.Value.create(sizePoints));
            return this;
        }
        
        public Builder setSizeSet(boolean sizeSet) {
            names.add("size-set");
            values.add(org.gtk.gobject.Value.create(sizeSet));
            return this;
        }
        
        public Builder setStretch(org.pango.Stretch stretch) {
            names.add("stretch");
            values.add(org.gtk.gobject.Value.create(stretch));
            return this;
        }
        
        public Builder setStretchSet(boolean stretchSet) {
            names.add("stretch-set");
            values.add(org.gtk.gobject.Value.create(stretchSet));
            return this;
        }
        
        public Builder setStrikethrough(boolean strikethrough) {
            names.add("strikethrough");
            values.add(org.gtk.gobject.Value.create(strikethrough));
            return this;
        }
        
        public Builder setStrikethroughSet(boolean strikethroughSet) {
            names.add("strikethrough-set");
            values.add(org.gtk.gobject.Value.create(strikethroughSet));
            return this;
        }
        
        public Builder setStyle(org.pango.Style style) {
            names.add("style");
            values.add(org.gtk.gobject.Value.create(style));
            return this;
        }
        
        public Builder setStyleSet(boolean styleSet) {
            names.add("style-set");
            values.add(org.gtk.gobject.Value.create(styleSet));
            return this;
        }
        
        public Builder setText(java.lang.String text) {
            names.add("text");
            values.add(org.gtk.gobject.Value.create(text));
            return this;
        }
        
        public Builder setUnderline(org.pango.Underline underline) {
            names.add("underline");
            values.add(org.gtk.gobject.Value.create(underline));
            return this;
        }
        
        public Builder setUnderlineSet(boolean underlineSet) {
            names.add("underline-set");
            values.add(org.gtk.gobject.Value.create(underlineSet));
            return this;
        }
        
        public Builder setVariant(org.pango.Variant variant) {
            names.add("variant");
            values.add(org.gtk.gobject.Value.create(variant));
            return this;
        }
        
        public Builder setVariantSet(boolean variantSet) {
            names.add("variant-set");
            values.add(org.gtk.gobject.Value.create(variantSet));
            return this;
        }
        
        public Builder setWeight(int weight) {
            names.add("weight");
            values.add(org.gtk.gobject.Value.create(weight));
            return this;
        }
        
        public Builder setWeightSet(boolean weightSet) {
            names.add("weight-set");
            values.add(org.gtk.gobject.Value.create(weightSet));
            return this;
        }
        
        /**
         * The desired width of the cell, in characters. If this property is set to
         * -1, the width will be calculated automatically, otherwise the cell will
         * request either 3 characters or the property value, whichever is greater.
         * @param widthChars The value for the {@code width-chars} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidthChars(int widthChars) {
            names.add("width-chars");
            values.add(org.gtk.gobject.Value.create(widthChars));
            return this;
        }
        
        /**
         * Specifies how to break the string into multiple lines, if the cell
         * renderer does not have enough room to display the entire string.
         * This property has no effect unless the wrap-width property is set.
         * @param wrapMode The value for the {@code wrap-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWrapMode(org.pango.WrapMode wrapMode) {
            names.add("wrap-mode");
            values.add(org.gtk.gobject.Value.create(wrapMode));
            return this;
        }
        
        /**
         * Specifies the minimum width at which the text is wrapped. The wrap-mode property can
         * be used to influence at what character positions the line breaks can be placed.
         * Setting wrap-width to -1 turns wrapping off.
         * @param wrapWidth The value for the {@code wrap-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWrapWidth(int wrapWidth) {
            names.add("wrap-width");
            values.add(org.gtk.gobject.Value.create(wrapWidth));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_text_new = Interop.downcallHandle(
            "gtk_cell_renderer_text_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_text_set_fixed_height_from_font = Interop.downcallHandle(
            "gtk_cell_renderer_text_set_fixed_height_from_font",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_text_get_type = Interop.downcallHandle(
            "gtk_cell_renderer_text_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
