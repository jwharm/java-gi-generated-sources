package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufLoaderClass extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufLoaderClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("size_prepared"),
            Interop.valueLayout.ADDRESS.withName("area_prepared"),
            Interop.valueLayout.ADDRESS.withName("area_updated"),
            Interop.valueLayout.ADDRESS.withName("closed")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PixbufLoaderClass}
     * @return A new, uninitialized @{link PixbufLoaderClass}
     */
    public static PixbufLoaderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufLoaderClass newInstance = new PixbufLoaderClass(segment.address(), Ownership.NONE);
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
    public interface SizePreparedCallback {
        void run(org.gtk.gdkpixbuf.PixbufLoader loader, int width, int height);

        @ApiStatus.Internal default void upcall(MemoryAddress loader, int width, int height) {
            run((org.gtk.gdkpixbuf.PixbufLoader) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(loader)), org.gtk.gdkpixbuf.PixbufLoader.fromAddress).marshal(loader, Ownership.NONE), width, height);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SizePreparedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code size_prepared}
     * @param sizePrepared The new value of the field {@code size_prepared}
     */
    public void setSizePrepared(SizePreparedCallback sizePrepared) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size_prepared"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sizePrepared == null ? MemoryAddress.NULL : sizePrepared.toCallback()));
    }
    
    @FunctionalInterface
    public interface AreaPreparedCallback {
        void run(org.gtk.gdkpixbuf.PixbufLoader loader);

        @ApiStatus.Internal default void upcall(MemoryAddress loader) {
            run((org.gtk.gdkpixbuf.PixbufLoader) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(loader)), org.gtk.gdkpixbuf.PixbufLoader.fromAddress).marshal(loader, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AreaPreparedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code area_prepared}
     * @param areaPrepared The new value of the field {@code area_prepared}
     */
    public void setAreaPrepared(AreaPreparedCallback areaPrepared) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("area_prepared"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (areaPrepared == null ? MemoryAddress.NULL : areaPrepared.toCallback()));
    }
    
    @FunctionalInterface
    public interface AreaUpdatedCallback {
        void run(org.gtk.gdkpixbuf.PixbufLoader loader, int x, int y, int width, int height);

        @ApiStatus.Internal default void upcall(MemoryAddress loader, int x, int y, int width, int height) {
            run((org.gtk.gdkpixbuf.PixbufLoader) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(loader)), org.gtk.gdkpixbuf.PixbufLoader.fromAddress).marshal(loader, Ownership.NONE), x, y, width, height);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AreaUpdatedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code area_updated}
     * @param areaUpdated The new value of the field {@code area_updated}
     */
    public void setAreaUpdated(AreaUpdatedCallback areaUpdated) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("area_updated"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (areaUpdated == null ? MemoryAddress.NULL : areaUpdated.toCallback()));
    }
    
    @FunctionalInterface
    public interface ClosedCallback {
        void run(org.gtk.gdkpixbuf.PixbufLoader loader);

        @ApiStatus.Internal default void upcall(MemoryAddress loader) {
            run((org.gtk.gdkpixbuf.PixbufLoader) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(loader)), org.gtk.gdkpixbuf.PixbufLoader.fromAddress).marshal(loader, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClosedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code closed}
     * @param closed The new value of the field {@code closed}
     */
    public void setClosed(ClosedCallback closed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("closed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closed == null ? MemoryAddress.NULL : closed.toCallback()));
    }
    
    /**
     * Create a PixbufLoaderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PixbufLoaderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufLoaderClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PixbufLoaderClass(input, ownership);
    
    /**
     * A {@link PixbufLoaderClass.Builder} object constructs a {@link PixbufLoaderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PixbufLoaderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PixbufLoaderClass struct;
        
        private Builder() {
            struct = PixbufLoaderClass.allocate();
        }
        
         /**
         * Finish building the {@link PixbufLoaderClass} struct.
         * @return A new instance of {@code PixbufLoaderClass} with the fields 
         *         that were set in the Builder object.
         */
        public PixbufLoaderClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setSizePrepared(SizePreparedCallback sizePrepared) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size_prepared"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sizePrepared == null ? MemoryAddress.NULL : sizePrepared.toCallback()));
            return this;
        }
        
        public Builder setAreaPrepared(AreaPreparedCallback areaPrepared) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("area_prepared"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (areaPrepared == null ? MemoryAddress.NULL : areaPrepared.toCallback()));
            return this;
        }
        
        public Builder setAreaUpdated(AreaUpdatedCallback areaUpdated) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("area_updated"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (areaUpdated == null ? MemoryAddress.NULL : areaUpdated.toCallback()));
            return this;
        }
        
        public Builder setClosed(ClosedCallback closed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closed == null ? MemoryAddress.NULL : closed.toCallback()));
            return this;
        }
    }
}
