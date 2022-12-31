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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ReloadCallback {
        void run(org.gtk.gio.Resolver resolver);

        @ApiStatus.Internal default void upcall(MemoryAddress resolver) {
            run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReloadCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reload}
     * @param reload The new value of the field {@code reload}
     */
    public void setReload(ReloadCallback reload) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reload"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reload == null ? MemoryAddress.NULL : reload.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupByNameCallback {
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, java.lang.String hostname, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress hostname, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(hostname, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupByNameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name}
     * @param lookupByName The new value of the field {@code lookup_by_name}
     */
    public void setLookupByName(LookupByNameCallback lookupByName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByName == null ? MemoryAddress.NULL : lookupByName.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupByNameAsyncCallback {
        void run(org.gtk.gio.Resolver resolver, java.lang.String hostname, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress hostname, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(hostname, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupByNameAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_async}
     * @param lookupByNameAsync The new value of the field {@code lookup_by_name_async}
     */
    public void setLookupByNameAsync(LookupByNameAsyncCallback lookupByNameAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameAsync == null ? MemoryAddress.NULL : lookupByNameAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupByNameFinishCallback {
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupByNameFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_finish}
     * @param lookupByNameFinish The new value of the field {@code lookup_by_name_finish}
     */
    public void setLookupByNameFinish(LookupByNameFinishCallback lookupByNameFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameFinish == null ? MemoryAddress.NULL : lookupByNameFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupByAddressCallback {
        java.lang.String run(org.gtk.gio.Resolver resolver, org.gtk.gio.InetAddress address, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress address, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), (org.gtk.gio.InetAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(address)), org.gtk.gio.InetAddress.fromAddress).marshal(address, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupByAddressCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_address}
     * @param lookupByAddress The new value of the field {@code lookup_by_address}
     */
    public void setLookupByAddress(LookupByAddressCallback lookupByAddress) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByAddress == null ? MemoryAddress.NULL : lookupByAddress.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupByAddressAsyncCallback {
        void run(org.gtk.gio.Resolver resolver, org.gtk.gio.InetAddress address, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress address, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), (org.gtk.gio.InetAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(address)), org.gtk.gio.InetAddress.fromAddress).marshal(address, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupByAddressAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_address_async}
     * @param lookupByAddressAsync The new value of the field {@code lookup_by_address_async}
     */
    public void setLookupByAddressAsync(LookupByAddressAsyncCallback lookupByAddressAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByAddressAsync == null ? MemoryAddress.NULL : lookupByAddressAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupByAddressFinishCallback {
        java.lang.String run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupByAddressFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_address_finish}
     * @param lookupByAddressFinish The new value of the field {@code lookup_by_address_finish}
     */
    public void setLookupByAddressFinish(LookupByAddressFinishCallback lookupByAddressFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByAddressFinish == null ? MemoryAddress.NULL : lookupByAddressFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupServiceCallback {
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, java.lang.String rrname, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress rrname, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(rrname, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupServiceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_service}
     * @param lookupService The new value of the field {@code lookup_service}
     */
    public void setLookupService(LookupServiceCallback lookupService) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_service"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupService == null ? MemoryAddress.NULL : lookupService.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupServiceAsyncCallback {
        void run(org.gtk.gio.Resolver resolver, java.lang.String rrname, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress rrname, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(rrname, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupServiceAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_service_async}
     * @param lookupServiceAsync The new value of the field {@code lookup_service_async}
     */
    public void setLookupServiceAsync(LookupServiceAsyncCallback lookupServiceAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupServiceAsync == null ? MemoryAddress.NULL : lookupServiceAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupServiceFinishCallback {
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupServiceFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_service_finish}
     * @param lookupServiceFinish The new value of the field {@code lookup_service_finish}
     */
    public void setLookupServiceFinish(LookupServiceFinishCallback lookupServiceFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupServiceFinish == null ? MemoryAddress.NULL : lookupServiceFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupRecordsCallback {
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, java.lang.String rrname, org.gtk.gio.ResolverRecordType recordType, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress rrname, int recordType, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(rrname, null), org.gtk.gio.ResolverRecordType.of(recordType), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupRecordsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_records}
     * @param lookupRecords The new value of the field {@code lookup_records}
     */
    public void setLookupRecords(LookupRecordsCallback lookupRecords) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_records"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupRecords == null ? MemoryAddress.NULL : lookupRecords.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupRecordsAsyncCallback {
        void run(org.gtk.gio.Resolver resolver, java.lang.String rrname, org.gtk.gio.ResolverRecordType recordType, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress rrname, int recordType, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(rrname, null), org.gtk.gio.ResolverRecordType.of(recordType), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupRecordsAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_records_async}
     * @param lookupRecordsAsync The new value of the field {@code lookup_records_async}
     */
    public void setLookupRecordsAsync(LookupRecordsAsyncCallback lookupRecordsAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupRecordsAsync == null ? MemoryAddress.NULL : lookupRecordsAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupRecordsFinishCallback {
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupRecordsFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_records_finish}
     * @param lookupRecordsFinish The new value of the field {@code lookup_records_finish}
     */
    public void setLookupRecordsFinish(LookupRecordsFinishCallback lookupRecordsFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupRecordsFinish == null ? MemoryAddress.NULL : lookupRecordsFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupByNameWithFlagsAsyncCallback {
        void run(org.gtk.gio.Resolver resolver, java.lang.String hostname, org.gtk.gio.ResolverNameLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress hostname, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(hostname, null), new org.gtk.gio.ResolverNameLookupFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupByNameWithFlagsAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_with_flags_async}
     * @param lookupByNameWithFlagsAsync The new value of the field {@code lookup_by_name_with_flags_async}
     */
    public void setLookupByNameWithFlagsAsync(LookupByNameWithFlagsAsyncCallback lookupByNameWithFlagsAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameWithFlagsAsync == null ? MemoryAddress.NULL : lookupByNameWithFlagsAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupByNameWithFlagsFinishCallback {
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupByNameWithFlagsFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_with_flags_finish}
     * @param lookupByNameWithFlagsFinish The new value of the field {@code lookup_by_name_with_flags_finish}
     */
    public void setLookupByNameWithFlagsFinish(LookupByNameWithFlagsFinishCallback lookupByNameWithFlagsFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameWithFlagsFinish == null ? MemoryAddress.NULL : lookupByNameWithFlagsFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupByNameWithFlagsCallback {
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, java.lang.String hostname, org.gtk.gio.ResolverNameLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress hostname, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Resolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(resolver)), org.gtk.gio.Resolver.fromAddress).marshal(resolver, Ownership.NONE), Marshal.addressToString.marshal(hostname, null), new org.gtk.gio.ResolverNameLookupFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupByNameWithFlagsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_with_flags}
     * @param lookupByNameWithFlags The new value of the field {@code lookup_by_name_with_flags}
     */
    public void setLookupByNameWithFlags(LookupByNameWithFlagsCallback lookupByNameWithFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameWithFlags == null ? MemoryAddress.NULL : lookupByNameWithFlags.toCallback()));
    }
    
    /**
     * Create a ResolverClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ResolverClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ResolverClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ResolverClass(input, ownership);
    
    /**
     * A {@link ResolverClass.Builder} object constructs a {@link ResolverClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ResolverClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ResolverClass struct;
        
        private Builder() {
            struct = ResolverClass.allocate();
        }
        
         /**
         * Finish building the {@link ResolverClass} struct.
         * @return A new instance of {@code ResolverClass} with the fields 
         *         that were set in the Builder object.
         */
        public ResolverClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setReload(ReloadCallback reload) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reload"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reload == null ? MemoryAddress.NULL : reload.toCallback()));
            return this;
        }
        
        public Builder setLookupByName(LookupByNameCallback lookupByName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByName == null ? MemoryAddress.NULL : lookupByName.toCallback()));
            return this;
        }
        
        public Builder setLookupByNameAsync(LookupByNameAsyncCallback lookupByNameAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameAsync == null ? MemoryAddress.NULL : lookupByNameAsync.toCallback()));
            return this;
        }
        
        public Builder setLookupByNameFinish(LookupByNameFinishCallback lookupByNameFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameFinish == null ? MemoryAddress.NULL : lookupByNameFinish.toCallback()));
            return this;
        }
        
        public Builder setLookupByAddress(LookupByAddressCallback lookupByAddress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByAddress == null ? MemoryAddress.NULL : lookupByAddress.toCallback()));
            return this;
        }
        
        public Builder setLookupByAddressAsync(LookupByAddressAsyncCallback lookupByAddressAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByAddressAsync == null ? MemoryAddress.NULL : lookupByAddressAsync.toCallback()));
            return this;
        }
        
        public Builder setLookupByAddressFinish(LookupByAddressFinishCallback lookupByAddressFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByAddressFinish == null ? MemoryAddress.NULL : lookupByAddressFinish.toCallback()));
            return this;
        }
        
        public Builder setLookupService(LookupServiceCallback lookupService) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_service"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupService == null ? MemoryAddress.NULL : lookupService.toCallback()));
            return this;
        }
        
        public Builder setLookupServiceAsync(LookupServiceAsyncCallback lookupServiceAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupServiceAsync == null ? MemoryAddress.NULL : lookupServiceAsync.toCallback()));
            return this;
        }
        
        public Builder setLookupServiceFinish(LookupServiceFinishCallback lookupServiceFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupServiceFinish == null ? MemoryAddress.NULL : lookupServiceFinish.toCallback()));
            return this;
        }
        
        public Builder setLookupRecords(LookupRecordsCallback lookupRecords) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_records"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupRecords == null ? MemoryAddress.NULL : lookupRecords.toCallback()));
            return this;
        }
        
        public Builder setLookupRecordsAsync(LookupRecordsAsyncCallback lookupRecordsAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupRecordsAsync == null ? MemoryAddress.NULL : lookupRecordsAsync.toCallback()));
            return this;
        }
        
        public Builder setLookupRecordsFinish(LookupRecordsFinishCallback lookupRecordsFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupRecordsFinish == null ? MemoryAddress.NULL : lookupRecordsFinish.toCallback()));
            return this;
        }
        
        public Builder setLookupByNameWithFlagsAsync(LookupByNameWithFlagsAsyncCallback lookupByNameWithFlagsAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameWithFlagsAsync == null ? MemoryAddress.NULL : lookupByNameWithFlagsAsync.toCallback()));
            return this;
        }
        
        public Builder setLookupByNameWithFlagsFinish(LookupByNameWithFlagsFinishCallback lookupByNameWithFlagsFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameWithFlagsFinish == null ? MemoryAddress.NULL : lookupByNameWithFlagsFinish.toCallback()));
            return this;
        }
        
        public Builder setLookupByNameWithFlags(LookupByNameWithFlagsCallback lookupByNameWithFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupByNameWithFlags == null ? MemoryAddress.NULL : lookupByNameWithFlags.toCallback()));
            return this;
        }
    }
}
