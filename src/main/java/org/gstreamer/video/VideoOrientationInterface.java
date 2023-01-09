package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VideoOrientationInterface} interface.
 */
public class VideoOrientationInterface extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoOrientationInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("iface"),
            Interop.valueLayout.ADDRESS.withName("get_hflip"),
            Interop.valueLayout.ADDRESS.withName("get_vflip"),
            Interop.valueLayout.ADDRESS.withName("get_hcenter"),
            Interop.valueLayout.ADDRESS.withName("get_vcenter"),
            Interop.valueLayout.ADDRESS.withName("set_hflip"),
            Interop.valueLayout.ADDRESS.withName("set_vflip"),
            Interop.valueLayout.ADDRESS.withName("set_hcenter"),
            Interop.valueLayout.ADDRESS.withName("set_vcenter")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoOrientationInterface}
     * @return A new, uninitialized @{link VideoOrientationInterface}
     */
    public static VideoOrientationInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoOrientationInterface newInstance = new VideoOrientationInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code iface}
     * @return The value of the field {@code iface}
     */
    public org.gtk.gobject.TypeInterface getIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code iface}
     * @param iface The new value of the field {@code iface}
     */
    public void setIface(org.gtk.gobject.TypeInterface iface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetHflipCallback} callback.
     */
    @FunctionalInterface
    public interface GetHflipCallback {
    
        boolean run(org.gstreamer.video.VideoOrientation videoOrientation, Out<Boolean> flip);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoOrientation, MemoryAddress flip) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Boolean> flipOUT = new Out<>(flip.get(Interop.valueLayout.C_INT, 0) != 0);
                var RESULT = run((org.gstreamer.video.VideoOrientation) Interop.register(videoOrientation, org.gstreamer.video.VideoOrientation.fromAddress).marshal(videoOrientation, null), flipOUT);
                flip.set(Interop.valueLayout.C_INT, 0, flipOUT.get() ? 1 : 0);
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetHflipCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_hflip}
     * @param getHflip The new value of the field {@code get_hflip}
     */
    public void setGetHflip(GetHflipCallback getHflip) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_hflip"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getHflip == null ? MemoryAddress.NULL : getHflip.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetVflipCallback} callback.
     */
    @FunctionalInterface
    public interface GetVflipCallback {
    
        boolean run(org.gstreamer.video.VideoOrientation videoOrientation, Out<Boolean> flip);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoOrientation, MemoryAddress flip) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Boolean> flipOUT = new Out<>(flip.get(Interop.valueLayout.C_INT, 0) != 0);
                var RESULT = run((org.gstreamer.video.VideoOrientation) Interop.register(videoOrientation, org.gstreamer.video.VideoOrientation.fromAddress).marshal(videoOrientation, null), flipOUT);
                flip.set(Interop.valueLayout.C_INT, 0, flipOUT.get() ? 1 : 0);
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetVflipCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_vflip}
     * @param getVflip The new value of the field {@code get_vflip}
     */
    public void setGetVflip(GetVflipCallback getVflip) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_vflip"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVflip == null ? MemoryAddress.NULL : getVflip.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetHcenterCallback} callback.
     */
    @FunctionalInterface
    public interface GetHcenterCallback {
    
        boolean run(org.gstreamer.video.VideoOrientation videoOrientation, Out<Integer> center);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoOrientation, MemoryAddress center) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> centerOUT = new Out<>(center.get(Interop.valueLayout.C_INT, 0));
                var RESULT = run((org.gstreamer.video.VideoOrientation) Interop.register(videoOrientation, org.gstreamer.video.VideoOrientation.fromAddress).marshal(videoOrientation, null), centerOUT);
                center.set(Interop.valueLayout.C_INT, 0, centerOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetHcenterCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_hcenter}
     * @param getHcenter The new value of the field {@code get_hcenter}
     */
    public void setGetHcenter(GetHcenterCallback getHcenter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_hcenter"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getHcenter == null ? MemoryAddress.NULL : getHcenter.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetVcenterCallback} callback.
     */
    @FunctionalInterface
    public interface GetVcenterCallback {
    
        boolean run(org.gstreamer.video.VideoOrientation videoOrientation, Out<Integer> center);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoOrientation, MemoryAddress center) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> centerOUT = new Out<>(center.get(Interop.valueLayout.C_INT, 0));
                var RESULT = run((org.gstreamer.video.VideoOrientation) Interop.register(videoOrientation, org.gstreamer.video.VideoOrientation.fromAddress).marshal(videoOrientation, null), centerOUT);
                center.set(Interop.valueLayout.C_INT, 0, centerOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetVcenterCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_vcenter}
     * @param getVcenter The new value of the field {@code get_vcenter}
     */
    public void setGetVcenter(GetVcenterCallback getVcenter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_vcenter"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVcenter == null ? MemoryAddress.NULL : getVcenter.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetHflipCallback} callback.
     */
    @FunctionalInterface
    public interface SetHflipCallback {
    
        boolean run(org.gstreamer.video.VideoOrientation videoOrientation, boolean flip);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoOrientation, int flip) {
            var RESULT = run((org.gstreamer.video.VideoOrientation) Interop.register(videoOrientation, org.gstreamer.video.VideoOrientation.fromAddress).marshal(videoOrientation, null), Marshal.integerToBoolean.marshal(flip, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetHflipCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_hflip}
     * @param setHflip The new value of the field {@code set_hflip}
     */
    public void setSetHflip(SetHflipCallback setHflip) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_hflip"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setHflip == null ? MemoryAddress.NULL : setHflip.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetVflipCallback} callback.
     */
    @FunctionalInterface
    public interface SetVflipCallback {
    
        boolean run(org.gstreamer.video.VideoOrientation videoOrientation, boolean flip);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoOrientation, int flip) {
            var RESULT = run((org.gstreamer.video.VideoOrientation) Interop.register(videoOrientation, org.gstreamer.video.VideoOrientation.fromAddress).marshal(videoOrientation, null), Marshal.integerToBoolean.marshal(flip, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetVflipCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_vflip}
     * @param setVflip The new value of the field {@code set_vflip}
     */
    public void setSetVflip(SetVflipCallback setVflip) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_vflip"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setVflip == null ? MemoryAddress.NULL : setVflip.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetHcenterCallback} callback.
     */
    @FunctionalInterface
    public interface SetHcenterCallback {
    
        boolean run(org.gstreamer.video.VideoOrientation videoOrientation, int center);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoOrientation, int center) {
            var RESULT = run((org.gstreamer.video.VideoOrientation) Interop.register(videoOrientation, org.gstreamer.video.VideoOrientation.fromAddress).marshal(videoOrientation, null), center);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetHcenterCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_hcenter}
     * @param setHcenter The new value of the field {@code set_hcenter}
     */
    public void setSetHcenter(SetHcenterCallback setHcenter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_hcenter"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setHcenter == null ? MemoryAddress.NULL : setHcenter.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetVcenterCallback} callback.
     */
    @FunctionalInterface
    public interface SetVcenterCallback {
    
        boolean run(org.gstreamer.video.VideoOrientation videoOrientation, int center);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoOrientation, int center) {
            var RESULT = run((org.gstreamer.video.VideoOrientation) Interop.register(videoOrientation, org.gstreamer.video.VideoOrientation.fromAddress).marshal(videoOrientation, null), center);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetVcenterCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_vcenter}
     * @param setVcenter The new value of the field {@code set_vcenter}
     */
    public void setSetVcenter(SetVcenterCallback setVcenter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_vcenter"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setVcenter == null ? MemoryAddress.NULL : setVcenter.toCallback()));
        }
    }
    
    /**
     * Create a VideoOrientationInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoOrientationInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoOrientationInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoOrientationInterface(input);
    
    /**
     * A {@link VideoOrientationInterface.Builder} object constructs a {@link VideoOrientationInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoOrientationInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoOrientationInterface struct;
        
        private Builder() {
            struct = VideoOrientationInterface.allocate();
        }
        
        /**
         * Finish building the {@link VideoOrientationInterface} struct.
         * @return A new instance of {@code VideoOrientationInterface} with the fields 
         *         that were set in the Builder object.
         */
        public VideoOrientationInterface build() {
            return struct;
        }
        
        /**
         * parent interface type.
         * @param iface The value for the {@code iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIface(org.gtk.gobject.TypeInterface iface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
                return this;
            }
        }
        
        public Builder setGetHflip(GetHflipCallback getHflip) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_hflip"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getHflip == null ? MemoryAddress.NULL : getHflip.toCallback()));
                return this;
            }
        }
        
        public Builder setGetVflip(GetVflipCallback getVflip) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_vflip"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVflip == null ? MemoryAddress.NULL : getVflip.toCallback()));
                return this;
            }
        }
        
        public Builder setGetHcenter(GetHcenterCallback getHcenter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_hcenter"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getHcenter == null ? MemoryAddress.NULL : getHcenter.toCallback()));
                return this;
            }
        }
        
        public Builder setGetVcenter(GetVcenterCallback getVcenter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_vcenter"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVcenter == null ? MemoryAddress.NULL : getVcenter.toCallback()));
                return this;
            }
        }
        
        public Builder setSetHflip(SetHflipCallback setHflip) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_hflip"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setHflip == null ? MemoryAddress.NULL : setHflip.toCallback()));
                return this;
            }
        }
        
        public Builder setSetVflip(SetVflipCallback setVflip) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_vflip"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setVflip == null ? MemoryAddress.NULL : setVflip.toCallback()));
                return this;
            }
        }
        
        public Builder setSetHcenter(SetHcenterCallback setHcenter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_hcenter"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setHcenter == null ? MemoryAddress.NULL : setHcenter.toCallback()));
                return this;
            }
        }
        
        public Builder setSetVcenter(SetVcenterCallback setVcenter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_vcenter"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setVcenter == null ? MemoryAddress.NULL : setVcenter.toCallback()));
                return this;
            }
        }
    }
}
