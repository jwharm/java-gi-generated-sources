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
public class Emblem extends org.gtk.gobject.GObject implements org.gtk.gio.Icon {
    
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
    protected Emblem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Emblem> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Emblem(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gio.Icon icon) {
        MemoryAddress RESULT;
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
    public Emblem(org.gtk.gio.Icon icon) {
        super(constructNew(icon), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWithOrigin(org.gtk.gio.Icon icon, org.gtk.gio.EmblemOrigin origin) {
        MemoryAddress RESULT;
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
    public static Emblem newWithOrigin(org.gtk.gio.Icon icon, org.gtk.gio.EmblemOrigin origin) {
        var RESULT = constructNewWithOrigin(icon, origin);
        return (org.gtk.gio.Emblem) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Emblem.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gives back the icon from {@code emblem}.
     * @return a {@link Icon}. The returned object belongs to
     *          the emblem and should not be modified or freed.
     */
    public org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblem_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the origin of the emblem.
     * @return the origin of the emblem
     */
    public org.gtk.gio.EmblemOrigin getOrigin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_emblem_get_origin.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.EmblemOrigin.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_emblem_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Emblem.Builder} object constructs a {@link Emblem} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Emblem.Builder#build()}. 
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
         * Finish building the {@link Emblem} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Emblem}.
         * @return A new instance of {@code Emblem} with the properties 
         *         that were set in the Builder object.
         */
        public Emblem build() {
            return (Emblem) org.gtk.gobject.GObject.newWithProperties(
                Emblem.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setIcon(org.gtk.gobject.GObject icon) {
            names.add("icon");
            values.add(org.gtk.gobject.Value.create(icon));
            return this;
        }
        
        public Builder setOrigin(org.gtk.gio.EmblemOrigin origin) {
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
