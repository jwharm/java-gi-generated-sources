package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link Leaflet}.
 */
public class LeafletPage extends org.gtk.gobject.GObject {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwLeafletPage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a LeafletPage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected LeafletPage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LeafletPage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LeafletPage(input);
    
    /**
     * Gets the leaflet child to which {@code self} belongs.
     * @return the child to which {@code self} belongs
     */
    public org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_page_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the name of {@code self}.
     * @return the name of {@code self}.
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_page_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether the child can be navigated to when folded.
     * @return whether {@code self} can be navigated to when folded
     */
    public boolean getNavigatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_page_get_navigatable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the name of the {@code self}.
     * @param name the new value to set
     */
    public void setName(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_leaflet_page_set_name.invokeExact(
                        handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets whether {@code self} can be navigated to when folded.
     * <p>
     * If {@code FALSE}, the child will be ignored by {@code Leaflet#getAdjacentChild},
     * {@code Leaflet#navigate}, and swipe gestures.
     * <p>
     * This can be used used to prevent switching to widgets like separators.
     * @param navigatable whether {@code self} can be navigated to when folded
     */
    public void setNavigatable(boolean navigatable) {
        try {
            DowncallHandles.adw_leaflet_page_set_navigatable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(navigatable, null).intValue());
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
            RESULT = (long) DowncallHandles.adw_leaflet_page_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link LeafletPage.Builder} object constructs a {@link LeafletPage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link LeafletPage.Builder#build()}. 
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
         * Finish building the {@link LeafletPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LeafletPage}.
         * @return A new instance of {@code LeafletPage} with the properties 
         *         that were set in the Builder object.
         */
        public LeafletPage build() {
            return (LeafletPage) org.gtk.gobject.GObject.newWithProperties(
                LeafletPage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The leaflet child to which the page belongs.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The name of the child page.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * Whether the child can be navigated to when folded.
         * <p>
         * If {@code FALSE}, the child will be ignored by
         * {@code Leaflet.get_adjacent_child#], [method@Leaflet.navigate}, and swipe
         * gestures.
         * <p>
         * This can be used used to prevent switching to widgets like separators.
         * @param navigatable The value for the {@code navigatable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNavigatable(boolean navigatable) {
            names.add("navigatable");
            values.add(org.gtk.gobject.Value.create(navigatable));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_leaflet_page_get_child = Interop.downcallHandle(
                "adw_leaflet_page_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_leaflet_page_get_name = Interop.downcallHandle(
                "adw_leaflet_page_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_leaflet_page_get_navigatable = Interop.downcallHandle(
                "adw_leaflet_page_get_navigatable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_leaflet_page_set_name = Interop.downcallHandle(
                "adw_leaflet_page_set_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_leaflet_page_set_navigatable = Interop.downcallHandle(
                "adw_leaflet_page_set_navigatable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_leaflet_page_get_type = Interop.downcallHandle(
                "adw_leaflet_page_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_leaflet_page_get_type != null;
    }
}
