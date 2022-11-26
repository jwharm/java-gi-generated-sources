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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.ScaleButton.getMemoryLayout().withName("parent")
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
    public org.gtk.gtk.ScaleButton parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gtk.ScaleButton(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VolumeButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VolumeButton(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to VolumeButton if its GType is a (or inherits from) "GtkVolumeButton".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VolumeButton} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkVolumeButton", a ClassCastException will be thrown.
     */
    public static VolumeButton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), VolumeButton.getType())) {
            return new VolumeButton(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkVolumeButton");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_volume_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.ScaleButton.Build {
        
         /**
         * A {@link VolumeButton.Build} object constructs a {@link VolumeButton} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VolumeButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VolumeButton} using {@link VolumeButton#castFrom}.
         * @return A new instance of {@code VolumeButton} with the properties 
         *         that were set in the Build object.
         */
        public VolumeButton construct() {
            return VolumeButton.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VolumeButton.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setUseSymbolic(boolean useSymbolic) {
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
}
