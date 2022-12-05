package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A tag that can be applied to text contained in a {@code GtkTextBuffer}.
 * <p>
 * You may wish to begin by reading the
 * <a href="section-text-widget.html">text widget conceptual overview</a>,
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * <p>
 * Tags should be in the {@link TextTagTable} for a given
 * {@code GtkTextBuffer} before using them with that buffer.
 * <p>
 * {@link TextBuffer#createTag} is the best way to create tags.
 * See “gtk4-demo” for numerous examples.
 * <p>
 * For each property of {@code GtkTextTag}, there is a “set” property, e.g.
 * “font-set” corresponds to “font”. These “set” properties reflect
 * whether a property has been set or not.
 * <p>
 * They are maintained by GTK and you should not set them independently.
 */
public class TextTag extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextTag";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
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
     * Create a TextTag proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextTag(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TextTag if its GType is a (or inherits from) "GtkTextTag".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TextTag} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTextTag", a ClassCastException will be thrown.
     */
    public static TextTag castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TextTag.getType())) {
            return new TextTag(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTextTag");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String name) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_tag_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkTextTag}.
     * @param name tag name
     */
    public TextTag(@Nullable java.lang.String name) {
        super(constructNew(name), Ownership.FULL);
    }
    
    /**
     * Emits the {@code Gtk.TextTagTable::tag-changed} signal on the
     * {@code GtkTextTagTable} where the tag is included.
     * <p>
     * The signal is already emitted when setting a {@code GtkTextTag} property.
     * This function is useful for a {@code GtkTextTag} subclass.
     * @param sizeChanged whether the change affects the {@code GtkTextView} layout
     */
    public void changed(boolean sizeChanged) {
        try {
            DowncallHandles.gtk_text_tag_changed.invokeExact(
                    handle(),
                    sizeChanged ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the tag priority.
     * @return The tag’s priority.
     */
    public int getPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_tag_get_priority.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the priority of a {@code GtkTextTag}.
     * <p>
     * Valid priorities start at 0 and go to one less than
     * {@link TextTagTable#getSize}. Each tag in a table
     * has a unique priority; setting the priority of one tag shifts
     * the priorities of all the other tags in the table to maintain
     * a unique priority for each tag.
     * <p>
     * Higher priority tags “win” if two tags both set the same text
     * attribute. When adding a tag to a tag table, it will be assigned
     * the highest priority in the table by default; so normally the
     * precedence of a set of tags is the order in which they were added
     * to the table, or created with {@link TextBuffer#createTag},
     * which adds the tag to the buffer’s table automatically.
     * @param priority the new priority
     */
    public void setPriority(int priority) {
        try {
            DowncallHandles.gtk_text_tag_set_priority.invokeExact(
                    handle(),
                    priority);
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
            RESULT = (long) DowncallHandles.gtk_text_tag_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link TextTag.Build} object constructs a {@link TextTag} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TextTag} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TextTag} using {@link TextTag#castFrom}.
         * @return A new instance of {@code TextTag} with the properties 
         *         that were set in the Build object.
         */
        public TextTag construct() {
            return TextTag.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TextTag.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the margins accumulate or override each other.
         * <p>
         * When set to {@code true} the margins of this tag are added to the margins
         * of any other non-accumulative margins present. When set to {@code false}
         * the margins override one another (the default).
         * @param accumulativeMargin The value for the {@code accumulative-margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccumulativeMargin(boolean accumulativeMargin) {
            names.add("accumulative-margin");
            values.add(org.gtk.gobject.Value.create(accumulativeMargin));
            return this;
        }
        
        /**
         * Whether breaks are allowed.
         * @param allowBreaks The value for the {@code allow-breaks} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAllowBreaks(boolean allowBreaks) {
            names.add("allow-breaks");
            values.add(org.gtk.gobject.Value.create(allowBreaks));
            return this;
        }
        
        public Build setAllowBreaksSet(boolean allowBreaksSet) {
            names.add("allow-breaks-set");
            values.add(org.gtk.gobject.Value.create(allowBreaksSet));
            return this;
        }
        
        /**
         * Background color as a string.
         * @param background The value for the {@code background} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBackground(java.lang.String background) {
            names.add("background");
            values.add(org.gtk.gobject.Value.create(background));
            return this;
        }
        
        /**
         * Whether the background color fills the entire line height
         * or only the height of the tagged characters.
         * @param backgroundFullHeight The value for the {@code background-full-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBackgroundFullHeight(boolean backgroundFullHeight) {
            names.add("background-full-height");
            values.add(org.gtk.gobject.Value.create(backgroundFullHeight));
            return this;
        }
        
        public Build setBackgroundFullHeightSet(boolean backgroundFullHeightSet) {
            names.add("background-full-height-set");
            values.add(org.gtk.gobject.Value.create(backgroundFullHeightSet));
            return this;
        }
        
        /**
         * Background color as a {@code GdkRGBA}.
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
        
        /**
         * Text direction, e.g. right-to-left or left-to-right.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDirection(org.gtk.gtk.TextDirection direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * Whether the text can be modified by the user.
         * @param editable The value for the {@code editable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
         * Whether font fallback is enabled.
         * <p>
         * When set to {@code true}, other fonts will be substituted
         * where the current font is missing glyphs.
         * @param fallback The value for the {@code fallback} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFallback(boolean fallback) {
            names.add("fallback");
            values.add(org.gtk.gobject.Value.create(fallback));
            return this;
        }
        
        public Build setFallbackSet(boolean fallbackSet) {
            names.add("fallback-set");
            values.add(org.gtk.gobject.Value.create(fallbackSet));
            return this;
        }
        
        /**
         * Name of the font family, e.g. Sans, Helvetica, Times, Monospace.
         * @param family The value for the {@code family} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Font description as string, e.g. \\"Sans Italic 12\\".
         * <p>
         * Note that the initial value of this property depends on
         * the internals of {@code PangoFontDescription}.
         * @param font The value for the {@code font} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFont(java.lang.String font) {
            names.add("font");
            values.add(org.gtk.gobject.Value.create(font));
            return this;
        }
        
        /**
         * Font description as a {@code PangoFontDescription}.
         * @param fontDesc The value for the {@code font-desc} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFontDesc(org.pango.FontDescription fontDesc) {
            names.add("font-desc");
            values.add(org.gtk.gobject.Value.create(fontDesc));
            return this;
        }
        
        /**
         * OpenType font features, as a string.
         * @param fontFeatures The value for the {@code font-features} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFontFeatures(java.lang.String fontFeatures) {
            names.add("font-features");
            values.add(org.gtk.gobject.Value.create(fontFeatures));
            return this;
        }
        
        public Build setFontFeaturesSet(boolean fontFeaturesSet) {
            names.add("font-features-set");
            values.add(org.gtk.gobject.Value.create(fontFeaturesSet));
            return this;
        }
        
        /**
         * Foreground color as a string.
         * @param foreground The value for the {@code foreground} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setForeground(java.lang.String foreground) {
            names.add("foreground");
            values.add(org.gtk.gobject.Value.create(foreground));
            return this;
        }
        
        /**
         * Foreground color as a {@code GdkRGBA}.
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
        
        /**
         * Amount to indent the paragraph, in pixels.
         * @param indent The value for the {@code indent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIndent(int indent) {
            names.add("indent");
            values.add(org.gtk.gobject.Value.create(indent));
            return this;
        }
        
        public Build setIndentSet(boolean indentSet) {
            names.add("indent-set");
            values.add(org.gtk.gobject.Value.create(indentSet));
            return this;
        }
        
        /**
         * Whether to insert hyphens at breaks.
         * @param insertHyphens The value for the {@code insert-hyphens} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInsertHyphens(boolean insertHyphens) {
            names.add("insert-hyphens");
            values.add(org.gtk.gobject.Value.create(insertHyphens));
            return this;
        }
        
        public Build setInsertHyphensSet(boolean insertHyphensSet) {
            names.add("insert-hyphens-set");
            values.add(org.gtk.gobject.Value.create(insertHyphensSet));
            return this;
        }
        
        /**
         * Whether this text is hidden.
         * <p>
         * Note that there may still be problems with the support for invisible
         * text, in particular when navigating programmatically inside a buffer
         * containing invisible segments.
         * @param invisible The value for the {@code invisible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInvisible(boolean invisible) {
            names.add("invisible");
            values.add(org.gtk.gobject.Value.create(invisible));
            return this;
        }
        
        public Build setInvisibleSet(boolean invisibleSet) {
            names.add("invisible-set");
            values.add(org.gtk.gobject.Value.create(invisibleSet));
            return this;
        }
        
        /**
         * Left, right, or center justification.
         * @param justification The value for the {@code justification} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setJustification(org.gtk.gtk.Justification justification) {
            names.add("justification");
            values.add(org.gtk.gobject.Value.create(justification));
            return this;
        }
        
        public Build setJustificationSet(boolean justificationSet) {
            names.add("justification-set");
            values.add(org.gtk.gobject.Value.create(justificationSet));
            return this;
        }
        
        /**
         * The language this text is in, as an ISO code.
         * <p>
         * Pango can use this as a hint when rendering the text.
         * If not set, an appropriate default will be used.
         * <p>
         * Note that the initial value of this property depends
         * on the current locale, see also {@link Gtk#getDefaultLanguage}.
         * @param language The value for the {@code language} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Width of the left margin in pixels.
         * @param leftMargin The value for the {@code left-margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLeftMargin(int leftMargin) {
            names.add("left-margin");
            values.add(org.gtk.gobject.Value.create(leftMargin));
            return this;
        }
        
        public Build setLeftMarginSet(boolean leftMarginSet) {
            names.add("left-margin-set");
            values.add(org.gtk.gobject.Value.create(leftMarginSet));
            return this;
        }
        
        /**
         * Extra spacing between graphemes, in Pango units.
         * @param letterSpacing The value for the {@code letter-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLetterSpacing(int letterSpacing) {
            names.add("letter-spacing");
            values.add(org.gtk.gobject.Value.create(letterSpacing));
            return this;
        }
        
        public Build setLetterSpacingSet(boolean letterSpacingSet) {
            names.add("letter-spacing-set");
            values.add(org.gtk.gobject.Value.create(letterSpacingSet));
            return this;
        }
        
        /**
         * Factor to scale line height by.
         * @param lineHeight The value for the {@code line-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLineHeight(float lineHeight) {
            names.add("line-height");
            values.add(org.gtk.gobject.Value.create(lineHeight));
            return this;
        }
        
        public Build setLineHeightSet(boolean lineHeightSet) {
            names.add("line-height-set");
            values.add(org.gtk.gobject.Value.create(lineHeightSet));
            return this;
        }
        
        /**
         * The name used to refer to the tag.
         * <p>
         * {@code null} for anonymous tags.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * Style of overline for this text.
         * @param overline The value for the {@code overline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOverline(org.pango.Overline overline) {
            names.add("overline");
            values.add(org.gtk.gobject.Value.create(overline));
            return this;
        }
        
        /**
         * This property modifies the color of overlines.
         * <p>
         * If not set, overlines will use the foreground color.
         * @param overlineRgba The value for the {@code overline-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOverlineRgba(org.gtk.gdk.RGBA overlineRgba) {
            names.add("overline-rgba");
            values.add(org.gtk.gobject.Value.create(overlineRgba));
            return this;
        }
        
        public Build setOverlineRgbaSet(boolean overlineRgbaSet) {
            names.add("overline-rgba-set");
            values.add(org.gtk.gobject.Value.create(overlineRgbaSet));
            return this;
        }
        
        public Build setOverlineSet(boolean overlineSet) {
            names.add("overline-set");
            values.add(org.gtk.gobject.Value.create(overlineSet));
            return this;
        }
        
        /**
         * The paragraph background color as a string.
         * @param paragraphBackground The value for the {@code paragraph-background} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParagraphBackground(java.lang.String paragraphBackground) {
            names.add("paragraph-background");
            values.add(org.gtk.gobject.Value.create(paragraphBackground));
            return this;
        }
        
        /**
         * The paragraph background color as a {@code GdkRGBA}.
         * @param paragraphBackgroundRgba The value for the {@code paragraph-background-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParagraphBackgroundRgba(org.gtk.gdk.RGBA paragraphBackgroundRgba) {
            names.add("paragraph-background-rgba");
            values.add(org.gtk.gobject.Value.create(paragraphBackgroundRgba));
            return this;
        }
        
        public Build setParagraphBackgroundSet(boolean paragraphBackgroundSet) {
            names.add("paragraph-background-set");
            values.add(org.gtk.gobject.Value.create(paragraphBackgroundSet));
            return this;
        }
        
        /**
         * Pixels of blank space above paragraphs.
         * @param pixelsAboveLines The value for the {@code pixels-above-lines} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPixelsAboveLines(int pixelsAboveLines) {
            names.add("pixels-above-lines");
            values.add(org.gtk.gobject.Value.create(pixelsAboveLines));
            return this;
        }
        
        public Build setPixelsAboveLinesSet(boolean pixelsAboveLinesSet) {
            names.add("pixels-above-lines-set");
            values.add(org.gtk.gobject.Value.create(pixelsAboveLinesSet));
            return this;
        }
        
        /**
         * Pixels of blank space below paragraphs.
         * @param pixelsBelowLines The value for the {@code pixels-below-lines} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPixelsBelowLines(int pixelsBelowLines) {
            names.add("pixels-below-lines");
            values.add(org.gtk.gobject.Value.create(pixelsBelowLines));
            return this;
        }
        
        public Build setPixelsBelowLinesSet(boolean pixelsBelowLinesSet) {
            names.add("pixels-below-lines-set");
            values.add(org.gtk.gobject.Value.create(pixelsBelowLinesSet));
            return this;
        }
        
        /**
         * Pixels of blank space between wrapped lines in a paragraph.
         * @param pixelsInsideWrap The value for the {@code pixels-inside-wrap} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPixelsInsideWrap(int pixelsInsideWrap) {
            names.add("pixels-inside-wrap");
            values.add(org.gtk.gobject.Value.create(pixelsInsideWrap));
            return this;
        }
        
        public Build setPixelsInsideWrapSet(boolean pixelsInsideWrapSet) {
            names.add("pixels-inside-wrap-set");
            values.add(org.gtk.gobject.Value.create(pixelsInsideWrapSet));
            return this;
        }
        
        /**
         * Width of the right margin, in pixels.
         * @param rightMargin The value for the {@code right-margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRightMargin(int rightMargin) {
            names.add("right-margin");
            values.add(org.gtk.gobject.Value.create(rightMargin));
            return this;
        }
        
        public Build setRightMarginSet(boolean rightMarginSet) {
            names.add("right-margin-set");
            values.add(org.gtk.gobject.Value.create(rightMarginSet));
            return this;
        }
        
        /**
         * Offset of text above the baseline, in Pango units.
         * <p>
         * Negative values go below the baseline.
         * @param rise The value for the {@code rise} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Font size as a scale factor relative to the default font size.
         * <p>
         * This properly adapts to theme changes, etc. so is recommended.
         * Pango predefines some scales such as {@code PANGO_SCALE_X_LARGE}.
         * @param scale The value for the {@code scale} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Whether this tag represents a single sentence.
         * <p>
         * This affects cursor movement.
         * @param sentence The value for the {@code sentence} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSentence(boolean sentence) {
            names.add("sentence");
            values.add(org.gtk.gobject.Value.create(sentence));
            return this;
        }
        
        public Build setSentenceSet(boolean sentenceSet) {
            names.add("sentence-set");
            values.add(org.gtk.gobject.Value.create(sentenceSet));
            return this;
        }
        
        /**
         * How to render invisible characters.
         * @param showSpaces The value for the {@code show-spaces} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowSpaces(org.pango.ShowFlags showSpaces) {
            names.add("show-spaces");
            values.add(org.gtk.gobject.Value.create(showSpaces));
            return this;
        }
        
        public Build setShowSpacesSet(boolean showSpacesSet) {
            names.add("show-spaces-set");
            values.add(org.gtk.gobject.Value.create(showSpacesSet));
            return this;
        }
        
        /**
         * Font size in Pango units.
         * @param size The value for the {@code size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSize(int size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
        
        /**
         * Font size in points.
         * @param sizePoints The value for the {@code size-points} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Font stretch as a {@code PangoStretch}, e.g. {@link org.pango.Stretch#CONDENSED}.
         * @param stretch The value for the {@code stretch} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Whether to strike through the text.
         * @param strikethrough The value for the {@code strikethrough} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStrikethrough(boolean strikethrough) {
            names.add("strikethrough");
            values.add(org.gtk.gobject.Value.create(strikethrough));
            return this;
        }
        
        /**
         * This property modifies the color of strikeouts.
         * <p>
         * If not set, strikeouts will use the foreground color.
         * @param strikethroughRgba The value for the {@code strikethrough-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStrikethroughRgba(org.gtk.gdk.RGBA strikethroughRgba) {
            names.add("strikethrough-rgba");
            values.add(org.gtk.gobject.Value.create(strikethroughRgba));
            return this;
        }
        
        /**
         * If the {@code strikethrough-rgba} property has been set.
         * @param strikethroughRgbaSet The value for the {@code strikethrough-rgba-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStrikethroughRgbaSet(boolean strikethroughRgbaSet) {
            names.add("strikethrough-rgba-set");
            values.add(org.gtk.gobject.Value.create(strikethroughRgbaSet));
            return this;
        }
        
        public Build setStrikethroughSet(boolean strikethroughSet) {
            names.add("strikethrough-set");
            values.add(org.gtk.gobject.Value.create(strikethroughSet));
            return this;
        }
        
        /**
         * Font style as a {@code PangoStyle}, e.g. {@link org.pango.Style#ITALIC}.
         * @param style The value for the {@code style} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Custom tabs for this text.
         * @param tabs The value for the {@code tabs} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTabs(org.pango.TabArray tabs) {
            names.add("tabs");
            values.add(org.gtk.gobject.Value.create(tabs));
            return this;
        }
        
        public Build setTabsSet(boolean tabsSet) {
            names.add("tabs-set");
            values.add(org.gtk.gobject.Value.create(tabsSet));
            return this;
        }
        
        /**
         * How to transform the text for display.
         * @param textTransform The value for the {@code text-transform} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTextTransform(org.pango.TextTransform textTransform) {
            names.add("text-transform");
            values.add(org.gtk.gobject.Value.create(textTransform));
            return this;
        }
        
        public Build setTextTransformSet(boolean textTransformSet) {
            names.add("text-transform-set");
            values.add(org.gtk.gobject.Value.create(textTransformSet));
            return this;
        }
        
        /**
         * Style of underline for this text.
         * @param underline The value for the {@code underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUnderline(org.pango.Underline underline) {
            names.add("underline");
            values.add(org.gtk.gobject.Value.create(underline));
            return this;
        }
        
        /**
         * This property modifies the color of underlines.
         * <p>
         * If not set, underlines will use the foreground color.
         * <p>
         * If {@code Gtk.TextTag:underline} is set to {@link org.pango.Underline#ERROR},
         * an alternate color may be applied instead of the foreground. Setting
         * this property will always override those defaults.
         * @param underlineRgba The value for the {@code underline-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUnderlineRgba(org.gtk.gdk.RGBA underlineRgba) {
            names.add("underline-rgba");
            values.add(org.gtk.gobject.Value.create(underlineRgba));
            return this;
        }
        
        /**
         * If the {@code underline-rgba} property has been set.
         * @param underlineRgbaSet The value for the {@code underline-rgba-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUnderlineRgbaSet(boolean underlineRgbaSet) {
            names.add("underline-rgba-set");
            values.add(org.gtk.gobject.Value.create(underlineRgbaSet));
            return this;
        }
        
        public Build setUnderlineSet(boolean underlineSet) {
            names.add("underline-set");
            values.add(org.gtk.gobject.Value.create(underlineSet));
            return this;
        }
        
        /**
         * Font variant as a {@code PangoVariant}, e.g. {@link org.pango.Variant#SMALL_CAPS}.
         * @param variant The value for the {@code variant} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Font weight as an integer.
         * @param weight The value for the {@code weight} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
         * Whether this tag represents a single word.
         * <p>
         * This affects line breaks and cursor movement.
         * @param word The value for the {@code word} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWord(boolean word) {
            names.add("word");
            values.add(org.gtk.gobject.Value.create(word));
            return this;
        }
        
        public Build setWordSet(boolean wordSet) {
            names.add("word-set");
            values.add(org.gtk.gobject.Value.create(wordSet));
            return this;
        }
        
        /**
         * Whether to wrap lines never, at word boundaries, or
         * at character boundaries.
         * @param wrapMode The value for the {@code wrap-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWrapMode(org.gtk.gtk.WrapMode wrapMode) {
            names.add("wrap-mode");
            values.add(org.gtk.gobject.Value.create(wrapMode));
            return this;
        }
        
        public Build setWrapModeSet(boolean wrapModeSet) {
            names.add("wrap-mode-set");
            values.add(org.gtk.gobject.Value.create(wrapModeSet));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_tag_new = Interop.downcallHandle(
            "gtk_text_tag_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_tag_changed = Interop.downcallHandle(
            "gtk_text_tag_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_tag_get_priority = Interop.downcallHandle(
            "gtk_text_tag_get_priority",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_tag_set_priority = Interop.downcallHandle(
            "gtk_text_tag_set_priority",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_tag_get_type = Interop.downcallHandle(
            "gtk_text_tag_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
