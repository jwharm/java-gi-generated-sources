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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ResolverClass newInstance = new ResolverClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReloadCallback} callback.
     */
    @FunctionalInterface
    public interface ReloadCallback {
    
        void run(org.gtk.gio.Resolver resolver);
        
        @ApiStatus.Internal default void upcall(MemoryAddress resolver) {
            run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReloadCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reload}
     * @param reload The new value of the field {@code reload}
     */
    public void setReload(ReloadCallback reload) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reload"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reload == null ? MemoryAddress.NULL : reload.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupByNameCallback} callback.
     */
    @FunctionalInterface
    public interface LookupByNameCallback {
    
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, java.lang.String hostname, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress hostname, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), Marshal.addressToString.marshal(hostname, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupByNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name}
     * @param lookupByName The new value of the field {@code lookup_by_name}
     */
    public void setLookupByName(LookupByNameCallback lookupByName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByName == null ? MemoryAddress.NULL : lookupByName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupByNameAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LookupByNameAsyncCallback {
    
        void run(org.gtk.gio.Resolver resolver, java.lang.String hostname, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress hostname, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), Marshal.addressToString.marshal(hostname, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupByNameAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_async}
     * @param lookupByNameAsync The new value of the field {@code lookup_by_name_async}
     */
    public void setLookupByNameAsync(LookupByNameAsyncCallback lookupByNameAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameAsync == null ? MemoryAddress.NULL : lookupByNameAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupByNameFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LookupByNameFinishCallback {
    
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupByNameFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_finish}
     * @param lookupByNameFinish The new value of the field {@code lookup_by_name_finish}
     */
    public void setLookupByNameFinish(LookupByNameFinishCallback lookupByNameFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameFinish == null ? MemoryAddress.NULL : lookupByNameFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupByAddressCallback} callback.
     */
    @FunctionalInterface
    public interface LookupByAddressCallback {
    
        java.lang.String run(org.gtk.gio.Resolver resolver, org.gtk.gio.InetAddress address, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress address, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), (org.gtk.gio.InetAddress) Interop.register(address, org.gtk.gio.InetAddress.fromAddress).marshal(address, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupByAddressCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_address}
     * @param lookupByAddress The new value of the field {@code lookup_by_address}
     */
    public void setLookupByAddress(LookupByAddressCallback lookupByAddress) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByAddress == null ? MemoryAddress.NULL : lookupByAddress.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupByAddressAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LookupByAddressAsyncCallback {
    
        void run(org.gtk.gio.Resolver resolver, org.gtk.gio.InetAddress address, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress address, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), (org.gtk.gio.InetAddress) Interop.register(address, org.gtk.gio.InetAddress.fromAddress).marshal(address, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupByAddressAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_address_async}
     * @param lookupByAddressAsync The new value of the field {@code lookup_by_address_async}
     */
    public void setLookupByAddressAsync(LookupByAddressAsyncCallback lookupByAddressAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByAddressAsync == null ? MemoryAddress.NULL : lookupByAddressAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupByAddressFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LookupByAddressFinishCallback {
    
        java.lang.String run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupByAddressFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_address_finish}
     * @param lookupByAddressFinish The new value of the field {@code lookup_by_address_finish}
     */
    public void setLookupByAddressFinish(LookupByAddressFinishCallback lookupByAddressFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByAddressFinish == null ? MemoryAddress.NULL : lookupByAddressFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupServiceCallback} callback.
     */
    @FunctionalInterface
    public interface LookupServiceCallback {
    
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, java.lang.String rrname, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress rrname, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), Marshal.addressToString.marshal(rrname, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupServiceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_service}
     * @param lookupService The new value of the field {@code lookup_service}
     */
    public void setLookupService(LookupServiceCallback lookupService) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_service"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupService == null ? MemoryAddress.NULL : lookupService.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupServiceAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LookupServiceAsyncCallback {
    
        void run(org.gtk.gio.Resolver resolver, java.lang.String rrname, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress rrname, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), Marshal.addressToString.marshal(rrname, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupServiceAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_service_async}
     * @param lookupServiceAsync The new value of the field {@code lookup_service_async}
     */
    public void setLookupServiceAsync(LookupServiceAsyncCallback lookupServiceAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupServiceAsync == null ? MemoryAddress.NULL : lookupServiceAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupServiceFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LookupServiceFinishCallback {
    
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupServiceFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_service_finish}
     * @param lookupServiceFinish The new value of the field {@code lookup_service_finish}
     */
    public void setLookupServiceFinish(LookupServiceFinishCallback lookupServiceFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupServiceFinish == null ? MemoryAddress.NULL : lookupServiceFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupRecordsCallback} callback.
     */
    @FunctionalInterface
    public interface LookupRecordsCallback {
    
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, java.lang.String rrname, org.gtk.gio.ResolverRecordType recordType, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress rrname, int recordType, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), Marshal.addressToString.marshal(rrname, null), org.gtk.gio.ResolverRecordType.of(recordType), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupRecordsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_records}
     * @param lookupRecords The new value of the field {@code lookup_records}
     */
    public void setLookupRecords(LookupRecordsCallback lookupRecords) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_records"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupRecords == null ? MemoryAddress.NULL : lookupRecords.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupRecordsAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LookupRecordsAsyncCallback {
    
        void run(org.gtk.gio.Resolver resolver, java.lang.String rrname, org.gtk.gio.ResolverRecordType recordType, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress rrname, int recordType, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), Marshal.addressToString.marshal(rrname, null), org.gtk.gio.ResolverRecordType.of(recordType), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupRecordsAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_records_async}
     * @param lookupRecordsAsync The new value of the field {@code lookup_records_async}
     */
    public void setLookupRecordsAsync(LookupRecordsAsyncCallback lookupRecordsAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupRecordsAsync == null ? MemoryAddress.NULL : lookupRecordsAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupRecordsFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LookupRecordsFinishCallback {
    
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupRecordsFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_records_finish}
     * @param lookupRecordsFinish The new value of the field {@code lookup_records_finish}
     */
    public void setLookupRecordsFinish(LookupRecordsFinishCallback lookupRecordsFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupRecordsFinish == null ? MemoryAddress.NULL : lookupRecordsFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupByNameWithFlagsAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LookupByNameWithFlagsAsyncCallback {
    
        void run(org.gtk.gio.Resolver resolver, java.lang.String hostname, org.gtk.gio.ResolverNameLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress resolver, MemoryAddress hostname, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), Marshal.addressToString.marshal(hostname, null), new org.gtk.gio.ResolverNameLookupFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupByNameWithFlagsAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_with_flags_async}
     * @param lookupByNameWithFlagsAsync The new value of the field {@code lookup_by_name_with_flags_async}
     */
    public void setLookupByNameWithFlagsAsync(LookupByNameWithFlagsAsyncCallback lookupByNameWithFlagsAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameWithFlagsAsync == null ? MemoryAddress.NULL : lookupByNameWithFlagsAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupByNameWithFlagsFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LookupByNameWithFlagsFinishCallback {
    
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupByNameWithFlagsFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_with_flags_finish}
     * @param lookupByNameWithFlagsFinish The new value of the field {@code lookup_by_name_with_flags_finish}
     */
    public void setLookupByNameWithFlagsFinish(LookupByNameWithFlagsFinishCallback lookupByNameWithFlagsFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameWithFlagsFinish == null ? MemoryAddress.NULL : lookupByNameWithFlagsFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupByNameWithFlagsCallback} callback.
     */
    @FunctionalInterface
    public interface LookupByNameWithFlagsCallback {
    
        org.gtk.glib.List run(org.gtk.gio.Resolver resolver, java.lang.String hostname, org.gtk.gio.ResolverNameLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress resolver, MemoryAddress hostname, int flags, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Resolver) Interop.register(resolver, org.gtk.gio.Resolver.fromAddress).marshal(resolver, null), Marshal.addressToString.marshal(hostname, null), new org.gtk.gio.ResolverNameLookupFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupByNameWithFlagsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_by_name_with_flags}
     * @param lookupByNameWithFlags The new value of the field {@code lookup_by_name_with_flags}
     */
    public void setLookupByNameWithFlags(LookupByNameWithFlagsCallback lookupByNameWithFlags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameWithFlags == null ? MemoryAddress.NULL : lookupByNameWithFlags.toCallback()));
        }
    }
    
    /**
     * Create a ResolverClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ResolverClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ResolverClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ResolverClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setReload(ReloadCallback reload) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reload"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reload == null ? MemoryAddress.NULL : reload.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupByName(LookupByNameCallback lookupByName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByName == null ? MemoryAddress.NULL : lookupByName.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupByNameAsync(LookupByNameAsyncCallback lookupByNameAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameAsync == null ? MemoryAddress.NULL : lookupByNameAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupByNameFinish(LookupByNameFinishCallback lookupByNameFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameFinish == null ? MemoryAddress.NULL : lookupByNameFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupByAddress(LookupByAddressCallback lookupByAddress) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByAddress == null ? MemoryAddress.NULL : lookupByAddress.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupByAddressAsync(LookupByAddressAsyncCallback lookupByAddressAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByAddressAsync == null ? MemoryAddress.NULL : lookupByAddressAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupByAddressFinish(LookupByAddressFinishCallback lookupByAddressFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_address_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByAddressFinish == null ? MemoryAddress.NULL : lookupByAddressFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupService(LookupServiceCallback lookupService) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_service"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupService == null ? MemoryAddress.NULL : lookupService.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupServiceAsync(LookupServiceAsyncCallback lookupServiceAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupServiceAsync == null ? MemoryAddress.NULL : lookupServiceAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupServiceFinish(LookupServiceFinishCallback lookupServiceFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_service_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupServiceFinish == null ? MemoryAddress.NULL : lookupServiceFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupRecords(LookupRecordsCallback lookupRecords) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_records"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupRecords == null ? MemoryAddress.NULL : lookupRecords.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupRecordsAsync(LookupRecordsAsyncCallback lookupRecordsAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupRecordsAsync == null ? MemoryAddress.NULL : lookupRecordsAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupRecordsFinish(LookupRecordsFinishCallback lookupRecordsFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_records_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupRecordsFinish == null ? MemoryAddress.NULL : lookupRecordsFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupByNameWithFlagsAsync(LookupByNameWithFlagsAsyncCallback lookupByNameWithFlagsAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameWithFlagsAsync == null ? MemoryAddress.NULL : lookupByNameWithFlagsAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupByNameWithFlagsFinish(LookupByNameWithFlagsFinishCallback lookupByNameWithFlagsFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameWithFlagsFinish == null ? MemoryAddress.NULL : lookupByNameWithFlagsFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupByNameWithFlags(LookupByNameWithFlagsCallback lookupByNameWithFlags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_by_name_with_flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupByNameWithFlags == null ? MemoryAddress.NULL : lookupByNameWithFlags.toCallback()));
                return this;
            }
        }
    }
}
