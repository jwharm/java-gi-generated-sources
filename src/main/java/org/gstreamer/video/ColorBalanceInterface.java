package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Color-balance interface.
 */
public class ColorBalanceInterface extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstColorBalanceInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("iface"),
            Interop.valueLayout.ADDRESS.withName("list_channels"),
            Interop.valueLayout.ADDRESS.withName("set_value"),
            Interop.valueLayout.ADDRESS.withName("get_value"),
            Interop.valueLayout.ADDRESS.withName("get_balance_type"),
            Interop.valueLayout.ADDRESS.withName("value_changed"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ColorBalanceInterface}
     * @return A new, uninitialized @{link ColorBalanceInterface}
     */
    public static ColorBalanceInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ColorBalanceInterface newInstance = new ColorBalanceInterface(segment.address());
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
     * Functional interface declaration of the {@code ListChannelsCallback} callback.
     */
    @FunctionalInterface
    public interface ListChannelsCallback {
    
        org.gtk.glib.List run(org.gstreamer.video.ColorBalance balance);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress balance) {
            var RESULT = run((org.gstreamer.video.ColorBalance) Interop.register(balance, org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListChannelsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code list_channels}
     * @param listChannels The new value of the field {@code list_channels}
     */
    public void setListChannels(ListChannelsCallback listChannels) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listChannels == null ? MemoryAddress.NULL : listChannels.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetValueCallback} callback.
     */
    @FunctionalInterface
    public interface SetValueCallback {
    
        void run(org.gstreamer.video.ColorBalance balance, org.gstreamer.video.ColorBalanceChannel channel, int value);
        
        @ApiStatus.Internal default void upcall(MemoryAddress balance, MemoryAddress channel, int value) {
            run((org.gstreamer.video.ColorBalance) Interop.register(balance, org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, null), (org.gstreamer.video.ColorBalanceChannel) Interop.register(channel, org.gstreamer.video.ColorBalanceChannel.fromAddress).marshal(channel, null), value);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_value}
     * @param setValue The new value of the field {@code set_value}
     */
    public void setSetValue(SetValueCallback setValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setValue == null ? MemoryAddress.NULL : setValue.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetValueCallback} callback.
     */
    @FunctionalInterface
    public interface GetValueCallback {
    
        int run(org.gstreamer.video.ColorBalance balance, org.gstreamer.video.ColorBalanceChannel channel);
        
        @ApiStatus.Internal default int upcall(MemoryAddress balance, MemoryAddress channel) {
            var RESULT = run((org.gstreamer.video.ColorBalance) Interop.register(balance, org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, null), (org.gstreamer.video.ColorBalanceChannel) Interop.register(channel, org.gstreamer.video.ColorBalanceChannel.fromAddress).marshal(channel, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value}
     * @param getValue The new value of the field {@code get_value}
     */
    public void setGetValue(GetValueCallback getValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetBalanceTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetBalanceTypeCallback {
    
        org.gstreamer.video.ColorBalanceType run(org.gstreamer.video.ColorBalance balance);
        
        @ApiStatus.Internal default int upcall(MemoryAddress balance) {
            var RESULT = run((org.gstreamer.video.ColorBalance) Interop.register(balance, org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetBalanceTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_balance_type}
     * @param getBalanceType The new value of the field {@code get_balance_type}
     */
    public void setGetBalanceType(GetBalanceTypeCallback getBalanceType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_balance_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getBalanceType == null ? MemoryAddress.NULL : getBalanceType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ValueChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ValueChangedCallback {
    
        void run(org.gstreamer.video.ColorBalance balance, org.gstreamer.video.ColorBalanceChannel channel, int value);
        
        @ApiStatus.Internal default void upcall(MemoryAddress balance, MemoryAddress channel, int value) {
            run((org.gstreamer.video.ColorBalance) Interop.register(balance, org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, null), (org.gstreamer.video.ColorBalanceChannel) Interop.register(channel, org.gstreamer.video.ColorBalanceChannel.fromAddress).marshal(channel, null), value);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_changed}
     * @param valueChanged The new value of the field {@code value_changed}
     */
    public void setValueChanged(ValueChangedCallback valueChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
        }
    }
    
    /**
     * Create a ColorBalanceInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ColorBalanceInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ColorBalanceInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ColorBalanceInterface(input);
    
    /**
     * A {@link ColorBalanceInterface.Builder} object constructs a {@link ColorBalanceInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ColorBalanceInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ColorBalanceInterface struct;
        
        private Builder() {
            struct = ColorBalanceInterface.allocate();
        }
        
        /**
         * Finish building the {@link ColorBalanceInterface} struct.
         * @return A new instance of {@code ColorBalanceInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ColorBalanceInterface build() {
            return struct;
        }
        
        /**
         * the parent interface
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
        
        public Builder setListChannels(ListChannelsCallback listChannels) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("list_channels"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listChannels == null ? MemoryAddress.NULL : listChannels.toCallback()));
                return this;
            }
        }
        
        public Builder setSetValue(SetValueCallback setValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setValue == null ? MemoryAddress.NULL : setValue.toCallback()));
                return this;
            }
        }
        
        public Builder setGetValue(GetValueCallback getValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
                return this;
            }
        }
        
        public Builder setGetBalanceType(GetBalanceTypeCallback getBalanceType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_balance_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getBalanceType == null ? MemoryAddress.NULL : getBalanceType.toCallback()));
                return this;
            }
        }
        
        public Builder setValueChanged(ValueChangedCallback valueChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
