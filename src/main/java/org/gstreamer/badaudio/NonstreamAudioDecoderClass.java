package org.gstreamer.badaudio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available optional virtual methods or not, as
 * needed. At minimum, {@code load_from_buffer} (or {@code load_from_custom}), {@code get_supported_output_modes},
 * and {@code decode} need to be overridden.
 * <p>
 * All functions are called with a locked decoder mutex.
 * <p>
 * <blockquote>
 *  If GST_ELEMENT_ERROR, GST_ELEMENT_WARNING, or GST_ELEMENT_INFO are called from
 *  inside one of these functions, it is strongly recommended to unlock the decoder mutex
 *  before and re-lock it after these macros to prevent potential deadlocks in case the
 *  application does something with the element when it receives an ERROR/WARNING/INFO
 *  message. Same goes for gst_element_post_message() calls and non-serialized events.
 * </blockquote><p>
 * By default, this class works by reading media data from the sinkpad, and then commencing
 * playback. Some decoders cannot be given data from a memory block, so the usual way of
 * reading all upstream data and passing it to {@code load_from_buffer} doesn't work then. In this case,
 * set the value of loads_from_sinkpad to FALSE. This changes the way this class operates;
 * it does not require a sinkpad to exist anymore, and will call {@code load_from_custom} instead.
 * One example of a decoder where this makes sense is UADE (Unix Amiga Delitracker Emulator).
 * For some formats (such as TFMX), it needs to do the file loading by itself.
 * Since most decoders can read input data from a memory block, the default value of
 * loads_from_sinkpad is TRUE.
 */
public class NonstreamAudioDecoderClass extends Struct {
    
