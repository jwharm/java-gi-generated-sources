package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface that is used by backends to associate default
 * handlers with URI schemes.
 */
public class DesktopAppInfoLookupIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDesktopAppInfoLookupIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("get_default_for_uri_scheme")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DesktopAppInfoLookupIface}
     * @return A new, uninitialized @{link DesktopAppInfoLookupIface}
     */
    public static DesktopAppInfoLookupIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DesktopAppInfoLookupIface newInstance = new DesktopAppInfoLookupIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface GetDefaultForUriSchemeCallback {
        @Nullable org.gtk.gio.AppInfo run(org.gtk.gio.DesktopAppInfoLookup lookup, java.lang.String uriScheme);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress lookup, MemoryAddress uriScheme) {
            var RESULT = run((org.gtk.gio.DesktopAppInfoLookup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(lookup)), org.gtk.gio.DesktopAppInfoLookup.fromAddress).marshal(lookup, Ownership.NONE), Marshal.addressToString.marshal(uriScheme, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDefaultForUriSchemeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_default_for_uri_scheme}
     * @param getDefaultForUriScheme The new value of the field {@code get_default_for_uri_scheme}
     */
    public void setGetDefaultForUriScheme(GetDefaultForUriSchemeCallback getDefaultForUriScheme) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_default_for_uri_scheme"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultForUriScheme == null ? MemoryAddress.NULL : getDefaultForUriScheme.toCallback()));
    }
    
    /**
     * Create a DesktopAppInfoLookupIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DesktopAppInfoLookupIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DesktopAppInfoLookupIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DesktopAppInfoLookupIface(input, ownership);
    
    /**
     * A {@link DesktopAppInfoLookupIface.Builder} object constructs a {@link DesktopAppInfoLookupIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DesktopAppInfoLookupIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DesktopAppInfoLookupIface struct;
        
        private Builder() {
            struct = DesktopAppInfoLookupIface.allocate();
        }
        
         /**
         * Finish building the {@link DesktopAppInfoLookupIface} struct.
         * @return A new instance of {@code DesktopAppInfoLookupIface} with the fields 
         *         that were set in the Builder object.
         */
        public DesktopAppInfoLookupIface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setGetDefaultForUriScheme(GetDefaultForUriSchemeCallback getDefaultForUriScheme) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_for_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultForUriScheme == null ? MemoryAddress.NULL : getDefaultForUriScheme.toCallback()));
            return this;
        }
    }
}
