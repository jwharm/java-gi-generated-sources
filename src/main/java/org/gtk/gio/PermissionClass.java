package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PermissionClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPermissionClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("acquire"),
            Interop.valueLayout.ADDRESS.withName("acquire_async"),
            Interop.valueLayout.ADDRESS.withName("acquire_finish"),
            Interop.valueLayout.ADDRESS.withName("release"),
            Interop.valueLayout.ADDRESS.withName("release_async"),
            Interop.valueLayout.ADDRESS.withName("release_finish"),
            MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PermissionClass}
     * @return A new, uninitialized @{link PermissionClass}
     */
    public static PermissionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PermissionClass newInstance = new PermissionClass(segment.address(), Ownership.NONE);
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
    public interface AcquireCallback {
        boolean run(org.gtk.gio.Permission permission, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress permission, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Permission) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(permission)), org.gtk.gio.Permission.fromAddress).marshal(permission, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AcquireCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code acquire}
     * @param acquire The new value of the field {@code acquire}
     */
    public void setAcquire(AcquireCallback acquire) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("acquire"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquire == null ? MemoryAddress.NULL : acquire.toCallback()));
    }
    
    @FunctionalInterface
    public interface AcquireAsyncCallback {
        void run(org.gtk.gio.Permission permission, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress permission, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Permission) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(permission)), org.gtk.gio.Permission.fromAddress).marshal(permission, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AcquireAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code acquire_async}
     * @param acquireAsync The new value of the field {@code acquire_async}
     */
    public void setAcquireAsync(AcquireAsyncCallback acquireAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("acquire_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquireAsync == null ? MemoryAddress.NULL : acquireAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface AcquireFinishCallback {
        boolean run(org.gtk.gio.Permission permission, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress permission, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Permission) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(permission)), org.gtk.gio.Permission.fromAddress).marshal(permission, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AcquireFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code acquire_finish}
     * @param acquireFinish The new value of the field {@code acquire_finish}
     */
    public void setAcquireFinish(AcquireFinishCallback acquireFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("acquire_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquireFinish == null ? MemoryAddress.NULL : acquireFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReleaseCallback {
        boolean run(org.gtk.gio.Permission permission, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress permission, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Permission) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(permission)), org.gtk.gio.Permission.fromAddress).marshal(permission, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReleaseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code release}
     * @param release The new value of the field {@code release}
     */
    public void setRelease(ReleaseCallback release) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("release"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (release == null ? MemoryAddress.NULL : release.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReleaseAsyncCallback {
        void run(org.gtk.gio.Permission permission, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress permission, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Permission) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(permission)), org.gtk.gio.Permission.fromAddress).marshal(permission, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReleaseAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code release_async}
     * @param releaseAsync The new value of the field {@code release_async}
     */
    public void setReleaseAsync(ReleaseAsyncCallback releaseAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("release_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseAsync == null ? MemoryAddress.NULL : releaseAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReleaseFinishCallback {
        boolean run(org.gtk.gio.Permission permission, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress permission, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Permission) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(permission)), org.gtk.gio.Permission.fromAddress).marshal(permission, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReleaseFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code release_finish}
     * @param releaseFinish The new value of the field {@code release_finish}
     */
    public void setReleaseFinish(ReleaseFinishCallback releaseFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("release_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseFinish == null ? MemoryAddress.NULL : releaseFinish.toCallback()));
    }
    
    /**
     * Create a PermissionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PermissionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PermissionClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PermissionClass(input, ownership);
    
    /**
     * A {@link PermissionClass.Builder} object constructs a {@link PermissionClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PermissionClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PermissionClass struct;
        
        private Builder() {
            struct = PermissionClass.allocate();
        }
        
         /**
         * Finish building the {@link PermissionClass} struct.
         * @return A new instance of {@code PermissionClass} with the fields 
         *         that were set in the Builder object.
         */
        public PermissionClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setAcquire(AcquireCallback acquire) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquire == null ? MemoryAddress.NULL : acquire.toCallback()));
            return this;
        }
        
        public Builder setAcquireAsync(AcquireAsyncCallback acquireAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquireAsync == null ? MemoryAddress.NULL : acquireAsync.toCallback()));
            return this;
        }
        
        public Builder setAcquireFinish(AcquireFinishCallback acquireFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquireFinish == null ? MemoryAddress.NULL : acquireFinish.toCallback()));
            return this;
        }
        
        public Builder setRelease(ReleaseCallback release) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (release == null ? MemoryAddress.NULL : release.toCallback()));
            return this;
        }
        
        public Builder setReleaseAsync(ReleaseAsyncCallback releaseAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseAsync == null ? MemoryAddress.NULL : releaseAsync.toCallback()));
            return this;
        }
        
        public Builder setReleaseFinish(ReleaseFinishCallback releaseFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseFinish == null ? MemoryAddress.NULL : releaseFinish.toCallback()));
            return this;
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(reserved, false)));
            return this;
        }
    }
}
