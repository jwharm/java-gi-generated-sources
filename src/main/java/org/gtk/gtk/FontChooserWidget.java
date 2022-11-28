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
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontChooserWidget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FontChooserWidget if its GType is a (or inherits from) "GtkFontChooserWidget".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FontChooserWidget} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFontChooserWidget", a ClassCastException will be thrown.
     */
    public static FontChooserWidget castFrom(org.gtk.gobject.Object gobject) {
            return new FontChooserWidget(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_font_chooser_widget_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link FontChooserWidget.Build} object constructs a {@link FontChooserWidget} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FontChooserWidget} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontChooserWidget} using {@link FontChooserWidget#castFrom}.
         * @return A new instance of {@code FontChooserWidget} with the properties 
         *         that were set in the Build object.
         */
        public FontChooserWidget construct() {
            return FontChooserWidget.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FontChooserWidget.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setTweakAction(org.gtk.gio.Action tweakAction) {
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