    static {
        GstBadAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNonstreamAudioDecoderClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("element_class"),
            Interop.valueLayout.C_INT.withName("loads_from_sinkpad"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("seek"),
            Interop.valueLayout.ADDRESS.withName("tell"),
            Interop.valueLayout.ADDRESS.withName("load_from_buffer"),
            Interop.valueLayout.ADDRESS.withName("load_from_custom"),
            Interop.valueLayout.ADDRESS.withName("get_main_tags"),
            Interop.valueLayout.ADDRESS.withName("set_current_subsong"),
            Interop.valueLayout.ADDRESS.withName("get_current_subsong"),
            Interop.valueLayout.ADDRESS.withName("get_num_subsongs"),
            Interop.valueLayout.ADDRESS.withName("get_subsong_duration"),
            Interop.valueLayout.ADDRESS.withName("get_subsong_tags"),
            Interop.valueLayout.ADDRESS.withName("set_subsong_mode"),
            Interop.valueLayout.ADDRESS.withName("set_num_loops"),
            Interop.valueLayout.ADDRESS.withName("get_num_loops"),
            Interop.valueLayout.ADDRESS.withName("get_supported_output_modes"),
            Interop.valueLayout.ADDRESS.withName("set_output_mode"),
            Interop.valueLayout.ADDRESS.withName("decode"),
            Interop.valueLayout.ADDRESS.withName("negotiate"),
            Interop.valueLayout.ADDRESS.withName("decide_allocation"),
            Interop.valueLayout.ADDRESS.withName("propose_allocation"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link NonstreamAudioDecoderClass}
     * @return A new, uninitialized @{link NonstreamAudioDecoderClass}
     */
    public static NonstreamAudioDecoderClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        NonstreamAudioDecoderClass newInstance = new NonstreamAudioDecoderClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code element_class}
     * @return The value of the field {@code element_class}
     */
    public org.gstreamer.gst.ElementClass getElementClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("element_class"));
        return org.gstreamer.gst.ElementClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code element_class}
     * @param elementClass The new value of the field {@code element_class}
     */
    public void setElementClass(org.gstreamer.gst.ElementClass elementClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementClass == null ? MemoryAddress.NULL : elementClass.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code loads_from_sinkpad}
     * @return The value of the field {@code loads_from_sinkpad}
     */
    public boolean getLoadsFromSinkpad() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loads_from_sinkpad"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code loads_from_sinkpad}
     * @param loadsFromSinkpad The new value of the field {@code loads_from_sinkpad}
     */
    public void setLoadsFromSinkpad(boolean loadsFromSinkpad) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loads_from_sinkpad"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(loadsFromSinkpad, null).intValue());
        }
    }
    
    /**
     * Functional interface declaration of the {@code SeekCallback} callback.
     */
    @FunctionalInterface
    public interface SeekCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, org.gstreamer.gst.ClockTime newPosition);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, MemoryAddress newPosition) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                org.gstreamer.gst.ClockTime newPositionALIAS = new org.gstreamer.gst.ClockTime(newPosition.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), newPositionALIAS);
                newPosition.set(Interop.valueLayout.C_LONG, 0, newPositionALIAS.getValue());
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SeekCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code seek}
     * @param seek The new value of the field {@code seek}
     */
    public void setSeek(SeekCallback seek) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (seek == null ? MemoryAddress.NULL : seek.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TellCallback} callback.
     */
    @FunctionalInterface
    public interface TellCallback {
    
        org.gstreamer.gst.ClockTime run(org.gstreamer.badaudio.NonstreamAudioDecoder dec);
        
        @ApiStatus.Internal default long upcall(MemoryAddress dec) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null));
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TellCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tell}
     * @param tell The new value of the field {@code tell}
     */
    public void setTell(TellCallback tell) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tell"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tell == null ? MemoryAddress.NULL : tell.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LoadFromBufferCallback} callback.
     */
    @FunctionalInterface
    public interface LoadFromBufferCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, org.gstreamer.gst.Buffer sourceData, int initialSubsong, org.gstreamer.badaudio.NonstreamAudioSubsongMode initialSubsongMode, org.gstreamer.gst.ClockTime initialPosition, PointerEnumeration<org.gstreamer.badaudio.NonstreamAudioOutputMode> initialOutputMode, PointerInteger initialNumLoops);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, MemoryAddress sourceData, int initialSubsong, int initialSubsongMode, MemoryAddress initialPosition, MemoryAddress initialOutputMode, MemoryAddress initialNumLoops) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                org.gstreamer.gst.ClockTime initialPositionALIAS = new org.gstreamer.gst.ClockTime(initialPosition.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), org.gstreamer.gst.Buffer.fromAddress.marshal(sourceData, null), initialSubsong, org.gstreamer.badaudio.NonstreamAudioSubsongMode.of(initialSubsongMode), initialPositionALIAS, new PointerEnumeration<org.gstreamer.badaudio.NonstreamAudioOutputMode>(initialOutputMode, org.gstreamer.badaudio.NonstreamAudioOutputMode::of), new PointerInteger(initialNumLoops));
                initialPosition.set(Interop.valueLayout.C_LONG, 0, initialPositionALIAS.getValue());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LoadFromBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_from_buffer}
     * @param loadFromBuffer The new value of the field {@code load_from_buffer}
     */
    public void setLoadFromBuffer(LoadFromBufferCallback loadFromBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_from_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFromBuffer == null ? MemoryAddress.NULL : loadFromBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LoadFromCustomCallback} callback.
     */
    @FunctionalInterface
    public interface LoadFromCustomCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, int initialSubsong, org.gstreamer.badaudio.NonstreamAudioSubsongMode initialSubsongMode, org.gstreamer.gst.ClockTime initialPosition, PointerEnumeration<org.gstreamer.badaudio.NonstreamAudioOutputMode> initialOutputMode, PointerInteger initialNumLoops);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, int initialSubsong, int initialSubsongMode, MemoryAddress initialPosition, MemoryAddress initialOutputMode, MemoryAddress initialNumLoops) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                org.gstreamer.gst.ClockTime initialPositionALIAS = new org.gstreamer.gst.ClockTime(initialPosition.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), initialSubsong, org.gstreamer.badaudio.NonstreamAudioSubsongMode.of(initialSubsongMode), initialPositionALIAS, new PointerEnumeration<org.gstreamer.badaudio.NonstreamAudioOutputMode>(initialOutputMode, org.gstreamer.badaudio.NonstreamAudioOutputMode::of), new PointerInteger(initialNumLoops));
                initialPosition.set(Interop.valueLayout.C_LONG, 0, initialPositionALIAS.getValue());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LoadFromCustomCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_from_custom}
     * @param loadFromCustom The new value of the field {@code load_from_custom}
     */
    public void setLoadFromCustom(LoadFromCustomCallback loadFromCustom) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_from_custom"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFromCustom == null ? MemoryAddress.NULL : loadFromCustom.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetMainTagsCallback} callback.
     */
    @FunctionalInterface
    public interface GetMainTagsCallback {
    
        org.gstreamer.gst.TagList run(org.gstreamer.badaudio.NonstreamAudioDecoder dec);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress dec) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetMainTagsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_main_tags}
     * @param getMainTags The new value of the field {@code get_main_tags}
     */
    public void setGetMainTags(GetMainTagsCallback getMainTags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_main_tags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMainTags == null ? MemoryAddress.NULL : getMainTags.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetCurrentSubsongCallback} callback.
     */
    @FunctionalInterface
    public interface SetCurrentSubsongCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, int subsong, org.gstreamer.gst.ClockTime initialPosition);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, int subsong, MemoryAddress initialPosition) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                org.gstreamer.gst.ClockTime initialPositionALIAS = new org.gstreamer.gst.ClockTime(initialPosition.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), subsong, initialPositionALIAS);
                initialPosition.set(Interop.valueLayout.C_LONG, 0, initialPositionALIAS.getValue());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetCurrentSubsongCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_current_subsong}
     * @param setCurrentSubsong The new value of the field {@code set_current_subsong}
     */
    public void setSetCurrentSubsong(SetCurrentSubsongCallback setCurrentSubsong) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_current_subsong"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCurrentSubsong == null ? MemoryAddress.NULL : setCurrentSubsong.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCurrentSubsongCallback} callback.
     */
    @FunctionalInterface
    public interface GetCurrentSubsongCallback {
    
        int run(org.gstreamer.badaudio.NonstreamAudioDecoder dec);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCurrentSubsongCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_current_subsong}
     * @param getCurrentSubsong The new value of the field {@code get_current_subsong}
     */
    public void setGetCurrentSubsong(GetCurrentSubsongCallback getCurrentSubsong) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_current_subsong"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCurrentSubsong == null ? MemoryAddress.NULL : getCurrentSubsong.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetNumSubsongsCallback} callback.
     */
    @FunctionalInterface
    public interface GetNumSubsongsCallback {
    
        int run(org.gstreamer.badaudio.NonstreamAudioDecoder dec);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetNumSubsongsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_num_subsongs}
     * @param getNumSubsongs The new value of the field {@code get_num_subsongs}
     */
    public void setGetNumSubsongs(GetNumSubsongsCallback getNumSubsongs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_num_subsongs"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNumSubsongs == null ? MemoryAddress.NULL : getNumSubsongs.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSubsongDurationCallback} callback.
     */
    @FunctionalInterface
    public interface GetSubsongDurationCallback {
    
        org.gstreamer.gst.ClockTime run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, int subsong);
        
        @ApiStatus.Internal default long upcall(MemoryAddress dec, int subsong) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), subsong);
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSubsongDurationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_subsong_duration}
     * @param getSubsongDuration The new value of the field {@code get_subsong_duration}
     */
    public void setGetSubsongDuration(GetSubsongDurationCallback getSubsongDuration) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_subsong_duration"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSubsongDuration == null ? MemoryAddress.NULL : getSubsongDuration.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSubsongTagsCallback} callback.
     */
    @FunctionalInterface
    public interface GetSubsongTagsCallback {
    
        org.gstreamer.gst.TagList run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, int subsong);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress dec, int subsong) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), subsong);
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSubsongTagsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_subsong_tags}
     * @param getSubsongTags The new value of the field {@code get_subsong_tags}
     */
    public void setGetSubsongTags(GetSubsongTagsCallback getSubsongTags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_subsong_tags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSubsongTags == null ? MemoryAddress.NULL : getSubsongTags.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetSubsongModeCallback} callback.
     */
    @FunctionalInterface
    public interface SetSubsongModeCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, org.gstreamer.badaudio.NonstreamAudioSubsongMode mode, org.gstreamer.gst.ClockTime initialPosition);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, int mode, MemoryAddress initialPosition) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                org.gstreamer.gst.ClockTime initialPositionALIAS = new org.gstreamer.gst.ClockTime(initialPosition.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), org.gstreamer.badaudio.NonstreamAudioSubsongMode.of(mode), initialPositionALIAS);
                initialPosition.set(Interop.valueLayout.C_LONG, 0, initialPositionALIAS.getValue());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetSubsongModeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_subsong_mode}
     * @param setSubsongMode The new value of the field {@code set_subsong_mode}
     */
    public void setSetSubsongMode(SetSubsongModeCallback setSubsongMode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_subsong_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSubsongMode == null ? MemoryAddress.NULL : setSubsongMode.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetNumLoopsCallback} callback.
     */
    @FunctionalInterface
    public interface SetNumLoopsCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, int numLoops);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, int numLoops) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), numLoops);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetNumLoopsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_num_loops}
     * @param setNumLoops The new value of the field {@code set_num_loops}
     */
    public void setSetNumLoops(SetNumLoopsCallback setNumLoops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_num_loops"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setNumLoops == null ? MemoryAddress.NULL : setNumLoops.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetNumLoopsCallback} callback.
     */
    @FunctionalInterface
    public interface GetNumLoopsCallback {
    
        int run(org.gstreamer.badaudio.NonstreamAudioDecoder dec);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetNumLoopsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_num_loops}
     * @param getNumLoops The new value of the field {@code get_num_loops}
     */
    public void setGetNumLoops(GetNumLoopsCallback getNumLoops) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_num_loops"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNumLoops == null ? MemoryAddress.NULL : getNumLoops.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSupportedOutputModesCallback} callback.
     */
    @FunctionalInterface
    public interface GetSupportedOutputModesCallback {
    
        int run(org.gstreamer.badaudio.NonstreamAudioDecoder dec);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSupportedOutputModesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_supported_output_modes}
     * @param getSupportedOutputModes The new value of the field {@code get_supported_output_modes}
     */
    public void setGetSupportedOutputModes(GetSupportedOutputModesCallback getSupportedOutputModes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_output_modes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSupportedOutputModes == null ? MemoryAddress.NULL : getSupportedOutputModes.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetOutputModeCallback} callback.
     */
    @FunctionalInterface
    public interface SetOutputModeCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, org.gstreamer.badaudio.NonstreamAudioOutputMode mode, org.gstreamer.gst.ClockTime currentPosition);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, int mode, MemoryAddress currentPosition) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                org.gstreamer.gst.ClockTime currentPositionALIAS = new org.gstreamer.gst.ClockTime(currentPosition.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), org.gstreamer.badaudio.NonstreamAudioOutputMode.of(mode), currentPositionALIAS);
                currentPosition.set(Interop.valueLayout.C_LONG, 0, currentPositionALIAS.getValue());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetOutputModeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_output_mode}
     * @param setOutputMode The new value of the field {@code set_output_mode}
     */
    public void setSetOutputMode(SetOutputModeCallback setOutputMode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_output_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setOutputMode == null ? MemoryAddress.NULL : setOutputMode.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DecodeCallback} callback.
     */
    @FunctionalInterface
    public interface DecodeCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, PointerProxy<org.gstreamer.gst.Buffer> buffer, PointerInteger numSamples);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, MemoryAddress buffer, MemoryAddress numSamples) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), new PointerProxy<org.gstreamer.gst.Buffer>(buffer, org.gstreamer.gst.Buffer.fromAddress), new PointerInteger(numSamples));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DecodeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decode}
     * @param decode The new value of the field {@code decode}
     */
    public void setDecode(DecodeCallback decode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decode == null ? MemoryAddress.NULL : decode.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NegotiateCallback} callback.
     */
    @FunctionalInterface
    public interface NegotiateCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NegotiateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code negotiate}
     * @param negotiate The new value of the field {@code negotiate}
     */
    public void setNegotiate(NegotiateCallback negotiate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DecideAllocationCallback} callback.
     */
    @FunctionalInterface
    public interface DecideAllocationCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, MemoryAddress query) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DecideAllocationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decide_allocation}
     * @param decideAllocation The new value of the field {@code decide_allocation}
     */
    public void setDecideAllocation(DecideAllocationCallback decideAllocation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ProposeAllocationCallback} callback.
     */
    @FunctionalInterface
    public interface ProposeAllocationCallback {
    
        boolean run(org.gstreamer.badaudio.NonstreamAudioDecoder dec, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dec, MemoryAddress query) {
            var RESULT = run((org.gstreamer.badaudio.NonstreamAudioDecoder) Interop.register(dec, org.gstreamer.badaudio.NonstreamAudioDecoder.fromAddress).marshal(dec, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ProposeAllocationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code propose_allocation}
     * @param proposeAllocation The new value of the field {@code propose_allocation}
     */
    public void setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
        }
    }
    
    /**
     * Create a NonstreamAudioDecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected NonstreamAudioDecoderClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, NonstreamAudioDecoderClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new NonstreamAudioDecoderClass(input);
    
    /**
     * A {@link NonstreamAudioDecoderClass.Builder} object constructs a {@link NonstreamAudioDecoderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link NonstreamAudioDecoderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final NonstreamAudioDecoderClass struct;
        
        private Builder() {
            struct = NonstreamAudioDecoderClass.allocate();
        }
        
        /**
         * Finish building the {@link NonstreamAudioDecoderClass} struct.
         * @return A new instance of {@code NonstreamAudioDecoderClass} with the fields 
         *         that were set in the Builder object.
         */
        public NonstreamAudioDecoderClass build() {
            return struct;
        }
        
        /**
         * The parent class structure
         * @param elementClass The value for the {@code elementClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setElementClass(org.gstreamer.gst.ElementClass elementClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("element_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementClass == null ? MemoryAddress.NULL : elementClass.handle()));
                return this;
            }
        }
        
        public Builder setLoadsFromSinkpad(boolean loadsFromSinkpad) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("loads_from_sinkpad"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(loadsFromSinkpad, null).intValue());
                return this;
            }
        }
        
        public Builder setSeek(SeekCallback seek) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("seek"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (seek == null ? MemoryAddress.NULL : seek.toCallback()));
                return this;
            }
        }
        
        public Builder setTell(TellCallback tell) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tell"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tell == null ? MemoryAddress.NULL : tell.toCallback()));
                return this;
            }
        }
        
        public Builder setLoadFromBuffer(LoadFromBufferCallback loadFromBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_from_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFromBuffer == null ? MemoryAddress.NULL : loadFromBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setLoadFromCustom(LoadFromCustomCallback loadFromCustom) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_from_custom"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFromCustom == null ? MemoryAddress.NULL : loadFromCustom.toCallback()));
                return this;
            }
        }
        
        public Builder setGetMainTags(GetMainTagsCallback getMainTags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_main_tags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMainTags == null ? MemoryAddress.NULL : getMainTags.toCallback()));
                return this;
            }
        }
        
        public Builder setSetCurrentSubsong(SetCurrentSubsongCallback setCurrentSubsong) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_current_subsong"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCurrentSubsong == null ? MemoryAddress.NULL : setCurrentSubsong.toCallback()));
                return this;
            }
        }
        
        public Builder setGetCurrentSubsong(GetCurrentSubsongCallback getCurrentSubsong) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_current_subsong"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCurrentSubsong == null ? MemoryAddress.NULL : getCurrentSubsong.toCallback()));
                return this;
            }
        }
        
        public Builder setGetNumSubsongs(GetNumSubsongsCallback getNumSubsongs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_num_subsongs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNumSubsongs == null ? MemoryAddress.NULL : getNumSubsongs.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSubsongDuration(GetSubsongDurationCallback getSubsongDuration) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_subsong_duration"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSubsongDuration == null ? MemoryAddress.NULL : getSubsongDuration.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSubsongTags(GetSubsongTagsCallback getSubsongTags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_subsong_tags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSubsongTags == null ? MemoryAddress.NULL : getSubsongTags.toCallback()));
                return this;
            }
        }
        
        public Builder setSetSubsongMode(SetSubsongModeCallback setSubsongMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_subsong_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSubsongMode == null ? MemoryAddress.NULL : setSubsongMode.toCallback()));
                return this;
            }
        }
        
        public Builder setSetNumLoops(SetNumLoopsCallback setNumLoops) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_num_loops"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setNumLoops == null ? MemoryAddress.NULL : setNumLoops.toCallback()));
                return this;
            }
        }
        
        public Builder setGetNumLoops(GetNumLoopsCallback getNumLoops) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_num_loops"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNumLoops == null ? MemoryAddress.NULL : getNumLoops.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSupportedOutputModes(GetSupportedOutputModesCallback getSupportedOutputModes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_supported_output_modes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSupportedOutputModes == null ? MemoryAddress.NULL : getSupportedOutputModes.toCallback()));
                return this;
            }
        }
        
        public Builder setSetOutputMode(SetOutputModeCallback setOutputMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_output_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setOutputMode == null ? MemoryAddress.NULL : setOutputMode.toCallback()));
                return this;
            }
        }
        
        public Builder setDecode(DecodeCallback decode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("decode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decode == null ? MemoryAddress.NULL : decode.toCallback()));
                return this;
            }
        }
        
        public Builder setNegotiate(NegotiateCallback negotiate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate.toCallback()));
                return this;
            }
        }
        
        public Builder setDecideAllocation(DecideAllocationCallback decideAllocation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
                return this;
            }
        }
        
        public Builder setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
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
