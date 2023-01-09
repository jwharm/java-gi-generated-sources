package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLWindowClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLWindowClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_display"),
            Interop.valueLayout.ADDRESS.withName("set_window_handle"),
            Interop.valueLayout.ADDRESS.withName("get_window_handle"),
            Interop.valueLayout.ADDRESS.withName("draw"),
            Interop.valueLayout.ADDRESS.withName("run"),
            Interop.valueLayout.ADDRESS.withName("quit"),
            Interop.valueLayout.ADDRESS.withName("send_message"),
            Interop.valueLayout.ADDRESS.withName("send_message_async"),
            Interop.valueLayout.ADDRESS.withName("open"),
            Interop.valueLayout.ADDRESS.withName("close"),
            Interop.valueLayout.ADDRESS.withName("handle_events"),
            Interop.valueLayout.ADDRESS.withName("set_preferred_size"),
            Interop.valueLayout.ADDRESS.withName("show"),
            Interop.valueLayout.ADDRESS.withName("set_render_rectangle"),
            Interop.valueLayout.ADDRESS.withName("queue_resize"),
            Interop.valueLayout.ADDRESS.withName("controls_viewport"),
            Interop.valueLayout.ADDRESS.withName("has_output_surface"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLWindowClass}
     * @return A new, uninitialized @{link GLWindowClass}
     */
    public static GLWindowClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLWindowClass newInstance = new GLWindowClass(segment.address());
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
     * Functional interface declaration of the {@code GetDisplayCallback} callback.
     */
    @FunctionalInterface
    public interface GetDisplayCallback {
    
        long run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default long upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDisplayCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_display}
     * @param getDisplay The new value of the field {@code get_display}
     */
    public void setGetDisplay(GetDisplayCallback getDisplay) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_display"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDisplay == null ? MemoryAddress.NULL : getDisplay.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetWindowHandleCallback} callback.
     */
    @FunctionalInterface
    public interface SetWindowHandleCallback {
    
        void run(org.gstreamer.gl.GLWindow window, long handle);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window, long handle) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null), handle);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetWindowHandleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_window_handle}
     * @param setWindowHandle The new value of the field {@code set_window_handle}
     */
    public void setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetWindowHandleCallback} callback.
     */
    @FunctionalInterface
    public interface GetWindowHandleCallback {
    
        long run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default long upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetWindowHandleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_window_handle}
     * @param getWindowHandle The new value of the field {@code get_window_handle}
     */
    public void setGetWindowHandle(GetWindowHandleCallback getWindowHandle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getWindowHandle == null ? MemoryAddress.NULL : getWindowHandle.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DrawCallback} callback.
     */
    @FunctionalInterface
    public interface DrawCallback {
    
        void run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw}
     * @param draw The new value of the field {@code draw}
     */
    public void setDraw(DrawCallback draw) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (draw == null ? MemoryAddress.NULL : draw.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RunCallback} callback.
     */
    @FunctionalInterface
    public interface RunCallback {
    
        void run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RunCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code run}
     * @param run The new value of the field {@code run}
     */
    public void setRun(RunCallback run) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (run == null ? MemoryAddress.NULL : run.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QuitCallback} callback.
     */
    @FunctionalInterface
    public interface QuitCallback {
    
        void run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QuitCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code quit}
     * @param quit The new value of the field {@code quit}
     */
    public void setQuit(QuitCallback quit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quit"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (quit == null ? MemoryAddress.NULL : quit.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SendMessageCallback} callback.
     */
    @FunctionalInterface
    public interface SendMessageCallback {
    
        void run(org.gstreamer.gl.GLWindow window, org.gstreamer.gl.GLWindowCB callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window, MemoryAddress callback, MemoryAddress data) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SendMessageCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send_message}
     * @param sendMessage The new value of the field {@code send_message}
     */
    public void setSendMessage(SendMessageCallback sendMessage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_message"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendMessage == null ? MemoryAddress.NULL : sendMessage.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SendMessageAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface SendMessageAsyncCallback {
    
        void run(org.gstreamer.gl.GLWindow window, org.gstreamer.gl.GLWindowCB callback, org.gtk.glib.DestroyNotify destroy);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window, MemoryAddress callback, MemoryAddress data, MemoryAddress destroy) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SendMessageAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send_message_async}
     * @param sendMessageAsync The new value of the field {@code send_message_async}
     */
    public void setSendMessageAsync(SendMessageAsyncCallback sendMessageAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_message_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendMessageAsync == null ? MemoryAddress.NULL : sendMessageAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code OpenCallback} callback.
     */
    @FunctionalInterface
    public interface OpenCallback {
    
        boolean run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OpenCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CloseCallback} callback.
     */
    @FunctionalInterface
    public interface CloseCallback {
    
        void run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CloseCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close}
     * @param close The new value of the field {@code close}
     */
    public void setClose(CloseCallback close) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandleEventsCallback} callback.
     */
    @FunctionalInterface
    public interface HandleEventsCallback {
    
        void run(org.gstreamer.gl.GLWindow window, boolean handleEvents);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window, int handleEvents) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null), Marshal.integerToBoolean.marshal(handleEvents, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandleEventsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_events}
     * @param handleEvents The new value of the field {@code handle_events}
     */
    public void setHandleEvents(HandleEventsCallback handleEvents) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetPreferredSizeCallback} callback.
     */
    @FunctionalInterface
    public interface SetPreferredSizeCallback {
    
        void run(org.gstreamer.gl.GLWindow window, int width, int height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window, int width, int height) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null), width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetPreferredSizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_preferred_size}
     * @param setPreferredSize The new value of the field {@code set_preferred_size}
     */
    public void setSetPreferredSize(SetPreferredSizeCallback setPreferredSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_preferred_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setPreferredSize == null ? MemoryAddress.NULL : setPreferredSize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShowCallback} callback.
     */
    @FunctionalInterface
    public interface ShowCallback {
    
        void run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShowCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code show}
     * @param show The new value of the field {@code show}
     */
    public void setShow(ShowCallback show) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (show == null ? MemoryAddress.NULL : show.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetRenderRectangleCallback} callback.
     */
    @FunctionalInterface
    public interface SetRenderRectangleCallback {
    
        boolean run(org.gstreamer.gl.GLWindow window, int x, int y, int width, int height);
        
        @ApiStatus.Internal default int upcall(MemoryAddress window, int x, int y, int width, int height) {
            var RESULT = run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null), x, y, width, height);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetRenderRectangleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_render_rectangle}
     * @param setRenderRectangle The new value of the field {@code set_render_rectangle}
     */
    public void setSetRenderRectangle(SetRenderRectangleCallback setRenderRectangle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_render_rectangle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setRenderRectangle == null ? MemoryAddress.NULL : setRenderRectangle.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueueResizeCallback} callback.
     */
    @FunctionalInterface
    public interface QueueResizeCallback {
    
        void run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueueResizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code queue_resize}
     * @param queueResize The new value of the field {@code queue_resize}
     */
    public void setQueueResize(QueueResizeCallback queueResize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("queue_resize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queueResize == null ? MemoryAddress.NULL : queueResize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ControlsViewportCallback} callback.
     */
    @FunctionalInterface
    public interface ControlsViewportCallback {
    
        boolean run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ControlsViewportCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code controls_viewport}
     * @param controlsViewport The new value of the field {@code controls_viewport}
     */
    public void setControlsViewport(ControlsViewportCallback controlsViewport) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("controls_viewport"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (controlsViewport == null ? MemoryAddress.NULL : controlsViewport.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HasOutputSurfaceCallback} callback.
     */
    @FunctionalInterface
    public interface HasOutputSurfaceCallback {
    
        boolean run(org.gstreamer.gl.GLWindow window);
        
        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) Interop.register(window, org.gstreamer.gl.GLWindow.fromAddress).marshal(window, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HasOutputSurfaceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code has_output_surface}
     * @param hasOutputSurface The new value of the field {@code has_output_surface}
     */
    public void setHasOutputSurface(HasOutputSurfaceCallback hasOutputSurface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_output_surface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hasOutputSurface == null ? MemoryAddress.NULL : hasOutputSurface.toCallback()));
        }
    }
    
    /**
     * Create a GLWindowClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLWindowClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLWindowClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLWindowClass(input);
    
    /**
     * A {@link GLWindowClass.Builder} object constructs a {@link GLWindowClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLWindowClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLWindowClass struct;
        
        private Builder() {
            struct = GLWindowClass.allocate();
        }
        
        /**
         * Finish building the {@link GLWindowClass} struct.
         * @return A new instance of {@code GLWindowClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLWindowClass build() {
            return struct;
        }
        
        /**
         * Parent class
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
        
        public Builder setGetDisplay(GetDisplayCallback getDisplay) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_display"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDisplay == null ? MemoryAddress.NULL : getDisplay.toCallback()));
                return this;
            }
        }
        
        public Builder setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
                return this;
            }
        }
        
        public Builder setGetWindowHandle(GetWindowHandleCallback getWindowHandle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_window_handle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getWindowHandle == null ? MemoryAddress.NULL : getWindowHandle.toCallback()));
                return this;
            }
        }
        
        public Builder setDraw(DrawCallback draw) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("draw"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (draw == null ? MemoryAddress.NULL : draw.toCallback()));
                return this;
            }
        }
        
        public Builder setRun(RunCallback run) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("run"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (run == null ? MemoryAddress.NULL : run.toCallback()));
                return this;
            }
        }
        
        public Builder setQuit(QuitCallback quit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("quit"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (quit == null ? MemoryAddress.NULL : quit.toCallback()));
                return this;
            }
        }
        
        public Builder setSendMessage(SendMessageCallback sendMessage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("send_message"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendMessage == null ? MemoryAddress.NULL : sendMessage.toCallback()));
                return this;
            }
        }
        
        public Builder setSendMessageAsync(SendMessageAsyncCallback sendMessageAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("send_message_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendMessageAsync == null ? MemoryAddress.NULL : sendMessageAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setOpen(OpenCallback open) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("open"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
                return this;
            }
        }
        
        public Builder setClose(CloseCallback close) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("close"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
                return this;
            }
        }
        
        public Builder setHandleEvents(HandleEventsCallback handleEvents) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
                return this;
            }
        }
        
        public Builder setSetPreferredSize(SetPreferredSizeCallback setPreferredSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_preferred_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setPreferredSize == null ? MemoryAddress.NULL : setPreferredSize.toCallback()));
                return this;
            }
        }
        
        public Builder setShow(ShowCallback show) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("show"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (show == null ? MemoryAddress.NULL : show.toCallback()));
                return this;
            }
        }
        
        public Builder setSetRenderRectangle(SetRenderRectangleCallback setRenderRectangle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_render_rectangle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setRenderRectangle == null ? MemoryAddress.NULL : setRenderRectangle.toCallback()));
                return this;
            }
        }
        
        public Builder setQueueResize(QueueResizeCallback queueResize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("queue_resize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queueResize == null ? MemoryAddress.NULL : queueResize.toCallback()));
                return this;
            }
        }
        
        public Builder setControlsViewport(ControlsViewportCallback controlsViewport) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("controls_viewport"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (controlsViewport == null ? MemoryAddress.NULL : controlsViewport.toCallback()));
                return this;
            }
        }
        
        public Builder setHasOutputSurface(HasOutputSurfaceCallback hasOutputSurface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("has_output_surface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hasOutputSurface == null ? MemoryAddress.NULL : hasOutputSurface.toCallback()));
                return this;
            }
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false, SCOPE)));
                return this;
            }
        }
    }
}
