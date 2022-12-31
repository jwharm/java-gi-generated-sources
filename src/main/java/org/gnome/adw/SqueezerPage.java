package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link Squeezer}.
 */
public class SqueezerPage extends org.gtk.gobject.GObject {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwSqueezerPage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SqueezerPage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SqueezerPage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SqueezerPage> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SqueezerPage(input, ownership);
    
    /**
     * Returns the squeezer child to which {@code self} belongs.
     * @return the child to which {@code self} belongs
     */
    public org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_squeezer_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether {@code self} is enabled.
     * @return whether {@code self} is enabled
     */
    public boolean getEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_squeezer_page_get_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets whether {@code self} is enabled.
     * <p>
     * If a child is disabled, it will be ignored when looking for the child
     * fitting the available size best.
     * <p>
     * This allows to programmatically and prematurely hide a child even if it fits
     * in the available space.
     * <p>
     * This can be used e.g. to ensure a certain child is hidden below a certain
     * window width, or any other constraint you find suitable.
     * @param enabled whether {@code self} is enabled
     */
    public void setEnabled(boolean enabled) {
        try {
            DowncallHandles.adw_squeezer_page_set_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
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
            RESULT = (long) DowncallHandles.adw_squeezer_page_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SqueezerPage.Builder} object constructs a {@link SqueezerPage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SqueezerPage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SqueezerPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SqueezerPage}.
         * @return A new instance of {@code SqueezerPage} with the properties 
         *         that were set in the Builder object.
         */
        public SqueezerPage build() {
            return (SqueezerPage) org.gtk.gobject.GObject.newWithProperties(
                SqueezerPage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The the squeezer child to which the page belongs.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Whether the child is enabled.
         * <p>
         * If a child is disabled, it will be ignored when looking for the child
         * fitting the available size best.
         * <p>
         * This allows to programmatically and prematurely hide a child even if it
         * fits in the available space.
         * <p>
         * This can be used e.g. to ensure a certain child is hidden below a certain
         * window width, or any other constraint you find suitable.
         * @param enabled The value for the {@code enabled} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnabled(boolean enabled) {
            names.add("enabled");
            values.add(org.gtk.gobject.Value.create(enabled));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_squeezer_page_get_child = Interop.downcallHandle(
            "adw_squeezer_page_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_page_get_enabled = Interop.downcallHandle(
            "adw_squeezer_page_get_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_page_set_enabled = Interop.downcallHandle(
            "adw_squeezer_page_set_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_page_get_type = Interop.downcallHandle(
            "adw_squeezer_page_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
