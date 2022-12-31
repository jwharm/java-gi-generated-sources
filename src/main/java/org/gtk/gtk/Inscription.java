package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkInscription} is a widget to show text in a predefined area.
 * <p>
 * You likely want to use {@code GtkLabel} instead as this widget is intended only
 * for a small subset of use cases. The main scenario envisaged is inside lists
 * such as {@code GtkColumnView}.
 * <p>
 * While a {@code GtkLabel} sizes itself depending on the text that is displayed,
 * {@code GtkInscription} is given a size and inscribes the given text into that
 * space as well as it can.
 * <p>
 * Users of this widget should take care to plan behaviour for the common case
 * where the text doesn't fit exactly in the allocated space, .
 * @version 4.8
 */
public class Inscription extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkInscription";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Inscription proxy instance for the provided memory address.
     * <p>
     * Because Inscription is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Inscription(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Inscription> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Inscription(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String text) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_inscription_new.invokeExact(
                    (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkInscription} with the given text.
     * @param text The text to display.
     */
    public Inscription(@Nullable java.lang.String text) {
        super(constructNew(text), Ownership.NONE);
    }
    
    /**
     * Gets the inscription's attribute list.
     * @return the attribute list
     */
    public @Nullable org.pango.AttrList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_inscription_get_attributes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.AttrList.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code min-chars} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:min-chars} property.
     * @return the min-chars property
     */
    public int getMinChars() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_inscription_get_min_chars.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code min-lines} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:min-lines} property.
     * @return the min-lines property
     */
    public int getMinLines() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_inscription_get_min_lines.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code nat-chars} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:nat-chars} property.
     * @return the nat-chars property
     */
    public int getNatChars() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_inscription_get_nat_chars.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code nat-lines} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:nat-lines} property.
     * @return the nat-lines property
     */
    public int getNatLines() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_inscription_get_nat_lines.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the text that is displayed.
     * @return The displayed text
     */
    public @Nullable java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_inscription_get_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the inscription's overflow method.
     * @return the overflow method
     */
    public org.gtk.gtk.InscriptionOverflow getTextOverflow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_inscription_get_text_overflow.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.InscriptionOverflow.of(RESULT);
    }
    
    /**
     * Returns line wrap mode used by the inscription.
     * <p>
     * See {@link Inscription#setWrapMode}.
     * @return the line wrap mode
     */
    public org.pango.WrapMode getWrapMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_inscription_get_wrap_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.WrapMode.of(RESULT);
    }
    
    /**
     * Gets the {@code xalign} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:xalign} property.
     * @return the xalign property
     */
    public float getXalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_inscription_get_xalign.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code yalign} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:yalign} property.
     * @return the yalign property
     */
    public float getYalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_inscription_get_yalign.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Apply attributes to the inscription text.
     * <p>
     * These attributes will not be evaluated for sizing the inscription.
     * @param attrs a {@code Pango.AttrList}
     */
    public void setAttributes(@Nullable org.pango.AttrList attrs) {
        try {
            DowncallHandles.gtk_inscription_set_attributes.invokeExact(
                    handle(),
                    (Addressable) (attrs == null ? MemoryAddress.NULL : attrs.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Utility function to set the text and attributes to be displayed.
     * <p>
     * See the {@code Gtk.Inscription:markup} property.
     * @param markup The markup to display
     */
    public void setMarkup(@Nullable java.lang.String markup) {
        try {
            DowncallHandles.gtk_inscription_set_markup.invokeExact(
                    handle(),
                    (Addressable) (markup == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(markup, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code min-chars} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:min-chars} property.
     * @param minChars the minimum number of characters that should fit, approximately
     */
    public void setMinChars(int minChars) {
        try {
            DowncallHandles.gtk_inscription_set_min_chars.invokeExact(
                    handle(),
                    minChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code min-lines} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:min-lines} property.
     * @param minLines the minimum number of lines that should fit, approximately
     */
    public void setMinLines(int minLines) {
        try {
            DowncallHandles.gtk_inscription_set_min_lines.invokeExact(
                    handle(),
                    minLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code nat-chars} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:nat-chars} property.
     * @param natChars the number of characters that should ideally fit, approximately
     */
    public void setNatChars(int natChars) {
        try {
            DowncallHandles.gtk_inscription_set_nat_chars.invokeExact(
                    handle(),
                    natChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code nat-lines} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:nat-lines} property.
     * @param natLines the number of lines that should ideally fit
     */
    public void setNatLines(int natLines) {
        try {
            DowncallHandles.gtk_inscription_set_nat_lines.invokeExact(
                    handle(),
                    natLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text to be displayed.
     * @param text The text to display
     */
    public void setText(@Nullable java.lang.String text) {
        try {
            DowncallHandles.gtk_inscription_set_text.invokeExact(
                    handle(),
                    (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets what to do when the text doesn't fit.
     * @param overflow the overflow method to use
     */
    public void setTextOverflow(org.gtk.gtk.InscriptionOverflow overflow) {
        try {
            DowncallHandles.gtk_inscription_set_text_overflow.invokeExact(
                    handle(),
                    overflow.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Controls how line wrapping is done.
     * @param wrapMode the line wrapping mode
     */
    public void setWrapMode(org.pango.WrapMode wrapMode) {
        try {
            DowncallHandles.gtk_inscription_set_wrap_mode.invokeExact(
                    handle(),
                    wrapMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code xalign} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:xalign} property.
     * @param xalign the new xalign value, between 0 and 1
     */
    public void setXalign(float xalign) {
        try {
            DowncallHandles.gtk_inscription_set_xalign.invokeExact(
                    handle(),
                    xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code yalign} of the inscription.
     * <p>
     * See the {@code Gtk.Inscription:yalign} property.
     * @param yalign the new yalign value, between 0 and 1
     */
    public void setYalign(float yalign) {
        try {
            DowncallHandles.gtk_inscription_set_yalign.invokeExact(
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
            RESULT = (long) DowncallHandles.gtk_inscription_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Inscription.Builder} object constructs a {@link Inscription} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Inscription.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Inscription} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Inscription}.
         * @return A new instance of {@code Inscription} with the properties 
         *         that were set in the Builder object.
         */
        public Inscription build() {
            return (Inscription) org.gtk.gobject.GObject.newWithProperties(
                Inscription.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * A list of style attributes to apply to the text of the inscription.
         * @param attributes The value for the {@code attributes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAttributes(org.pango.AttrList attributes) {
            names.add("attributes");
            values.add(org.gtk.gobject.Value.create(attributes));
            return this;
        }
        
        /**
         * Utility property that sets both the {@code Gtk.Inscription:text} and
         * {@code Gtk.Inscription:attributes} properties, mainly intended for use in
         * GtkBuilder ui files to ease translation support and bindings.
         * <p>
         * This function uses {@link org.pango.Pango#parseMarkup} to parse the markup into text and
         * attributes. The markup must be valid. If you cannot ensure that, consider using
         * {@link org.pango.Pango#parseMarkup} and setting the two properties yourself.
         * @param markup The value for the {@code markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMarkup(java.lang.String markup) {
            names.add("markup");
            values.add(org.gtk.gobject.Value.create(markup));
            return this;
        }
        
        /**
         * The number of characters that should fit into the inscription at minimum.
         * <p>
         * This influences the requested width, not the width actually given to the widget,
         * which might turn out to be larger.
         * <p>
         * Note that this is an approximate character width, so some characters might be
         * wider and some might be thinner, so do not expect the number of characters to
         * exactly match.
         * <p>
         * If you set this property to 0, the inscription will not request any width at all
         * and its width will be determined entirely by its surroundings.
         * @param minChars The value for the {@code min-chars} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinChars(int minChars) {
            names.add("min-chars");
            values.add(org.gtk.gobject.Value.create(minChars));
            return this;
        }
        
        /**
         * The number of lines that should fit into the inscription at minimum.
         * <p>
         * This influences the requested height, not the height actually given to the widget,
         * which might turn out to be larger.
         * <p>
         * Note that this is an approximate line height, so if the text uses things like fancy
         * Unicode or attribute that influence the height, the text might not fit.
         * <p>
         * If you set this property to 0, the inscription will not request any height at all
         * and its height will be determined entirely by its surroundings.
         * @param minLines The value for the {@code min-lines} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinLines(int minLines) {
            names.add("min-lines");
            values.add(org.gtk.gobject.Value.create(minLines));
            return this;
        }
        
        /**
         * The number of characters that should ideally fit into the inscription.
         * <p>
         * This influences the requested width, not the width actually given to the widget.
         * The widget might turn out larger as well as smaller.
         * <p>
         * If this property is set to a value smaller than {@code Gtk.Inscription:min-chars},
         * that value will be used. In particular, for the default value of 0, this will always
         * be the case.
         * @param natChars The value for the {@code nat-chars} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNatChars(int natChars) {
            names.add("nat-chars");
            values.add(org.gtk.gobject.Value.create(natChars));
            return this;
        }
        
        /**
         * The number of lines that should ideally fit into the inscription.
         * <p>
         * This influences the requested height, not the height actually given to the widget.
         * The widget might turn out larger as well as smaller.
         * <p>
         * If this property is set to a value smaller than {@code Gtk.Inscription:min-lines},
         * that value will be used. In particular, for the default value of 0, this will always
         * be the case.
         * @param natLines The value for the {@code nat-lines} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNatLines(int natLines) {
            names.add("nat-lines");
            values.add(org.gtk.gobject.Value.create(natLines));
            return this;
        }
        
        /**
         * The displayed text.
         * @param text The value for the {@code text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setText(java.lang.String text) {
            names.add("text");
            values.add(org.gtk.gobject.Value.create(text));
            return this;
        }
        
        /**
         * The overflow method to use for the text.
         * @param textOverflow The value for the {@code text-overflow} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTextOverflow(org.gtk.gtk.InscriptionOverflow textOverflow) {
            names.add("text-overflow");
            values.add(org.gtk.gobject.Value.create(textOverflow));
            return this;
        }
        
        /**
         * Controls how the line wrapping is done.
         * <p>
         * Note that unlike {@code GtkLabel}, the default here is {@link org.pango.WrapMode#WORD_CHAR}.
         * @param wrapMode The value for the {@code wrap-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWrapMode(org.pango.WrapMode wrapMode) {
            names.add("wrap-mode");
            values.add(org.gtk.gobject.Value.create(wrapMode));
            return this;
        }
        
        /**
         * The horizontal alignment of the text inside the allocated size.
         * <p>
         * Compare this to {@code Gtk.Widget:halign}, which determines how the
         * inscription's size allocation is positioned in the available space.
         * @param xalign The value for the {@code xalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setXalign(float xalign) {
            names.add("xalign");
            values.add(org.gtk.gobject.Value.create(xalign));
            return this;
        }
        
        /**
         * The vertical alignment of the text inside the allocated size.
         * <p>
         * Compare this to {@code Gtk.Widget:valign}, which determines how the
         * inscription's size allocation is positioned in the available space.
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
        
        private static final MethodHandle gtk_inscription_new = Interop.downcallHandle(
            "gtk_inscription_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_attributes = Interop.downcallHandle(
            "gtk_inscription_get_attributes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_min_chars = Interop.downcallHandle(
            "gtk_inscription_get_min_chars",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_min_lines = Interop.downcallHandle(
            "gtk_inscription_get_min_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_nat_chars = Interop.downcallHandle(
            "gtk_inscription_get_nat_chars",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_nat_lines = Interop.downcallHandle(
            "gtk_inscription_get_nat_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_text = Interop.downcallHandle(
            "gtk_inscription_get_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_text_overflow = Interop.downcallHandle(
            "gtk_inscription_get_text_overflow",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_wrap_mode = Interop.downcallHandle(
            "gtk_inscription_get_wrap_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_xalign = Interop.downcallHandle(
            "gtk_inscription_get_xalign",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_yalign = Interop.downcallHandle(
            "gtk_inscription_get_yalign",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_attributes = Interop.downcallHandle(
            "gtk_inscription_set_attributes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_markup = Interop.downcallHandle(
            "gtk_inscription_set_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_min_chars = Interop.downcallHandle(
            "gtk_inscription_set_min_chars",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_min_lines = Interop.downcallHandle(
            "gtk_inscription_set_min_lines",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_nat_chars = Interop.downcallHandle(
            "gtk_inscription_set_nat_chars",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_nat_lines = Interop.downcallHandle(
            "gtk_inscription_set_nat_lines",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_text = Interop.downcallHandle(
            "gtk_inscription_set_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_text_overflow = Interop.downcallHandle(
            "gtk_inscription_set_text_overflow",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_wrap_mode = Interop.downcallHandle(
            "gtk_inscription_set_wrap_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_xalign = Interop.downcallHandle(
            "gtk_inscription_set_xalign",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gtk_inscription_set_yalign = Interop.downcallHandle(
            "gtk_inscription_set_yalign",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gtk_inscription_get_type = Interop.downcallHandle(
            "gtk_inscription_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
