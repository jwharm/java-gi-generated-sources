package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DiscovererClass extends Struct {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscovererClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parentclass"),
            Interop.valueLayout.ADDRESS.withName("finished"),
            Interop.valueLayout.ADDRESS.withName("starting"),
            Interop.valueLayout.ADDRESS.withName("discovered"),
            Interop.valueLayout.ADDRESS.withName("source_setup"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DiscovererClass}
     * @return A new, uninitialized @{link DiscovererClass}
     */
    public static DiscovererClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DiscovererClass newInstance = new DiscovererClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parentclass}
     * @return The value of the field {@code parentclass}
     */
    public org.gtk.gobject.ObjectClass getParentclass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parentclass"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parentclass}
     * @param parentclass The new value of the field {@code parentclass}
     */
    public void setParentclass(org.gtk.gobject.ObjectClass parentclass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parentclass"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentclass == null ? MemoryAddress.NULL : parentclass.handle()));
    }
    
    @FunctionalInterface
    public interface FinishedCallback {
        void run(org.gstreamer.pbutils.Discoverer discoverer);

        @ApiStatus.Internal default void upcall(MemoryAddress discoverer) {
            run((org.gstreamer.pbutils.Discoverer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(discoverer)), org.gstreamer.pbutils.Discoverer.fromAddress).marshal(discoverer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FinishedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finished}
     * @param finished The new value of the field {@code finished}
     */
    public void setFinished(FinishedCallback finished) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finished"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finished == null ? MemoryAddress.NULL : finished.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartingCallback {
        void run(org.gstreamer.pbutils.Discoverer discoverer);

        @ApiStatus.Internal default void upcall(MemoryAddress discoverer) {
            run((org.gstreamer.pbutils.Discoverer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(discoverer)), org.gstreamer.pbutils.Discoverer.fromAddress).marshal(discoverer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartingCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code starting}
     * @param starting The new value of the field {@code starting}
     */
    public void setStarting(StartingCallback starting) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("starting"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (starting == null ? MemoryAddress.NULL : starting.toCallback()));
    }
    
    @FunctionalInterface
    public interface DiscoveredCallback {
        void run(org.gstreamer.pbutils.Discoverer discoverer, org.gstreamer.pbutils.DiscovererInfo info, org.gtk.glib.Error err);

        @ApiStatus.Internal default void upcall(MemoryAddress discoverer, MemoryAddress info, MemoryAddress err) {
            run((org.gstreamer.pbutils.Discoverer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(discoverer)), org.gstreamer.pbutils.Discoverer.fromAddress).marshal(discoverer, Ownership.NONE), (org.gstreamer.pbutils.DiscovererInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gstreamer.pbutils.DiscovererInfo.fromAddress).marshal(info, Ownership.NONE), org.gtk.glib.Error.fromAddress.marshal(err, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DiscoveredCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code discovered}
     * @param discovered The new value of the field {@code discovered}
     */
    public void setDiscovered(DiscoveredCallback discovered) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("discovered"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (discovered == null ? MemoryAddress.NULL : discovered.toCallback()));
    }
    
    @FunctionalInterface
    public interface SourceSetupCallback {
        void run(org.gstreamer.pbutils.Discoverer discoverer, org.gstreamer.gst.Element source);

        @ApiStatus.Internal default void upcall(MemoryAddress discoverer, MemoryAddress source) {
            run((org.gstreamer.pbutils.Discoverer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(discoverer)), org.gstreamer.pbutils.Discoverer.fromAddress).marshal(discoverer, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(source)), org.gstreamer.gst.Element.fromAddress).marshal(source, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SourceSetupCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code source_setup}
     * @param sourceSetup The new value of the field {@code source_setup}
     */
    public void setSourceSetup(SourceSetupCallback sourceSetup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source_setup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sourceSetup == null ? MemoryAddress.NULL : sourceSetup.toCallback()));
    }
    
    /**
     * Get the value of the field {@code _reserved}
     * @return The value of the field {@code _reserved}
     */
    public java.lang.foreign.MemoryAddress[] getReserved() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getAddressArrayFrom(RESULT, 4);
    }
    
    /**
     * Change the value of the field {@code _reserved}
     * @param Reserved The new value of the field {@code _reserved}
     */
    public void setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
    }
    
    /**
     * Create a DiscovererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DiscovererClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DiscovererClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DiscovererClass(input, ownership);
    
    /**
     * A {@link DiscovererClass.Builder} object constructs a {@link DiscovererClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DiscovererClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DiscovererClass struct;
        
        private Builder() {
            struct = DiscovererClass.allocate();
        }
        
         /**
         * Finish building the {@link DiscovererClass} struct.
         * @return A new instance of {@code DiscovererClass} with the fields 
         *         that were set in the Builder object.
         */
        public DiscovererClass build() {
            return struct;
        }
        
        public Builder setParentclass(org.gtk.gobject.ObjectClass parentclass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parentclass"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentclass == null ? MemoryAddress.NULL : parentclass.handle()));
            return this;
        }
        
        public Builder setFinished(FinishedCallback finished) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finished"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finished == null ? MemoryAddress.NULL : finished.toCallback()));
            return this;
        }
        
        public Builder setStarting(StartingCallback starting) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("starting"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (starting == null ? MemoryAddress.NULL : starting.toCallback()));
            return this;
        }
        
        public Builder setDiscovered(DiscoveredCallback discovered) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("discovered"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (discovered == null ? MemoryAddress.NULL : discovered.toCallback()));
            return this;
        }
        
        public Builder setSourceSetup(SourceSetupCallback sourceSetup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source_setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sourceSetup == null ? MemoryAddress.NULL : sourceSetup.toCallback()));
            return this;
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
