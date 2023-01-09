package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MediaStreamClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMediaStreamClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("play"),
            Interop.valueLayout.ADDRESS.withName("pause"),
            Interop.valueLayout.ADDRESS.withName("seek"),
            Interop.valueLayout.ADDRESS.withName("update_audio"),
            Interop.valueLayout.ADDRESS.withName("realize"),
            Interop.valueLayout.ADDRESS.withName("unrealize"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved5"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved6"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved7"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved8")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MediaStreamClass}
     * @return A new, uninitialized @{link MediaStreamClass}
     */
    public static MediaStreamClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MediaStreamClass newInstance = new MediaStreamClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PlayCallback} callback.
     */
    @FunctionalInterface
    public interface PlayCallback {
    
        boolean run(org.gtk.gtk.MediaStream self);
        
        @ApiStatus.Internal default int upcall(MemoryAddress self) {
            var RESULT = run((org.gtk.gtk.MediaStream) Interop.register(self, org.gtk.gtk.MediaStream.fromAddress).marshal(self, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PlayCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code play}
     * @param play The new value of the field {@code play}
     */
    public void setPlay(PlayCallback play) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("play"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (play == null ? MemoryAddress.NULL : play.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PauseCallback} callback.
     */
    @FunctionalInterface
    public interface PauseCallback {
    
        void run(org.gtk.gtk.MediaStream self);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self) {
            run((org.gtk.gtk.MediaStream) Interop.register(self, org.gtk.gtk.MediaStream.fromAddress).marshal(self, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PauseCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pause}
     * @param pause The new value of the field {@code pause}
     */
    public void setPause(PauseCallback pause) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pause"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pause == null ? MemoryAddress.NULL : pause.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SeekCallback} callback.
     */
    @FunctionalInterface
    public interface SeekCallback {
    
        void run(org.gtk.gtk.MediaStream self, long timestamp);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, long timestamp) {
            run((org.gtk.gtk.MediaStream) Interop.register(self, org.gtk.gtk.MediaStream.fromAddress).marshal(self, null), timestamp);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
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
     * Functional interface declaration of the {@code UpdateAudioCallback} callback.
     */
    @FunctionalInterface
    public interface UpdateAudioCallback {
    
        void run(org.gtk.gtk.MediaStream self, boolean muted, double volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, int muted, double volume) {
            run((org.gtk.gtk.MediaStream) Interop.register(self, org.gtk.gtk.MediaStream.fromAddress).marshal(self, null), Marshal.integerToBoolean.marshal(muted, null).booleanValue(), volume);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UpdateAudioCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_audio}
     * @param updateAudio The new value of the field {@code update_audio}
     */
    public void setUpdateAudio(UpdateAudioCallback updateAudio) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_audio"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateAudio == null ? MemoryAddress.NULL : updateAudio.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RealizeCallback} callback.
     */
    @FunctionalInterface
    public interface RealizeCallback {
    
        void run(org.gtk.gtk.MediaStream self, org.gtk.gdk.Surface surface);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress surface) {
            run((org.gtk.gtk.MediaStream) Interop.register(self, org.gtk.gtk.MediaStream.fromAddress).marshal(self, null), (org.gtk.gdk.Surface) Interop.register(surface, org.gtk.gdk.Surface.fromAddress).marshal(surface, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RealizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code realize}
     * @param realize The new value of the field {@code realize}
     */
    public void setRealize(RealizeCallback realize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("realize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (realize == null ? MemoryAddress.NULL : realize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnrealizeCallback} callback.
     */
    @FunctionalInterface
    public interface UnrealizeCallback {
    
        void run(org.gtk.gtk.MediaStream self, org.gtk.gdk.Surface surface);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress surface) {
            run((org.gtk.gtk.MediaStream) Interop.register(self, org.gtk.gtk.MediaStream.fromAddress).marshal(self, null), (org.gtk.gdk.Surface) Interop.register(surface, org.gtk.gdk.Surface.fromAddress).marshal(surface, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnrealizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unrealize}
     * @param unrealize The new value of the field {@code unrealize}
     */
    public void setUnrealize(UnrealizeCallback unrealize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unrealize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unrealize == null ? MemoryAddress.NULL : unrealize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved1Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved1Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved1Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved1}
     * @param GtkReserved1 The new value of the field {@code _gtk_reserved1}
     */
    public void setGtkReserved1(GtkReserved1Callback GtkReserved1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved2Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved2Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved2Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved2}
     * @param GtkReserved2 The new value of the field {@code _gtk_reserved2}
     */
    public void setGtkReserved2(GtkReserved2Callback GtkReserved2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved3Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved3Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved3Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved3}
     * @param GtkReserved3 The new value of the field {@code _gtk_reserved3}
     */
    public void setGtkReserved3(GtkReserved3Callback GtkReserved3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved4Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved4Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved4Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved4}
     * @param GtkReserved4 The new value of the field {@code _gtk_reserved4}
     */
    public void setGtkReserved4(GtkReserved4Callback GtkReserved4) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved5Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved5Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved5Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved5}
     * @param GtkReserved5 The new value of the field {@code _gtk_reserved5}
     */
    public void setGtkReserved5(GtkReserved5Callback GtkReserved5) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved5 == null ? MemoryAddress.NULL : GtkReserved5.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved6Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved6Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved6Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved6}
     * @param GtkReserved6 The new value of the field {@code _gtk_reserved6}
     */
    public void setGtkReserved6(GtkReserved6Callback GtkReserved6) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved6 == null ? MemoryAddress.NULL : GtkReserved6.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved7Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved7Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved7Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved7}
     * @param GtkReserved7 The new value of the field {@code _gtk_reserved7}
     */
    public void setGtkReserved7(GtkReserved7Callback GtkReserved7) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved7 == null ? MemoryAddress.NULL : GtkReserved7.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved8Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved8Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved8Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved8}
     * @param GtkReserved8 The new value of the field {@code _gtk_reserved8}
     */
    public void setGtkReserved8(GtkReserved8Callback GtkReserved8) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved8 == null ? MemoryAddress.NULL : GtkReserved8.toCallback()));
        }
    }
    
    /**
     * Create a MediaStreamClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MediaStreamClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MediaStreamClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MediaStreamClass(input);
    
    /**
     * A {@link MediaStreamClass.Builder} object constructs a {@link MediaStreamClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MediaStreamClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MediaStreamClass struct;
        
        private Builder() {
            struct = MediaStreamClass.allocate();
        }
        
        /**
         * Finish building the {@link MediaStreamClass} struct.
         * @return A new instance of {@code MediaStreamClass} with the fields 
         *         that were set in the Builder object.
         */
        public MediaStreamClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setPlay(PlayCallback play) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("play"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (play == null ? MemoryAddress.NULL : play.toCallback()));
                return this;
            }
        }
        
        public Builder setPause(PauseCallback pause) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pause"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pause == null ? MemoryAddress.NULL : pause.toCallback()));
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
        
        public Builder setUpdateAudio(UpdateAudioCallback updateAudio) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("update_audio"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateAudio == null ? MemoryAddress.NULL : updateAudio.toCallback()));
                return this;
            }
        }
        
        public Builder setRealize(RealizeCallback realize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("realize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (realize == null ? MemoryAddress.NULL : realize.toCallback()));
                return this;
            }
        }
        
        public Builder setUnrealize(UnrealizeCallback unrealize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unrealize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unrealize == null ? MemoryAddress.NULL : unrealize.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved1(GtkReserved1Callback GtkReserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved2(GtkReserved2Callback GtkReserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved3(GtkReserved3Callback GtkReserved3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved4(GtkReserved4Callback GtkReserved4) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved5(GtkReserved5Callback GtkReserved5) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved5 == null ? MemoryAddress.NULL : GtkReserved5.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved6(GtkReserved6Callback GtkReserved6) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved6 == null ? MemoryAddress.NULL : GtkReserved6.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved7(GtkReserved7Callback GtkReserved7) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved7 == null ? MemoryAddress.NULL : GtkReserved7.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved8(GtkReserved8Callback GtkReserved8) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved8 == null ? MemoryAddress.NULL : GtkReserved8.toCallback()));
                return this;
            }
        }
    }
}
