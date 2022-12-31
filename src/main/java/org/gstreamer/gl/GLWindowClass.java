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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLWindowClass newInstance = new GLWindowClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface GetDisplayCallback {
        long run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default long upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDisplayCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_display}
     * @param getDisplay The new value of the field {@code get_display}
     */
    public void setGetDisplay(GetDisplayCallback getDisplay) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_display"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDisplay == null ? MemoryAddress.NULL : getDisplay.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetWindowHandleCallback {
        void run(org.gstreamer.gl.GLWindow window, long handle);

        @ApiStatus.Internal default void upcall(MemoryAddress window, long handle) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE), handle);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetWindowHandleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_window_handle}
     * @param setWindowHandle The new value of the field {@code set_window_handle}
     */
    public void setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetWindowHandleCallback {
        long run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default long upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetWindowHandleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_window_handle}
     * @param getWindowHandle The new value of the field {@code get_window_handle}
     */
    public void setGetWindowHandle(GetWindowHandleCallback getWindowHandle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_window_handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getWindowHandle == null ? MemoryAddress.NULL : getWindowHandle.toCallback()));
    }
    
    @FunctionalInterface
    public interface DrawCallback {
        void run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw}
     * @param draw The new value of the field {@code draw}
     */
    public void setDraw(DrawCallback draw) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("draw"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (draw == null ? MemoryAddress.NULL : draw.toCallback()));
    }
    
    @FunctionalInterface
    public interface RunCallback {
        void run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RunCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code run}
     * @param run The new value of the field {@code run}
     */
    public void setRun(RunCallback run) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("run"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (run == null ? MemoryAddress.NULL : run.toCallback()));
    }
    
    @FunctionalInterface
    public interface QuitCallback {
        void run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QuitCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code quit}
     * @param quit The new value of the field {@code quit}
     */
    public void setQuit(QuitCallback quit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("quit"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quit == null ? MemoryAddress.NULL : quit.toCallback()));
    }
    
    @FunctionalInterface
    public interface SendMessageCallback {
        void run(org.gstreamer.gl.GLWindow window, org.gstreamer.gl.GLWindowCB callback);

        @ApiStatus.Internal default void upcall(MemoryAddress window, MemoryAddress callback, MemoryAddress data) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SendMessageCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send_message}
     * @param sendMessage The new value of the field {@code send_message}
     */
    public void setSendMessage(SendMessageCallback sendMessage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("send_message"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendMessage == null ? MemoryAddress.NULL : sendMessage.toCallback()));
    }
    
    @FunctionalInterface
    public interface SendMessageAsyncCallback {
        void run(org.gstreamer.gl.GLWindow window, org.gstreamer.gl.GLWindowCB callback, org.gtk.glib.DestroyNotify destroy);

        @ApiStatus.Internal default void upcall(MemoryAddress window, MemoryAddress callback, MemoryAddress data, MemoryAddress destroy) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SendMessageAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send_message_async}
     * @param sendMessageAsync The new value of the field {@code send_message_async}
     */
    public void setSendMessageAsync(SendMessageAsyncCallback sendMessageAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("send_message_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendMessageAsync == null ? MemoryAddress.NULL : sendMessageAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface OpenCallback {
        boolean run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
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
        void run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
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
    public interface HandleEventsCallback {
        void run(org.gstreamer.gl.GLWindow window, boolean handleEvents);

        @ApiStatus.Internal default void upcall(MemoryAddress window, int handleEvents) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE), Marshal.integerToBoolean.marshal(handleEvents, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandleEventsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_events}
     * @param handleEvents The new value of the field {@code handle_events}
     */
    public void setHandleEvents(HandleEventsCallback handleEvents) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetPreferredSizeCallback {
        void run(org.gstreamer.gl.GLWindow window, int width, int height);

        @ApiStatus.Internal default void upcall(MemoryAddress window, int width, int height) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE), width, height);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetPreferredSizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_preferred_size}
     * @param setPreferredSize The new value of the field {@code set_preferred_size}
     */
    public void setSetPreferredSize(SetPreferredSizeCallback setPreferredSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_preferred_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setPreferredSize == null ? MemoryAddress.NULL : setPreferredSize.toCallback()));
    }
    
    @FunctionalInterface
    public interface ShowCallback {
        void run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShowCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code show}
     * @param show The new value of the field {@code show}
     */
    public void setShow(ShowCallback show) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (show == null ? MemoryAddress.NULL : show.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetRenderRectangleCallback {
        boolean run(org.gstreamer.gl.GLWindow window, int x, int y, int width, int height);

        @ApiStatus.Internal default int upcall(MemoryAddress window, int x, int y, int width, int height) {
            var RESULT = run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE), x, y, width, height);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetRenderRectangleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_render_rectangle}
     * @param setRenderRectangle The new value of the field {@code set_render_rectangle}
     */
    public void setSetRenderRectangle(SetRenderRectangleCallback setRenderRectangle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_render_rectangle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setRenderRectangle == null ? MemoryAddress.NULL : setRenderRectangle.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueueResizeCallback {
        void run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueueResizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code queue_resize}
     * @param queueResize The new value of the field {@code queue_resize}
     */
    public void setQueueResize(QueueResizeCallback queueResize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("queue_resize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queueResize == null ? MemoryAddress.NULL : queueResize.toCallback()));
    }
    
    @FunctionalInterface
    public interface ControlsViewportCallback {
        boolean run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ControlsViewportCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code controls_viewport}
     * @param controlsViewport The new value of the field {@code controls_viewport}
     */
    public void setControlsViewport(ControlsViewportCallback controlsViewport) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("controls_viewport"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (controlsViewport == null ? MemoryAddress.NULL : controlsViewport.toCallback()));
    }
    
    @FunctionalInterface
    public interface HasOutputSurfaceCallback {
        boolean run(org.gstreamer.gl.GLWindow window);

        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.gl.GLWindow.fromAddress).marshal(window, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HasOutputSurfaceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code has_output_surface}
     * @param hasOutputSurface The new value of the field {@code has_output_surface}
     */
    public void setHasOutputSurface(HasOutputSurfaceCallback hasOutputSurface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("has_output_surface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasOutputSurface == null ? MemoryAddress.NULL : hasOutputSurface.toCallback()));
    }
    
    /**
     * Create a GLWindowClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLWindowClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLWindowClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLWindowClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetDisplay(GetDisplayCallback getDisplay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_display"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDisplay == null ? MemoryAddress.NULL : getDisplay.toCallback()));
            return this;
        }
        
        public Builder setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
            return this;
        }
        
        public Builder setGetWindowHandle(GetWindowHandleCallback getWindowHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getWindowHandle == null ? MemoryAddress.NULL : getWindowHandle.toCallback()));
            return this;
        }
        
        public Builder setDraw(DrawCallback draw) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (draw == null ? MemoryAddress.NULL : draw.toCallback()));
            return this;
        }
        
        public Builder setRun(RunCallback run) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (run == null ? MemoryAddress.NULL : run.toCallback()));
            return this;
        }
        
        public Builder setQuit(QuitCallback quit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quit == null ? MemoryAddress.NULL : quit.toCallback()));
            return this;
        }
        
        public Builder setSendMessage(SendMessageCallback sendMessage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_message"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendMessage == null ? MemoryAddress.NULL : sendMessage.toCallback()));
            return this;
        }
        
        public Builder setSendMessageAsync(SendMessageAsyncCallback sendMessageAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_message_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendMessageAsync == null ? MemoryAddress.NULL : sendMessageAsync.toCallback()));
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
        
        public Builder setHandleEvents(HandleEventsCallback handleEvents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
            return this;
        }
        
        public Builder setSetPreferredSize(SetPreferredSizeCallback setPreferredSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_preferred_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setPreferredSize == null ? MemoryAddress.NULL : setPreferredSize.toCallback()));
            return this;
        }
        
        public Builder setShow(ShowCallback show) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (show == null ? MemoryAddress.NULL : show.toCallback()));
            return this;
        }
        
        public Builder setSetRenderRectangle(SetRenderRectangleCallback setRenderRectangle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_render_rectangle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setRenderRectangle == null ? MemoryAddress.NULL : setRenderRectangle.toCallback()));
            return this;
        }
        
        public Builder setQueueResize(QueueResizeCallback queueResize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("queue_resize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queueResize == null ? MemoryAddress.NULL : queueResize.toCallback()));
            return this;
        }
        
        public Builder setControlsViewport(ControlsViewportCallback controlsViewport) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("controls_viewport"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (controlsViewport == null ? MemoryAddress.NULL : controlsViewport.toCallback()));
            return this;
        }
        
        public Builder setHasOutputSurface(HasOutputSurfaceCallback hasOutputSurface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_output_surface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasOutputSurface == null ? MemoryAddress.NULL : hasOutputSurface.toCallback()));
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
