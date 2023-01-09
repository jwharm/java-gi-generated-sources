package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GStreamer element class. Override the vmethods to implement the element
 * functionality.
 */
public class ElementClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstElementClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("metadata"),
            Interop.valueLayout.ADDRESS.withName("elementfactory"),
            Interop.valueLayout.ADDRESS.withName("padtemplates"),
            Interop.valueLayout.C_INT.withName("numpadtemplates"),
            Interop.valueLayout.C_INT.withName("pad_templ_cookie"),
            Interop.valueLayout.ADDRESS.withName("pad_added"),
            Interop.valueLayout.ADDRESS.withName("pad_removed"),
            Interop.valueLayout.ADDRESS.withName("no_more_pads"),
            Interop.valueLayout.ADDRESS.withName("request_new_pad"),
            Interop.valueLayout.ADDRESS.withName("release_pad"),
            Interop.valueLayout.ADDRESS.withName("get_state"),
            Interop.valueLayout.ADDRESS.withName("set_state"),
            Interop.valueLayout.ADDRESS.withName("change_state"),
            Interop.valueLayout.ADDRESS.withName("state_changed"),
            Interop.valueLayout.ADDRESS.withName("set_bus"),
            Interop.valueLayout.ADDRESS.withName("provide_clock"),
            Interop.valueLayout.ADDRESS.withName("set_clock"),
            Interop.valueLayout.ADDRESS.withName("send_event"),
            Interop.valueLayout.ADDRESS.withName("query"),
            Interop.valueLayout.ADDRESS.withName("post_message"),
            Interop.valueLayout.ADDRESS.withName("set_context"),
            MemoryLayout.sequenceLayout(18, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ElementClass}
     * @return A new, uninitialized @{link ElementClass}
     */
    public static ElementClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ElementClass newInstance = new ElementClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code metadata}
     * @return The value of the field {@code metadata}
     */
    public java.lang.foreign.MemoryAddress getMetadata_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("metadata"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code metadata}
     * @param metadata The new value of the field {@code metadata}
     */
    public void setMetadata_(java.lang.foreign.MemoryAddress metadata) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("metadata"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (metadata == null ? MemoryAddress.NULL : (Addressable) metadata));
        }
    }
    
    /**
     * Get the value of the field {@code elementfactory}
     * @return The value of the field {@code elementfactory}
     */
    public org.gstreamer.gst.ElementFactory getElementfactory() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("elementfactory"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.gstreamer.gst.ElementFactory) Interop.register(RESULT, org.gstreamer.gst.ElementFactory.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code elementfactory}
     * @param elementfactory The new value of the field {@code elementfactory}
     */
    public void setElementfactory(org.gstreamer.gst.ElementFactory elementfactory) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("elementfactory"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementfactory == null ? MemoryAddress.NULL : elementfactory.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code padtemplates}
     * @return The value of the field {@code padtemplates}
     */
    public org.gtk.glib.List getPadtemplates() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padtemplates"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code padtemplates}
     * @param padtemplates The new value of the field {@code padtemplates}
     */
    public void setPadtemplates(org.gtk.glib.List padtemplates) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padtemplates"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padtemplates == null ? MemoryAddress.NULL : padtemplates.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code numpadtemplates}
     * @return The value of the field {@code numpadtemplates}
     */
    public int getNumpadtemplates() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("numpadtemplates"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code numpadtemplates}
     * @param numpadtemplates The new value of the field {@code numpadtemplates}
     */
    public void setNumpadtemplates(int numpadtemplates) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("numpadtemplates"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), numpadtemplates);
        }
    }
    
    /**
     * Get the value of the field {@code pad_templ_cookie}
     * @return The value of the field {@code pad_templ_cookie}
     */
    public int getPadTemplCookie() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pad_templ_cookie"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code pad_templ_cookie}
     * @param padTemplCookie The new value of the field {@code pad_templ_cookie}
     */
    public void setPadTemplCookie(int padTemplCookie) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pad_templ_cookie"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), padTemplCookie);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PadAddedCallback} callback.
     */
    @FunctionalInterface
    public interface PadAddedCallback {
    
        void run(org.gstreamer.gst.Element element, org.gstreamer.gst.Pad pad);
        
        @ApiStatus.Internal default void upcall(MemoryAddress element, MemoryAddress pad) {
            run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), (org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadAddedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pad_added}
     * @param padAdded The new value of the field {@code pad_added}
     */
    public void setPadAdded(PadAddedCallback padAdded) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pad_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padAdded == null ? MemoryAddress.NULL : padAdded.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PadRemovedCallback} callback.
     */
    @FunctionalInterface
    public interface PadRemovedCallback {
    
        void run(org.gstreamer.gst.Element element, org.gstreamer.gst.Pad pad);
        
        @ApiStatus.Internal default void upcall(MemoryAddress element, MemoryAddress pad) {
            run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), (org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadRemovedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pad_removed}
     * @param padRemoved The new value of the field {@code pad_removed}
     */
    public void setPadRemoved(PadRemovedCallback padRemoved) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pad_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padRemoved == null ? MemoryAddress.NULL : padRemoved.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NoMorePadsCallback} callback.
     */
    @FunctionalInterface
    public interface NoMorePadsCallback {
    
        void run(org.gstreamer.gst.Element element);
        
        @ApiStatus.Internal default void upcall(MemoryAddress element) {
            run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NoMorePadsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code no_more_pads}
     * @param noMorePads The new value of the field {@code no_more_pads}
     */
    public void setNoMorePads(NoMorePadsCallback noMorePads) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("no_more_pads"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (noMorePads == null ? MemoryAddress.NULL : noMorePads.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RequestNewPadCallback} callback.
     */
    @FunctionalInterface
    public interface RequestNewPadCallback {
    
        @Nullable org.gstreamer.gst.Pad run(org.gstreamer.gst.Element element, org.gstreamer.gst.PadTemplate templ, @Nullable java.lang.String name, @Nullable org.gstreamer.gst.Caps caps);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress element, MemoryAddress templ, MemoryAddress name, MemoryAddress caps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), (org.gstreamer.gst.PadTemplate) Interop.register(templ, org.gstreamer.gst.PadTemplate.fromAddress).marshal(templ, null), Marshal.addressToString.marshal(name, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RequestNewPadCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_new_pad}
     * @param requestNewPad The new value of the field {@code request_new_pad}
     */
    public void setRequestNewPad(RequestNewPadCallback requestNewPad) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_new_pad"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestNewPad == null ? MemoryAddress.NULL : requestNewPad.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReleasePadCallback} callback.
     */
    @FunctionalInterface
    public interface ReleasePadCallback {
    
        void run(org.gstreamer.gst.Element element, org.gstreamer.gst.Pad pad);
        
        @ApiStatus.Internal default void upcall(MemoryAddress element, MemoryAddress pad) {
            run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), (org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReleasePadCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code release_pad}
     * @param releasePad The new value of the field {@code release_pad}
     */
    public void setReleasePad(ReleasePadCallback releasePad) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_pad"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (releasePad == null ? MemoryAddress.NULL : releasePad.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetStateCallback} callback.
     */
    @FunctionalInterface
    public interface GetStateCallback {
    
        org.gstreamer.gst.StateChangeReturn run(org.gstreamer.gst.Element element, @Nullable Out<org.gstreamer.gst.State> state, @Nullable Out<org.gstreamer.gst.State> pending, org.gstreamer.gst.ClockTime timeout);
        
        @ApiStatus.Internal default int upcall(MemoryAddress element, MemoryAddress state, MemoryAddress pending, long timeout) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<org.gstreamer.gst.State> stateOUT = new Out<>(org.gstreamer.gst.State.of(state.get(Interop.valueLayout.C_INT, 0)));
                Out<org.gstreamer.gst.State> pendingOUT = new Out<>(org.gstreamer.gst.State.of(pending.get(Interop.valueLayout.C_INT, 0)));
                var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), stateOUT, pendingOUT, new org.gstreamer.gst.ClockTime(timeout));
                state.set(Interop.valueLayout.C_INT, 0, stateOUT.get().getValue());
                pending.set(Interop.valueLayout.C_INT, 0, pendingOUT.get().getValue());
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetStateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_state}
     * @param getState The new value of the field {@code get_state}
     */
    public void setGetState(GetStateCallback getState) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getState == null ? MemoryAddress.NULL : getState.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetStateCallback} callback.
     */
    @FunctionalInterface
    public interface SetStateCallback {
    
        org.gstreamer.gst.StateChangeReturn run(org.gstreamer.gst.Element element, org.gstreamer.gst.State state);
        
        @ApiStatus.Internal default int upcall(MemoryAddress element, int state) {
            var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), org.gstreamer.gst.State.of(state));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetStateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_state}
     * @param setState The new value of the field {@code set_state}
     */
    public void setSetState(SetStateCallback setState) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setState == null ? MemoryAddress.NULL : setState.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangeStateCallback} callback.
     */
    @FunctionalInterface
    public interface ChangeStateCallback {
    
        org.gstreamer.gst.StateChangeReturn run(org.gstreamer.gst.Element element, org.gstreamer.gst.StateChange transition);
        
        @ApiStatus.Internal default int upcall(MemoryAddress element, int transition) {
            var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), org.gstreamer.gst.StateChange.of(transition));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangeStateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_state}
     * @param changeState The new value of the field {@code change_state}
     */
    public void setChangeState(ChangeStateCallback changeState) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeState == null ? MemoryAddress.NULL : changeState.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StateChangedCallback} callback.
     */
    @FunctionalInterface
    public interface StateChangedCallback {
    
        void run(org.gstreamer.gst.Element element, org.gstreamer.gst.State oldstate, org.gstreamer.gst.State newstate, org.gstreamer.gst.State pending);
        
        @ApiStatus.Internal default void upcall(MemoryAddress element, int oldstate, int newstate, int pending) {
            run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), org.gstreamer.gst.State.of(oldstate), org.gstreamer.gst.State.of(newstate), org.gstreamer.gst.State.of(pending));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StateChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code state_changed}
     * @param stateChanged The new value of the field {@code state_changed}
     */
    public void setStateChanged(StateChangedCallback stateChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stateChanged == null ? MemoryAddress.NULL : stateChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetBusCallback} callback.
     */
    @FunctionalInterface
    public interface SetBusCallback {
    
        void run(org.gstreamer.gst.Element element, @Nullable org.gstreamer.gst.Bus bus);
        
        @ApiStatus.Internal default void upcall(MemoryAddress element, MemoryAddress bus) {
            run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), (org.gstreamer.gst.Bus) Interop.register(bus, org.gstreamer.gst.Bus.fromAddress).marshal(bus, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetBusCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_bus}
     * @param setBus The new value of the field {@code set_bus}
     */
    public void setSetBus(SetBusCallback setBus) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_bus"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setBus == null ? MemoryAddress.NULL : setBus.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ProvideClockCallback} callback.
     */
    @FunctionalInterface
    public interface ProvideClockCallback {
    
        @Nullable org.gstreamer.gst.Clock run(org.gstreamer.gst.Element element);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress element) {
            var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ProvideClockCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code provide_clock}
     * @param provideClock The new value of the field {@code provide_clock}
     */
    public void setProvideClock(ProvideClockCallback provideClock) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("provide_clock"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (provideClock == null ? MemoryAddress.NULL : provideClock.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetClockCallback} callback.
     */
    @FunctionalInterface
    public interface SetClockCallback {
    
        boolean run(org.gstreamer.gst.Element element, @Nullable org.gstreamer.gst.Clock clock);
        
        @ApiStatus.Internal default int upcall(MemoryAddress element, MemoryAddress clock) {
            var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), (org.gstreamer.gst.Clock) Interop.register(clock, org.gstreamer.gst.Clock.fromAddress).marshal(clock, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetClockCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_clock}
     * @param setClock The new value of the field {@code set_clock}
     */
    public void setSetClock(SetClockCallback setClock) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_clock"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setClock == null ? MemoryAddress.NULL : setClock.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SendEventCallback} callback.
     */
    @FunctionalInterface
    public interface SendEventCallback {
    
        boolean run(org.gstreamer.gst.Element element, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress element, MemoryAddress event) {
            var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SendEventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send_event}
     * @param sendEvent The new value of the field {@code send_event}
     */
    public void setSendEvent(SendEventCallback sendEvent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendEvent == null ? MemoryAddress.NULL : sendEvent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryCallback} callback.
     */
    @FunctionalInterface
    public interface QueryCallback {
    
        boolean run(org.gstreamer.gst.Element element, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress element, MemoryAddress query) {
            var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void setQuery(QueryCallback query) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PostMessageCallback} callback.
     */
    @FunctionalInterface
    public interface PostMessageCallback {
    
        boolean run(org.gstreamer.gst.Element element, org.gstreamer.gst.Message message);
        
        @ApiStatus.Internal default int upcall(MemoryAddress element, MemoryAddress message) {
            var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), org.gstreamer.gst.Message.fromAddress.marshal(message, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PostMessageCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code post_message}
     * @param postMessage The new value of the field {@code post_message}
     */
    public void setPostMessage(PostMessageCallback postMessage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("post_message"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (postMessage == null ? MemoryAddress.NULL : postMessage.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetContextCallback} callback.
     */
    @FunctionalInterface
    public interface SetContextCallback {
    
        void run(org.gstreamer.gst.Element element, org.gstreamer.gst.Context context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress element, MemoryAddress context) {
            run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), org.gstreamer.gst.Context.fromAddress.marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetContextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_context}
     * @param setContext The new value of the field {@code set_context}
     */
    public void setSetContext(SetContextCallback setContext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setContext == null ? MemoryAddress.NULL : setContext.toCallback()));
        }
    }
    
    /**
     * Create a ElementClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ElementClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ElementClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ElementClass(input);
    
    /**
     * Set {@code key} with {@code value} as metadata in {@code klass}.
     * @param key the key to set
     * @param value the value to set
     */
    public void addMetadata(java.lang.String key, java.lang.String value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_element_class_add_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(value, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds a padtemplate to an element class. This is mainly used in the _class_init
     * functions of classes. If a pad template with the same name as an already
     * existing one is added the old one is replaced by the new one.
     * <p>
     * {@code templ}'s reference count will be incremented, and any floating
     * reference will be removed (see gst_object_ref_sink())
     * @param templ a {@link PadTemplate} to add to the element class.
     */
    public void addPadTemplate(org.gstreamer.gst.PadTemplate templ) {
        try {
            DowncallHandles.gst_element_class_add_pad_template.invokeExact(
                    handle(),
                    templ.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code key} with {@code value} as metadata in {@code klass}.
     * <p>
     * Same as gst_element_class_add_metadata(), but {@code value} must be a static string
     * or an inlined string, as it will not be copied. (GStreamer plugins will
     * be made resident once loaded, so this function can be used even from
     * dynamically loaded plugins.)
     * @param key the key to set
     * @param value the value to set
     */
    public void addStaticMetadata(java.lang.String key, java.lang.String value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_element_class_add_static_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(value, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds a pad template to an element class based on the static pad template
     * {@code templ}. This is mainly used in the _class_init functions of element
     * implementations. If a pad template with the same name already exists,
     * the old one is replaced by the new one.
     * @param staticTempl {@link StaticPadTemplate} to add as pad template to the element class.
     */
    public void addStaticPadTemplate(org.gstreamer.gst.StaticPadTemplate staticTempl) {
        try {
            DowncallHandles.gst_element_class_add_static_pad_template.invokeExact(
                    handle(),
                    staticTempl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a pad template to an element class based on the static pad template
     * {@code templ}. This is mainly used in the _class_init functions of element
     * implementations. If a pad template with the same name already exists,
     * the old one is replaced by the new one.
     * @param staticTempl {@link StaticPadTemplate} to add as pad template to the element class.
     * @param padType The {@link org.gtk.glib.Type} of the pad to create
     */
    public void addStaticPadTemplateWithGtype(org.gstreamer.gst.StaticPadTemplate staticTempl, org.gtk.glib.Type padType) {
        try {
            DowncallHandles.gst_element_class_add_static_pad_template_with_gtype.invokeExact(
                    handle(),
                    staticTempl.handle(),
                    padType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get metadata with {@code key} in {@code klass}.
     * @param key the key to get
     * @return the metadata for {@code key}.
     */
    public java.lang.String getMetadata(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_class_get_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Retrieves a padtemplate from {@code element_class} with the given name.
     * <blockquote>
     *  If you use this function in the {@link org.gtk.gobject.InstanceInitFunc} of an object class
     *  that has subclasses, make sure to pass the g_class parameter of the
     *  {@link org.gtk.gobject.InstanceInitFunc} here.
     * </blockquote>
     * @param name the name of the {@link PadTemplate} to get.
     * @return the {@link PadTemplate} with the
     *     given name, or {@code null} if none was found. No unreferencing is
     *     necessary.
     */
    public @Nullable org.gstreamer.gst.PadTemplate getPadTemplate(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_element_class_get_pad_template.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gstreamer.gst.PadTemplate) Interop.register(RESULT, org.gstreamer.gst.PadTemplate.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Retrieves a list of the pad templates associated with {@code element_class}. The
     * list must not be modified by the calling code.
     * <blockquote>
     *  If you use this function in the {@link org.gtk.gobject.InstanceInitFunc} of an object class
     *  that has subclasses, make sure to pass the g_class parameter of the
     *  {@link org.gtk.gobject.InstanceInitFunc} here.
     * </blockquote>
     * @return the {@link org.gtk.glib.List} of
     *     pad templates.
     */
    public org.gtk.glib.List getPadTemplateList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_class_get_pad_template_list.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Sets the detailed information for a {@link ElementClass}.
     * <blockquote>
     *  This function is for use in _class_init functions only.
     * </blockquote>
     * @param longname The long English name of the element. E.g. "File Sink"
     * @param classification String describing the type of element, as an unordered list
     * separated with slashes ('/'). See draft-klass.txt of the design docs
     * for more details and common types. E.g: "Sink/File"
     * @param description Sentence describing the purpose of the element.
     * E.g: "Write stream to a file"
     * @param author Name and contact details of the author(s). Use \\n to separate
     * multiple author metadata. E.g: "Joe Bloggs &amp;lt;joe.blogs at foo.com&amp;gt;"
     */
    public void setMetadata(java.lang.String longname, java.lang.String classification, java.lang.String description, java.lang.String author) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_element_class_set_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(longname, SCOPE),
                        Marshal.stringToAddress.marshal(classification, SCOPE),
                        Marshal.stringToAddress.marshal(description, SCOPE),
                        Marshal.stringToAddress.marshal(author, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the detailed information for a {@link ElementClass}.
     * <p>
     * <blockquote>
     *  This function is for use in _class_init functions only.
     * </blockquote><p>
     * Same as gst_element_class_set_metadata(), but {@code longname}, {@code classification},
     * {@code description}, and {@code author} must be static strings or inlined strings, as
     * they will not be copied. (GStreamer plugins will be made resident once
     * loaded, so this function can be used even from dynamically loaded plugins.)
     * @param longname The long English name of the element. E.g. "File Sink"
     * @param classification String describing the type of element, as an unordered list
     * separated with slashes ('/'). See draft-klass.txt of the design docs
     * for more details and common types. E.g: "Sink/File"
     * @param description Sentence describing the purpose of the element.
     * E.g: "Write stream to a file"
     * @param author Name and contact details of the author(s). Use \\n to separate
     * multiple author metadata. E.g: "Joe Bloggs &amp;lt;joe.blogs at foo.com&amp;gt;"
     */
    public void setStaticMetadata(java.lang.String longname, java.lang.String classification, java.lang.String description, java.lang.String author) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_element_class_set_static_metadata.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(longname, SCOPE),
                        Marshal.stringToAddress.marshal(classification, SCOPE),
                        Marshal.stringToAddress.marshal(description, SCOPE),
                        Marshal.stringToAddress.marshal(author, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_element_class_add_metadata = Interop.downcallHandle(
                "gst_element_class_add_metadata",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_class_add_pad_template = Interop.downcallHandle(
                "gst_element_class_add_pad_template",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_class_add_static_metadata = Interop.downcallHandle(
                "gst_element_class_add_static_metadata",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_class_add_static_pad_template = Interop.downcallHandle(
                "gst_element_class_add_static_pad_template",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_class_add_static_pad_template_with_gtype = Interop.downcallHandle(
                "gst_element_class_add_static_pad_template_with_gtype",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_element_class_get_metadata = Interop.downcallHandle(
                "gst_element_class_get_metadata",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_class_get_pad_template = Interop.downcallHandle(
                "gst_element_class_get_pad_template",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_class_get_pad_template_list = Interop.downcallHandle(
                "gst_element_class_get_pad_template_list",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_class_set_metadata = Interop.downcallHandle(
                "gst_element_class_set_metadata",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_element_class_set_static_metadata = Interop.downcallHandle(
                "gst_element_class_set_static_metadata",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link ElementClass.Builder} object constructs a {@link ElementClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ElementClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ElementClass struct;
        
        private Builder() {
            struct = ElementClass.allocate();
        }
        
        /**
         * Finish building the {@link ElementClass} struct.
         * @return A new instance of {@code ElementClass} with the fields 
         *         that were set in the Builder object.
         */
        public ElementClass build() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        /**
         * metadata for elements of this class
         * @param metadata The value for the {@code metadata} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMetadata(java.lang.foreign.MemoryAddress metadata) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("metadata"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (metadata == null ? MemoryAddress.NULL : (Addressable) metadata));
                return this;
            }
        }
        
        /**
         * the {@link ElementFactory} that creates these elements
         * @param elementfactory The value for the {@code elementfactory} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setElementfactory(org.gstreamer.gst.ElementFactory elementfactory) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("elementfactory"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementfactory == null ? MemoryAddress.NULL : elementfactory.handle()));
                return this;
            }
        }
        
        /**
         * a {@link org.gtk.glib.List} of {@link PadTemplate}
         * @param padtemplates The value for the {@code padtemplates} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPadtemplates(org.gtk.glib.List padtemplates) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padtemplates"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padtemplates == null ? MemoryAddress.NULL : padtemplates.handle()));
                return this;
            }
        }
        
        /**
         * the number of padtemplates
         * @param numpadtemplates The value for the {@code numpadtemplates} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNumpadtemplates(int numpadtemplates) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("numpadtemplates"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), numpadtemplates);
                return this;
            }
        }
        
        /**
         * changed whenever the padtemplates change
         * @param padTemplCookie The value for the {@code padTemplCookie} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPadTemplCookie(int padTemplCookie) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pad_templ_cookie"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), padTemplCookie);
                return this;
            }
        }
        
        public Builder setPadAdded(PadAddedCallback padAdded) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pad_added"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padAdded == null ? MemoryAddress.NULL : padAdded.toCallback()));
                return this;
            }
        }
        
        public Builder setPadRemoved(PadRemovedCallback padRemoved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pad_removed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padRemoved == null ? MemoryAddress.NULL : padRemoved.toCallback()));
                return this;
            }
        }
        
        public Builder setNoMorePads(NoMorePadsCallback noMorePads) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("no_more_pads"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (noMorePads == null ? MemoryAddress.NULL : noMorePads.toCallback()));
                return this;
            }
        }
        
        public Builder setRequestNewPad(RequestNewPadCallback requestNewPad) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("request_new_pad"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestNewPad == null ? MemoryAddress.NULL : requestNewPad.toCallback()));
                return this;
            }
        }
        
        public Builder setReleasePad(ReleasePadCallback releasePad) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("release_pad"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (releasePad == null ? MemoryAddress.NULL : releasePad.toCallback()));
                return this;
            }
        }
        
        public Builder setGetState(GetStateCallback getState) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_state"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getState == null ? MemoryAddress.NULL : getState.toCallback()));
                return this;
            }
        }
        
        public Builder setSetState(SetStateCallback setState) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_state"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setState == null ? MemoryAddress.NULL : setState.toCallback()));
                return this;
            }
        }
        
        public Builder setChangeState(ChangeStateCallback changeState) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("change_state"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeState == null ? MemoryAddress.NULL : changeState.toCallback()));
                return this;
            }
        }
        
        public Builder setStateChanged(StateChangedCallback stateChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("state_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stateChanged == null ? MemoryAddress.NULL : stateChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setSetBus(SetBusCallback setBus) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_bus"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setBus == null ? MemoryAddress.NULL : setBus.toCallback()));
                return this;
            }
        }
        
        public Builder setProvideClock(ProvideClockCallback provideClock) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("provide_clock"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (provideClock == null ? MemoryAddress.NULL : provideClock.toCallback()));
                return this;
            }
        }
        
        public Builder setSetClock(SetClockCallback setClock) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_clock"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setClock == null ? MemoryAddress.NULL : setClock.toCallback()));
                return this;
            }
        }
        
        public Builder setSendEvent(SendEventCallback sendEvent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("send_event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendEvent == null ? MemoryAddress.NULL : sendEvent.toCallback()));
                return this;
            }
        }
        
        public Builder setQuery(QueryCallback query) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
                return this;
            }
        }
        
        public Builder setPostMessage(PostMessageCallback postMessage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("post_message"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (postMessage == null ? MemoryAddress.NULL : postMessage.toCallback()));
                return this;
            }
        }
        
        public Builder setSetContext(SetContextCallback setContext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setContext == null ? MemoryAddress.NULL : setContext.toCallback()));
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
