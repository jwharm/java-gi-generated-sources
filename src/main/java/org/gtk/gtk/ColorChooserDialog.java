package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A dialog for choosing a color.
 * <p>
 * <img src="./doc-files/colorchooser.png" alt="An example GtkColorChooserDialog">
 * <p>
 * {@code GtkColorChooserDialog} implements the {@code Gtk.ColorChooser} interface
 * and does not provide much API of its own.
 * <p>
 * To create a {@code GtkColorChooserDialog}, use {@link ColorChooserDialog#ColorChooserDialog}.
 * <p>
 * To change the initially selected color, use
 * {@link ColorChooser#setRgba}. To get the selected color use
 * {@link ColorChooser#getRgba}.
 */
public class ColorChooserDialog extends org.gtk.gtk.Dialog implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ColorChooser, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColorChooserDialog";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ColorChooserDialog proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ColorChooserDialog(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ColorChooserDialog> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ColorChooserDialog(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_color_chooser_dialog_new.invokeExact(
                        (Addressable) (title == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(title, SCOPE)),
                        (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@code GtkColorChooserDialog}.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     */
    public ColorChooserDialog(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent) {
        super(constructNew(title, parent));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_color_chooser_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ColorChooserDialog.Builder} object constructs a {@link ColorChooserDialog} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ColorChooserDialog.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Dialog.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ColorChooserDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ColorChooserDialog}.
         * @return A new instance of {@code ColorChooserDialog} with the properties 
         *         that were set in the Builder object.
         */
        public ColorChooserDialog build() {
            return (ColorChooserDialog) org.gtk.gobject.GObject.newWithProperties(
                ColorChooserDialog.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setShowEditor(boolean showEditor) {
            names.add("show-editor");
            values.add(org.gtk.gobject.Value.create(showEditor));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_color_chooser_dialog_new = Interop.downcallHandle(
                "gtk_color_chooser_dialog_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_color_chooser_dialog_get_type = Interop.downcallHandle(
                "gtk_color_chooser_dialog_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_color_chooser_dialog_get_type != null;
    }
}
