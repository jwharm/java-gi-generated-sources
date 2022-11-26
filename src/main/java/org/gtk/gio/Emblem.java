package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Emblem} is an implementation of {@link Icon} that supports
 * having an emblem, which is an icon with additional properties.
 * It can than be added to a {@link EmblemedIcon}.
 * <p>
 * Currently, only metainformation about the emblem's origin is
 * supported. More may be added in the future.
 */
public class Emblem extends org.gtk.gobject.Object implements org.gtk.gio.Icon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GEmblem";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Emblem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Emblem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Emblem if its GType is a (or inherits from) "GEmblem".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Emblem} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GEmblem", a ClassCastException will be thrown.
     */
    public static Emblem castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Emblem.getType())) {
            return new Emblem(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GEmblem");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.Icon icon) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblem_new.invokeExact(
                    icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new emblem for {@code icon}.
     * @param icon a GIcon containing the icon.
     */
    public Emblem(@NotNull org.gtk.gio.Icon icon) {
        super(constructNew(icon), Ownership.FULL);
    }
    
    private static Addressable constructNewWithOrigin(@NotNull org.gtk.gio.Icon icon, @NotNull org.gtk.gio.EmblemOrigin origin) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        java.util.Objects.requireNonNull(origin, "Parameter 'origin' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblem_new_with_origin.invokeExact(
                    icon.handle(),
                    origin.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new emblem for {@code icon}.
     * @param icon a GIcon containing the icon.
     * @param origin a GEmblemOrigin enum defining the emblem's origin
     * @return a new {@link Emblem}.
     */
    public static Emblem newWithOrigin(@NotNull org.gtk.gio.Icon icon, @NotNull org.gtk.gio.EmblemOrigin origin) {
        return new Emblem(constructNewWithOrigin(icon, origin), Ownership.FULL);
    }
    
    /**
     * Gives back the icon from {@code emblem}.
     * @return a {@link Icon}. The returned object belongs to
     *          the emblem and should not be modified or freed.
     */
    public @NotNull org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblem_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the origin of the emblem.
     * @return the origin of the emblem
     */
    public @NotNull org.gtk.gio.EmblemOrigin getOrigin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_emblem_get_origin.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.EmblemOrigin(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_emblem_get_type.invokeExact();
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
         * A {@link Emblem.Build} object constructs a {@link Emblem} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Emblem} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Emblem} using {@link Emblem#castFrom}.
         * @return A new instance of {@code Emblem} with the properties 
         *         that were set in the Build object.
         */
        public Emblem construct() {
            return Emblem.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Emblem.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setIcon(org.gtk.gobject.Object icon) {
            names.add("icon");
            values.add(org.gtk.gobject.Value.create(icon));
            return this;
        }
        
        public Build setOrigin(org.gtk.gio.EmblemOrigin origin) {
            names.add("origin");
            values.add(org.gtk.gobject.Value.create(origin));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_emblem_new = Interop.downcallHandle(
            "g_emblem_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblem_new_with_origin = Interop.downcallHandle(
            "g_emblem_new_with_origin",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_emblem_get_icon = Interop.downcallHandle(
            "g_emblem_get_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblem_get_origin = Interop.downcallHandle(
            "g_emblem_get_origin",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblem_get_type = Interop.downcallHandle(
            "g_emblem_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
