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
public class EmblemedIcon extends org.gtk.gobject.GObject implements org.gtk.gio.Icon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GEmblemedIcon";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a EmblemedIcon proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EmblemedIcon(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EmblemedIcon> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EmblemedIcon(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.Icon icon, @Nullable org.gtk.gio.Emblem emblem) {
        MemoryAddress RESULT;
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
    public EmblemedIcon(org.gtk.gio.Icon icon, @Nullable org.gtk.gio.Emblem emblem) {
        super(constructNew(icon, emblem));
        this.takeOwnership();
    }
    
    /**
     * Adds {@code emblem} to the {@link org.gtk.glib.List} of {@code GEmblems}.
     * @param emblem a {@link Emblem}
     */
    public void addEmblem(org.gtk.gio.Emblem emblem) {
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
            DowncallHandles.g_emblemed_icon_clear_emblems.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the list of emblems for the {@code icon}.
     * @return a {@link org.gtk.glib.List} of
     *     {@code GEmblems} that is owned by {@code emblemed}
     */
    public org.gtk.glib.List getEmblems() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblemed_icon_get_emblems.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the main icon for {@code emblemed}.
     * @return a {@link Icon} that is owned by {@code emblemed}
     */
    public org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblemed_icon_get_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) Interop.register(RESULT, org.gtk.gio.Icon.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_emblemed_icon_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link EmblemedIcon.Builder} object constructs a {@link EmblemedIcon} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EmblemedIcon.Builder#build()}. 
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
         * Finish building the {@link EmblemedIcon} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EmblemedIcon}.
         * @return A new instance of {@code EmblemedIcon} with the properties 
         *         that were set in the Builder object.
         */
        public EmblemedIcon build() {
            return (EmblemedIcon) org.gtk.gobject.GObject.newWithProperties(
                EmblemedIcon.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setGicon(org.gtk.gio.Icon gicon) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_emblemed_icon_get_type != null;
    }
}
