package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MediaFileClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMediaFileClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.MediaStreamClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("open"),
            Interop.valueLayout.ADDRESS.withName("close"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved4")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MediaFileClass}
     * @return A new, uninitialized @{link MediaFileClass}
     */
    public static MediaFileClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MediaFileClass newInstance = new MediaFileClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.MediaStreamClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.MediaStreamClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.MediaStreamClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface OpenCallback {
        void run(org.gtk.gtk.MediaFile self);

        @ApiStatus.Internal default void upcall(MemoryAddress self) {
            run((org.gtk.gtk.MediaFile) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gtk.MediaFile.fromAddress).marshal(self, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseCallback {
        void run(org.gtk.gtk.MediaFile self);

        @ApiStatus.Internal default void upcall(MemoryAddress self) {
            run((org.gtk.gtk.MediaFile) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gtk.MediaFile.fromAddress).marshal(self, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close}
     * @param close The new value of the field {@code close}
     */
    public void setClose(CloseCallback close) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved1}
     * @param GtkReserved1 The new value of the field {@code _gtk_reserved1}
     */
    public void setGtkReserved1(GtkReserved1Callback GtkReserved1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved2}
     * @param GtkReserved2 The new value of the field {@code _gtk_reserved2}
     */
    public void setGtkReserved2(GtkReserved2Callback GtkReserved2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved3}
     * @param GtkReserved3 The new value of the field {@code _gtk_reserved3}
     */
    public void setGtkReserved3(GtkReserved3Callback GtkReserved3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved4Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved4Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved4}
     * @param GtkReserved4 The new value of the field {@code _gtk_reserved4}
     */
    public void setGtkReserved4(GtkReserved4Callback GtkReserved4) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
    }
    
    /**
     * Create a MediaFileClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MediaFileClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MediaFileClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MediaFileClass(input, ownership);
    
    /**
     * A {@link MediaFileClass.Builder} object constructs a {@link MediaFileClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MediaFileClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MediaFileClass struct;
        
        private Builder() {
            struct = MediaFileClass.allocate();
        }
        
         /**
         * Finish building the {@link MediaFileClass} struct.
         * @return A new instance of {@code MediaFileClass} with the fields 
         *         that were set in the Builder object.
         */
        public MediaFileClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.MediaStreamClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setOpen(OpenCallback open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
            return this;
        }
        
        public Builder setClose(CloseCallback close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved1(GtkReserved1Callback GtkReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved2(GtkReserved2Callback GtkReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved3(GtkReserved3Callback GtkReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved4(GtkReserved4Callback GtkReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
            return this;
        }
    }
}
