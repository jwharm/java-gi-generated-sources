package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkVolumeButton} is a {@code GtkScaleButton} subclass tailored for
 * volume control.
 * <p>
 * <img src="./doc-files/volumebutton.png" alt="An example GtkVolumeButton">
 */
public class VolumeButton extends org.gtk.gtk.ScaleButton implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkVolumeButton";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.ScaleButton.getMemoryLayout().withName("parent")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VolumeButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VolumeButton(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VolumeButton> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VolumeButton(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_volume_button_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkVolumeButton}.
     * <p>
     * The button has a range between 0.0 and 1.0, with a stepping of 0.02.
     * Volume values can be obtained and modified using the functions from
     * {@link ScaleButton}.
     */
    public VolumeButton() {
        super(constructNew());
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
            RESULT = (long) DowncallHandles.gtk_volume_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VolumeButton.Builder} object constructs a {@link VolumeButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VolumeButton.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ScaleButton.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VolumeButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VolumeButton}.
         * @return A new instance of {@code VolumeButton} with the properties 
         *         that were set in the Builder object.
         */
        public VolumeButton build() {
            return (VolumeButton) org.gtk.gobject.GObject.newWithProperties(
                VolumeButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to use symbolic icons as the icons.
         * <p>
         * Note that if the symbolic icons are not available in your installed
         * theme, then the normal (potentially colorful) icons will be used.
         * @param useSymbolic The value for the {@code use-symbolic} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseSymbolic(boolean useSymbolic) {
            names.add("use-symbolic");
            values.add(org.gtk.gobject.Value.create(useSymbolic));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_volume_button_new = Interop.downcallHandle(
                "gtk_volume_button_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_volume_button_get_type = Interop.downcallHandle(
                "gtk_volume_button_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_volume_button_get_type != null;
    }
}
