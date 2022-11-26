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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.CellRenderer.getMemoryLayout().withName("parent")
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
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gtk.CellRenderer parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gtk.CellRenderer(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a CellRendererText proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellRendererText(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CellRendererText if its GType is a (or inherits from) "GtkCellRendererText".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellRendererText} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererText", a ClassCastException will be thrown.
     */
    public static CellRendererText castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), CellRendererText.getType())) {
            return new CellRendererText(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellRendererText");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(CellRendererText source, @NotNull java.lang.String path, @NotNull java.lang.String newText);
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
                handle(),
                Interop.allocateNativeString("edited"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererText.Callbacks.class, "signalCellRendererTextEdited",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellRendererText.Edited>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.CellRenderer.Build {
        
         /**
         * A {@link CellRendererText.Build} object constructs a {@link CellRendererText} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CellRendererText} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererText} using {@link CellRendererText#castFrom}.
         * @return A new instance of {@code CellRendererText} with the properties 
         *         that were set in the Build object.
         */
        public CellRendererText construct() {
            return CellRendererText.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CellRendererText.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setAlignSet(boolean alignSet) {
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
        public Build setAlignment(org.pango.Alignment alignment) {
            names.add("alignment");
            values.add(org.gtk.gobject.Value.create(alignment));
            return this;
        }
        
        public Build setAttributes(org.pango.AttrList attributes) {
            names.add("attributes");
            values.add(org.gtk.gobject.Value.create(attributes));
            return this;
        }
        
        public Build setBackground(java.lang.String background) {
            names.add("background");
            values.add(org.gtk.gobject.Value.create(background));
            return this;
        }
        
        /**
         * Background color as a {@code GdkRGBA}
         * @param backgroundRgba The value for the {@code background-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBackgroundRgba(org.gtk.gdk.RGBA backgroundRgba) {
            names.add("background-rgba");
            values.add(org.gtk.gobject.Value.create(backgroundRgba));
            return this;
        }
        
        public Build setBackgroundSet(boolean backgroundSet) {
            names.add("background-set");
            values.add(org.gtk.gobject.Value.create(backgroundSet));
            return this;
        }
        
        public Build setEditable(boolean editable) {
            names.add("editable");
            values.add(org.gtk.gobject.Value.create(editable));
            return this;
        }
        
        public Build setEditableSet(boolean editableSet) {
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
        public Build setEllipsize(org.pango.EllipsizeMode ellipsize) {
            names.add("ellipsize");
            values.add(org.gtk.gobject.Value.create(ellipsize));
            return this;
        }
        
        public Build setEllipsizeSet(boolean ellipsizeSet) {
            names.add("ellipsize-set");
            values.add(org.gtk.gobject.Value.create(ellipsizeSet));
            return this;
        }
        
        public Build setFamily(java.lang.String family) {
            names.add("family");
            values.add(org.gtk.gobject.Value.create(family));
            return this;
        }
        
        public Build setFamilySet(boolean familySet) {
            names.add("family-set");
            values.add(org.gtk.gobject.Value.create(familySet));
            return this;
        }
        
        public Build setFont(java.lang.String font) {
            names.add("font");
            values.add(org.gtk.gobject.Value.create(font));
            return this;
        }
        
        public Build setFontDesc(org.pango.FontDescription fontDesc) {
            names.add("font-desc");
            values.add(org.gtk.gobject.Value.create(fontDesc));
            return this;
        }
        
        public Build setForeground(java.lang.String foreground) {
            names.add("foreground");
            values.add(org.gtk.gobject.Value.create(foreground));
            return this;
        }
        
        /**
         * Foreground color as a {@code GdkRGBA}
         * @param foregroundRgba The value for the {@code foreground-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setForegroundRgba(org.gtk.gdk.RGBA foregroundRgba) {
            names.add("foreground-rgba");
            values.add(org.gtk.gobject.Value.create(foregroundRgba));
            return this;
        }
        
        public Build setForegroundSet(boolean foregroundSet) {
            names.add("foreground-set");
            values.add(org.gtk.gobject.Value.create(foregroundSet));
            return this;
        }
        
        public Build setLanguage(java.lang.String language) {
            names.add("language");
            values.add(org.gtk.gobject.Value.create(language));
            return this;
        }
        
        public Build setLanguageSet(boolean languageSet) {
            names.add("language-set");
            values.add(org.gtk.gobject.Value.create(languageSet));
            return this;
        }
        
        public Build setMarkup(java.lang.String markup) {
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
        public Build setMaxWidthChars(int maxWidthChars) {
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
        public Build setPlaceholderText(java.lang.String placeholderText) {
            names.add("placeholder-text");
            values.add(org.gtk.gobject.Value.create(placeholderText));
            return this;
        }
        
        public Build setRise(int rise) {
            names.add("rise");
            values.add(org.gtk.gobject.Value.create(rise));
            return this;
        }
        
        public Build setRiseSet(boolean riseSet) {
            names.add("rise-set");
            values.add(org.gtk.gobject.Value.create(riseSet));
            return this;
        }
        
        public Build setScale(double scale) {
            names.add("scale");
            values.add(org.gtk.gobject.Value.create(scale));
            return this;
        }
        
        public Build setScaleSet(boolean scaleSet) {
            names.add("scale-set");
            values.add(org.gtk.gobject.Value.create(scaleSet));
            return this;
        }
        
        public Build setSingleParagraphMode(boolean singleParagraphMode) {
            names.add("single-paragraph-mode");
            values.add(org.gtk.gobject.Value.create(singleParagraphMode));
            return this;
        }
        
        public Build setSize(int size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
        
        public Build setSizePoints(double sizePoints) {
            names.add("size-points");
            values.add(org.gtk.gobject.Value.create(sizePoints));
            return this;
        }
        
        public Build setSizeSet(boolean sizeSet) {
            names.add("size-set");
            values.add(org.gtk.gobject.Value.create(sizeSet));
            return this;
        }
        
        public Build setStretch(org.pango.Stretch stretch) {
            names.add("stretch");
            values.add(org.gtk.gobject.Value.create(stretch));
            return this;
        }
        
        public Build setStretchSet(boolean stretchSet) {
            names.add("stretch-set");
            values.add(org.gtk.gobject.Value.create(stretchSet));
            return this;
        }
        
        public Build setStrikethrough(boolean strikethrough) {
            names.add("strikethrough");
            values.add(org.gtk.gobject.Value.create(strikethrough));
            return this;
        }
        
        public Build setStrikethroughSet(boolean strikethroughSet) {
            names.add("strikethrough-set");
            values.add(org.gtk.gobject.Value.create(strikethroughSet));
            return this;
        }
        
        public Build setStyle(org.pango.Style style) {
            names.add("style");
            values.add(org.gtk.gobject.Value.create(style));
            return this;
        }
        
        public Build setStyleSet(boolean styleSet) {
            names.add("style-set");
            values.add(org.gtk.gobject.Value.create(styleSet));
            return this;
        }
        
        public Build setText(java.lang.String text) {
            names.add("text");
            values.add(org.gtk.gobject.Value.create(text));
            return this;
        }
        
        public Build setUnderline(org.pango.Underline underline) {
            names.add("underline");
            values.add(org.gtk.gobject.Value.create(underline));
            return this;
        }
        
        public Build setUnderlineSet(boolean underlineSet) {
            names.add("underline-set");
            values.add(org.gtk.gobject.Value.create(underlineSet));
            return this;
        }
        
        public Build setVariant(org.pango.Variant variant) {
            names.add("variant");
            values.add(org.gtk.gobject.Value.create(variant));
            return this;
        }
        
        public Build setVariantSet(boolean variantSet) {
            names.add("variant-set");
            values.add(org.gtk.gobject.Value.create(variantSet));
            return this;
        }
        
        public Build setWeight(int weight) {
            names.add("weight");
            values.add(org.gtk.gobject.Value.create(weight));
            return this;
        }
        
        public Build setWeightSet(boolean weightSet) {
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
        public Build setWidthChars(int widthChars) {
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
        public Build setWrapMode(org.pango.WrapMode wrapMode) {
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
        public Build setWrapWidth(int wrapWidth) {
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
    
    private static class Callbacks {
        
        public static void signalCellRendererTextEdited(MemoryAddress source, MemoryAddress path, MemoryAddress newText, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CellRendererText.Edited) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellRendererText(source, Ownership.NONE), Interop.getStringFrom(path), Interop.getStringFrom(newText));
        }
    }
}
