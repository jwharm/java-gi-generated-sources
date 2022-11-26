package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An auxiliary class used by {@link Leaflet}.
 */
public class LeafletPage extends org.gtk.gobject.Object {
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LeafletPage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to LeafletPage if its GType is a (or inherits from) "AdwLeafletPage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code LeafletPage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwLeafletPage", a ClassCastException will be thrown.
     */
    public static LeafletPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), LeafletPage.getType())) {
            return new LeafletPage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwLeafletPage");
        }
    }
    
    /**
     * Gets the leaflet child to which {@code self} belongs.
     * @return the child to which {@code self} belongs
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the name of {@code self}.
     * @return the name of {@code self}.
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_page_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the child can be navigated to when folded.
     * @return whether {@code self} can be navigated to when folded
     */
    public boolean getNavigatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_page_get_navigatable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the name of the {@code self}.
     * @param name the new value to set
     */
    public void setName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.adw_leaflet_page_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
                    navigatable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_leaflet_page_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link LeafletPage.Build} object constructs a {@link LeafletPage} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link LeafletPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LeafletPage} using {@link LeafletPage#castFrom}.
         * @return A new instance of {@code LeafletPage} with the properties 
         *         that were set in the Build object.
         */
        public LeafletPage construct() {
            return LeafletPage.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    LeafletPage.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The leaflet child to which the page belongs.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The name of the child page.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
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
        public Build setNavigatable(boolean navigatable) {
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
}
