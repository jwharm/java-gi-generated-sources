package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkColorChooserWidget} widget lets the user select a color.
 * <p>
 * By default, the chooser presents a predefined palette of colors,
 * plus a small number of settable custom colors. It is also possible
 * to select a different color with the single-color editor.
 * <p>
 * To enter the single-color editing mode, use the context menu of any
 * color of the palette, or use the '+' button to add a new custom color.
 * <p>
 * The chooser automatically remembers the last selection, as well
 * as custom colors.
 * <p>
 * To create a {@code GtkColorChooserWidget}, use {@link ColorChooserWidget#ColorChooserWidget}.
 * <p>
 * To change the initially selected color, use
 * {@link ColorChooser#setRgba}. To get the selected color use
 * {@link ColorChooser#getRgba}.
 * <p>
 * The {@code GtkColorChooserWidget} is used in the {@link ColorChooserDialog}
 * to provide a dialog for selecting colors.
 * <p>
 * <strong>CSS names</strong><br/>
 * {@code GtkColorChooserWidget} has a single CSS node with name colorchooser.
 */
public class ColorChooserWidget extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ColorChooser, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColorChooserWidget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ColorChooserWidget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ColorChooserWidget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ColorChooserWidget if its GType is a (or inherits from) "GtkColorChooserWidget".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ColorChooserWidget} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkColorChooserWidget", a ClassCastException will be thrown.
     */
    public static ColorChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ColorChooserWidget.getType())) {
            return new ColorChooserWidget(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkColorChooserWidget");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_color_chooser_widget_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkColorChooserWidget}.
     */
    public ColorChooserWidget() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_color_chooser_widget_get_type.invokeExact();
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
         * A {@link ColorChooserWidget.Build} object constructs a {@link ColorChooserWidget} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ColorChooserWidget} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ColorChooserWidget} using {@link ColorChooserWidget#castFrom}.
         * @return A new instance of {@code ColorChooserWidget} with the properties 
         *         that were set in the Build object.
         */
        public ColorChooserWidget construct() {
            return ColorChooserWidget.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ColorChooserWidget.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * {@code true} when the color chooser is showing the single-color editor.
         * <p>
         * It can be set to switch the color chooser into single-color editing mode.
         * @param showEditor The value for the {@code show-editor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowEditor(boolean showEditor) {
            names.add("show-editor");
            values.add(org.gtk.gobject.Value.create(showEditor));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_color_chooser_widget_new = Interop.downcallHandle(
            "gtk_color_chooser_widget_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_color_chooser_widget_get_type = Interop.downcallHandle(
            "gtk_color_chooser_widget_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
