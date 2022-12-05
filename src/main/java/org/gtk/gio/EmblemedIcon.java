package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link EmblemedIcon} is an implementation of {@link Icon} that supports
 * adding an emblem to an icon. Adding multiple emblems to an
 * icon is ensured via g_emblemed_icon_add_emblem().
 * <p>
 * Note that {@link EmblemedIcon} allows no control over the position
 * of the emblems. See also {@link Emblem} for more information.
 */
public class EmblemedIcon extends org.gtk.gobject.Object implements org.gtk.gio.Icon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GEmblemedIcon";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
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
     * Create a EmblemedIcon proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EmblemedIcon(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EmblemedIcon if its GType is a (or inherits from) "GEmblemedIcon".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EmblemedIcon} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GEmblemedIcon", a ClassCastException will be thrown.
     */
    public static EmblemedIcon castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), EmblemedIcon.getType())) {
            return new EmblemedIcon(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GEmblemedIcon");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.Icon icon, @Nullable org.gtk.gio.Emblem emblem) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblemed_icon_new.invokeExact(
                    icon.handle(),
                    (Addressable) (emblem == null ? MemoryAddress.NULL : emblem.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new emblemed icon for {@code icon} with the emblem {@code emblem}.
     * @param icon a {@link Icon}
     * @param emblem a {@link Emblem}, or {@code null}
     */
    public EmblemedIcon(@NotNull org.gtk.gio.Icon icon, @Nullable org.gtk.gio.Emblem emblem) {
        super(constructNew(icon, emblem), Ownership.FULL);
    }
    
    /**
     * Adds {@code emblem} to the {@link org.gtk.glib.List} of {@code GEmblems}.
     * @param emblem a {@link Emblem}
     */
    public void addEmblem(@NotNull org.gtk.gio.Emblem emblem) {
        java.util.Objects.requireNonNull(emblem, "Parameter 'emblem' must not be null");
        try {
            DowncallHandles.g_emblemed_icon_add_emblem.invokeExact(
                    handle(),
                    emblem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all the emblems from {@code icon}.
     */
    public void clearEmblems() {
        try {
            DowncallHandles.g_emblemed_icon_clear_emblems.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the list of emblems for the {@code icon}.
     * @return a {@link org.gtk.glib.List} of
     *     {@code GEmblems} that is owned by {@code emblemed}
     */
    public @NotNull org.gtk.glib.List getEmblems() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblemed_icon_get_emblems.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the main icon for {@code emblemed}.
     * @return a {@link Icon} that is owned by {@code emblemed}
     */
    public @NotNull org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblemed_icon_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_emblemed_icon_get_type.invokeExact();
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
         * A {@link EmblemedIcon.Build} object constructs a {@link EmblemedIcon} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EmblemedIcon} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EmblemedIcon} using {@link EmblemedIcon#castFrom}.
         * @return A new instance of {@code EmblemedIcon} with the properties 
         *         that were set in the Build object.
         */
        public EmblemedIcon construct() {
            return EmblemedIcon.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EmblemedIcon.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setGicon(org.gtk.gio.Icon gicon) {
            names.add("gicon");
            values.add(org.gtk.gobject.Value.create(gicon));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_emblemed_icon_new = Interop.downcallHandle(
            "g_emblemed_icon_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblemed_icon_add_emblem = Interop.downcallHandle(
            "g_emblemed_icon_add_emblem",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblemed_icon_clear_emblems = Interop.downcallHandle(
            "g_emblemed_icon_clear_emblems",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblemed_icon_get_emblems = Interop.downcallHandle(
            "g_emblemed_icon_get_emblems",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblemed_icon_get_icon = Interop.downcallHandle(
            "g_emblemed_icon_get_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblemed_icon_get_type = Interop.downcallHandle(
            "g_emblemed_icon_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
