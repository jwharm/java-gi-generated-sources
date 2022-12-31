package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkFontChooserWidget} widget lets the user select a font.
 * <p>
 * It is used in the {@code GtkFontChooserDialog} widget to provide a
 * dialog for selecting fonts.
 * <p>
 * To set the font which is initially selected, use
 * {@link FontChooser#setFont} or {@link FontChooser#setFontDesc}.
 * <p>
 * To get the selected font use {@link FontChooser#getFont} or
 * {@link FontChooser#getFontDesc}.
 * <p>
 * To change the text which is shown in the preview area, use
 * {@link FontChooser#setPreviewText}.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkFontChooserWidget} has a single CSS node with name fontchooser.
 */
public class FontChooserWidget extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.FontChooser {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFontChooserWidget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FontChooserWidget proxy instance for the provided memory address.
     * <p>
     * Because FontChooserWidget is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FontChooserWidget(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, FontChooserWidget> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FontChooserWidget(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_widget_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFontChooserWidget}.
     */
    public FontChooserWidget() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_font_chooser_widget_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FontChooserWidget.Builder} object constructs a {@link FontChooserWidget} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FontChooserWidget.Builder#build()}. 
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
         * Finish building the {@link FontChooserWidget} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontChooserWidget}.
         * @return A new instance of {@code FontChooserWidget} with the properties 
         *         that were set in the Builder object.
         */
        public FontChooserWidget build() {
            return (FontChooserWidget) org.gtk.gobject.GObject.newWithProperties(
                FontChooserWidget.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * A toggle action that can be used to switch to the tweak page
         * of the font chooser widget, which lets the user tweak the
         * OpenType features and variation axes of the selected font.
         * <p>
         * The action will be enabled or disabled depending on whether
         * the selected font has any features or axes.
         * @param tweakAction The value for the {@code tweak-action} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTweakAction(org.gtk.gio.Action tweakAction) {
            names.add("tweak-action");
            values.add(org.gtk.gobject.Value.create(tweakAction));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_font_chooser_widget_new = Interop.downcallHandle(
            "gtk_font_chooser_widget_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_font_chooser_widget_get_type = Interop.downcallHandle(
            "gtk_font_chooser_widget_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
