package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ResolverClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GResolverClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("reload"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_address"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_address_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_address_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_service"),
        Interop.valueLayout.ADDRESS.withName("lookup_service_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_service_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_records"),
        Interop.valueLayout.ADDRESS.withName("lookup_records_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_records_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_with_flags_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_with_flags_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_with_flags")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ResolverClass}
     * @return A new, uninitialized @{link ResolverClass}
     */
    public static ResolverClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ResolverClass newInstance = new ResolverClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ResolverClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ResolverClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ResolverClass struct;
        
         /**
         * A {@link ResolverClass.Build} object constructs a {@link ResolverClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ResolverClass.allocate();
        }
        
         /**
         * Finish building the {@link ResolverClass} struct.
         * @return A new instance of {@code ResolverClass} with the fields 
         *         that were set in the Build object.
         */
        public ResolverClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setReload(java.lang.foreign.MemoryAddress reload) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reload"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reload == null ? MemoryAddress.NULL : reload));
            return this;
        }
        
        public Build setLookupByName(java.lang.foreign.MemoryAddress lookupByName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByName == null ? MemoryAddress.NULL : lookupByName));
            return this;
        }
        
        public Build setLookupByNameAsync(java.lang.foreign.MemoryAddress lookupByNameAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameAsync == null ? MemoryAddress.NULL : lookupByNameAsync));
            return this;
        }
        
        public Build setLookupByNameFinish(java.lang.foreign.MemoryAddress lookupByNameFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameFinish == null ? MemoryAddress.NULL : lookupByNameFinish));
            return this;
        }
        
        public Build setLookupByAddress(java.lang.foreign.MemoryAddress lookupByAddress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByAddress == null ? MemoryAddress.NULL : lookupByAddress));
            return this;
        }
        
        public Build setLookupByAddressAsync(java.lang.foreign.MemoryAddress lookupByAddressAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByAddressAsync == null ? MemoryAddress.NULL : lookupByAddressAsync));
            return this;
        }
        
        public Build setLookupByAddressFinish(java.lang.foreign.MemoryAddress lookupByAddressFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByAddressFinish == null ? MemoryAddress.NULL : lookupByAddressFinish));
            return this;
        }
        
        public Build setLookupService(java.lang.foreign.MemoryAddress lookupService) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_service"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupService == null ? MemoryAddress.NULL : lookupService));
            return this;
        }
        
        public Build setLookupServiceAsync(java.lang.foreign.MemoryAddress lookupServiceAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupServiceAsync == null ? MemoryAddress.NULL : lookupServiceAsync));
            return this;
        }
        
        public Build setLookupServiceFinish(java.lang.foreign.MemoryAddress lookupServiceFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupServiceFinish == null ? MemoryAddress.NULL : lookupServiceFinish));
            return this;
        }
        
        public Build setLookupRecords(java.lang.foreign.MemoryAddress lookupRecords) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_records"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupRecords == null ? MemoryAddress.NULL : lookupRecords));
            return this;
        }
        
        public Build setLookupRecordsAsync(java.lang.foreign.MemoryAddress lookupRecordsAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupRecordsAsync == null ? MemoryAddress.NULL : lookupRecordsAsync));
            return this;
        }
        
        public Build setLookupRecordsFinish(java.lang.foreign.MemoryAddress lookupRecordsFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupRecordsFinish == null ? MemoryAddress.NULL : lookupRecordsFinish));
            return this;
        }
        
        public Build setLookupByNameWithFlagsAsync(java.lang.foreign.MemoryAddress lookupByNameWithFlagsAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameWithFlagsAsync == null ? MemoryAddress.NULL : lookupByNameWithFlagsAsync));
            return this;
        }
        
        public Build setLookupByNameWithFlagsFinish(java.lang.foreign.MemoryAddress lookupByNameWithFlagsFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameWithFlagsFinish == null ? MemoryAddress.NULL : lookupByNameWithFlagsFinish));
            return this;
        }
        
        public Build setLookupByNameWithFlags(java.lang.foreign.MemoryAddress lookupByNameWithFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameWithFlags == null ? MemoryAddress.NULL : lookupByNameWithFlags));
            return this;
        }
    }
}
