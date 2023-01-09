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
public class TextTag extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextTag";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TextTag proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TextTag(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextTag> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TextTag(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_text_tag_new.invokeExact((Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a {@code GtkTextTag}.
     * @param name tag name
     */
    public TextTag(@Nullable java.lang.String name) {
        super(constructNew(name));
        this.takeOwnership();
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
                    Marshal.booleanToInteger.marshal(sizeChanged, null).intValue());
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
            RESULT = (int) DowncallHandles.gtk_text_tag_get_priority.invokeExact(handle());
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_text_tag_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TextTag.Builder} object constructs a {@link TextTag} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TextTag.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TextTag} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TextTag}.
         * @return A new instance of {@code TextTag} with the properties 
         *         that were set in the Builder object.
         */
        public TextTag build() {
            return (TextTag) org.gtk.gobject.GObject.newWithProperties(
                TextTag.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setAccumulativeMargin(boolean accumulativeMargin) {
            names.add("accumulative-margin");
            values.add(org.gtk.gobject.Value.create(accumulativeMargin));
            return this;
        }
        
        /**
         * Whether breaks are allowed.
         * @param allowBreaks The value for the {@code allow-breaks} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllowBreaks(boolean allowBreaks) {
            names.add("allow-breaks");
            values.add(org.gtk.gobject.Value.create(allowBreaks));
            return this;
        }
        
        public Builder setAllowBreaksSet(boolean allowBreaksSet) {
            names.add("allow-breaks-set");
            values.add(org.gtk.gobject.Value.create(allowBreaksSet));
            return this;
        }
        
        /**
         * Background color as a string.
         * @param background The value for the {@code background} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBackground(java.lang.String background) {
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
        public Builder setBackgroundFullHeight(boolean backgroundFullHeight) {
            names.add("background-full-height");
            values.add(org.gtk.gobject.Value.create(backgroundFullHeight));
            return this;
        }
        
        public Builder setBackgroundFullHeightSet(boolean backgroundFullHeightSet) {
            names.add("background-full-height-set");
            values.add(org.gtk.gobject.Value.create(backgroundFullHeightSet));
            return this;
        }
        
        /**
         * Background color as a {@code GdkRGBA}.
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
        
        /**
         * Text direction, e.g. right-to-left or left-to-right.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDirection(org.gtk.gtk.TextDirection direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * Whether the text can be modified by the user.
         * @param editable The value for the {@code editable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
         * Whether font fallback is enabled.
         * <p>
         * When set to {@code true}, other fonts will be substituted
         * where the current font is missing glyphs.
         * @param fallback The value for the {@code fallback} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFallback(boolean fallback) {
            names.add("fallback");
            values.add(org.gtk.gobject.Value.create(fallback));
            return this;
        }
        
        public Builder setFallbackSet(boolean fallbackSet) {
            names.add("fallback-set");
            values.add(org.gtk.gobject.Value.create(fallbackSet));
            return this;
        }
        
        /**
         * Name of the font family, e.g. Sans, Helvetica, Times, Monospace.
         * @param family The value for the {@code family} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Font description as string, e.g. \\"Sans Italic 12\\".
         * <p>
         * Note that the initial value of this property depends on
         * the internals of {@code PangoFontDescription}.
         * @param font The value for the {@code font} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFont(java.lang.String font) {
            names.add("font");
            values.add(org.gtk.gobject.Value.create(font));
            return this;
        }
        
        /**
         * Font description as a {@code PangoFontDescription}.
         * @param fontDesc The value for the {@code font-desc} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFontDesc(org.pango.FontDescription fontDesc) {
            names.add("font-desc");
            values.add(org.gtk.gobject.Value.create(fontDesc));
            return this;
        }
        
        /**
         * OpenType font features, as a string.
         * @param fontFeatures The value for the {@code font-features} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFontFeatures(java.lang.String fontFeatures) {
            names.add("font-features");
            values.add(org.gtk.gobject.Value.create(fontFeatures));
            return this;
        }
        
        public Builder setFontFeaturesSet(boolean fontFeaturesSet) {
            names.add("font-features-set");
            values.add(org.gtk.gobject.Value.create(fontFeaturesSet));
            return this;
        }
        
        /**
         * Foreground color as a string.
         * @param foreground The value for the {@code foreground} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setForeground(java.lang.String foreground) {
            names.add("foreground");
            values.add(org.gtk.gobject.Value.create(foreground));
            return this;
        }
        
        /**
         * Foreground color as a {@code GdkRGBA}.
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
        
        /**
         * Amount to indent the paragraph, in pixels.
         * @param indent The value for the {@code indent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIndent(int indent) {
            names.add("indent");
            values.add(org.gtk.gobject.Value.create(indent));
            return this;
        }
        
        public Builder setIndentSet(boolean indentSet) {
            names.add("indent-set");
            values.add(org.gtk.gobject.Value.create(indentSet));
            return this;
        }
        
        /**
         * Whether to insert hyphens at breaks.
         * @param insertHyphens The value for the {@code insert-hyphens} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInsertHyphens(boolean insertHyphens) {
            names.add("insert-hyphens");
            values.add(org.gtk.gobject.Value.create(insertHyphens));
            return this;
        }
        
        public Builder setInsertHyphensSet(boolean insertHyphensSet) {
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
        public Builder setInvisible(boolean invisible) {
            names.add("invisible");
            values.add(org.gtk.gobject.Value.create(invisible));
            return this;
        }
        
        public Builder setInvisibleSet(boolean invisibleSet) {
            names.add("invisible-set");
            values.add(org.gtk.gobject.Value.create(invisibleSet));
            return this;
        }
        
        /**
         * Left, right, or center justification.
         * @param justification The value for the {@code justification} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setJustification(org.gtk.gtk.Justification justification) {
            names.add("justification");
            values.add(org.gtk.gobject.Value.create(justification));
            return this;
        }
        
        public Builder setJustificationSet(boolean justificationSet) {
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
        
        /**
         * Width of the left margin in pixels.
         * @param leftMargin The value for the {@code left-margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLeftMargin(int leftMargin) {
            names.add("left-margin");
            values.add(org.gtk.gobject.Value.create(leftMargin));
            return this;
        }
        
        public Builder setLeftMarginSet(boolean leftMarginSet) {
            names.add("left-margin-set");
            values.add(org.gtk.gobject.Value.create(leftMarginSet));
            return this;
        }
        
        /**
         * Extra spacing between graphemes, in Pango units.
         * @param letterSpacing The value for the {@code letter-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLetterSpacing(int letterSpacing) {
            names.add("letter-spacing");
            values.add(org.gtk.gobject.Value.create(letterSpacing));
            return this;
        }
        
        public Builder setLetterSpacingSet(boolean letterSpacingSet) {
            names.add("letter-spacing-set");
            values.add(org.gtk.gobject.Value.create(letterSpacingSet));
            return this;
        }
        
        /**
         * Factor to scale line height by.
         * @param lineHeight The value for the {@code line-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLineHeight(float lineHeight) {
            names.add("line-height");
            values.add(org.gtk.gobject.Value.create(lineHeight));
            return this;
        }
        
        public Builder setLineHeightSet(boolean lineHeightSet) {
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
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * Style of overline for this text.
         * @param overline The value for the {@code overline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOverline(org.pango.Overline overline) {
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
        public Builder setOverlineRgba(org.gtk.gdk.RGBA overlineRgba) {
            names.add("overline-rgba");
            values.add(org.gtk.gobject.Value.create(overlineRgba));
            return this;
        }
        
        public Builder setOverlineRgbaSet(boolean overlineRgbaSet) {
            names.add("overline-rgba-set");
            values.add(org.gtk.gobject.Value.create(overlineRgbaSet));
            return this;
        }
        
        public Builder setOverlineSet(boolean overlineSet) {
            names.add("overline-set");
            values.add(org.gtk.gobject.Value.create(overlineSet));
            return this;
        }
        
        /**
         * The paragraph background color as a string.
         * @param paragraphBackground The value for the {@code paragraph-background} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParagraphBackground(java.lang.String paragraphBackground) {
            names.add("paragraph-background");
            values.add(org.gtk.gobject.Value.create(paragraphBackground));
            return this;
        }
        
        /**
         * The paragraph background color as a {@code GdkRGBA}.
         * @param paragraphBackgroundRgba The value for the {@code paragraph-background-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParagraphBackgroundRgba(org.gtk.gdk.RGBA paragraphBackgroundRgba) {
            names.add("paragraph-background-rgba");
            values.add(org.gtk.gobject.Value.create(paragraphBackgroundRgba));
            return this;
        }
        
        public Builder setParagraphBackgroundSet(boolean paragraphBackgroundSet) {
            names.add("paragraph-background-set");
            values.add(org.gtk.gobject.Value.create(paragraphBackgroundSet));
            return this;
        }
        
        /**
         * Pixels of blank space above paragraphs.
         * @param pixelsAboveLines The value for the {@code pixels-above-lines} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPixelsAboveLines(int pixelsAboveLines) {
            names.add("pixels-above-lines");
            values.add(org.gtk.gobject.Value.create(pixelsAboveLines));
            return this;
        }
        
        public Builder setPixelsAboveLinesSet(boolean pixelsAboveLinesSet) {
            names.add("pixels-above-lines-set");
            values.add(org.gtk.gobject.Value.create(pixelsAboveLinesSet));
            return this;
        }
        
        /**
         * Pixels of blank space below paragraphs.
         * @param pixelsBelowLines The value for the {@code pixels-below-lines} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPixelsBelowLines(int pixelsBelowLines) {
            names.add("pixels-below-lines");
            values.add(org.gtk.gobject.Value.create(pixelsBelowLines));
            return this;
        }
        
        public Builder setPixelsBelowLinesSet(boolean pixelsBelowLinesSet) {
            names.add("pixels-below-lines-set");
            values.add(org.gtk.gobject.Value.create(pixelsBelowLinesSet));
            return this;
        }
        
        /**
         * Pixels of blank space between wrapped lines in a paragraph.
         * @param pixelsInsideWrap The value for the {@code pixels-inside-wrap} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPixelsInsideWrap(int pixelsInsideWrap) {
            names.add("pixels-inside-wrap");
            values.add(org.gtk.gobject.Value.create(pixelsInsideWrap));
            return this;
        }
        
        public Builder setPixelsInsideWrapSet(boolean pixelsInsideWrapSet) {
            names.add("pixels-inside-wrap-set");
            values.add(org.gtk.gobject.Value.create(pixelsInsideWrapSet));
            return this;
        }
        
        /**
         * Width of the right margin, in pixels.
         * @param rightMargin The value for the {@code right-margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRightMargin(int rightMargin) {
            names.add("right-margin");
            values.add(org.gtk.gobject.Value.create(rightMargin));
            return this;
        }
        
        public Builder setRightMarginSet(boolean rightMarginSet) {
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
        
        /**
         * Font size as a scale factor relative to the default font size.
         * <p>
         * This properly adapts to theme changes, etc. so is recommended.
         * Pango predefines some scales such as {@code PANGO_SCALE_X_LARGE}.
         * @param scale The value for the {@code scale} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Whether this tag represents a single sentence.
         * <p>
         * This affects cursor movement.
         * @param sentence The value for the {@code sentence} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSentence(boolean sentence) {
            names.add("sentence");
            values.add(org.gtk.gobject.Value.create(sentence));
            return this;
        }
        
        public Builder setSentenceSet(boolean sentenceSet) {
            names.add("sentence-set");
            values.add(org.gtk.gobject.Value.create(sentenceSet));
            return this;
        }
        
        /**
         * How to render invisible characters.
         * @param showSpaces The value for the {@code show-spaces} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowSpaces(org.pango.ShowFlags showSpaces) {
            names.add("show-spaces");
            values.add(org.gtk.gobject.Value.create(showSpaces));
            return this;
        }
        
        public Builder setShowSpacesSet(boolean showSpacesSet) {
            names.add("show-spaces-set");
            values.add(org.gtk.gobject.Value.create(showSpacesSet));
            return this;
        }
        
        /**
         * Font size in Pango units.
         * @param size The value for the {@code size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(int size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
        
        /**
         * Font size in points.
         * @param sizePoints The value for the {@code size-points} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Font stretch as a {@code PangoStretch}, e.g. {@link org.pango.Stretch#CONDENSED}.
         * @param stretch The value for the {@code stretch} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Whether to strike through the text.
         * @param strikethrough The value for the {@code strikethrough} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStrikethrough(boolean strikethrough) {
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
        public Builder setStrikethroughRgba(org.gtk.gdk.RGBA strikethroughRgba) {
            names.add("strikethrough-rgba");
            values.add(org.gtk.gobject.Value.create(strikethroughRgba));
            return this;
        }
        
        /**
         * If the {@code strikethrough-rgba} property has been set.
         * @param strikethroughRgbaSet The value for the {@code strikethrough-rgba-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStrikethroughRgbaSet(boolean strikethroughRgbaSet) {
            names.add("strikethrough-rgba-set");
            values.add(org.gtk.gobject.Value.create(strikethroughRgbaSet));
            return this;
        }
        
        public Builder setStrikethroughSet(boolean strikethroughSet) {
            names.add("strikethrough-set");
            values.add(org.gtk.gobject.Value.create(strikethroughSet));
            return this;
        }
        
        /**
         * Font style as a {@code PangoStyle}, e.g. {@link org.pango.Style#ITALIC}.
         * @param style The value for the {@code style} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Custom tabs for this text.
         * @param tabs The value for the {@code tabs} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTabs(org.pango.TabArray tabs) {
            names.add("tabs");
            values.add(org.gtk.gobject.Value.create(tabs));
            return this;
        }
        
        public Builder setTabsSet(boolean tabsSet) {
            names.add("tabs-set");
            values.add(org.gtk.gobject.Value.create(tabsSet));
            return this;
        }
        
        /**
         * How to transform the text for display.
         * @param textTransform The value for the {@code text-transform} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTextTransform(org.pango.TextTransform textTransform) {
            names.add("text-transform");
            values.add(org.gtk.gobject.Value.create(textTransform));
            return this;
        }
        
        public Builder setTextTransformSet(boolean textTransformSet) {
            names.add("text-transform-set");
            values.add(org.gtk.gobject.Value.create(textTransformSet));
            return this;
        }
        
        /**
         * Style of underline for this text.
         * @param underline The value for the {@code underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnderline(org.pango.Underline underline) {
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
        public Builder setUnderlineRgba(org.gtk.gdk.RGBA underlineRgba) {
            names.add("underline-rgba");
            values.add(org.gtk.gobject.Value.create(underlineRgba));
            return this;
        }
        
        /**
         * If the {@code underline-rgba} property has been set.
         * @param underlineRgbaSet The value for the {@code underline-rgba-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnderlineRgbaSet(boolean underlineRgbaSet) {
            names.add("underline-rgba-set");
            values.add(org.gtk.gobject.Value.create(underlineRgbaSet));
            return this;
        }
        
        public Builder setUnderlineSet(boolean underlineSet) {
            names.add("underline-set");
            values.add(org.gtk.gobject.Value.create(underlineSet));
            return this;
        }
        
        /**
         * Font variant as a {@code PangoVariant}, e.g. {@link org.pango.Variant#SMALL_CAPS}.
         * @param variant The value for the {@code variant} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        /**
         * Font weight as an integer.
         * @param weight The value for the {@code weight} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
         * Whether this tag represents a single word.
         * <p>
         * This affects line breaks and cursor movement.
         * @param word The value for the {@code word} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWord(boolean word) {
            names.add("word");
            values.add(org.gtk.gobject.Value.create(word));
            return this;
        }
        
        public Builder setWordSet(boolean wordSet) {
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
        public Builder setWrapMode(org.gtk.gtk.WrapMode wrapMode) {
            names.add("wrap-mode");
            values.add(org.gtk.gobject.Value.create(wrapMode));
            return this;
        }
        
        public Builder setWrapModeSet(boolean wrapModeSet) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_text_tag_get_type != null;
    }
}
