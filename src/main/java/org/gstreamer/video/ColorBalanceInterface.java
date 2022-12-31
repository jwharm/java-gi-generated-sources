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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ColorBalanceInterface newInstance = new ColorBalanceInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code iface}
     * @return The value of the field {@code iface}
     */
    public org.gtk.gobject.TypeInterface getIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code iface}
     * @param iface The new value of the field {@code iface}
     */
    public void setIface(org.gtk.gobject.TypeInterface iface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
    }
    
    @FunctionalInterface
    public interface ListChannelsCallback {
        org.gtk.glib.List run(org.gstreamer.video.ColorBalance balance);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress balance) {
            var RESULT = run((org.gstreamer.video.ColorBalance) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(balance)), org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ListChannelsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code list_channels}
     * @param listChannels The new value of the field {@code list_channels}
     */
    public void setListChannels(ListChannelsCallback listChannels) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("list_channels"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (listChannels == null ? MemoryAddress.NULL : listChannels.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetValueCallback {
        void run(org.gstreamer.video.ColorBalance balance, org.gstreamer.video.ColorBalanceChannel channel, int value);

        @ApiStatus.Internal default void upcall(MemoryAddress balance, MemoryAddress channel, int value) {
            run((org.gstreamer.video.ColorBalance) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(balance)), org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, Ownership.NONE), (org.gstreamer.video.ColorBalanceChannel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(channel)), org.gstreamer.video.ColorBalanceChannel.fromAddress).marshal(channel, Ownership.NONE), value);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetValueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_value}
     * @param setValue The new value of the field {@code set_value}
     */
    public void setSetValue(SetValueCallback setValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setValue == null ? MemoryAddress.NULL : setValue.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetValueCallback {
        int run(org.gstreamer.video.ColorBalance balance, org.gstreamer.video.ColorBalanceChannel channel);

        @ApiStatus.Internal default int upcall(MemoryAddress balance, MemoryAddress channel) {
            var RESULT = run((org.gstreamer.video.ColorBalance) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(balance)), org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, Ownership.NONE), (org.gstreamer.video.ColorBalanceChannel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(channel)), org.gstreamer.video.ColorBalanceChannel.fromAddress).marshal(channel, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetValueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value}
     * @param getValue The new value of the field {@code get_value}
     */
    public void setGetValue(GetValueCallback getValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetBalanceTypeCallback {
        org.gstreamer.video.ColorBalanceType run(org.gstreamer.video.ColorBalance balance);

        @ApiStatus.Internal default int upcall(MemoryAddress balance) {
            var RESULT = run((org.gstreamer.video.ColorBalance) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(balance)), org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetBalanceTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_balance_type}
     * @param getBalanceType The new value of the field {@code get_balance_type}
     */
    public void setGetBalanceType(GetBalanceTypeCallback getBalanceType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_balance_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBalanceType == null ? MemoryAddress.NULL : getBalanceType.toCallback()));
    }
    
    @FunctionalInterface
    public interface ValueChangedCallback {
        void run(org.gstreamer.video.ColorBalance balance, org.gstreamer.video.ColorBalanceChannel channel, int value);

        @ApiStatus.Internal default void upcall(MemoryAddress balance, MemoryAddress channel, int value) {
            run((org.gstreamer.video.ColorBalance) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(balance)), org.gstreamer.video.ColorBalance.fromAddress).marshal(balance, Ownership.NONE), (org.gstreamer.video.ColorBalanceChannel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(channel)), org.gstreamer.video.ColorBalanceChannel.fromAddress).marshal(channel, Ownership.NONE), value);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_changed}
     * @param valueChanged The new value of the field {@code value_changed}
     */
    public void setValueChanged(ValueChangedCallback valueChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
    }
    
    /**
     * Create a ColorBalanceInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ColorBalanceInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ColorBalanceInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ColorBalanceInterface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
            return this;
        }
        
        public Builder setListChannels(ListChannelsCallback listChannels) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (listChannels == null ? MemoryAddress.NULL : listChannels.toCallback()));
            return this;
        }
        
        public Builder setSetValue(SetValueCallback setValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setValue == null ? MemoryAddress.NULL : setValue.toCallback()));
            return this;
        }
        
        public Builder setGetValue(GetValueCallback getValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
            return this;
        }
        
        public Builder setGetBalanceType(GetBalanceTypeCallback getBalanceType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_balance_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBalanceType == null ? MemoryAddress.NULL : getBalanceType.toCallback()));
            return this;
        }
        
        public Builder setValueChanged(ValueChangedCallback valueChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
