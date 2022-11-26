package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkFontChooserDialog} widget is a dialog for selecting a font.
 * <p>
 * <img src="./doc-files/fontchooser.png" alt="An example GtkFontChooserDialog">
 * <p>
 * {@code GtkFontChooserDialog} implements the {@code Gtk.FontChooser} interface
 * and does not provide much API of its own.
 * <p>
 * To create a {@code GtkFontChooserDialog}, use {@link FontChooserDialog#FontChooserDialog}.
 * <p>
 * <strong>GtkFontChooserDialog as GtkBuildable</strong><br/>
 * The {@code GtkFontChooserDialog} implementation of the {@code GtkBuildable}
 * interface exposes the buttons with the names “select_button”
 * and “cancel_button”.
 */
public class FontChooserDialog extends org.gtk.gtk.Dialog implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.FontChooser, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFontChooserDialog";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FontChooserDialog proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontChooserDialog(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FontChooserDialog if its GType is a (or inherits from) "GtkFontChooserDialog".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FontChooserDialog} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFontChooserDialog", a ClassCastException will be thrown.
     */
    public static FontChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), FontChooserDialog.getType())) {
            return new FontChooserDialog(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFontChooserDialog");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_font_chooser_dialog_new.invokeExact(
                    (Addressable) (title == null ? MemoryAddress.NULL : Interop.allocateNativeString(title)),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFontChooserDialog}.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     */
    public FontChooserDialog(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        super(constructNew(title, parent), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_font_chooser_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Dialog.Build {
        
         /**
         * A {@link FontChooserDialog.Build} object constructs a {@link FontChooserDialog} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FontChooserDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FontChooserDialog} using {@link FontChooserDialog#castFrom}.
         * @return A new instance of {@code FontChooserDialog} with the properties 
         *         that were set in the Build object.
         */
        public FontChooserDialog construct() {
            return FontChooserDialog.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FontChooserDialog.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_font_chooser_dialog_new = Interop.downcallHandle(
            "gtk_font_chooser_dialog_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_font_chooser_dialog_get_type = Interop.downcallHandle(
            "gtk_font_chooser_dialog_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
