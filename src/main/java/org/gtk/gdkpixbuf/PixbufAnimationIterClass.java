package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Modules supporting animations must derive a type from
 * {@link PixbufAnimationIter}, providing suitable implementations of the
 * virtual functions.
 */
public class PixbufAnimationIterClass extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufAnimationIterClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_delay_time"),
            Interop.valueLayout.ADDRESS.withName("get_pixbuf"),
            Interop.valueLayout.ADDRESS.withName("on_currently_loading_frame"),
            Interop.valueLayout.ADDRESS.withName("advance")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PixbufAnimationIterClass}
     * @return A new, uninitialized @{link PixbufAnimationIterClass}
     */
    public static PixbufAnimationIterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufAnimationIterClass newInstance = new PixbufAnimationIterClass(segment.address(), Ownership.NONE);
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
    public interface GetDelayTimeCallback {
        int run(org.gtk.gdkpixbuf.PixbufAnimationIter iter);

        @ApiStatus.Internal default int upcall(MemoryAddress iter) {
            var RESULT = run((org.gtk.gdkpixbuf.PixbufAnimationIter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(iter)), org.gtk.gdkpixbuf.PixbufAnimationIter.fromAddress).marshal(iter, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDelayTimeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_delay_time}
     * @param getDelayTime The new value of the field {@code get_delay_time}
     */
    public void setGetDelayTime(GetDelayTimeCallback getDelayTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_delay_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDelayTime == null ? MemoryAddress.NULL : getDelayTime.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPixbufCallback {
        org.gtk.gdkpixbuf.Pixbuf run(org.gtk.gdkpixbuf.PixbufAnimationIter iter);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress iter) {
            var RESULT = run((org.gtk.gdkpixbuf.PixbufAnimationIter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(iter)), org.gtk.gdkpixbuf.PixbufAnimationIter.fromAddress).marshal(iter, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPixbufCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_pixbuf}
     * @param getPixbuf The new value of the field {@code get_pixbuf}
     */
    public void setGetPixbuf(GetPixbufCallback getPixbuf) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_pixbuf"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPixbuf == null ? MemoryAddress.NULL : getPixbuf.toCallback()));
    }
    
    @FunctionalInterface
    public interface OnCurrentlyLoadingFrameCallback {
        boolean run(org.gtk.gdkpixbuf.PixbufAnimationIter iter);

        @ApiStatus.Internal default int upcall(MemoryAddress iter) {
            var RESULT = run((org.gtk.gdkpixbuf.PixbufAnimationIter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(iter)), org.gtk.gdkpixbuf.PixbufAnimationIter.fromAddress).marshal(iter, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OnCurrentlyLoadingFrameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code on_currently_loading_frame}
     * @param onCurrentlyLoadingFrame The new value of the field {@code on_currently_loading_frame}
     */
    public void setOnCurrentlyLoadingFrame(OnCurrentlyLoadingFrameCallback onCurrentlyLoadingFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("on_currently_loading_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (onCurrentlyLoadingFrame == null ? MemoryAddress.NULL : onCurrentlyLoadingFrame.toCallback()));
    }
    
    @FunctionalInterface
    public interface AdvanceCallback {
        boolean run(org.gtk.gdkpixbuf.PixbufAnimationIter iter, @Nullable org.gtk.glib.TimeVal currentTime);

        @ApiStatus.Internal default int upcall(MemoryAddress iter, MemoryAddress currentTime) {
            var RESULT = run((org.gtk.gdkpixbuf.PixbufAnimationIter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(iter)), org.gtk.gdkpixbuf.PixbufAnimationIter.fromAddress).marshal(iter, Ownership.NONE), org.gtk.glib.TimeVal.fromAddress.marshal(currentTime, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AdvanceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code advance}
     * @param advance The new value of the field {@code advance}
     */
    public void setAdvance(AdvanceCallback advance) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("advance"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (advance == null ? MemoryAddress.NULL : advance.toCallback()));
    }
    
    /**
     * Create a PixbufAnimationIterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PixbufAnimationIterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufAnimationIterClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PixbufAnimationIterClass(input, ownership);
    
    /**
     * A {@link PixbufAnimationIterClass.Builder} object constructs a {@link PixbufAnimationIterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PixbufAnimationIterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PixbufAnimationIterClass struct;
        
        private Builder() {
            struct = PixbufAnimationIterClass.allocate();
        }
        
         /**
         * Finish building the {@link PixbufAnimationIterClass} struct.
         * @return A new instance of {@code PixbufAnimationIterClass} with the fields 
         *         that were set in the Builder object.
         */
        public PixbufAnimationIterClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetDelayTime(GetDelayTimeCallback getDelayTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_delay_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDelayTime == null ? MemoryAddress.NULL : getDelayTime.toCallback()));
            return this;
        }
        
        public Builder setGetPixbuf(GetPixbufCallback getPixbuf) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_pixbuf"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPixbuf == null ? MemoryAddress.NULL : getPixbuf.toCallback()));
            return this;
        }
        
        public Builder setOnCurrentlyLoadingFrame(OnCurrentlyLoadingFrameCallback onCurrentlyLoadingFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("on_currently_loading_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (onCurrentlyLoadingFrame == null ? MemoryAddress.NULL : onCurrentlyLoadingFrame.toCallback()));
            return this;
        }
        
        public Builder setAdvance(AdvanceCallback advance) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("advance"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (advance == null ? MemoryAddress.NULL : advance.toCallback()));
            return this;
        }
    }
}
